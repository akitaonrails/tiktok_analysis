package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.pumbaa.hybrid.rasp.api.BridgeConfig;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0WMr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C822070WMr {
    public static final C822070WMr LIZ = new C822070WMr();
    public static final BridgeConfig LIZIZ = new BridgeConfig(false, false, new ArrayList(), new ArrayList());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C822080WMs());

    public static BridgeConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        BridgeConfig bridgeConfig = LIZIZ;
        BridgeConfig bridgeConfig2 = (BridgeConfig) settingsManagerLIZLLL.LJIIIIZZ("hybrid_security_jsb_monitor_settings", BridgeConfig.class, bridgeConfig);
        return bridgeConfig2 != null ? bridgeConfig2 : bridgeConfig;
    }
}
