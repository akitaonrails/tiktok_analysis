package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0sfe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1635840sfe {
    public final Function1<? super ViewGroup, ? extends Pair<? extends View, ? extends View>> LIZ;
    public final Function1<? super ViewPager, Unit> LIZIZ;
    public final Function1<? super C19YA, Unit> LIZJ;
    public final Function1<? super ViewGroup, Unit> LIZLLL;
    public final Function1<? super ViewGroup, Unit> LJ;
    public final Interpolator LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final Function2<Float, Float, Unit> LJIIIIZZ;
    public final int LJIIIZ;
    public final boolean LJIIJ;
    public final Function1<? super View, ? extends View.OnTouchListener> LJIIJJI;
    public final Function1<Boolean, Unit> LJIIL;
    public final boolean LJIILIIL;
    public final InterfaceC1685430txd<String, Context, LayoutInflater, Integer, ViewGroup, Boolean, View> LJIILJJIL;
    public final boolean LJIILL;

    public C1635840sfe(Function1 function1, boolean z, boolean z2, int i, Function1 function12, boolean z3, InterfaceC1685430txd interfaceC1685430txd, boolean z4, int i2) {
        InterpolatorC1671660tbQ interpolatorC1671660tbQ;
        function1 = (i2 & 1) != 0 ? null : function1;
        if ((i2 & 256) != 0) {
            interpolatorC1671660tbQ = new InterpolatorC1671660tbQ();
        } else {
            interpolatorC1671660tbQ = null;
        }
        z = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z;
        z2 = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z2;
        i = (32768 & i2) != 0 ? 3 : i;
        function12 = (1048576 & i2) != 0 ? null : function12;
        z3 = (2097152 & i2) != 0 ? false : z3;
        interfaceC1685430txd = (4194304 & i2) != 0 ? null : interfaceC1685430txd;
        z4 = (i2 & 8388608) != 0 ? false : z4;
        this.LIZ = function1;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = interpolatorC1671660tbQ;
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIIZZ = null;
        this.LJIIIZ = i;
        this.LJIIJ = false;
        this.LJIIJJI = null;
        this.LJIIL = function12;
        this.LJIILIIL = z3;
        this.LJIILJJIL = interfaceC1685430txd;
        this.LJIILL = z4;
    }
}
