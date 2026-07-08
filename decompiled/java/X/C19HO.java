package X;

import android.animation.ValueAnimator;
import android.graphics.Matrix;

/* JADX INFO: renamed from: X.19HO, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19HO extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {
    public final float[] LL;
    public final float[] LLILLJJLI;
    public final float[] LLILLL;
    public final /* synthetic */ C19HL LLILZ;

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
        this.LLILZ.LLJJIJI.setValues(this.LLILLL);
        this.LLILZ.LJFF();
        this.LLILZ.invalidate();
    }

    public /* synthetic */ C19HO(C19HL c19hl, Matrix matrix, Matrix matrix2) {
        this(c19hl, matrix, matrix2, 200L);
    }

    public C19HO(C19HL c19hl, Matrix matrix, Matrix matrix2, long j) {
        this.LLILZ = c19hl;
        float[] fArr = new float[9];
        this.LL = fArr;
        float[] fArr2 = new float[9];
        this.LLILLJJLI = fArr2;
        this.LLILLL = new float[9];
        setFloatValues(0.0f, 1.0f);
        setDuration(j);
        addUpdateListener(this);
        matrix.getValues(fArr);
        matrix2.getValues(fArr2);
    }
}
