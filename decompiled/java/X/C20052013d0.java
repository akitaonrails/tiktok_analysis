package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Comparator;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13d0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20052013d0 {
    public final C20053713dH LIZ;
    public final C20049613cc LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public final C20051813cy LJ;
    public final C19968013Aw<InterfaceC20052313d3> LJFF;
    public final long LJI;
    public final C19968013Aw<C20052213d2> LJII;
    public C1682380tsi LJIIIIZZ;

    public final void LIZLLL() {
        C19968013Aw<C20052213d2> c19968013Aw = this.LJII;
        int i = c19968013Aw.LLILLL;
        if (i != 0) {
            C20052213d2[] c20052213d2Arr = c19968013Aw.LL;
            for (int i2 = 0; i2 < i; i2++) {
                C20052213d2 c20052213d2 = c20052213d2Arr[i2];
                if (c20052213d2.LIZ.LIZLLL()) {
                    if (c20052213d2.LIZIZ) {
                        C20053713dH.LJJJZ(c20052213d2.LIZ, c20052213d2.LIZJ, 2);
                    } else {
                        C20053713dH.LJJLI(c20052213d2.LIZ, c20052213d2.LIZJ, 2);
                    }
                }
            }
            this.LJII.LJIIIZ();
        }
    }

    public final void LJIIL() {
        if (this.LIZIZ.LIZIZ()) {
            if (!this.LIZ.LIZLLL()) {
                C1696250uF5.LIZ("performMeasureAndLayout called with unattached root");
            }
            if (!this.LIZ.LJIJJ()) {
                C1696250uF5.LIZ("performMeasureAndLayout called with unplaced root");
            }
            if (!(!this.LIZJ)) {
                C1696250uF5.LIZ("performMeasureAndLayout called during measure layout");
            }
            if (this.LJIIIIZZ != null) {
                this.LIZJ = true;
                this.LIZLLL = false;
                try {
                    if (!isEmpty()) {
                        C20053713dH c20053713dH = this.LIZ;
                        if (c20053713dH.LLIZLLLIL != null) {
                            LJIILL(c20053713dH, true);
                        } else {
                            LJIILJJIL(c20053713dH);
                        }
                    }
                    LJIILL(this.LIZ, false);
                    this.LIZJ = false;
                    this.LIZLLL = false;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZJ = false;
                    this.LIZLLL = false;
                    throw th;
                }
            }
        }
    }

    public C20052013d0(C20053713dH c20053713dH) {
        this.LIZ = c20053713dH;
        InterfaceC20055013dU.LJLIIL.getClass();
        this.LIZIZ = new C20049613cc();
        this.LJ = new C20051813cy();
        this.LJFF = new C19968013Aw<>(new InterfaceC20052313d3[16]);
        this.LJI = 1L;
        this.LJII = new C19968013Aw<>(new C20052213d2[16]);
    }

    public static boolean LJII(C20053713dH c20053713dH) {
        EnumC20047813cK enumC20047813cK;
        if (!c20053713dH.LJJIJ()) {
            return false;
        }
        do {
            if (!LJIIIIZZ(c20053713dH)) {
                C20053713dH c20053713dHLJJIJIL = c20053713dH.LJJIJIL();
                if (c20053713dHLJJIJIL != null) {
                    enumC20047813cK = c20053713dHLJJIJIL.LLJLLL.LIZLLL;
                } else {
                    enumC20047813cK = null;
                }
                if (enumC20047813cK != EnumC20047813cK.Measuring) {
                    return false;
                }
            }
            c20053713dH = c20053713dH.LJJIJIL();
            if (c20053713dH == null) {
                return false;
            }
        } while (!c20053713dH.LJIJJ());
        return true;
    }

    public static boolean LJIIIIZZ(C20053713dH c20053713dH) {
        C20053813dI c20053813dI = c20053713dH.LLJLLL.LJIILL;
        if (c20053813dI.LLJILJIL != EnumC20038113al.InMeasureBlock && !c20053813dI.LLJJJJLIIL.LJFF()) {
            return false;
        }
        return true;
    }

    public static boolean LJIIIZ(C20053713dH c20053713dH) {
        C20053613dG c20053613dG;
        C20050513cl c20050513cl;
        if (c20053713dH.LJJIJIIJI() == EnumC20038113al.InMeasureBlock || ((c20053613dG = c20053713dH.LLJLLL.LJIILLIIL) != null && (c20050513cl = c20053613dG.LLJJIJIIJIL) != null && c20050513cl.LJFF())) {
            return true;
        }
        return false;
    }

    public final void LIZ(boolean z) {
        if (z) {
            C20051813cy c20051813cy = this.LJ;
            C20053713dH c20053713dH = this.LIZ;
            c20051813cy.LIZ.LJIIIZ();
            c20051813cy.LIZ.LIZLLL(c20053713dH);
            c20053713dH.LLLI = true;
        }
        C20051813cy c20051813cy2 = this.LJ;
        c20051813cy2.LIZ.LJIIZILJ(new Comparator<C20053713dH>() { // from class: X.13ce
            @Override // java.util.Comparator
            public final int compare(C20053713dH c20053713dH2, C20053713dH c20053713dH3) {
                C20053713dH c20053713dH4 = c20053713dH2;
                C20053713dH c20053713dH5 = c20053713dH3;
                int iLJI = Intrinsics.LJI(c20053713dH5.LLJJI, c20053713dH4.LLJJI);
                if (iLJI == 0) {
                    return Intrinsics.LJI(c20053713dH4.hashCode(), c20053713dH5.hashCode());
                }
                return iLJI;
            }
        });
        int i = c20051813cy2.LIZ.LLILLL;
        C20053713dH[] c20053713dHArr = c20051813cy2.LIZIZ;
        if (c20053713dHArr == null || c20053713dHArr.length < i) {
            c20053713dHArr = new C20053713dH[Math.max(16, i)];
        }
        c20051813cy2.LIZIZ = null;
        for (int i2 = 0; i2 < i; i2++) {
            c20053713dHArr[i2] = c20051813cy2.LIZ.LL[i2];
        }
        c20051813cy2.LIZ.LJIIIZ();
        for (int i3 = i - 1; -1 < i3; i3--) {
            C20053713dH c20053713dH2 = c20053713dHArr[i3];
            if (c20053713dH2.LLLI) {
                C20051813cy.LIZ(c20053713dH2);
            }
        }
        c20051813cy2.LIZIZ = c20053713dHArr;
    }

    public final void LJ(C20053713dH c20053713dH) {
        C19968013Aw<C20053713dH> c19968013AwLJJIL = c20053713dH.LJJIL();
        C20053713dH[] c20053713dHArr = c19968013AwLJJIL.LL;
        int i = c19968013AwLJJIL.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            C20053713dH c20053713dH2 = c20053713dHArr[i2];
            if (Intrinsics.LJFF(c20053713dH2.LJJJJJL(), Boolean.TRUE) && !c20053713dH2.LLLII) {
                if (this.LIZIZ.LIZ.LIZIZ(c20053713dH2)) {
                    c20053713dH2.LJJJJL();
                }
                LJ(c20053713dH2);
            }
        }
    }

    public final boolean LJIIJ(AwS574S0100000_30 awS574S0100000_30) {
        boolean z;
        C20049513cb c20049513cb;
        if (!this.LIZ.LIZLLL()) {
            C1696250uF5.LIZ("performMeasureAndLayout called with unattached root");
        }
        if (!this.LIZ.LJIJJ()) {
            C1696250uF5.LIZ("performMeasureAndLayout called with unplaced root");
        }
        if (!(!this.LIZJ)) {
            C1696250uF5.LIZ("performMeasureAndLayout called during measure layout");
        }
        if (this.LJIIIIZZ != null) {
            this.LIZJ = true;
            this.LIZLLL = true;
            try {
                if (this.LIZIZ.LIZIZ()) {
                    C20049613cc c20049613cc = this.LIZIZ;
                    z = false;
                    while (c20049613cc.LIZIZ()) {
                        boolean z2 = !c20049613cc.LIZ.LIZJ.isEmpty();
                        if (z2) {
                            c20049513cb = c20049613cc.LIZ;
                        } else {
                            c20049513cb = c20049613cc.LIZIZ;
                        }
                        C20053713dH c20053713dHLIZJ = c20049513cb.LIZJ();
                        boolean zLJIILIIL = LJIILIIL(c20053713dHLIZJ, z2, true);
                        if (c20053713dHLIZJ == this.LIZ && zLJIILIIL) {
                            z = true;
                        }
                    }
                    if (awS574S0100000_30 != null) {
                        awS574S0100000_30.invoke();
                    }
                } else {
                    z = false;
                }
                this.LIZJ = false;
                this.LIZLLL = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZJ = false;
                this.LIZLLL = false;
                throw th;
            }
        } else {
            z = false;
        }
        C19968013Aw<InterfaceC20052313d3> c19968013Aw = this.LJFF;
        InterfaceC20052313d3[] interfaceC20052313d3Arr = c19968013Aw.LL;
        int i = c19968013Aw.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC20052313d3Arr[i2].LIZ();
        }
        this.LJFF.LJIIIZ();
        return z;
    }

    public final void LJIILJJIL(C20053713dH c20053713dH) {
        C19968013Aw<C20053713dH> c19968013AwLJJIL = c20053713dH.LJJIL();
        C20053713dH[] c20053713dHArr = c19968013AwLJJIL.LL;
        int i = c19968013AwLJJIL.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            C20053713dH c20053713dH2 = c20053713dHArr[i2];
            if (LJIIIIZZ(c20053713dH2)) {
                if (C20052113d1.LIZ(c20053713dH2)) {
                    LJIILL(c20053713dH2, true);
                } else {
                    LJIILJJIL(c20053713dH2);
                }
            }
        }
    }

    public final void LJIIZILJ(long j) {
        C1682380tsi c1682380tsi = this.LJIIIIZZ;
        boolean z = false;
        if (c1682380tsi == null || !C1682380tsi.LIZJ(c1682380tsi.LIZ, j)) {
            if (!(!this.LIZJ)) {
                C1696250uF5.LIZ("updateRootConstraints called while measuring");
            }
            this.LJIIIIZZ = new C1682380tsi(j);
            C20053713dH c20053713dH = this.LIZ;
            C20053713dH c20053713dH2 = c20053713dH.LLIZLLLIL;
            if (c20053713dH2 != null) {
                c20053713dH.LLJLLL.LJ = true;
            }
            c20053713dH.LLJLLL.LJIILL.LLJJJIL = true;
            C20049613cc c20049613cc = this.LIZIZ;
            if (c20053713dH2 != null) {
                z = true;
            }
            c20049613cc.LIZ(c20053713dH, z);
        }
    }

    public static boolean LIZIZ(C20053713dH c20053713dH, C1682380tsi c1682380tsi) {
        boolean zLJLILLLLZI;
        C1682380tsi c1682380tsi2;
        if (c20053713dH.LLIZLLLIL == null) {
            return false;
        }
        if (c1682380tsi != null) {
            zLJLILLLLZI = c20053713dH.LLJLLL.LJIILLIIL.LJLILLLLZI(c1682380tsi.LIZ);
        } else {
            C20053613dG c20053613dG = c20053713dH.LLJLLL.LJIILLIIL;
            if (c20053613dG != null && (c1682380tsi2 = c20053613dG.LLJILLL) != null) {
                zLJLILLLLZI = c20053613dG.LJLILLLLZI(c1682380tsi2.LIZ);
            } else {
                zLJLILLLLZI = false;
            }
        }
        C20053713dH c20053713dHLJJIJIL = c20053713dH.LJJIJIL();
        if (zLJLILLLLZI && c20053713dHLJJIJIL != null) {
            if (c20053713dHLJJIJIL.LLIZLLLIL == null) {
                C20053713dH.LJJLI(c20053713dHLJJIJIL, false, 3);
            } else {
                if (c20053713dH.LJJIJIIJI() == EnumC20038113al.InMeasureBlock) {
                    C20053713dH.LJJJZ(c20053713dHLJJIJIL, false, 3);
                    return zLJLILLLLZI;
                }
                if (c20053713dH.LJJIJIIJI() == EnumC20038113al.InLayoutBlock) {
                    c20053713dHLJJIJIL.LJJJLZIJ(false);
                    return zLJLILLLLZI;
                }
            }
        }
        return zLJLILLLLZI;
    }

    public static boolean LIZJ(C20053713dH c20053713dH, C1682380tsi c1682380tsi) {
        boolean zLJLJJLL;
        if (c1682380tsi != null) {
            if (c20053713dH.LLJLIL == EnumC20038113al.NotUsed) {
                c20053713dH.LJIJ();
            }
            zLJLJJLL = c20053713dH.LLJLLL.LJIILL.LJLJJLL(c1682380tsi.LIZ);
        } else {
            C20053813dI c20053813dI = c20053713dH.LLJLLL.LJIILL;
            if (c20053813dI.LLJI) {
                C1682380tsi c1682380tsi2 = new C1682380tsi(c20053813dI.LLILZ);
                if (c20053713dH.LLJLIL == EnumC20038113al.NotUsed) {
                    c20053713dH.LJIJ();
                }
                zLJLJJLL = c20053713dH.LLJLLL.LJIILL.LJLJJLL(c1682380tsi2.LIZ);
            } else {
                zLJLJJLL = false;
            }
        }
        C20053713dH c20053713dHLJJIJIL = c20053713dH.LJJIJIL();
        if (zLJLJJLL && c20053713dHLJJIJIL != null) {
            EnumC20038113al enumC20038113al = c20053713dH.LLJLLL.LJIILL.LLJILJIL;
            if (enumC20038113al == EnumC20038113al.InMeasureBlock) {
                C20053713dH.LJJLI(c20053713dHLJJIJIL, false, 3);
            } else if (enumC20038113al == EnumC20038113al.InLayoutBlock) {
                c20053713dHLJJIJIL.LJJL(false);
                return zLJLJJLL;
            }
        }
        return zLJLJJLL;
    }

    public final void LJFF(C20053713dH c20053713dH, boolean z) {
        boolean zLJJIJ;
        if (!this.LIZJ) {
            C1696250uF5.LIZIZ("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z) {
            zLJJIJ = c20053713dH.LLJLLL.LJ;
        } else {
            zLJJIJ = c20053713dH.LJJIJ();
        }
        if (!(!zLJJIJ)) {
            C1696250uF5.LIZ("node not yet measured");
        }
        LJI(c20053713dH, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.C20053713dH r8, boolean r9) {
        /*
            r7 = this;
            X.13Aw r0 = r8.LJJIL()
            T[] r6 = r0.LL
            int r5 = r0.LLILLL
            r4 = 0
            r3 = 0
        La:
            if (r3 >= r5) goto L62
            r2 = r6[r3]
            X.13dH r2 = (X.C20053713dH) r2
            if (r9 != 0) goto L1b
            boolean r0 = LJIIIIZZ(r2)
            if (r0 != 0) goto L21
        L18:
            int r3 = r3 + 1
            goto La
        L1b:
            boolean r0 = LJIIIZ(r2)
            if (r0 == 0) goto L18
        L21:
            boolean r0 = X.C20052113d1.LIZ(r2)
            if (r0 == 0) goto L5b
            if (r9 != 0) goto L5d
            X.13dK r0 = r2.LLJLLL
            boolean r0 = r0.LJ
            r1 = 1
            if (r0 == 0) goto L57
            X.13cc r0 = r7.LIZIZ
            X.13cb r0 = r0.LIZ
            boolean r0 = r0.LIZIZ(r2)
            if (r0 == 0) goto L57
            r7.LJIILIIL(r2, r1, r4)
        L3d:
            boolean r0 = r2.LJJIJ()
        L41:
            if (r0 == 0) goto L46
            r7.LJIILIIL(r2, r9, r4)
        L46:
            if (r9 == 0) goto L52
            X.13dK r0 = r2.LLJLLL
            boolean r0 = r0.LJ
        L4c:
            if (r0 != 0) goto L18
            r7.LJI(r2, r9)
            goto L18
        L52:
            boolean r0 = r2.LJJIJ()
            goto L4c
        L57:
            r7.LJFF(r2, r1)
            goto L3d
        L5b:
            if (r9 == 0) goto L3d
        L5d:
            X.13dK r0 = r2.LLJLLL
            boolean r0 = r0.LJ
            goto L41
        L62:
            if (r9 == 0) goto L6e
            X.13dK r0 = r8.LLJLLL
            boolean r0 = r0.LJ
        L68:
            if (r0 == 0) goto L6d
            r7.LJIILIIL(r8, r9, r4)
        L6d:
            return
        L6e:
            boolean r0 = r8.LJJIJ()
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20052013d0.LJI(X.13dH, boolean):void");
    }

    public final void LJIIJJI(C20053713dH c20053713dH, long j) {
        if (c20053713dH.LLLII) {
            return;
        }
        if (!(!Intrinsics.LJFF(c20053713dH, this.LIZ))) {
            C1696250uF5.LIZ("measureAndLayout called on root");
        }
        if (!this.LIZ.LIZLLL()) {
            C1696250uF5.LIZ("performMeasureAndLayout called with unattached root");
        }
        if (!this.LIZ.LJIJJ()) {
            C1696250uF5.LIZ("performMeasureAndLayout called with unplaced root");
        }
        if (!(!this.LIZJ)) {
            C1696250uF5.LIZ("performMeasureAndLayout called during measure layout");
        }
        if (this.LJIIIIZZ != null) {
            this.LIZJ = true;
            this.LIZLLL = false;
            try {
                C20049613cc c20049613cc = this.LIZIZ;
                c20049613cc.LIZ.LIZLLL(c20053713dH);
                c20049613cc.LIZIZ.LIZLLL(c20053713dH);
                if ((LIZIZ(c20053713dH, new C1682380tsi(j)) || c20053713dH.LLJLLL.LJFF) && Intrinsics.LJFF(c20053713dH.LJJJJJL(), Boolean.TRUE)) {
                    c20053713dH.LJJJJL();
                }
                LJ(c20053713dH);
                LIZJ(c20053713dH, new C1682380tsi(j));
                if (c20053713dH.LJJIIZI() && c20053713dH.LJIJJ()) {
                    c20053713dH.LJJJLL();
                    this.LJ.LIZ.LIZLLL(c20053713dH);
                    c20053713dH.LLLI = true;
                }
                LIZLLL();
                this.LIZJ = false;
                this.LIZLLL = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZJ = false;
                this.LIZLLL = false;
                throw th;
            }
        }
        C19968013Aw<InterfaceC20052313d3> c19968013Aw = this.LJFF;
        InterfaceC20052313d3[] interfaceC20052313d3Arr = c19968013Aw.LL;
        int i = c19968013Aw.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC20052313d3Arr[i2].LIZ();
        }
        this.LJFF.LJIIIZ();
    }

    public final void LJIILL(C20053713dH c20053713dH, boolean z) {
        C1682380tsi c1682380tsi;
        if (c20053713dH.LLLII) {
            return;
        }
        if (c20053713dH == this.LIZ) {
            c1682380tsi = this.LJIIIIZZ;
        } else {
            c1682380tsi = null;
        }
        if (z) {
            LIZIZ(c20053713dH, c1682380tsi);
        } else {
            LIZJ(c20053713dH, c1682380tsi);
        }
    }

    public final boolean LJIILLIIL(C20053713dH c20053713dH, boolean z) {
        int i = C20048113cN.LIZ[c20053713dH.LLJLLL.LIZLLL.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                if (i == 5) {
                    if (c20053713dH.LJJIJ() && !z) {
                        return false;
                    }
                    c20053713dH.LLJLLL.LJIILL.LLJJJIL = true;
                    if (c20053713dH.LLLII) {
                        return false;
                    }
                    if (!c20053713dH.LJIJJ() && !LJII(c20053713dH)) {
                        return false;
                    }
                    C20053713dH c20053713dHLJJIJIL = c20053713dH.LJJIJIL();
                    if (c20053713dHLJJIJIL == null || !c20053713dHLJJIJIL.LJJIJ()) {
                        this.LIZIZ.LIZ(c20053713dH, false);
                    }
                    if (!this.LIZLLL) {
                        return true;
                    }
                    return false;
                }
                throw new C1954807lC();
            }
            this.LJII.LIZLLL(new C20052213d2(c20053713dH, false, z));
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILIIL(X.C20053713dH r6, boolean r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20052013d0.LJIILIIL(X.13dH, boolean, boolean):boolean");
    }
}
