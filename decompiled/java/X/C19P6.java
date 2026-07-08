package X;

import Y.AUListenerS280S0100000_33;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* JADX INFO: renamed from: X.19P6, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19P6 implements Runnable {
    public final /* synthetic */ C19P4 LL;

    public final void LIZ() {
        C19P4 c19p4 = this.LL;
        if (c19p4.LLLL) {
            ValueAnimator valueAnimator = c19p4.LLLJL;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.LL.LLLJL.cancel();
            }
            C19P4 c19p42 = this.LL;
            c19p42.LLJJJJJIL.setShadowLayer(0.0f, 0.0f, 0.0f, c19p42.LLJIJIL);
            this.LL.LLLJL = ValueAnimator.ofFloat(1.0f);
            this.LL.LLLJL.addUpdateListener(new AUListenerS280S0100000_33(this, 8));
            this.LL.LLLJL.addListener(new AnimatorListenerAdapter() { // from class: X.19P7
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                }
            });
            this.LL.LLLJL.setDuration(300L);
            this.LL.LLLJL.start();
            this.LL.LLLL = false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("AdjustPercentBar$HideTextRunnable@1907.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AdjustPercentBar$HideTextRunnable@1907.run");
    }

    public C19P6(C19P4 c19p4) {
        this.LL = c19p4;
    }
}
