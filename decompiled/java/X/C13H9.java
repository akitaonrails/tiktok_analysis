package X;

/* JADX INFO: renamed from: X.13H9, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13H9 implements C13HG<Byte> {
    public static final C13H9 LIZ = new C13H9();
    public static final C19980913Fv LIZIZ = new C19980913Fv("kotlin.Byte", new C13HJ() { // from class: X.13HA
    });

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return LIZIZ;
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        return Byte.valueOf(c13hb.LJJI());
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        c13hd.LJIJJLI(((Number) obj).byteValue());
    }
}
