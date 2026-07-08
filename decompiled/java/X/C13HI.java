package X;

/* JADX INFO: renamed from: X.13HI, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13HI implements C13HG<Integer> {
    public static final C13HI LIZ = new C13HI();
    public static final C19980913Fv LIZIZ = new C19980913Fv("kotlin.Int", new C13HJ() { // from class: X.13HY
    });

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return LIZIZ;
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        return Integer.valueOf(c13hb.LJJIIZ());
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        c13hd.LJIIL(((Number) obj).intValue());
    }
}
