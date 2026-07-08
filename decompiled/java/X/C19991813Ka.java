package X;

import java.util.Arrays;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.13Ka, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19991813Ka<K, V> {
    public final C19991913Kb<Object, Object> LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        C19991913Kb<Object, Object> c19991913Kb = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiValueMap(map=");
        sbLIZ.append(c19991913Kb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C19991813Ka(C19991913Kb c19991913Kb) {
        this.LIZ = c19991913Kb;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C13B1 LIZLLL(X.C19991913Kb r15) {
        /*
            boolean r0 = r15.LJ()
            if (r0 == 0) goto L9
            X.13B1 r0 = X.C19968213Ay.LIZIZ
            return r0
        L9:
            X.13B1 r10 = new X.13B1
            r0 = 0
            r10.<init>(r0)
            java.lang.Object[] r9 = r15.LIZJ
            long[] r11 = r15.LIZ
            int r0 = r11.length
            int r8 = r0 + (-2)
            if (r8 < 0) goto L7e
            r7 = 0
            r6 = 0
        L1a:
            r3 = r11[r6]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r3
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r12
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L79
            int r0 = r6 - r8
            int r0 = ~r0
            int r0 = r0 >>> 31
            r13 = 8
            int r12 = 8 - r0
            r5 = 0
        L34:
            if (r5 >= r12) goto L77
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r3
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L6f
            int r0 = r6 << 3
            int r0 = r0 + r5
            r14 = r9[r0]
            boolean r0 = r14 instanceof X.C13B1
            if (r0 == 0) goto L73
            X.13B2 r14 = (X.C13B2) r14
            boolean r0 = r14.LIZLLL()
            if (r0 != 0) goto L6f
            int r2 = r10.LIZIZ
            int r0 = r14.LIZIZ
            int r2 = r2 + r0
            java.lang.Object[] r1 = r10.LIZ
            int r0 = r1.length
            if (r0 >= r2) goto L5d
            r10.LJIIL(r2, r1)
        L5d:
            java.lang.Object[] r15 = r10.LIZ
            java.lang.Object[] r2 = r14.LIZ
            int r1 = r10.LIZIZ
            int r0 = r14.LIZIZ
            java.lang.System.arraycopy(r2, r7, r15, r1, r0)
            int r1 = r10.LIZIZ
            int r0 = r14.LIZIZ
            int r1 = r1 + r0
            r10.LIZIZ = r1
        L6f:
            long r3 = r3 >> r13
            int r5 = r5 + 1
            goto L34
        L73:
            r10.LJI(r14)
            goto L6f
        L77:
            if (r12 != r13) goto L7e
        L79:
            if (r6 == r8) goto L7e
            int r6 = r6 + 1
            goto L1a
        L7e:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19991813Ka.LIZLLL(X.13Kb):X.13B1");
    }

    public final boolean equals(Object obj) {
        C19991913Kb<Object, Object> c19991913Kb = this.LIZ;
        if (!(obj instanceof C19991813Ka) || !Intrinsics.LJFF(c19991913Kb, ((C19991813Ka) obj).LIZ)) {
            return false;
        }
        return true;
    }

    public static final Object LIZIZ(C19991913Kb c19991913Kb, C20035813aO c20035813aO) {
        Object objLIZLLL = c19991913Kb.LIZLLL(c20035813aO);
        if (objLIZLLL == null) {
            return null;
        }
        if (objLIZLLL instanceof C13B1) {
            C13B1 c13b1 = (C13B1) objLIZLLL;
            if (!c13b1.LIZLLL()) {
                int i = c13b1.LIZIZ - 1;
                E eLIZIZ = c13b1.LIZIZ(i);
                c13b1.LJIIJ(i);
                if (c13b1.LIZLLL()) {
                    c19991913Kb.LJIIIZ(c20035813aO);
                }
                if (c13b1.LIZIZ == 1) {
                    c19991913Kb.LJIIJJI(c20035813aO, c13b1.LIZ());
                }
                return eLIZIZ;
            }
            throw new NoSuchElementException("List is empty.");
        }
        c19991913Kb.LJIIIZ(c20035813aO);
        return objLIZLLL;
    }

    public static final void LIZ(C19991913Kb<Object, Object> c19991913Kb, K k, V v) {
        boolean z;
        Object obj;
        int iLJII = c19991913Kb.LJII(k);
        if (iLJII < 0) {
            z = true;
            obj = null;
        } else {
            z = false;
            obj = c19991913Kb.LIZJ[iLJII];
        }
        C19719512Dh.LJI(obj);
        if (obj != null) {
            if (obj instanceof C13B1) {
                C13B1 c13b1 = (C13B1) obj;
                c13b1.LJI(v);
                v = (V) c13b1;
            } else {
                C13B1 c13b12 = new C13B1(2);
                c13b12.LJI(obj);
                c13b12.LJI(v);
                v = (V) c13b12;
            }
        }
        if (z) {
            int i = ~iLJII;
            c19991913Kb.LIZIZ[i] = k;
            c19991913Kb.LIZJ[i] = v;
            return;
        }
        c19991913Kb.LIZJ[iLJII] = v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZJ(C19991913Kb c19991913Kb, C20035813aO c20035813aO, AwS609S0100000_30 awS609S0100000_30) {
        Object objLIZLLL = c19991913Kb.LIZLLL(c20035813aO);
        if (objLIZLLL != null) {
            if (objLIZLLL instanceof C13B1) {
                C13B2 c13b2 = (C13B2) objLIZLLL;
                int i = c13b2.LIZIZ;
                Object[] objArr = c13b2.LIZ;
                int i2 = 0;
                IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, i);
                int i3 = intRangeLJIILJJIL.LL;
                int i4 = intRangeLJIILJJIL.LLILLJJLI;
                if (i3 <= i4) {
                    while (true) {
                        objArr[i3 - i2] = objArr[i3];
                        if (((Boolean) awS609S0100000_30.invoke(objArr[i3])).booleanValue()) {
                            i2++;
                        }
                        if (i3 == i4) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                Arrays.fill(objArr, i - i2, i, (Object) null);
                c13b2.LIZIZ -= i2;
                if (c13b2.LIZLLL()) {
                    c19991913Kb.LJIIIZ(c20035813aO);
                }
                if (c13b2.LIZIZ == 0) {
                    c19991913Kb.LJIIJJI(c20035813aO, c13b2.LIZ());
                    return;
                }
                return;
            }
            if (((Boolean) awS609S0100000_30.invoke(objLIZLLL)).booleanValue()) {
                c19991913Kb.LJIIIZ(c20035813aO);
            }
        }
    }
}
