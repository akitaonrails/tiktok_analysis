package X;

import android.animation.ValueAnimator;
import android.graphics.Matrix;

/* JADX INFO: renamed from: X.19Gm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21511419Gm extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {
    public final float[] LL;
    public final float[] LLILLJJLI;
    public final float[] LLILLL = new float[9];
    public final /* synthetic */ C19HG LLILZ;

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
        this.LLILZ.LLILZLL.setValues(this.LLILLL);
        this.LLILZ.LIZJ();
        this.LLILZ.invalidate();
    }

    public C21511419Gm(C19HG c19hg, Matrix matrix, Matrix matrix2, int i) {
        this.LLILZ = c19hg;
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
