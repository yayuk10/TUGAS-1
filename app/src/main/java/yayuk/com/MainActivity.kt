package yayuk.com

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMatch.setOnClickListener {randomJodoh()}
    }
    fun randomJodoh(){
        val randomCewek = Random().nextInt( 6)+1
        val randomCowok = Random().nextInt(  6)+1
        val drawableResCewek = when (randomCewek) {
            1 -> R.drawable.lis
            2 -> R.drawable.citra
            3 -> R.drawable.fuji
            4 -> R.drawable.hanum
            5 -> R.drawable.ayulest
            else -> R.drawable.umikhotimatuss
        }
        val drawableResCowok = when (randomCowok){
            1 -> R.drawable.yusron_afanji
            2 -> R.drawable.edi
            3 -> R.drawable.edi
            4 -> R.drawable.edi
            5 -> R.drawable.huda_mobile
            else -> R.drawable.adytya

            }
        Cewek.setImageResource(drawableResCewek)
        Cowok.setImageResource(drawableResCowok)

    }}

