package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.q;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0g5X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152170g5X {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(4);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(4);

    public final HashMap<String, ScopeValue> LIZ() {
        if (this.LIZIZ.size() > 0) {
            return this.LIZIZ;
        }
        HashMap<String, ScopeValue> map = this.LIZIZ;
        ScopeValue scopeValue = ScopeValue.PERFORMANCE;
        map.put("live_player_logger_disable", scopeValue);
        this.LIZIZ.put("live_player_logger_task_schedule_exp", scopeValue);
        this.LIZIZ.put("live_player_thread_timeout_setting", scopeValue);
        this.LIZIZ.put("live_stream_strategy_pre_init_app_info_budle", scopeValue);
        return this.LIZIZ;
    }

    public final HashMap<String, LiveSettingModel> LIZIZ() {
        if (this.LIZ.size() > 0) {
            return this.LIZ;
        }
        LiveSettingModel liveSettingModel = new LiveSettingModel("live_player_logger_disable", "PlayerLoggerDisableConfig", new q(""));
        liveSettingModel.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.settings.LivePlayerLoggerDisableExp", liveSettingModel);
        LiveSettingModel liveSettingModel2 = new LiveSettingModel("live_player_logger_task_schedule_exp", "PlayerLoggerTaskScheduleConfig", new q(""));
        liveSettingModel2.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.settings.LivePlayerLoggerTaskScheduleSetting", liveSettingModel2);
        LiveSettingModel liveSettingModel3 = new LiveSettingModel("live_player_thread_timeout_setting", "int", new q((Number) (-1)));
        liveSettingModel3.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.settings.LivePlayerThreadTimeOutSetting", liveSettingModel3);
        LiveSettingModel liveSettingModel4 = new LiveSettingModel("live_stream_strategy_pre_init_app_info_budle", "boolean", new q(Boolean.FALSE));
        liveSettingModel4.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.settings.LiveStreamPreInitAppInfoBundleSetting", liveSettingModel4);
        return this.LIZ;
    }
}
