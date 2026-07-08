package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.monitor.ECSDKMonitorConfigData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pMI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1508520pMI extends C09AY implements Function0<ECSDKMonitorConfigData> {
    public C1508520pMI() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ecommerce.monitor.ECSDKMonitorConfigData, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ECSDKMonitorConfigData invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ECSDKMonitorConfigData eCSDKMonitorConfigData = C1508510pMH.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("ec_saas_monitor_config", ECSDKMonitorConfigData.class, eCSDKMonitorConfigData);
        return LJIIIIZZ != 0 ? LJIIIIZZ : eCSDKMonitorConfigData;
    }
}
