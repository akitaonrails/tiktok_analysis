package X;

/* JADX INFO: renamed from: X.13H8, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13H8 implements C13HG<C19969613Bm> {
    public static final C13H8 LIZ = new C13H8();
    public static final C13H0 LIZIZ = C13H4.LIZ("kotlin.UByte", C13H9.LIZ);

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return LIZIZ;
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        return new C19969613Bm(c13hb.LJJIIJZLJL(LIZIZ).LJJI());
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        c13hd.LIZJ(LIZIZ).LJIJJLI(((C19969613Bm) obj).LL);
    }
}
