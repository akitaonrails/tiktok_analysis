package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.13fW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20067613fW {
    public int LIZ;
    public long[] LIZIZ = new long[2];

    public final void LIZ(long j) {
        if (!LIZIZ(j)) {
            int i = this.LIZ;
            long[] jArrCopyOf = this.LIZIZ;
            if (i >= jArrCopyOf.length) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i + 1, jArrCopyOf.length * 2));
                this.LIZIZ = jArrCopyOf;
            }
            jArrCopyOf[i] = j;
            if (i >= this.LIZ) {
                this.LIZ = i + 1;
            }
        }
    }

    public final boolean LIZIZ(long j) {
        int i = this.LIZ;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.LIZIZ[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public final void LIZJ(long j) {
        int i = this.LIZ;
        int i2 = 0;
        while (i2 < i) {
            if (j == this.LIZIZ[i2]) {
                int i3 = this.LIZ - 1;
                while (i2 < i3) {
                    long[] jArr = this.LIZIZ;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.LIZ--;
                return;
            }
            i2++;
        }
    }
}
