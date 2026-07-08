package X;

import android.animation.ValueAnimator;
import android.graphics.Matrix;

/* JADX INFO: renamed from: X.12Gj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19727512Gj extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {
    public final float[] LL;
    public final float[] LLILLJJLI;
    public final float[] LLILLL = new float[9];
    public final /* synthetic */ C19HU LLILZ;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = 0;
        do {
            float[] fArr = this.LLILLL;
            float f = this.LL[i];
            fArr[i] = f + ((this.LLILLJJLI[i] - f) * fFloatValue);
            i++;
        } while (i < 9);
        this.LLILZ.LLILLL.setValues(this.LLILLL);
        this.LLILZ.invalidate();
    }

    public C19727512Gj(C19HU c19hu, Matrix matrix, Matrix matrix2) {
        this.LLILZ = c19hu;
        float[] fArr = new float[9];
        this.LL = fArr;
        float[] fArr2 = new float[9];
        this.LLILLJJLI = fArr2;
        setFloatValues(0.0f, 1.0f);
        setDuration(200L);
        addUpdateListener(this);
        matrix.getValues(fArr);
        matrix2.getValues(fArr2);
    }
}
