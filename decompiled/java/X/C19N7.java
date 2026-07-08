package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.19N7, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19N7 {
    public float[] LIZ = new float[0];
    public double[] LIZIZ = new double[0];
    public double[] LIZJ;
    public int LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pos =");
        sbLIZ.append(Arrays.toString(this.LIZIZ));
        sbLIZ.append(" period=");
        sbLIZ.append(Arrays.toString(this.LIZ));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final double LIZIZ(double d) {
        if (d < 0.0d) {
            d = 0.0d;
        } else if (d > 1.0d) {
            d = 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.LIZIZ, d);
        if (iBinarySearch > 0) {
            return 1.0d;
        }
        if (iBinarySearch == 0) {
            return 0.0d;
        }
        int i = (-iBinarySearch) - 1;
        float[] fArr = this.LIZ;
        float f = fArr[i];
        int i2 = i - 1;
        float f2 = fArr[i2];
        double d2 = f - f2;
        double[] dArr = this.LIZIZ;
        double d3 = dArr[i];
        double d4 = dArr[i2];
        double d5 = d2 / (d3 - d4);
        return this.LIZJ[i2] + ((((double) f2) - (d5 * d4)) * (d - d4)) + ((d5 * ((d * d) - (d4 * d4))) / 2.0d);
    }

    public final void LIZ(double d, float f) {
        int length = this.LIZ.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.LIZIZ, d);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.LIZIZ = Arrays.copyOf(this.LIZIZ, length);
        this.LIZ = Arrays.copyOf(this.LIZ, length);
        this.LIZJ = new double[length];
        double[] dArr = this.LIZIZ;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.LIZIZ[iBinarySearch] = d;
        this.LIZ[iBinarySearch] = f;
    }
}
