package X;

import com.ss.android.ugc.aweme.commerce.BizAccount;
import com.ss.android.ugc.aweme.ecommerce.service.IEcommerceAnchorOuterService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMusicPublishBridgeService;

/* JADX INFO: renamed from: X.12Mv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19744312Mv {
    public static final C19744312Mv LIZ = new C19744312Mv();

    public static final boolean LIZ() {
        IEcommerceAnchorOuterService iEcommerceAnchorOuterService;
        BizAccount bizAccountLIZ;
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "shoot_page_half_screen_music_panel", true) == 1 && !C0CHQ.LIZ().getAccountService().LIZ() && ((!C0CHQ.LIZ().getAccountService().LJIIJJI() && ((bizAccountLIZ = C0XEE.LIZ()) == null || !(bizAccountLIZ.getRestrictCommerceMusic() || bizAccountLIZ.isVerifiedBA()))) || ((IMusicPublishBridgeService) ServiceManager.get().getService(IMusicPublishBridgeService.class)).enableBAUserMusicExperienceOpt()) && C0CHQ.LIZ().getAccountService().isLogin() && ((iEcommerceAnchorOuterService = (IEcommerceAnchorOuterService) C13LP.LJJJLIIL(ServiceManager.get().getServices(IEcommerceAnchorOuterService.class))) == null || !iEcommerceAnchorOuterService.LIZJ());
    }
}
