package X;

import Y.ALAdapterS7S0100000_10;
import Y.AUListenerS260S0100000_10;
import android.animation.ValueAnimator;

/* JADX INFO: renamed from: X.0QNW, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public abstract class C0QNW {
    public ValueAnimator LIZ;
    public ValueAnimator LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public final void LIZ() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3 = this.LIZIZ;
        if (valueAnimator3 != null && valueAnimator3.isRunning() && (valueAnimator2 = this.LIZIZ) != null) {
            valueAnimator2.end();
        }
        ValueAnimator valueAnimator4 = this.LIZ;
        if (valueAnimator4 == null || !valueAnimator4.isRunning() || (valueAnimator = this.LIZ) == null) {
            return;
        }
        valueAnimator.end();
    }

    public final void LIZIZ() {
        LIZ();
        if (this.LIZLLL == 0) {
            return;
        }
        if (this.LIZIZ == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.LIZIZ = valueAnimator;
            valueAnimator.setFloatValues(0.0f, 1.0f);
            ValueAnimator valueAnimator2 = this.LIZIZ;
            if (valueAnimator2 != null) {
                int i = this.LIZJ;
                if (i == 0) {
                    i = 200;
                }
                valueAnimator2.setDuration(i);
            }
            ValueAnimator valueAnimator3 = this.LIZIZ;
            if (valueAnimator3 != null) {
                valueAnimator3.setInterpolator(new InterpolatorC420870Ger(0.32f, 0.94f, 0.6f, 1.0f));
            }
            ValueAnimator valueAnimator4 = this.LIZIZ;
            if (valueAnimator4 != null) {
                valueAnimator4.addUpdateListener(new AUListenerS260S0100000_10((C0QNX) this, 10));
            }
            ValueAnimator valueAnimator5 = this.LIZIZ;
            if (valueAnimator5 != null) {
                valueAnimator5.addListener(new ALAdapterS7S0100000_10((C0QNX) this, 7));
            }
        }
        ValueAnimator valueAnimator6 = this.LIZIZ;
        if (valueAnimator6 != null) {
            valueAnimator6.start();
        }
    }
}
