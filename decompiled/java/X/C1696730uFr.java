package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0uFr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1696730uFr extends AbstractC1676270tir {
    public final C05P0 LLILZLL;
    public final C05P0 LLIZ;
    public final C1696710uFp LLIZLLLIL;
    public final InterfaceC1676320tiw LLJ;
    public float LLJI;
    public C1685400txa LLJIJIL;
    public int LLJILJIL;

    public C1696730uFr() {
        this(new C1696720uFq());
    }

    @Override // X.AbstractC1676270tir
    public final long LJIIIIZZ() {
        return ((C1680770tq7) ((C13FE) this.LLILZLL).getValue()).LIZ;
    }

    public C1696730uFr(C1696720uFq c1696720uFq) {
        this.LLILZLL = C20028913Yh.LJI(new C1680770tq7(0L));
        this.LLIZ = C20028913Yh.LJI(Boolean.FALSE);
        C1696710uFp c1696710uFp = new C1696710uFp(c1696720uFq);
        c1696710uFp.LJFF = new AwS569S0100000_25(this, 755);
        this.LLIZLLLIL = c1696710uFp;
        this.LLJ = C1696870uG5.LIZ(0);
        this.LLJI = 1.0f;
        this.LLJILJIL = -1;
    }

    @Override // X.AbstractC1676270tir
    public final boolean LIZ(float f) {
        this.LLJI = f;
        return true;
    }

    @Override // X.AbstractC1676270tir
    public final boolean LIZIZ(C1685400txa c1685400txa) {
        this.LLJIJIL = c1685400txa;
        return true;
    }

    @Override // X.AbstractC1676270tir
    public final void LJIIIZ(InterfaceC1675870tiD interfaceC1675870tiD) {
        C1696710uFp c1696710uFp = this.LLIZLLLIL;
        C1685400txa c1685400txa = this.LLJIJIL;
        if (c1685400txa == null) {
            c1685400txa = (C1685400txa) ((C13FE) c1696710uFp.LJI).getValue();
        }
        if (((Boolean) ((C13FE) this.LLIZ).getValue()).booleanValue() && interfaceC1675870tiD.getLayoutDirection() == EnumC1671200tag.Rtl) {
            long jLJIJI = interfaceC1675870tiD.LJIJI();
            C1695230uDR c1695230uDRLJLJI = interfaceC1675870tiD.LJLJI();
            long jLIZIZ = c1695230uDRLJLJI.LIZIZ();
            c1695230uDRLJLJI.LIZ().save();
            try {
                c1695230uDRLJLJI.LIZ.LIZ(-1.0f, 1.0f, jLJIJI);
                c1696710uFp.LJ(interfaceC1675870tiD, this.LLJI, c1685400txa);
                c1695230uDRLJLJI.LIZ().LJIIJ();
                c1695230uDRLJLJI.LIZJ(jLIZIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c1695230uDRLJLJI.LIZ().LJIIJ();
                c1695230uDRLJLJI.LIZJ(jLIZIZ);
                throw th;
            }
        } else {
            c1696710uFp.LJ(interfaceC1675870tiD, this.LLJI, c1685400txa);
        }
        this.LLJILJIL = ((C13FG) this.LLJ).LIZLLL();
    }
}
