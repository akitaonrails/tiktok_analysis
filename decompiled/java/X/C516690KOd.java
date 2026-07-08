package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.q;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0KOd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C516690KOd {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(20);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(20);

    public final HashMap<String, ScopeValue> LIZ() {
        if (this.LIZIZ.size() > 0) {
            return this.LIZIZ;
        }
        HashMap<String, ScopeValue> map = this.LIZIZ;
        ScopeValue scopeValue = ScopeValue.SUBSCRIPTION;
        map.put("live_sub_contract_create_error_code_mock", scopeValue);
        this.LIZIZ.put("live_sub_active_order_list_size_limit", scopeValue);
        this.LIZIZ.put("live_sub_enable_mock_auto_renewal_sku_query_failed", scopeValue);
        this.LIZIZ.put("live_sub_mock_empty_offer_token", scopeValue);
        this.LIZIZ.put("live_sub_only_space_preview", scopeValue);
        this.LIZIZ.put("live_sub_only_video_pin_card_price_disable", scopeValue);
        this.LIZIZ.put("live_sub_payment_detail_error_code_mock", scopeValue);
        this.LIZIZ.put("live_sub_payment_error_code_mock", scopeValue);
        this.LIZIZ.put("live_sub_payment_gp_helper_url", scopeValue);
        this.LIZIZ.put("live_sub_view_perf_report_sample_config", scopeValue);
        this.LIZIZ.put("live_subscription_emotes_url", ScopeValue.OTHER);
        this.LIZIZ.put("sov_consumption_cover_list_picker_feature_toggle_enabled", scopeValue);
        this.LIZIZ.put("sub_check_order_id_list_size", scopeValue);
        this.LIZIZ.put("sub_creator_chat_rooms_banner_show_times", scopeValue);
        this.LIZIZ.put("sub_creator_chat_rooms_manage_deeplink", scopeValue);
        this.LIZIZ.put("sub_live_only_chat_stay_ms", scopeValue);
        this.LIZIZ.put("privilege_page_ux_optimization_is_enabled", scopeValue);
        this.LIZIZ.put("sub_vip_sub_only_live", scopeValue);
        this.LIZIZ.put("subscriptions_photo_text_consumption_killswitch", scopeValue);
        this.LIZIZ.put("subscription_extra_log_pb_filter", scopeValue);
        return this.LIZIZ;
    }

    public final HashMap<String, LiveSettingModel> LIZIZ() {
        if (this.LIZ.size() > 0) {
            return this.LIZ;
        }
        this.LIZ.put("com.bytedance.android.livesdk.comp.api.subscription.setting.LiveMockContractCreateErrorCode", new LiveSettingModel("live_sub_contract_create_error_code_mock", "int", new q((Number) 0)));
        this.LIZ.put("com.bytedance.android.livesdk.comp.api.subscription.setting.LiveSubActiveOrderListSizeLimitSetting", new LiveSettingModel("live_sub_active_order_list_size_limit", "int", new q((Number) Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT))));
        Boolean bool = Boolean.FALSE;
        this.LIZ.put("com.bytedance.android.livesdk.comp.api.subscription.setting.LiveSubEnableMockAutoRenewalSkuQueryFailedSetting", new LiveSettingModel("live_sub_enable_mock_auto_renewal_sku_query_failed", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.livesdk.comp.api.subscription.setting.LiveSubMockEmptyOfferTokenTestSetting", new LiveSettingModel("live_sub_mock_empty_offer_token", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.livesdk.comp.api.subscription.setting.LiveSubOnlySpacePreviewSetting", new LiveSettingModel("live_sub_only_space_preview", "int", new q((Number) 0)));
        this.LIZ.put("com.bytedance.android.livesdk.comp.api.subscription.setting.LiveSubOnlyVideoPinCardPriceDisableSetting", new LiveSettingModel("live_sub_only_video_pin_card_price_disable", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.livesdk.comp.api.subscription.setting.LiveSubPaymentDetailErrorCodeMockSetting", new LiveSettingModel("live_sub_payment_detail_error_code_mock", "int", new q((Number) 0)));
        this.LIZ.put("com.bytedance.android.livesdk.comp.api.subscription.setting.LiveSubPaymentErrorCodeMockSetting", new LiveSettingModel("live_sub_payment_error_code_mock", "int", new q((Number) 0)));
        this.LIZ.put("com.bytedance.android.livesdk.comp.api.subscription.setting.LiveSubPaymentGpHelperUrlSetting", new LiveSettingModel("live_sub_payment_gp_helper_url", "java.lang.String", new q("https://support.google.com/googleplay/answer/1267137?co=GENIE.Platform%3DAndroid")));
        this.LIZ.put("com.bytedance.android.livesdk.comp.api.subscription.setting.LiveSubViewPerfReportSampleConfigSetting", new LiveSettingModel("live_sub_view_perf_report_sample_config", "Map<String, Float>", new q("")));
        this.LIZ.put("com.bytedance.android.livesdk.comp.api.subscription.setting.LiveSubscriptionEmoteUrl", new LiveSettingModel("live_subscription_emotes_url", "java.lang.String", new q("")));
        this.LIZ.put("com.bytedance.android.livesdk.comp.api.subscription.setting.PrivilegePageVideoListSetting", new LiveSettingModel("sov_consumption_cover_list_picker_feature_toggle_enabled", "boolean", new q(Boolean.TRUE)));
        this.LIZ.put("com.bytedance.android.livesdk.comp.api.subscription.setting.SubCheckOrderIdListSizeSetting", new LiveSettingModel("sub_check_order_id_list_size", "int", new q((Number) 5)));
        this.LIZ.put("com.bytedance.android.livesdk.comp.api.subscription.setting.SubCreatorChatRoomsBannerShowTimesSetting", new LiveSettingModel("sub_creator_chat_rooms_banner_show_times", "int", new q((Number) 3)));
        this.LIZ.put("com.bytedance.android.livesdk.comp.api.subscription.setting.SubCreatorChatRoomsManageDeeplink", new LiveSettingModel("sub_creator_chat_rooms_manage_deeplink", "java.lang.String", new q("aweme://lynxview?bdhm_bid=tiktok_creator_subscription_lynx&bdhm_pid=creator_chat_room_settings&enable_prefetch=1&hide_nav_bar=1&hide_status_bar=0&trans_status_bar=1&use_forest=1&use_spark=1&url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-source-sg%2F10%2Fgecko%2Fresource%2Ftiktok_creator_subscription_lynx%2FCreatorChatRoomSettings%2Ftemplate.js")));
        this.LIZ.put("com.bytedance.android.livesdk.comp.api.subscription.setting.SubLiveOnlyChatStayMsSetting", new LiveSettingModel("sub_live_only_chat_stay_ms", "int", new q((Number) 120)));
        this.LIZ.put("com.bytedance.android.livesdk.comp.api.subscription.setting.SubOnlySpacePreviewUxOptimizationSetting", new LiveSettingModel("privilege_page_ux_optimization_is_enabled", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.livesdk.comp.api.subscription.setting.SubVipSubOnlyLiveSetting", new LiveSettingModel("sub_vip_sub_only_live", "int", new q((Number) 1)));
        this.LIZ.put("com.bytedance.android.livesdk.comp.api.subscription.setting.SubscriptionPhotoTextConsumptionKillswitch", new LiveSettingModel("subscriptions_photo_text_consumption_killswitch", "boolean", new q(bool)));
        this.LIZ.put("com.bytedance.android.livesdk.comp.api.subscription.setting.SubscriptionTransactionSceneFilterSetting", new LiveSettingModel("subscription_extra_log_pb_filter", "java.lang.String[]", new q("")));
        return this.LIZ;
    }
}
