package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.settings.GeckoCountConfig;

/* JADX INFO: renamed from: X.07K1, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07K1 {
    public static GeckoCountConfig LIZ() {
        GeckoCountConfig geckoCountConfig;
        try {
            geckoCountConfig = (GeckoCountConfig) SettingsManager.LIZLLL().LJIIIIZZ("ad_landing_page_gecko_cache_count_config", GeckoCountConfig.class, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        if (geckoCountConfig != null) {
            return geckoCountConfig;
        }
        return null;
    }
}
