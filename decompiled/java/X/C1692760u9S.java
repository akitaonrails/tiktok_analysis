package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0u9S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692760u9S extends AbstractC20055413dY implements InterfaceC20052813d8, InterfaceC1695680uEA, InterfaceC20051113cr {
    public String LLJJ;
    public C1693430uAX LLJJI;
    public InterfaceC594710NUf LLJJIII;
    public int LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public InterfaceC1691620u7c LLJJJIL;
    public Map<C115T, Integer> LLJJJJ;
    public C1692750u9R LLJJJJJIL;
    public AwS604S0100000_25 LLJJJJLIIL;
    public C1692780u9U LLJJL;

    @Override // X.InterfaceC20051113cr
    public final /* synthetic */ boolean LJJJJ() {
        return false;
    }

    @Override // X.InterfaceC1695680uEA
    public final /* synthetic */ void LJJLIIIJJIZ() {
    }

    @Override // X.InterfaceC20051113cr
    public final /* synthetic */ boolean LLIIJI() {
        return false;
    }

    @Override // X.AbstractC20055413dY
    public final boolean LLILLJJLI() {
        return false;
    }

    public final C1692750u9R LLJJI() {
        if (this.LLJJJJJIL == null) {
            this.LLJJJJJIL = new C1692750u9R(this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, this.LLJJIJIL, this.LLJJJ);
        }
        return this.LLJJJJJIL;
    }

    public static final void LLJJ(C1692760u9S c1692760u9S) {
        c1692760u9S.getClass();
        C20052513d5.LJFF(c1692760u9S).LJJJJIZL();
        C20052513d5.LJFF(c1692760u9S).LJJJJI();
        C1691800u7u.LIZ(c1692760u9S);
    }

    @Override // X.InterfaceC1695680uEA
    public final void LJJIFFI(InterfaceC1669010tX9 interfaceC1669010tX9) {
        C1692750u9R c1692750u9RLLJJI;
        long jLIZJ;
        if (!this.LLJILLL) {
            return;
        }
        C1692780u9U c1692780u9U = this.LLJJL;
        if (c1692780u9U == null || !c1692780u9U.LIZIZ || (c1692750u9RLLJJI = c1692780u9U.LIZJ) == null) {
            c1692750u9RLLJJI = LLJJI();
        }
        C1695170uDL c1695170uDL = c1692750u9RLLJJI.LJIIIZ;
        if (c1695170uDL != null) {
            InterfaceC1686290tz1 interfaceC1686290tz1LIZ = interfaceC1669010tX9.LJLJI().LIZ();
            boolean z = c1692750u9RLLJJI.LJIIJ;
            if (z) {
                long j = c1692750u9RLLJJI.LJIIJJI;
                interfaceC1686290tz1LIZ.save();
                interfaceC1686290tz1LIZ.LJIIIZ(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                C1693450uAZ c1693450uAZ = this.LLJJI.LIZ;
                C1693510uAf c1693510uAf = c1693450uAZ.LJIIL;
                if (c1693510uAf == null) {
                    c1693510uAf = C1693510uAf.LIZIZ;
                }
                C1693340uAO c1693340uAO = c1693450uAZ.LJIILIIL;
                if (c1693340uAO == null) {
                    c1693340uAO = C1693340uAO.LIZLLL;
                }
                AbstractC1695860uES abstractC1695860uES = c1693450uAZ.LJIILL;
                if (abstractC1695860uES == null) {
                    abstractC1695860uES = C1695700uEC.LIZ;
                }
                AbstractC1668700tWe abstractC1668700tWeLIZJ = c1693450uAZ.LIZJ();
                if (abstractC1668700tWeLIZJ != null) {
                    float fLIZIZ = this.LLJJI.LIZ.LIZIZ();
                    InterfaceC1675870tiD.LLILL.getClass();
                    c1695170uDL.LJII(interfaceC1686290tz1LIZ, abstractC1668700tWeLIZJ, fLIZIZ, c1693340uAO, c1693510uAf, abstractC1695860uES, C1668240tVu.LIZIZ);
                } else {
                    InterfaceC1691620u7c interfaceC1691620u7c = this.LLJJJIL;
                    if (interfaceC1691620u7c != null) {
                        jLIZJ = interfaceC1691620u7c.LIZ();
                    } else {
                        jLIZJ = C1685910tyP.LJIIJ;
                    }
                    if (jLIZJ == 16) {
                        if (this.LLJJI.LIZJ() != 16) {
                            jLIZJ = this.LLJJI.LIZJ();
                        } else {
                            jLIZJ = C1685910tyP.LIZIZ;
                        }
                    }
                    InterfaceC1675870tiD.LLILL.getClass();
                    c1695170uDL.LJI(interfaceC1686290tz1LIZ, jLIZJ, c1693340uAO, c1693510uAf, abstractC1695860uES, C1668240tVu.LIZIZ);
                }
                if (z) {
                    interfaceC1686290tz1LIZ.LJIIJ();
                    return;
                }
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (z) {
                    interfaceC1686290tz1LIZ.LJIIJ();
                }
                throw th;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("no paragraph (layoutCache=");
        sbLIZ.append(this.LLJJJJJIL);
        sbLIZ.append(", textSubstitution=");
        sbLIZ.append(this.LLJJL);
        sbLIZ.append(')');
        C1691080u6k.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        throw new C2197108jB();
    }

    @Override // X.InterfaceC20051113cr
    public final void LLF(InterfaceC1692460u8y interfaceC1692460u8y) {
        AwS604S0100000_25 awS604S0100000_25 = this.LLJJJJLIIL;
        if (awS604S0100000_25 == null) {
            awS604S0100000_25 = new AwS604S0100000_25(this, 0);
            this.LLJJJJLIIL = awS604S0100000_25;
        }
        C1692220u8a c1692220u8a = new C1692220u8a(this.LLJJ);
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1696490uFT.LIZ;
        interfaceC1692460u8y.LIZJ(C1696500uFU.LJJII, Collections.singletonList(c1692220u8a));
        C1692780u9U c1692780u9U = this.LLJJL;
        if (c1692780u9U != null) {
            boolean z = c1692780u9U.LIZIZ;
            C1212320heY<Boolean> c1212320heY = C1696500uFU.LJJIIJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C1696490uFT.LIZ;
            Boolean boolValueOf = Boolean.valueOf(z);
            c1212320heY.getClass();
            interfaceC1692460u8y.LIZJ(c1212320heY, boolValueOf);
            C1692220u8a c1692220u8a2 = new C1692220u8a(c1692780u9U.LIZ);
            C1212320heY<C1692220u8a> c1212320heY2 = C1696500uFU.LJJIII;
            c1212320heY2.getClass();
            interfaceC1692460u8y.LIZJ(c1212320heY2, c1692220u8a2);
        }
        interfaceC1692460u8y.LIZJ(C1694480uCE.LJIIJ, new C1697110uGT(null, new AwS604S0100000_25(this, 1)));
        interfaceC1692460u8y.LIZJ(C1694480uCE.LJIIJJI, new C1697110uGT(null, new AwS604S0100000_25(this, 2)));
        interfaceC1692460u8y.LIZJ(C1694480uCE.LJIIL, new C1697110uGT(null, new AwS569S0100000_25(this, 3)));
        interfaceC1692460u8y.LIZJ(C1694480uCE.LIZ, new C1697110uGT(null, awS604S0100000_25));
    }

    @Override // X.InterfaceC20052813d8
    public final int LIZLLL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        C1692750u9R c1692750u9RLLJJI;
        C1692780u9U c1692780u9U = this.LLJJL;
        if (c1692780u9U == null || !c1692780u9U.LIZIZ || (c1692750u9RLLJJI = c1692780u9U.LIZJ) == null) {
            c1692750u9RLLJJI = LLJJI();
        }
        c1692750u9RLLJJI.LIZLLL(interfaceC1676350tiz);
        return c1692750u9RLLJJI.LIZ(i, interfaceC1676350tiz.getLayoutDirection());
    }

    @Override // X.InterfaceC20052813d8
    public final int LJIIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        C1692750u9R c1692750u9RLLJJI;
        C1692780u9U c1692780u9U = this.LLJJL;
        if (c1692780u9U == null || !c1692780u9U.LIZIZ || (c1692750u9RLLJJI = c1692780u9U.LIZJ) == null) {
            c1692750u9RLLJJI = LLJJI();
        }
        c1692750u9RLLJJI.LIZLLL(interfaceC1676350tiz);
        return c1692750u9RLLJJI.LIZ(i, interfaceC1676350tiz.getLayoutDirection());
    }

    @Override // X.InterfaceC20052813d8
    public final InterfaceC1690350u5Z LJIILL(InterfaceC1689940u4u interfaceC1689940u4u, InterfaceC1673370teB interfaceC1673370teB, long j) {
        C1692750u9R c1692750u9RLLJJI;
        boolean z;
        boolean z2;
        InterfaceC1692630u9F interfaceC1692630u9F;
        C1692780u9U c1692780u9U = this.LLJJL;
        if (c1692780u9U == null || !c1692780u9U.LIZIZ || (c1692750u9RLLJJI = c1692780u9U.LIZJ) == null) {
            c1692750u9RLLJJI = LLJJI();
        }
        c1692750u9RLLJJI.LIZLLL(interfaceC1689940u4u);
        EnumC1671200tag layoutDirection = interfaceC1689940u4u.getLayoutDirection();
        boolean z3 = true;
        if (c1692750u9RLLJJI.LJI > 1) {
            j = C1692750u9R.LJFF(c1692750u9RLLJJI, j, layoutDirection);
        }
        C1695170uDL c1695170uDL = c1692750u9RLLJJI.LJIIIZ;
        if (c1695170uDL == null || (interfaceC1692630u9F = c1692750u9RLLJJI.LJIILIIL) == null || interfaceC1692630u9F.LIZ() || layoutDirection != c1692750u9RLLJJI.LJIILJJIL || (!C1682380tsi.LIZJ(j, c1692750u9RLLJJI.LJIILL) && (C1682380tsi.LJIIIIZZ(j) != C1682380tsi.LJIIIIZZ(c1692750u9RLLJJI.LJIILL) || C1682380tsi.LJIIJ(j) != C1682380tsi.LJIIJ(c1692750u9RLLJJI.LJIILL) || C1682380tsi.LJII(j) < c1695170uDL.getHeight() || c1695170uDL.LIZLLL.LJ))) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (!C1682380tsi.LIZJ(j, c1692750u9RLLJJI.LJIILL)) {
                C1695170uDL c1695170uDL2 = c1692750u9RLLJJI.LJIIIZ;
                c1692750u9RLLJJI.LJIIJJI = C1682390tsj.LIZLLL(j, (((long) C1691570u7X.LIZ(c1695170uDL2.getHeight())) & 4294967295L) | (((long) C1691570u7X.LIZ(Math.min(c1695170uDL2.LJJIII(), c1695170uDL2.getWidth()))) << 32));
                if (c1692750u9RLLJJI.LIZLLL == 3 || (((int) (r0 >> 32)) >= c1695170uDL2.getWidth() && ((int) (r0 & 4294967295L)) >= c1695170uDL2.getHeight())) {
                    z3 = false;
                }
                c1692750u9RLLJJI.LJIIJ = z3;
                c1692750u9RLLJJI.LJIILL = j;
            }
            z3 = false;
        } else {
            C1695170uDL c1695170uDLLIZIZ = c1692750u9RLLJJI.LIZIZ(j, layoutDirection);
            c1692750u9RLLJJI.LJIILL = j;
            c1692750u9RLLJJI.LJIIJJI = C1682390tsj.LIZLLL(j, (((long) C1691570u7X.LIZ(c1695170uDLLIZIZ.getHeight())) & 4294967295L) | (((long) C1691570u7X.LIZ(c1695170uDLLIZIZ.getWidth())) << 32));
            if (c1692750u9RLLJJI.LIZLLL != 3 && (((int) (r2 >> 32)) < c1695170uDLLIZIZ.getWidth() || ((int) (r2 & 4294967295L)) < c1695170uDLLIZIZ.getHeight())) {
                z2 = true;
            } else {
                z2 = false;
            }
            c1692750u9RLLJJI.LJIIJ = z2;
            c1692750u9RLLJJI.LJIIIZ = c1695170uDLLIZIZ;
        }
        InterfaceC1692630u9F interfaceC1692630u9F2 = c1692750u9RLLJJI.LJIILIIL;
        if (interfaceC1692630u9F2 != null) {
            interfaceC1692630u9F2.LIZ();
        }
        C1695170uDL c1695170uDL3 = c1692750u9RLLJJI.LJIIIZ;
        long j2 = c1692750u9RLLJJI.LJIIJJI;
        if (z3) {
            C20052513d5.LIZLLL(this, 2).LLILLIZIL();
            Map map = this.LLJJJJ;
            if (map == null) {
                map = new HashMap(2);
                this.LLJJJJ = map;
            }
            map.put(C115R.LIZ, Integer.valueOf(Math.round(c1695170uDL3.LIZLLL.LIZJ(0))));
            map.put(C115R.LIZIZ, Integer.valueOf(Math.round(c1695170uDL3.LIZJ())));
        }
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        return interfaceC1689940u4u.LJLJJL(i, i2, this.LLJJJJ, new AwS604S0100000_25(interfaceC1673370teB.LJJJJZ(C1682400tsk.LIZIZ(i, i, i2, i2)), 3));
    }

    @Override // X.InterfaceC20052813d8
    public final int LJIJJLI(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        C1692750u9R c1692750u9RLLJJI;
        C1692780u9U c1692780u9U = this.LLJJL;
        if (c1692780u9U == null || !c1692780u9U.LIZIZ || (c1692750u9RLLJJI = c1692780u9U.LIZJ) == null) {
            c1692750u9RLLJJI = LLJJI();
        }
        c1692750u9RLLJJI.LIZLLL(interfaceC1676350tiz);
        return C1691570u7X.LIZ(c1692750u9RLLJJI.LJ(interfaceC1676350tiz.getLayoutDirection()).LIZIZ());
    }

    @Override // X.InterfaceC20052813d8
    public final int LJIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        C1692750u9R c1692750u9RLLJJI;
        C1692780u9U c1692780u9U = this.LLJJL;
        if (c1692780u9U == null || !c1692780u9U.LIZIZ || (c1692750u9RLLJJI = c1692780u9U.LIZJ) == null) {
            c1692750u9RLLJJI = LLJJI();
        }
        c1692750u9RLLJJI.LIZLLL(interfaceC1676350tiz);
        return C1691570u7X.LIZ(c1692750u9RLLJJI.LJ(interfaceC1676350tiz.getLayoutDirection()).LIZJ());
    }

    public C1692760u9S(String str, C1693430uAX c1693430uAX, InterfaceC594710NUf interfaceC594710NUf, int i, boolean z, int i2, int i3, InterfaceC1691620u7c interfaceC1691620u7c) {
        this.LLJJ = str;
        this.LLJJI = c1693430uAX;
        this.LLJJIII = interfaceC594710NUf;
        this.LLJJIJI = i;
        this.LLJJIJIIJIL = z;
        this.LLJJIJIL = i2;
        this.LLJJJ = i3;
        this.LLJJJIL = interfaceC1691620u7c;
    }
}
