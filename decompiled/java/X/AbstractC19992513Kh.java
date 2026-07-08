package X;

import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.13Kh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19992513Kh<E> {
    public long[] LIZ = C19992013Kc.LIZ;
    public Object[] LIZIZ = C830540Wi4.LIZJ;
    public long[] LIZJ = C19992613Ki.LIZ;
    public int LIZLLL = Integer.MAX_VALUE;
    public int LJ = Integer.MAX_VALUE;
    public int LJFF;
    public int LJI;

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
            int r0 = r10.LJFF
            int r16 = r0 * 31
            int r0 = r10.LJI
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
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC19992513Kh.hashCode():int");
    }

    public final String toString() {
        AwS609S0100000_30 awS609S0100000_30 = new AwS609S0100000_30(this, 136);
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) e3.e);
        Object[] objArr = this.LIZIZ;
        long[] jArr = this.LIZJ;
        int i = this.LJ;
        int i2 = 0;
        while (true) {
            if (i == Integer.MAX_VALUE) {
                sb.append((CharSequence) e3.f);
                break;
            }
            int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) awS609S0100000_30.invoke(obj));
            i2++;
            i = i3;
        }
        return sb.toString();
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
            boolean r0 = r10 instanceof X.AbstractC19992513Kh
            r15 = 0
            if (r0 != 0) goto Lf
            return r15
        Lf:
            X.13Kh r10 = (X.AbstractC19992513Kh) r10
            int r1 = r10.LJI
            int r0 = r2.LJI
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
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC19992513Kh.equals(java.lang.Object):boolean");
    }
}
