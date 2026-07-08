package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0tz6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1686340tz6 {
    public static final float LIZ(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float fLIZ;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            fLIZ = fArr2[iBinarySearch];
        } else {
            int i = (-(iBinarySearch + 1)) - 1;
            float f5 = 0.0f;
            if (i >= fArr.length - 1) {
                float f6 = fArr[fArr.length - 1];
                float f7 = fArr2[fArr.length - 1];
                if (f6 == 0.0f) {
                    return 0.0f;
                }
                return f * (f7 / f6);
            }
            if (i == -1) {
                f3 = fArr[0];
                f4 = fArr2[0];
                f2 = 0.0f;
            } else {
                f2 = fArr[i];
                int i2 = i + 1;
                f3 = fArr[i2];
                f5 = fArr2[i];
                f4 = fArr2[i2];
            }
            fLIZ = C1686350tz7.LIZ(f5, f4, f2, f3, fAbs);
        }
        return fSignum * fLIZ;
    }
}
