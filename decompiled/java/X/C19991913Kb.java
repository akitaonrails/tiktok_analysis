package X;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Kb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19991913Kb<K, V> extends C13KZ<K, V> {
    public int LJFF;

    public C19991913Kb() {
        this(6);
    }

    public final void LJFF() {
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
        Arrays.fill(this.LIZJ, 0, this.LIZLLL, (Object) null);
        Arrays.fill(this.LIZIZ, 0, this.LIZLLL, (Object) null);
        this.LJFF = C19992013Kc.LIZ(this.LIZLLL) - this.LJ;
    }

    public C19991913Kb(int i) {
        if (i >= 0) {
            LJIIIIZZ(C19992013Kc.LJ(i));
        } else {
            C19968313Az.LIZ("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int LJI(int i) {
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

    public final int LJII(K k) {
        int iHashCode;
        int i;
        int iHashCode2;
        int iHashCode3;
        if (k != null) {
            iHashCode = k.hashCode();
        } else {
            iHashCode = 0;
        }
        int i2 = iHashCode * (-862048943);
        int i3 = i2 ^ (i2 << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.LIZLLL;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr = this.LIZ;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j2 = i5;
            long j3 = j ^ (j2 * 72340172838076673L);
            long j4 = -9187201950435737472L;
            for (long j5 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                int iNumberOfTrailingZeros = (i7 + (Long.numberOfTrailingZeros(j5) >> 3)) & i6;
                if (Intrinsics.LJFF(this.LIZIZ[iNumberOfTrailingZeros], k)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int iLJI = LJI(i4);
                if (this.LJFF == 0 && ((this.LIZ[iLJI >> 3] >> ((iLJI & 7) << 3)) & 255) != 254) {
                    int i11 = this.LIZLLL;
                    if (i11 > 8 && Long.compare((((long) this.LJ) * 32) ^ Long.MIN_VALUE, (((long) i11) * 25) ^ Long.MIN_VALUE) <= 0) {
                        long[] jArr2 = this.LIZ;
                        int i12 = this.LIZLLL;
                        Object[] objArr = this.LIZIZ;
                        Object[] objArr2 = this.LIZJ;
                        int i13 = (i12 + 7) >> 3;
                        int i14 = 0;
                        while (i14 < i13) {
                            long j6 = jArr2[i14] & j4;
                            jArr2[i14] = (-72340172838076674L) & ((~j6) + (j6 >>> 7));
                            i14++;
                            j4 = -9187201950435737472L;
                        }
                        int length = jArr2.length - 1;
                        int i15 = length - 1;
                        jArr2[i15] = (jArr2[i15] & 72057594037927935L) | (-72057594037927936L);
                        jArr2[length] = jArr2[0];
                        int i16 = 0;
                        while (i16 != i12) {
                            int i17 = i16 >> 3;
                            int i18 = (i16 & 7) << 3;
                            long j7 = (jArr2[i17] >> i18) & 255;
                            if (j7 != 128 && j7 == 254) {
                                Object obj = objArr[i16];
                                if (obj != null) {
                                    iHashCode3 = obj.hashCode();
                                } else {
                                    iHashCode3 = 0;
                                }
                                int i19 = iHashCode3 * (-862048943);
                                int i20 = i19 ^ (i19 << 16);
                                int i21 = i20 >>> 7;
                                int iLJI2 = LJI(i21);
                                int i22 = i21 & i12;
                                if (((iLJI2 - i22) & i12) / 8 == ((i16 - i22) & i12) / 8) {
                                    jArr2[i17] = (((long) (i20 & 127)) << i18) | ((~(255 << i18)) & jArr2[i17]);
                                    jArr2[jArr2.length - 1] = jArr2[0];
                                } else {
                                    int i23 = iLJI2 >> 3;
                                    long j8 = jArr2[i23];
                                    int i24 = (iLJI2 & 7) << 3;
                                    if (((j8 >> i24) & 255) == 128) {
                                        jArr2[i23] = (((long) (i20 & 127)) << i24) | (j8 & (~(255 << i24)));
                                        jArr2[i17] = (jArr2[i17] & (~(255 << i18))) | (128 << i18);
                                        objArr[iLJI2] = objArr[i16];
                                        objArr[i16] = null;
                                        objArr2[iLJI2] = objArr2[i16];
                                        objArr2[i16] = null;
                                    } else {
                                        jArr2[i23] = (((long) (i20 & 127)) << i24) | ((~(255 << i24)) & j8);
                                        Object obj2 = objArr[iLJI2];
                                        objArr[iLJI2] = objArr[i16];
                                        objArr[i16] = obj2;
                                        Object obj3 = objArr2[iLJI2];
                                        objArr2[iLJI2] = objArr2[i16];
                                        objArr2[i16] = obj3;
                                        i16--;
                                    }
                                    jArr2[jArr2.length - 1] = jArr2[0];
                                    i16++;
                                }
                            }
                            i16++;
                        }
                        this.LJFF = C19992013Kc.LIZ(this.LIZLLL) - this.LJ;
                    } else {
                        int iLIZJ = C19992013Kc.LIZJ(this.LIZLLL);
                        long[] jArr3 = this.LIZ;
                        Object[] objArr3 = this.LIZIZ;
                        Object[] objArr4 = this.LIZJ;
                        int i25 = this.LIZLLL;
                        LJIIIIZZ(iLIZJ);
                        long[] jArr4 = this.LIZ;
                        Object[] objArr5 = this.LIZIZ;
                        Object[] objArr6 = this.LIZJ;
                        int i26 = this.LIZLLL;
                        for (int i27 = 0; i27 < i25; i27++) {
                            if (((jArr3[i27 >> 3] >> ((i27 & 7) << 3)) & 255) < 128) {
                                Object obj4 = objArr3[i27];
                                if (obj4 != null) {
                                    iHashCode2 = obj4.hashCode();
                                } else {
                                    iHashCode2 = 0;
                                }
                                int i28 = iHashCode2 * (-862048943);
                                int i29 = i28 ^ (i28 << 16);
                                int iLJI3 = LJI(i29 >>> 7);
                                int i30 = iLJI3 >> 3;
                                int i31 = (iLJI3 & 7) << 3;
                                long j9 = (((long) (i29 & 127)) << i31) | (jArr4[i30] & (~(255 << i31)));
                                jArr4[i30] = j9;
                                jArr4[(((iLJI3 - 7) & i26) + (i26 & 7)) >> 3] = j9;
                                objArr5[iLJI3] = obj4;
                                objArr6[iLJI3] = objArr4[i27];
                            }
                        }
                    }
                    iLJI = LJI(i4);
                }
                this.LJ++;
                int i32 = this.LJFF;
                long[] jArr5 = this.LIZ;
                int i33 = iLJI >> 3;
                long j10 = jArr5[i33];
                int i34 = (iLJI & 7) << 3;
                if (((j10 >> i34) & 255) == 128) {
                    i = 1;
                } else {
                    i = 0;
                }
                this.LJFF = i32 - i;
                int i35 = this.LIZLLL;
                long j11 = (j10 & (~(255 << i34))) | (j2 << i34);
                jArr5[i33] = j11;
                jArr5[(((iLJI - 7) & i35) + (i35 & 7)) >> 3] = j11;
                return ~iLJI;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
    }

    public final void LJIIIIZZ(int i) {
        int iMax;
        long[] jArr;
        Object[] objArr;
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
            int i3 = iMax >> 3;
            long j = 255 << ((iMax & 7) << 3);
            jArr[i3] = (jArr[i3] & (~j)) | j;
        }
        this.LIZ = jArr;
        this.LJFF = C19992013Kc.LIZ(this.LIZLLL) - this.LJ;
        Object[] objArr2 = C830540Wi4.LIZJ;
        if (iMax == 0) {
            objArr = objArr2;
        } else {
            objArr = new Object[iMax];
        }
        this.LIZIZ = objArr;
        if (iMax != 0) {
            objArr2 = new Object[iMax];
        }
        this.LIZJ = objArr2;
    }

    public final V LJIIIZ(K k) {
        int iHashCode;
        if (k != null) {
            iHashCode = k.hashCode();
        } else {
            iHashCode = 0;
        }
        int i = iHashCode * (-862048943);
        int i2 = i ^ (i << 16);
        int i3 = i2 & 127;
        int i4 = this.LIZLLL;
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
                if (Intrinsics.LJFF(this.LIZIZ[iNumberOfTrailingZeros], k)) {
                    if (iNumberOfTrailingZeros >= 0) {
                        return LJIIJ(iNumberOfTrailingZeros);
                    }
                    return null;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) == 0) {
                i6 += 8;
                i5 = (i5 + i6) & i4;
            } else {
                return null;
            }
        }
    }

    public final V LJIIJ(int i) {
        this.LJ--;
        long[] jArr = this.LIZ;
        int i2 = this.LIZLLL;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.LIZIZ[i] = null;
        Object[] objArr = this.LIZJ;
        V v = (V) objArr[i];
        objArr[i] = null;
        return v;
    }

    public final void LJIIJJI(K k, V v) {
        int iLJII = LJII(k);
        if (iLJII < 0) {
            iLJII = ~iLJII;
        }
        this.LIZIZ[iLJII] = k;
        this.LIZJ[iLJII] = v;
    }
}
