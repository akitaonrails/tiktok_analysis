package X;

import Y.AObjectS404S0100000_30;

/* JADX INFO: renamed from: X.13GU, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13GU<T> extends AbstractC19984813Hi<T> {
    public final C13IQ<T> LIZ;
    public final C13BV LIZIZ = C13BV.INSTANCE;
    public final C01GW LIZJ = C452501pT.LIZ(EnumC452301pR.PUBLICATION, new AObjectS404S0100000_30(this, 6));

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return (InterfaceC19983313Gt) this.LIZJ.getValue();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("kotlinx.serialization.PolymorphicSerializer(baseClass: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC19984813Hi
    public final C13IQ<T> LIZJ() {
        return this.LIZ;
    }

    public C13GU(C13IQ<T> c13iq) {
        this.LIZ = c13iq;
    }
}
