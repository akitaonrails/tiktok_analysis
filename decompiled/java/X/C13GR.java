package X;

import Y.AObjectS127S0000000_30;

/* JADX INFO: renamed from: X.13GR, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13GR implements C13HG<C13GQ> {
    public static final C13GR LIZ = new C13GR();
    public static final C19983813Gy LIZIZ = C19981813Ge.LIZIZ("kotlinx.serialization.json.JsonNull", C13GS.LIZ, new InterfaceC19983313Gt[0], new AObjectS127S0000000_30(0));

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return LIZIZ;
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        C19981313Fz.LIZ(c13hb);
        if (!c13hb.LJIIZILJ()) {
            c13hb.LJIJI();
            return C13GQ.INSTANCE;
        }
        throw new C13JL("Expected 'null' literal");
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        C19981313Fz.LIZIZ(c13hd);
        c13hd.LJJIIJZLJL();
    }
}
