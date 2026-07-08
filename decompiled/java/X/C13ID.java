package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.13ID, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13ID extends C13IF<double[]> {
    public double[] LIZ;
    public int LIZIZ;

    @Override // X.C13IF
    public final double[] LIZ() {
        return Arrays.copyOf(this.LIZ, this.LIZIZ);
    }

    @Override // X.C13IF
    public final int LIZLLL() {
        return this.LIZIZ;
    }

    public C13ID(double[] dArr) {
        this.LIZ = dArr;
        this.LIZIZ = dArr.length;
        LIZIZ(10);
    }

    @Override // X.C13IF
    public final void LIZIZ(int i) {
        double[] dArr = this.LIZ;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.LIZ = Arrays.copyOf(dArr, i);
        }
    }
}
