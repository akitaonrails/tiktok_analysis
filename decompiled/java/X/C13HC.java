package X;

/* JADX INFO: renamed from: X.13HC, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13HC implements C13HG<C1507270pKH> {
    public static final C13HC LIZ = new C13HC();
    public static final C13H0 LIZIZ = C13H4.LIZ("kotlin.UShort", C13HP.LIZ);

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return LIZIZ;
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        return new C1507270pKH(c13hb.LJJIIJZLJL(LIZIZ).LJIIL());
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        c13hd.LIZJ(LIZIZ).LJI(((C1507270pKH) obj).LL);
    }
}
