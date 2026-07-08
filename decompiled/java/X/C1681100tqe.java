package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0tqe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1681100tqe extends AbstractC20055413dY implements InterfaceC20052813d8, InterfaceC1695680uEA, InterfaceC20051413cu {
    public int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public float LLJJIJI;
    public AnonymousClass0956 LLJJJIL;
    public C1695970uEd LLJJJJ;
    public final C05P0 LLJJJJJIL;
    public final C05P0 LLJJJJLIIL;
    public final C13YZ LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1676320tiw LLJJIJIIJIL = C1696870uG5.LIZ(0);
    public final InterfaceC1676320tiw LLJJIJIL = C1696870uG5.LIZ(0);
    public final C05P0 LLJJJ = C20028913Yh.LJI(Boolean.FALSE);
    public final C1677480tko<Float, C1677280tkU> LLJJL = C1677470tkn.LIZ(0.0f);

    @Override // X.InterfaceC20052813d8
    public final int LJIJJLI(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return 0;
    }

    @Override // X.InterfaceC1695680uEA
    public final /* synthetic */ void LJJLIIIJJIZ() {
    }

    @Override // X.AbstractC20055413dY
    public final void LLILZIL() {
        C1695970uEd c1695970uEd = this.LLJJJJ;
        InterfaceC1681130tqh graphicsContext = C20052513d5.LJI(this).getGraphicsContext();
        if (c1695970uEd != null) {
            graphicsContext.LIZ(c1695970uEd);
        }
        this.LLJJJJ = graphicsContext.LIZIZ();
        LLJJIJIIJIL();
    }

    @Override // X.AbstractC20055413dY
    public final void LLIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LLJJJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJJIL = null;
        C1695970uEd c1695970uEd = this.LLJJJJ;
        if (c1695970uEd != null) {
            C20052513d5.LJI(this).getGraphicsContext().LIZ(c1695970uEd);
            this.LLJJJJ = null;
        }
    }

    public final int LLJJ() {
        return this.LLJJIJIL.LIZLLL();
    }

    public final int LLJJI() {
        return this.LLJJIJIIJIL.LIZLLL();
    }

    public final float LLJJIII() {
        float fSignum = Math.signum(this.LLJJIJI);
        int i = C1681110tqf.LIZ[C20052513d5.LJFF(this).LLJJL.ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                throw new C1954807lC();
            }
            i2 = -1;
        }
        return fSignum * i2;
    }

    public final int LLJJIJI() {
        return ((Number) this.LLJJLIIIJLLLLLLLZ.getValue()).intValue();
    }

    public final void LLJJIJIIJIL() {
        AnonymousClass0956 anonymousClass0956 = this.LLJJJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (this.LLJILLL) {
            this.LLJJJIL = C23250099c.LIZLLL(LLILLIZIL(), null, null, new C1681090tqd(anonymousClass0956, this, null), 3);
        }
    }

    @Override // X.InterfaceC1695680uEA
    public final void LJJIFFI(InterfaceC1669010tX9 interfaceC1669010tX9) {
        boolean z;
        boolean z2;
        int iLLJJIJI;
        float fFloatValue = this.LLJJL.LIZLLL().floatValue() * LLJJIII();
        if (LLJJIII() != 1.0f ? this.LLJJL.LIZLLL().floatValue() < LLJJ() : this.LLJJL.LIZLLL().floatValue() < LLJJI()) {
            z = true;
        } else {
            z = false;
        }
        if (LLJJIII() != 1.0f ? this.LLJJL.LIZLLL().floatValue() > LLJJIJI() : this.LLJJL.LIZLLL().floatValue() > (LLJJI() + LLJJIJI()) - LLJJ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (LLJJIII() == 1.0f) {
            iLLJJIJI = LLJJI() + LLJJIJI();
        } else {
            iLLJJIJI = (-LLJJI()) - LLJJIJI();
        }
        float f = iLLJJIJI;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC1669010tX9.LIZIZ() & 4294967295L));
        C1695970uEd c1695970uEd = this.LLJJJJ;
        if (c1695970uEd != null) {
            interfaceC1669010tX9.LLIIZ(c1695970uEd, (((long) LLJJI()) << 32) | (((long) C814420VxA.LIZIZ(fIntBitsToFloat)) & 4294967295L), new AwS604S0100000_25(interfaceC1669010tX9, 577));
        }
        float fLLJJ = fFloatValue + LLJJ();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & interfaceC1669010tX9.LIZIZ()));
        C1695230uDR c1695230uDRLJLJI = interfaceC1669010tX9.LJLJI();
        long jLIZIZ = c1695230uDRLJLJI.LIZIZ();
        c1695230uDRLJLJI.LIZ().save();
        try {
            c1695230uDRLJLJI.LIZ.LIZJ(fFloatValue, 0.0f, fLLJJ, fIntBitsToFloat2, 1);
            C1695970uEd c1695970uEd2 = this.LLJJJJ;
            if (c1695970uEd2 != null) {
                if (z) {
                    C1695960uEc.LIZ(interfaceC1669010tX9, c1695970uEd2);
                }
                if (z2) {
                    interfaceC1669010tX9.LJLJI().LIZ.LJII(f, 0.0f);
                    try {
                        C1695960uEc.LIZ(interfaceC1669010tX9, c1695970uEd2);
                        interfaceC1669010tX9.LJLJI().LIZ.LJII(-f, -0.0f);
                    } finally {
                    }
                }
            } else {
                if (z) {
                    interfaceC1669010tX9.LLIIJLIL();
                }
                if (z2) {
                    interfaceC1669010tX9.LJLJI().LIZ.LJII(f, 0.0f);
                    try {
                        interfaceC1669010tX9.LLIIJLIL();
                        interfaceC1669010tX9.LJLJI().LIZ.LJII(-f, -0.0f);
                    } finally {
                    }
                }
            }
            c1695230uDRLJLJI.LIZ().LJIIJ();
            c1695230uDRLJLJI.LIZJ(jLIZIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1695230uDRLJLJI.LIZ().LJIIJ();
            c1695230uDRLJLJI.LIZJ(jLIZIZ);
            throw th;
        }
    }

    @Override // X.InterfaceC20051413cu
    public final void LLIIIZ(EnumC20061113eT enumC20061113eT) {
        boolean hasFocus = enumC20061113eT.getHasFocus();
        ((C13FE) this.LLJJJ).setValue(Boolean.valueOf(hasFocus));
    }

    @Override // X.InterfaceC20052813d8
    public final int LIZLLL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return interfaceC1676340tiy.LJJIJ(Integer.MAX_VALUE);
    }

    @Override // X.InterfaceC20052813d8
    public final int LJIIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return interfaceC1676340tiy.LJJIIZ(Integer.MAX_VALUE);
    }

    @Override // X.InterfaceC20052813d8
    public final InterfaceC1690350u5Z LJIILL(InterfaceC1689940u4u interfaceC1689940u4u, InterfaceC1673370teB interfaceC1673370teB, long j) {
        AbstractC1686530tzP abstractC1686530tzPLJJJJZ = interfaceC1673370teB.LJJJJZ(C1682380tsi.LIZ(C1682380tsi.LJIIJ(j), Integer.MAX_VALUE, C1682380tsi.LJIIIZ(j), C1682380tsi.LJII(j)));
        ((C13FG) this.LLJJIJIL).LJIIJ(C1682390tsj.LJI(abstractC1686530tzPLJJJJZ.LL, j));
        ((C13FG) this.LLJJIJIIJIL).LJIIJ(abstractC1686530tzPLJJJJZ.LL);
        return interfaceC1689940u4u.LJLJJL(LLJJ(), abstractC1686530tzPLJJJJZ.LLILLJJLI, C2097608Jq.LJ(), new AwS391S0200000_25(abstractC1686530tzPLJJJJZ, this, 204));
    }

    @Override // X.InterfaceC20052813d8
    public final int LJIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return interfaceC1676340tiy.LJJIL(i);
    }

    public C1681100tqe(int i, int i2, int i3, int i4, InterfaceC1667470tUf interfaceC1667470tUf, float f) {
        this.LLJJ = i;
        this.LLJJI = i3;
        this.LLJJIII = i4;
        this.LLJJIJI = f;
        this.LLJJJJJIL = C20028913Yh.LJI(interfaceC1667470tUf);
        this.LLJJJJLIIL = C20028913Yh.LJI(new C1681120tqg(i2));
        this.LLJJLIIIJLLLLLLLZ = C20028913Yh.LJ(new AwS426S0200000_25(interfaceC1667470tUf, this, 130));
    }
}
