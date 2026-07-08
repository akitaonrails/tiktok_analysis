package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0HgK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.typingrecommendation.TypingRecommendationPanelAssem$observeVisibilityInputs$1$1", f = "TypingRecommendationPanelAssem.kt", l = {}, m = "invokeSuspend")
public final class C447260HgK extends C09AX implements InterfaceC1685420txc<InterfaceC456120Huc, Boolean, Boolean, EnumC430090Gtj, InterfaceC1364105Vn<? super C447960HhS>, Object> {
    public /* synthetic */ InterfaceC456120Huc LL;
    public /* synthetic */ boolean LLILLJJLI;
    public /* synthetic */ boolean LLILLL;
    public /* synthetic */ EnumC430090Gtj LLILZ;

    public C447260HgK(InterfaceC1364105Vn<? super C447260HgK> interfaceC1364105Vn) {
        super(5, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TypingRecommendationPanelAssem@d8fd.observeVisibilityInputs$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C447960HhS c447960HhS = new C447960HhS(this.LL, this.LLILLJJLI, this.LLILLL, C1630706a1.LIZ(this.LLILZ));
        C1C7U.LIZIZ("TypingRecommendationPanelAssem@d8fd.observeVisibilityInputs$1$1");
        return c447960HhS;
    }

    @Override // X.InterfaceC1685420txc
    public final Object invoke(InterfaceC456120Huc interfaceC456120Huc, Boolean bool, Boolean bool2, EnumC430090Gtj enumC430090Gtj, InterfaceC1364105Vn<? super C447960HhS> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        C447260HgK c447260HgK = new C447260HgK(interfaceC1364105Vn);
        c447260HgK.LL = interfaceC456120Huc;
        c447260HgK.LLILLJJLI = zBooleanValue;
        c447260HgK.LLILLL = zBooleanValue2;
        c447260HgK.LLILZ = enumC430090Gtj;
        return c447260HgK.invokeSuspend(Unit.LIZ);
    }
}
