package X;

/* JADX INFO: renamed from: X.13HE, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13HE implements C13HG<C1507240pKE> {
    public static final C13HE LIZ = new C13HE();
    public static final C13H0 LIZIZ = C13H4.LIZ("kotlin.UInt", C13HI.LIZ);

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return LIZIZ;
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        return new C1507240pKE(c13hb.LJJIIJZLJL(LIZIZ).LJJIIZ());
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        c13hd.LIZJ(LIZIZ).LJIIL(((C1507240pKE) obj).LL);
    }
}
