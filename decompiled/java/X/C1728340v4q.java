package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TopBannerInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0v4q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.utils.BillboardBannerEffectHelper", f = "BillboardBannerEffectHelper.kt", l = {43, BaseNotice.RECOMMEND_LIVE, 56}, m = "displayBanner")
public final class C1728340v4q extends AbstractC23140094w {
    public TopBannerInfo LL;
    public Function0 LLILLJJLI;
    public Function1 LLILLL;
    public C1728990v5t LLILZ;
    public LiveEffect LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C1728330v4p LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728340v4q(C1728330v4p c1728330v4p, InterfaceC1364105Vn<? super C1728340v4q> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c1728330v4p;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("BillboardBannerEffectHelper@f22d.displayBanner$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLIZ.LIZJ(null, null, null, null, this);
        C1C7U.LIZIZ("BillboardBannerEffectHelper@f22d.displayBanner$1");
        return objLIZJ;
    }
}
