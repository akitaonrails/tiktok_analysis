package X;

/* JADX INFO: renamed from: X.13HK, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13HK implements C13HG<Double> {
    public static final C13HK LIZ = new C13HK();
    public static final C19980913Fv LIZIZ = new C19980913Fv("kotlin.Double", new C13HJ() { // from class: X.13HW
    });

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return LIZIZ;
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        return Double.valueOf(c13hb.LJ());
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        c13hd.LJJIFFI(((Number) obj).doubleValue());
    }
}
