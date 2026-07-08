package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.0hxm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1224240hxm implements InterfaceC1224250hxn {
    public final C1224280hxq LL;

    public C1224240hxm(C1224280hxq c1224280hxq) {
        this.LL = c1224280hxq;
    }

    @Override // X.InterfaceC1224250hxn
    public final void LIZLLL(EnumC1223630hwn enumC1223630hwn) {
        this.LL.getProtocol().LIZLLL(enumC1223630hwn);
        this.LL.LJI().LIZLLL(enumC1223630hwn);
        this.LL.LJII().LIZLLL(enumC1223630hwn);
        this.LL.LIZIZ().LIZLLL(enumC1223630hwn);
        for (InterfaceC1224210hxj interfaceC1224210hxj : this.LL.LIZLLL().LIZ()) {
            interfaceC1224210hxj.LIZIZ().LIZLLL(enumC1223630hwn);
            Iterator<InterfaceC1224260hxo> it2 = interfaceC1224210hxj.LIZJ().iterator();
            while (it2.hasNext()) {
                it2.next().LIZLLL(enumC1223630hwn);
            }
        }
        this.LL.LJ().LIZLLL(enumC1223630hwn);
        this.LL.LJIIIIZZ().LIZ().LIZLLL(enumC1223630hwn);
    }

    @Override // X.InterfaceC1224250hxn
    public final void LJJIJLIJ(C1224050hxT c1224050hxT) {
        this.LL.getProtocol().LJJIJLIJ(c1224050hxT);
        this.LL.LJI().LJJIJLIJ(c1224050hxT);
        this.LL.LJII().LJJIJLIJ(c1224050hxT);
        this.LL.LIZIZ().LJJIJLIJ(c1224050hxT);
        for (InterfaceC1224210hxj interfaceC1224210hxj : this.LL.LIZLLL().LIZ()) {
            interfaceC1224210hxj.LIZIZ().LJJIJLIJ(c1224050hxT);
            Iterator<InterfaceC1224260hxo> it2 = interfaceC1224210hxj.LIZJ().iterator();
            while (it2.hasNext()) {
                it2.next().LJJIJLIJ(c1224050hxT);
            }
        }
        this.LL.LJ().LJJIJLIJ(c1224050hxT);
        this.LL.LJIIIIZZ().LIZ().LJJIJLIJ(c1224050hxT);
    }

    @Override // X.InterfaceC1224250hxn
    public final void LJJJ(C1224790hyf c1224790hyf) {
        this.LL.getProtocol().LJJJ(c1224790hyf);
        this.LL.LJI().LJJJ(c1224790hyf);
        this.LL.LJII().LJJJ(c1224790hyf);
        this.LL.LIZIZ().LJJJ(c1224790hyf);
        for (InterfaceC1224210hxj interfaceC1224210hxj : this.LL.LIZLLL().LIZ()) {
            interfaceC1224210hxj.LIZIZ().LJJJ(c1224790hyf);
            Iterator<InterfaceC1224260hxo> it2 = interfaceC1224210hxj.LIZJ().iterator();
            while (it2.hasNext()) {
                it2.next().LJJJ(c1224790hyf);
            }
        }
        this.LL.LJ().LJJJ(c1224790hyf);
        this.LL.LJIIIIZZ().LIZ().LJJJ(c1224790hyf);
    }
}
