package X;

import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tpz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1680690tpz extends AbstractC20055413dY implements InterfaceC1695680uEA, InterfaceC20062713ej {
    public long LLJJ;
    public AbstractC1668700tWe LLJJI;
    public float LLJJIII;
    public InterfaceC1680710tq1 LLJJIJI;
    public long LLJJIJIIJIL = 9205357640488583168L;
    public EnumC1671200tag LLJJIJIL;
    public AbstractC1680810tqB LLJJJ;
    public InterfaceC1680710tq1 LLJJJIL;
    public AbstractC1680810tqB LLJJJJ;

    @Override // X.InterfaceC1695680uEA
    public final /* synthetic */ void LJJLIIIJJIZ() {
    }

    @Override // X.InterfaceC20062713ej
    public final void LLIILZL() {
        this.LLJJIJIIJIL = 9205357640488583168L;
        this.LLJJIJIL = null;
        this.LLJJJ = null;
        this.LLJJJIL = null;
        C1691800u7u.LIZ(this);
    }

    @Override // X.InterfaceC1695680uEA
    public final void LJJIFFI(InterfaceC1669010tX9 interfaceC1669010tX9) {
        AbstractC1680810tqB abstractC1680810tqB;
        InterfaceC1680960tqQ interfaceC1680960tqQ;
        if (this.LLJJIJI == C1669430tXp.LIZ) {
            if (!C1685910tyP.LJ(this.LLJJ, C1685910tyP.LJIIJ)) {
                C1675860tiC.LJIIJ(interfaceC1669010tX9, this.LLJJ, 0L, 0L, 0.0f, null, null, 0, 126);
            }
            AbstractC1668700tWe abstractC1668700tWe = this.LLJJI;
            if (abstractC1668700tWe != null) {
                C1675860tiC.LJIIIZ(interfaceC1669010tX9, abstractC1668700tWe, 0L, 0L, this.LLJJIII, null, 0, 118);
            }
        } else {
            if (C1680770tq7.LIZ(interfaceC1669010tX9.LIZIZ(), this.LLJJIJIIJIL) && interfaceC1669010tX9.getLayoutDirection() == this.LLJJIJIL && Intrinsics.LJFF(this.LLJJJIL, this.LLJJIJI)) {
                abstractC1680810tqB = this.LLJJJ;
            } else {
                C20060813eQ.LIZ(this, new AwS426S0200000_25(this, interfaceC1669010tX9, 129));
                abstractC1680810tqB = this.LLJJJJ;
                this.LLJJJJ = null;
            }
            this.LLJJJ = abstractC1680810tqB;
            this.LLJJIJIIJIL = interfaceC1669010tX9.LIZIZ();
            this.LLJJIJIL = interfaceC1669010tX9.getLayoutDirection();
            this.LLJJJIL = this.LLJJIJI;
            if (!C1685910tyP.LJ(this.LLJJ, C1685910tyP.LJIIJ)) {
                C1680700tq0.LIZ(interfaceC1669010tX9, abstractC1680810tqB, this.LLJJ);
            }
            AbstractC1668700tWe abstractC1668700tWe2 = this.LLJJI;
            if (abstractC1668700tWe2 != null) {
                float f = this.LLJJIII;
                C1695700uEC c1695700uEC = C1695700uEC.LIZ;
                InterfaceC1675870tiD.LLILL.getClass();
                int i = C1668240tVu.LIZIZ;
                if (abstractC1680810tqB instanceof C1680780tq8) {
                    C1683130ttv c1683130ttv = ((C1680780tq8) abstractC1680810tqB).LIZ;
                    float f2 = c1683130ttv.LIZ;
                    interfaceC1669010tX9.LJLIIIL(abstractC1668700tWe2, (4294967295L & ((long) Float.floatToRawIntBits(c1683130ttv.LIZIZ))) | (Float.floatToRawIntBits(f2) << 32), C1680700tq0.LIZIZ(c1683130ttv), f, c1695700uEC, null, i);
                } else {
                    if (abstractC1680810tqB instanceof C1680730tq3) {
                        C1680730tq3 c1680730tq3 = (C1680730tq3) abstractC1680810tqB;
                        interfaceC1680960tqQ = c1680730tq3.LIZIZ;
                        if (interfaceC1680960tqQ == null) {
                            C1680760tq6 c1680760tq6 = c1680730tq3.LIZ;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (c1680760tq6.LJII >> 32));
                            float f3 = c1680760tq6.LIZ;
                            interfaceC1669010tX9.LJJJJI(abstractC1668700tWe2, (((long) Float.floatToRawIntBits(c1680760tq6.LIZIZ)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32), C1680700tq0.LIZJ(c1680760tq6), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), f, c1695700uEC, null, i);
                        }
                    } else if (abstractC1680810tqB instanceof C1680800tqA) {
                        interfaceC1680960tqQ = ((C1680800tqA) abstractC1680810tqB).LIZ;
                    } else {
                        throw new C1954807lC();
                    }
                    interfaceC1669010tX9.LJJIJIIJI(interfaceC1680960tqQ, abstractC1668700tWe2, f, c1695700uEC, null, i);
                }
            }
        }
        interfaceC1669010tX9.LLIIJLIL();
    }

    public C1680690tpz(long j, AbstractC1668700tWe abstractC1668700tWe, float f, InterfaceC1680710tq1 interfaceC1680710tq1) {
        this.LLJJ = j;
        this.LLJJI = abstractC1668700tWe;
        this.LLJJIII = f;
        this.LLJJIJI = interfaceC1680710tq1;
    }
}
