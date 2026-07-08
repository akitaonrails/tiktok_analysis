package X;

/* JADX INFO: renamed from: X.13HO, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13HO implements C13HG<Boolean> {
    public static final C13HO LIZ = new C13HO();
    public static final C19980913Fv LIZIZ = new C19980913Fv("kotlin.Boolean", new C13HJ() { // from class: X.13HU
    });

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return LIZIZ;
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        return Boolean.valueOf(c13hb.LJIILLIIL());
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        c13hd.LJII(((Boolean) obj).booleanValue());
    }
}
