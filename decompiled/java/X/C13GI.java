package X;

import Y.AObjectS127S0000000_30;

/* JADX INFO: renamed from: X.13GI, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13GI implements C13HG<AbstractC19979113Fd> {
    public static final C13GI LIZ = new C13GI();
    public static final C19983813Gy LIZIZ = C19981813Ge.LIZIZ("kotlinx.serialization.json.JsonElement", new C13GL() { // from class: X.13GK
    }, new InterfaceC19983313Gt[0], new AObjectS127S0000000_30(2));

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return LIZIZ;
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        return C19981313Fz.LIZ(c13hb).LJIL();
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        C19981313Fz.LIZIZ(c13hd);
        if (obj instanceof C13GN) {
            c13hd.LJJI(C13GP.LIZ, obj);
        } else if (obj instanceof C13BG) {
            c13hd.LJJI(C19980513Fr.LIZ, obj);
        } else {
            if (obj instanceof C13BE) {
                c13hd.LJJI(C19980613Fs.LIZ, obj);
                return;
            }
            throw new C1954807lC();
        }
    }
}
