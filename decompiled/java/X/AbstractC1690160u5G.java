package X;

import java.util.List;

/* JADX INFO: renamed from: X.0u5G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1690160u5G implements InterfaceC1690000u50<C1690020u52> {
    public final InterfaceC1690430u5h LIZ;
    public final InterfaceC1690470u5l LIZIZ;
    public final long LIZJ;

    public abstract C1690020u52 LIZIZ(int i, Object obj, Object obj2, List<? extends AbstractC1686530tzP> list, long j);

    public static C1690020u52 LIZJ(AbstractC1690160u5G abstractC1690160u5G, int i) {
        long j = abstractC1690160u5G.LIZJ;
        return abstractC1690160u5G.LIZIZ(i, abstractC1690160u5G.LIZ.LIZLLL(i), abstractC1690160u5G.LIZ.LJ(i), abstractC1690160u5G.LIZIZ.LJJIIZI(i, j), j);
    }

    public AbstractC1690160u5G(long j, boolean z, InterfaceC1690430u5h interfaceC1690430u5h, InterfaceC1690470u5l interfaceC1690470u5l) {
        int iLJIIIIZZ;
        this.LIZ = interfaceC1690430u5h;
        this.LIZIZ = interfaceC1690470u5l;
        int iLJII = Integer.MAX_VALUE;
        if (z) {
            iLJIIIIZZ = C1682380tsi.LJIIIIZZ(j);
        } else {
            iLJIIIIZZ = Integer.MAX_VALUE;
            iLJII = C1682380tsi.LJII(j);
        }
        this.LIZJ = C1682390tsj.LIZ(0, iLJIIIIZZ, 0, iLJII);
    }

    @Override // X.InterfaceC1690000u50
    public final InterfaceC1689980u4y LIZ(int i, int i2, int i3, long j) {
        return LIZIZ(i, this.LIZ.LIZLLL(i), this.LIZ.LJ(i), this.LIZIZ.LJJIIZI(i, j), j);
    }
}
