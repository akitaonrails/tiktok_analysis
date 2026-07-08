package X;

/* JADX INFO: renamed from: X.13HP, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13HP implements C13HG<Short> {
    public static final C13HP LIZ = new C13HP();
    public static final C19980913Fv LIZIZ = new C19980913Fv("kotlin.Short", new C13HJ() { // from class: X.13HZ
    });

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return LIZIZ;
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        return Short.valueOf(c13hb.LJIIL());
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        c13hd.LJI(((Number) obj).shortValue());
    }
}
