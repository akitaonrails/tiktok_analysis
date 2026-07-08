package X;

import X.InterfaceC1541240qD4;

/* JADX INFO: renamed from: X.0qCy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1541180qCy<Output extends InterfaceC1541240qD4> extends AbstractC1541140qCu<Output> {
    public final Output LJI;
    public final C1535940q4W LJII;

    @Override // X.InterfaceC1541260qD6
    public final boolean LIZ(C1540930qCZ c1540930qCZ) {
        return this.LJI.LIZ(c1540930qCZ);
    }

    @Override // X.AbstractC1541140qCu, X.InterfaceC1541260qD6
    public final boolean LIZJ(C1540930qCZ c1540930qCZ) {
        return this.LJI.LIZJ(c1540930qCZ);
    }

    public C1541180qCy(Output output, C1535940q4W c1535940q4W, C1540930qCZ c1540930qCZ) {
        super(c1540930qCZ);
        this.LJI = output;
        this.LJII = c1535940q4W;
    }
}
