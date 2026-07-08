package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.q;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0g5P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152090g5P {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(22);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(22);

    public final HashMap<String, ScopeValue> LIZ() {
        if (this.LIZIZ.size() > 0) {
            return this.LIZIZ;
        }
        HashMap<String, ScopeValue> map = this.LIZIZ;
        ScopeValue scopeValue = ScopeValue.LINKMIC;
        map.put("first_frame_suc_fix_while_connecting_setting", scopeValue);
        this.LIZIZ.put("ttlive_anchor_device_score", scopeValue);
        HashMap<String, ScopeValue> map2 = this.LIZIZ;
        ScopeValue scopeValue2 = ScopeValue.ROOMFUNCTION;
        map2.put("broadcast_perf_score_setting_new", scopeValue2);
        HashMap<String, ScopeValue> map3 = this.LIZIZ;
        ScopeValue scopeValue3 = ScopeValue.PERFORMANCE;
        map3.put("cpu_temperature_list_path", scopeValue3);
        HashMap<String, ScopeValue> map4 = this.LIZIZ;
        ScopeValue scopeValue4 = ScopeValue.BROADCAST;
        map4.put("live_host_preview_runnable_block_setting", scopeValue4);
        this.LIZIZ.put("live_host_broadcast_runnable_block_setting", scopeValue4);
        this.LIZIZ.put("live_host_jato_settings", scopeValue2);
        this.LIZIZ.put("perf_fluency_optimize_setting", scopeValue2);
        this.LIZIZ.put("perf_use_apm_fluency_setting", scopeValue2);
        this.LIZIZ.put("realtime_game_host_perf_score_settings", scopeValue4);
        this.LIZIZ.put("realtime_host_perf_score_settings", scopeValue2);
        this.LIZIZ.put("realtime_perf_score_settings", scopeValue2);
        this.LIZIZ.put("anchor_memory_size_opt_setting", scopeValue4);
        this.LIZIZ.put("live_broadcast_memory_clean_setting", scopeValue4);
        this.LIZIZ.put("live_broadcast_memory_clean_setting_localtest", scopeValue4);
        this.LIZIZ.put("live_broadcast_memory_cleaners_enable_setting", scopeValue4);
        this.LIZIZ.put("live_host_memory_trigger_setting", scopeValue4);
        this.LIZIZ.put("player_memory_opt_setting", scopeValue3);
        HashMap<String, ScopeValue> map5 = this.LIZIZ;
        ScopeValue scopeValue5 = ScopeValue.WATCHLIVE;
        map5.put("memory_size_opt_setting", scopeValue5);
        this.LIZIZ.put("memory_size_opt_v3", scopeValue5);
        this.LIZIZ.put("watch_refresh_rate_setting", scopeValue5);
        this.LIZIZ.put("watch_live_task_reschedule", scopeValue5);
        return this.LIZIZ;
    }

    public final HashMap<String, LiveSettingModel> LIZIZ() {
        if (this.LIZ.size() > 0) {
            return this.LIZ;
        }
        Boolean bool = Boolean.FALSE;
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.linkmic.FirstFrameSucFixWhileConnectingSetting", new LiveSettingModel("first_frame_suc_fix_while_connecting_setting", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting", new LiveSettingModel("ttlive_anchor_device_score", "float", new q((Number) Float.valueOf(-1.0f))));
        LiveSettingModel liveSettingModel = new LiveSettingModel("broadcast_perf_score_setting_new", "Option", new q(""));
        liveSettingModel.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.performance.BroadcastPerfScoreSetting", liveSettingModel);
        LiveSettingModel liveSettingModel2 = new LiveSettingModel("cpu_temperature_list_path", "java.lang.String[]", new q(""));
        liveSettingModel2.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.performance.CpuTemperaturePathListSetting", liveSettingModel2);
        LiveSettingModel liveSettingModel3 = new LiveSettingModel("live_host_preview_runnable_block_setting", "LiveHostRunnableBlockConfig", new q(""));
        liveSettingModel3.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.performance.LiveHostPreviewRunnableBlockSetting", liveSettingModel3);
        LiveSettingModel liveSettingModel4 = new LiveSettingModel("live_host_broadcast_runnable_block_setting", "LiveHostRunnableBlockConfig", new q(""));
        liveSettingModel4.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.performance.LiveHostBroadcastRunnableBlockSetting", liveSettingModel4);
        LiveSettingModel liveSettingModel5 = new LiveSettingModel("live_host_jato_settings", "LiveJatoConfig", new q(""));
        liveSettingModel5.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.performance.LiveJatoSetting", liveSettingModel5);
        LiveSettingModel liveSettingModel6 = new LiveSettingModel("perf_fluency_optimize_setting", "boolean", new q(bool));
        liveSettingModel6.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.performance.PerfFluencyOptimizeSetting", liveSettingModel6);
        LiveSettingModel liveSettingModel7 = new LiveSettingModel("perf_use_apm_fluency_setting", "boolean", new q(bool));
        liveSettingModel7.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.performance.PerfUseApmFluencySetting", liveSettingModel7);
        LiveSettingModel liveSettingModel8 = new LiveSettingModel("realtime_game_host_perf_score_settings", "RealtimeGameHostPerfScoreConfig", new q(""));
        liveSettingModel8.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.performance.RealtimeGameHostPerfScoreSettings", liveSettingModel8);
        LiveSettingModel liveSettingModel9 = new LiveSettingModel("realtime_host_perf_score_settings", "RealtimeHostPerfScoreConfig", new q(""));
        liveSettingModel9.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.performance.RealtimeHostPerfScoreSettings", liveSettingModel9);
        LiveSettingModel liveSettingModel10 = new LiveSettingModel("realtime_perf_score_settings", "RealtimePerfScoreConfig", new q(""));
        liveSettingModel10.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.performance.RealtimePerfScoreSettings", liveSettingModel10);
        LiveSettingModel liveSettingModel11 = new LiveSettingModel("anchor_memory_size_opt_setting", "AnchorMemoryCleanConfig", new q(""));
        liveSettingModel11.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.performance.memory.AnchorMemoryOptimizeSetting", liveSettingModel11);
        LiveSettingModel liveSettingModel12 = new LiveSettingModel("live_broadcast_memory_clean_setting", "BroadcastMemoryCleanConfig", new q(""));
        liveSettingModel12.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.performance.memory.BroadcastMemoryCleanSetting", liveSettingModel12);
        LiveSettingModel liveSettingModel13 = new LiveSettingModel("live_broadcast_memory_clean_setting_localtest", "BroadcastMemoryCleanConfigLocalTest", new q(""));
        liveSettingModel13.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.performance.memory.BroadcastMemoryCleanSettingLocalTest", liveSettingModel13);
        LiveSettingModel liveSettingModel14 = new LiveSettingModel("live_broadcast_memory_cleaners_enable_setting", "BroadcastMemoryCleanersEnableConfig", new q(""));
        liveSettingModel14.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.performance.memory.BroadcastMemoryCleanersEnableSetting", liveSettingModel14);
        LiveSettingModel liveSettingModel15 = new LiveSettingModel("live_host_memory_trigger_setting", "MemoryTriggerConfig", new q(""));
        liveSettingModel15.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.performance.memory.MemoryTriggerSetting", liveSettingModel15);
        LiveSettingModel liveSettingModel16 = new LiveSettingModel("player_memory_opt_setting", "PlayerMemoryCleanConfig", new q(""));
        liveSettingModel16.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.performance.memory.PlayerMemOptimizeSetting", liveSettingModel16);
        LiveSettingModel liveSettingModel17 = new LiveSettingModel("memory_size_opt_setting", "MemoryCleanConfig", new q(""));
        liveSettingModel17.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.performance.memory.WatchMemoryOptimizeSetting", liveSettingModel17);
        LiveSettingModel liveSettingModel18 = new LiveSettingModel("memory_size_opt_v3", "MemoryOptConfig", new q(""));
        liveSettingModel18.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.performance.memory.WatchMemoryOptimizeV3Setting", liveSettingModel18);
        LiveSettingModel liveSettingModel19 = new LiveSettingModel("watch_refresh_rate_setting", "RefreshRateConfig", new q(""));
        liveSettingModel19.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.performance.power.WatchRefreshRateSetting", liveSettingModel19);
        LiveSettingModel liveSettingModel20 = new LiveSettingModel("watch_live_task_reschedule", "DowngradeLegoConfig", new q(""));
        liveSettingModel20.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.performance.strategy.WatchLiveDowngradeLegoTaskSettings", liveSettingModel20);
        return this.LIZ;
    }
}
