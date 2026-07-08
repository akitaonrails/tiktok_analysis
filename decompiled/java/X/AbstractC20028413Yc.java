package X;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Yc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20028413Yc<K> {
    public long[] LIZ = C19992013Kc.LIZ;
    public Object[] LIZIZ = C830540Wi4.LIZJ;
    public int[] LIZJ = C649500Pdk.LIZ;
    public int LIZLLL;
    public int LJ;

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[PHI: r16
      0x004f: PHI (r16v4 int) = (r16v3 int), (r16v5 int) binds: [B:6:0x0020, B:17:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object[] r10 = r0.LIZIZ
            int[] r9 = r0.LIZJ
            long[] r8 = r0.LIZ
            int r0 = r8.length
            int r7 = r0 + (-2)
            r16 = 0
            if (r7 < 0) goto L54
            r6 = 0
            r16 = 0
        L12:
            r2 = r8[r6]
            long r0 = ~r2
            r4 = 7
            long r0 = r0 << r4
            long r0 = r0 & r2
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r11
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 == 0) goto L4f
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r11 = 8
            int r5 = 8 - r0
            r4 = 0
        L2c:
            if (r4 >= r5) goto L4d
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r2
            r12 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L47
            int r1 = r6 << 3
            int r1 = r1 + r4
            r0 = r10[r1]
            r1 = r9[r1]
            if (r0 == 0) goto L4b
            int r0 = r0.hashCode()
        L44:
            r1 = r1 ^ r0
            int r16 = r16 + r1
        L47:
            long r2 = r2 >> r11
            int r4 = r4 + 1
            goto L2c
        L4b:
            r0 = 0
            goto L44
        L4d:
            if (r5 != r11) goto L54
        L4f:
            if (r6 == r7) goto L54
            int r6 = r6 + 1
            goto L12
        L54:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20028413Yc.hashCode():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[PHI: r4
      0x006a: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:10:0x002b, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r11 = r18
            int r0 = r11.LJ
            if (r0 != 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "{"
            r10.<init>(r0)
            java.lang.Object[] r9 = r11.LIZIZ
            int[] r8 = r11.LIZJ
            long[] r7 = r11.LIZ
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L6f
            r5 = 0
            r4 = 0
        L1d:
            r2 = r7[r5]
            long r0 = ~r2
            r12 = 7
            long r0 = r0 << r12
            long r0 = r0 & r2
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r13
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 == 0) goto L6a
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r13 = 8
            int r12 = 8 - r0
            r1 = 0
        L37:
            if (r1 >= r12) goto L68
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r16 & r2
            r14 = 128(0x80, double:6.3E-322)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 >= 0) goto L64
            int r14 = r5 << 3
            int r14 = r14 + r1
            r0 = r9[r14]
            r14 = r8[r14]
            if (r0 != r11) goto L4e
            java.lang.String r0 = "(this)"
        L4e:
            r10.append(r0)
            java.lang.String r0 = "="
            r10.append(r0)
            r10.append(r14)
            int r4 = r4 + 1
            int r0 = r11.LJ
            if (r4 >= r0) goto L64
            java.lang.String r0 = ", "
            r10.append(r0)
        L64:
            long r2 = r2 >> r13
            int r1 = r1 + 1
            goto L37
        L68:
            if (r12 != r13) goto L6f
        L6a:
            if (r5 == r6) goto L6f
            int r5 = r5 + 1
            goto L1d
        L6f:
            r0 = 125(0x7d, float:1.75E-43)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20028413Yc.toString():java.lang.String");
    }

    public final int LIZ(K k) {
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
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final int LIZIZ(K k) {
        int iLIZ = LIZ(k);
        if (iLIZ >= 0) {
            return this.LIZJ[iLIZ];
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("There is no key ");
        sbLIZ.append(k);
        sbLIZ.append(" in the map");
        throw new NoSuchElementException(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        return false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r11 = r18
            r0 = 1
            r2 = r17
            if (r11 != r2) goto L8
            return r0
        L8:
            boolean r0 = r11 instanceof X.AbstractC20028413Yc
            r16 = 0
            if (r0 != 0) goto Lf
            return r16
        Lf:
            X.13Yc r11 = (X.AbstractC20028413Yc) r11
            int r1 = r11.LJ
            int r0 = r2.LJ
            if (r1 == r0) goto L18
            return r16
        L18:
            java.lang.Object[] r10 = r2.LIZIZ
            int[] r9 = r2.LIZJ
            long[] r8 = r2.LIZ
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L68
            r6 = 0
        L24:
            r3 = r8[r6]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r3
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r12
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L63
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r13 = 8
            int r12 = 8 - r0
            r5 = 0
        L3e:
            if (r5 >= r12) goto L61
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r3
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L5d
            int r1 = r6 << 3
            int r1 = r1 + r5
            r0 = r10[r1]
            r2 = r9[r1]
            int r1 = r11.LIZ(r0)
            if (r1 < 0) goto L5c
            int[] r0 = r11.LIZJ
            r0 = r0[r1]
            if (r2 == r0) goto L5d
        L5c:
            return r16
        L5d:
            long r3 = r3 >> r13
            int r5 = r5 + 1
            goto L3e
        L61:
            if (r12 != r13) goto L68
        L63:
            if (r6 == r7) goto L68
            int r6 = r6 + 1
            goto L24
        L68:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20028413Yc.equals(java.lang.Object):boolean");
    }
}
