package X;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Kx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19994113Kx<E> extends AbstractC19993613Ks<E> {
    public int LJ;

    public C19994113Kx() {
        this(6);
    }

    public final void LJ() {
        this.LIZLLL = 0;
        long[] jArr = this.LIZ;
        if (jArr != C19992013Kc.LIZ) {
            C13DL.LJI(jArr, -9187201950435737472L);
            long[] jArr2 = this.LIZ;
            int i = this.LIZJ;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        Arrays.fill(this.LIZIZ, 0, this.LIZJ, (Object) null);
        this.LJ = C19992013Kc.LIZ(this.LIZJ) - this.LIZLLL;
    }

    public C19994113Kx(int i) {
        if (i >= 0) {
            LJII(C19992013Kc.LJ(i));
        } else {
            C19968313Az.LIZ("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean LIZLLL(E e) {
        int i = this.LIZLLL;
        this.LIZIZ[LJFF(e)] = e;
        if (this.LIZLLL != i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJFF(E r32) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19994113Kx.LJFF(java.lang.Object):int");
    }

    public final int LJI(int i) {
        int i2 = this.LIZJ;
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

    public final void LJII(int i) {
        int iMax;
        long[] jArr;
        Object[] objArr;
        if (i > 0) {
            iMax = Math.max(7, C19992013Kc.LIZLLL(i));
        } else {
            iMax = 0;
        }
        this.LIZJ = iMax;
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
        this.LJ = C19992013Kc.LIZ(this.LIZJ) - this.LIZLLL;
        if (iMax == 0) {
            objArr = C830540Wi4.LIZJ;
        } else {
            objArr = new Object[iMax];
        }
        this.LIZIZ = objArr;
    }

    public final void LJIIIIZZ(E e) {
        int iHashCode;
        if (e != null) {
            iHashCode = e.hashCode();
        } else {
            iHashCode = 0;
        }
        int i = iHashCode * (-862048943);
        int i2 = i ^ (i << 16);
        int i3 = i2 & 127;
        int i4 = this.LIZJ;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.LIZ;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (Intrinsics.LJFF(this.LIZIZ[iNumberOfTrailingZeros], e)) {
                    if (iNumberOfTrailingZeros >= 0) {
                        LJIIL(iNumberOfTrailingZeros);
                        return;
                    }
                    return;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIIZ(C19994113Kx c19994113Kx) {
        Object[] objArr = c19994113Kx.LIZIZ;
        long[] jArr = c19994113Kx.LIZ;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            LJIIJ(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void LJIIJ(E e) {
        this.LIZIZ[LJFF(e)] = e;
    }

    public final boolean LJIIJJI(E e) {
        int iHashCode;
        if (e != null) {
            iHashCode = e.hashCode();
        } else {
            iHashCode = 0;
        }
        int i = iHashCode * (-862048943);
        int i2 = i ^ (i << 16);
        int i3 = i2 & 127;
        int i4 = this.LIZJ;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.LIZ;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (Intrinsics.LJFF(this.LIZIZ[iNumberOfTrailingZeros], e)) {
                    if (iNumberOfTrailingZeros < 0) {
                        return false;
                    }
                    LJIIL(iNumberOfTrailingZeros);
                    return true;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return false;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final void LJIIL(int i) {
        this.LIZLLL--;
        long[] jArr = this.LIZ;
        int i2 = this.LIZJ;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.LIZIZ[i] = null;
    }
}
