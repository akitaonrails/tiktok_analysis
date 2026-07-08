package X;

import Y.AObjectS95S1100000_30;
import kotlin.Unit;

/* JADX INFO: renamed from: X.13HR, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13HR<T> implements C13HG<T> {
    public final T LIZ;
    public final C13BV LIZIZ = C13BV.INSTANCE;
    public final C01GW LIZJ = C452501pT.LIZ(EnumC452301pR.PUBLICATION, new AObjectS95S1100000_30(this, 1));

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return (InterfaceC19983313Gt) this.LIZJ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13HR(Unit unit) {
        this.LIZ = unit;
    }

    @Override // X.InterfaceC19984213Hc
    public final T deserialize(C13HB c13hb) {
        InterfaceC19983313Gt descriptor = getDescriptor();
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(descriptor);
        interfaceC19986313HxLIZIZ.LJJII();
        int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(getDescriptor());
        if (iLJIJJ == -1) {
            interfaceC19986313HxLIZIZ.LJIIJJI(descriptor);
            return this.LIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unexpected index ");
        sbLIZ.append(iLJIJJ);
        throw new C19981113Fx(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, T t) {
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(getDescriptor());
        getDescriptor();
        interfaceC19986513HzLIZIZ.LIZLLL();
    }
}
