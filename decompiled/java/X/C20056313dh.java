package X;

import java.util.HashSet;
import kotlin.jvm.internal.AwS574S0100000_30;
import p2.j1;

/* JADX INFO: renamed from: X.13dh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20056313dh extends AbstractC20055413dY implements InterfaceC20052813d8, InterfaceC1695680uEA, InterfaceC20051113cr, InterfaceC20056213dg, InterfaceC1697440uH0, InterfaceC1682880ttW, InterfaceC20057313dr, InterfaceC20056813dm, InterfaceC20051913cz, InterfaceC20051413cu, InterfaceC20057413ds, InterfaceC1682300tsa, InterfaceC20029513Yn, InterfaceC1680840tqE {
    public InterfaceC1672410tcd LLJJ;
    public boolean LLJJI;
    public C1691300u76 LLJJIII;
    public final HashSet<AbstractC1691330u79<?>> LLJJIJI;
    public InterfaceC1692950u9l LLJJIJIIJIL;

    @Override // X.InterfaceC20051113cr
    public final /* synthetic */ boolean LJJJJ() {
        return false;
    }

    @Override // X.InterfaceC1695680uEA
    public final void LJJLIIIJJIZ() {
        this.LLJJI = true;
        C1691800u7u.LIZ(this);
    }

    @Override // X.InterfaceC20051113cr
    public final /* synthetic */ boolean LLIIJI() {
        return false;
    }

    @Override // X.AbstractC20055413dY
    public final void LLILZIL() {
        LLJJ(true);
    }

    @Override // X.InterfaceC1680840tqE
    public final long LIZIZ() {
        return C1296570jqR.LIZIZ(C20052513d5.LIZLLL(this, 128).LLILLL);
    }

    @Override // X.InterfaceC20056213dg
    public final void LJJIIZ() {
        ((InterfaceC1672570tct) this.LLJJ).LJIIZILJ().getClass();
    }

    @Override // X.InterfaceC1697440uH0
    public final AbstractC1691420u7I LJJL() {
        C1691300u76 c1691300u76 = this.LLJJIII;
        return c1691300u76 == null ? C1691410u7H.LIZ : c1691300u76;
    }

    @Override // X.InterfaceC20056213dg
    public final boolean LJL() {
        ((InterfaceC1672570tct) this.LLJJ).LJIIZILJ().getClass();
        return true;
    }

    @Override // X.InterfaceC20056213dg
    public final void LLIIIILZ() {
        ((InterfaceC1672570tct) this.LLJJ).LJIIZILJ().LIZIZ();
    }

    @Override // X.AbstractC20055413dY
    public final void LLILZLL() {
        if (this.LLJJ instanceof InterfaceC1672570tct) {
            LLIIIILZ();
        }
    }

    public final void LLJJI() {
        if (!this.LLJILLL) {
            C1696250uF5.LIZIZ("unInitializeModifier called on unattached node");
        }
        InterfaceC1672410tcd interfaceC1672410tcd = this.LLJJ;
        if ((this.LLILLL & 32) != 0) {
            if (interfaceC1672410tcd instanceof InterfaceC1685780tyC) {
                C20056413di modifierLocalManager = C20052513d5.LJI(this).getModifierLocalManager();
                C1691310u77 key = ((InterfaceC1685780tyC) interfaceC1672410tcd).getKey();
                modifierLocalManager.LIZLLL.LIZLLL(C20052513d5.LJFF(this));
                modifierLocalManager.LJ.LIZLLL(key);
                modifierLocalManager.LIZ();
            }
            if (interfaceC1672410tcd instanceof InterfaceC1697560uHC) {
                ((InterfaceC1697560uHC) interfaceC1672410tcd).LJIILIIL(C20056513dj.LIZ);
            }
        }
        if ((this.LLILLL & 8) != 0) {
            C20052513d5.LJI(this).LJIJJLI();
        }
        if (interfaceC1672410tcd instanceof InterfaceC20057013do) {
            ((InterfaceC20057013do) interfaceC1672410tcd).LIZJ().LIZ.LJIIL(this);
        }
    }

    public final void LLJJIII() {
        if (this.LLJILLL) {
            this.LLJJIJI.clear();
            C20052513d5.LJI(this).getSnapshotObserver().LIZ(this, C20056513dj.LIZJ, new AwS574S0100000_30(this, 370));
        }
    }

    public final String toString() {
        return this.LLJJ.toString();
    }

    @Override // X.InterfaceC1680840tqE
    public final InterfaceC1690500u5o getDensity() {
        return C20052513d5.LJFF(this).LLJJJJLIIL;
    }

    @Override // X.InterfaceC1680840tqE
    public final EnumC1671200tag getLayoutDirection() {
        return C20052513d5.LJFF(this).LLJJL;
    }

    @Override // X.InterfaceC20056213dg
    public final void LJJJJZ() {
        LLIIIILZ();
    }

    @Override // X.InterfaceC20056213dg
    public final long LJJLIIIJ() {
        return C20082213hs.LIZ;
    }

    @Override // X.InterfaceC20029513Yn
    public final boolean LJJLIIIJILLIZJL() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC20055413dY
    public final void LLIZ() {
        LLJJI();
    }

    public C20056313dh(InterfaceC1672410tcd interfaceC1672410tcd) {
        this.LLILLL = C20054813dS.LIZLLL(interfaceC1672410tcd);
        this.LLJJ = interfaceC1672410tcd;
        this.LLJJI = true;
        this.LLJJIJI = new HashSet<>();
    }

    @Override // X.InterfaceC1695680uEA
    public final void LJJIFFI(InterfaceC1669010tX9 interfaceC1669010tX9) {
        InterfaceC1672410tcd interfaceC1672410tcd = this.LLJJ;
        InterfaceC1686360tz8 interfaceC1686360tz8 = (InterfaceC1686360tz8) interfaceC1672410tcd;
        if (this.LLJJI && (interfaceC1672410tcd instanceof InterfaceC20058413e2)) {
            C20052513d5.LJI(this).getSnapshotObserver().LIZ(this, C20056513dj.LIZIZ, new AwS574S0100000_30(interfaceC1672410tcd, this, 371));
            this.LLJJI = false;
        }
        interfaceC1686360tz8.LJJIFFI(interfaceC1669010tX9);
    }

    @Override // X.InterfaceC20056813dm
    public final void LJJLJ(long j) {
        InterfaceC1672410tcd interfaceC1672410tcd = this.LLJJ;
        if (interfaceC1672410tcd instanceof InterfaceC20058113dz) {
            ((InterfaceC20058113dz) interfaceC1672410tcd).LJIIIZ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0098, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
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
    @Override // X.InterfaceC1682880ttW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJLJJLL(X.C1691310u77 r10) {
        /*
            r9 = this;
            java.util.HashSet<X.0u79<?>> r0 = r9.LLJJIJI
            r0.add(r10)
            X.13dY r0 = r9.LL
            boolean r0 = r0.LLJILLL
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitAncestors called on an unattached node"
            X.C1696250uF5.LIZIZ(r0)
        L10:
            X.13dY r0 = r9.LL
            X.13dY r7 = r0.LLILZIL
            X.13dH r6 = X.C20052513d5.LJFF(r9)
        L18:
            if (r6 == 0) goto L9b
        L1a:
            X.13dT r0 = r6.LLJLLIL
            X.13dY r0 = r0.LJ
            int r0 = r0.LLILZ
            r0 = r0 & 32
            r8 = 0
            if (r0 == 0) goto L8b
        L25:
            if (r7 == 0) goto L8b
            int r0 = r7.LLILLL
            r0 = r0 & 32
            if (r0 == 0) goto L88
            r5 = r7
            r4 = r8
        L2f:
            boolean r0 = r5 instanceof X.InterfaceC1697440uH0
            if (r0 == 0) goto L48
            X.0uH0 r5 = (X.InterfaceC1697440uH0) r5
            X.0u7I r0 = r5.LJJL()
            boolean r0 = r0.LIZ(r10)
            if (r0 == 0) goto L7e
            X.0u7I r0 = r5.LJJL()
            java.lang.Object r0 = r0.LIZIZ(r10)
            return r0
        L48:
            int r0 = r5.LLILLL
            r0 = r0 & 32
            r3 = 1
            if (r0 == 0) goto L7e
            boolean r0 = r5 instanceof X.AbstractC20055313dX
            if (r0 == 0) goto L7e
            r0 = r5
            X.13dX r0 = (X.AbstractC20055313dX) r0
            X.13dY r2 = r0.LLJJI
            r1 = 0
        L59:
            if (r2 == 0) goto L83
            int r0 = r2.LLILLL
            r0 = r0 & 32
            if (r0 == 0) goto L66
            int r1 = r1 + 1
            if (r1 != r3) goto L69
            r5 = r2
        L66:
            X.13dY r2 = r2.LLILZLL
            goto L59
        L69:
            if (r4 != 0) goto L74
            X.13Aw r4 = new X.13Aw
            r0 = 16
            X.13dY[] r0 = new X.AbstractC20055413dY[r0]
            r4.<init>(r0)
        L74:
            if (r5 == 0) goto L7a
            r4.LIZLLL(r5)
            r5 = r8
        L7a:
            r4.LIZLLL(r2)
            goto L66
        L7e:
            X.13dY r5 = X.C20052513d5.LIZIZ(r4)
            goto L85
        L83:
            if (r1 != r3) goto L7e
        L85:
            if (r5 == 0) goto L88
            goto L2f
        L88:
            X.13dY r7 = r7.LLILZIL
            goto L25
        L8b:
            X.13dH r6 = r6.LJJIJIL()
            if (r6 == 0) goto L9b
            X.13dT r0 = r6.LLJLLIL
            if (r0 == 0) goto L98
            X.13dE r7 = r0.LIZLLL
            goto L1a
        L98:
            r7 = r8
            goto L18
        L9b:
            kotlin.jvm.functions.Function0<T> r0 = r10.LIZ
            java.lang.Object r0 = r0.invoke()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20056313dh.LJLJJLL(X.0u77):java.lang.Object");
    }

    @Override // X.InterfaceC20057413ds
    public final void LJZL(InterfaceC20062213ee interfaceC20062213ee) {
        InterfaceC1672410tcd interfaceC1672410tcd = this.LLJJ;
        if (!(interfaceC1672410tcd instanceof InterfaceC20057613du)) {
            C1696250uF5.LIZIZ("applyFocusProperties called on wrong node");
        }
        ((InterfaceC20057613du) interfaceC1672410tcd).LJIJ();
    }

    @Override // X.InterfaceC20051113cr
    public final void LLF(InterfaceC1692460u8y interfaceC1692460u8y) {
        C13WG c13wgLIZIZ = ((InterfaceC20057713dv) this.LLJJ).LIZIZ();
        C13WG c13wg = (C13WG) interfaceC1692460u8y;
        if (c13wgLIZIZ.LLILLL) {
            c13wg.LLILLL = true;
        }
        if (c13wgLIZIZ.LLILZ) {
            c13wg.LLILZ = true;
        }
        C19991913Kb<C1212320heY<?>, Object> c19991913Kb = c13wgLIZIZ.LL;
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
                            Object obj2 = objArr2[i4];
                            if (!c13wg.LL.LIZ((C1212320heY<?>) obj)) {
                                c13wg.LL.LJIIJJI((C1212320heY<?>) obj, obj2);
                            } else if (obj2 instanceof C1697110uGT) {
                                C1697110uGT c1697110uGT = (C1697110uGT) c13wg.LL.LIZLLL((C1212320heY<?>) obj);
                                C19991913Kb<C1212320heY<?>, Object> c19991913Kb2 = c13wg.LL;
                                String str = c1697110uGT.LIZ;
                                if (str == null) {
                                    str = ((C1697110uGT) obj2).LIZ;
                                }
                                InterfaceC1451105m9 interfaceC1451105m9 = c1697110uGT.LIZIZ;
                                if (interfaceC1451105m9 == null) {
                                    interfaceC1451105m9 = ((C1697110uGT) obj2).LIZIZ;
                                }
                                c19991913Kb2.LJIIJJI((C1212320heY<?>) obj, new C1697110uGT(str, interfaceC1451105m9));
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

    @Override // X.InterfaceC20056813dm
    public final void LLFF(j1 j1Var) {
        this.LLJJIJIIJIL = j1Var;
        InterfaceC1672410tcd interfaceC1672410tcd = this.LLJJ;
        if (interfaceC1672410tcd instanceof InterfaceC20058013dy) {
            ((InterfaceC20058013dy) interfaceC1672410tcd).LJFF();
        }
    }

    @Override // X.InterfaceC20051913cz
    public final void LLIIII(j1 j1Var) {
        ((InterfaceC20058313e1) this.LLJJ).LJIIJJI();
    }

    @Override // X.InterfaceC20051413cu
    public final void LLIIIZ(EnumC20061113eT enumC20061113eT) {
        InterfaceC1672410tcd interfaceC1672410tcd = this.LLJJ;
        if (!(interfaceC1672410tcd instanceof InterfaceC20057513dt)) {
            C1696250uF5.LIZIZ("onFocusEvent called on wrong node");
        }
        ((InterfaceC20057513dt) interfaceC1672410tcd).LJI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [X.13dd] */
    public final void LLJJ(boolean z) {
        boolean z2;
        if (!this.LLJILLL) {
            C1696250uF5.LIZIZ("initializeModifier called on unattached node");
        }
        InterfaceC1672410tcd interfaceC1672410tcd = this.LLJJ;
        if ((this.LLILLL & 32) != 0) {
            if (interfaceC1672410tcd instanceof InterfaceC1697560uHC) {
                C20052513d5.LJI(this).LJJI(new AwS574S0100000_30(this, 369));
            }
            if (interfaceC1672410tcd instanceof InterfaceC1685780tyC) {
                InterfaceC1685780tyC<?> interfaceC1685780tyC = (InterfaceC1685780tyC) interfaceC1672410tcd;
                C1691300u76 c1691300u76 = this.LLJJIII;
                if (c1691300u76 != null && c1691300u76.LIZ(interfaceC1685780tyC.getKey())) {
                    c1691300u76.LIZ = interfaceC1685780tyC;
                    C20056413di modifierLocalManager = C20052513d5.LJI(this).getModifierLocalManager();
                    C1691310u77<?> key = interfaceC1685780tyC.getKey();
                    modifierLocalManager.LIZIZ.LIZLLL(this);
                    modifierLocalManager.LIZJ.LIZLLL(key);
                    modifierLocalManager.LIZ();
                } else {
                    this.LLJJIII = new C1691300u76(interfaceC1685780tyC);
                    if (C20056513dj.LIZ(this)) {
                        C20056413di modifierLocalManager2 = C20052513d5.LJI(this).getModifierLocalManager();
                        C1691310u77<?> key2 = interfaceC1685780tyC.getKey();
                        modifierLocalManager2.LIZIZ.LIZLLL(this);
                        modifierLocalManager2.LIZJ.LIZLLL(key2);
                        modifierLocalManager2.LIZ();
                    }
                }
            }
        }
        if ((this.LLILLL & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (interfaceC1672410tcd instanceof InterfaceC20058413e2) {
                this.LLJJI = true;
            }
            if (!z) {
                C20052513d5.LIZLLL(this, 2).LLILLIZIL();
            }
        }
        if ((this.LLILLL & 2) != 0) {
            if (C20056513dj.LIZ(this)) {
                j1 j1Var = this.LLIZLLLIL;
                ((C20052713d7) j1Var).LLJJIJIIJIL(this);
                InterfaceC20054313dN interfaceC20054313dN = j1Var.LLJZIJLIL;
                if (interfaceC20054313dN != null) {
                    interfaceC20054313dN.invalidate();
                }
            }
            if (!z) {
                C20052513d5.LIZLLL(this, 2).LLILLIZIL();
                C20052513d5.LJFF(this).LJJJJI();
            }
        }
        if (interfaceC1672410tcd instanceof InterfaceC1690520u5q) {
            ((InterfaceC1690520u5q) interfaceC1672410tcd).LJIIJ(C20052513d5.LJFF(this));
        }
        if ((this.LLILLL & 128) != 0) {
            if ((interfaceC1672410tcd instanceof InterfaceC20058113dz) && C20056513dj.LIZ(this)) {
                C20052513d5.LJFF(this).LJJJJI();
            }
            if (interfaceC1672410tcd instanceof InterfaceC20058013dy) {
                this.LLJJIJIIJIL = null;
                if (C20056513dj.LIZ(this)) {
                    C20052513d5.LJI(this).LJIIIZ(new InterfaceC20052313d3() { // from class: X.13dd
                        @Override // X.InterfaceC20052313d3
                        public final void LIZ() {
                            C20056313dh c20056313dh = this.LL;
                            if (c20056313dh.LLJJIJIIJIL == null) {
                                c20056313dh.LLFF(C20052513d5.LIZLLL(c20056313dh, 128));
                            }
                        }
                    });
                }
            }
        }
        if ((this.LLILLL & 256) != 0 && (interfaceC1672410tcd instanceof InterfaceC20058313e1) && C20056513dj.LIZ(this)) {
            C20052513d5.LJFF(this).LJJJJI();
        }
        if (interfaceC1672410tcd instanceof InterfaceC20057013do) {
            ((InterfaceC20057013do) interfaceC1672410tcd).LIZJ().LIZ.LIZLLL(this);
        }
        if ((this.LLILLL & 16) != 0 && (interfaceC1672410tcd instanceof InterfaceC1672570tct)) {
            ((InterfaceC1672570tct) interfaceC1672410tcd).LJIIZILJ().LIZ = this.LLIZLLLIL;
        }
        if ((this.LLILLL & 8) != 0) {
            C20052513d5.LJI(this).LJIJJLI();
        }
    }

    @Override // X.InterfaceC20057313dr
    public final Object LJZ(InterfaceC1690500u5o interfaceC1690500u5o, Object obj) {
        return ((InterfaceC20058213e0) this.LLJJ).LJII();
    }

    @Override // X.InterfaceC20052813d8
    public final int LIZLLL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return ((InterfaceC20056613dk) this.LLJJ).LIZLLL(interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    @Override // X.InterfaceC20052813d8
    public final int LJIIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return ((InterfaceC20056613dk) this.LLJJ).LJIIL(interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    @Override // X.InterfaceC20052813d8
    public final InterfaceC1690350u5Z LJIILL(InterfaceC1689940u4u interfaceC1689940u4u, InterfaceC1673370teB interfaceC1673370teB, long j) {
        return ((InterfaceC20056613dk) this.LLJJ).LJIILL(interfaceC1689940u4u, interfaceC1673370teB, j);
    }

    @Override // X.InterfaceC20052813d8
    public final int LJIJJLI(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return ((InterfaceC20056613dk) this.LLJJ).LJIJJLI(interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    @Override // X.InterfaceC20052813d8
    public final int LJIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return ((InterfaceC20056613dk) this.LLJJ).LJIL(interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    @Override // X.InterfaceC20056213dg
    public final void LJJJZ(C20067313fT c20067313fT, EnumC20065813fE enumC20065813fE, long j) {
        ((InterfaceC1672570tct) this.LLJJ).LJIIZILJ().LIZJ(c20067313fT, enumC20065813fE);
    }
}
