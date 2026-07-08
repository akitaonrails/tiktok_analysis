package X;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: X.0eLA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1084980eLA extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {
    public final float[] LL;
    public final /* synthetic */ C19HG LLILLJJLI;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C19HG c19hg = this.LLILLJJLI;
        float[] fArr = this.LL;
        boolean zLJII = c19hg.LJII(fArr[0], fArr[1]);
        float[] fArr2 = this.LL;
        float f = fArr2[0] * 0.9f;
        fArr2[0] = f;
        float f2 = fArr2[1] * 0.9f;
        fArr2[1] = f2;
        if (zLJII) {
            float f3 = 0.0f - f;
            float f4 = 0.0f - f2;
            if (((float) Math.sqrt((f3 * f3) + (f4 * f4))) >= 1.0f) {
                return;
            }
        }
        valueAnimator.cancel();
    }

    public C1084980eLA(C19HG c19hg, float f, float f2) {
        this.LLILLJJLI = c19hg;
        setFloatValues(0.0f, 1.0f);
        setDuration(1000000L);
        addUpdateListener(this);
        this.LL = new float[]{f, f2};
    }
}
