package X;

/* JADX INFO: renamed from: X.13GX, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13GX implements C13HG<String> {
    public static final C13GX LIZ = new C13GX();
    public static final C19980913Fv LIZIZ = new C19980913Fv("kotlin.String", C19982013Gg.LIZ);

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return LIZIZ;
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        return c13hb.LJIILJJIL();
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        c13hd.LJIIIIZZ((String) obj);
    }
}
