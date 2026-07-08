package X;

/* JADX INFO: renamed from: X.0p2Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1496200p2Q {
    public int LIZ;
    public final int[] LIZIZ = new int[10];

    public final int LIZ() {
        if ((this.LIZ & 128) != 0) {
            return this.LIZIZ[7];
        }
        return 65535;
    }

    public final void LIZIZ(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.LIZIZ;
            if (i < iArr.length) {
                this.LIZ = (1 << i) | this.LIZ;
                iArr[i] = i2;
            }
        }
    }
}
