package X;

/* JADX INFO: renamed from: X.15kL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public /* synthetic */ class C20607115kL extends C2217421BqW implements InterfaceC1631620sYq<AbstractC20607715kR, EnumC323450Cm7, Object, AbstractC20607715kR> {
    public static final C20607115kL LL = new C20607115kL();

    public C20607115kL() {
        super(3, AbstractC20607715kR.class, "onLoaded", "onLoaded(Lcom/bytedance/ies/powerlist/page/PageType;Ljava/lang/Object;)Lcom/bytedance/ies/powerlist/page/PowerPageEvent;", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final AbstractC20607715kR invoke(AbstractC20607715kR abstractC20607715kR, EnumC323450Cm7 enumC323450Cm7, Object obj) {
        AbstractC20607715kR abstractC20607715kR2 = abstractC20607715kR;
        EnumC323450Cm7 enumC323450Cm72 = enumC323450Cm7;
        if (abstractC20607715kR2.LIZ(enumC323450Cm72)) {
            if (enumC323450Cm72 == EnumC323450Cm7.Refresh && (obj instanceof C20608515kZ) && abstractC20607715kR2.LIZ == EnumC323450Cm7.Prev && ((C20608515kZ) obj).LIZ == null) {
                if (abstractC20607715kR2.LIZ(enumC323450Cm72)) {
                    return new C20607915kT(abstractC20607715kR2.LIZ, enumC323450Cm72);
                }
            } else {
                return new C20608015kU(abstractC20607715kR2.LIZ, enumC323450Cm72);
            }
        }
        return abstractC20607715kR2;
    }
}
