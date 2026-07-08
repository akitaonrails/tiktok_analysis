package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.profile.business.effect.dashboard.PopupBannerItem;

/* JADX INFO: renamed from: X.11X6, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.effect.userlevel.banner.TopDesignerBanner", f = "TopDesignerBanner.kt", l = {BaseNotice.CREATOR}, m = "onInit")
public final class C11X6 extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public PopupBannerItem LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C11X5 LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11X6(C11X5 c11x5, InterfaceC1364105Vn<? super C11X6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c11x5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TopDesignerBanner@e3d2.onInit$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZJ = LIZJ(this);
        C1C7U.LIZIZ("TopDesignerBanner@e3d2.onInit$1");
        return objLIZJ;
    }
}
