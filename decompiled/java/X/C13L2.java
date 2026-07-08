package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.13L2, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13L2<K> extends C13L1<K> {
    public int LJFF;

    public final void LIZIZ() {
        this.LJ = 0;
        long[] jArr = this.LIZ;
        if (jArr != C19992013Kc.LIZ) {
            C13DL.LJI(jArr, -9187201950435737472L);
            long[] jArr2 = this.LIZ;
            int i = this.LIZLLL;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        Arrays.fill(this.LIZIZ, 0, this.LIZLLL, (Object) null);
        this.LJFF = C19992013Kc.LIZ(this.LIZLLL) - this.LJ;
    }

    public C13L2() {
        LIZLLL(C19992013Kc.LJ(6));
    }

    public final int LIZJ(int i) {
        int i2 = this.LIZLLL;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.LIZ;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final void LIZLLL(int i) {
        int iMax;
        long[] jArr;
        if (i > 0) {
            iMax = Math.max(7, C19992013Kc.LIZLLL(i));
        } else {
            iMax = 0;
        }
        this.LIZLLL = iMax;
        if (iMax == 0) {
            jArr = C19992013Kc.LIZ;
        } else {
            int i2 = ((((iMax + 1) + 7) + 7) & (-8)) >> 3;
            jArr = new long[i2];
            Arrays.fill(jArr, 0, i2, -9187201950435737472L);
        }
        this.LIZ = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.LJFF = C19992013Kc.LIZ(this.LIZLLL) - this.LJ;
        this.LIZIZ = new Object[iMax];
        this.LIZJ = new float[iMax];
    }
}
