package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.13Yb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20028313Yb<K> extends AbstractC20028413Yc<K> {
    public int LJFF;

    public C20028313Yb() {
        this(6);
    }

    public final void LIZJ() {
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

    public C20028313Yb(int i) {
        if (i >= 0) {
            LJFF(C19992013Kc.LJ(i));
        } else {
            C19968313Az.LIZ("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int LIZLLL(int i) {
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

    /* JADX WARN: Removed duplicated region for block: B:48:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJ(K r31) {
        /*
            Method dump skipped, instruction units count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20028313Yb.LJ(java.lang.Object):int");
    }

    public final void LJFF(int i) {
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
        this.LIZJ = new int[iMax];
    }

    public final void LJI(int i) {
        this.LJ--;
        long[] jArr = this.LIZ;
        int i2 = this.LIZLLL;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.LIZIZ[i] = null;
    }

    public final void LJII(int i, Object obj) {
        int iLJ = LJ(obj);
        if (iLJ < 0) {
            iLJ = ~iLJ;
        }
        this.LIZIZ[iLJ] = obj;
        this.LIZJ[iLJ] = i;
    }
}
