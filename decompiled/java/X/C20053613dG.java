package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS48S0200100_30;
import kotlin.jvm.internal.AwS76S0100100_30;
import kotlin.jvm.internal.Intrinsics;
import p2.j1;
import p2.x;

/* JADX INFO: renamed from: X.13dG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20053613dG extends AbstractC1686530tzP implements InterfaceC1673370teB, InterfaceC20054413dO, InterfaceC1683320tuE {
    public final C20054013dK LLILZLL;
    public boolean LLIZ;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public C1682380tsi LLJILLL;
    public Function1<? super InterfaceC1679550to9, Unit> LLJJI;
    public C1695970uEd LLJJIII;
    public boolean LLJJJIL;
    public Object LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public int LLIZLLLIL = Integer.MAX_VALUE;
    public int LLJ = Integer.MAX_VALUE;
    public EnumC20038113al LLJI = EnumC20038113al.NotUsed;
    public long LLJJ = 0;
    public EnumC19365310pX LLJJIJI = EnumC19365310pX.LLILLL;
    public final C20050513cl LLJJIJIIJIL = new AbstractC20053913dJ(this) { // from class: X.13cl
        @Override // X.AbstractC20053913dJ
        public final Map<C115T, Integer> LIZJ(j1 j1Var) {
            return j1Var.LLIIII().LJLIIL().LJIILL();
        }

        @Override // X.AbstractC20053913dJ
        public final long LIZIZ(j1 j1Var, long j) {
            return C1378605aS.LJI((((long) Float.floatToRawIntBits((int) (r3 >> 32))) << 32) | (((long) Float.floatToRawIntBits(C1676820tjk.LIZJ(j1Var.LLIIII().LLJILLL))) & 4294967295L), j);
        }

        @Override // X.AbstractC20053913dJ
        public final int LIZLLL(j1 j1Var, C115T c115t) {
            return j1Var.LLIIII().LJJIJL(c115t);
        }
    };
    public final C19968013Aw<C20053613dG> LLJJIJIL = new C19968013Aw<>(new C20053613dG[16]);
    public boolean LLJJJ = true;
    public boolean LLJJJJ = true;

    @Override // X.InterfaceC20054413dO
    public final void LJJJJL() {
        this.LLJJJIL = true;
        LJIIIIZZ();
        C20054013dK c20054013dK = this.LLILZLL;
        if (c20054013dK.LJFF) {
            C19968013Aw<C20053713dH> c19968013AwLJJIL = c20054013dK.LIZ.LJJIL();
            C20053713dH[] c20053713dHArr = c19968013AwLJJIL.LL;
            int i = c19968013AwLJJIL.LLILLL;
            for (int i2 = 0; i2 < i; i2++) {
                C20053713dH c20053713dH = c20053713dHArr[i2];
                if (c20053713dH.LLJLLL.LJ && c20053713dH.LJJIJIIJI() == EnumC20038113al.InMeasureBlock) {
                    C20053613dG c20053613dG = c20053713dH.LLJLLL.LJIILLIIL;
                    if (c20053613dG.LJLILLLLZI((c20053613dG != null ? c20053613dG.LLJILLL : null).LIZ)) {
                        C20053713dH.LJJJZ(this.LLILZLL.LIZ, false, 7);
                    }
                }
            }
        }
        AbstractC20050413ck abstractC20050413ck = LJJJJLI().LLLIIIL;
        C20054013dK c20054013dK2 = this.LLILZLL;
        if (c20054013dK2.LJI || (!this.LLJIJIL && !abstractC20050413ck.LLIZLLLIL && c20054013dK2.LJFF)) {
            c20054013dK2.LJFF = false;
            EnumC20047813cK enumC20047813cK = c20054013dK2.LIZLLL;
            c20054013dK2.LIZLLL = EnumC20047813cK.LookaheadLayingOut;
            InterfaceC20055013dU interfaceC20055013dULIZ = C1696120uEs.LIZ(c20054013dK2.LIZ);
            this.LLILZLL.LJFF(false);
            C20054113dL snapshotObserver = interfaceC20055013dULIZ.getSnapshotObserver();
            C20053713dH c20053713dH2 = this.LLILZLL.LIZ;
            AwS431S0200000_30 awS431S0200000_30 = new AwS431S0200000_30(this, abstractC20050413ck, 48);
            snapshotObserver.getClass();
            if (c20053713dH2.LLIZLLLIL != null) {
                snapshotObserver.LIZ(c20053713dH2, snapshotObserver.LJII, awS431S0200000_30);
            } else {
                snapshotObserver.LIZ(c20053713dH2, snapshotObserver.LJ, awS431S0200000_30);
            }
            C20054013dK c20054013dK3 = this.LLILZLL;
            c20054013dK3.LIZLLL = enumC20047813cK;
            if (c20054013dK3.LJIIL && abstractC20050413ck.LLIZLLLIL) {
                requestLayout();
            }
            this.LLILZLL.LJI = false;
        }
        C20050513cl c20050513cl = this.LLJJIJIIJIL;
        if (c20050513cl.LIZLLL) {
            c20050513cl.LJ = true;
        }
        if (c20050513cl.LIZIZ && c20050513cl.LJFF()) {
            LJII();
        }
        this.LLJJJIL = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLIIL() {
        /*
            r4 = this;
            r0 = 1
            r4.LLJJJJLIIL = r0
            X.13dK r0 = r4.LLILZLL
            X.13dH r0 = r0.LIZ
            X.13dH r2 = r0.LJJIJIL()
            X.10pX r3 = r4.LLJJIJI
            X.10pX r0 = X.EnumC19365310pX.LL
            r1 = 0
            if (r3 == r0) goto L18
            X.13dK r0 = r4.LLILZLL
            boolean r0 = r0.LIZJ
            if (r0 == 0) goto L22
        L18:
            X.10pX r0 = X.EnumC19365310pX.LLILLJJLI
            if (r3 == r0) goto L58
            X.13dK r0 = r4.LLILZLL
            boolean r0 = r0.LIZJ
            if (r0 == 0) goto L58
        L22:
            r4.LJJZZI()
            boolean r0 = r4.LLIZ
            if (r0 == 0) goto L58
            if (r2 == 0) goto L5b
            r2.LJJJLZIJ(r1)
        L2e:
            boolean r0 = r4.LLIZ
            if (r0 != 0) goto L54
            X.13dK r0 = r2.LLJLLL
            X.13cK r1 = r0.LIZLLL
            X.13cK r0 = X.EnumC20047813cK.LayingOut
            if (r1 == r0) goto L3e
            X.13cK r0 = X.EnumC20047813cK.LookaheadLayingOut
            if (r1 != r0) goto L54
        L3e:
            int r1 = r4.LLJ
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L4a
            java.lang.String r0 = "Place was called on a node which was placed already"
            X.C1696250uF5.LIZIZ(r0)
        L4a:
            X.13dK r1 = r2.LLJLLL
            int r0 = r1.LJII
            r4.LLJ = r0
            int r0 = r0 + 1
            r1.LJII = r0
        L54:
            r4.LJJJJL()
            return
        L58:
            if (r2 == 0) goto L5b
            goto L2e
        L5b:
            r4.LLJ = r1
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20053613dG.LJLIIL():void");
    }

    @Override // X.InterfaceC20054413dO
    public final boolean LJIJJ() {
        return this.LLJJIJI != EnumC19365310pX.LLILLL;
    }

    @Override // X.InterfaceC20054413dO
    public final x LJJJJLI() {
        return this.LLILZLL.LIZ.LLJLLIL.LIZIZ;
    }

    @Override // X.InterfaceC20054413dO
    public final void LJJJLL() {
        C20053713dH.LJJJZ(this.LLILZLL.LIZ, false, 7);
    }

    @Override // X.InterfaceC20054413dO
    public final InterfaceC20054413dO LJJJLZIJ() {
        C20054013dK c20054013dK;
        C20053713dH c20053713dHLJJIJIL = this.LLILZLL.LIZ.LJJIJIL();
        if (c20053713dHLJJIJIL == null || (c20054013dK = c20053713dHLJJIJIL.LLJLLL) == null) {
            return null;
        }
        return c20054013dK.LJIILLIIL;
    }

    public final j1 LJJLJLI() {
        return this.LLILZLL.LIZ.LLJLLIL.LIZJ;
    }

    public final void LJJZZI() {
        EnumC19365310pX enumC19365310pX = this.LLJJIJI;
        C20054013dK c20054013dK = this.LLILZLL;
        if (c20054013dK.LIZJ) {
            this.LLJJIJI = EnumC19365310pX.LLILLJJLI;
        } else {
            this.LLJJIJI = EnumC19365310pX.LL;
        }
        if (enumC19365310pX != EnumC19365310pX.LL && c20054013dK.LJ) {
            C20053713dH.LJJJZ(c20054013dK.LIZ, true, 6);
        }
        C19968013Aw<C20053713dH> c19968013AwLJJIL = this.LLILZLL.LIZ.LJJIL();
        C20053713dH[] c20053713dHArr = c19968013AwLJJIL.LL;
        int i = c19968013AwLJJIL.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            C20053713dH c20053713dH = c20053713dHArr[i2];
            C20053613dG c20053613dG = c20053713dH.LLJLLL.LJIILLIIL;
            if (c20053613dG == null) {
                "Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.".toString();
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (c20053613dG.LLJ != Integer.MAX_VALUE) {
                c20053613dG.LJJZZI();
                C20053713dH.LJJLIIIIJ(c20053713dH);
            }
        }
    }

    public final void LJJZZIII() {
        C20054013dK c20054013dK = this.LLILZLL;
        if (c20054013dK.LJIILJJIL > 0) {
            C19968013Aw<C20053713dH> c19968013AwLJJIL = c20054013dK.LIZ.LJJIL();
            C20053713dH[] c20053713dHArr = c19968013AwLJJIL.LL;
            int i = c19968013AwLJJIL.LLILLL;
            for (int i2 = 0; i2 < i; i2++) {
                C20053713dH c20053713dH = c20053713dHArr[i2];
                C20054013dK c20054013dK2 = c20053713dH.LLJLLL;
                if ((c20054013dK2.LJIIL || c20054013dK2.LJIILIIL) && !c20054013dK2.LJFF) {
                    c20053713dH.LJJJLZIJ(false);
                }
                C20053613dG c20053613dG = c20054013dK2.LJIILLIIL;
                if (c20053613dG != null) {
                    c20053613dG.LJJZZIII();
                }
            }
        }
    }

    public final void LJL() {
        C20053713dH.LJJJZ(this.LLILZLL.LIZ, false, 7);
        C20053713dH c20053713dHLJJIJIL = this.LLILZLL.LIZ.LJJIJIL();
        if (c20053713dHLJJIJIL != null) {
            C20053713dH c20053713dH = this.LLILZLL.LIZ;
            if (c20053713dH.LLJLIL == EnumC20038113al.NotUsed) {
                int i = C20047913cL.LIZ[c20053713dHLJJIJIL.LLJLLL.LIZLLL.ordinal()];
                c20053713dH.LLJLIL = i != 2 ? i != 3 ? c20053713dHLJJIJIL.LLJLIL : EnumC20038113al.InLayoutBlock : EnumC20038113al.InMeasureBlock;
            }
        }
    }

    @Override // X.InterfaceC20054413dO
    public final void requestLayout() {
        this.LLILZLL.LIZ.LJJJLZIJ(false);
    }

    @Override // X.AbstractC1686530tzP
    public final int LJJL() {
        return LJJLJLI().LLIIII().LJJL();
    }

    @Override // X.AbstractC1686530tzP
    public final int LJJLI() {
        return LJJLJLI().LLIIII().LJJLI();
    }

    @Override // X.InterfaceC20054413dO
    public final AbstractC20053913dJ LJIILL() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC1686530tzP, X.InterfaceC1676340tiy
    public final Object LJJJ() {
        return this.LLJJJJJIL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.13cl] */
    public C20053613dG(C20054013dK c20054013dK) {
        this.LLILZLL = c20054013dK;
        this.LLJJJJJIL = c20054013dK.LJIILL.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC1683320tuE
    public final void LJIJJLI(boolean z) {
        Boolean boolValueOf;
        AbstractC20050413ck abstractC20050413ckLLIIII;
        AbstractC20050413ck abstractC20050413ckLLIIII2 = LJJLJLI().LLIIII();
        if (abstractC20050413ckLLIIII2 != null) {
            boolValueOf = Boolean.valueOf(abstractC20050413ckLLIIII2.LLILZLL);
        } else {
            boolValueOf = null;
        }
        if (!Intrinsics.LJFF(Boolean.valueOf(z), boolValueOf) && (abstractC20050413ckLLIIII = LJJLJLI().LLIIII()) != null) {
            abstractC20050413ckLLIIII.LLILZLL = z;
        }
    }

    @Override // X.InterfaceC1676340tiy
    public final int LJJII(int i) {
        LJL();
        return LJJLJLI().LLIIII().LJJII(i);
    }

    @Override // X.InterfaceC1676340tiy
    public final int LJJIIZ(int i) {
        LJL();
        return LJJLJLI().LLIIII().LJJIIZ(i);
    }

    @Override // X.InterfaceC1676340tiy
    public final int LJJIJ(int i) {
        LJL();
        return LJJLJLI().LLIIII().LJJIJ(i);
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
        if (enumC20047813cK == EnumC20047813cK.LookaheadMeasuring) {
            this.LLJJIJIIJIL.LIZJ = true;
        } else {
            C20053713dH c20053713dHLJJIJIL2 = this.LLILZLL.LIZ.LJJIJIL();
            if (c20053713dHLJJIJIL2 != null) {
                enumC20047813cK2 = c20053713dHLJJIJIL2.LLJLLL.LIZLLL;
            }
            if (enumC20047813cK2 == EnumC20047813cK.LookaheadLayingOut) {
                this.LLJJIJIIJIL.LIZLLL = true;
            }
        }
        this.LLJIJIL = true;
        int iLJJIJL = LJJLJLI().LLIIII().LJJIJL(c115t);
        this.LLJIJIL = false;
        return iLJJIJL;
    }

    @Override // X.InterfaceC1676340tiy
    public final int LJJIL(int i) {
        LJL();
        return LJJLJLI().LLIIII().LJJIL(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    @Override // X.InterfaceC1673370teB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC1686530tzP LJJJJZ(long r6) {
        /*
            r5 = this;
            X.13dK r0 = r5.LLILZLL
            X.13dH r0 = r0.LIZ
            X.13dH r0 = r0.LJJIJIL()
            r3 = 0
            if (r0 == 0) goto L75
            X.13dK r0 = r0.LLJLLL
            X.13cK r2 = r0.LIZLLL
        Lf:
            X.13cK r0 = X.EnumC20047813cK.LookaheadMeasuring
            r1 = 0
            if (r2 == r0) goto L26
            X.13dK r0 = r5.LLILZLL
            X.13dH r0 = r0.LIZ
            X.13dH r0 = r0.LJJIJIL()
            if (r0 == 0) goto L22
            X.13dK r0 = r0.LLJLLL
            X.13cK r3 = r0.LIZLLL
        L22:
            X.13cK r0 = X.EnumC20047813cK.LookaheadLayingOut
            if (r3 != r0) goto L2a
        L26:
            X.13dK r0 = r5.LLILZLL
            r0.LIZIZ = r1
        L2a:
            X.13dK r0 = r5.LLILZLL
            X.13dH r4 = r0.LIZ
            X.13dH r3 = r4.LJJIJIL()
            if (r3 == 0) goto L7a
            X.13al r1 = r5.LLJI
            X.13al r0 = X.EnumC20038113al.NotUsed
            r2 = 1
            if (r1 == r0) goto L44
            boolean r0 = r4.LLJLL
            if (r0 != 0) goto L44
            java.lang.String r0 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            X.C1696250uF5.LIZIZ(r0)
        L44:
            X.13dK r0 = r3.LLJLLL
            X.13cK r0 = r0.LIZLLL
            int[] r1 = X.C20047913cL.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            if (r1 == r2) goto L7f
            r0 = 2
            if (r1 == r0) goto L7f
            r0 = 3
            if (r1 == r0) goto L77
            r0 = 4
            if (r1 == r0) goto L77
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            r1.append(r0)
            X.13dK r0 = r3.LLJLLL
            X.13cK r0 = r0.LIZLLL
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        L75:
            r2 = r3
            goto Lf
        L77:
            X.13al r0 = X.EnumC20038113al.InLayoutBlock
            goto L81
        L7a:
            X.13al r0 = X.EnumC20038113al.NotUsed
            r5.LLJI = r0
            goto L83
        L7f:
            X.13al r0 = X.EnumC20038113al.InMeasureBlock
        L81:
            r5.LLJI = r0
        L83:
            X.13dK r0 = r5.LLILZLL
            X.13dH r2 = r0.LIZ
            X.13al r1 = r2.LLJLIL
            X.13al r0 = X.EnumC20038113al.NotUsed
            if (r1 != r0) goto L90
            r2.LJIJ()
        L90:
            r5.LJLILLLLZI(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20053613dG.LJJJJZ(long):X.0tzP");
    }

    @Override // X.InterfaceC20054413dO
    public final void LJJJZ(Function1<? super InterfaceC20054413dO, Unit> function1) {
        C19968013Aw<C20053713dH> c19968013AwLJJIL = this.LLILZLL.LIZ.LJJIL();
        C20053713dH[] c20053713dHArr = c19968013AwLJJIL.LL;
        int i = c19968013AwLJJIL.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            function1.invoke(c20053713dHArr[i2].LLJLLL.LJIILLIIL);
        }
    }

    public final void LJJZ(boolean z) {
        if (z) {
            if (this.LLILZLL.LIZJ) {
                return;
            }
        } else if (!this.LLILZLL.LIZJ) {
            return;
        }
        this.LLJJIJI = EnumC19365310pX.LLILLL;
        C19968013Aw<C20053713dH> c19968013AwLJJIL = this.LLILZLL.LIZ.LJJIL();
        C20053713dH[] c20053713dHArr = c19968013AwLJJIL.LL;
        int i = c19968013AwLJJIL.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            c20053713dHArr[i2].LLJLLL.LJIILLIIL.LJJZ(true);
        }
    }

    public final boolean LJLILLLLZI(long j) {
        boolean z;
        long j2;
        C1682380tsi c1682380tsi;
        if (!(!this.LLILZLL.LIZ.LLLII)) {
            C1696250uF5.LIZ("measure is called on a deactivated node");
        }
        C20053713dH c20053713dHLJJIJIL = this.LLILZLL.LIZ.LJJIJIL();
        C20053713dH c20053713dH = this.LLILZLL.LIZ;
        if (c20053713dH.LLJLL || (c20053713dHLJJIJIL != null && c20053713dHLJJIJIL.LLJLL)) {
            z = true;
        } else {
            z = false;
        }
        c20053713dH.LLJLL = z;
        if (!c20053713dH.LLJLLL.LJ && (c1682380tsi = this.LLJILLL) != null && C1682380tsi.LIZJ(c1682380tsi.LIZ, j)) {
            C20053713dH c20053713dH2 = this.LLILZLL.LIZ;
            InterfaceC20055013dU interfaceC20055013dU = c20053713dH2.LLJILLL;
            if (interfaceC20055013dU != null) {
                interfaceC20055013dU.LIZJ(c20053713dH2, true);
            }
            this.LLILZLL.LIZ.LJJLIIIJ();
            return false;
        }
        this.LLJILLL = new C1682380tsi(j);
        LJJLJ(j);
        this.LLJJIJIIJIL.LJFF = false;
        LJJJZ(AFwS274S0000000_30.get$arr$(309));
        if (this.LLJILJILJ) {
            j2 = this.LLILLL;
        } else {
            long j3 = Integer.MIN_VALUE;
            j2 = (j3 & 4294967295L) | (j3 << 32);
        }
        this.LLJILJILJ = true;
        AbstractC20050413ck abstractC20050413ckLLIIII = LJJLJLI().LLIIII();
        if (abstractC20050413ckLLIIII == null) {
            C1696250uF5.LIZIZ("Lookahead result from lookaheadRemeasure cannot be null");
        }
        C20053613dG c20053613dG = this.LLILZLL.LJIILLIIL;
        if (c20053613dG != null) {
            EnumC20047813cK enumC20047813cK = EnumC20047813cK.LookaheadMeasuring;
            C20054013dK c20054013dK = c20053613dG.LLILZLL;
            c20054013dK.LIZLLL = enumC20047813cK;
            c20054013dK.LJ = false;
            C20054113dL snapshotObserver = C1696120uEs.LIZ(c20054013dK.LIZ).getSnapshotObserver();
            C20053713dH c20053713dH3 = c20053613dG.LLILZLL.LIZ;
            AwS76S0100100_30 awS76S0100100_30 = new AwS76S0100100_30(c20053613dG, j, 2);
            snapshotObserver.getClass();
            if (c20053713dH3.LLIZLLLIL != null) {
                snapshotObserver.LIZ(c20053713dH3, snapshotObserver.LIZIZ, awS76S0100100_30);
            } else {
                snapshotObserver.LIZ(c20053713dH3, snapshotObserver.LIZJ, awS76S0100100_30);
            }
            C20054013dK c20054013dK2 = c20053613dG.LLILZLL;
            c20054013dK2.LJFF = true;
            c20054013dK2.LJI = true;
            if (C20052113d1.LIZ(c20054013dK2.LIZ)) {
                C20053813dI c20053813dI = c20053613dG.LLILZLL.LJIILL;
                c20053813dI.LLJJJJ = true;
                c20053813dI.LLJJJJJIL = true;
            } else {
                c20053613dG.LLILZLL.LJIILL.LLJJJIL = true;
            }
            c20053613dG.LLILZLL.LIZLLL = EnumC20047813cK.Idle;
        }
        LJJLIIJ((((long) abstractC20050413ckLLIIII.LLILLJJLI) & 4294967295L) | (((long) abstractC20050413ckLLIIII.LL) << 32));
        if (((int) (j2 >> 32)) != abstractC20050413ckLLIIII.LL || ((int) (j2 & 4294967295L)) != abstractC20050413ckLLIIII.LLILLJJLI) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1686530tzP
    public final void LJJLIIIJJI(long j, float f, C1695970uEd c1695970uEd) {
        LJLIL(j, f, null, c1695970uEd);
    }

    @Override // X.AbstractC1686530tzP
    public final void LJJLIIIJJIZ(long j, float f, Function1<? super InterfaceC1679550to9, Unit> function1) {
        LJLIL(j, f, function1, null);
    }

    public final void LJLIL(long j, float f, Function1<? super InterfaceC1679550to9, Unit> function1, C1695970uEd c1695970uEd) {
        EnumC20047813cK enumC20047813cK;
        C20053713dH c20053713dHLJJIJIL = this.LLILZLL.LIZ.LJJIJIL();
        if (c20053713dHLJJIJIL != null) {
            enumC20047813cK = c20053713dHLJJIJIL.LLJLLL.LIZLLL;
        } else {
            enumC20047813cK = null;
        }
        EnumC20047813cK enumC20047813cK2 = EnumC20047813cK.LookaheadLayingOut;
        if (enumC20047813cK == enumC20047813cK2) {
            this.LLILZLL.LIZJ = false;
        }
        if (!(!this.LLILZLL.LIZ.LLLII)) {
            C1696250uF5.LIZ("place is called on a deactivated node");
        }
        this.LLILZLL.LIZLLL = enumC20047813cK2;
        this.LLJILJIL = true;
        this.LLJJJJLIIL = false;
        if (!C1676820tjk.LIZIZ(j, this.LLJJ)) {
            C20054013dK c20054013dK = this.LLILZLL;
            if (c20054013dK.LJIILIIL || c20054013dK.LJIIL) {
                c20054013dK.LJFF = true;
            }
            LJJZZIII();
        }
        InterfaceC20055013dU interfaceC20055013dULIZ = C1696120uEs.LIZ(this.LLILZLL.LIZ);
        if (!this.LLILZLL.LJFF && LJIJJ()) {
            AbstractC20050413ck abstractC20050413ckLLIIII = LJJLJLI().LLIIII();
            abstractC20050413ckLLIIII.LJLLLLLL(C1676820tjk.LJ(j, abstractC20050413ckLLIIII.LLILZIL));
            LJLIIL();
        } else {
            this.LLILZLL.LJ(false);
            this.LLJJIJIIJIL.LJI = false;
            C20054113dL snapshotObserver = interfaceC20055013dULIZ.getSnapshotObserver();
            C20053713dH c20053713dH = this.LLILZLL.LIZ;
            AwS48S0200100_30 awS48S0200100_30 = new AwS48S0200100_30(this, interfaceC20055013dULIZ, j, 2);
            snapshotObserver.getClass();
            if (c20053713dH.LLIZLLLIL != null) {
                snapshotObserver.LIZ(c20053713dH, snapshotObserver.LJI, awS48S0200100_30);
            } else {
                snapshotObserver.LIZ(c20053713dH, snapshotObserver.LJFF, awS48S0200100_30);
            }
        }
        this.LLJJ = j;
        this.LLJJI = function1;
        this.LLJJIII = c1695970uEd;
        this.LLILZLL.LIZLLL = EnumC20047813cK.Idle;
    }
}
