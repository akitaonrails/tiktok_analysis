package X;

import android.widget.FrameLayout;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.profile.model.PaidContentBannerCampaign;
import com.ss.android.ugc.aweme.series.banner.serviceimpl.ServiceBannerServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Cie, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238021Cie extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC20660715sz LL;
    public final /* synthetic */ String LLILLJJLI = "profile_page";
    public final /* synthetic */ String LLILLL = "bottom_bar";
    public final /* synthetic */ PaidContentBannerCampaign LLILZ;
    public final /* synthetic */ ServiceBannerServiceImpl LLILZIL;
    public final /* synthetic */ FrameLayout LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2238021Cie(C0TGX c0tgx, PaidContentBannerCampaign paidContentBannerCampaign, ServiceBannerServiceImpl serviceBannerServiceImpl, FrameLayout frameLayout) {
        super(0);
        this.LL = c0tgx;
        this.LLILZ = paidContentBannerCampaign;
        this.LLILZIL = serviceBannerServiceImpl;
        this.LLILZLL = frameLayout;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PopupManager.LJIJI(new C2238031Cif(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL.LIZIZ, this.LLILZLL), true);
        return Unit.LIZ;
    }
}
