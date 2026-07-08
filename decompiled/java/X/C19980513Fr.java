package X;

/* JADX INFO: renamed from: X.13Fr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19980513Fr implements C13HG<C13BG> {
    public static final C19980513Fr LIZ = new C19980513Fr();
    public static final C19979013Fc LIZIZ = C19979013Fc.LIZIZ;

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return LIZIZ;
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        C19981313Fz.LIZ(c13hb);
        return new C13BG(new C13FZ(C13GX.LIZ, C13GI.LIZ).deserialize(c13hb));
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        C19981313Fz.LIZIZ(c13hd);
        new C13FZ(C13GX.LIZ, C13GI.LIZ).serialize(c13hd, obj);
    }
}
