package X;

import Y.ARunnableS4S0111000_23;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0oh7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1482990oh7 extends AbstractC1483700oiG {
    public C1482520ogM LIZLLL;
    public InterfaceC1483670oiD LJFF;
    public InterfaceC1479620obg LJI;
    public String LJIIIIZZ;
    public final C1483020ohA LJ = new C1483020ohA(this);
    public final C603840NmI LJII = new C603840NmI(8);

    @Override // X.AbstractC1483700oiG
    public final InterfaceC1023870ckb LJII() {
        return this.LJ.LIZLLL;
    }

    public final List<InterfaceC1479620obg> LJIILIIL() {
        List<InterfaceC1479620obg> list = (List) this.LJII.get(this.LJIIIIZZ);
        return list == null ? new ArrayList() : list;
    }

    @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
    public final void stop() {
        C1482520ogM c1482520ogM = this.LIZLLL;
        if (c1482520ogM == null) {
            return;
        }
        c1482520ogM.LIZLLL(this.LJ.LIZIZ);
    }

    @Override // X.AbstractC1483700oiG
    public final boolean LJIIL() {
        C582130MsN.LIZ().getConfig().getSimPlayerConfig().getPreRenderConfig().isEnabled();
        return true;
    }

    @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
    public final void release() {
        super.release();
        C1482520ogM c1482520ogM = this.LIZLLL;
        if (c1482520ogM != null) {
            c1482520ogM.LIZLLL(this.LJ.LIZIZ);
        }
        this.LIZLLL = null;
    }

    @Override // X.AbstractC1483700oiG
    public final void LIZIZ(C1482520ogM c1482520ogM) {
        this.LIZLLL = c1482520ogM;
    }

    @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
    public final void LJ(InterfaceC1479620obg interfaceC1479620obg) {
        this.LJI = interfaceC1479620obg;
        C1482520ogM c1482520ogM = this.LIZLLL;
        if (c1482520ogM != null) {
            c1482520ogM.LIZ(this.LJ.LIZIZ);
        }
    }

    @Override // X.AbstractC1483700oiG
    public final void LJFF(InterfaceC1483670oiD interfaceC1483670oiD) {
        this.LJFF = interfaceC1483670oiD;
    }

    @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
    public final void LJJII(String str) {
        LJIILIIL().clear();
    }

    @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
    public final void LJIIIIZZ(String str, List<InterfaceC1479620obg> list) {
        if (!TextUtils.isEmpty(str) && list.size() != 0) {
            if (this.LJII.get(str) == 0) {
                this.LJII.put(str, new ArrayList());
            }
            this.LJIIIIZZ = str;
            LJIILIIL().clear();
            LJIILIIL().addAll(list);
        }
    }

    public final void LJIILJJIL(int i, boolean z) {
        if (C1474810oTv.LJJZ()) {
            C0C83.INS.runOnMsg(new ARunnableS4S0111000_23(this, i, 7));
        } else {
            LJIILL(i, true);
        }
    }

    public final void LJIILL(int i, boolean z) {
        InterfaceC1479620obg interfaceC1479620obg;
        List<InterfaceC1479620obg> listLJIILIIL = LJIILIIL();
        if (listLJIILIIL.size() == 0) {
            if (!C1480850odf.LIZJ.optGlobalAppAnr()) {
                C786410Ut5.j4("triggerPreRender. playRequests null, return. type:%s, isBelowCurrent:%s", new Object[]{Integer.valueOf(i), Boolean.valueOf(z)});
                return;
            }
            return;
        }
        if (this.LJI == null) {
            if (!C1480850odf.LIZJ.optGlobalAppAnr()) {
                C786410Ut5.j4("triggerPreRender. currentPlayRequest null, return. type:%s, isBelowCurrent:%s", new Object[]{Integer.valueOf(i), Boolean.valueOf(z)});
                return;
            }
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = -1;
            if (i2 >= listLJIILIIL.size()) {
                break;
            }
            if (TextUtils.equals(((InterfaceC1479620obg) ListProtector.get(listLJIILIIL, i2)).getKey(), this.LJI.getKey())) {
                if (i2 >= 0) {
                    if (z) {
                        i3 = 1;
                    }
                    int i4 = i2 + i3;
                    if (i4 >= 0 && i4 < listLJIILIIL.size() && (interfaceC1479620obg = (InterfaceC1479620obg) ListProtector.get(listLJIILIIL, i4)) != null) {
                        if (i == 1) {
                            C582130MsN.LIZ().getConfig().getSimPlayerConfig().getPreRenderConfig().LJ();
                        }
                        List<InterfaceC1479740obs> listLJIIJJI = interfaceC1479620obg.LJIIJJI();
                        if (listLJIIJJI != null && listLJIIJJI.size() != 0) {
                            C1479540obY.LIZJ(interfaceC1479620obg, (InterfaceC1479740obs) ListProtector.get(listLJIIJJI, 0));
                            C582130MsN.LIZ().getConfig().getSimPlayerConfig().getPreRenderConfig().LIZIZ();
                            LJIIJ(new C1483090ohH(new C1484040oio(interfaceC1479620obg, z, i)));
                            if (!C1480850odf.LIZJ.optGlobalAppAnr()) {
                                C786410Ut5.j4("triggerPreRender. trigger successfully. type:%s, isBelowCurrent:%s, aid:%s, current:%s", new Object[]{Integer.valueOf(i), Boolean.valueOf(z), interfaceC1479620obg.getKey(), this.LJI.getKey()});
                                return;
                            }
                            return;
                        }
                        if (!C1480850odf.LIZJ.optGlobalAppAnr()) {
                            C786410Ut5.j4("triggerPreRender. playItems null, return. type:%s, isBelowCurrent:%s", new Object[]{Integer.valueOf(i), Boolean.valueOf(z)});
                            return;
                        }
                        return;
                    }
                }
            } else {
                i2++;
            }
        }
        if (!C1480850odf.LIZJ.optGlobalAppAnr()) {
            C786410Ut5.j4("triggerPreRender. preRenderTarget null, return. type:%s, isBelowCurrent:%s", new Object[]{Integer.valueOf(i), Boolean.valueOf(z)});
        }
    }
}
