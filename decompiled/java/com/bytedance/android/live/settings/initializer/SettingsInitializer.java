package com.bytedance.android.live.settings.initializer;

import X.C0JW6;
import X.C0KVH;
import X.C1151990g5F;
import X.C1152000g5G;
import X.C1152010g5H;
import X.C1152020g5I;
import X.C1152030g5J;
import X.C1152040g5K;
import X.C1152050g5L;
import X.C1152060g5M;
import X.C1152070g5N;
import X.C1152080g5O;
import X.C1152090g5P;
import X.C1152100g5Q;
import X.C1152110g5R;
import X.C1152120g5S;
import X.C1152130g5T;
import X.C1152140g5U;
import X.C1152150g5V;
import X.C1152160g5W;
import X.C1152170g5X;
import X.C1152180g5Y;
import X.C1152190g5Z;
import X.C1152200g5a;
import X.C1152210g5b;
import X.C1152220g5c;
import X.C1152230g5d;
import X.C1152240g5e;
import X.C1152250g5f;
import X.C1152260g5g;
import X.C1152270g5h;
import X.C1152280g5i;
import X.C1152290g5j;
import X.C1152300g5k;
import X.C1152310g5l;
import X.C1152320g5m;
import X.C1152330g5n;
import X.C476320Im6;
import X.C476330Im7;
import X.C476340Im8;
import X.C476350Im9;
import X.C487010J7z;
import X.C516690KOd;
import X.C518030KTh;
import X.InterfaceC476410ImF;
import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.q;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public final class SettingsInitializer implements InterfaceC476410ImF {
    public static final C1152330g5n Companion = new Object() { // from class: X.0g5n
    };
    public static volatile HashMap<String, ScopeValue> keyToScopeMapCache;

    /* JADX INFO: renamed from: getKeyToScopeMap, reason: merged with bridge method [inline-methods] */
    public HashMap<String, ScopeValue> m120getKeyToScopeMap() {
        HashMap<String, ScopeValue> map;
        HashMap<String, ScopeValue> map2;
        HashMap<String, ScopeValue> map3;
        HashMap<String, ScopeValue> map4;
        HashMap<String, ScopeValue> map5;
        HashMap<String, ScopeValue> map6;
        HashMap<String, ScopeValue> map7;
        HashMap<String, ScopeValue> map8;
        HashMap<String, ScopeValue> map9;
        HashMap<String, ScopeValue> map10;
        HashMap<String, ScopeValue> map11;
        HashMap<String, ScopeValue> map12;
        HashMap<String, ScopeValue> map13;
        if (keyToScopeMapCache == null) {
            synchronized (SettingsInitializer.class) {
                try {
                    if (keyToScopeMapCache == null) {
                        HashMap<String, ScopeValue> map14 = new HashMap<>(4687);
                        map14.putAll(new C1152280g5i().LIZ());
                        map14.putAll(new C1152000g5G().LIZJ());
                        map14.putAll(new C1152210g5b().LIZ());
                        map14.putAll(new C1152200g5a().LIZ());
                        C1152310g5l c1152310g5l = new C1152310g5l();
                        if (c1152310g5l.LIZIZ.size() > 0) {
                            map = c1152310g5l.LIZIZ;
                        } else {
                            c1152310g5l.LIZIZ.put("opt_live_effect_area", ScopeValue.BROADCAST);
                            map = c1152310g5l.LIZIZ;
                        }
                        map14.putAll(map);
                        map14.putAll(new C516690KOd().LIZ());
                        map14.putAll(new C1152040g5K().LIZ());
                        map14.putAll(new C1152010g5H().LIZ());
                        map14.putAll(new C1152300g5k().LIZ());
                        C1152260g5g c1152260g5g = new C1152260g5g();
                        if (c1152260g5g.LIZIZ.size() > 0) {
                            map2 = c1152260g5g.LIZIZ;
                        } else {
                            c1152260g5g.LIZIZ.put("ttlive_combine_request_exp", ScopeValue.ROOMFUNCTION);
                            map2 = c1152260g5g.LIZIZ;
                        }
                        map14.putAll(map2);
                        C476340Im8 c476340Im8 = new C476340Im8();
                        if (c476340Im8.LIZIZ.size() > 0) {
                            map3 = c476340Im8.LIZIZ;
                        } else {
                            c476340Im8.LIZIZ.put("live_watch_later_max_size", ScopeValue.FEED);
                            map3 = c476340Im8.LIZIZ;
                        }
                        map14.putAll(map3);
                        map14.putAll(new C1151990g5F().LJJLIL());
                        map14.putAll(new C1152130g5T().LIZ());
                        map14.putAll(new C1152060g5M().LIZ());
                        map14.putAll(new C1152030g5J().LIZ());
                        map14.putAll(new C1152120g5S().LIZ());
                        map14.putAll(new C476330Im7().LIZ());
                        C1152230g5d c1152230g5d = new C1152230g5d();
                        if (c1152230g5d.LIZIZ.size() > 0) {
                            map4 = c1152230g5d.LIZIZ;
                        } else {
                            HashMap<String, ScopeValue> map15 = c1152230g5d.LIZIZ;
                            ScopeValue scopeValue = ScopeValue.WATCHLIVE;
                            map15.put("live_service_manager_init_opt_for_host_service", scopeValue);
                            c1152230g5d.LIZIZ.put("live_service_manager_init_opt_for_live_service", scopeValue);
                            map4 = c1152230g5d.LIZIZ;
                        }
                        map14.putAll(map4);
                        map14.putAll(new C487010J7z().LIZ());
                        map14.putAll(new C1152110g5R().LIZ());
                        map14.putAll(new C1152150g5V().LIZ());
                        map14.putAll(new C476350Im9().LIZ());
                        C1152220g5c c1152220g5c = new C1152220g5c();
                        if (c1152220g5c.LIZIZ.size() > 0) {
                            map5 = c1152220g5c.LIZIZ;
                        } else {
                            HashMap<String, ScopeValue> map16 = c1152220g5c.LIZIZ;
                            ScopeValue scopeValue2 = ScopeValue.BROADCAST;
                            map16.put("live_decoration_disclaimer_switch", scopeValue2);
                            c1152220g5c.LIZIZ.put("live_decoration_setting_page_entrance_switcher", scopeValue2);
                            c1152220g5c.LIZIZ.put("board_edit_text_opt_setting", scopeValue2);
                            map5 = c1152220g5c.LIZIZ;
                        }
                        map14.putAll(map5);
                        map14.putAll(new C1152170g5X().LIZ());
                        map14.putAll(new C0KVH().LIZ());
                        map14.putAll(new C1152140g5U().LIZ());
                        C0JW6 c0jw6 = new C0JW6();
                        if (c0jw6.LIZIZ.size() > 0) {
                            map6 = c0jw6.LIZIZ;
                        } else {
                            HashMap<String, ScopeValue> map17 = c0jw6.LIZIZ;
                            ScopeValue scopeValue3 = ScopeValue.SUBSCRIPTION;
                            map17.put("subscription_anchor_emotes_setting_item_policy", scopeValue3);
                            c0jw6.LIZIZ.put("sub_tpl_list_prefetch_opt", scopeValue3);
                            map6 = c0jw6.LIZIZ;
                        }
                        map14.putAll(map6);
                        map14.putAll(new C1152080g5O().LIZ());
                        C1152320g5m c1152320g5m = new C1152320g5m();
                        if (c1152320g5m.LIZIZ.size() > 0) {
                            map7 = c1152320g5m.LIZIZ;
                        } else {
                            c1152320g5m.LIZIZ.put("live_image_high_priority_url_domain_map", ScopeValue.OTHER);
                            map7 = c1152320g5m.LIZIZ;
                        }
                        map14.putAll(map7);
                        map14.putAll(new C1152180g5Y().LIZ());
                        C518030KTh c518030KTh = new C518030KTh();
                        if (c518030KTh.LIZIZ.size() > 0) {
                            map8 = c518030KTh.LIZIZ;
                        } else {
                            HashMap<String, ScopeValue> map18 = c518030KTh.LIZIZ;
                            ScopeValue scopeValue4 = ScopeValue.REVENUE;
                            map18.put("live_super_fan_emote_new_tip", scopeValue4);
                            c518030KTh.LIZIZ.put("live_super_fan_package_prefetch_setting", scopeValue4);
                            map8 = c518030KTh.LIZIZ;
                        }
                        map14.putAll(map8);
                        map14.putAll(new C1152020g5I().LIZ());
                        map14.putAll(new C1152090g5P().LIZ());
                        map14.putAll(new C476320Im6().LIZ());
                        C1152290g5j c1152290g5j = new C1152290g5j();
                        if (c1152290g5j.LIZIZ.size() > 0) {
                            map9 = c1152290g5j.LIZIZ;
                        } else {
                            c1152290g5j.LIZIZ.put("live_like_degrade", ScopeValue.PERFORMANCE);
                            map9 = c1152290g5j.LIZIZ;
                        }
                        map14.putAll(map9);
                        map14.putAll(new C1152100g5Q().LIZ());
                        map14.putAll(new C1152070g5N().LIZ());
                        C1152240g5e c1152240g5e = new C1152240g5e();
                        if (c1152240g5e.LIZIZ.size() > 0) {
                            map10 = c1152240g5e.LIZIZ;
                        } else {
                            c1152240g5e.LIZIZ.put("live_banner_optimize", ScopeValue.BANNER);
                            map10 = c1152240g5e.LIZIZ;
                        }
                        map14.putAll(map10);
                        map14.putAll(new C1152050g5L().LIZ());
                        map14.putAll(new C1152160g5W().LIZ());
                        C1152250g5f c1152250g5f = new C1152250g5f();
                        if (c1152250g5f.LIZIZ.size() > 0) {
                            map11 = c1152250g5f.LIZIZ;
                        } else {
                            c1152250g5f.LIZIZ.put("live_recharge_campaign_panel_fallback", ScopeValue.REVENUE_STRATEGY);
                            map11 = c1152250g5f.LIZIZ;
                        }
                        map14.putAll(map11);
                        C1152270g5h c1152270g5h = new C1152270g5h();
                        if (c1152270g5h.LIZIZ.size() > 0) {
                            map12 = c1152270g5h.LIZIZ;
                        } else {
                            c1152270g5h.LIZIZ.put("live_slardar_sdk_config", ScopeValue.OTHER);
                            map12 = c1152270g5h.LIZIZ;
                        }
                        map14.putAll(map12);
                        C1152190g5Z c1152190g5Z = new C1152190g5Z();
                        if (c1152190g5Z.LIZIZ.size() > 0) {
                            map13 = c1152190g5Z.LIZIZ;
                        } else {
                            HashMap<String, ScopeValue> map19 = c1152190g5Z.LIZIZ;
                            ScopeValue scopeValue5 = ScopeValue.LINKMIC;
                            map19.put("multi_guest_all_layout_corner_opt_audience", scopeValue5);
                            c1152190g5Z.LIZIZ.put("multi_guest_all_panel_layout_nick_name_min_width", scopeValue5);
                            map13 = c1152190g5Z.LIZIZ;
                        }
                        map14.putAll(map13);
                        keyToScopeMapCache = map14;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        HashMap<String, ScopeValue> map20 = keyToScopeMapCache;
        return map20 == null ? new HashMap<>() : map20;
    }

    @Override // X.InterfaceC476410ImF
    public HashMap<String, LiveSettingModel> getModelMap() {
        HashMap<String, LiveSettingModel> map;
        HashMap<String, LiveSettingModel> map2;
        HashMap<String, LiveSettingModel> map3;
        HashMap<String, LiveSettingModel> map4;
        HashMap<String, LiveSettingModel> map5;
        HashMap<String, LiveSettingModel> map6;
        HashMap<String, LiveSettingModel> map7;
        HashMap<String, LiveSettingModel> map8 = new HashMap<>(4687);
        C1152280g5i c1152280g5i = new C1152280g5i();
        if (c1152280g5i.LIZ.size() > 0) {
            map = c1152280g5i.LIZ;
        } else {
            LiveSettingModel liveSettingModel = new LiveSettingModel("crm_lynx_widget_setting_2", "int", new q((Number) 0));
            liveSettingModel.setCacheNoUpdate(true);
            c1152280g5i.LIZ.put("com.bytedance.android.livesdk.api.revenue.crm.CRMUseLynxWidget", liveSettingModel);
            LiveSettingModel liveSettingModel2 = new LiveSettingModel("crm_lynx_widget_setting_2_lazyload", "boolean", new q(Boolean.FALSE));
            liveSettingModel2.setCacheNoUpdate(true);
            c1152280g5i.LIZ.put("com.bytedance.android.livesdk.api.revenue.crm.CRMUseLynxWidgetLazyLoad", liveSettingModel2);
            LiveSettingModel liveSettingModel3 = new LiveSettingModel("full_screen_cs_companion_fold_delay", "int", new q((Number) 5));
            liveSettingModel3.setCacheNoUpdate(true);
            c1152280g5i.LIZ.put("com.bytedance.android.livesdk.api.revenue.crm.FullScreenCsCompanionFoldDelaySetting", liveSettingModel3);
            LiveSettingModel liveSettingModel4 = new LiveSettingModel("full_screen_optimization", "int", new q((Number) 0));
            liveSettingModel4.setCacheNoUpdate(true);
            c1152280g5i.LIZ.put("com.bytedance.android.livesdk.api.revenue.crm.FullScreenCsCompanionSetting", liveSettingModel4);
            c1152280g5i.LIZ.put("com.bytedance.android.livesdk.api.revenue.crm.LiveHideCrmTipsWidgetSetting", new LiveSettingModel("live_hide_crm_tips_widget", "int", new q((Number) 0)));
            map = c1152280g5i.LIZ;
        }
        map8.putAll(map);
        C1152000g5G c1152000g5G = new C1152000g5G();
        if (c1152000g5G.LIZ.size() > 0) {
            map2 = c1152000g5G.LIZ;
        } else {
            Boolean bool = Boolean.TRUE;
            c1152000g5G.LIZ.put("com.bytedance.android.live.common.keyboard.LivesdkFixFloatingKeyboardObserverSetting", new LiveSettingModel("livesdk_fix_floating_keyboard_observer", "boolean", new q(bool)));
            Boolean bool2 = Boolean.FALSE;
            c1152000g5G.LIZ.put("com.bytedance.android.live.core.utils.GeckoLoadLottieDefaultFontSetting", new LiveSettingModel("gecko_load_lottie_default_font", "boolean", new q(bool2)));
            LiveSettingModel liveSettingModel5 = new LiveSettingModel("live_conflict_avoid_follow_capsule_position_opt", "boolean", new q(bool2));
            liveSettingModel5.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.live.uikit.setting.LiveConflictAvoidFollowCapsulePositionOpt", liveSettingModel5);
            LiveSettingModel liveSettingModel6 = new LiveSettingModel("live_conflict_avoid_input_anim_opt", "boolean", new q(bool2));
            liveSettingModel6.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.live.uikit.setting.LiveConflictAvoidInputAnimOpt", liveSettingModel6);
            LiveSettingModel liveSettingModel7 = new LiveSettingModel("live_conflict_avoid_push_card_anim_opt", "boolean", new q(bool2));
            liveSettingModel7.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.live.uikit.setting.LiveConflictAvoidPushCardAnimOpt", liveSettingModel7);
            LiveSettingModel liveSettingModel8 = new LiveSettingModel("live_more_sheet_migration_enabled", "boolean", new q(bool2));
            liveSettingModel8.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.live.uikit.setting.LiveMoreSheetMigrationSetting", liveSettingModel8);
            LiveSettingModel liveSettingModel9 = new LiveSettingModel("live_notify_component_window_focus", "boolean", new q(bool2));
            liveSettingModel9.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.live.uikit.setting.LiveNotifyComponentWindowFocusOptimize", liveSettingModel9);
            LiveSettingModel liveSettingModel10 = new LiveSettingModel("live_panel_framework", "PanelFrameworkConfig", new q(""));
            liveSettingModel10.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.live.uikit.setting.LivePanelFrameworkSetting", liveSettingModel10);
            LiveSettingModel liveSettingModel11 = new LiveSettingModel("red_dot_complete_check_is_showing", "boolean", new q(bool));
            liveSettingModel11.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.live.uikit.setting.LiveRedDotCompleteCheckIsShowingSetting", liveSettingModel11);
            LiveSettingModel liveSettingModel12 = new LiveSettingModel("live_red_dot_manager_re_entry_exp", "boolean", new q(bool2));
            liveSettingModel12.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.live.uikit.setting.LiveRedDotManagerReEntryExp", liveSettingModel12);
            LiveSettingModel liveSettingModel13 = new LiveSettingModel("live_red_dot_notify_protect", "boolean", new q(bool2));
            liveSettingModel13.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.live.uikit.setting.LiveRedDotNotifyProtectSetting", liveSettingModel13);
            LiveSettingModel liveSettingModel14 = new LiveSettingModel("red_dot_valid_default_value", "boolean", new q(bool2));
            liveSettingModel14.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.live.uikit.setting.LiveRedDotValidDefaultValueSetting", liveSettingModel14);
            LiveSettingModel liveSettingModel15 = new LiveSettingModel("panel_revenue_fans_group_guide_v2", "int", new q((Number) 0));
            liveSettingModel15.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.live.uikit.setting.LiveSheetMigrationFansGroupGuideV2Setting", liveSettingModel15);
            LiveSettingModel liveSettingModel16 = new LiveSettingModel("mg_enable_audience_panel_service_v2", "int", new q((Number) 0));
            liveSettingModel16.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.live.uikit.setting.LiveSheetMigrationMultiWatchLinkedMicSetting", liveSettingModel16);
            LiveSettingModel liveSettingModel17 = new LiveSettingModel("live_bubble_have_duration_config", "boolean", new q(bool));
            liveSettingModel17.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.live.uikit.setting.LiveTooltipDurationSetting", liveSettingModel17);
            LiveSettingModel liveSettingModel18 = new LiveSettingModel("live_tooltip_hotspot_opt_block_list", "List<String>", new q(""));
            liveSettingModel18.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.live.uikit.setting.LiveTooltipHotspotOptBlockListSetting", liveSettingModel18);
            LiveSettingModel liveSettingModel19 = new LiveSettingModel("live_tooltip_hotspot_opt", "boolean", new q(bool2));
            liveSettingModel19.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.live.uikit.setting.LiveTooltipHotspotOptSetting", liveSettingModel19);
            LiveSettingModel liveSettingModel20 = new LiveSettingModel("live_tooltip_leak_fix", "boolean", new q(bool2));
            liveSettingModel20.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.live.uikit.setting.LiveTooltipLeakFixSetting", liveSettingModel20);
            LiveSettingModel liveSettingModel21 = new LiveSettingModel("live_tooltip_touch_outside_dismiss", "boolean", new q(bool2));
            liveSettingModel21.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.live.uikit.setting.LiveTooltipTouchOutsideDismissSetting", liveSettingModel21);
            c1152000g5G.LIZ.put("com.bytedance.android.live.uikit.util.LiveTooltipOnDialogFixSetting", new LiveSettingModel("live_tooltip_on_dialog_fix", "boolean", new q(bool)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.comment.emoji.LiveCommentDefaultEmojiInfoSetting", new LiveSettingModel("live_comment_default_emoji_info", "Map<String, String>", new q("")));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.comment.emoji.LiveCommentEmojiSwitchSettingSetting", new LiveSettingModel("live_comment_emoji_switch_setting", "boolean", new q(bool2)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.comment.emoji.LiveCommentPanelEmojiListSetting", new LiveSettingModel("live_comment_panel_emoji_list", "java.lang.String[]", new q("")));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.comment.emoji.LiveSmallEmojiResCacheSizeSetting", new LiveSettingModel("live_small_emoji_res_cache_size", "int", new q((Number) 100)));
            LiveSettingModel liveSettingModel22 = new LiveSettingModel("live_fix_frequency_manager_concurrent_modification_exception", "boolean", new q(bool));
            liveSettingModel22.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.frequency.setting.LiveFixFrequencyManagerConcurrentModificationExceptionSetting", liveSettingModel22);
            LiveSettingModel liveSettingModel23 = new LiveSettingModel("live_message_fluency_config", "LiveNotifyMessageFrequencyConfig", new q(""));
            liveSettingModel23.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.frequency.setting.LiveNotifyMessageFrequencySetting", liveSettingModel23);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.AnchorCommerceLifeMakeWaySetting", new LiveSettingModel("anchor_commerce_life_make_way", "int", new q((Number) 0)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.AnchorFixPreviewPromoteShowErrorSetting", new LiveSettingModel("anchor_fix_preview_promote_show_error", "int", new q((Number) 1)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LiveCommentPanelFitsystemFixSetting", new LiveSettingModel("live_comment_panel_fitsystem_fix", "boolean", new q(bool)));
            LiveSettingModel liveSettingModel24 = new LiveSettingModel("live_effect_notify_check_params", "boolean", new q(bool2));
            liveSettingModel24.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LiveEffectNotifyCheckParamsSetting", liveSettingModel24);
            LiveSettingModel liveSettingModel25 = new LiveSettingModel("live_effect_notify_delay", "EffectNotifyDelayInfo", new q(""));
            liveSettingModel25.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LiveEffectNotifyDelaySetting", liveSettingModel25);
            LiveSettingModel liveSettingModel26 = new LiveSettingModel("live_interact_view_request_layout_opt_setting", "boolean", new q(bool2));
            liveSettingModel26.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LiveInteractViewRequestLayoutOptSetting", liveSettingModel26);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LiveNotifyFontWeightOptSetting", new LiveSettingModel("live_notify_font_weight_opt", "int", new q((Number) 0)));
            LiveSettingModel liveSettingModel27 = new LiveSettingModel("live_public_screen_ui_config_audience_container_height", "int", new q((Number) 220));
            liveSettingModel27.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAudienceContainerHeightSetting", liveSettingModel27);
            LiveSettingModel liveSettingModel28 = new LiveSettingModel("live_public_screen_ui_config_anchor_container_height", "int", new q((Number) 220));
            liveSettingModel28.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAnchorContainerHeightSetting", liveSettingModel28);
            LiveSettingModel liveSettingModel29 = new LiveSettingModel("live_public_screen_ui_config_audience_fading_edge", "int", new q((Number) 24));
            liveSettingModel29.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAudienceFadingEdgeSetting", liveSettingModel29);
            LiveSettingModel liveSettingModel30 = new LiveSettingModel("live_public_screen_ui_config_anchor_fading_edge", "int", new q((Number) 24));
            liveSettingModel30.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAnchorFadingEdgeSetting", liveSettingModel30);
            LiveSettingModel liveSettingModel31 = new LiveSettingModel("live_public_screen_ui_config_audience_name_shadow", "PublicScreenShadowConfig", new q(""));
            liveSettingModel31.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAudienceNameShadowSetting", liveSettingModel31);
            LiveSettingModel liveSettingModel32 = new LiveSettingModel("live_public_screen_ui_config_audience_content_shadow", "PublicScreenShadowConfig", new q(""));
            liveSettingModel32.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAudienceContentShadowSetting", liveSettingModel32);
            LiveSettingModel liveSettingModel33 = new LiveSettingModel("live_public_screen_ui_config_anchor_name_shadow", "PublicScreenShadowConfig", new q(""));
            liveSettingModel33.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAnchorNameShadowSetting", liveSettingModel33);
            LiveSettingModel liveSettingModel34 = new LiveSettingModel("live_public_screen_ui_config_anchor_content_shadow", "PublicScreenShadowConfig", new q(""));
            liveSettingModel34.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAnchorContentShadowSetting", liveSettingModel34);
            LiveSettingModel liveSettingModel35 = new LiveSettingModel("live_public_screen_ui_config_audience_text_font_size", "int", new q((Number) 14));
            liveSettingModel35.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAudienceTextFontSizeSetting", liveSettingModel35);
            LiveSettingModel liveSettingModel36 = new LiveSettingModel("live_public_screen_ui_config_anchor_text_font_size", "int", new q((Number) 14));
            liveSettingModel36.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAnchorTextFontSizeSetting", liveSettingModel36);
            LiveSettingModel liveSettingModel37 = new LiveSettingModel("live_public_screen_ui_config_audience_user_font_color", "java.lang.String", new q("#80FFFFFF"));
            liveSettingModel37.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAudienceUserFontColorSetting", liveSettingModel37);
            LiveSettingModel liveSettingModel38 = new LiveSettingModel("live_public_screen_ui_config_anchor_user_font_color", "java.lang.String", new q("#80FFFFFF"));
            liveSettingModel38.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAnchorUserFontColorSetting", liveSettingModel38);
            LiveSettingModel liveSettingModel39 = new LiveSettingModel("live_public_screen_ui_config_audience_content_font_color", "java.lang.String", new q("#E6FFFFFF"));
            liveSettingModel39.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAudienceContentFontColorSetting", liveSettingModel39);
            LiveSettingModel liveSettingModel40 = new LiveSettingModel("live_public_screen_ui_config_anchor_content_font_color", "java.lang.String", new q("#E6FFFFFF"));
            liveSettingModel40.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAnchorContentFontColorSetting", liveSettingModel40);
            LiveSettingModel liveSettingModel41 = new LiveSettingModel("live_public_screen_ui_config_audience_icon_size", "int", new q((Number) 12));
            liveSettingModel41.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAudienceIconSizeSetting", liveSettingModel41);
            LiveSettingModel liveSettingModel42 = new LiveSettingModel("live_public_screen_ui_config_anchor_icon_size", "int", new q((Number) 12));
            liveSettingModel42.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAnchorIconSizeSetting", liveSettingModel42);
            LiveSettingModel liveSettingModel43 = new LiveSettingModel("live_public_screen_ui_config_audience_badge", "PublicScreenBadgeConfig", new q(""));
            liveSettingModel43.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAudienceBadgeSetting", liveSettingModel43);
            LiveSettingModel liveSettingModel44 = new LiveSettingModel("live_public_screen_ui_config_anchor_badge", "PublicScreenBadgeConfig", new q(""));
            liveSettingModel44.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAnchorBadgeSetting", liveSettingModel44);
            LiveSettingModel liveSettingModel45 = new LiveSettingModel("live_public_screen_ui_config_audience_text_font_weight", "int", new q((Number) 0));
            liveSettingModel45.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAudienceTextFontWeightSetting", liveSettingModel45);
            LiveSettingModel liveSettingModel46 = new LiveSettingModel("live_public_screen_ui_config_anchor_text_font_weight", "int", new q((Number) 0));
            liveSettingModel46.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAnchorTextFontWeightSetting", liveSettingModel46);
            LiveSettingModel liveSettingModel47 = new LiveSettingModel("live_public_screen_ui_config_adaptive_line_height", "boolean", new q(bool2));
            liveSettingModel47.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAdaptiveLineHeightSetting", liveSettingModel47);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LiveRoomFunctionUpdateIntervalSetting", new LiveSettingModel("live_room_function_update_interval", "long", new q((Number) 60000L)));
            LiveSettingModel liveSettingModel48 = new LiveSettingModel("live_audience_mute_alert_show_toast", "boolean", new q(bool2));
            liveSettingModel48.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LiveUserInfoMuteUIAudienceToastOpt", liveSettingModel48);
            LiveSettingModel liveSettingModel49 = new LiveSettingModel("live_audience_mute_alert_show_toast_room_cache", "int", new q((Number) 20));
            liveSettingModel49.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LiveUserInfoMuteUIAudienceToastRoomCache", liveSettingModel49);
            LiveSettingModel liveSettingModel50 = new LiveSettingModel("live_widget_exit_room_check_params", "boolean", new q(bool));
            liveSettingModel50.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.LiveWidgetExitRoomCheckParamsSetting", liveSettingModel50);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.AnchorFpsAdapterOptABSetting", new LiveSettingModel("anchor_fps_adapter_opt", "int", new q((Number) 0)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.AnchorSlowFunctionOptABSetting", new LiveSettingModel("anchor_slow_function_opt_ab", "int", new q((Number) 0)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.GameDualDeviceParamsSetting", new LiveSettingModel("live_game_dual_device_param_setting", "DualDeviceParamSetting", new q("")));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorCropBitmapDecodeSetting", new LiveSettingModel("live_cover_crop_bitmap_decode", "boolean", new q(bool2)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveBGMSetting", new LiveSettingModel("live_upgrade_bgm", "int", new q((Number) 1)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveBgServiceStrategySetting", new LiveSettingModel("ttlive_bg_service_strategy_setting", "int", new q((Number) 29)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveBoardUiConfigSetting", new LiveSettingModel("live_board_ui_config", "float", new q((Number) Float.valueOf(32.0f))));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastResizePreviewOpt", new LiveSettingModel("live_broadcast_resize_preview_opt", "boolean", new q(bool)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastWidgetBatchLoad", new LiveSettingModel("live_broadcast_widget_batch_load", "WidgetBatchLoadConfig", new q("")));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterEntranceVerifySetting", new LiveSettingModel("live_center_entrance_verify", "long", new q((Number) 2L)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverCameraSetting", new LiveSettingModel("live_cover_camera_compliance", "int", new q((Number) 0)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveDualDeviceQRCodeCacheSetting", new LiveSettingModel("live_game_dual_device_qr_code_cache_setting", "int", new q((Number) 0)));
            LiveSettingModel liveSettingModel51 = new LiveSettingModel("live_effect_background_repel", "boolean", new q(bool));
            liveSettingModel51.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectBackgroundCoexistSetting", liveSettingModel51);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectDynamicAdaptiveForbidApplyWhenLevelChangeSetting", new LiveSettingModel("live_effect_dynamic_adaptive_forbid_apply_when_level_change", "int", new q((Number) 0)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectDynamicAdaptiveGradeKeyPrefixList", new LiveSettingModel("live_effect_grade_prefix_list", "java.lang.String[]", new q("")));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectDynamicAdaptiveSetting", new LiveSettingModel("live_effect_dynamic_adaptive_setting", "int", new q((Number) 0)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectErrorInfoReportSetting", new LiveSettingModel("enable_effect_errorinfo_report", "int", new q((Number) 0)));
            LiveSettingModel liveSettingModel52 = new LiveSettingModel("live_effect_requirement_repel_with_background", "java.lang.String[]", new q(""));
            liveSettingModel52.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectRequirementExclusive", liveSettingModel52);
            LiveSettingModel liveSettingModel53 = new LiveSettingModel("live_effect_requirement_repel_with_liveboards", "java.lang.String[]", new q(""));
            liveSettingModel53.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectRequirementExclusiveForLiveBoards", liveSettingModel53);
            LiveSettingModel liveSettingModel54 = new LiveSettingModel("live_effect_search_delay_ms", "long", new q((Number) 300L));
            liveSettingModel54.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectSearchDelaySetting", liveSettingModel54);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveEndOptSetting", new LiveSettingModel("live_end_opt_setting", "LiveEndOptConfig", new q("")));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveExposureDarkGuideDelaySetting", new LiveSettingModel("live_exposure_dark_guide_delay", "int", new q((Number) 6000)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveExposureOptSetting", new LiveSettingModel("live_exposure_opt", "int", new q((Number) 0)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveExtendedPublicScreenMaxMessageConfig", new LiveSettingModel("live_extended_public_screen_max_msg_config", "BufferConfig", new q("")));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveForceRefreshRateSetting", new LiveSettingModel("live_force_refresh_rate_setting", "boolean", new q(bool2)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveGameLiveSupportDecoupling", new LiveSettingModel("live_game_live_support_decoupling", "boolean", new q(bool)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveGiftCreatorPanelRecordSetting", new LiveSettingModel("live_creator_gift_panel_record_request_limit", "int", new q((Number) 50)));
            LiveSettingModel liveSettingModel55 = new LiveSettingModel("live_gift_display_count_fix_setting", "boolean", new q(bool2));
            liveSettingModel55.setCacheNoUpdate(true);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveGiftDisplayCountFixSetting", liveSettingModel55);
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveHostLiveStreamInitSetting", new LiveSettingModel("live_host_live_stream_init", "boolean", new q(bool)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveInactiveGameplayForceInsertionSetting", new LiveSettingModel("live_inactive_gameplay_gift_force_insertion", "int", new q((Number) 604800)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeDeepLinkSetting", new LiveSettingModel("live_karaoke_deeplink", "int", new q((Number) 0)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeSetting", new LiveSettingModel("live_host_karaok_enable", "int", new q((Number) 0)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.CoinForbidLiveKaraokeSetting", new LiveSettingModel("live_host_karaok_enable_coin", "int", new q((Number) 0)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveMakeupEntrySetting", new LiveSettingModel("live_makeup_entry_enable", "int", new q((Number) 0)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveMirrorServiceStrategySetting", new LiveSettingModel("ttlive_mirror_service_strategy_setting", "int", new q((Number) 0)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveObsBgServiceStrategySetting", new LiveSettingModel("ttlive_obs_bg_service_strategy_setting", "int", new q((Number) 34)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LivePauseTimeSetting", new LiveSettingModel("live_anchor_pause_times", "int", new q((Number) 3)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LivePushStreamIntervalSetting", new LiveSettingModel("live_push_stream_interval", "long", new q((Number) 3000L)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveRecyclerViewImageOptSetting", new LiveSettingModel("live_load_image_when_scroll_rv", "LiveRecyclerViewOptData", new q("")));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveReplayTranscodeSetting", new LiveSettingModel("live_replay_transcode_on_demand", "int", new q((Number) 0)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveRetryPushCountSetting", new LiveSettingModel("live_retry_push_count_setting", "int", new q((Number) 0)));
            c1152000g5G.LIZ.put("com.bytedance.android.livesdk.livesetting.broadcast.LiveStickerDataSourceOptSetting", new LiveSettingModel("live_sticker_data_source_opt", "int", new q((Number) 0)));
            c1152000g5G.LIZ();
            c1152000g5G.LIZIZ();
            map2 = c1152000g5G.LIZ;
        }
        map8.putAll(map2);
        C1152210g5b c1152210g5b = new C1152210g5b();
        if (c1152210g5b.LIZ.size() > 0) {
            map3 = c1152210g5b.LIZ;
        } else {
            Boolean bool3 = Boolean.FALSE;
            c1152210g5b.LIZ.put("com.bytedance.android.livesdk.game.broadcast.bgbroadcast.internalrecord.EnableFallbackAudioOldChainSetting", new LiveSettingModel("enable_fallback_audio_old_chain", "boolean", new q(bool3)));
            c1152210g5b.LIZ.put("com.bytedance.android.livesdk.game.broadcast.bgbroadcast.internalrecord.TtliveGameInternalRecordDetectConfigSetting", new LiveSettingModel("ttlive_game_internal_record_detect_config", "GameInternalRecordDetectConfig", new q("")));
            LiveSettingModel liveSettingModel56 = new LiveSettingModel("mobile_game_feedback_analyse_info", "MobileGameBroadcastFeedbackConfig", new q(""));
            liveSettingModel56.setCacheNoUpdate(true);
            c1152210g5b.LIZ.put("com.bytedance.android.livesdk.game.broadcast.setting.MobileGameFeedbackAnalyseInfo", liveSettingModel56);
            LiveSettingModel liveSettingModel57 = new LiveSettingModel("high_ping_adjust_bitrate", "MobileHighPingAdjustBitrateConfig", new q(""));
            liveSettingModel57.setCacheNoUpdate(true);
            c1152210g5b.LIZ.put("com.bytedance.android.livesdk.game.broadcast.setting.MobileHighPingAdjustBitrateInfo", liveSettingModel57);
            LiveSettingModel liveSettingModel58 = new LiveSettingModel("mobile_high_ping_optimize_config", "MobileHighPingOptimizeConfig", new q(""));
            liveSettingModel58.setCacheNoUpdate(true);
            c1152210g5b.LIZ.put("com.bytedance.android.livesdk.game.broadcast.setting.MobileHighPingOptimizeInfo", liveSettingModel58);
            c1152210g5b.LIZ.put("com.bytedance.android.livesdk.game.common.setting.GameFeedHalfFragmentUpgradeForFullTypes", new LiveSettingModel("game_feed_half_fragment_upgrade_for_full_types", "boolean", new q(bool3)));
            c1152210g5b.LIZ.put("com.bytedance.android.livesdk.game.common.setting.GameTestAbVidSetting", new LiveSettingModel("game_test_ab_vid", "int", new q((Number) 0)));
            c1152210g5b.LIZ.put("com.bytedance.android.livesdk.game.common.setting.ShowLowPerformanceTipsDuration", new LiveSettingModel("show_low_performance_tips_inapp_duartion_time", "int", new q((Number) 180)));
            c1152210g5b.LIZ.put("com.bytedance.android.livesdk.game.common.setting.ShowTipLowEndDeviceMax", new LiveSettingModel("show_tip_low_end_device_max", "int", new q((Number) 6)));
            map3 = c1152210g5b.LIZ;
        }
        map8.putAll(map3);
        C1152200g5a c1152200g5a = new C1152200g5a();
        if (c1152200g5a.LIZ.size() > 0) {
            map4 = c1152200g5a.LIZ;
        } else {
            LiveSettingModel liveSettingModel59 = new LiveSettingModel("live_capsule_message_window_focus_experiment", "boolean", new q(Boolean.TRUE));
            liveSettingModel59.setCacheNoUpdate(true);
            c1152200g5a.LIZ.put("com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleMessageWindowFocusExperiment", liveSettingModel59);
            c1152200g5a.LIZ.put("com.bytedance.android.livesdk.livesetting.publicscreen.LiveExtendScreenGuideTestSetting", new LiveSettingModel("live_extend_screen_guide_test_setting", "GuideConfig", new q("")));
            LiveSettingModel liveSettingModel60 = new LiveSettingModel("live_extended_screen_gift_optimize", "int", new q((Number) 0));
            liveSettingModel60.setCacheNoUpdate(true);
            c1152200g5a.LIZ.put("com.bytedance.android.livesdk.livesetting.publicscreen.LiveExtendedScreenGiftOptimizeSetting", liveSettingModel60);
            LiveSettingModel liveSettingModel61 = new LiveSettingModel("live_public_screen_chat_holder_cache_config", "Config", new q(""));
            liveSettingModel61.setCacheNoUpdate(true);
            c1152200g5a.LIZ.put("com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenChatHolderCacheConfigSetting", liveSettingModel61);
            c1152200g5a.LIZ.put("com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenClickCloseKeyboardSetting", new LiveSettingModel("live_public_screen_click_close_keyboard", "int", new q((Number) 0)));
            c1152200g5a.LIZ.put("com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenClickCloseKeyboardAnchorSetting", new LiveSettingModel("live_public_screen_click_close_keyboard_anchor", "int", new q((Number) 0)));
            Boolean bool4 = Boolean.FALSE;
            c1152200g5a.LIZ.put("com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenMockDelayLoadSetting", new LiveSettingModel("live_public_screen_mock_delay_load", "boolean", new q(bool4)));
            c1152200g5a.LIZ.put("com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenSeiMsgSequenceSetting", new LiveSettingModel("live_public_screen_sei_msg_sequence_config", "SeiMsgSequenceConfig", new q("")));
            c1152200g5a.LIZ.put("com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenShadowOptimizationAnchorSetting", new LiveSettingModel("live_public_screen_shadow_optimization_anchor", "boolean", new q(bool4)));
            c1152200g5a.LIZ.put("com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenShadowOptimizationSetting", new LiveSettingModel("live_public_screen_shadow_optimization", "boolean", new q(bool4)));
            c1152200g5a.LIZ.put("com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenSubviewSetting", new LiveSettingModel("live_public_screen_management", "int", new q((Number) 0)));
            LiveSettingModel liveSettingModel62 = new LiveSettingModel("live_public_screen_xml_layer_opt", "int", new q((Number) 0));
            liveSettingModel62.setCacheNoUpdate(true);
            c1152200g5a.LIZ.put("com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenXmlLayerOptSetting", liveSettingModel62);
            LiveSettingModel liveSettingModel63 = new LiveSettingModel("live_public_screen_xml_layer_opt_anchor", "int", new q((Number) 0));
            liveSettingModel63.setCacheNoUpdate(true);
            c1152200g5a.LIZ.put("com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenXmlLayerOptAnchorSetting", liveSettingModel63);
            map4 = c1152200g5a.LIZ;
        }
        map8.putAll(map4);
        C1152310g5l c1152310g5l = new C1152310g5l();
        if (c1152310g5l.LIZ.size() > 0) {
            map5 = c1152310g5l.LIZ;
        } else {
            LiveSettingModel liveSettingModel64 = new LiveSettingModel("opt_live_effect_area", "boolean", new q(Boolean.TRUE));
            liveSettingModel64.setCacheNoUpdate(true);
            c1152310g5l.LIZ.put("com.bytedance.android.live.effect.setting.OptLiveEffectArea", liveSettingModel64);
            map5 = c1152310g5l.LIZ;
        }
        map8.putAll(map5);
        map8.putAll(new C516690KOd().LIZIZ());
        map8.putAll(new C1152040g5K().LIZIZ());
        map8.putAll(new C1152010g5H().LIZIZ());
        C1152300g5k c1152300g5k = new C1152300g5k();
        if (c1152300g5k.LIZ.size() > 0) {
            map6 = c1152300g5k.LIZ;
        } else {
            c1152300g5k.LIZ.put("com.bytedance.android.livesdk.comp.api.linkcore.api.VoiceChatLayoutRefactorAnchorSetting", new LiveSettingModel("voice_chat_layout_refactor_anchor", "int", new q((Number) 1)));
            c1152300g5k.LIZ.put("com.bytedance.android.livesdk.comp.api.linkcore.api.VoiceChatLayoutRefactorAudienceSetting", new LiveSettingModel("voice_chat_layout_refactor_audience", "int", new q((Number) 1)));
            LiveSettingModel liveSettingModel65 = new LiveSettingModel("linkmic_cohost_when_guest_anchor", "boolean", new q(Boolean.TRUE));
            liveSettingModel65.setCacheNoUpdate(true);
            c1152300g5k.LIZ.put("com.bytedance.android.livesdk.utils.LinkMicCohostWhenGuestAnchorSetting", liveSettingModel65);
            Boolean bool5 = Boolean.FALSE;
            LiveSettingModel liveSettingModel66 = new LiveSettingModel("linkmic_cohost_when_guest_audience", "boolean", new q(bool5));
            liveSettingModel66.setCacheNoUpdate(true);
            c1152300g5k.LIZ.put("com.bytedance.android.livesdk.utils.LinkMicCohostWhenGuestAudienceSetting", liveSettingModel66);
            LiveSettingModel liveSettingModel67 = new LiveSettingModel("live_cohost_audience_new_layout", "boolean", new q(bool5));
            liveSettingModel67.setCacheNoUpdate(true);
            c1152300g5k.LIZ.put("com.bytedance.android.livesdk.utils.LinkMicSdkCohostNewLayoutAudience", liveSettingModel67);
            map6 = c1152300g5k.LIZ;
        }
        map8.putAll(map6);
        map8.putAll(new C1152260g5g().LIZ());
        map8.putAll(new C476340Im8().LIZ());
        map8.putAll(new C1151990g5F().LJJLJ());
        map8.putAll(new C1152130g5T().LIZIZ());
        map8.putAll(new C1152060g5M().LIZIZ());
        map8.putAll(new C1152030g5J().LIZIZ());
        map8.putAll(new C1152120g5S().LIZIZ());
        map8.putAll(new C476330Im7().LIZIZ());
        map8.putAll(new C1152230g5d().LIZ());
        map8.putAll(new C487010J7z().LIZIZ());
        map8.putAll(new C1152110g5R().LIZIZ());
        map8.putAll(new C1152150g5V().LIZIZ());
        map8.putAll(new C476350Im9().LIZIZ());
        map8.putAll(new C1152220g5c().LIZ());
        map8.putAll(new C1152170g5X().LIZIZ());
        map8.putAll(new C0KVH().LIZIZ());
        map8.putAll(new C1152140g5U().LIZIZ());
        map8.putAll(new C0JW6().LIZ());
        map8.putAll(new C1152080g5O().LIZIZ());
        C1152320g5m c1152320g5m = new C1152320g5m();
        if (c1152320g5m.LIZ.size() > 0) {
            map7 = c1152320g5m.LIZ;
        } else {
            c1152320g5m.LIZ.put("com.bytedance.android.LiveImageUsDomainAdaptionSetting", new LiveSettingModel("live_image_high_priority_url_domain_map", "Map<String, String>", new q("")));
            map7 = c1152320g5m.LIZ;
        }
        map8.putAll(map7);
        map8.putAll(new C1152180g5Y().LIZIZ());
        map8.putAll(new C518030KTh().LIZ());
        map8.putAll(new C1152020g5I().LIZIZ());
        map8.putAll(new C1152090g5P().LIZIZ());
        map8.putAll(new C476320Im6().LIZIZ());
        map8.putAll(new C1152290g5j().LIZ());
        map8.putAll(new C1152100g5Q().LIZIZ());
        map8.putAll(new C1152070g5N().LIZIZ());
        map8.putAll(new C1152240g5e().LIZ());
        map8.putAll(new C1152050g5L().LIZIZ());
        map8.putAll(new C1152160g5W().LIZIZ());
        map8.putAll(new C1152250g5f().LIZ());
        map8.putAll(new C1152270g5h().LIZ());
        map8.putAll(new C1152190g5Z().LIZ());
        return map8;
    }

    @Override // X.InterfaceC476410ImF
    public HashMap<String, CacheLevel> getPreciseSettingInfo() {
        HashMap<String, CacheLevel> map = new HashMap<>(76);
        CacheLevel cacheLevel = CacheLevel.DID;
        map.put("live_psc_data_cache_enable_gift_sub", cacheLevel);
        map.put("live_psc_data_cache_enable_service_plus", cacheLevel);
        map.put("live_pcs_preload_framework_prefetch_course_detail", cacheLevel);
        map.put("live_pcs_preload_framework_prefetch_service_bio_anchor", cacheLevel);
        map.put("live_pcs_preload_pin_card", cacheLevel);
        map.put("live_pcs_service_bio_form_preload", cacheLevel);
        map.put("smb_go_live_page_unify_enable", cacheLevel);
        map.put("live_pcs_form_ux_opt", cacheLevel);
        map.put("sub_tpl_list_prefetch_opt", cacheLevel);
        map.put("game_feed_half_fragment_upgrade_for_full_types", cacheLevel);
        map.put("anchor_background_pause_request", cacheLevel);
        map.put("anchor_global_props_cache", cacheLevel);
        map.put("live_anchor_widget_load_exp", cacheLevel);
        map.put("dual_device_live_optimize", cacheLevel);
        map.put("camera_notification_bubble_status", cacheLevel);
        map.put("game_cast_refactor_enable", cacheLevel);
        map.put("game_broadcast_dual_device_extend_widget_load_opt", cacheLevel);
        map.put("anchor_gecko_download_zip_observer", cacheLevel);
        map.put("live_center_entrance_verify", cacheLevel);
        map.put("anchor_live_center_spark_lite", cacheLevel);
        map.put("live_game_dual_device_qr_code_params", cacheLevel);
        map.put("live_promote_schema_preload_setting", cacheLevel);
        map.put("anchor_tns_signal_report_opt", cacheLevel);
        map.put("lop_pns_fe_preload_ab", cacheLevel);
        map.put("live_pause_push_fps", cacheLevel);
        map.put("profile_page_banner_status", cacheLevel);
        map.put("anchor_second_page_code_cache", cacheLevel);
        map.put("live_pcs_optin_saf", cacheLevel);
        map.put("game_live_portrait_gift_tray_position_opt", cacheLevel);
        map.put("ttlive_game_guess_points_preview_opt", cacheLevel);
        map.put("game_live_landscape_hide_tool_button_opt", cacheLevel);
        map.put("ttlive_game_live_landscape_top_shadow_opt", cacheLevel);
        map.put("game_live_render_cutting_setting", cacheLevel);
        map.put("smart_game_anchor_ai_strategy_control_config", cacheLevel);
        map.put("smart_preview_game_moment_ai_config", cacheLevel);
        map.put("ttlive_game_live_enter_room_draw_load_opt", cacheLevel);
        map.put("game_live_partnership_mix_layout_use_spark_lite", cacheLevel);
        map.put("gift_high_traffic_buffer_dropping_strategy_android", cacheLevel);
        map.put("gift_panel_optimise_metrics", cacheLevel);
        map.put("gift_crop_transcode_strategy_android", cacheLevel);
        map.put("gift_degradation264_strategy", cacheLevel);
        map.put("gift_hardware_decode", cacheLevel);
        map.put("gift_player_software_opt", cacheLevel);
        map.put("gift_resource_integrity_check", cacheLevel);
        map.put("live_fans_task_initial_data_experiment_android", cacheLevel);
        map.put("live_level_up_effect_type", cacheLevel);
        map.put("linkmic_rtc_region_callback_opt_group", cacheLevel);
        map.put("linkmic_cohost_bundle_exception_optimize", cacheLevel);
        map.put("linkmic_rtc_region_callback_opt_group_v2", cacheLevel);
        map.put("linkmic_sdk_render_callback_time_opt", cacheLevel);
        map.put("live_multi_host_sei_on_going_time_opt", cacheLevel);
        map.put("live_parallel_pull_client_ab", cacheLevel);
        map.put("multi_guest_sdk_rtc_init_error_link_opt", cacheLevel);
        map.put("multi_match_half_screen_opt", cacheLevel);
        map.put("live_cohost_ui_sei_opt", cacheLevel);
        map.put("live_link_mic_sei_update", cacheLevel);
        map.put("enable_preview_game_moment", cacheLevel);
        map.put("live_game_pause_sei_config", cacheLevel);
        map.put("live_preview_game_guessing", cacheLevel);
        map.put("live_preview_game_moment", cacheLevel);
        map.put("ttec_enter_bag_list_from_fyp_live_preview", cacheLevel);
        map.put("ttec_enter_pdp_from_fyp_live_preview", cacheLevel);
        map.put("game_dual_device_vertical_full_video_enable", cacheLevel);
        map.put("smooth_clear_screen", cacheLevel);
        map.put("live_ultimateinflate_switch", cacheLevel);
        map.put("gift_guide_asr_trigger_setting", cacheLevel);
        map.put("ec_enable_brand_enhancement", cacheLevel);
        map.put("live_pcs_client_ai_anchor_opt_in_enable", cacheLevel);
        map.put("inner_push_stream_url_exp", cacheLevel);
        map.put("live_overdraw_opt", cacheLevel);
        map.put("live_drawer_arch_opt_2nd", cacheLevel);
        map.put("live_harmony_os_disable_pip", cacheLevel);
        map.put("live_refresh_rate_opt_dur", cacheLevel);
        map.put("live_pip_resume_enable", cacheLevel);
        map.put("screen_success_rate_exp", cacheLevel);
        map.put("live_pip_use_surfaceview", cacheLevel);
        return map;
    }
}
