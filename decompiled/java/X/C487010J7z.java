package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.q;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0J7z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C487010J7z {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(4);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(4);

    public final HashMap<String, ScopeValue> LIZ() {
        if (this.LIZIZ.size() > 0) {
            return this.LIZIZ;
        }
        HashMap<String, ScopeValue> map = this.LIZIZ;
        ScopeValue scopeValue = ScopeValue.PERFORMANCE;
        map.put("live_slardar_monitor_sample_opt", scopeValue);
        this.LIZIZ.put("live_opt_player_fluency_exp", scopeValue);
        this.LIZIZ.put("live_slardar_log_sample_report", scopeValue);
        this.LIZIZ.put("livesdk_delay_init_task_time", scopeValue);
        return this.LIZIZ;
    }

    public final HashMap<String, LiveSettingModel> LIZIZ() {
        if (this.LIZ.size() > 0) {
            return this.LIZ;
        }
        LiveSettingModel liveSettingModel = new LiveSettingModel("live_slardar_monitor_sample_opt", "MonitorSampleData", new q(""));
        liveSettingModel.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting", liveSettingModel);
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.other.LiveOptPlayerFluencyExp", new LiveSettingModel("live_opt_player_fluency_exp", "int", new q((Number) 0)));
        LiveSettingModel liveSettingModel2 = new LiveSettingModel("live_slardar_log_sample_report", "SlardarSample", new q(""));
        liveSettingModel2.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.other.SlardarSampleSetting", liveSettingModel2);
        LiveSettingModel liveSettingModel3 = new LiveSettingModel("livesdk_delay_init_task_time", "int", new q((Number) 30));
        liveSettingModel3.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.performance.LiveSDKDelayInitTaskTimeSetting", liveSettingModel3);
        return this.LIZ;
    }
}
