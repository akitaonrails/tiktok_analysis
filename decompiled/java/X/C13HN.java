package X;

/* JADX INFO: renamed from: X.13HN, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13HN implements C13HG<Character> {
    public static final C13HN LIZ = new C13HN();
    public static final C19980913Fv LIZIZ = new C19980913Fv("kotlin.Char", new C13HJ() { // from class: X.13HV
    });

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return LIZIZ;
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        return Character.valueOf(c13hb.LJJIII());
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        c13hd.LJIJ(((Character) obj).charValue());
    }
}
