package X;

import Y.ALAdapterS24S0200000_30;
import Y.ARunnableS38S0400000_30;
import Y.AUListenerS11S0401000_30;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;

/* JADX INFO: renamed from: X.14JH, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C14JH implements View.OnApplyWindowInsetsListener {
    public final C14JJ LIZ;
    public C20246014Ju LIZIZ;

    public C14JH(View view, C14JJ c14jj) {
        C20246014Ju c20246014JuLIZ;
        this.LIZ = c14jj;
        C20246014Ju c20246014JuLIZ2 = C14K4.LIZ(view);
        if (c20246014JuLIZ2 != null) {
            c20246014JuLIZ = new C20246414Jy(c20246014JuLIZ2).LIZ();
        } else {
            c20246014JuLIZ = null;
        }
        this.LIZIZ = c20246014JuLIZ;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.LIZIZ = C20246014Ju.LJIIJJI(view, windowInsets);
            return C14JI.LJIIIZ(view, windowInsets);
        }
        C20246014Ju c20246014JuLJIIJJI = C20246014Ju.LJIIJJI(view, windowInsets);
        if (this.LIZIZ == null) {
            this.LIZIZ = C14K4.LIZ(view);
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = c20246014JuLJIIJJI;
            return C14JI.LJIIIZ(view, windowInsets);
        }
        C14JJ c14jjLJIIJ = C14JI.LJIIJ(view);
        if (c14jjLJIIJ != null && Objects.equals(c14jjLJIIJ.LL, windowInsets)) {
            return C14JI.LJIIIZ(view, windowInsets);
        }
        C20246014Ju c20246014Ju = this.LIZIZ;
        int i = 1;
        int i2 = 0;
        do {
            if (!c20246014JuLJIIJJI.LIZ(i).equals(c20246014Ju.LIZ(i))) {
                i2 |= i;
            }
            i <<= 1;
        } while (i <= 256);
        if (i2 == 0) {
            return C14JI.LJIIIZ(view, windowInsets);
        }
        C20246014Ju c20246014Ju2 = this.LIZIZ;
        if ((i2 & 8) != 0) {
            if (c20246014JuLJIIJJI.LIZ(8).LIZLLL > c20246014Ju2.LIZ(8).LIZLLL) {
                interpolator = C14JI.LJ;
            } else {
                interpolator = C14JI.LJFF;
            }
        } else {
            interpolator = C14JI.LJI;
        }
        C14JM c14jm = new C14JM(i2, interpolator, 160L);
        c14jm.LIZ.LJ(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c14jm.LIZ.LIZ());
        C20244914Jj c20244914JjLIZ = c20246014JuLJIIJJI.LIZ(i2);
        C20244914Jj c20244914JjLIZ2 = c20246014Ju2.LIZ(i2);
        C14JL c14jl = new C14JL(C20244914Jj.LIZIZ(Math.min(c20244914JjLIZ.LIZ, c20244914JjLIZ2.LIZ), Math.min(c20244914JjLIZ.LIZIZ, c20244914JjLIZ2.LIZIZ), Math.min(c20244914JjLIZ.LIZJ, c20244914JjLIZ2.LIZJ), Math.min(c20244914JjLIZ.LIZLLL, c20244914JjLIZ2.LIZLLL)), C20244914Jj.LIZIZ(Math.max(c20244914JjLIZ.LIZ, c20244914JjLIZ2.LIZ), Math.max(c20244914JjLIZ.LIZIZ, c20244914JjLIZ2.LIZIZ), Math.max(c20244914JjLIZ.LIZJ, c20244914JjLIZ2.LIZJ), Math.max(c20244914JjLIZ.LIZLLL, c20244914JjLIZ2.LIZLLL)));
        C14JI.LJI(view, c14jm, windowInsets, false);
        duration.addUpdateListener(new AUListenerS11S0401000_30(c14jm, c20246014JuLJIIJJI, c20246014Ju2, i2, view, 1));
        duration.addListener(new ALAdapterS24S0200000_30(c14jm, view, 1));
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(view, new ARunnableS38S0400000_30(view, c14jm, c14jl, duration, 4));
        this.LIZIZ = c20246014JuLJIIJJI;
        return C14JI.LJIIIZ(view, windowInsets);
    }
}
