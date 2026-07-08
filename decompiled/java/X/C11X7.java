package X;

import com.ss.android.ugc.profile.business.effect.dashboard.PopupBannerItem;

/* JADX INFO: renamed from: X.11X7, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.effect.userlevel.banner.TopEffectBanner", f = "TopEffectBanner.kt", l = {47}, m = "onInit")
public final class C11X7 extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public PopupBannerItem LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C11X3 LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11X7(C11X3 c11x3, InterfaceC1364105Vn<? super C11X7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c11x3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TopEffectBanner@51c.onInit$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZJ = LIZJ(this);
        C1C7U.LIZIZ("TopEffectBanner@51c.onInit$1");
        return objLIZJ;
    }
}
