package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0lNY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1355540lNY {
    public static final boolean LIZ() {
        IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) C13LP.LJJJLIIL(ServiceManager.get().getServices(IECommerceAnchorService.class));
        if (iECommerceAnchorService == null || !iECommerceAnchorService.LJJIZ()) {
            SettingsManager.LIZLLL().getClass();
            return SettingsManager.LIZ("non_ec_creator_sv_should_enable_schedule_post", false);
        }
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("ec_sv_should_enable_schedule_post", true);
    }
}
