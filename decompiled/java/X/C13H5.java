package X;

/* JADX INFO: renamed from: X.13H5, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13H5 implements C13HG<C19969813Bo> {
    public static final C13H5 LIZ = new C13H5();
    public static final C13H0 LIZIZ = C13H4.LIZ("kotlin.ULong", C13H6.LIZ);

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return LIZIZ;
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        return new C19969813Bo(c13hb.LJJIIJZLJL(LIZIZ).LJJIFFI());
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        c13hd.LIZJ(LIZIZ).LJIILL(((C19969813Bo) obj).LL);
    }
}
