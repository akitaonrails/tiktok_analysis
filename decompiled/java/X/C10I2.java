package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;

/* JADX INFO: renamed from: X.10I2, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10I2 {
    public static final C10I2 LIZ = new C10I2();

    public static boolean LIZ() {
        if (C0C64.LJIILLIIL().LJIJ(31744, 1, "enable_post_story_avatar", true) == 0) {
            return true;
        }
        try {
            SettingsManager.LIZLLL().getClass();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (!SettingsManager.LIZ("enable_post_story_avatar_age_interval", false)) {
            if (ComplianceServiceProvider.LJIJJLI().LIZLLL()) {
                return true;
            }
        }
        return ((AccountUserService) C0XQ7.LJFF()).LIZ() || !((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJI();
    }
}
