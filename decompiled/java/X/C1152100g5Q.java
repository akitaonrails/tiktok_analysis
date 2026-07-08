package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.q;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0g5Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152100g5Q {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(15);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(15);

    public final HashMap<String, ScopeValue> LIZ() {
        if (this.LIZIZ.size() > 0) {
            return this.LIZIZ;
        }
        HashMap<String, ScopeValue> map = this.LIZIZ;
        ScopeValue scopeValue = ScopeValue.BROADCAST;
        map.put("live_bg_music_default_volume_v2", scopeValue);
        this.LIZIZ.put("live_bg_music_default_volume", scopeValue);
        this.LIZIZ.put("live_forbbiden_detail_page", scopeValue);
        this.LIZIZ.put("live_broadcast_cleaner_record_max_size", scopeValue);
        this.LIZIZ.put("live_broadcast_cleaner_record_forbid", scopeValue);
        this.LIZIZ.put("live_nearby_label_experiment_version", scopeValue);
        this.LIZIZ.put("tiktok_live_location_bubble", ScopeValue.LINKMIC);
        HashMap<String, ScopeValue> map2 = this.LIZIZ;
        ScopeValue scopeValue2 = ScopeValue.OTHER;
        map2.put("live_file_monitor_sample", scopeValue2);
        HashMap<String, ScopeValue> map3 = this.LIZIZ;
        ScopeValue scopeValue3 = ScopeValue.PERFORMANCE;
        map3.put("live_broadcast_livelog_opt", scopeValue3);
        this.LIZIZ.put("live_i18n_center_init_opt", scopeValue2);
        this.LIZIZ.put("live_i18n_center_init_opt_v2", scopeValue2);
        this.LIZIZ.put("live_i18n_init_task_schedule", scopeValue2);
        this.LIZIZ.put("live_i18n_init_opt_hot_keys_default", scopeValue2);
        this.LIZIZ.put("live_i18n_update_max_length", scopeValue3);
        this.LIZIZ.put("live_i18n_update_retry", scopeValue3);
        return this.LIZIZ;
    }

    public final HashMap<String, LiveSettingModel> LIZIZ() {
        if (this.LIZ.size() > 0) {
            return this.LIZ;
        }
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveBGMDefaultVolumeSetting", new LiveSettingModel("live_bg_music_default_volume_v2", "float", new q((Number) Float.valueOf(0.15f))));
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveBgMusicDefaultVolumeSetting", new LiveSettingModel("live_bg_music_default_volume", "float", new q((Number) Float.valueOf(0.3f))));
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveForbbidenDetailPageSetting", new LiveSettingModel("live_forbbiden_detail_page", "java.lang.String", new q("")));
        LiveSettingModel liveSettingModel = new LiveSettingModel("live_broadcast_cleaner_record_max_size", "int", new q((Number) 100));
        liveSettingModel.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveHostCleanerRecordMaxSize", liveSettingModel);
        LiveSettingModel liveSettingModel2 = new LiveSettingModel("live_broadcast_cleaner_record_forbid", "boolean", new q(Boolean.FALSE));
        liveSettingModel2.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveHostCleanerRecordForbid", liveSettingModel2);
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveNearbyLabelExperimentVersionSetting", new LiveSettingModel("live_nearby_label_experiment_version", "java.lang.String", new q("v1")));
        LiveSettingModel liveSettingModel3 = new LiveSettingModel("tiktok_live_location_bubble", "BubbleConfig", new q(""));
        liveSettingModel3.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.TiktokLiveLocationBubbleSetting", liveSettingModel3);
        LiveSettingModel liveSettingModel4 = new LiveSettingModel("live_file_monitor_sample", "JSONObject", new q(""));
        liveSettingModel4.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.other.LiveFileMonitorSampleSetting", liveSettingModel4);
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastLiveLogOpt", new LiveSettingModel("live_broadcast_livelog_opt", "int", new q((Number) 0)));
        LiveSettingModel liveSettingModel5 = new LiveSettingModel("live_i18n_center_init_opt", "I18nInitOptConfig", new q(""));
        liveSettingModel5.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.performance.LiveI18nCenterInitOptSetting", liveSettingModel5);
        LiveSettingModel liveSettingModel6 = new LiveSettingModel("live_i18n_center_init_opt_v2", "I18nInitOptConfig", new q(""));
        liveSettingModel6.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.performance.LiveI18nCenterInitOptSettingV2", liveSettingModel6);
        LiveSettingModel liveSettingModel7 = new LiveSettingModel("live_i18n_init_task_schedule", "LiveI18nCenterTaskScheduleConfig", new q(""));
        liveSettingModel7.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.performance.LiveI18nCenterTaskScheduleExp", liveSettingModel7);
        LiveSettingModel liveSettingModel8 = new LiveSettingModel("live_i18n_init_opt_hot_keys_default", "I18nInitOptHotKeysDefault", new q(""));
        liveSettingModel8.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.performance.LiveI18nHotKeysDefaultSetting", liveSettingModel8);
        LiveSettingModel liveSettingModel9 = new LiveSettingModel("live_i18n_update_max_length", "I18nUpdateMaxLengthConfig", new q(""));
        liveSettingModel9.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.performance.LiveI18nUpdateMaxLengthSetting", liveSettingModel9);
        LiveSettingModel liveSettingModel10 = new LiveSettingModel("live_i18n_update_retry", "I18nUpdateRetryConfig", new q(""));
        liveSettingModel10.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.performance.LiveI18nUpdateRetrySetting", liveSettingModel10);
        return this.LIZ;
    }
}
