package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Ks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19993613Ks<E> {
    public long[] LIZ = C19992013Kc.LIZ;
    public Object[] LIZIZ = C830540Wi4.LIZJ;
    public int LIZJ;
    public int LIZLLL;

    public final boolean LIZIZ() {
        return this.LIZLLL == 0;
    }

    public final boolean LIZJ() {
        return this.LIZLLL != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054 A[PHI: r16
      0x0054: PHI (r16v4 int) = (r16v3 int), (r16v5 int) binds: [B:6:0x0022, B:18:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r17 = this;
            r10 = r17
            int r0 = r10.LIZJ
            int r16 = r0 * 31
            int r0 = r10.LIZLLL
            int r16 = r16 + r0
            java.lang.Object[] r9 = r10.LIZIZ
            long[] r8 = r10.LIZ
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L59
            r6 = 0
        L14:
            r2 = r8[r6]
            long r0 = ~r2
            r4 = 7
            long r0 = r0 << r4
            long r0 = r0 & r2
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r11
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 == 0) goto L54
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r11 = 8
            int r5 = 8 - r0
            r4 = 0
        L2e:
            if (r4 >= r5) goto L52
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r2
            r12 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L4c
            int r0 = r6 << 3
            int r0 = r0 + r4
            r1 = r9[r0]
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r10)
            if (r0 != 0) goto L4c
            if (r1 == 0) goto L50
            int r0 = r1.hashCode()
        L4a:
            int r16 = r16 + r0
        L4c:
            long r2 = r2 >> r11
            int r4 = r4 + 1
            goto L2e
        L50:
            r0 = 0
            goto L4a
        L52:
            if (r5 != r11) goto L59
        L54:
            if (r6 == r7) goto L59
            int r6 = r6 + 1
            goto L14
        L59:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC19993613Ks.hashCode():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006e A[PHI: r5
      0x006e: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:6:0x002c, B:20:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            kotlin.jvm.internal.AwS609S0100000_30 r11 = new kotlin.jvm.internal.AwS609S0100000_30
            r0 = 134(0x86, float:1.88E-43)
            r1 = r18
            r11.<init>(r1, r0)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "["
            r9.append(r0)
            java.lang.Object[] r10 = r1.LIZIZ
            long[] r8 = r1.LIZ
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L73
            r6 = 0
            r5 = 0
        L1e:
            r3 = r8[r6]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r3
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r12
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L6e
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r13 = 8
            int r12 = 8 - r0
            r2 = 0
        L38:
            if (r2 >= r12) goto L6c
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r16 & r3
            r14 = 128(0x80, double:6.3E-322)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 >= 0) goto L68
            int r0 = r6 << 3
            int r0 = r0 + r2
            r1 = r10[r0]
            r0 = -1
            if (r5 != r0) goto L56
            java.lang.String r0 = "..."
            r9.append(r0)
        L51:
            java.lang.String r0 = r9.toString()
            return r0
        L56:
            if (r5 == 0) goto L5d
            java.lang.String r0 = ", "
            r9.append(r0)
        L5d:
            java.lang.Object r0 = r11.invoke(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.append(r0)
            int r5 = r5 + 1
        L68:
            long r3 = r3 >> r13
            int r2 = r2 + 1
            goto L38
        L6c:
            if (r12 != r13) goto L73
        L6e:
            if (r6 == r7) goto L73
            int r6 = r6 + 1
            goto L1e
        L73:
            java.lang.String r0 = "]"
            r9.append(r0)
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC19993613Ks.toString():java.lang.String");
    }

    public final boolean LIZ(E e) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r10 = r18
            r16 = 1
            r2 = r17
            if (r10 != r2) goto L9
            return r16
        L9:
            boolean r0 = r10 instanceof X.AbstractC19993613Ks
            r15 = 0
            if (r0 != 0) goto Lf
            return r15
        Lf:
            X.13Ks r10 = (X.AbstractC19993613Ks) r10
            int r1 = r10.LIZLLL
            int r0 = r2.LIZLLL
            if (r1 == r0) goto L18
            return r15
        L18:
            java.lang.Object[] r9 = r2.LIZIZ
            long[] r8 = r2.LIZ
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L5e
            r6 = 0
        L22:
            r3 = r8[r6]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r3
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r11
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 == 0) goto L59
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r5 = 0
        L3c:
            if (r5 >= r11) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r3
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L53
            int r0 = r6 << 3
            int r0 = r0 + r5
            r0 = r9[r0]
            boolean r0 = r10.LIZ(r0)
            if (r0 != 0) goto L53
            return r15
        L53:
            long r3 = r3 >> r12
            int r5 = r5 + 1
            goto L3c
        L57:
            if (r11 != r12) goto L5e
        L59:
            if (r6 == r7) goto L5e
            int r6 = r6 + 1
            goto L22
        L5e:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC19993613Ks.equals(java.lang.Object):boolean");
    }
}
