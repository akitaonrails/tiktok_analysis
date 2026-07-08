package X;

/* JADX INFO: renamed from: X.0fYZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1131730fYZ extends AbstractC1131810fYh {
    public abstract InterfaceC1132310fZV LIZJ(C1132030fZ3<C1132020fZ2> c1132030fZ3, C1132100fZA c1132100fZA);

    public AbstractC1131730fYZ(C1132340fZY c1132340fZY) {
        super(c1132340fZY);
    }

    @Override // X.InterfaceC1132040fZ4
    public final InterfaceC1132310fZV LIZ(C1132030fZ3<C1132020fZ2> c1132030fZ3) {
        InterfaceC1132170fZH interfaceC1132170fZH = c1132030fZ3.LIZIZ.LIZIZ;
        if (!(interfaceC1132170fZH instanceof C1132100fZA)) {
            return C1118410fD5.LIZ;
        }
        return LIZJ(c1132030fZ3, (C1132100fZA) interfaceC1132170fZH);
    }
}
