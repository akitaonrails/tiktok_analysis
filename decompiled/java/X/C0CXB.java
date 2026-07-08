package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0CXB, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CXB {
    public static final C0CXB LIZ = new C0CXB();

    public static boolean LIZ() {
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("proactive_login_shoot_killswitch", true)) {
            return false;
        }
        String storeRegionUpperCase = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase();
        C19315910hZ.LIZ.getClass();
        return !C19315910hZ.LJIIIZ.contains(storeRegionUpperCase);
    }
}
