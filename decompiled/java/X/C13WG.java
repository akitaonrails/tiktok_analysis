package X;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13WG, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13WG implements InterfaceC1692460u8y, Iterable<Map.Entry<? extends C1212320heY<?>, ? extends Object>>, C03W4 {
    public final C19991913Kb<C1212320heY<?>, Object> LL = C19992013Kc.LIZIZ();
    public C13KU LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C13WG LJFF() {
        /*
            r18 = this;
            X.13WG r11 = new X.13WG
            r11.<init>()
            r1 = r18
            boolean r0 = r1.LLILLL
            r11.LLILLL = r0
            boolean r0 = r1.LLILZ
            r11.LLILZ = r0
            X.13Kb<X.0heY<?>, java.lang.Object> r10 = r11.LL
            X.13Kb<X.0heY<?>, java.lang.Object> r0 = r1.LL
            r10.getClass()
            java.lang.Object[] r9 = r0.LIZIZ
            java.lang.Object[] r8 = r0.LIZJ
            long[] r7 = r0.LIZ
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L5d
            r5 = 0
        L22:
            r3 = r7[r5]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r3
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r12
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L58
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r13 = 8
            int r12 = 8 - r0
            r2 = 0
        L3c:
            if (r2 >= r12) goto L56
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r16 & r3
            r14 = 128(0x80, double:6.3E-322)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 >= 0) goto L52
            int r0 = r5 << 3
            int r0 = r0 + r2
            r1 = r9[r0]
            r0 = r8[r0]
            r10.LJIIJJI(r1, r0)
        L52:
            long r3 = r3 >> r13
            int r2 = r2 + 1
            goto L3c
        L56:
            if (r12 != r13) goto L5d
        L58:
            if (r5 == r6) goto L5d
            int r5 = r5 + 1
            goto L22
        L5d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13WG.LJFF():X.13WG");
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<? extends C1212320heY<?>, ? extends Object>> iterator() {
        C13KU c13ku = this.LLILLJJLI;
        if (c13ku == null) {
            C19991913Kb<C1212320heY<?>, Object> c19991913Kb = this.LL;
            c19991913Kb.getClass();
            c13ku = new C13KU(c19991913Kb);
            this.LLILLJJLI = c13ku;
        }
        return ((C13KV) c13ku.entrySet()).iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0077 A[PHI: r14
      0x0077: PHI (r14v4 java.lang.String) = (r14v3 java.lang.String), (r14v5 java.lang.String) binds: [B:12:0x003e, B:19:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r20 = this;
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r11 = r20
            boolean r0 = r11.LLILLL
            java.lang.String r19 = ", "
            if (r0 == 0) goto L7c
            java.lang.String r0 = "mergeDescendants=true"
            r9.append(r0)
            r14 = r19
        L14:
            boolean r0 = r11.LLILZ
            if (r0 == 0) goto L22
            r9.append(r14)
            java.lang.String r0 = "isClearingSemantics=true"
            r9.append(r0)
            r14 = r19
        L22:
            X.13Kb<X.0heY<?>, java.lang.Object> r0 = r11.LL
            java.lang.Object[] r12 = r0.LIZIZ
            java.lang.Object[] r10 = r0.LIZJ
            long[] r8 = r0.LIZ
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L7f
            r6 = 0
        L30:
            r4 = r8[r6]
            long r0 = ~r4
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r4
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r15
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r2 == 0) goto L77
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r13 = 8
            int r3 = 8 - r0
            r2 = 0
        L4a:
            if (r2 >= r3) goto L75
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r17 & r4
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L71
            int r1 = r6 << 3
            int r1 = r1 + r2
            r0 = r12[r1]
            r1 = r10[r1]
            X.0heY r0 = (X.C1212320heY) r0
            r9.append(r14)
            java.lang.String r0 = r0.LIZ
            r9.append(r0)
            java.lang.String r0 = " : "
            r9.append(r0)
            r9.append(r1)
            r14 = r19
        L71:
            long r4 = r4 >> r13
            int r2 = r2 + 1
            goto L4a
        L75:
            if (r3 != r13) goto L7f
        L77:
            if (r6 == r7) goto L7f
            int r6 = r6 + 1
            goto L30
        L7c:
            java.lang.String r14 = ""
            goto L14
        L7f:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = X.C1953007ku.LIZ(r11)
            r1.append(r0)
            java.lang.String r0 = "{ "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " }"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13WG.toString():java.lang.String");
    }

    public final <T> boolean LJ(C1212320heY<T> c1212320heY) {
        return this.LL.LIZIZ(c1212320heY);
    }

    public final <T> T LJIIIIZZ(C1212320heY<T> c1212320heY) {
        T t = (T) this.LL.LIZLLL(c1212320heY);
        if (t != null) {
            return t;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Key not present: ");
        sbLIZ.append(c1212320heY);
        sbLIZ.append(" - consider getOrElse or getOrNull");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIIJJI(C13WG c13wg) {
        C19991913Kb<C1212320heY<?>, Object> c19991913Kb = c13wg.LL;
        Object[] objArr = c19991913Kb.LIZIZ;
        Object[] objArr2 = c19991913Kb.LIZJ;
        long[] jArr = c19991913Kb.LIZ;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            C1212320heY<?> c1212320heY = (C1212320heY) obj;
                            Object objInvoke = c1212320heY.LIZIZ.invoke(this.LL.LIZLLL(c1212320heY), objArr2[i4]);
                            if (objInvoke != null) {
                                this.LL.LJIIJJI(c1212320heY, objInvoke);
                            }
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13WG)) {
            return false;
        }
        C13WG c13wg = (C13WG) obj;
        if (Intrinsics.LJFF(this.LL, c13wg.LL) && this.LLILLL == c13wg.LLILLL && this.LLILZ == c13wg.LLILZ) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1692460u8y
    public final <T> void LIZJ(C1212320heY<T> c1212320heY, T t) {
        if ((t instanceof C1697110uGT) && LJ(c1212320heY)) {
            C1697110uGT c1697110uGT = (C1697110uGT) this.LL.LIZLLL(c1212320heY);
            C19991913Kb<C1212320heY<?>, Object> c19991913Kb = this.LL;
            C1697110uGT c1697110uGT2 = (C1697110uGT) t;
            String str = c1697110uGT2.LIZ;
            if (str == null) {
                str = c1697110uGT.LIZ;
            }
            InterfaceC1451105m9 interfaceC1451105m9 = c1697110uGT2.LIZIZ;
            if (interfaceC1451105m9 == null) {
                interfaceC1451105m9 = c1697110uGT.LIZIZ;
            }
            c19991913Kb.LJIIJJI(c1212320heY, new C1697110uGT(str, interfaceC1451105m9));
            return;
        }
        this.LL.LJIIJJI(c1212320heY, t);
    }

    public final <T> T LJIIIZ(C1212320heY<T> c1212320heY, Function0<? extends T> function0) {
        T t = (T) this.LL.LIZLLL(c1212320heY);
        if (t == null) {
            return function0.invoke();
        }
        return t;
    }
}
