package X;

import Y.ARunnableS96S0200000_27;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: X.0y76, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1845060y76 {
    public ViewGroup LIZ;
    public C426320Gne LIZIZ;
    public ValueAnimator LIZJ;
    public float LIZLLL = 10.0f;

    public final void LIZ() {
        ValueAnimator valueAnimator = this.LIZJ;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator2 = this.LIZJ;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.LIZJ = null;
    }

    public final void LIZIZ() {
        C426320Gne c426320Gne = this.LIZIZ;
        if (c426320Gne == null) {
            return;
        }
        LIZ();
        c426320Gne.LIZ(100.0f, false);
        c426320Gne.animate().alpha(0.0f).setDuration(75L).withEndAction(new ARunnableS96S0200000_27(c426320Gne, this, 27)).start();
    }

    public final void LIZJ() {
        C426320Gne c426320Gne = this.LIZIZ;
        LIZ();
        if (c426320Gne != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = c426320Gne.animate();
            if (viewPropertyAnimatorAnimate != null) {
                viewPropertyAnimatorAnimate.cancel();
            }
            C786410Ut5.LLLZZ(c426320Gne, 8);
            C786410Ut5.E5(c426320Gne, 1.0f);
        }
        this.LIZLLL = 10.0f;
        C426320Gne c426320Gne2 = this.LIZIZ;
        if (c426320Gne2 != null) {
            c426320Gne2.LIZ(10.0f, false);
        }
    }
}
