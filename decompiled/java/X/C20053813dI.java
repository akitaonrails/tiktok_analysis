package X;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import p2.j1;
import p2.x;

/* JADX INFO: renamed from: X.13dI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20053813dI extends AbstractC1686530tzP implements InterfaceC1673370teB, InterfaceC20054413dO, InterfaceC1683320tuE {
    public final C20054013dK LLILZLL;
    public boolean LLIZ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJILJ;
    public Function1<? super InterfaceC1679550to9, Unit> LLJJ;
    public C1695970uEd LLJJI;
    public float LLJJIII;
    public Object LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJL;
    public float LLJLLIL;
    public boolean LLJLLL;
    public Function1<? super InterfaceC1679550to9, Unit> LLJZ;
    public C1695970uEd LLJZIJLIL;
    public float LLLF;
    public boolean LLLFFI;
    public int LLIZLLLIL = Integer.MAX_VALUE;
    public int LLJ = Integer.MAX_VALUE;
    public EnumC20038113al LLJILJIL = EnumC20038113al.NotUsed;
    public long LLJILLL = 0;
    public boolean LLJJIJI = true;
    public final C20050813co LLJJJJLIIL = new AbstractC20053913dJ(this) { // from class: X.13co
        @Override // X.AbstractC20053913dJ
        public final Map<C115T, Integer> LIZJ(j1 j1Var) {
            return j1Var.LJLIIL().LJIILL();
        }

        @Override // X.AbstractC20053913dJ
        public final long LIZIZ(j1 j1Var, long j) {
            InterfaceC20054313dN interfaceC20054313dN = j1Var.LLJZIJLIL;
            if (interfaceC20054313dN != null) {
                j = interfaceC20054313dN.LJFF(j, false);
            }
            return C1680450tpb.LIZIZ(j, j1Var.LLJJL);
        }

        @Override // X.AbstractC20053913dJ
        public final int LIZLLL(j1 j1Var, C115T c115t) {
            return j1Var.LJJIJL(c115t);
        }
    };
    public final C19968013Aw<C20053813dI> LLJJL = new C19968013Aw<>(new C20053813dI[16]);
    public boolean LLJJLIIIJLLLLLLLZ = true;
    public long LLJLIL = C1682390tsj.LIZ(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
    public final AwS574S0100000_30 LLJLILLLLZIIL = new AwS574S0100000_30(this, 376);
    public final AwS574S0100000_30 LLJLL = new AwS574S0100000_30(this, 375);
    public long LLL = 0;
    public final AwS574S0100000_30 LLLFF = new AwS574S0100000_30(this, 377);

    @Override // X.InterfaceC20054413dO
    public final void LJJJJL() {
        this.LLJL = true;
        LJIIIIZZ();
        if (this.LLJJJJ) {
            C19968013Aw<C20053713dH> c19968013AwLJJIL = this.LLILZLL.LIZ.LJJIL();
            C20053713dH[] c20053713dHArr = c19968013AwLJJIL.LL;
            int i = c19968013AwLJJIL.LLILLL;
            for (int i2 = 0; i2 < i; i2++) {
                C20053713dH c20053713dH = c20053713dHArr[i2];
                if (c20053713dH.LJJIJ()) {
                    C20053813dI c20053813dI = c20053713dH.LLJLLL.LJIILL;
                    if (c20053813dI.LLJILJIL == EnumC20038113al.InMeasureBlock && c20053813dI.LLJI) {
                        C1682380tsi c1682380tsi = new C1682380tsi(c20053813dI.LLILZ);
                        if (c20053713dH.LLJLIL == EnumC20038113al.NotUsed) {
                            c20053713dH.LJIJ();
                        }
                        if (c20053713dH.LLJLLL.LJIILL.LJLJJLL(c1682380tsi.LIZ)) {
                            C20053713dH.LJJLI(this.LLILZLL.LIZ, false, 7);
                        }
                    }
                }
            }
        }
        if (this.LLJJJJJIL || (!this.LLJILJILJ && !LJJJJLI().LLIZLLLIL && this.LLJJJJ)) {
            this.LLJJJJ = false;
            C20054013dK c20054013dK = this.LLILZLL;
            EnumC20047813cK enumC20047813cK = c20054013dK.LIZLLL;
            c20054013dK.LIZLLL = EnumC20047813cK.LayingOut;
            c20054013dK.LIZLLL(false);
            C20053713dH c20053713dH2 = this.LLILZLL.LIZ;
            C20054113dL snapshotObserver = C1696120uEs.LIZ(c20053713dH2).getSnapshotObserver();
            snapshotObserver.LIZ(c20053713dH2, snapshotObserver.LJ, this.LLJLL);
            this.LLILZLL.LIZLLL = enumC20047813cK;
            if (LJJJJLI().LLIZLLLIL && this.LLILZLL.LJIIIZ) {
                requestLayout();
            }
            this.LLJJJJJIL = false;
        }
        C20050813co c20050813co = this.LLJJJJLIIL;
        if (c20050813co.LIZLLL) {
            c20050813co.LJ = true;
        }
        if (c20050813co.LIZIZ && c20050813co.LJFF()) {
            LJII();
        }
        this.LLJL = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLIL() {
        /*
            r5 = this;
            r0 = 1
            r5.LLJLLL = r0
            X.13dK r0 = r5.LLILZLL
            X.13dH r0 = r0.LIZ
            X.13dH r2 = r0.LJJIJIL()
            p2.x r0 = r5.LJJJJLI()
            float r4 = r0.LLJJLIIIJLLLLLLLZ
            X.13dK r0 = r5.LLILZLL
            X.13dH r0 = r0.LIZ
            X.13dT r0 = r0.LLJLLIL
            p2.j1 r3 = r0.LIZJ
            p2.x r1 = r0.LIZIZ
        L1b:
            if (r3 == r1) goto L23
            float r0 = r3.LLJJLIIIJLLLLLLLZ
            float r4 = r4 + r0
            p2.j1 r3 = r3.LLJJI
            goto L1b
        L23:
            float r0 = r5.LLJLLIL
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L34
            r5.LLJLLIL = r4
            if (r2 == 0) goto L34
            r2.LJJJJZ()
            r2.LJJJIL()
        L34:
            boolean r0 = r5.LLJJIJIL
            if (r0 != 0) goto L6f
            if (r2 == 0) goto L3d
            r2.LJJJIL()
        L3d:
            r5.LJJZZI()
            boolean r0 = r5.LLIZ
            if (r0 == 0) goto L7a
            if (r2 == 0) goto L7d
            r2.LJJL(r1)
        L49:
            boolean r0 = r5.LLIZ
            if (r0 != 0) goto L6b
            X.13dK r0 = r2.LLJLLL
            X.13cK r1 = r0.LIZLLL
            X.13cK r0 = X.EnumC20047813cK.LayingOut
            if (r1 != r0) goto L6b
            int r1 = r5.LLJ
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L61
            java.lang.String r0 = "Place was called on a node which was placed already"
            X.C1696250uF5.LIZIZ(r0)
        L61:
            X.13dK r1 = r2.LLJLLL
            int r0 = r1.LJIIIIZZ
            r5.LLJ = r0
            int r0 = r0 + 1
            r1.LJIIIIZZ = r0
        L6b:
            r5.LJJJJL()
            return
        L6f:
            X.13dK r0 = r5.LLILZLL
            X.13dH r0 = r0.LIZ
            X.13dT r0 = r0.LLJLLIL
            p2.x r0 = r0.LIZIZ
            r0.LLILZLL()
        L7a:
            if (r2 == 0) goto L7d
            goto L49
        L7d:
            r5.LLJ = r1
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20053813dI.LJLIL():void");
    }

    @Override // X.InterfaceC20054413dO
    public final x LJJJJLI() {
        return this.LLILZLL.LIZ.LLJLLIL.LIZIZ;
    }

    @Override // X.InterfaceC20054413dO
    public final void LJJJLL() {
        C20053713dH.LJJLI(this.LLILZLL.LIZ, false, 7);
    }

    @Override // X.InterfaceC20054413dO
    public final InterfaceC20054413dO LJJJLZIJ() {
        C20054013dK c20054013dK;
        C20053713dH c20053713dHLJJIJIL = this.LLILZLL.LIZ.LJJIJIL();
        if (c20053713dHLJJIJIL == null || (c20054013dK = c20053713dHLJJIJIL.LLJLLL) == null) {
            return null;
        }
        return c20054013dK.LJIILL;
    }

    public final List<C20053813dI> LJJLJLI() {
        this.LLILZLL.LIZ.LJJLIIIJJIZ();
        if (!this.LLJJLIIIJLLLLLLLZ) {
            return this.LLJJL.LJIIIIZZ();
        }
        C20053713dH c20053713dH = this.LLILZLL.LIZ;
        C19968013Aw<C20053813dI> c19968013Aw = this.LLJJL;
        C19968013Aw<C20053713dH> c19968013AwLJJIL = c20053713dH.LJJIL();
        C20053713dH[] c20053713dHArr = c19968013AwLJJIL.LL;
        int i = c19968013AwLJJIL.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            C20053713dH c20053713dH2 = c20053713dHArr[i2];
            if (c19968013Aw.LLILLL <= i2) {
                c19968013Aw.LIZLLL(c20053713dH2.LLJLLL.LJIILL);
            } else {
                c19968013Aw.LL[i2] = c20053713dH2.LLJLLL.LJIILL;
            }
        }
        c19968013Aw.LJIILJJIL(c20053713dH.LJJIIJZLJL().size(), c19968013Aw.LLILLL);
        this.LLJJLIIIJLLLLLLLZ = false;
        return this.LLJJL.LJIIIIZZ();
    }

    public final j1 LJJZ() {
        return this.LLILZLL.LIZ.LLJLLIL.LIZJ;
    }

    public final void LJJZZI() {
        boolean z = this.LLJJIJIL;
        this.LLJJIJIL = true;
        C20053713dH c20053713dH = this.LLILZLL.LIZ;
        if (!z) {
            c20053713dH.LLJLLIL.LIZIZ.LLILZLL();
            if (c20053713dH.LJJIJ()) {
                C20053713dH.LJJLI(c20053713dH, true, 6);
            } else if (c20053713dH.LLJLLL.LJ) {
                C20053713dH.LJJJZ(c20053713dH, true, 6);
            }
        }
        C20054913dT c20054913dT = c20053713dH.LLJLLIL;
        j1 j1Var = c20054913dT.LIZIZ.LLJJI;
        for (j1 j1Var2 = c20054913dT.LIZJ; !Intrinsics.LJFF(j1Var2, j1Var) && j1Var2 != null; j1Var2 = j1Var2.LLJJI) {
            if (j1Var2.LLJZ) {
                j1Var2.LLILLIZIL();
            }
        }
        C19968013Aw<C20053713dH> c19968013AwLJJIL = c20053713dH.LJJIL();
        C20053713dH[] c20053713dHArr = c19968013AwLJJIL.LL;
        int i = c19968013AwLJJIL.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            C20053713dH c20053713dH2 = c20053713dHArr[i2];
            if (c20053713dH2.LJJIJL() != Integer.MAX_VALUE) {
                c20053713dH2.LLJLLL.LJIILL.LJJZZI();
                C20053713dH.LJJLIIIIJ(c20053713dH2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [X.13dY] */
    public final void LJJZZIII() {
        if (this.LLJJIJIL) {
            this.LLJJIJIL = false;
            C20054913dT c20054913dT = this.LLILZLL.LIZ.LLJLLIL;
            j1 j1Var = c20054913dT.LIZIZ.LLJJI;
            for (j1 j1Var2 = c20054913dT.LIZJ; !Intrinsics.LJFF(j1Var2, j1Var) && j1Var2 != null; j1Var2 = j1Var2.LLJJI) {
                AbstractC20055413dY abstractC20055413dYLLIIJI = j1Var2.LLIIJI(C20054813dS.LJI(1048576));
                if ((abstractC20055413dYLLIIJI == null || (abstractC20055413dYLLIIJI.LJIJJ().LLILZ & 1048576) == 0) ? false : true) {
                    boolean zLJI = C20054813dS.LJI(1048576);
                    AbstractC20055413dY abstractC20055413dYLLIIIL = j1Var2.LLIIIL();
                    if (zLJI || (abstractC20055413dYLLIIIL = abstractC20055413dYLLIIIL.LLILZIL) != null) {
                        for (AbstractC20055413dY abstractC20055413dYLLIIJI2 = j1Var2.LLIIJI(zLJI); abstractC20055413dYLLIIJI2 != null && (abstractC20055413dYLLIIJI2.LLILZ & 1048576) != 0; abstractC20055413dYLLIIJI2 = abstractC20055413dYLLIIJI2.LLILZLL) {
                            if ((abstractC20055413dYLLIIJI2.LLILLL & 1048576) != 0) {
                                ?? LIZIZ = abstractC20055413dYLLIIJI2;
                                ?? c19968013Aw = 0;
                                do {
                                    if (LIZIZ instanceof InterfaceC20057913dx) {
                                        ((InterfaceC20057913dx) LIZIZ).LJJJJZI();
                                    } else if ((LIZIZ.LLILLL & 1048576) != 0 && (LIZIZ instanceof AbstractC20055313dX)) {
                                        AbstractC20055413dY abstractC20055413dY = ((AbstractC20055313dX) LIZIZ).LLJJI;
                                        int i = 0;
                                        c19968013Aw = c19968013Aw;
                                        LIZIZ = LIZIZ;
                                        while (abstractC20055413dY != null) {
                                            if ((abstractC20055413dY.LLILLL & 1048576) != 0) {
                                                i++;
                                                c19968013Aw = c19968013Aw;
                                                if (i == 1) {
                                                    LIZIZ = abstractC20055413dY;
                                                } else {
                                                    if (c19968013Aw == 0) {
                                                        c19968013Aw = new C19968013Aw(new AbstractC20055413dY[16]);
                                                    }
                                                    if (LIZIZ != 0) {
                                                        c19968013Aw.LIZLLL(LIZIZ);
                                                        LIZIZ = 0;
                                                    }
                                                    c19968013Aw.LIZLLL(abstractC20055413dY);
                                                }
                                            }
                                            abstractC20055413dY = abstractC20055413dY.LLILZLL;
                                            c19968013Aw = c19968013Aw;
                                            LIZIZ = LIZIZ;
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    LIZIZ = C20052513d5.LIZIZ(c19968013Aw);
                                } while (LIZIZ != 0);
                            }
                            if (abstractC20055413dYLLIIJI2 == abstractC20055413dYLLIIIL) {
                                break;
                            }
                        }
                    }
                }
                if (j1Var2.LLJZIJLIL != null) {
                    if (j1Var2.LLL != null) {
                        j1Var2.LLL = null;
                    }
                    j1Var2.LLJJ(null, false);
                    j1Var2.LLJILJILJ.LJJL(false);
                }
            }
            C19968013Aw<C20053713dH> c19968013AwLJJIL = this.LLILZLL.LIZ.LJJIL();
            C20053713dH[] c20053713dHArr = c19968013AwLJJIL.LL;
            int i2 = c19968013AwLJJIL.LLILLL;
            for (int i3 = 0; i3 < i2; i3++) {
                c20053713dHArr[i3].LLJLLL.LJIILL.LJJZZIII();
            }
        }
    }

    public final void LJL() {
        C20054013dK c20054013dK = this.LLILZLL;
        if (c20054013dK.LJIIJJI > 0) {
            C19968013Aw<C20053713dH> c19968013AwLJJIL = c20054013dK.LIZ.LJJIL();
            C20053713dH[] c20053713dHArr = c19968013AwLJJIL.LL;
            int i = c19968013AwLJJIL.LLILLL;
            for (int i2 = 0; i2 < i; i2++) {
                C20053713dH c20053713dH = c20053713dHArr[i2];
                C20054013dK c20054013dK2 = c20053713dH.LLJLLL;
                if ((c20054013dK2.LJIIIZ || c20054013dK2.LJIIJ) && !c20054013dK2.LJIILL.LLJJJJ) {
                    c20053713dH.LJJL(false);
                }
                c20054013dK2.LJIILL.LJL();
            }
        }
    }

    public final void LJLIIL() {
        C20053713dH.LJJLI(this.LLILZLL.LIZ, false, 7);
        C20053713dH c20053713dHLJJIJIL = this.LLILZLL.LIZ.LJJIJIL();
        if (c20053713dHLJJIJIL != null) {
            C20053713dH c20053713dH = this.LLILZLL.LIZ;
            if (c20053713dH.LLJLIL == EnumC20038113al.NotUsed) {
                int i = C20048013cM.LIZ[c20053713dHLJJIJIL.LLJLLL.LIZLLL.ordinal()];
                c20053713dH.LLJLIL = i != 1 ? i != 2 ? c20053713dHLJJIJIL.LLJLIL : EnumC20038113al.InLayoutBlock : EnumC20038113al.InMeasureBlock;
            }
        }
    }

    @Override // X.InterfaceC20054413dO
    public final void requestLayout() {
        this.LLILZLL.LIZ.LJJL(false);
    }

    @Override // X.AbstractC1686530tzP
    public final int LJJL() {
        return LJJZ().LJJL();
    }

    @Override // X.AbstractC1686530tzP
    public final int LJJLI() {
        return LJJZ().LJJLI();
    }

    @Override // X.InterfaceC20054413dO
    public final AbstractC20053913dJ LJIILL() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC20054413dO
    public final boolean LJIJJ() {
        return this.LLJJIJIL;
    }

    @Override // X.AbstractC1686530tzP, X.InterfaceC1676340tiy
    public final Object LJJJ() {
        return this.LLJJIJIIJIL;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.13co] */
    public C20053813dI(C20054013dK c20054013dK) {
        this.LLILZLL = c20054013dK;
    }

    @Override // X.InterfaceC1683320tuE
    public final void LJIJJLI(boolean z) {
        if (z != LJJZ().LLILZLL) {
            LJJZ().LLILZLL = z;
            this.LLLFFI = true;
        }
    }

    @Override // X.InterfaceC1676340tiy
    public final int LJJII(int i) {
        if (C20052113d1.LIZ(this.LLILZLL.LIZ)) {
            return this.LLILZLL.LJIILLIIL.LJJII(i);
        }
        LJLIIL();
        return LJJZ().LJJII(i);
    }

    @Override // X.InterfaceC1676340tiy
    public final int LJJIIZ(int i) {
        if (C20052113d1.LIZ(this.LLILZLL.LIZ)) {
            return this.LLILZLL.LJIILLIIL.LJJIIZ(i);
        }
        LJLIIL();
        return LJJZ().LJJIIZ(i);
    }

    @Override // X.InterfaceC1676340tiy
    public final int LJJIJ(int i) {
        if (C20052113d1.LIZ(this.LLILZLL.LIZ)) {
            return this.LLILZLL.LJIILLIIL.LJJIJ(i);
        }
        LJLIIL();
        return LJJZ().LJJIJ(i);
    }

    @Override // X.InterfaceC1678850tn1
    public final int LJJIJL(C115T c115t) {
        EnumC20047813cK enumC20047813cK;
        C20053713dH c20053713dHLJJIJIL = this.LLILZLL.LIZ.LJJIJIL();
        EnumC20047813cK enumC20047813cK2 = null;
        if (c20053713dHLJJIJIL != null) {
            enumC20047813cK = c20053713dHLJJIJIL.LLJLLL.LIZLLL;
        } else {
            enumC20047813cK = null;
        }
        if (enumC20047813cK == EnumC20047813cK.Measuring) {
            this.LLJJJJLIIL.LIZJ = true;
        } else {
            C20053713dH c20053713dHLJJIJIL2 = this.LLILZLL.LIZ.LJJIJIL();
            if (c20053713dHLJJIJIL2 != null) {
                enumC20047813cK2 = c20053713dHLJJIJIL2.LLJLLL.LIZLLL;
            }
            if (enumC20047813cK2 == EnumC20047813cK.LayingOut) {
                this.LLJJJJLIIL.LIZLLL = true;
            }
        }
        this.LLJILJILJ = true;
        int iLJJIJL = LJJZ().LJJIJL(c115t);
        this.LLJILJILJ = false;
        return iLJJIJL;
    }

    @Override // X.InterfaceC1676340tiy
    public final int LJJIL(int i) {
        if (C20052113d1.LIZ(this.LLILZLL.LIZ)) {
            return this.LLILZLL.LJIILLIIL.LJJIL(i);
        }
        LJLIIL();
        return LJJZ().LJJIL(i);
    }

    @Override // X.InterfaceC1673370teB
    public final AbstractC1686530tzP LJJJJZ(long j) {
        EnumC20038113al enumC20038113al;
        C20053713dH c20053713dH = this.LLILZLL.LIZ;
        EnumC20038113al enumC20038113al2 = c20053713dH.LLJLIL;
        EnumC20038113al enumC20038113al3 = EnumC20038113al.NotUsed;
        if (enumC20038113al2 == enumC20038113al3) {
            c20053713dH.LJIJ();
        }
        if (C20052113d1.LIZ(this.LLILZLL.LIZ)) {
            C20053613dG c20053613dG = this.LLILZLL.LJIILLIIL;
            c20053613dG.LLJI = enumC20038113al3;
            c20053613dG.LJJJJZ(j);
        }
        C20053713dH c20053713dH2 = this.LLILZLL.LIZ;
        C20053713dH c20053713dHLJJIJIL = c20053713dH2.LJJIJIL();
        if (c20053713dHLJJIJIL != null) {
            if (this.LLJILJIL != enumC20038113al3 && !c20053713dH2.LLJLL) {
                C1696250uF5.LIZIZ("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i = C20048013cM.LIZ[c20053713dHLJJIJIL.LLJLLL.LIZLLL.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    enumC20038113al = EnumC20038113al.InLayoutBlock;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    sbLIZ.append(c20053713dHLJJIJIL.LLJLLL.LIZLLL);
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                enumC20038113al = EnumC20038113al.InMeasureBlock;
            }
            this.LLJILJIL = enumC20038113al;
        } else {
            this.LLJILJIL = enumC20038113al3;
        }
        LJLJJLL(j);
        return this;
    }

    @Override // X.InterfaceC20054413dO
    public final void LJJJZ(Function1<? super InterfaceC20054413dO, Unit> function1) {
        C19968013Aw<C20053713dH> c19968013AwLJJIL = this.LLILZLL.LIZ.LJJIL();
        C20053713dH[] c20053713dHArr = c19968013AwLJJIL.LL;
        int i = c19968013AwLJJIL.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            function1.invoke(c20053713dHArr[i2].LLJLLL.LJIILL);
        }
    }

    public final boolean LJLJJLL(long j) {
        boolean z;
        boolean z2 = true;
        if (!(!this.LLILZLL.LIZ.LLLII)) {
            C1696250uF5.LIZ("measure is called on a deactivated node");
        }
        InterfaceC20055013dU interfaceC20055013dULIZ = C1696120uEs.LIZ(this.LLILZLL.LIZ);
        C20053713dH c20053713dHLJJIJIL = this.LLILZLL.LIZ.LJJIJIL();
        C20053713dH c20053713dH = this.LLILZLL.LIZ;
        if (c20053713dH.LLJLL || (c20053713dHLJJIJIL != null && c20053713dHLJJIJIL.LLJLL)) {
            z = true;
        } else {
            z = false;
        }
        c20053713dH.LLJLL = z;
        if (!c20053713dH.LJJIJ() && C1682380tsi.LIZJ(this.LLILZ, j)) {
            interfaceC20055013dULIZ.LIZJ(this.LLILZLL.LIZ, false);
            this.LLILZLL.LIZ.LJJLIIIJ();
            return false;
        }
        this.LLJJJJLIIL.LJFF = false;
        LJJJZ(AFwS274S0000000_30.get$arr$(313));
        this.LLJI = true;
        long j2 = LJJZ().LLILLL;
        LJJLJ(j);
        EnumC20047813cK enumC20047813cK = this.LLILZLL.LIZLLL;
        EnumC20047813cK enumC20047813cK2 = EnumC20047813cK.Idle;
        if (enumC20047813cK != enumC20047813cK2) {
            C1696250uF5.LIZIZ("layout state is not idle before measure starts");
        }
        this.LLJLIL = j;
        EnumC20047813cK enumC20047813cK3 = EnumC20047813cK.Measuring;
        C20054013dK c20054013dK = this.LLILZLL;
        c20054013dK.LIZLLL = enumC20047813cK3;
        this.LLJJJIL = false;
        C20054113dL snapshotObserver = C1696120uEs.LIZ(c20054013dK.LIZ).getSnapshotObserver();
        snapshotObserver.LIZ(this.LLILZLL.LIZ, snapshotObserver.LIZJ, this.LLJLILLLLZIIL);
        C20054013dK c20054013dK2 = this.LLILZLL;
        if (c20054013dK2.LIZLLL == enumC20047813cK3) {
            this.LLJJJJ = true;
            this.LLJJJJJIL = true;
            c20054013dK2.LIZLLL = enumC20047813cK2;
        }
        if (C1682900ttY.LIZIZ(LJJZ().LLILLL, j2) && LJJZ().LL == this.LL && LJJZ().LLILLJJLI == this.LLILLJJLI) {
            z2 = false;
        }
        LJJLIIJ((((long) LJJZ().LLILLJJLI) & 4294967295L) | (((long) LJJZ().LL) << 32));
        return z2;
    }

    @Override // X.AbstractC1686530tzP
    public final void LJJLIIIJJI(long j, float f, C1695970uEd c1695970uEd) {
        LJLJJI(j, f, null, c1695970uEd);
    }

    @Override // X.AbstractC1686530tzP
    public final void LJJLIIIJJIZ(long j, float f, Function1<? super InterfaceC1679550to9, Unit> function1) {
        LJLJJI(j, f, function1, null);
    }

    public final void LJLILLLLZI(long j, float f, Function1<? super InterfaceC1679550to9, Unit> function1, C1695970uEd c1695970uEd) {
        if (!(!this.LLILZLL.LIZ.LLLII)) {
            C1696250uF5.LIZ("place is called on a deactivated node");
        }
        EnumC20047813cK enumC20047813cK = EnumC20047813cK.LayingOut;
        C20054013dK c20054013dK = this.LLILZLL;
        c20054013dK.LIZLLL = enumC20047813cK;
        boolean z = !this.LLJIJIL;
        this.LLJILLL = j;
        this.LLJJIII = f;
        this.LLJJ = function1;
        this.LLJJI = c1695970uEd;
        this.LLJIJIL = true;
        this.LLJLLL = false;
        InterfaceC20055013dU interfaceC20055013dULIZ = C1696120uEs.LIZ(c20054013dK.LIZ);
        interfaceC20055013dULIZ.getRectManager().LJFF(this.LLILZLL.LIZ, j, z);
        if (!this.LLJJJJ && this.LLJJIJIL) {
            j1 j1VarLJJZ = LJJZ();
            j1VarLJJZ.LLJ(C1676820tjk.LJ(j, j1VarLJJZ.LLILZIL), f, function1, c1695970uEd);
            LJLIL();
        } else {
            this.LLJJJJLIIL.LJI = false;
            this.LLILZLL.LIZJ(false);
            this.LLJZ = function1;
            this.LLL = j;
            this.LLLF = f;
            this.LLJZIJLIL = c1695970uEd;
            C20054113dL snapshotObserver = interfaceC20055013dULIZ.getSnapshotObserver();
            snapshotObserver.LIZ(this.LLILZLL.LIZ, snapshotObserver.LJFF, this.LLLFF);
        }
        this.LLILZLL.LIZLLL = EnumC20047813cK.Idle;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJJI(long r6, float r8, kotlin.jvm.functions.Function1<? super X.InterfaceC1679550to9, kotlin.Unit> r9, X.C1695970uEd r10) {
        /*
            r5 = this;
            r4 = 1
            r5.LLJJJ = r4
            long r0 = r5.LLJILLL
            boolean r0 = X.C1676820tjk.LIZIZ(r6, r0)
            r2 = 0
            if (r0 == 0) goto L10
            boolean r0 = r5.LLLFFI
            if (r0 == 0) goto L25
        L10:
            X.13dK r1 = r5.LLILZLL
            boolean r0 = r1.LJIIJ
            if (r0 != 0) goto L1e
            boolean r0 = r1.LJIIIZ
            if (r0 != 0) goto L1e
            boolean r0 = r5.LLLFFI
            if (r0 == 0) goto L22
        L1e:
            r5.LLJJJJ = r4
            r5.LLLFFI = r2
        L22:
            r5.LJL()
        L25:
            X.13dK r0 = r5.LLILZLL
            X.13dG r3 = r0.LJIILLIIL
            if (r3 == 0) goto L83
            X.13dK r0 = r3.LLILZLL
            X.13dH r0 = r0.LIZ
            boolean r0 = X.C20052113d1.LIZ(r0)
            if (r0 != 0) goto L49
            X.10pX r1 = r3.LLJJIJI
            X.10pX r0 = X.EnumC19365310pX.LLILLL
            if (r1 != r0) goto L43
            X.13dK r1 = r3.LLILZLL
            boolean r0 = r1.LIZIZ
            if (r0 != 0) goto L43
            r1.LIZJ = r4
        L43:
            X.13dK r0 = r3.LLILZLL
            boolean r0 = r0.LIZJ
            if (r0 != r4) goto L83
        L49:
            p2.j1 r0 = r5.LJJZ()
            p2.j1 r0 = r0.LLJJIII
            if (r0 == 0) goto L55
            X.13cV r4 = r0.LLJ
            if (r4 != 0) goto L61
        L55:
            X.13dK r0 = r5.LLILZLL
            X.13dH r0 = r0.LIZ
            X.13dU r0 = X.C1696120uEs.LIZ(r0)
            X.0tuD r4 = r0.getPlacementScope()
        L61:
            X.13dK r0 = r5.LLILZLL
            X.13dG r3 = r0.LJIILLIIL
            X.13dH r0 = r0.LIZ
            X.13dH r0 = r0.LJJIJIL()
            if (r0 == 0) goto L71
            X.13dK r0 = r0.LLJLLL
            r0.LJII = r2
        L71:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r3.LLJ = r0
            r0 = 32
            long r0 = r6 >> r0
            int r2 = (int) r0
            int r1 = X.C1676820tjk.LIZJ(r6)
            r0 = 0
            r4.LIZLLL(r3, r2, r1, r0)
        L83:
            X.13dK r0 = r5.LLILZLL
            X.13dG r0 = r0.LJIILLIIL
            if (r0 == 0) goto L92
            boolean r0 = r0.LLJILJIL
            if (r0 != 0) goto L92
            java.lang.String r0 = "Error: Placement happened before lookahead."
            X.C1696250uF5.LIZIZ(r0)
        L92:
            r5.LJLILLLLZI(r6, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20053813dI.LJLJJI(long, float, kotlin.jvm.functions.Function1, X.0uEd):void");
    }
}
