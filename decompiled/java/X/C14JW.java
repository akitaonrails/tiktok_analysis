package X;

import Y.ALAdapterS24S0200000_30;
import Y.ARunnableS38S0400000_30;
import Y.AUListenerS11S0401000_30;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.Objects;

/* JADX INFO: renamed from: X.14JW, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C14JW implements View.OnApplyWindowInsetsListener {
    public final C14JV LIZ;
    public C20244614Jg LIZIZ;

    public C14JW(View view, C14JV c14jv) {
        C20244614Jg c20244614JgLIZIZ;
        this.LIZ = c14jv;
        C20244614Jg c20244614JgLIZ = C14JX.LIZ(view);
        if (c20244614JgLIZ != null) {
            c20244614JgLIZIZ = new C20244214Jc(c20244614JgLIZ).LIZ.LIZIZ();
        } else {
            c20244614JgLIZIZ = null;
        }
        this.LIZIZ = c20244614JgLIZIZ;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator decelerateInterpolator;
        if (!view.isLaidOut()) {
            this.LIZIZ = C20244614Jg.LIZLLL(view, windowInsets);
            return C14JU.LJIIIIZZ(view, windowInsets);
        }
        C20244614Jg c20244614JgLIZLLL = C20244614Jg.LIZLLL(view, windowInsets);
        if (this.LIZIZ == null) {
            this.LIZIZ = C14JX.LIZ(view);
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = c20244614JgLIZLLL;
            return C14JU.LJIIIIZZ(view, windowInsets);
        }
        C14JV c14jvLJIIIZ = C14JU.LJIIIZ(view);
        if (c14jvLJIIIZ != null && Objects.equals(c14jvLJIIIZ.LIZ, windowInsets)) {
            return C14JU.LJIIIIZZ(view, windowInsets);
        }
        C20244614Jg c20244614Jg = this.LIZIZ;
        int i = 1;
        int i2 = 0;
        do {
            C20244814Ji c20244814JiLIZ = c20244614JgLIZLLL.LIZ(i);
            if (c20244814JiLIZ != null && !c20244814JiLIZ.equals(c20244614Jg.LIZ(i))) {
                i2 |= i;
            }
            i <<= 1;
        } while (i <= 256);
        if (i2 == 0) {
            return C14JU.LJIIIIZZ(view, windowInsets);
        }
        C20244614Jg c20244614Jg2 = this.LIZIZ;
        if (c20244614JgLIZLLL.LIZ(i2).LIZLLL == 0) {
            decelerateInterpolator = new AccelerateInterpolator();
        } else {
            decelerateInterpolator = new DecelerateInterpolator();
        }
        C14JT c14jt = new C14JT(i2, decelerateInterpolator, 160L);
        c14jt.LIZIZ(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c14jt.LIZ.LIZ());
        C20244814Ji c20244814JiLIZ2 = c20244614JgLIZLLL.LIZ(i2);
        C20244814Ji c20244814JiLIZ3 = c20244614Jg2.LIZ(i2);
        C14JR c14jr = new C14JR(C20244814Ji.LIZIZ(Math.min(c20244814JiLIZ2.LIZ, c20244814JiLIZ3.LIZ), Math.min(c20244814JiLIZ2.LIZIZ, c20244814JiLIZ3.LIZIZ), Math.min(c20244814JiLIZ2.LIZJ, c20244814JiLIZ3.LIZJ), Math.min(c20244814JiLIZ2.LIZLLL, c20244814JiLIZ3.LIZLLL)), C20244814Ji.LIZIZ(Math.max(c20244814JiLIZ2.LIZ, c20244814JiLIZ3.LIZ), Math.max(c20244814JiLIZ2.LIZIZ, c20244814JiLIZ3.LIZIZ), Math.max(c20244814JiLIZ2.LIZJ, c20244814JiLIZ3.LIZJ), Math.max(c20244814JiLIZ2.LIZLLL, c20244814JiLIZ3.LIZLLL)));
        C14JU.LJFF(view, c14jt, windowInsets, false);
        duration.addUpdateListener(new AUListenerS11S0401000_30(c14jt, c20244614JgLIZLLL, c20244614Jg2, i2, view, 0));
        duration.addListener(new ALAdapterS24S0200000_30(c14jt, view, 0));
        C0R9K.LIZ(view, new ARunnableS38S0400000_30(view, c14jt, c14jr, duration, 1));
        this.LIZIZ = c20244614JgLIZLLL;
        return C14JU.LJIIIIZZ(view, windowInsets);
    }
}
