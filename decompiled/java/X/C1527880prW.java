package X;

import java.util.List;

/* JADX INFO: renamed from: X.0prW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527880prW extends AbstractC1527850prT {
    @Override // X.AbstractC1527850prT
    public final int LIZJ() {
        return 1;
    }

    @Override // X.AbstractC1527850prT
    public final void LIZ() {
        this.LIZIZ.LIZIZ(new Object[0]).removeCallbacks(this.LJI);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append("cancelSync");
        C1527890prX.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC1527850prT
    public final void LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append("start send poll init");
        C1527890prX.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LIZJ.LJIILLIIL(EnumC1526180pom.Init.getValue(), false);
    }

    @Override // X.AbstractC1527850prT
    public final boolean LIZLLL(C1527060pqC c1527060pqC) {
        List<C1527020pq8> list = c1527060pqC.topics;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    public C1527880prW(InterfaceC1527580pr2 interfaceC1527580pr2, InterfaceC1525730po3 interfaceC1525730po3, AbstractC1526380pp6 abstractC1526380pp6, C1527900prY c1527900prY) {
        super(interfaceC1527580pr2, interfaceC1525730po3, abstractC1526380pp6, c1527900prY);
    }
}
