package X;

/* JADX INFO: renamed from: X.13H6, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13H6 implements C13HG<Long> {
    public static final C13H6 LIZ = new C13H6();
    public static final C19980913Fv LIZIZ = new C19980913Fv("kotlin.Long", new C13HJ() { // from class: X.13H7
    });

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return LIZIZ;
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        return Long.valueOf(c13hb.LJJIFFI());
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        c13hd.LJIILL(((Number) obj).longValue());
    }
}
