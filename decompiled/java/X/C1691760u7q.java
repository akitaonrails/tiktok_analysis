package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u7q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691760u7q extends AbstractC20055413dY implements InterfaceC20052813d8, InterfaceC1695680uEA, InterfaceC20051113cr {
    public C1692220u8a LLJJ;
    public C1693430uAX LLJJI;
    public InterfaceC594710NUf LLJJIII;
    public Function1<? super C1692150u8T, Unit> LLJJIJI;
    public int LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public List<C1692270u8f<C1680210tpD>> LLJJJJ;
    public Function1<? super List<C1683130ttv>, Unit> LLJJJJJIL;
    public C1691850u7z LLJJJJLIIL;
    public InterfaceC1691620u7c LLJJL;
    public InterfaceC1691630u7d LLJJLIIIJLLLLLLLZ;
    public Function1<? super C1691710u7l, Unit> LLJL;
    public Map<C115T, Integer> LLJLIL;
    public C1691770u7r LLJLILLLLZIIL;
    public AwS604S0100000_25 LLJLL;
    public C1691710u7l LLJLLIL;

    public C1691760u7q() {
        throw null;
    }

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

    public final C1691770u7r LLJJIII() {
        if (this.LLJLILLLLZIIL == null) {
            this.LLJLILLLLZIIL = new C1691770u7r(this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJIIJIL, this.LLJJIJIL, this.LLJJJ, this.LLJJJIL, this.LLJJJJ, this.LLJJLIIIJLLLLLLLZ);
        }
        return this.LLJLILLLLZIIL;
    }

    public static final void LLJJ(C1691760u7q c1691760u7q) {
        c1691760u7q.getClass();
        C20052513d5.LJFF(c1691760u7q).LJJJJIZL();
        C20052513d5.LJFF(c1691760u7q).LJJJJI();
        C1691800u7u.LIZ(c1691760u7q);
    }

    @Override // X.InterfaceC1695680uEA
    public final void LJJIFFI(InterfaceC1669010tX9 interfaceC1669010tX9) {
        boolean z;
        long jLIZJ;
        List<C1692270u8f<C1680210tpD>> list;
        C1692450u8x c1692450u8xLIZIZ;
        int i;
        int i2;
        int iLIZ;
        C1695950uEb c1695950uEbLJIILJJIL;
        if (!this.LLJILLL) {
            return;
        }
        C1691850u7z c1691850u7z = this.LLJJJJLIIL;
        if (c1691850u7z != null && (c1692450u8xLIZIZ = c1691850u7z.LLILLJJLI.LJI().LIZIZ(c1691850u7z.LL)) != null) {
            if (!c1692450u8xLIZIZ.LIZJ) {
                i = c1692450u8xLIZIZ.LIZ.LIZ;
                i2 = c1692450u8xLIZIZ.LIZIZ.LIZ;
            } else {
                i = c1692450u8xLIZIZ.LIZIZ.LIZ;
                i2 = c1692450u8xLIZIZ.LIZ.LIZ;
            }
            if (i != i2) {
                InterfaceC1691900u84 interfaceC1691900u84 = c1691850u7z.LLILZIL;
                if (interfaceC1691900u84 != null) {
                    iLIZ = interfaceC1691900u84.LIZ();
                } else {
                    iLIZ = 0;
                }
                if (i > iLIZ) {
                    i = iLIZ;
                }
                if (i2 > iLIZ) {
                    i2 = iLIZ;
                }
                C1692150u8T c1692150u8T = c1691850u7z.LLILZ.LIZIZ;
                if (c1692150u8T != null && (c1695950uEbLJIILJJIL = c1692150u8T.LJIILJJIL(i, i2)) != null) {
                    C1692150u8T c1692150u8T2 = c1691850u7z.LLILZ.LIZIZ;
                    if (c1692150u8T2 != null && c1692150u8T2.LIZ.LJFF != 3 && c1692150u8T2.LJ()) {
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC1669010tX9.LIZIZ() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC1669010tX9.LIZIZ() & 4294967295L));
                        C1695230uDR c1695230uDRLJLJI = interfaceC1669010tX9.LJLJI();
                        long jLIZIZ = c1695230uDRLJLJI.LIZIZ();
                        c1695230uDRLJLJI.LIZ().save();
                        try {
                            c1695230uDRLJLJI.LIZ.LIZJ(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                            C1675860tiC.LJIIIIZZ(interfaceC1669010tX9, c1695950uEbLJIILJJIL, c1691850u7z.LLILLL, 0.0f, null, 60);
                            c1695230uDRLJLJI.LIZ().LJIIJ();
                            c1695230uDRLJLJI.LIZJ(jLIZIZ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c1695230uDRLJLJI.LIZ().LJIIJ();
                            c1695230uDRLJLJI.LIZJ(jLIZIZ);
                            throw th;
                        }
                    } else {
                        C1675860tiC.LJIIIIZZ(interfaceC1669010tX9, c1695950uEbLJIILJJIL, c1691850u7z.LLILLL, 0.0f, null, 60);
                    }
                }
            }
        }
        InterfaceC1686290tz1 interfaceC1686290tz1LIZ = interfaceC1669010tX9.LJLJI().LIZ();
        C1692150u8T c1692150u8T3 = LLJJIJI(interfaceC1669010tX9).LJIILJJIL;
        if (c1692150u8T3 != null) {
            C1692200u8Y c1692200u8Y = c1692150u8T3.LIZIZ;
            if (c1692150u8T3.LJ() && this.LLJJIJIIJIL != 3) {
                z = true;
                long j = c1692150u8T3.LIZJ;
                C1683130ttv c1683130ttvLIZJ = C1671570tbH.LIZJ(0L, (4294967295L & ((long) Float.floatToRawIntBits((int) (j & 4294967295L)))) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32));
                interfaceC1686290tz1LIZ.save();
                C1686300tz2.LIZIZ(interfaceC1686290tz1LIZ, c1683130ttvLIZJ);
            } else {
                z = false;
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
                    C1692200u8Y.LJIIJJI(c1692200u8Y, interfaceC1686290tz1LIZ, abstractC1668700tWeLIZJ, this.LLJJI.LIZ.LIZIZ(), c1693340uAO, c1693510uAf, abstractC1695860uES);
                } else {
                    InterfaceC1691620u7c interfaceC1691620u7c = this.LLJJL;
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
                    C1692200u8Y.LJIIIZ(c1692200u8Y, interfaceC1686290tz1LIZ, jLIZJ, c1693340uAO, c1693510uAf, abstractC1695860uES);
                }
                if (z) {
                    interfaceC1686290tz1LIZ.LJIIJ();
                }
                C1691710u7l c1691710u7l = this.LLJLLIL;
                if (((c1691710u7l != null && c1691710u7l.LIZJ) || !C1691690u7j.LIZ(this.LLJJ)) && ((list = this.LLJJJJ) == null || list.isEmpty())) {
                    return;
                }
                interfaceC1669010tX9.LLIIJLIL();
                return;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                if (z) {
                    interfaceC1686290tz1LIZ.LJIIJ();
                }
                throw th2;
            }
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    @Override // X.InterfaceC20051113cr
    public final void LLF(InterfaceC1692460u8y interfaceC1692460u8y) {
        AwS604S0100000_25 awS604S0100000_25 = this.LLJLL;
        if (awS604S0100000_25 == null) {
            awS604S0100000_25 = new AwS604S0100000_25(this, 11);
            this.LLJLL = awS604S0100000_25;
        }
        C1692220u8a c1692220u8a = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1696490uFT.LIZ;
        interfaceC1692460u8y.LIZJ(C1696500uFU.LJJII, Collections.singletonList(c1692220u8a));
        C1691710u7l c1691710u7l = this.LLJLLIL;
        if (c1691710u7l != null) {
            C1692220u8a c1692220u8a2 = c1691710u7l.LIZIZ;
            C1212320heY<C1692220u8a> c1212320heY = C1696500uFU.LJJIII;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C1696490uFT.LIZ;
            c1212320heY.getClass();
            interfaceC1692460u8y.LIZJ(c1212320heY, c1692220u8a2);
            boolean z = c1691710u7l.LIZJ;
            C1212320heY<Boolean> c1212320heY2 = C1696500uFU.LJJIIJ;
            Boolean boolValueOf = Boolean.valueOf(z);
            c1212320heY2.getClass();
            interfaceC1692460u8y.LIZJ(c1212320heY2, boolValueOf);
        }
        interfaceC1692460u8y.LIZJ(C1694480uCE.LJIIJ, new C1697110uGT(null, new AwS604S0100000_25(this, 12)));
        interfaceC1692460u8y.LIZJ(C1694480uCE.LJIIJJI, new C1697110uGT(null, new AwS604S0100000_25(this, 13)));
        interfaceC1692460u8y.LIZJ(C1694480uCE.LJIIL, new C1697110uGT(null, new AwS569S0100000_25(this, 14)));
        interfaceC1692460u8y.LIZJ(C1694480uCE.LIZ, new C1697110uGT(null, awS604S0100000_25));
    }

    public final C1691770u7r LLJJIJI(InterfaceC1690500u5o interfaceC1690500u5o) {
        C1691770u7r c1691770u7r;
        C1691710u7l c1691710u7l = this.LLJLLIL;
        if (c1691710u7l != null && c1691710u7l.LIZJ && (c1691770u7r = c1691710u7l.LIZLLL) != null) {
            c1691770u7r.LIZJ(interfaceC1690500u5o);
            return c1691770u7r;
        }
        C1691770u7r c1691770u7rLLJJIII = LLJJIII();
        c1691770u7rLLJJIII.LIZJ(interfaceC1690500u5o);
        return c1691770u7rLLJJIII;
    }

    public final boolean LLJJJ(C1692220u8a c1692220u8a) {
        boolean z = !Intrinsics.LJFF(this.LLJJ.LLILLJJLI, c1692220u8a.LLILLJJLI);
        boolean z2 = !Intrinsics.LJFF(this.LLJJ.LL, c1692220u8a.LL);
        if (!z && !z2) {
            return false;
        }
        this.LLJJ = c1692220u8a;
        if (!z) {
            return true;
        }
        this.LLJLLIL = null;
        return true;
    }

    @Override // X.InterfaceC20052813d8
    public final int LIZLLL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return LLJJIJI(interfaceC1676350tiz).LIZ(i, interfaceC1676350tiz.getLayoutDirection());
    }

    @Override // X.InterfaceC20052813d8
    public final int LJIIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return LLJJIJI(interfaceC1676350tiz).LIZ(i, interfaceC1676350tiz.getLayoutDirection());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0172  */
    @Override // X.InterfaceC20052813d8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1690350u5Z LJIILL(X.InterfaceC1689940u4u r30, X.InterfaceC1673370teB r31, long r32) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1691760u7q.LJIILL(X.0u4u, X.0teB, long):X.0u5Z");
    }

    @Override // X.InterfaceC20052813d8
    public final int LJIJJLI(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return C1691570u7X.LIZ(LLJJIJI(interfaceC1676350tiz).LIZLLL(interfaceC1676350tiz.getLayoutDirection()).LIZIZ());
    }

    @Override // X.InterfaceC20052813d8
    public final int LJIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return C1691570u7X.LIZ(LLJJIJI(interfaceC1676350tiz).LIZLLL(interfaceC1676350tiz.getLayoutDirection()).LIZJ());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJI(boolean r11, boolean r12, boolean r13, boolean r14) {
        /*
            r10 = this;
            if (r12 != 0) goto L6
            if (r13 != 0) goto L6
            if (r14 == 0) goto L3b
        L6:
            X.0u7r r8 = r10.LLJJIII()
            X.0u8a r9 = r10.LLJJ
            X.0uAX r7 = r10.LLJJI
            X.0NUf r6 = r10.LLJJIII
            int r5 = r10.LLJJIJIIJIL
            boolean r4 = r10.LLJJIJIL
            int r3 = r10.LLJJJ
            int r2 = r10.LLJJJIL
            java.util.List<X.0u8f<X.0tpD>> r1 = r10.LLJJJJ
            X.0u7d r0 = r10.LLJJLIIIJLLLLLLLZ
            r8.LIZ = r9
            r8.LJ(r7)
            r8.LIZIZ = r6
            r8.LIZJ = r5
            r8.LIZLLL = r4
            r8.LJ = r3
            r8.LJFF = r2
            r8.LJI = r1
            r8.LJII = r0
            r1 = 0
            r8.LJIIL = r1
            r8.LJIILJJIL = r1
            r0 = -1
            r8.LJIILLIIL = r0
            r8.LJIILL = r0
            r8.LJIIZILJ = r1
        L3b:
            boolean r0 = r10.LLJILLL
            if (r0 != 0) goto L40
            return
        L40:
            if (r12 != 0) goto L48
            if (r11 == 0) goto L51
            kotlin.jvm.internal.AwS604S0100000_25 r0 = r10.LLJLL
            if (r0 == 0) goto L51
        L48:
            X.13dH r0 = X.C20052513d5.LJFF(r10)
            r0.LJJJJIZL()
            if (r12 != 0) goto L55
        L51:
            if (r13 != 0) goto L55
            if (r14 == 0) goto L5f
        L55:
            X.13dH r0 = X.C20052513d5.LJFF(r10)
            r0.LJJJJI()
            X.C1691800u7u.LIZ(r10)
        L5f:
            if (r11 == 0) goto L64
            X.C1691800u7u.LIZ(r10)
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1691760u7q.LLJJI(boolean, boolean, boolean, boolean):void");
    }

    public final boolean LLJJIJIIJIL(Function1<? super C1692150u8T, Unit> function1, Function1<? super List<C1683130ttv>, Unit> function12, C1691850u7z c1691850u7z, Function1<? super C1691710u7l, Unit> function13) {
        boolean z;
        if (this.LLJJIJI != function1) {
            this.LLJJIJI = function1;
            z = true;
        } else {
            z = false;
        }
        if (this.LLJJJJJIL != function12) {
            this.LLJJJJJIL = function12;
            z = true;
        }
        if (!Intrinsics.LJFF(this.LLJJJJLIIL, c1691850u7z)) {
            this.LLJJJJLIIL = c1691850u7z;
            z = true;
        }
        if (this.LLJL != function13) {
            this.LLJL = function13;
            return true;
        }
        return z;
    }

    public final boolean LLJJIJIL(C1693430uAX c1693430uAX, List<C1692270u8f<C1680210tpD>> list, int i, int i2, boolean z, InterfaceC594710NUf interfaceC594710NUf, int i3, InterfaceC1691630u7d interfaceC1691630u7d) {
        boolean z2 = !this.LLJJI.LIZLLL(c1693430uAX);
        this.LLJJI = c1693430uAX;
        if (!Intrinsics.LJFF(this.LLJJJJ, list)) {
            this.LLJJJJ = list;
            z2 = true;
        }
        if (this.LLJJJIL != i) {
            this.LLJJJIL = i;
            z2 = true;
        }
        if (this.LLJJJ != i2) {
            this.LLJJJ = i2;
            z2 = true;
        }
        if (this.LLJJIJIL != z) {
            this.LLJJIJIL = z;
            z2 = true;
        }
        if (!Intrinsics.LJFF(this.LLJJIII, interfaceC594710NUf)) {
            this.LLJJIII = interfaceC594710NUf;
            z2 = true;
        }
        if (this.LLJJIJIIJIL != i3) {
            this.LLJJIJIIJIL = i3;
            z2 = true;
        }
        if (!Intrinsics.LJFF(this.LLJJLIIIJLLLLLLLZ, interfaceC1691630u7d)) {
            this.LLJJLIIIJLLLLLLLZ = interfaceC1691630u7d;
            return true;
        }
        return z2;
    }

    public C1691760u7q(C1692220u8a c1692220u8a, C1693430uAX c1693430uAX, InterfaceC594710NUf interfaceC594710NUf, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, C1691850u7z c1691850u7z, InterfaceC1691620u7c interfaceC1691620u7c, InterfaceC1691630u7d interfaceC1691630u7d, Function1 function13) {
        this.LLJJ = c1692220u8a;
        this.LLJJI = c1693430uAX;
        this.LLJJIII = interfaceC594710NUf;
        this.LLJJIJI = function1;
        this.LLJJIJIIJIL = i;
        this.LLJJIJIL = z;
        this.LLJJJ = i2;
        this.LLJJJIL = i3;
        this.LLJJJJ = list;
        this.LLJJJJJIL = function12;
        this.LLJJJJLIIL = c1691850u7z;
        this.LLJJL = interfaceC1691620u7c;
        this.LLJJLIIIJLLLLLLLZ = interfaceC1691630u7d;
        this.LLJL = function13;
    }
}
