package androidx.compose.runtime;

import X.C13Y2;
import X.C13Y6;
import X.C13Z3;
import X.C13Z6;
import X.C13Z7;
import X.C13ZA;
import X.C13ZD;
import X.C13ZE;
import X.C13ZG;
import X.C13ZI;
import X.C13ZV;
import X.C1680510tph;
import X.C1865570yeB;
import X.C20029713Yp;
import X.C20030013Ys;
import X.C20034413aA;
import X.C20034913aF;
import X.C20035013aG;
import X.C2188811AlT;
import X.InterfaceC1680500tpg;
import X.InterfaceC20030213Yu;
import X.InterfaceC20032213Zo;
import X.InterfaceC20035413aK;
import X.InterfaceC20036013aQ;
import Y.AComparatorS49S0000000_30;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class s {
    public static final C1865570yeB LIZ;
    public static final C1865570yeB LIZIZ;
    public static final C1865570yeB LIZJ;
    public static final C1865570yeB LIZLLL;
    public static final C1865570yeB LJ;
    public static final AComparatorS49S0000000_30 LJFF = new AComparatorS49S0000000_30(1);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0yeB] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0yeB] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0yeB] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0yeB] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.0yeB] */
    static {
        final String str = "provider";
        LIZ = new Object(str) { // from class: X.0yeB
            public final String LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1865570yeB) && Intrinsics.LJFF(this.LIZ, ((C1865570yeB) obj).LIZ);
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            {
                this.LIZ = str;
            }
        };
        LIZIZ = new Object(str) { // from class: X.0yeB
            public final String LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1865570yeB) && Intrinsics.LJFF(this.LIZ, ((C1865570yeB) obj).LIZ);
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            {
                this.LIZ = str;
            }
        };
        final String str2 = "compositionLocalMap";
        LIZJ = new Object(str2) { // from class: X.0yeB
            public final String LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1865570yeB) && Intrinsics.LJFF(this.LIZ, ((C1865570yeB) obj).LIZ);
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            {
                this.LIZ = str2;
            }
        };
        final String str3 = "providers";
        LIZLLL = new Object(str3) { // from class: X.0yeB
            public final String LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1865570yeB) && Intrinsics.LJFF(this.LIZ, ((C1865570yeB) obj).LIZ);
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            {
                this.LIZ = str3;
            }
        };
        final String str4 = "reference";
        LJ = new Object(str4) { // from class: X.0yeB
            public final String LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1865570yeB) && Intrinsics.LJFF(this.LIZ, ((C1865570yeB) obj).LIZ);
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            {
                this.LIZ = str4;
            }
        };
    }

    public static final void LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (");
        sbLIZ.append(str);
        sbLIZ.append("). Please report to Google or use https://goo.gle/compose-feedback");
        throw new C13Y6(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Void LIZLLL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (");
        sbLIZ.append(str);
        sbLIZ.append("). Please report to Google or use https://goo.gle/compose-feedback");
        throw new C13Y6(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJ(C13ZE c13ze, C13ZG c13zg) {
        int iLJIIJJI;
        int[] iArr = c13ze.LIZIZ;
        int i = c13ze.LJIJI;
        int iLJ = c13ze.LJ(c13ze.LJIILIIL(i + c13ze.LJIILL(i)), iArr);
        for (int iLJ2 = c13ze.LJ(c13ze.LJIILIIL(c13ze.LJIJI), c13ze.LIZIZ); iLJ2 < iLJ; iLJ2++) {
            Object obj = c13ze.LIZJ[c13ze.LJFF(iLJ2)];
            int iLJIIJ = -1;
            if (obj instanceof InterfaceC20035413aK) {
                c13zg.LJFF(c13ze.LJIIJJI() - iLJ2, -1, -1, obj);
            } else if (obj instanceof C20034913aF) {
                C20034913aF c20034913aF = (C20034913aF) obj;
                if (!(c20034913aF.LIZ instanceof InterfaceC20036013aQ)) {
                    LJIIIZ(c13ze, iLJ2, obj);
                    int iLJIIJJI2 = c13ze.LJIIJJI() - iLJ2;
                    C13Z7 c13z7 = c20034913aF.LIZIZ;
                    if (c13z7 != null && c13z7.LIZ()) {
                        iLJIIJ = c13z7.LIZ;
                        if (iLJIIJ < 0) {
                            iLJIIJ += c13ze.LJIIJ();
                        }
                        iLJIIJJI = c13ze.LJIIJJI() - c13ze.LJJIL(iLJIIJ);
                    } else {
                        iLJIIJJI = -1;
                    }
                    c13zg.LJFF(iLJIIJJI2, iLJIIJ, iLJIIJJI, c20034913aF);
                }
            } else if (obj instanceof C20030013Ys) {
                LJIIIZ(c13ze, iLJ2, obj);
                ((C20030013Ys) obj).LIZJ();
            }
        }
    }

    public static final int LJI(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iLJI = Intrinsics.LJI(((C20035013aG) ListProtector.get(list, i3)).LIZIZ, i);
            if (iLJI < 0) {
                i2 = i3 + 1;
            } else if (iLJI > 0) {
                size = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static final void LJIIIIZZ(C13ZE c13ze, C13ZG c13zg) {
        int iLJIIJ;
        int iLJIIJJI;
        int[] iArr = c13ze.LIZIZ;
        int i = c13ze.LJIJI;
        int iLJ = c13ze.LJ(c13ze.LJIILIIL(i + c13ze.LJIILL(i)), iArr);
        for (int iLJ2 = c13ze.LJ(c13ze.LJIILIIL(c13ze.LJIJI), c13ze.LIZIZ); iLJ2 < iLJ; iLJ2++) {
            Object obj = c13ze.LIZJ[c13ze.LJFF(iLJ2)];
            if (obj instanceof InterfaceC20035413aK) {
                c13zg.LJI((InterfaceC20035413aK) obj, c13ze.LJIIJJI() - iLJ2);
            }
            if (obj instanceof C20034913aF) {
                int iLJIIJJI2 = c13ze.LJIIJJI() - iLJ2;
                C20034913aF c20034913aF = (C20034913aF) obj;
                C13Z7 c13z7 = c20034913aF.LIZIZ;
                if (c13z7 != null && c13z7.LIZ()) {
                    iLJIIJ = c13z7.LIZ;
                    if (iLJIIJ < 0) {
                        iLJIIJ += c13ze.LJIIJ();
                    }
                    iLJIIJJI = c13ze.LJIIJJI() - c13ze.LJJIL(iLJIIJ);
                } else {
                    iLJIIJ = -1;
                    iLJIIJJI = -1;
                }
                c13zg.LJFF(iLJIIJJI2, iLJIIJ, iLJIIJJI, c20034913aF);
            }
            if (obj instanceof C20030013Ys) {
                ((C20030013Ys) obj).LIZJ();
            }
        }
        c13ze.LJJIIZI();
    }

    public static final void LIZ(int i, int i2, List list) {
        int iLJI = LJI(i, list);
        if (iLJI < 0) {
            iLJI = -(iLJI + 1);
        }
        while (iLJI < ((ArrayList) list).size() && ((C20035013aG) ListProtector.get(list, iLJI)).LIZIZ < i2) {
            ListProtector.remove(list, iLJI);
        }
    }

    public static final void LIZIZ(C13ZD c13zd, List<Object> list, int i) {
        if (c13zd.LJIIIZ(i)) {
            ((ArrayList) list).add(c13zd.LJIIJJI(i));
            return;
        }
        int iLJIIIIZZ = i + 1;
        int iLJIIIIZZ2 = i + c13zd.LJIIIIZZ(i);
        while (iLJIIIIZZ < iLJIIIIZZ2) {
            LIZIZ(c13zd, list, iLJIIIIZZ);
            iLJIIIIZZ += c13zd.LJIIIIZZ(iLJIIIIZZ);
        }
    }

    public static final Object LJII(Object obj, Object obj2, Object obj3) {
        C20034413aA c20034413aA;
        if (!(obj instanceof C20034413aA) || (c20034413aA = (C20034413aA) obj) == null) {
            return null;
        }
        if ((Intrinsics.LJFF(c20034413aA.LIZ, obj2) && Intrinsics.LJFF(c20034413aA.LIZIZ, obj3)) || (obj = LJII(c20034413aA.LIZ, obj2, obj3)) != null) {
            return obj;
        }
        return LJII(c20034413aA.LIZIZ, obj2, obj3);
    }

    public static final void LJIIIZ(C13ZE c13ze, int i, Object obj) {
        int iLJFF = c13ze.LJFF(i);
        Object[] objArr = c13ze.LIZJ;
        Object obj2 = objArr[iLJFF];
        InterfaceC1680500tpg.LIZ.getClass();
        objArr[iLJFF] = C1680510tph.LIZIZ;
        if (obj != obj2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Slot table is out of sync (expected ");
            sbLIZ.append(obj);
            sbLIZ.append(", got ");
            sbLIZ.append(obj2);
            sbLIZ.append(')');
            LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final C13Z6 LJFF(final C13Y2 c13y2, final C13Z3 c13z3, C13ZE c13ze, InterfaceC20032213Zo<?> interfaceC20032213Zo) {
        int length;
        Object obj;
        int iLJJII;
        int iLJJII2;
        C13ZI c13zi = new C13ZI();
        if (c13ze.LJ != null) {
            c13zi.LJ();
        }
        if (c13ze.LJFF != null) {
            c13zi.LLJIJIL = new C20029713Yp<>(6);
        }
        int i = c13ze.LJIJI;
        if (interfaceC20032213Zo != null && c13ze.LJJII(i) > 0) {
            int iLJJIII = c13ze.LJIJJLI;
            while (true) {
                if (iLJJIII > 0) {
                    if (c13ze.LJIJI(iLJJIII)) {
                        break;
                    }
                    iLJJIII = c13ze.LJJIII(iLJJIII);
                } else if (iLJJIII >= 0) {
                    break;
                }
            }
            if (c13ze.LJIJI(iLJJIII)) {
                Object objLJJIFFI = c13ze.LJJIFFI(iLJJIII);
                int i2 = iLJJIII + 1;
                int iLJIILL = iLJJIII + c13ze.LJIILL(iLJJIII);
                int i3 = 0;
                while (i2 < iLJIILL) {
                    int iLJIILL2 = c13ze.LJIILL(i2) + i2;
                    if (iLJIILL2 > i) {
                        break;
                    }
                    if (c13ze.LJIJI(i2)) {
                        iLJJII2 = 1;
                    } else {
                        iLJJII2 = c13ze.LJJII(i2);
                    }
                    i3 += iLJJII2;
                    i2 = iLJIILL2;
                }
                if (c13ze.LJIJI(i)) {
                    iLJJII = 1;
                } else {
                    iLJJII = c13ze.LJJII(i);
                }
                interfaceC20032213Zo.LJIIIIZZ(objLJJIFFI);
                interfaceC20032213Zo.LIZLLL(i3, iLJJII);
                interfaceC20032213Zo.LJFF();
            }
        }
        C13ZE c13zeLJIIIIZZ = c13zi.LJIIIIZZ();
        try {
            c13zeLJIIIIZZ.LIZJ();
            c13zeLJIIIIZZ.LJJJI(126665345, c13z3.LIZ);
            C13ZE.LJIJJ(c13zeLJIIIIZZ);
            c13zeLJIIIIZZ.LJJJJI(c13z3.LIZIZ);
            List listLJJI = c13ze.LJJI(c13z3.LJ, c13zeLJIIIIZZ);
            c13zeLJIIIIZZ.LJJIJIIJIL();
            c13zeLJIIIIZZ.LJI();
            c13zeLJIIIIZZ.LJII();
            c13zeLJIIIIZZ.LIZLLL(true);
            C13Z6 c13z6 = new C13Z6(c13zi);
            if (!listLJJI.isEmpty()) {
                int size = listLJJI.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        break;
                    }
                    C13Z7 c13z7 = (C13Z7) ListProtector.get(listLJJI, i4);
                    if (c13zi.LJIIIZ(c13z7)) {
                        int iLIZJ = c13zi.LIZJ(c13z7);
                        int iLIZJ2 = C13ZA.LIZJ(iLIZJ, c13zi.LL);
                        int i5 = iLIZJ + 1;
                        if (i5 < c13zi.LLILLJJLI) {
                            length = c13zi.LL[(i5 * 5) + 4];
                        } else {
                            length = c13zi.LLILLL.length;
                        }
                        if (length - iLIZJ2 > 0) {
                            obj = c13zi.LLILLL[iLIZJ2];
                        } else {
                            InterfaceC1680500tpg.LIZ.getClass();
                            obj = C1680510tph.LIZIZ;
                        }
                        if (obj instanceof C20030013Ys) {
                            InterfaceC20030213Yu interfaceC20030213Yu = new InterfaceC20030213Yu() { // from class: X.13Yt
                                @Override // X.InterfaceC20030213Yu
                                public final void LIZLLL(Object obj2) {
                                }

                                @Override // X.InterfaceC20030213Yu
                                public final void LJIILL() {
                                }

                                @Override // X.InterfaceC20030213Yu
                                public final EnumC1783020wV2 LIZIZ(C20030013Ys c20030013Ys, Object obj2) {
                                    EnumC1783020wV2 enumC1783020wV2LIZIZ;
                                    InterfaceC20030213Yu interfaceC20030213Yu2;
                                    C13Y2 c13y22 = c13y2;
                                    if (!(c13y22 instanceof InterfaceC20030213Yu) || (interfaceC20030213Yu2 = (InterfaceC20030213Yu) c13y22) == null || (enumC1783020wV2LIZIZ = interfaceC20030213Yu2.LIZIZ(c20030013Ys, obj2)) == null) {
                                        enumC1783020wV2LIZIZ = EnumC1783020wV2.IGNORED;
                                    }
                                    if (enumC1783020wV2LIZIZ == EnumC1783020wV2.IGNORED) {
                                        C13Z3 c13z32 = c13z3;
                                        c13z32.LJFF = C13LP.LJLILLLLZI(new Pair(c20030013Ys, obj2), c13z32.LJFF);
                                        return EnumC1783020wV2.SCHEDULED;
                                    }
                                    return enumC1783020wV2LIZIZ;
                                }
                            };
                            c13zeLJIIIIZZ = c13zi.LJIIIIZZ();
                            try {
                                C13ZV.LIZ(c13zeLJIIIIZZ, listLJJI, interfaceC20030213Yu);
                                c13zeLJIIIIZZ.LIZLLL(true);
                                break;
                            } finally {
                            }
                        }
                    }
                    i4++;
                }
            }
            return c13z6;
        } finally {
        }
    }
}
