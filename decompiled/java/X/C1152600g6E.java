package X;

import com.bytedance.android.livesdk.comp.impl.logger.slardarmonitor.LiveSlardarSdkConfigSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0g6E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152600g6E extends C09AY implements Function0<LiveSlardarSdkConfigSetting.Config> {
    public C1152600g6E() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final LiveSlardarSdkConfigSetting.Config invoke() {
        try {
            LiveSlardarSdkConfigSetting.Config config = (LiveSlardarSdkConfigSetting.Config) C19748512Ol.LIZIZ.LJII(LiveSlardarSdkConfigSetting.INSTANCE.getValue(), LiveSlardarSdkConfigSetting.Config.class);
            return config == null ? new LiveSlardarSdkConfigSetting.Config(false, "https://mon.isnssdk.com/monitor/appmonitor/v4/settings", "https://mon.isnssdk.com/monitor/collect/") : config;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new LiveSlardarSdkConfigSetting.Config(false, "https://mon.isnssdk.com/monitor/appmonitor/v4/settings", "https://mon.isnssdk.com/monitor/collect/");
        }
    }
}
