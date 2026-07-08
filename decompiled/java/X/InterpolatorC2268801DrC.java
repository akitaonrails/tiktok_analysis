package X;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: X.1DrC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class InterpolatorC2268801DrC implements Interpolator {
    public C2268821DrE LIZ;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        C2268821DrE c2268821DrE = this.LIZ;
        if (c2268821DrE != null) {
            float f2 = 0.0f;
            if (f >= 0.0f) {
                f2 = f;
            }
            if (f2 > 1.0f) {
                f = 1.0f;
            }
            float[] fArr = c2268821DrE.LIZ;
            int length = fArr.length - 1;
            float f3 = length;
            float f4 = 1.0f / f3;
            int i = (int) (f3 * f);
            int iMin = Math.min(i + 1, length);
            if (i == iMin) {
                return fArr[length];
            }
            float f5 = i * f4;
            float f6 = fArr[i];
            return (((f - f5) / ((f4 + f5) - f5)) * (fArr[iMin] - f6)) + f6;
        }
        return f;
    }
}
