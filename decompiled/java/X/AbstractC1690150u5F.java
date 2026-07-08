package X;

import java.util.List;

/* JADX INFO: renamed from: X.0u5F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1690150u5F implements InterfaceC1690000u50<C1690030u53> {
    public final InterfaceC1690440u5i LIZ;
    public final InterfaceC1690470u5l LIZIZ;
    public final int LIZJ;

    public abstract C1690030u53 LIZIZ(int i, Object obj, Object obj2, int i2, int i3, List<? extends AbstractC1686530tzP> list, long j, int i4, int i5);

    public AbstractC1690150u5F(InterfaceC1690440u5i interfaceC1690440u5i, InterfaceC1690470u5l interfaceC1690470u5l, int i) {
        this.LIZ = interfaceC1690440u5i;
        this.LIZIZ = interfaceC1690470u5l;
        this.LIZJ = i;
    }

    @Override // X.InterfaceC1690000u50
    public final InterfaceC1689980u4y LIZ(int i, int i2, int i3, long j) {
        return LIZJ(i, i2, i3, this.LIZJ, j);
    }

    public final C1690030u53 LIZJ(int i, int i2, int i3, int i4, long j) {
        int iLJIIIZ;
        Object objLIZLLL = this.LIZ.LIZLLL(i);
        Object objLJ = this.LIZ.LJ(i);
        List<AbstractC1686530tzP> listLJJIIZI = this.LIZIZ.LJJIIZI(i, j);
        if (C1682380tsi.LJI(j)) {
            iLJIIIZ = C1682380tsi.LJIIJ(j);
        } else {
            if (!C1682380tsi.LJFF(j)) {
                C1691080u6k.LIZ("does not have fixed height");
            }
            iLJIIIZ = C1682380tsi.LJIIIZ(j);
        }
        return LIZIZ(i, objLIZLLL, objLJ, iLJIIIZ, i4, listLJJIIZI, j, i2, i3);
    }
}
