package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS75S1000000_25;
import p2.j1;

/* JADX INFO: renamed from: X.13fc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20068213fc {
    public final AbstractC20055413dY LIZ;
    public final boolean LIZIZ;
    public final C20053713dH LIZJ;
    public final C13WG LIZLLL;
    public boolean LJ;
    public C20068213fc LJFF;
    public final int LJI;

    public final List<C20068213fc> LJIIIZ() {
        return LJI(false, true, false);
    }

    public final j1 LIZJ() {
        if (this.LJ) {
            C20068213fc c20068213fcLJIIIIZZ = LJIIIIZZ();
            if (c20068213fcLJIIIIZZ != null) {
                return c20068213fcLJIIIIZZ.LIZJ();
            }
            return null;
        }
        InterfaceC1691470u7N interfaceC1691470u7NLIZIZ = C20051513cv.LIZIZ(this.LIZJ);
        if (interfaceC1691470u7NLIZIZ == null) {
            interfaceC1691470u7NLIZIZ = this.LIZ;
        }
        return C20052513d5.LIZLLL(interfaceC1691470u7NLIZIZ, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C20068213fc LJIIIIZZ() {
        /*
            r4 = this;
            X.13fc r0 = r4.LJFF
            if (r0 == 0) goto L5
            return r0
        L5:
            boolean r0 = r4.LIZIZ
            r3 = 0
            if (r0 == 0) goto L29
            X.13dH r0 = r4.LIZJ
            X.13dH r2 = r0.LJJIJIL()
        L10:
            if (r2 == 0) goto L29
            X.13WG r0 = r2.LIZIZ()
            if (r0 == 0) goto L24
            boolean r1 = r0.LLILLL
            r0 = 1
            if (r1 != r0) goto L24
        L1d:
            boolean r0 = r4.LIZIZ
            X.13fc r0 = X.C20051513cv.LIZ(r2, r0)
            return r0
        L24:
            X.13dH r2 = r2.LJJIJIL()
            goto L10
        L29:
            X.13dH r0 = r4.LIZJ
            X.13dH r2 = r0.LJJIJIL()
        L2f:
            if (r2 == 0) goto L40
            X.13dT r1 = r2.LLJLLIL
            r0 = 8
            boolean r0 = r1.LIZLLL(r0)
            if (r0 != 0) goto L1d
            X.13dH r2 = r2.LJJIJIL()
            goto L2f
        L40:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20068213fc.LJIIIIZZ():X.13fc");
    }

    public final boolean LJIIJ() {
        return this.LIZIZ && this.LIZLLL.LLILLL;
    }

    public final boolean LJIIJJI() {
        if (!this.LJ && LJIIIZ().isEmpty()) {
            for (C20053713dH c20053713dHLJJIJIL = this.LIZJ.LJJIJIL(); c20053713dHLJJIJIL != null; c20053713dHLJJIJIL = c20053713dHLJJIJIL.LJJIJIL()) {
                C13WG c13wgLIZIZ = c20053713dHLJJIJIL.LIZIZ();
                if (c13wgLIZIZ == null || !c13wgLIZIZ.LLILLL) {
                }
            }
            return true;
        }
        return false;
    }

    public final C1683130ttv LJ() {
        C1683130ttv c1683130ttvLIZIZ;
        j1 j1VarLIZJ = LIZJ();
        return (j1VarLIZJ == null || !j1VarLIZJ.LIZLLL() || (c1683130ttvLIZIZ = C1692940u9k.LIZIZ(j1VarLIZJ)) == null) ? C1683130ttv.LJ : c1683130ttvLIZIZ;
    }

    public final C1683130ttv LJFF() {
        j1 j1VarLIZJ = LIZJ();
        return (j1VarLIZJ == null || !j1VarLIZJ.LIZLLL()) ? C1683130ttv.LJ : C1692940u9k.LIZJ(j1VarLIZJ);
    }

    public final C13WG LJII() {
        if (!LJIIJ()) {
            return this.LIZLLL;
        }
        C13WG c13wgLJFF = this.LIZLLL.LJFF();
        LJIIL(new ArrayList(), c13wgLJFF);
        return c13wgLJFF;
    }

    public final C20068213fc LIZ(C20279814Wu c20279814Wu, Function1<? super InterfaceC1692460u8y, Unit> function1) {
        int i;
        int i2;
        C13WG c13wg = new C13WG();
        c13wg.LLILLL = false;
        c13wg.LLILZ = false;
        function1.invoke(c13wg);
        C20069313fn c20069313fn = new C20069313fn(function1);
        if (c20279814Wu != null) {
            i = this.LJI;
            i2 = 1000000000;
        } else {
            i = this.LJI;
            i2 = 2000000000;
        }
        C20068213fc c20068213fc = new C20068213fc(c20069313fn, false, new C20053713dH(true, i + i2), c13wg);
        c20068213fc.LJ = true;
        c20068213fc.LJFF = this;
        return c20068213fc;
    }

    public final void LIZLLL(List list, List list2) {
        ArrayList arrayList = (ArrayList) list;
        LJIILIIL(list, false, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            C20068213fc c20068213fc = (C20068213fc) ListProtector.get(list, size2);
            if (c20068213fc.LJIIJ()) {
                list2.add(c20068213fc);
            } else if (!c20068213fc.LIZLLL.LLILZ) {
                c20068213fc.LIZLLL(list, list2);
            }
        }
    }

    public final void LJIIL(List<C20068213fc> list, C13WG c13wg) {
        if (!this.LIZLLL.LLILZ) {
            ArrayList arrayList = (ArrayList) list;
            LJIILIIL(list, false, false);
            int size = arrayList.size();
            for (int size2 = arrayList.size(); size2 < size; size2++) {
                C20068213fc c20068213fc = (C20068213fc) ListProtector.get(list, size2);
                if (!c20068213fc.LJIIJ()) {
                    c13wg.LJIIJJI(c20068213fc.LIZLLL);
                    c20068213fc.LJIIL(list, c13wg);
                }
            }
        }
    }

    public final void LIZIZ(C20053713dH c20053713dH, List<C20068213fc> list, boolean z) {
        C19968013Aw<C20053713dH> c19968013AwLJJIJLIJ = c20053713dH.LJJIJLIJ();
        C20053713dH[] c20053713dHArr = c19968013AwLJJIJLIJ.LL;
        int i = c19968013AwLJJIJLIJ.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            C20053713dH c20053713dH2 = c20053713dHArr[i2];
            if (c20053713dH2.LIZLLL() && (z || !c20053713dH2.LLLII)) {
                if (c20053713dH2.LLJLLIL.LIZLLL(8)) {
                    list.add(C20051513cv.LIZ(c20053713dH2, this.LIZIZ));
                } else {
                    LIZIZ(c20053713dH2, list, z);
                }
            }
        }
    }

    public final List<C20068213fc> LJI(boolean z, boolean z2, boolean z3) {
        if (!z && this.LIZLLL.LLILZ) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        if (LJIIJ()) {
            ArrayList arrayList2 = new ArrayList();
            LIZLLL(arrayList, arrayList2);
            return arrayList2;
        }
        return LJIILIIL(arrayList, z2, z3);
    }

    public final List<C20068213fc> LJIILIIL(List<C20068213fc> list, boolean z, boolean z2) {
        List list2;
        String str;
        if (this.LJ) {
            return C13BV.INSTANCE;
        }
        LIZIZ(this.LIZJ, list, z2);
        if (z) {
            C20279814Wu c20279814Wu = (C20279814Wu) C20069413fo.LIZ(this.LIZLLL, C1696500uFU.LJJ);
            if (c20279814Wu != null && this.LIZLLL.LLILLL && (!list.isEmpty())) {
                list.add(LIZ(c20279814Wu, new AwS604S0100000_25(c20279814Wu, 899)));
            }
            C13WG c13wg = this.LIZLLL;
            C1212320heY<List<String>> c1212320heY = C1696500uFU.LIZIZ;
            if (c13wg.LJ(c1212320heY) && (!list.isEmpty())) {
                C13WG c13wg2 = this.LIZLLL;
                if (c13wg2.LLILLL && (list2 = (List) C20069413fo.LIZ(c13wg2, c1212320heY)) != null && (str = (String) C13LP.LJJJLL(list2)) != null) {
                    ListProtector.add(list, 0, LIZ(null, new AwS75S1000000_25(str, 25)));
                }
            }
        }
        return list;
    }

    public C20068213fc(AbstractC20055413dY abstractC20055413dY, boolean z, C20053713dH c20053713dH, C13WG c13wg) {
        this.LIZ = abstractC20055413dY;
        this.LIZIZ = z;
        this.LIZJ = c20053713dH;
        this.LIZLLL = c13wg;
        this.LJI = c20053713dH.LLILLJJLI;
    }
}
