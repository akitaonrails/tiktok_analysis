package X;

/* JADX INFO: renamed from: X.15kM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public /* synthetic */ class C20607215kM extends C2217421BqW implements InterfaceC1631620sYq<AbstractC20607715kR, EnumC323450Cm7, Object, AbstractC20607715kR> {
    public static final C20607215kM LL = new C20607215kM();

    public C20607215kM() {
        super(3, AbstractC20607715kR.class, "onError", "onError(Lcom/bytedance/ies/powerlist/page/PageType;Ljava/lang/Object;)Lcom/bytedance/ies/powerlist/page/PowerPageEvent;", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final AbstractC20607715kR invoke(AbstractC20607715kR abstractC20607715kR, EnumC323450Cm7 enumC323450Cm7, Object obj) {
        Exception exc;
        AbstractC20607715kR abstractC20607715kR2 = abstractC20607715kR;
        EnumC323450Cm7 enumC323450Cm72 = enumC323450Cm7;
        if (abstractC20607715kR2.LIZ(enumC323450Cm72)) {
            EnumC323450Cm7 enumC323450Cm73 = abstractC20607715kR2.LIZ;
            if (!(obj instanceof Exception) || (exc = (Exception) obj) == null) {
                exc = new Exception();
            }
            return new C20607815kS(enumC323450Cm73, exc, enumC323450Cm72);
        }
        return abstractC20607715kR2;
    }
}
