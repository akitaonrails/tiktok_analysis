package X;

import Y.ALAdapterS7S0100000_10;
import Y.AUListenerS260S0100000_10;
import android.animation.ValueAnimator;

/* JADX INFO: renamed from: X.0QR0, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public abstract class C0QR0 {
    public ValueAnimator LIZ;
    public ValueAnimator LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public final void LIZ() {
        ValueAnimator valueAnimator = this.LIZIZ;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LIZIZ.end();
        }
        ValueAnimator valueAnimator2 = this.LIZ;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            return;
        }
        this.LIZ.end();
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
            int i = this.LIZJ;
            valueAnimator2.setDuration(i == 0 ? 200L : i);
            this.LIZIZ.setInterpolator(new InterpolatorC420870Ger(0.32f, 0.94f, 0.6f, 1.0f));
            C0QR2 c0qr2 = (C0QR2) this;
            this.LIZIZ.addUpdateListener(new AUListenerS260S0100000_10(c0qr2, 18));
            this.LIZIZ.addListener(new ALAdapterS7S0100000_10(c0qr2, 11));
        }
        this.LIZIZ.start();
    }
}
