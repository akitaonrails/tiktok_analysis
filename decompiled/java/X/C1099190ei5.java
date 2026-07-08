package X;

import Y.AObjectS392S0100000_17;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ei5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1099190ei5 {
    public static final C2268791DrB LJIILLIIL = new C2268791DrB(0.65f, 0.0f, 0.35f, 1.0f);
    public final Context LIZ;
    public final FrameLayout LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public final View LJ;
    public final View LJFF;
    public final View LJI;
    public final View LJII;
    public final Function0<Unit> LJIIIIZZ;
    public C1295960jpS LJIIIZ;
    public boolean LJIIJ;
    public long LJIIJJI;
    public boolean LJIIL;
    public AnimatorSet LJIILIIL;
    public AnimatorSet LJIILJJIL;
    public View LJIILL;

    public final boolean LIZIZ() {
        if (this.LJIIL) {
            return false;
        }
        if (!this.LJIIJ && (this.LJIIJJI == 0 || System.currentTimeMillis() - this.LJIIJJI > 60000)) {
            return false;
        }
        this.LJIIL = true;
        return true;
    }

    public final void LIZ(Function0<Unit> function0) {
        this.LJIIJ = false;
        this.LJIIJJI = System.currentTimeMillis();
        this.LJIIIZ = null;
        function0.invoke();
    }

    public C1099190ei5(Context context, FrameLayout frameLayout, View view, View view2, View view3, C427340GpI c427340GpI, View view4, View view5, AObjectS392S0100000_17 aObjectS392S0100000_17) {
        this.LIZ = context;
        this.LIZIZ = frameLayout;
        this.LIZJ = view;
        this.LIZLLL = view2;
        this.LJ = view3;
        this.LJFF = c427340GpI;
        this.LJI = view4;
        this.LJII = view5;
        this.LJIIIIZZ = aObjectS392S0100000_17;
    }
}
