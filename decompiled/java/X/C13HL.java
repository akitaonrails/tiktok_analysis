package X;

/* JADX INFO: renamed from: X.13HL, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13HL implements C13HG<Float> {
    public static final C13HL LIZ = new C13HL();
    public static final C19980913Fv LIZIZ = new C19980913Fv("kotlin.Float", new C13HJ() { // from class: X.13HX
    });

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return LIZIZ;
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        return Float.valueOf(c13hb.LJJIIZI());
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        c13hd.LJJ(((Number) obj).floatValue());
    }
}
