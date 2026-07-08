package X;

import Y.AObjectS127S0000000_30;

/* JADX INFO: renamed from: X.13GP, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13GP implements C13HG<C13GN> {
    public static final C13GP LIZ = new C13GP();
    public static final C19983813Gy LIZIZ = C19981813Ge.LIZIZ("kotlinx.serialization.json.JsonPrimitive", C19982013Gg.LIZ, new InterfaceC19983313Gt[0], new AObjectS127S0000000_30(0));

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return LIZIZ;
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        AbstractC19979113Fd abstractC19979113FdLJIL = C19981313Fz.LIZ(c13hb).LJIL();
        if (abstractC19979113FdLJIL instanceof C13GN) {
            return abstractC19979113FdLJIL;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unexpected JSON element, expected JsonPrimitive, had ");
        sbLIZ.append(C13LE.LIZ(abstractC19979113FdLJIL.getClass()));
        throw C19988213Iq.LJ(C2188811AlT.LIZIZ(sbLIZ), abstractC19979113FdLJIL.toString(), -1);
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        C13GN c13gn = (C13GN) obj;
        C19981313Fz.LIZIZ(c13hd);
        if (c13gn instanceof C13GQ) {
            c13hd.LJJI(C13GR.LIZ, C13GQ.INSTANCE);
        } else {
            c13hd.LJJI(C19981713Gd.LIZ, c13gn);
        }
    }
}
