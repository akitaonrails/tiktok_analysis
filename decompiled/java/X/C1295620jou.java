package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0jou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1295620jou {
    public final float[] LIZ;
    public final int[] LIZIZ;

    public final C1295620jou LIZ(float[] fArr) {
        int iLIZJ;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            int iBinarySearch = Arrays.binarySearch(this.LIZ, f);
            if (iBinarySearch >= 0) {
                iLIZJ = this.LIZIZ[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                if (i2 == 0) {
                    iLIZJ = this.LIZIZ[0];
                } else {
                    int[] iArr2 = this.LIZIZ;
                    if (i2 == iArr2.length - 1) {
                        iLIZJ = iArr2[iArr2.length - 1];
                    } else {
                        float[] fArr2 = this.LIZ;
                        int i3 = i2 - 1;
                        float f2 = fArr2[i3];
                        iLIZJ = C1295790jpB.LIZJ((f - f2) / (fArr2[i2] - f2), iArr2[i3], iArr2[i2]);
                    }
                }
            }
            iArr[i] = iLIZJ;
        }
        return new C1295620jou(fArr, iArr);
    }

    public C1295620jou(float[] fArr, int[] iArr) {
        this.LIZ = fArr;
        this.LIZIZ = iArr;
    }
}
