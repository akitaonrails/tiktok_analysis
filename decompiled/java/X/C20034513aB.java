package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.13aB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20034513aB {
    public int[] LIZ = new int[10];
    public int LIZIZ;

    public final int LIZ() {
        int[] iArr = this.LIZ;
        int i = this.LIZIZ - 1;
        this.LIZIZ = i;
        return iArr[i];
    }

    public final void LIZIZ(int i) {
        int[] iArrCopyOf = this.LIZ;
        if (this.LIZIZ >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.LIZ = iArrCopyOf;
        }
        int i2 = this.LIZIZ;
        this.LIZIZ = i2 + 1;
        iArrCopyOf[i2] = i;
    }
}
