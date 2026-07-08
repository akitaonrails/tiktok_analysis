package X;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Kj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19992713Kj<E> extends AbstractC19992513Kh<E> {
    public int LJII;

    public final void LIZJ() {
        this.LJI = 0;
        long[] jArr = this.LIZ;
        if (jArr != C19992013Kc.LIZ) {
            C13DL.LJI(jArr, -9187201950435737472L);
            long[] jArr2 = this.LIZ;
            int i = this.LJFF;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        Arrays.fill(this.LIZIZ, 0, this.LJFF, (Object) null);
        C13DL.LJI(this.LIZJ, 4611686018427387903L);
        this.LIZLLL = Integer.MAX_VALUE;
        this.LJ = Integer.MAX_VALUE;
        this.LJII = C19992013Kc.LIZ(this.LJFF) - this.LJI;
    }

    public C19992713Kj(int i) {
        if (i >= 0) {
            LJFF(C19992013Kc.LJ(i));
        } else {
            C19968313Az.LIZ("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean LIZIZ(E e) {
        int i = this.LJI;
        int iLIZLLL = LIZLLL(e);
        this.LIZIZ[iLIZLLL] = e;
        long[] jArr = this.LIZJ;
        int i2 = this.LIZLLL;
        jArr[iLIZLLL] = (((long) i2) & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((((long) iLIZLLL) & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        this.LIZLLL = iLIZLLL;
        if (this.LJ == Integer.MAX_VALUE) {
            this.LJ = iLIZLLL;
        }
        if (this.LJI != i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x02a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZLLL(E r37) {
        /*
            Method dump skipped, instruction units count: 958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19992713Kj.LIZLLL(java.lang.Object):int");
    }

    public final int LJ(int i) {
        int i2 = this.LJFF;
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

    public final void LJFF(int i) {
        int iMax;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        if (i > 0) {
            iMax = Math.max(7, C19992013Kc.LIZLLL(i));
        } else {
            iMax = 0;
        }
        this.LJFF = iMax;
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
        this.LJII = C19992013Kc.LIZ(this.LJFF) - this.LJI;
        if (iMax == 0) {
            objArr = C830540Wi4.LIZJ;
        } else {
            objArr = new Object[iMax];
        }
        this.LIZIZ = objArr;
        if (iMax == 0) {
            jArr2 = C19992613Ki.LIZ;
        } else {
            jArr2 = new long[iMax];
            Arrays.fill(jArr2, 0, iMax, 4611686018427387903L);
        }
        this.LIZJ = jArr2;
    }

    public final boolean LJI(E e) {
        int iHashCode;
        if (e != null) {
            iHashCode = e.hashCode();
        } else {
            iHashCode = 0;
        }
        int i = iHashCode * (-862048943);
        int i2 = i ^ (i << 16);
        int i3 = i2 & 127;
        int i4 = this.LJFF;
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
                    LJII(iNumberOfTrailingZeros);
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

    public final void LJII(int i) {
        this.LJI--;
        long[] jArr = this.LIZ;
        int i2 = this.LJFF;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.LIZIZ[i] = null;
        long[] jArr2 = this.LIZJ;
        long j2 = jArr2[i];
        int i5 = (int) ((j2 >> 31) & 2147483647L);
        int i6 = (int) (j2 & 2147483647L);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & (-2147483648L)) | (((long) i6) & 2147483647L);
        } else {
            this.LIZLLL = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = ((((long) i5) & 2147483647L) << 31) | (jArr2[i6] & (-4611686016279904257L));
        } else {
            this.LJ = i5;
        }
        jArr2[i] = 4611686018427387903L;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIIZZ(java.util.Collection<? extends E> r19) {
        /*
            r18 = this;
            r11 = r18
            java.lang.Object[] r10 = r11.LIZIZ
            int r9 = r11.LJI
            long[] r8 = r11.LIZ
            int r0 = r8.length
            int r7 = r0 + (-2)
            r17 = 1
            if (r7 < 0) goto L50
            r6 = 0
        L10:
            r3 = r8[r6]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r3
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r12
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L4b
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r5 = 8 - r0
            r2 = 0
        L2a:
            if (r2 >= r5) goto L49
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r3
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L45
            int r1 = r6 << 3
            int r1 = r1 + r2
            r0 = r10[r1]
            r13 = r19
            boolean r0 = X.C13LP.LJJJJ(r0, r13)
            if (r0 != 0) goto L45
            r11.LJII(r1)
        L45:
            long r3 = r3 >> r12
            int r2 = r2 + 1
            goto L2a
        L49:
            if (r5 != r12) goto L50
        L4b:
            if (r6 == r7) goto L50
            int r6 = r6 + 1
            goto L10
        L50:
            int r0 = r11.LJI
            if (r9 != r0) goto L56
            r17 = 0
        L56:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19992713Kj.LJIIIIZZ(java.util.Collection):boolean");
    }
}
