package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.q;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0g5O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152080g5O {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(32);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(32);

    public final HashMap<String, ScopeValue> LIZ() {
        if (this.LIZIZ.size() > 0) {
            return this.LIZIZ;
        }
        HashMap<String, ScopeValue> map = this.LIZIZ;
        ScopeValue scopeValue = ScopeValue.ROOMFUNCTION;
        map.put("live_billboard_avoid_keyboard", scopeValue);
        this.LIZIZ.put("live_epi_server_feature_types", scopeValue);
        this.LIZIZ.put("live_epi_signal_fallback_switch", scopeValue);
        this.LIZIZ.put("live_epi_signal_fallback_interval", scopeValue);
        this.LIZIZ.put("live_epi_signal_short_link_enable", scopeValue);
        HashMap<String, ScopeValue> map2 = this.LIZIZ;
        ScopeValue scopeValue2 = ScopeValue.PUBLICSCREEN;
        map2.put("live_chat_line_margin_comment_layer_adjust", scopeValue2);
        this.LIZIZ.put("live_multi_and_cohost_barrage_position_opt", scopeValue);
        HashMap<String, ScopeValue> map3 = this.LIZIZ;
        ScopeValue scopeValue3 = ScopeValue.WATCHLIVE;
        map3.put("live_comment_push_card_jump_fix", scopeValue3);
        this.LIZIZ.put("companion_tool_tag_frequency_control", scopeValue2);
        this.LIZIZ.put("live_message_center_tag_frequency_configs", scopeValue2);
        this.LIZIZ.put("live_message_center_tag_frequency_enabled", scopeValue2);
        this.LIZIZ.put("live_extended_screen_ui_optimize", scopeValue2);
        this.LIZIZ.put("live_main_frame_update_font_opt", scopeValue);
        this.LIZIZ.put("live_tips_in_stream_experiment", scopeValue2);
        this.LIZIZ.put("live_tags_new_container_enable", scopeValue2);
        this.LIZIZ.put("live_tips_show_align_msg_center_visible_enabled", scopeValue2);
        this.LIZIZ.put("live_tags_show_align_msg_center_visible_enabled", scopeValue2);
        HashMap<String, ScopeValue> map4 = this.LIZIZ;
        ScopeValue scopeValue4 = ScopeValue.COMMENT;
        map4.put("live_publicscreen_bg_animation_duration", scopeValue4);
        this.LIZIZ.put("live_publicscreen_bg_animation_switch_duration", scopeValue4);
        this.LIZIZ.put("live_stream_comment_adapter_anim", scopeValue3);
        this.LIZIZ.put("live_stream_comment_adapter", scopeValue3);
        this.LIZIZ.put("live_stream_panel_adapter", scopeValue3);
        this.LIZIZ.put("live_stream_ec_panel_adapter", scopeValue3);
        this.LIZIZ.put("live_stream_pdp_panel_adapter", scopeValue3);
        this.LIZIZ.put("live_stream_ec_panel_enhanced_adapter", scopeValue3);
        this.LIZIZ.put("live_tips_in_stream_frequency_configs", scopeValue2);
        this.LIZIZ.put("live_toolbar_load_optimize_ecom_enable", scopeValue3);
        this.LIZIZ.put("live_toolbar_load_optimize", scopeValue3);
        this.LIZIZ.put("live_toolbar_tips_guide_strategy_log", scopeValue);
        HashMap<String, ScopeValue> map5 = this.LIZIZ;
        ScopeValue scopeValue5 = ScopeValue.PERFORMANCE;
        map5.put("live_feature_center_all_config", scopeValue5);
        this.LIZIZ.put("live_feature_center_config", scopeValue5);
        this.LIZIZ.put("live_feature_center_enable", scopeValue5);
        return this.LIZIZ;
    }

    public final HashMap<String, LiveSettingModel> LIZIZ() {
        if (this.LIZ.size() > 0) {
            return this.LIZ;
        }
        Boolean bool = Boolean.TRUE;
        this.LIZ.put("com.bytedance.android.live.billboard.LiveBillboardAvoidKeyboardSetting", new LiveSettingModel("live_billboard_avoid_keyboard", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.live.dynamicstrategy.setting.LiveEpiServerFeatureTypesSetting", new LiveSettingModel("live_epi_server_feature_types", "[typealias HashMap]<String, String>", new q("")));
        this.LIZ.put("com.bytedance.android.live.dynamicstrategy.setting.LiveEpiSignalFallbackSwitchSetting", new LiveSettingModel("live_epi_signal_fallback_switch", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.live.dynamicstrategy.setting.LiveEpiSignalFallbackIntervalSetting", new LiveSettingModel("live_epi_signal_fallback_interval", "long", new q((Number) 5L)));
        this.LIZ.put("com.bytedance.android.live.dynamicstrategy.setting.LiveEpiSignalShortLinkEnableSetting", new LiveSettingModel("live_epi_signal_short_link_enable", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.live.livedecision.config.LiveChatLineMarginCommentLayerAdjustSetting", new LiveSettingModel("live_chat_line_margin_comment_layer_adjust", "StrategyConfig", new q("")));
        this.LIZ.put("com.bytedance.android.live.setting.LiveMultiAndCoHostBarragePositionOptAnchorSetting", new LiveSettingModel("live_multi_and_cohost_barrage_position_opt", "int", new q((Number) 0)));
        Boolean bool2 = Boolean.FALSE;
        LiveSettingModel liveSettingModel = new LiveSettingModel("live_comment_push_card_jump_fix", "boolean", new q(bool2));
        liveSettingModel.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.live.setting.LiveCommentPushCardJumpFixSetting", liveSettingModel);
        LiveSettingModel liveSettingModel2 = new LiveSettingModel("companion_tool_tag_frequency_control", "boolean", new q(bool2));
        liveSettingModel2.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.live.setting.LiveExtendedScreenFreqControlNewPhaseOptimizeSetting", liveSettingModel2);
        this.LIZ.put("com.bytedance.android.live.setting.LiveExtendedScreenFreqControlOptimizeSetting", new LiveSettingModel("live_message_center_tag_frequency_configs", "FrequencyConfig", new q("")));
        LiveSettingModel liveSettingModel3 = new LiveSettingModel("live_message_center_tag_frequency_enabled", "boolean", new q(bool2));
        liveSettingModel3.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.live.setting.LiveExtendedScreenFreqControlOptimizeEnable", liveSettingModel3);
        this.LIZ.put("com.bytedance.android.live.setting.LiveExtendedScreenUiOptimizeSetting", new LiveSettingModel("live_extended_screen_ui_optimize", "int", new q((Number) 0)));
        this.LIZ.put("com.bytedance.android.live.setting.LiveMainFrameUpdateFontOptSetting", new LiveSettingModel("live_main_frame_update_font_opt", "int", new q((Number) 0)));
        this.LIZ.put("com.bytedance.android.live.setting.LiveMinusOneScreenTipsInFeedSetting", new LiveSettingModel("live_tips_in_stream_experiment", "int", new q((Number) 0)));
        this.LIZ.put("com.bytedance.android.live.setting.LiveMinusOneScreenTipsInFeedTagsSetting", new LiveSettingModel("live_tags_new_container_enable", "boolean", new q(bool2)));
        this.LIZ.put("com.bytedance.android.live.setting.LiveMinusOneScreenTipsEventOptSetting", new LiveSettingModel("live_tips_show_align_msg_center_visible_enabled", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.live.setting.LiveMinusOneScreenTagsEventOptSetting", new LiveSettingModel("live_tags_show_align_msg_center_visible_enabled", "boolean", new q(bool)));
        LiveSettingModel liveSettingModel4 = new LiveSettingModel("live_publicscreen_bg_animation_duration", "long", new q((Number) 200L));
        liveSettingModel4.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.live.setting.LivePublicScreenBgAnimationDurationSetting", liveSettingModel4);
        LiveSettingModel liveSettingModel5 = new LiveSettingModel("live_publicscreen_bg_animation_switch_duration", "boolean", new q(bool));
        liveSettingModel5.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.live.setting.LivePublicScreenBgAnimationSwitchSetting", liveSettingModel5);
        LiveSettingModel liveSettingModel6 = new LiveSettingModel("live_stream_comment_adapter_anim", "boolean", new q(bool2));
        liveSettingModel6.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.live.setting.LiveStreamCommentAdapterAnimSetting", liveSettingModel6);
        LiveSettingModel liveSettingModel7 = new LiveSettingModel("live_stream_comment_adapter", "boolean", new q(bool2));
        liveSettingModel7.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.live.setting.LiveStreamCommentAdapterSetting", liveSettingModel7);
        LiveSettingModel liveSettingModel8 = new LiveSettingModel("live_stream_panel_adapter", "boolean", new q(bool2));
        liveSettingModel8.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.live.setting.LiveStreamPanelAdapterSetting", liveSettingModel8);
        LiveSettingModel liveSettingModel9 = new LiveSettingModel("live_stream_ec_panel_adapter", "boolean", new q(bool2));
        liveSettingModel9.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.live.setting.LiveStreamECPanelAdapterSetting", liveSettingModel9);
        LiveSettingModel liveSettingModel10 = new LiveSettingModel("live_stream_pdp_panel_adapter", "boolean", new q(bool2));
        liveSettingModel10.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.live.setting.LiveStreamPdpPanelAdapterSetting", liveSettingModel10);
        LiveSettingModel liveSettingModel11 = new LiveSettingModel("live_stream_ec_panel_enhanced_adapter", "boolean", new q(bool2));
        liveSettingModel11.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.live.setting.LiveStreamECPanelEnhancedAdapterSetting", liveSettingModel11);
        this.LIZ.put("com.bytedance.android.live.setting.LiveTipsInFeedFreqControlSetting", new LiveSettingModel("live_tips_in_stream_frequency_configs", "TipsInFeedFreqConfig", new q("")));
        LiveSettingModel liveSettingModel12 = new LiveSettingModel("live_toolbar_load_optimize_ecom_enable", "int", new q((Number) 0));
        liveSettingModel12.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.live.setting.LiveToolbarLoadOptEcomEnableSetting", liveSettingModel12);
        LiveSettingModel liveSettingModel13 = new LiveSettingModel("live_toolbar_load_optimize", "int", new q((Number) 0));
        liveSettingModel13.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.live.setting.LiveToolbarLoadOptimizeSetting", liveSettingModel13);
        this.LIZ.put("com.bytedance.android.live.setting.LiveToolbarTipsGuideStrategyLogSetting", new LiveSettingModel("live_toolbar_tips_guide_strategy_log", "boolean", new q(bool)));
        LiveSettingModel liveSettingModel14 = new LiveSettingModel("live_feature_center_all_config", "LiveFeatureCenterAllConfig", new q(""));
        liveSettingModel14.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livestrategy.config.LiveFeatureCenterAllConfigSetting", liveSettingModel14);
        LiveSettingModel liveSettingModel15 = new LiveSettingModel("live_feature_center_config", "LiveFeatureCenterConfig", new q(""));
        liveSettingModel15.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livestrategy.config.LiveFeatureCenterConfigSetting", liveSettingModel15);
        LiveSettingModel liveSettingModel16 = new LiveSettingModel("live_feature_center_enable", "int", new q((Number) 0));
        liveSettingModel16.setCacheNoUpdate(true);
        this.LIZ.put("com.bytedance.android.livestrategy.config.LiveFeatureCenterEnableExp", liveSettingModel16);
        return this.LIZ;
    }
}
