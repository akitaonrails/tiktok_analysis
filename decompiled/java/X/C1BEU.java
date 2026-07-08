package X;

import java.util.List;

/* JADX INFO: renamed from: X.1BEU, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BEU implements InterfaceC2201461BEa {
    public final int LIZ;
    public InterfaceC2201461BEa LIZIZ;

    @Override // X.InterfaceC2201461BEa
    public final List<C1BEK> LIZ() {
        return this.LIZIZ.LIZ();
    }

    @Override // X.InterfaceC2201461BEa
    public final void LIZJ() {
        this.LIZIZ.LIZJ();
    }

    @Override // X.InterfaceC2201461BEa
    public final List<C1BEK> LJ() {
        return this.LIZIZ.LJ();
    }

    @Override // X.InterfaceC2201461BEa
    public final void release() {
        this.LIZIZ.release();
    }

    public C1BEU(C1BEN c1ben) {
        InterfaceC2201461BEa c1bei;
        int i = c1ben.LIZIZ.LIZJ;
        this.LIZ = i;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    c1bei = null;
                } else {
                    c1bei = new C2201581BEm();
                }
            } else {
                c1bei = new C2201571BEl();
            }
        } else {
            c1bei = new C1BEI();
        }
        this.LIZIZ = c1bei;
    }

    @Override // X.InterfaceC2201461BEa
    public final boolean LIZIZ(C1BEK c1bek) {
        return this.LIZIZ.LIZIZ(c1bek);
    }

    @Override // X.InterfaceC2201461BEa
    public final void LIZLLL(C1BEK c1bek) {
        this.LIZIZ.LIZLLL(c1bek);
    }

    @Override // X.InterfaceC2201461BEa
    public final void LJFF(C1BEK c1bek) {
        this.LIZIZ.LJFF(c1bek);
    }

    @Override // X.InterfaceC2201461BEa
    public final List<C1BEK> LJI(List<C1BEK> list) {
        return this.LIZIZ.LJI(list);
    }
}
