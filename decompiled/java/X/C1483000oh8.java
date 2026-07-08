package X;

import Y.ARunnableS4S0111000_23;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0oh8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1483000oh8 extends AbstractC1483700oiG {
    public final C1483030ohB LIZLLL = new C1483030ohB(this);

    @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
    public final InterfaceC1482530ogN LIZ() {
        return this.LIZLLL.LIZJ;
    }

    @Override // X.AbstractC1483700oiG
    public final InterfaceC1023870ckb LJIIIZ() {
        return this.LIZLLL.LIZLLL;
    }

    @Override // X.AbstractC1483700oiG
    public final boolean LJIIL() {
        C582130MsN.LIZ().getConfig().getSimPlayerConfig().getPreRenderConfig().isEnabled();
        return true;
    }

    @Override // X.AbstractC1483700oiG
    public final void LJFF(InterfaceC1483670oiD interfaceC1483670oiD) {
        this.LIZJ = interfaceC1483670oiD;
    }

    @Override // X.AbstractC1483700oiG, X.InterfaceC1483880oiY
    public final void LJI(InterfaceC1023860cka interfaceC1023860cka) {
        if (interfaceC1023860cka instanceof C1057390dcf) {
            LJIILIIL(((C1057390dcf) interfaceC1023860cka).LIZ);
        } else {
            if (!(interfaceC1023860cka instanceof C1483060ohE)) {
                return;
            }
            C1483060ohE c1483060ohE = (C1483060ohE) interfaceC1023860cka;
            if (c1483060ohE.LIZIZ != c1483060ohE.LIZJ) {
                return;
            }
            LJIILIIL(c1483060ohE.LIZ);
        }
    }

    public final void LJIILIIL(String str) {
        C582130MsN.LIZ().getConfig().getSimPlayerConfig().getPreRenderConfig().LIZ();
        LJIILJJIL(3, this.LIZLLL.LIZ);
    }

    public final void LJIILJJIL(int i, boolean z) {
        if (C1474810oTv.LJJZ()) {
            C0C83.INS.runOnMsg(new ARunnableS4S0111000_23(this, i, z, 3));
        } else {
            LJIILL(i, z);
        }
    }

    public final void LJIILL(int i, boolean z) {
        List<InterfaceC1479620obg> listLIZJ;
        InterfaceC1479620obg interfaceC1479620obg;
        C1482720ogg c1482720ogg = this.LIZ;
        InterfaceC1479620obg interfaceC1479620obg2 = c1482720ogg.LIZJ;
        if (interfaceC1479620obg2 == null) {
            C786410Ut5.j4("triggerPreRender. currentPlayRequest null, return. type:%s, isBelowCurrent:%s", new Object[]{Integer.valueOf(i), Boolean.valueOf(z)});
            return;
        }
        if (z) {
            listLIZJ = c1482720ogg.LIZJ(1, 0, 1);
        } else {
            listLIZJ = c1482720ogg.LIZJ(1, 0, 2);
        }
        if (listLIZJ.size() > 0 && (interfaceC1479620obg = (InterfaceC1479620obg) ListProtector.get(listLIZJ, 0)) != null) {
            if (i == 1) {
                C582130MsN.LIZ().getConfig().getSimPlayerConfig().getPreRenderConfig().LJ();
            }
            List<InterfaceC1479740obs> listLJIIJJI = interfaceC1479620obg.LJIIJJI();
            if (listLJIIJJI != null && listLJIIJJI.size() != 0) {
                C1479540obY.LIZJ(interfaceC1479620obg, (InterfaceC1479740obs) ListProtector.get(listLJIIJJI, 0));
                C582130MsN.LIZ().getConfig().getSimPlayerConfig().getPreRenderConfig().LIZIZ();
                LJIIJ(new C1483090ohH(new C1484040oio(interfaceC1479620obg, z, i)));
                C786410Ut5.j4("triggerPreRender. trigger successfully. type:%s, isBelowCurrent:%s, aid:%s, current:%s", new Object[]{Integer.valueOf(i), Boolean.valueOf(z), interfaceC1479620obg.getKey(), interfaceC1479620obg2.getKey()});
                return;
            }
            C786410Ut5.j4("triggerPreRender. playItems null, return. type:%s, isBelowCurrent:%s", new Object[]{Integer.valueOf(i), Boolean.valueOf(z)});
            return;
        }
        C786410Ut5.j4("triggerPreRender. preRenderTarget null, return. type:%s, isBelowCurrent:%s", new Object[]{Integer.valueOf(i), Boolean.valueOf(z)});
    }
}
