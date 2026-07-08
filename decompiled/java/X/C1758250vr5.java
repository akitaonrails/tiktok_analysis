package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommercebase.ab.EcomPerfMonitorSwitchConfig;

/* JADX INFO: renamed from: X.0vr5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1758250vr5 {
    public static final EcomPerfMonitorSwitchConfig LIZ = new EcomPerfMonitorSwitchConfig(false, false, false, false);

    public static final EcomPerfMonitorSwitchConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcomPerfMonitorSwitchConfig ecomPerfMonitorSwitchConfig = LIZ;
        EcomPerfMonitorSwitchConfig ecomPerfMonitorSwitchConfig2 = (EcomPerfMonitorSwitchConfig) settingsManagerLIZLLL.LJIIIIZZ("ecom_perf_monitor_switch_v2", EcomPerfMonitorSwitchConfig.class, ecomPerfMonitorSwitchConfig);
        return ecomPerfMonitorSwitchConfig2 != null ? ecomPerfMonitorSwitchConfig2 : ecomPerfMonitorSwitchConfig;
    }

    public static final boolean LIZIZ() {
        return LIZ().f63switch;
    }
}
