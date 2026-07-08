package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.abtest.CommerceAdLandpageBulletConfig;

/* JADX INFO: renamed from: X.0Byk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C305800Byk {
    public static CommerceAdLandpageBulletConfig LIZ;

    public static CommerceAdLandpageBulletConfig LIZ() {
        CommerceAdLandpageBulletConfig commerceAdLandpageBulletConfig = LIZ;
        if (commerceAdLandpageBulletConfig != null) {
            return commerceAdLandpageBulletConfig;
        }
        try {
            SettingsManager.LIZLLL().getClass();
            LIZ = (CommerceAdLandpageBulletConfig) SettingsManager.LJII("commerce_ad_landpage_bullet_config", CommerceAdLandpageBulletConfig.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        return LIZ;
    }
}
