package X;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: X.12DL, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C12DL implements Interpolator {
    public final float[] LIZ;
    public final float LIZIZ;

    public C12DL(float[] fArr) {
        this.LIZ = fArr;
        this.LIZIZ = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.LIZ;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.LIZIZ;
        float f3 = (f - (iMin * f2)) / f2;
        float[] fArr2 = this.LIZ;
        float f4 = fArr2[iMin];
        return f4 + (f3 * (fArr2[iMin + 1] - f4));
    }
}
