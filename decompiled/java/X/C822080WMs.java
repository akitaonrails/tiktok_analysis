package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.pumbaa.hybrid.rasp.api.BridgeConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WMs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C822080WMs extends C09AY implements Function0<Boolean> {
    public C822080WMs() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        BridgeConfig bridgeConfig = (BridgeConfig) SettingsManager.LIZLLL().LJIIIIZZ("hybrid_security_jsb_monitor_settings", BridgeConfig.class, C822070WMr.LIZIZ);
        return Boolean.valueOf(bridgeConfig != null ? bridgeConfig.enable : false);
    }
}
