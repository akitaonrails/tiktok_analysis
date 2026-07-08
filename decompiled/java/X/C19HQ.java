package X;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: X.19HQ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19HQ extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {
    public final float[] LL;
    public final /* synthetic */ C19HL LLILLJJLI;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean zLJIILLIIL;
        if (this.LLILLJJLI.getPinchMode() == 1) {
            C19HL c19hl = this.LLILLJJLI;
            float[] fArr = this.LL;
            zLJIILLIIL = c19hl.LJIILLIIL(fArr[0], fArr[1]);
        } else {
            zLJIILLIIL = false;
        }
        float[] fArr2 = this.LL;
        float f = fArr2[0] * 0.9f;
        fArr2[0] = f;
        float f2 = fArr2[1] * 0.9f;
        fArr2[1] = f2;
        if (zLJIILLIIL) {
            float f3 = 0.0f - f;
            float f4 = 0.0f - f2;
            if (((float) Math.sqrt((f3 * f3) + (f4 * f4))) >= 1.0f) {
                return;
            }
        }
        valueAnimator.cancel();
    }

    public C19HQ(C19HL c19hl, float f, float f2) {
        this.LLILLJJLI = c19hl;
        setFloatValues(0.0f, 1.0f);
        setDuration(1000000L);
        addUpdateListener(this);
        this.LL = new float[]{f, f2};
    }
}
