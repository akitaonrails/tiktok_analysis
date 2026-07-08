package X;

/* JADX INFO: renamed from: X.1BEc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2201481BEc implements InterfaceC2201661BEu {
    public C1BEN LIZ;

    public abstract C1BEZ LIZIZ(C1BEZ c1bez);

    public C1BEW LIZJ(C1BEW c1bew) {
        return c1bew;
    }

    public AbstractC2201481BEc(C1BEN c1ben) {
        this.LIZ = c1ben;
    }

    @Override // X.InterfaceC2201661BEu
    public C1BEW LIZ(InterfaceC2201591BEn interfaceC2201591BEn) {
        C1BEW c1bewLIZ = interfaceC2201591BEn.LIZ(LIZIZ(interfaceC2201591BEn.getRequest()));
        LIZJ(c1bewLIZ);
        return c1bewLIZ;
    }
}
