package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.q;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0g5N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152070g5N {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(35);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(35);

    public final HashMap<String, ScopeValue> LIZ() {
        if (this.LIZIZ.size() > 0) {
            return this.LIZIZ;
        }
        HashMap<String, ScopeValue> map = this.LIZIZ;
        ScopeValue scopeValue = ScopeValue.ROOMFUNCTION;
        map.put("live_board_max_show_count_setting", scopeValue);
        HashMap<String, ScopeValue> map2 = this.LIZIZ;
        ScopeValue scopeValue2 = ScopeValue.WATCHLIVE;
        map2.put("live_audience_gift_vote_optimize_disabled", scopeValue2);
        this.LIZIZ.put("ttlive_custom_gift_vote_short_touch_anim_duration", scopeValue);
        this.LIZIZ.put("ttlive_custom_gift_vote_short_touch_enter_schema", scopeValue);
        this.LIZIZ.put("ttlive_custom_gift_vote_short_touch_schema", scopeValue);
        this.LIZIZ.put("ttlive_quick_gift_vote_short_touch_anim_duration", scopeValue);
        this.LIZIZ.put("ttlive_quick_gift_vote_short_touch_enter_schema", scopeValue);
        this.LIZIZ.put("ttlive_quick_gift_vote_short_touch_schema", scopeValue);
        this.LIZIZ.put("livesdk_interactive_gift_adjust_enable", scopeValue2);
        this.LIZIZ.put("live_fix_pad_multi_guest_ps_height", scopeValue);
        this.LIZIZ.put("live_strategy_platform_all_config_map", scopeValue);
        this.LIZIZ.put("live_unregister_decision_opt", scopeValue);
        this.LIZIZ.put("live_epi_strategy_configs", scopeValue);
        this.LIZIZ.put("live_fix_stream_adaption", scopeValue);
        this.LIZIZ.put("live_interactive_bottom_min_height", scopeValue);
        this.LIZIZ.put("live_room_poll_type", scopeValue);
        this.LIZIZ.put("live_report_violation_preload_enable", scopeValue);
        this.LIZIZ.put("live_room_leak_fix_enable", ScopeValue.PERFORMANCE);
        this.LIZIZ.put("ec_enable_brand_enhancement", scopeValue);
        HashMap<String, ScopeValue> map3 = this.LIZIZ;
        ScopeValue scopeValue3 = ScopeValue.OTHER;
        map3.put("live_perf_tune_load_config", scopeValue3);
        this.LIZIZ.put("live_inner_flow_downgrade_logger_sample_rate", scopeValue3);
        this.LIZIZ.put("live_inner_flow_downgrade_setting", scopeValue3);
        this.LIZIZ.put("ttlive_inner_flow_pull_stream_network_ctrl_setting", scopeValue3);
        this.LIZIZ.put("watch_live_native_task_schedule_setting", scopeValue3);
        this.LIZIZ.put("watch_live_task_schedule_setting", scopeValue3);
        this.LIZIZ.put("live_ptf_setting_exp", scopeValue3);
        this.LIZIZ.put("ttlive_custom_gift_vote_host_schema_on_going", scopeValue);
        HashMap<String, ScopeValue> map4 = this.LIZIZ;
        ScopeValue scopeValue4 = ScopeValue.BROADCAST;
        map4.put("ttlive_custom_gift_vote_host_schema", scopeValue4);
        this.LIZIZ.put("ttlive_quick_gift_vote_host_schema", scopeValue4);
        this.LIZIZ.put("live_profile_memleak_opt", scopeValue);
        this.LIZIZ.put("live_profile_height_slardar_sample_rate", scopeValue);
        this.LIZIZ.put("live_custom_message_translate_api_latency", scopeValue);
        this.LIZIZ.put("live_pl_cus_msg_frequency_setting", scopeValue);
        this.LIZIZ.put("livesdk_qa_api_retry_count", scopeValue);
        this.LIZIZ.put("live_toolbar_no_title_share_icon_opt_new", scopeValue);
        return this.LIZIZ;
    }

    public final HashMap<String, LiveSettingModel> LIZIZ() {
        if (this.LIZ.size() > 0) {
            return this.LIZ;
        }
        this.LIZ.put("com.bytedance.android.livesdk.billboard.LiveBoardMaxShowCountSettingSetting", new LiveSettingModel("live_board_max_show_count_setting", "MutableMap<String, Int>", new q("")));
        this.LIZ.put("com.bytedance.android.livesdk.interaction.custompoll.shorttouch.setting.LiveAudienceGiftVoteOptimizeDisabledSetting", new LiveSettingModel("live_audience_gift_vote_optimize_disabled", "int", new q((Number) 0)));
        this.LIZ.put("com.bytedance.android.livesdk.interaction.custompoll.shorttouch.setting.TtliveCustomGiftVoteShortTouchAnimDurationSetting", new LiveSettingModel("ttlive_custom_gift_vote_short_touch_anim_duration", "long", new q((Number) 2560L)));
        this.LIZ.put("com.bytedance.android.livesdk.interaction.custompoll.shorttouch.setting.TtliveCustomGiftVoteShortTouchEnterSchemaSetting", new LiveSettingModel("ttlive_custom_gift_vote_short_touch_enter_schema", "java.lang.String", new q("aweme://roma_redirect/?roma_group_key=roma_schema_group_gift_vote&roma_page_key=roma_schema_page_short_touch_customized_enter")));
        this.LIZ.put("com.bytedance.android.livesdk.interaction.custompoll.shorttouch.setting.TtliveCustomGiftVoteShortTouchSchemaSetting", new LiveSettingModel("ttlive_custom_gift_vote_short_touch_schema", "java.lang.String", new q("aweme://roma_redirect/?roma_group_key=roma_schema_group_gift_vote&roma_page_key=roma_schema_page_short_touch_customized_vote")));
        this.LIZ.put("com.bytedance.android.livesdk.interaction.custompoll.shorttouch.setting.TtliveQuickGiftVoteShortTouchAnimDurationSetting", new LiveSettingModel("ttlive_quick_gift_vote_short_touch_anim_duration", "long", new q((Number) 2560L)));
        this.LIZ.put("com.bytedance.android.livesdk.interaction.custompoll.shorttouch.setting.TtliveQuickGiftVoteShortTouchEnterSchemaSetting", new LiveSettingModel("ttlive_quick_gift_vote_short_touch_enter_schema", "java.lang.String", new q("aweme://roma_redirect/?roma_group_key=roma_schema_group_gift_vote&roma_page_key=roma_schema_page_short_touch_quick_vote_enter")));
        this.LIZ.put("com.bytedance.android.livesdk.interaction.custompoll.shorttouch.setting.TtliveQuickGiftVoteShortTouchSchemaSetting", new LiveSettingModel("ttlive_quick_gift_vote_short_touch_schema", "java.lang.String", new q("aweme://roma_redirect/?roma_group_key=roma_schema_group_gift_vote&roma_page_key=roma_schema_page_short_touch_quick_vote")));
        Boolean bool = Boolean.TRUE;
        this.LIZ.put("com.bytedance.android.livesdk.layer.InteractiveGiftAdjustSetting", new LiveSettingModel("livesdk_interactive_gift_adjust_enable", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.livesdk.layer.LiveFixPadMultiGuestPsHeightSetting", new LiveSettingModel("live_fix_pad_multi_guest_ps_height", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.livesdk.livedecision.LiveStrategyPlatformAllConfigMapSetting", new LiveSettingModel("live_strategy_platform_all_config_map", "Map<String, Map<String, Any>>", new q("")));
        this.LIZ.put("com.bytedance.android.livesdk.livedecision.LiveUnregisterDecisionOptSetting", new LiveSettingModel("live_unregister_decision_opt", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.roomfunction.EPIStrategyConfigs", new LiveSettingModel("live_epi_strategy_configs", "List<String>", new q("")));
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.roomfunction.LiveFixStreamAdaptionSetting", new LiveSettingModel("live_fix_stream_adaption", "boolean", new q(bool)));
        LiveSettingModel liveSettingModel = new LiveSettingModel("live_interactive_bottom_min_height", "int", new q((Number) 100));
        liveSettingModel.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.roomfunction.LiveInteractiveBottomMinHeightSetting", liveSettingModel);
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.roomfunction.LivePollSetting", new LiveSettingModel("live_room_poll_type", "List<String>", new q("")));
        Boolean bool2 = Boolean.FALSE;
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.roomfunction.LiveReportViolationPreloadSetting", new LiveSettingModel("live_report_violation_preload_enable", "boolean", new q(bool2)));
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.roomfunction.LiveRoomLeakFixSetting", new LiveSettingModel("live_room_leak_fix_enable", "boolean", new q(bool2)));
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.roomfunction.LiveTrustInfoPrioritySetting", new LiveSettingModel("ec_enable_brand_enhancement", "boolean", new q(bool2)));
        LiveSettingModel liveSettingModel2 = new LiveSettingModel("live_perf_tune_load_config", "MutableMap<String, LivePerfLoadInfo>", new q(""));
        liveSettingModel2.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.performancetune.perfloadinfo.LivePerfLoadConfigs", liveSettingModel2);
        LiveSettingModel liveSettingModel3 = new LiveSettingModel("live_inner_flow_downgrade_logger_sample_rate", "float", new q((Number) Float.valueOf(0.001f)));
        liveSettingModel3.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.performancetune.pipeline.biz.innerflowdowngrade.LiveInnerFlowDowngradeLoggerExp", liveSettingModel3);
        LiveSettingModel liveSettingModel4 = new LiveSettingModel("live_inner_flow_downgrade_setting", "InnerFlowDowngradeSceneConfig", new q(""));
        liveSettingModel4.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.performancetune.pipeline.biz.innerflowdowngrade.LiveInnerFlowDowngradeSceneSetting", liveSettingModel4);
        LiveSettingModel liveSettingModel5 = new LiveSettingModel("ttlive_inner_flow_pull_stream_network_ctrl_setting", "LiveNetworkCtrlSettingConfig", new q(""));
        liveSettingModel5.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.performancetune.pipeline.biz.networkctrl.LiveNetworkCtrlSetting", liveSettingModel5);
        LiveSettingModel liveSettingModel6 = new LiveSettingModel("watch_live_native_task_schedule_setting", "TaskScheduleConfig", new q(""));
        liveSettingModel6.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.performancetune.pipeline.biz.taskschedule.LiveNativeTaskScheduleSetting", liveSettingModel6);
        LiveSettingModel liveSettingModel7 = new LiveSettingModel("watch_live_task_schedule_setting", "WatchLiveTaskScheduleTuneSceneConfig", new q(""));
        liveSettingModel7.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.performancetune.pipeline.biz.taskschedule.PTFWatchLiveScheduleSetting", liveSettingModel7);
        LiveSettingModel liveSettingModel8 = new LiveSettingModel("live_ptf_setting_exp", "boolean", new q(bool2));
        liveSettingModel8.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.performancetune.switch.LivePTFSettingExp", liveSettingModel8);
        this.LIZ.put("com.bytedance.android.livesdk.poll.setting.TtliveCustomGiftVoteHostSchemaOnGoingSetting", new LiveSettingModel("ttlive_custom_gift_vote_host_schema_on_going", "java.lang.String", new q("aweme://roma_redirect/?roma_group_key=roma_schema_group_gift_vote&roma_page_key=roma_schema_page_customized_gift_vote_detail")));
        this.LIZ.put("com.bytedance.android.livesdk.poll.setting.TtliveCustomGiftVoteHostSchemaSetting", new LiveSettingModel("ttlive_custom_gift_vote_host_schema", "java.lang.String", new q("aweme://roma_redirect/?roma_group_key=roma_schema_group_gift_vote&roma_page_key=roma_schema_page_customized_gift_vote_send")));
        this.LIZ.put("com.bytedance.android.livesdk.poll.setting.TtliveQuickGiftVoteHostSchemaSetting", new LiveSettingModel("ttlive_quick_gift_vote_host_schema", "java.lang.String", new q("aweme://roma_redirect/?roma_group_key=roma_schema_group_gift_vote&roma_page_key=roma_schema_page_quick_gift_vote")));
        this.LIZ.put("com.bytedance.android.livesdk.profile.service.LiveProfileMemleakOptSetting", new LiveSettingModel("live_profile_memleak_opt", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.livesdk.profile.util.LiveProfileHeightSlardarSampleRateSetting", new LiveSettingModel("live_profile_height_slardar_sample_rate", "double", new q((Number) Double.valueOf(0.05d))));
        LiveSettingModel liveSettingModel9 = new LiveSettingModel("live_custom_message_translate_api_latency", "long", new q((Number) 10000L));
        liveSettingModel9.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.programmedlive.pin.LiveCustomMessageTranslateApiLatencySetting", liveSettingModel9);
        this.LIZ.put("com.bytedance.android.livesdk.programmedlive.pin.LivePlCusMsgFrequencySettingSetting", new LiveSettingModel("live_pl_cus_msg_frequency_setting", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.livesdk.qa.LivesdkQaApiRetryCountSetting", new LiveSettingModel("livesdk_qa_api_retry_count", "int", new q((Number) 3)));
        this.LIZ.put("com.bytedance.android.livesdk.share.LiveShareIconOptSetting", new LiveSettingModel("live_toolbar_no_title_share_icon_opt_new", "int", new q((Number) 0)));
        return this.LIZ;
    }
}
