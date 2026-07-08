package X;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: X.0y4V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1843450y4V extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {
    public final float[] LL;
    public final /* synthetic */ C21513519Hh LLILLJJLI;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C21513519Hh c21513519Hh = this.LLILLJJLI;
        float[] fArr = this.LL;
        boolean zLJIIL = c21513519Hh.LJIIL(fArr[0], fArr[1]);
        float[] fArr2 = this.LL;
        float f = fArr2[0] * 0.9f;
        fArr2[0] = f;
        float f2 = fArr2[1] * 0.9f;
        fArr2[1] = f2;
        if (zLJIIL) {
            float f3 = 0.0f - f;
            float f4 = 0.0f - f2;
            if (((float) Math.sqrt((f3 * f3) + (f4 * f4))) >= 1.0f) {
                return;
            }
        }
        valueAnimator.cancel();
    }

    public C1843450y4V(C21513519Hh c21513519Hh, float f, float f2) {
        this.LLILLJJLI = c21513519Hh;
        setFloatValues(0.0f, 1.0f);
        setDuration(1000000L);
        addUpdateListener(this);
        this.LL = new float[]{f, f2};
    }
}
