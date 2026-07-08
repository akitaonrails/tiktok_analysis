package androidx.compose.foundation.lazy.layout;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C13FE;
import X.C13X4;
import X.C1676820tjk;
import X.C1682380tsi;
import X.C1686430tzF;
import X.C1686480tzK;
import X.C1689850u4l;
import X.C1689990u4z;
import X.C1690010u51;
import X.C1695970uEd;
import X.C19991913Kb;
import X.C19992013Kc;
import X.C19994113Kx;
import X.C2188811AlT;
import X.C23250099c;
import X.InterfaceC1675680thu;
import X.InterfaceC1681130tqh;
import X.InterfaceC1685750ty9;
import X.InterfaceC1689980u4y;
import X.InterfaceC1691130u6p;
import X.InterfaceC1695680uEA;
import X.InterfaceC497601wk;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class LazyLayoutItemAnimator<T extends InterfaceC1689980u4y> {
    public InterfaceC1691130u6p LIZIZ;
    public int LIZJ;
    public InterfaceC1695680uEA LJIIIZ;
    public final C19991913Kb<Object, LazyLayoutItemAnimator<T>.b> LIZ = C19992013Kc.LIZIZ();
    public final C19994113Kx<Object> LIZLLL = C13X4.LIZ();
    public final List<T> LJ = new ArrayList();
    public final List<T> LJFF = new ArrayList();
    public final List<T> LJI = new ArrayList();
    public final List<T> LJII = new ArrayList();
    public final List<C1686480tzK> LJIIIIZZ = new ArrayList();
    public final InterfaceC1685750ty9 LJIIJ = new DisplayingDisappearingItemsElement(this);

    public static final class DisplayingDisappearingItemsElement extends AbstractC1685820tyG<C1689990u4z> {
        public final LazyLayoutItemAnimator<?> LIZIZ;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayingDisappearingItemsElement) && Intrinsics.LJFF(this.LIZIZ, ((DisplayingDisappearingItemsElement) obj).LIZIZ);
        }

        public final int hashCode() {
            return this.LIZIZ.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DisplayingDisappearingItemsElement(animator=");
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // X.AbstractC1685820tyG
        public final AbstractC20055413dY LJIJI() {
            return new C1689990u4z(this.LIZIZ);
        }

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.LIZIZ = lazyLayoutItemAnimator;
        }

        @Override // X.AbstractC1685820tyG
        public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
            C1689990u4z c1689990u4z = (C1689990u4z) abstractC20055413dY;
            LazyLayoutItemAnimator<?> lazyLayoutItemAnimator = this.LIZIZ;
            if (!Intrinsics.LJFF(c1689990u4z.LLJJ, lazyLayoutItemAnimator) && c1689990u4z.LL.LLJILLL) {
                LazyLayoutItemAnimator<?> lazyLayoutItemAnimator2 = c1689990u4z.LLJJ;
                lazyLayoutItemAnimator2.LJ();
                lazyLayoutItemAnimator2.LIZIZ = null;
                lazyLayoutItemAnimator2.LIZJ = -1;
                lazyLayoutItemAnimator.LJIIIZ = c1689990u4z;
                c1689990u4z.LLJJ = lazyLayoutItemAnimator;
            }
        }
    }

    public final long LIZIZ() {
        List<C1686480tzK> list = this.LJIIIIZZ;
        int size = list.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            C1686480tzK c1686480tzK = (C1686480tzK) ListProtector.get(list, i);
            C1695970uEd c1695970uEd = c1686480tzK.LJIILIIL;
            if (c1695970uEd != null) {
                int iMax = Math.max((int) (jMax >> 32), ((int) (c1686480tzK.LJIIJJI >> 32)) + ((int) (c1695970uEd.LJIJJ >> 32)));
                jMax = (((long) Math.max((int) (jMax & 4294967295L), C1676820tjk.LIZJ(c1686480tzK.LJIIJJI) + ((int) (c1695970uEd.LJIJJ & 4294967295L)))) & 4294967295L) | (((long) iMax) << 32);
            }
        }
        return jMax;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            r15 = this;
            X.13Kb<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>$b> r1 = r15.LIZ
            int r0 = r1.LJ
            if (r0 == 0) goto L5c
            java.lang.Object[] r10 = r1.LIZJ
            long[] r9 = r1.LIZ
            int r0 = r9.length
            int r8 = r0 + (-2)
            if (r8 < 0) goto L57
            r7 = 0
        L10:
            r4 = r9[r7]
            long r0 = ~r4
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r4
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r11
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 == 0) goto L52
            int r0 = r7 - r8
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r6 = 0
        L2a:
            if (r6 >= r11) goto L50
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r4
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4c
            int r0 = r7 << 3
            int r0 = r0 + r6
            r0 = r10[r0]
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$b r0 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) r0
            X.0tzK[] r3 = r0.LIZ
            int r2 = r3.length
            r1 = 0
        L40:
            if (r1 >= r2) goto L4c
            r0 = r3[r1]
            if (r0 == 0) goto L49
            r0.LIZJ()
        L49:
            int r1 = r1 + 1
            goto L40
        L4c:
            long r4 = r4 >> r12
            int r6 = r6 + 1
            goto L2a
        L50:
            if (r11 != r12) goto L57
        L52:
            if (r7 == r8) goto L57
            int r7 = r7 + 1
            goto L10
        L57:
            X.13Kb<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>$b> r0 = r15.LIZ
            r0.LJFF()
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.LJ():void");
    }

    public final class b {
        public C1682380tsi LIZIZ;
        public int LIZJ;
        public int LIZLLL;
        public int LJFF;
        public int LJI;
        public C1686480tzK[] LIZ = C1690010u51.LIZ;
        public int LJ = 1;

        public b() {
        }

        public static void LIZIZ(b bVar, InterfaceC1689980u4y interfaceC1689980u4y, InterfaceC497601wk interfaceC497601wk, InterfaceC1681130tqh interfaceC1681130tqh, int i, int i2) {
            int iLIZJ;
            LazyLayoutItemAnimator.this.getClass();
            long jLJIIIZ = interfaceC1689980u4y.LJIIIZ(0);
            if (!interfaceC1689980u4y.LJFF()) {
                iLIZJ = C1676820tjk.LIZJ(jLJIIIZ);
            } else {
                iLIZJ = (int) (jLJIIIZ >> 32);
            }
            bVar.LIZ(interfaceC1689980u4y, interfaceC497601wk, interfaceC1681130tqh, i, i2, iLIZJ);
        }

        public final void LIZ(T t, InterfaceC497601wk interfaceC497601wk, InterfaceC1681130tqh interfaceC1681130tqh, int i, int i2, int i3) {
            C1689850u4l c1689850u4l;
            C1686480tzK[] c1686480tzKArr = this.LIZ;
            int length = c1686480tzKArr.length;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    C1686480tzK c1686480tzK = c1686480tzKArr[i4];
                    if (c1686480tzK != null && c1686480tzK.LJI) {
                        break;
                    } else {
                        i4++;
                    }
                } else {
                    this.LJFF = i;
                    this.LJI = i2;
                    break;
                }
            }
            int length2 = this.LIZ.length;
            for (int iLIZIZ = t.LIZIZ(); iLIZIZ < length2; iLIZIZ++) {
                C1686480tzK c1686480tzK2 = this.LIZ[iLIZIZ];
                if (c1686480tzK2 != null) {
                    c1686480tzK2.LIZJ();
                }
            }
            if (this.LIZ.length != t.LIZIZ()) {
                this.LIZ = (C1686480tzK[]) Arrays.copyOf(this.LIZ, t.LIZIZ());
            }
            this.LIZIZ = new C1682380tsi(t.LIZLLL());
            this.LIZJ = i3;
            this.LIZLLL = t.LJII();
            this.LJ = t.LJIILIIL();
            int iLIZIZ2 = t.LIZIZ();
            LazyLayoutItemAnimator<T> lazyLayoutItemAnimator = LazyLayoutItemAnimator.this;
            for (int i5 = 0; i5 < iLIZIZ2; i5++) {
                Object objLJIILJJIL = t.LJIILJJIL(i5);
                if ((objLJIILJJIL instanceof C1689850u4l) && (c1689850u4l = (C1689850u4l) objLJIILJJIL) != null) {
                    C1686480tzK c1686480tzK3 = this.LIZ[i5];
                    if (c1686480tzK3 == null) {
                        c1686480tzK3 = new C1686480tzK(interfaceC497601wk, interfaceC1681130tqh, new AwS569S0100000_25(lazyLayoutItemAnimator, 13));
                        this.LIZ[i5] = c1686480tzK3;
                    }
                    c1686480tzK3.LIZLLL = c1689850u4l.LLJJ;
                    c1686480tzK3.LJ = c1689850u4l.LLJJI;
                    c1686480tzK3.LJFF = c1689850u4l.LLJJIII;
                } else {
                    C1686480tzK c1686480tzK4 = this.LIZ[i5];
                    if (c1686480tzK4 != null) {
                        c1686480tzK4.LIZJ();
                    }
                    this.LIZ[i5] = null;
                }
            }
        }
    }

    public final void LJFF(Object obj) {
        C1686480tzK[] c1686480tzKArr;
        LazyLayoutItemAnimator<T>.b bVarLJIIIZ = this.LIZ.LJIIIZ(obj);
        if (bVarLJIIIZ != null && (c1686480tzKArr = bVarLJIIIZ.LIZ) != null) {
            for (C1686480tzK c1686480tzK : c1686480tzKArr) {
                if (c1686480tzK != null) {
                    c1686480tzK.LIZJ();
                }
            }
        }
    }

    public static int LJII(int[] iArr, InterfaceC1689980u4y interfaceC1689980u4y) {
        int iLJII = interfaceC1689980u4y.LJII();
        int iLJIILIIL = interfaceC1689980u4y.LJIILIIL() + iLJII;
        int iMax = 0;
        while (iLJII < iLJIILIIL) {
            int iLJI = iArr[iLJII] + interfaceC1689980u4y.LJI();
            iArr[iLJII] = iLJI;
            iMax = Math.max(iMax, iLJI);
            iLJII++;
        }
        return iMax;
    }

    public final C1686480tzK LIZ(int i, Object obj) {
        C1686480tzK[] c1686480tzKArr;
        LazyLayoutItemAnimator<T>.b bVarLIZLLL = this.LIZ.LIZLLL(obj);
        if (bVarLIZLLL != null && (c1686480tzKArr = bVarLIZLLL.LIZ) != null) {
            return c1686480tzKArr[i];
        }
        return null;
    }

    public final void LJI(T t, boolean z) {
        C1686480tzK[] c1686480tzKArr = this.LIZ.LIZLLL(t.getKey()).LIZ;
        int length = c1686480tzKArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            C1686480tzK c1686480tzK = c1686480tzKArr[i];
            int i3 = i2 + 1;
            if (c1686480tzK != null) {
                long jLJIIIZ = t.LJIIIZ(i2);
                long j = c1686480tzK.LJIIJJI;
                if (!C1676820tjk.LIZIZ(j, C1686480tzK.LJIJ) && !C1676820tjk.LIZIZ(j, jLJIIIZ)) {
                    long jLIZLLL = C1676820tjk.LIZLLL(jLJIIIZ, j);
                    InterfaceC1675680thu<C1676820tjk> interfaceC1675680thu = c1686480tzK.LJ;
                    if (interfaceC1675680thu != null) {
                        long jLIZLLL2 = C1676820tjk.LIZLLL(((C1676820tjk) ((C13FE) c1686480tzK.LJIILLIIL).getValue()).LIZ, jLIZLLL);
                        c1686480tzK.LJI(jLIZLLL2);
                        c1686480tzK.LJFF(true);
                        c1686480tzK.LJI = z;
                        C23250099c.LIZLLL(c1686480tzK.LIZ, null, null, new C1686430tzF(c1686480tzK, interfaceC1675680thu, jLIZLLL2, null), 3);
                    }
                }
                c1686480tzK.LJIIJJI = jLJIIIZ;
            }
            i++;
            i2 = i3;
        }
    }

    public static void LIZJ(InterfaceC1689980u4y interfaceC1689980u4y, int i, b bVar) {
        long jLIZ;
        int i2 = 0;
        long jLJIIIZ = interfaceC1689980u4y.LJIIIZ(0);
        if (interfaceC1689980u4y.LJFF()) {
            jLIZ = C1676820tjk.LIZ(0, i, 1, jLJIIIZ);
        } else {
            jLIZ = C1676820tjk.LIZ(i, 0, 2, jLJIIIZ);
        }
        C1686480tzK[] c1686480tzKArr = bVar.LIZ;
        int length = c1686480tzKArr.length;
        int i3 = 0;
        while (i2 < length) {
            C1686480tzK c1686480tzK = c1686480tzKArr[i2];
            int i4 = i3 + 1;
            if (c1686480tzK != null) {
                c1686480tzK.LJIIJJI = C1676820tjk.LJ(jLIZ, C1676820tjk.LIZLLL(interfaceC1689980u4y.LJIIIZ(i3), jLJIIIZ));
            }
            i2++;
            i3 = i4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(int r47, int r48, int r49, java.util.List<T> r50, X.InterfaceC1691130u6p r51, X.InterfaceC1690000u50<T> r52, boolean r53, boolean r54, int r55, boolean r56, int r57, int r58, X.InterfaceC497601wk r59, X.InterfaceC1681130tqh r60) {
        /*
            Method dump skipped, instruction units count: 1312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.LIZLLL(int, int, int, java.util.List, X.0u6p, X.0u50, boolean, boolean, int, boolean, int, int, X.01wk, X.0tqh):void");
    }
}
