package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.q;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Im6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C476320Im6 {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(45);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(45);

    public final HashMap<String, ScopeValue> LIZ() {
        if (this.LIZIZ.size() > 0) {
            return this.LIZIZ;
        }
        HashMap<String, ScopeValue> map = this.LIZIZ;
        ScopeValue scopeValue = ScopeValue.WATCHLIVE;
        map.put("live_slide_up_guide_refactor", scopeValue);
        HashMap<String, ScopeValue> map2 = this.LIZIZ;
        ScopeValue scopeValue2 = ScopeValue.PERFORMANCE;
        map2.put("live_animation_degrade", scopeValue2);
        this.LIZIZ.put("live_slide_guide_for_follow_sky", scopeValue);
        this.LIZIZ.put("live_slide_guide_show_entrance", scopeValue);
        this.LIZIZ.put("live_mt_room_slide_up_guide", scopeValue);
        this.LIZIZ.put("live_slide_up_guide_avoid", scopeValue);
        this.LIZIZ.put("live_inner_watch_history_extra_count", scopeValue);
        this.LIZIZ.put("ttlive_scroll_up_intercept", scopeValue);
        this.LIZIZ.put("internal_window_adapter_live_stream_panel", scopeValue);
        this.LIZIZ.put("internal_window_adapter_live_stream_panel_default", scopeValue);
        this.LIZIZ.put("internal_window_adapter_user_manual_mute", scopeValue);
        HashMap<String, ScopeValue> map3 = this.LIZIZ;
        ScopeValue scopeValue3 = ScopeValue.ROOMFUNCTION;
        map3.put("enter_gradual_widget_load_config", scopeValue3);
        this.LIZIZ.put("widget_load_config", scopeValue3);
        this.LIZIZ.put("widget_load_new_framework", scopeValue3);
        this.LIZIZ.put("widget_load_local_test_enable", scopeValue3);
        this.LIZIZ.put("live_finish_card_full_to_half_opt_config", scopeValue);
        this.LIZIZ.put("live_finish_card_opt_config", scopeValue);
        this.LIZIZ.put("push_live_end_use_simple_feed", scopeValue);
        this.LIZIZ.put("live_viewpager_can_scroll_fix", scopeValue);
        this.LIZIZ.put("live_surface_view_scene", scopeValue);
        this.LIZIZ.put("live_pip_use_surfaceview", scopeValue);
        this.LIZIZ.put("live_show_friend_post_push_inner_live", scopeValue);
        this.LIZIZ.put("live_draw_list_backup_entrance", scopeValue);
        this.LIZIZ.put("live_draw_list_backup_setting", scopeValue);
        this.LIZIZ.put("live_exit_guide_music_url", scopeValue);
        this.LIZIZ.put("live_exit_guide_type", scopeValue);
        this.LIZIZ.put("live_extra_card_scroll_fix", scopeValue);
        this.LIZIZ.put("live_fyp_skylight_inner_feed", scopeValue);
        this.LIZIZ.put("live_inner_post_trans", scopeValue);
        this.LIZIZ.put("live_inner_survey_exit_swipe", scopeValue);
        this.LIZIZ.put("live_interact_view_gone_setting_v2", scopeValue2);
        this.LIZIZ.put("live_interact_view_remove_setting_v2", scopeValue2);
        this.LIZIZ.put("live_mobile_to_pc_entrance_from_preview", scopeValue);
        this.LIZIZ.put("live_room_insert_scroll_state", scopeValue);
        this.LIZIZ.put("live_short_return_enter_room_slardar_sample_rate", scopeValue);
        this.LIZIZ.put("live_skylight_clear_screen_opt", scopeValue);
        this.LIZIZ.put("live_top_over_scroll_slardar_sample_rate", scopeValue);
        this.LIZIZ.put("load_more_retry_setting", scopeValue);
        this.LIZIZ.put("live_new_multi_feed_room_source_list", scopeValue);
        this.LIZIZ.put("pad_auto_rotate_screen_guide", scopeValue);
        this.LIZIZ.put("room_status_controller_v2_memeory_opt", scopeValue2);
        this.LIZIZ.put("skylight_backup_data_setting", scopeValue);
        this.LIZIZ.put("live_inner_survey_ttm_opt", scopeValue);
        this.LIZIZ.put("live_open_survey_fc_group_spit", scopeValue);
        this.LIZIZ.put("live_mem_leak_detect", scopeValue);
        return this.LIZIZ;
    }

    public final HashMap<String, LiveSettingModel> LIZIZ() {
        if (this.LIZ.size() > 0) {
            return this.LIZ;
        }
        Boolean bool = Boolean.FALSE;
        this.LIZ.put("com.bytedance.android.livesdk.chatroom.slide.LiveSlideUpGuideRefactorSetting", new LiveSettingModel("live_slide_up_guide_refactor", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.livesdk.chatroom.slide.v1.LiveAnimationDegradeSettings", new LiveSettingModel("live_animation_degrade", "LiveAnimationDegrade", new q("")));
        this.LIZ.put("com.bytedance.android.livesdk.chatroom.slide.v1.LiveCustomizedSlideGuideEnterFromFollowSkySetting", new LiveSettingModel("live_slide_guide_for_follow_sky", "int", new q((Number) 0)));
        LiveSettingModel liveSettingModel = new LiveSettingModel("live_slide_guide_show_entrance", "java.lang.String[]", new q(""));
        liveSettingModel.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.chatroom.slide.v1.LiveCustomizedSlideGuideSetting", liveSettingModel);
        this.LIZ.put("com.bytedance.android.livesdk.chatroom.slide.v1.LiveMtRoomSlideUpGuideSetting", new LiveSettingModel("live_mt_room_slide_up_guide", "RoomSlideUpGuide", new q("")));
        this.LIZ.put("com.bytedance.android.livesdk.chatroom.slide.v2.LiveSlideUpGuideAvoidSetting", new LiveSettingModel("live_slide_up_guide_avoid", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.livesdk.chatroom.ui.extracard.LiveInnerWatchHistoryExtraCountSetting", new LiveSettingModel("live_inner_watch_history_extra_count", "int", new q((Number) 5)));
        LiveSettingModel liveSettingModel2 = new LiveSettingModel("ttlive_scroll_up_intercept", "boolean", new q(bool));
        liveSettingModel2.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.chatroom.ui.extracard.LiveScrollUpInterceptOpt", liveSettingModel2);
        LiveSettingModel liveSettingModel3 = new LiveSettingModel("internal_window_adapter_live_stream_panel", "boolean", new q(bool));
        liveSettingModel3.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.chatroom.ui.widgetload.InternalWindowAdapterLiveStreamPanelSetting", liveSettingModel3);
        Boolean bool2 = Boolean.TRUE;
        LiveSettingModel liveSettingModel4 = new LiveSettingModel("internal_window_adapter_live_stream_panel_default", "boolean", new q(bool2));
        liveSettingModel4.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.chatroom.ui.widgetload.InternalWindowAdapterLiveStreamPanelDefaultSetting", liveSettingModel4);
        LiveSettingModel liveSettingModel5 = new LiveSettingModel("internal_window_adapter_user_manual_mute", "boolean", new q(bool));
        liveSettingModel5.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.chatroom.ui.widgetload.InternalWindowAdapterUserManualMuteSetting", liveSettingModel5);
        LiveSettingModel liveSettingModel6 = new LiveSettingModel("enter_gradual_widget_load_config", "WidgetLoadOptConfig", new q(""));
        liveSettingModel6.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.chatroom.ui.widgetload.setting.EnterGradualModelConfigSetting", liveSettingModel6);
        LiveSettingModel liveSettingModel7 = new LiveSettingModel("widget_load_config", "WidgetLoadOptConfig", new q(""));
        liveSettingModel7.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.chatroom.ui.widgetload.setting.WidgetCustomLoadConfigSetting", liveSettingModel7);
        LiveSettingModel liveSettingModel8 = new LiveSettingModel("widget_load_new_framework", "WidgetCustomLoadOptConfig", new q(""));
        liveSettingModel8.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.chatroom.ui.widgetload.setting.WidgetLoadEnableSetting", liveSettingModel8);
        LiveSettingModel liveSettingModel9 = new LiveSettingModel("widget_load_local_test_enable", "boolean", new q(bool2));
        liveSettingModel9.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.chatroom.ui.widgetload.setting.WidgetLoadLocalTestEnableSetting", liveSettingModel9);
        this.LIZ.put("com.bytedance.android.livesdk.livefinishcard.LiveEndPageFullToHalfOptSetting", new LiveSettingModel("live_finish_card_full_to_half_opt_config", "EndPageFullToHalfOptConfig", new q("")));
        this.LIZ.put("com.bytedance.android.livesdk.livefinishcard.LiveEndPageOptSetting", new LiveSettingModel("live_finish_card_opt_config", "EndPageOptConfig", new q("")));
        this.LIZ.put("com.bytedance.android.livesdk.livefinishcard.LivePushLiveEndUseSimpleFeed", new LiveSettingModel("push_live_end_use_simple_feed", "boolean", new q(bool)));
        LiveSettingModel liveSettingModel10 = new LiveSettingModel("live_viewpager_can_scroll_fix", "boolean", new q(bool));
        liveSettingModel10.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.liveroom.LiveViewpagerCanScrollFixSetting", liveSettingModel10);
        this.LIZ.put("com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveSurfaceViewSceneSetting", new LiveSettingModel("live_surface_view_scene", "SurfaceViewScene", new q("")));
        this.LIZ.put("com.bytedance.android.livesdk.pip.LivePipUseSurfaceViewSetting", new LiveSettingModel("live_pip_use_surfaceview", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.livesdk.setting.LiveAvoidFriendPostPushExp", new LiveSettingModel("live_show_friend_post_push_inner_live", "LiveAvoidFriendPostPushConfig", new q("")));
        this.LIZ.put("com.bytedance.android.livesdk.setting.LiveDrawListBackupEntrance", new LiveSettingModel("live_draw_list_backup_entrance", "java.lang.String[]", new q("")));
        this.LIZ.put("com.bytedance.android.livesdk.setting.LiveDrawListBackupSetting", new LiveSettingModel("live_draw_list_backup_setting", "LiveDrawListBackupConfig", new q("")));
        this.LIZ.put("com.bytedance.android.livesdk.setting.LiveExitGuideMusicUrlSetting", new LiveSettingModel("live_exit_guide_music_url", "java.lang.String", new q("")));
        this.LIZ.put("com.bytedance.android.livesdk.setting.LiveExitGuideTypeSetting", new LiveSettingModel("live_exit_guide_type", "java.lang.String", new q("")));
        this.LIZ.put("com.bytedance.android.livesdk.setting.LiveExtraCardScrollFixSetting", new LiveSettingModel("live_extra_card_scroll_fix", "boolean", new q(bool2)));
        this.LIZ.put("com.bytedance.android.livesdk.setting.LiveFYPSkylightSlideOpt", new LiveSettingModel("live_fyp_skylight_inner_feed", "int", new q((Number) 0)));
        this.LIZ.put("com.bytedance.android.livesdk.setting.LiveFeedApiPostExp", new LiveSettingModel("live_inner_post_trans", "int", new q((Number) 0)));
        LiveSettingModel liveSettingModel11 = new LiveSettingModel("live_inner_survey_exit_swipe", "boolean", new q(bool2));
        liveSettingModel11.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.setting.LiveInnerSurveyExitSwipe", liveSettingModel11);
        LiveSettingModel liveSettingModel12 = new LiveSettingModel("live_interact_view_gone_setting_v2", "Config", new q(""));
        liveSettingModel12.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.setting.LiveInteractViewGoneSettingV2", liveSettingModel12);
        LiveSettingModel liveSettingModel13 = new LiveSettingModel("live_interact_view_remove_setting_v2", "Config", new q(""));
        liveSettingModel13.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.setting.LiveInteractViewRemoveSettingV2", liveSettingModel13);
        this.LIZ.put("com.bytedance.android.livesdk.setting.LiveMobileToPcEntranceFromPreviewSetting", new LiveSettingModel("live_mobile_to_pc_entrance_from_preview", "java.lang.String[]", new q("")));
        this.LIZ.put("com.bytedance.android.livesdk.setting.LiveRoomInsertScrollState", new LiveSettingModel("live_room_insert_scroll_state", "List<Int>", new q("")));
        LiveSettingModel liveSettingModel14 = new LiveSettingModel("live_short_return_enter_room_slardar_sample_rate", "double", new q((Number) Double.valueOf(1.0E-4d)));
        liveSettingModel14.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.setting.LiveShortReturnEnterRoomSlardarSampleRateSetting", liveSettingModel14);
        this.LIZ.put("com.bytedance.android.livesdk.setting.LiveSkylightClearScreenOptSetting", new LiveSettingModel("live_skylight_clear_screen_opt", "boolean", new q(bool2)));
        this.LIZ.put("com.bytedance.android.livesdk.setting.LiveTopOverScrollSlardarSampleRateSetting", new LiveSettingModel("live_top_over_scroll_slardar_sample_rate", "double", new q((Number) Double.valueOf(0.05d))));
        this.LIZ.put("com.bytedance.android.livesdk.setting.LoadMoreRetrySetting", new LiveSettingModel("load_more_retry_setting", "LoadMoreRetryConfig", new q("")));
        this.LIZ.put("com.bytedance.android.livesdk.setting.MultiFeedRoomSourceSetting", new LiveSettingModel("live_new_multi_feed_room_source_list", "java.lang.String[]", new q("")));
        this.LIZ.put("com.bytedance.android.livesdk.setting.PadAutoRotateScreenGuideSetting", new LiveSettingModel("pad_auto_rotate_screen_guide", "PadAutoRotateScreenGuideSettingConfig", new q("")));
        this.LIZ.put("com.bytedance.android.livesdk.setting.RoomStatusControllerV2MemoryOptSetting", new LiveSettingModel("room_status_controller_v2_memeory_opt", "boolean", new q(bool2)));
        this.LIZ.put("com.bytedance.android.livesdk.setting.SkylightBackupDataSetting", new LiveSettingModel("skylight_backup_data_setting", "SkylightBackupDataConfig", new q("")));
        LiveSettingModel liveSettingModel15 = new LiveSettingModel("live_inner_survey_ttm_opt", "boolean", new q(bool));
        liveSettingModel15.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.survey.fullscreenstyle.LiveInnerSurveyTtmOptSetting", liveSettingModel15);
        LiveSettingModel liveSettingModel16 = new LiveSettingModel("live_open_survey_fc_group_spit", "boolean", new q(bool));
        liveSettingModel16.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livesdk.survey.util.LiveOpenSurveyFcGroupSpitSetting", liveSettingModel16);
        this.LIZ.put("com.bytedance.android.livesdk.watch.memleak.LiveMemLeakDetectSetting", new LiveSettingModel("live_mem_leak_detect", "int", new q((Number) 1)));
        return this.LIZ;
    }
}
