package X;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: X.0eLB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1084990eLB extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {
    public final float[] LL;
    public final /* synthetic */ C21512819Ha LLILLJJLI;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C21512819Ha c21512819Ha = this.LLILLJJLI;
        float[] fArr = this.LL;
        boolean zLJI = c21512819Ha.LJI(fArr[0], fArr[1]);
        float[] fArr2 = this.LL;
        float f = fArr2[0] * 0.9f;
        fArr2[0] = f;
        float f2 = fArr2[1] * 0.9f;
        fArr2[1] = f2;
        if (zLJI) {
            float f3 = 0.0f - f;
            float f4 = 0.0f - f2;
            if (((float) Math.sqrt((f3 * f3) + (f4 * f4))) >= 1.0f) {
                return;
            }
        }
        valueAnimator.cancel();
    }

    public C1084990eLB(C21512819Ha c21512819Ha, float f, float f2) {
        this.LLILLJJLI = c21512819Ha;
        setFloatValues(0.0f, 1.0f);
        setDuration(1000000L);
        addUpdateListener(this);
        this.LL = new float[]{f, f2};
    }
}
