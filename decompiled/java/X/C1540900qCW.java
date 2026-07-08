package X;

import Y.ARunnableS92S0200000_23;
import android.view.View;
import com.lynx.tasm.LynxView;

/* JADX INFO: renamed from: X.0qCW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1540900qCW implements InterfaceC1541240qD4 {
    public final InterfaceC1540940qCa LIZ;
    public volatile EnumC1540960qCc LIZIZ;

    @Override // X.InterfaceC1541240qD4
    public final boolean isSuccess() {
        InterfaceC1540940qCa interfaceC1540940qCa = this.LIZ;
        return (interfaceC1540940qCa == null || interfaceC1540940qCa.LJIIJ()) ? false : true;
    }

    @Override // X.InterfaceC1541240qD4, X.InterfaceC1541260qD6
    public final boolean LIZ(C1540930qCZ c1540930qCZ) {
        InterfaceC1540940qCa interfaceC1540940qCa;
        if (c1540930qCZ.LIZ || (interfaceC1540940qCa = this.LIZ) == null || interfaceC1540940qCa.LJIIJ() || this.LIZ.LJII().getParent() != null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(C1540890qCV c1540890qCV) {
        LynxView lynxView;
        C1540870qCT c1540870qCT = (C1540870qCT) c1540890qCV.LIZ.LIZ.LIZLLL;
        InterfaceC1540940qCa interfaceC1540940qCa = this.LIZ;
        if (interfaceC1540940qCa != 0) {
            C1541030qCj.LIZIZ(interfaceC1540940qCa, c1540870qCT.LIZIZ);
            interfaceC1540940qCa.LJIIIZ(c1540870qCT.LIZIZ, c1540870qCT.LIZLLL);
            C1041450dCx.LIZJ((View) interfaceC1540940qCa);
            int i = C1541010qCh.LIZ[this.LIZIZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        interfaceC1540940qCa.setOptimization(4);
                        c1540870qCT.LJIIL++;
                    }
                } else {
                    Object kitView = interfaceC1540940qCa.getKitView();
                    if ((kitView instanceof LynxView) && (lynxView = (LynxView) kitView) != null) {
                        c1540870qCT.LJIIL += 3;
                        C1532960pzi.LJFF(new ARunnableS92S0200000_23(this, lynxView, 61));
                    }
                    interfaceC1540940qCa.setOptimization(2);
                }
            } else {
                interfaceC1540940qCa.setOptimization(2);
                this.LIZIZ = EnumC1540960qCc.CACHED;
                c1540870qCT.LJIIL += 2;
            }
            C1530570pvr.LJ(c1540870qCT.LIZLLL, "opt_pre_layout_status", Integer.valueOf(c1540870qCT.LJIIL));
            C1537480q70 c1537480q70LJIILJJIL = interfaceC1540940qCa.LJIILJJIL();
            if (c1537480q70LJIILJJIL != null) {
                c1537480q70LJIILJJIL.LJIIIZ().LIZJ("opt_pre_layout_status", Integer.valueOf(c1540870qCT.LJIIL));
            }
        }
    }

    @Override // X.InterfaceC1541260qD6
    public final boolean LIZJ(C1540930qCZ c1540930qCZ) {
        InterfaceC1540940qCa interfaceC1540940qCa;
        C1540870qCT c1540870qCT;
        if (c1540930qCZ.LIZ || (interfaceC1540940qCa = this.LIZ) == null || interfaceC1540940qCa.LJIIJ()) {
            return false;
        }
        InterfaceC1541060qCm interfaceC1541060qCm = c1540930qCZ.LIZLLL;
        if (!(interfaceC1541060qCm instanceof C1540870qCT) || (c1540870qCT = (C1540870qCT) interfaceC1541060qCm) == null) {
            return false;
        }
        if (c1540870qCT.LJIIJ && this.LIZ.LJII().getParent() == null && C1532960pzi.LIZ()) {
            this.LIZ.release();
        }
        if (this.LIZ.LJIIJ() || !C1540320qBa.LIZ(this.LIZ.LJIILJJIL(), c1540870qCT.LIZLLL) || !this.LIZ.LJFF()) {
            return false;
        }
        return true;
    }

    public C1540900qCW(InterfaceC1540940qCa interfaceC1540940qCa, EnumC1540960qCc enumC1540960qCc) {
        this.LIZ = interfaceC1540940qCa;
        this.LIZIZ = enumC1540960qCc;
    }
}
