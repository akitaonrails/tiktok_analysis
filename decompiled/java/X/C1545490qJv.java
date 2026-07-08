package X;

import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0qJv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1545490qJv {
    public static final void LIZ(Map map, SparkPopupSchemaParam sparkPopupSchemaParam) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map;
        String str = (String) concurrentHashMap.get("__use_ttnet");
        if (str != null) {
            sparkPopupSchemaParam.set_useTtnet(C1545520qJy.LIZIZ("__use_ttnet", str, map, false));
        }
        String str2 = (String) concurrentHashMap.get("accessKey");
        if (str2 != null) {
            sparkPopupSchemaParam.setAccessKey(str2);
        }
        String str3 = (String) concurrentHashMap.get("access_key");
        if (str3 != null) {
            sparkPopupSchemaParam.setAccessKeyBp(str3);
        }
        String str4 = (String) concurrentHashMap.get("air_strict_mode_use_piperdata");
        if (str4 != null) {
            sparkPopupSchemaParam.setAirStrictModeUsePiperdata(C1545520qJy.LIZ(str4));
        }
        String str5 = (String) concurrentHashMap.get("append_common_params");
        if (str5 != null) {
            sparkPopupSchemaParam.setAppendCommonParams(C1545520qJy.LIZ(str5));
        }
        String str6 = (String) concurrentHashMap.get("auto_continue_load");
        if (str6 != null) {
            sparkPopupSchemaParam.setAutoContinueLoad(C1545520qJy.LIZ(str6));
        }
        String str7 = (String) concurrentHashMap.get("auto_play_bgm");
        if (str7 != null) {
            sparkPopupSchemaParam.setAutoPlayBgm(C1545520qJy.LIZIZ("auto_play_bgm", str7, map, false));
        }
        String str8 = (String) concurrentHashMap.get("bid");
        if (str8 != null) {
            sparkPopupSchemaParam.setBid(str8);
        }
        String str9 = (String) concurrentHashMap.get("block_back_press");
        if (str9 != null) {
            sparkPopupSchemaParam.setBlockBackPress(C1545520qJy.LIZ(str9));
        }
        String str10 = (String) concurrentHashMap.get("bundle");
        if (str10 != null) {
            sparkPopupSchemaParam.setBundle(str10);
        }
        String str11 = (String) concurrentHashMap.get("redirect_cdn_by_region");
        if (str11 != null) {
            sparkPopupSchemaParam.setCdnRegionRedirect(C1545520qJy.LIZ(str11));
        }
        String str12 = (String) concurrentHashMap.get("channel");
        if (str12 != null) {
            sparkPopupSchemaParam.setChannel(str12);
        }
        String str13 = (String) concurrentHashMap.get("clean_cookie_when_account_change");
        if (str13 != null) {
            sparkPopupSchemaParam.setCleanCookieWhenAccountChange(C1545520qJy.LIZ(str13));
        }
        String str14 = (String) concurrentHashMap.get("click_time");
        if (str14 != null) {
            sparkPopupSchemaParam.setClickTime(str14);
        }
        String str15 = (String) concurrentHashMap.get("container_bg_color");
        Object obj = concurrentHashMap.get("container_bg_color_dark");
        Object obj2 = concurrentHashMap.get("container_bg_color_light");
        if (str15 != null || obj != null || obj2 != null) {
            sparkPopupSchemaParam.setContainerBgColor(C1545520qJy.LIZJ("container_bg_color", str15, map));
        }
        String str16 = (String) concurrentHashMap.get("__debug_global_props");
        if (str16 != null) {
            sparkPopupSchemaParam.setDebugGlobalProps(str16);
        }
        String str17 = (String) concurrentHashMap.get("delay_spark_view_load");
        if (str17 != null) {
            sparkPopupSchemaParam.setDelaySparkViewLoad(C1545520qJy.LIZ(str17));
        }
        String str18 = (String) concurrentHashMap.get("disable_auto_remove_loading");
        if (str18 != null) {
            sparkPopupSchemaParam.setDisableAutoRemoveLoading(C1545520qJy.LIZ(str18));
        }
        String str19 = (String) concurrentHashMap.get("disable_back_press");
        if (str19 != null) {
            sparkPopupSchemaParam.setDisableBackPress(C1545520qJy.LIZ(str19));
        }
        String str20 = (String) concurrentHashMap.get("disable_builtin");
        if (str20 != null) {
            sparkPopupSchemaParam.setDisableBuiltin(Boolean.valueOf(C1545520qJy.LIZ(str20)));
        }
        String str21 = (String) concurrentHashMap.get("disable_cdn");
        if (str21 != null) {
            sparkPopupSchemaParam.setDisableCDN(Boolean.valueOf(C1545520qJy.LIZ(str21)));
        }
        String str22 = (String) concurrentHashMap.get("disable_event_cache");
        if (str22 != null) {
            sparkPopupSchemaParam.setDisableEventCache(C1545520qJy.LIZ(str22));
        }
        String str23 = (String) concurrentHashMap.get("disable_gecko");
        if (str23 != null) {
            sparkPopupSchemaParam.setDisableGecko(Boolean.valueOf(C1545520qJy.LIZ(str23)));
        }
        String str24 = (String) concurrentHashMap.get("disable_gecko_update");
        if (str24 != null) {
            sparkPopupSchemaParam.setDisableGeckoUpdate(Boolean.valueOf(C1545520qJy.LIZ(str24)));
        }
        String str25 = (String) concurrentHashMap.get("disable_hardware_accelerate");
        if (str25 != null) {
            sparkPopupSchemaParam.setDisableHardwareAccelerate(C1545520qJy.LIZ(str25));
        }
        String str26 = (String) concurrentHashMap.get("disable_offline");
        if (str26 != null) {
            sparkPopupSchemaParam.setDisableOffline(Boolean.valueOf(C1545520qJy.LIZ(str26)));
        }
        String str27 = (String) concurrentHashMap.get("disable_outside_click_close");
        if (str27 != null) {
            sparkPopupSchemaParam.setDisableOutsideClickClose(C1545520qJy.LIZ(str27));
        }
        String str28 = (String) concurrentHashMap.get("disable_safe_browsing");
        if (str28 != null) {
            sparkPopupSchemaParam.setDisableSafeBrowsing(C1545520qJy.LIZ(str28));
        }
        String str29 = (String) concurrentHashMap.get("disable_save_image");
        if (str29 != null) {
            sparkPopupSchemaParam.setDisableSaveImage(C1545520qJy.LIZ(str29));
        }
        String str30 = (String) concurrentHashMap.get("drag_back");
        if (str30 != null) {
            sparkPopupSchemaParam.setDragBack(C1545520qJy.LIZ(str30));
        }
        String str31 = (String) concurrentHashMap.get("drag_by_gesture");
        if (str31 != null) {
            sparkPopupSchemaParam.setDragByGesture(C1545520qJy.LIZ(str31));
        }
        String str32 = (String) concurrentHashMap.get("drag_down_close_threshold");
        if (str32 != null) {
            sparkPopupSchemaParam.setDragDownCloseThreshold(C1545520qJy.LIZIZ("drag_down_close_threshold", str32, map, true));
        }
        String str33 = (String) concurrentHashMap.get("drag_down_threshold");
        if (str33 != null) {
            sparkPopupSchemaParam.setDragDownThreshold(C1545520qJy.LIZIZ("drag_down_threshold", str33, map, true));
        }
        String str34 = (String) concurrentHashMap.get("drag_handle_force_flat");
        if (str34 != null) {
            sparkPopupSchemaParam.setDragHandleForceFlat(C1545520qJy.LIZ(str34));
        }
        String str35 = (String) concurrentHashMap.get("drag_handle_invisible");
        if (str35 != null) {
            sparkPopupSchemaParam.setDragHandleInvisible(C1545520qJy.LIZ(str35));
        }
        String str36 = (String) concurrentHashMap.get("drag_height");
        if (str36 != null) {
            sparkPopupSchemaParam.setDragHeight(C1545520qJy.LIZIZ("drag_height", str36, map, true));
        }
        String str37 = (String) concurrentHashMap.get("drag_min_margin_top");
        if (str37 != null) {
            sparkPopupSchemaParam.setDragMinMarginTop(C1545520qJy.LIZIZ("drag_min_margin_top", str37, map, true));
        }
        String str38 = (String) concurrentHashMap.get("drag_up_threshold");
        if (str38 != null) {
            sparkPopupSchemaParam.setDragUpThreshold(C1545520qJy.LIZIZ("drag_up_threshold", str38, map, true));
        }
        String str39 = (String) concurrentHashMap.get("dynamic");
        if (str39 != null) {
            sparkPopupSchemaParam.setDynamic(Integer.valueOf(C1545520qJy.LIZIZ("dynamic", str39, map, false)));
        }
        String str40 = (String) concurrentHashMap.get("air_strict_mode");
        if (str40 != null) {
            sparkPopupSchemaParam.setEnableAirStrictMode(C1545520qJy.LIZ(str40));
        }
        String str41 = (String) concurrentHashMap.get("enable_auto_adaptation");
        if (str41 != null) {
            sparkPopupSchemaParam.setEnableAutoAdaptation(C1545520qJy.LIZ(str41));
        }
        String str42 = (String) concurrentHashMap.get("enable_auto_concurrency");
        if (str42 != null) {
            sparkPopupSchemaParam.setEnableAutoConcurrency(C1545520qJy.LIZIZ("enable_auto_concurrency", str42, map, false));
        }
        String str43 = (String) concurrentHashMap.get("enable_canvas");
        if (str43 != null) {
            sparkPopupSchemaParam.setEnableCanvas(C1545520qJy.LIZ(str43));
        }
        String str44 = (String) concurrentHashMap.get("enable_canvas_optimize");
        if (str44 != null) {
            sparkPopupSchemaParam.setEnableCanvasOptimization(Boolean.valueOf(C1545520qJy.LIZ(str44)));
        }
        String str45 = (String) concurrentHashMap.get("enable_code_cache");
        if (str45 != null) {
            sparkPopupSchemaParam.setEnableCodeCache(C1545520qJy.LIZIZ("enable_code_cache", str45, map, false));
        }
        String str46 = (String) concurrentHashMap.get("enable_dynamic_v8");
        if (str46 != null) {
            sparkPopupSchemaParam.setEnableDynamicV8(C1545520qJy.LIZ(str46));
        }
        String str47 = (String) concurrentHashMap.get("enable_extra_info");
        if (str47 != null) {
            sparkPopupSchemaParam.setEnableExtraInfo(C1545520qJy.LIZIZ("enable_extra_info", str47, map, false));
        }
        String str48 = (String) concurrentHashMap.get("enable_forest_cdn_cache");
        if (str48 != null) {
            sparkPopupSchemaParam.setEnableForestCdnCache(C1545520qJy.LIZ(str48));
        }
        String str49 = (String) concurrentHashMap.get("enable_forest_pre_decode");
        if (str49 != null) {
            sparkPopupSchemaParam.setEnableForestPreDecode(C1545520qJy.LIZ(str49));
        }
        String str50 = (String) concurrentHashMap.get("enable_gecko_pre_decompress");
        if (str50 != null) {
            sparkPopupSchemaParam.setEnableGeckoPreDecompress(C1545520qJy.LIZIZ("enable_gecko_pre_decompress", str50, map, false));
        }
        String str51 = (String) concurrentHashMap.get("enable_global_props_optimization");
        if (str51 != null) {
            sparkPopupSchemaParam.setEnableGlobalPropsOptimization(C1545520qJy.LIZ(str51));
        }
        String str52 = (String) concurrentHashMap.get("enable_js_runtime");
        if (str52 != null) {
            sparkPopupSchemaParam.setEnableJSRuntime(C1545520qJy.LIZ(str52));
        }
        String str53 = (String) concurrentHashMap.get("enable_js_group_thread");
        if (str53 != null) {
            sparkPopupSchemaParam.setEnableJsGroupThread(C1545520qJy.LIZ(str53));
        }
        String str54 = (String) concurrentHashMap.get("enable_lite_mode");
        if (str54 != null) {
            sparkPopupSchemaParam.setEnableLiteMode(C1545520qJy.LIZ(str54));
        }
        String str55 = (String) concurrentHashMap.get("enable_lynx_prefetch");
        if (str55 != null) {
            sparkPopupSchemaParam.setEnableLynxPrefetch(C1545520qJy.LIZIZ("enable_lynx_prefetch", str55, map, false));
        }
        String str56 = (String) concurrentHashMap.get("enable_memory_cache");
        if (str56 != null) {
            sparkPopupSchemaParam.setEnableMemoryCache(Boolean.valueOf(C1545520qJy.LIZ(str56)));
        }
        String str57 = (String) concurrentHashMap.get("enable_multi_async_thread");
        if (str57 != null) {
            sparkPopupSchemaParam.setEnableMultiAsyncThread(C1545520qJy.LIZ(str57));
        }
        String str58 = (String) concurrentHashMap.get("enable_multi_tab");
        if (str58 != null) {
            sparkPopupSchemaParam.setEnableMultiTab(C1545520qJy.LIZ(str58));
        }
        String str59 = (String) concurrentHashMap.get("enable_pending_js_task");
        if (str59 != null) {
            sparkPopupSchemaParam.setEnablePendingJsTask(C1545520qJy.LIZ(str59));
        }
        String str60 = (String) concurrentHashMap.get("enable_pre_code_cache");
        if (str60 != null) {
            sparkPopupSchemaParam.setEnablePreCodeCache(C1545520qJy.LIZIZ("enable_pre_code_cache", str60, map, false));
        }
        String str61 = (String) concurrentHashMap.get("enable_pre_decode");
        if (str61 != null) {
            sparkPopupSchemaParam.setEnablePreDecode(C1545520qJy.LIZIZ("enable_pre_decode", str61, map, false));
        }
        String str62 = (String) concurrentHashMap.get("enable_pre_decode_template");
        if (str62 != null) {
            sparkPopupSchemaParam.setEnablePreDecodeTemplate(C1545520qJy.LIZIZ("enable_pre_decode_template", str62, map, false));
        }
        String str63 = (String) concurrentHashMap.get("enable_prefetch");
        if (str63 != null) {
            sparkPopupSchemaParam.setEnablePrefetch(C1545520qJy.LIZIZ("enable_prefetch", str63, map, false));
        }
        String str64 = (String) concurrentHashMap.get("enable_pull_down_close");
        if (str64 != null) {
            sparkPopupSchemaParam.setEnablePullDownClose(C1545520qJy.LIZ(str64));
        }
        String str65 = (String) concurrentHashMap.get("enable_relative_calculation");
        if (str65 != null) {
            sparkPopupSchemaParam.setEnableRelativeCalculation(C1545520qJy.LIZ(str65));
        }
        String str66 = (String) concurrentHashMap.get("enable_saf");
        if (str66 != null) {
            sparkPopupSchemaParam.setEnableSaf(C1545520qJy.LIZ(str66));
        }
        String str67 = (String) concurrentHashMap.get("enable_scroll_web_view");
        if (str67 != null) {
            sparkPopupSchemaParam.setEnableScrollWebView(C1545520qJy.LIZ(str67));
        }
        String str68 = (String) concurrentHashMap.get("enable_sheet_handle_opt");
        if (str68 != null) {
            sparkPopupSchemaParam.setEnableSparkPopupSheetHandleOpt(C1545520qJy.LIZ(str68));
        }
        String str69 = (String) concurrentHashMap.get("enable_storage_group");
        if (str69 != null) {
            sparkPopupSchemaParam.setEnableStorageGroup(C1545520qJy.LIZ(str69));
        }
        String str70 = (String) concurrentHashMap.get("enable_sync_flush");
        if (str70 != null) {
            sparkPopupSchemaParam.setEnableSyncFlush(C1545520qJy.LIZ(str70));
        }
        String str71 = (String) concurrentHashMap.get("enable_template_bundle_cache");
        if (str71 != null) {
            sparkPopupSchemaParam.setEnableTemplateBundleCache(C1545520qJy.LIZ(str71));
        }
        String str72 = (String) concurrentHashMap.get("enable_update_screen_metrics");
        if (str72 != null) {
            sparkPopupSchemaParam.setEnableUpdateScreenMetrics(C1545520qJy.LIZ(str72));
        }
        String str73 = (String) concurrentHashMap.get("enable_vsync_aligned_message_loop");
        if (str73 != null) {
            sparkPopupSchemaParam.setEnableVsyncAlignedMessageLoop(C1545520qJy.LIZ(str73));
        }
        String str74 = (String) concurrentHashMap.get("fallback_url");
        if (str74 != null) {
            sparkPopupSchemaParam.setFallbackUrl(str74);
        }
        String str75 = (String) concurrentHashMap.get("fix_top_view_height_issue");
        if (str75 != null) {
            sparkPopupSchemaParam.setFixTopViewHeightIssue(C1545520qJy.LIZ(str75));
        }
        String str76 = (String) concurrentHashMap.get("forbidden_anim");
        if (str76 != null) {
            sparkPopupSchemaParam.setForbiddenAnim(C1545520qJy.LIZ(str76));
        }
        String str77 = (String) concurrentHashMap.get("force_disable_back_press");
        if (str77 != null) {
            sparkPopupSchemaParam.setForceBlockBackPress(C1545520qJy.LIZ(str77));
        }
        String str78 = (String) concurrentHashMap.get("force_dialog_non_cancelable");
        if (str78 != null) {
            sparkPopupSchemaParam.setForceDialogNonCancelable(C1545520qJy.LIZ(str78));
        }
        String str79 = (String) concurrentHashMap.get("force_lynx_generic_fetcher");
        if (str79 != null) {
            sparkPopupSchemaParam.setForceGenericFetcher(Boolean.valueOf(C1545520qJy.LIZ(str79)));
        }
        String str80 = (String) concurrentHashMap.get("force_h5");
        if (str80 != null) {
            sparkPopupSchemaParam.setForceH5(C1545520qJy.LIZ(str80));
        }
        String str81 = (String) concurrentHashMap.get("force_release_context_when_destroyed_for_sparkFragment");
        if (str81 != null) {
            sparkPopupSchemaParam.setForceReleaseContextWhenDestroyedForSparkFragment(C1545520qJy.LIZ(str81));
        }
        String str82 = (String) concurrentHashMap.get("force_single_group");
        if (str82 != null) {
            sparkPopupSchemaParam.setForceSingleGroup(C1545520qJy.LIZ(str82));
        }
        String str83 = (String) concurrentHashMap.get("force_theme_style");
        if (str83 != null) {
            sparkPopupSchemaParam.setForceThemeStyle(str83);
        }
        String str84 = (String) concurrentHashMap.get("gecko_url_redirection");
        if (str84 != null) {
            sparkPopupSchemaParam.setGeckoUrlRedirection(C1545520qJy.LIZ(str84));
        }
        String str85 = (String) concurrentHashMap.get("global_props_allow_list");
        if (str85 != null) {
            sparkPopupSchemaParam.setGlobalPropsAllowList(str85);
        }
        String str86 = (String) concurrentHashMap.get("gravity");
        if (str86 != null) {
            sparkPopupSchemaParam.setGravity(str86);
        }
        String str87 = (String) concurrentHashMap.get("gravity");
        if (str87 != null) {
            sparkPopupSchemaParam.setGravityWithoutDefault(str87);
        }
        String str88 = (String) concurrentHashMap.get("group");
        if (str88 != null) {
            sparkPopupSchemaParam.setGroup(str88);
        }
        String str89 = (String) concurrentHashMap.get("height");
        if (str89 != null) {
            sparkPopupSchemaParam.setHeight(C1545520qJy.LIZIZ("height", str89, map, true));
        }
        String str90 = (String) concurrentHashMap.get("hide_debug_label");
        if (str90 != null) {
            sparkPopupSchemaParam.setHideDebugLabel(C1545520qJy.LIZ(str90));
        }
        String str91 = (String) concurrentHashMap.get("hide_error");
        if (str91 != null) {
            sparkPopupSchemaParam.setHideError(C1545520qJy.LIZ(str91));
        }
        String str92 = (String) concurrentHashMap.get("hide_loading");
        if (str92 != null) {
            sparkPopupSchemaParam.setHideLoading(C1545520qJy.LIZ(str92));
        }
        String str93 = (String) concurrentHashMap.get("hide_system_video_poster");
        if (str93 != null) {
            sparkPopupSchemaParam.setHideSystemVideoPoster(C1545520qJy.LIZ(str93));
        }
        String str94 = (String) concurrentHashMap.get("ignore_all_query_params");
        if (str94 != null) {
            sparkPopupSchemaParam.setIgnoreAllQueryParams(C1545520qJy.LIZ(str94));
        }
        String str95 = (String) concurrentHashMap.get("ignore_cache_policy");
        if (str95 != null) {
            sparkPopupSchemaParam.setIgnoreCachePolicy(C1545520qJy.LIZIZ("ignore_cache_policy", str95, map, false));
        }
        String str96 = (String) concurrentHashMap.get("ignore_cached_theme");
        if (str96 != null) {
            sparkPopupSchemaParam.setIgnoreCachedTheme(C1545520qJy.LIZ(str96));
        }
        String str97 = (String) concurrentHashMap.get("ignore_keyboard_status_change");
        if (str97 != null) {
            sparkPopupSchemaParam.setIgnoreKeyboardStatusChange(C1545520qJy.LIZ(str97));
        }
        String str98 = (String) concurrentHashMap.get("ignore_restore_main");
        if (str98 != null) {
            sparkPopupSchemaParam.setIgnoreRestoreMain(C1545520qJy.LIZ(str98));
        }
        String str99 = (String) concurrentHashMap.get("ignore_web_http_or_ssl_error");
        if (str99 != null) {
            sparkPopupSchemaParam.setIgnoreWebHttpOrSslError(C1545520qJy.LIZ(str99));
        }
        String str100 = (String) concurrentHashMap.get("ignored_query_params");
        if (str100 != null) {
            sparkPopupSchemaParam.setIgnoredQueryParams(str100);
        }
        String str101 = (String) concurrentHashMap.get("init_data_url");
        if (str101 != null) {
            sparkPopupSchemaParam.setInitDataUrl(str101);
        }
        String str102 = (String) concurrentHashMap.get("initial_data");
        if (str102 != null) {
            sparkPopupSchemaParam.setInitialData(str102);
        }
        String str103 = (String) concurrentHashMap.get("keyboard_adjust");
        if (str103 != null) {
            sparkPopupSchemaParam.setKeyboardAdjust(C1545520qJy.LIZIZ("keyboard_adjust", str103, map, false));
        }
        String str104 = (String) concurrentHashMap.get("keyboard_compat");
        if (str104 != null) {
            sparkPopupSchemaParam.setKeyboardCompat(C1545520qJy.LIZ(str104));
        }
        String str105 = (String) concurrentHashMap.get("landscape_gravity");
        if (str105 != null) {
            sparkPopupSchemaParam.setLandscapeGravity(str105);
        }
        String str106 = (String) concurrentHashMap.get("landscape_height");
        if (str106 != null) {
            sparkPopupSchemaParam.setLandscapeHeight(C1545520qJy.LIZIZ("landscape_height", str106, map, true));
        }
        String str107 = (String) concurrentHashMap.get("landscape_screen_size_as_portrait");
        if (str107 != null) {
            sparkPopupSchemaParam.setLandscapeScreenSizeAsPortrait(C1545520qJy.LIZ(str107));
        }
        String str108 = (String) concurrentHashMap.get("landscape_transition_animation");
        if (str108 != null) {
            sparkPopupSchemaParam.setLandscapeTransitionAnimation(str108);
        }
        String str109 = (String) concurrentHashMap.get("landscape_width");
        if (str109 != null) {
            sparkPopupSchemaParam.setLandscapeWidth(C1545520qJy.LIZIZ("landscape_width", str109, map, true));
        }
        String str110 = (String) concurrentHashMap.get("loading_bg_color");
        Object obj3 = concurrentHashMap.get("loading_bg_color_dark");
        Object obj4 = concurrentHashMap.get("loading_bg_color_light");
        if (str110 != null || obj3 != null || obj4 != null) {
            sparkPopupSchemaParam.setLoadingBgColor(C1545520qJy.LIZJ("loading_bg_color", str110, map));
        }
        String str111 = (String) concurrentHashMap.get("loading_height_in_adaptive_mode");
        if (str111 != null) {
            sparkPopupSchemaParam.setLoadingHeightInAdaptiveMode(C1545520qJy.LIZIZ("loading_height_in_adaptive_mode", str111, map, true));
        }
        String str112 = (String) concurrentHashMap.get("lock_resource");
        if (str112 != null) {
            sparkPopupSchemaParam.setLockResource(C1545520qJy.LIZ(str112));
        }
        String str113 = (String) concurrentHashMap.get("lock_variable_height_expanded");
        if (str113 != null) {
            sparkPopupSchemaParam.setLockVariableHeightExpanded(C1545520qJy.LIZ(str113));
        }
        String str114 = (String) concurrentHashMap.get("lynx_prefetch_bid");
        if (str114 != null) {
            sparkPopupSchemaParam.setLynxPrefetchBid(str114);
        }
        String str115 = (String) concurrentHashMap.get("lynxview_height");
        if (str115 != null) {
            sparkPopupSchemaParam.setLynxviewHeight(Integer.valueOf(C1545520qJy.LIZIZ("lynxview_height", str115, map, true)));
        }
        String str116 = (String) concurrentHashMap.get("lynxview_width");
        if (str116 != null) {
            sparkPopupSchemaParam.setLynxviewWidth(Integer.valueOf(C1545520qJy.LIZIZ("lynxview_width", str116, map, true)));
        }
        String str117 = (String) concurrentHashMap.get("margin_bottom");
        if (str117 != null) {
            sparkPopupSchemaParam.setMarginBottom(C1545520qJy.LIZIZ("margin_bottom", str117, map, true));
        }
        String str118 = (String) concurrentHashMap.get("margin_end");
        if (str118 != null) {
            sparkPopupSchemaParam.setMarginEnd(C1545520qJy.LIZIZ("margin_end", str118, map, true));
        }
        String str119 = (String) concurrentHashMap.get("margin_left");
        if (str119 != null) {
            sparkPopupSchemaParam.setMarginLeft(C1545520qJy.LIZIZ("margin_left", str119, map, true));
        }
        String str120 = (String) concurrentHashMap.get("margin_right");
        if (str120 != null) {
            sparkPopupSchemaParam.setMarginRight(C1545520qJy.LIZIZ("margin_right", str120, map, true));
        }
        String str121 = (String) concurrentHashMap.get("margin_start");
        if (str121 != null) {
            sparkPopupSchemaParam.setMarginStart(C1545520qJy.LIZIZ("margin_start", str121, map, true));
        }
        String str122 = (String) concurrentHashMap.get("margin_top");
        if (str122 != null) {
            sparkPopupSchemaParam.setMarginTop(C1545520qJy.LIZIZ("margin_top", str122, map, true));
        }
        String str123 = (String) concurrentHashMap.get("mask_bg_color");
        Object obj5 = concurrentHashMap.get("mask_bg_color_dark");
        Object obj6 = concurrentHashMap.get("mask_bg_color_light");
        if (str123 != null || obj5 != null || obj6 != null) {
            sparkPopupSchemaParam.setMaskBgColor(C1545520qJy.LIZJ("mask_bg_color", str123, map));
        }
        String str124 = (String) concurrentHashMap.get("mask_close_until_loaded");
        if (str124 != null) {
            sparkPopupSchemaParam.setMaskCloseUntilLoaded(C1545520qJy.LIZ(str124));
        }
        String str125 = (String) concurrentHashMap.get("min_margin_top");
        if (str125 != null) {
            sparkPopupSchemaParam.setMinMarginTop(C1545520qJy.LIZIZ("min_margin_top", str125, map, true));
        }
        String str126 = (String) concurrentHashMap.get("navigation_bar_bg_color");
        Object obj7 = concurrentHashMap.get("navigation_bar_bg_color_dark");
        Object obj8 = concurrentHashMap.get("navigation_bar_bg_color_light");
        if (str126 != null || obj7 != null || obj8 != null) {
            sparkPopupSchemaParam.setNavigationBarBgColor(C1545520qJy.LIZJ("navigation_bar_bg_color", str126, map));
        }
        String str127 = (String) concurrentHashMap.get("navigation_font_mode");
        if (str127 != null) {
            sparkPopupSchemaParam.setNavigationFontMode(str127);
        }
        String str128 = (String) concurrentHashMap.get("need_bottom_out");
        if (str128 != null) {
            sparkPopupSchemaParam.setNeedBottomOut(C1545520qJy.LIZ(str128));
        }
        String str129 = (String) concurrentHashMap.get("need_sec_link");
        if (str129 != null) {
            sparkPopupSchemaParam.setNeedSecLink(C1545520qJy.LIZ(str129));
        }
        String str130 = (String) concurrentHashMap.get("need_set_screen_size");
        if (str130 != null) {
            sparkPopupSchemaParam.setNeedSetScreenSize(C1545520qJy.LIZ(str130));
        }
        String str131 = (String) concurrentHashMap.get("need_wrapper_view");
        if (str131 != null) {
            sparkPopupSchemaParam.setNeedWrapperView(C1545520qJy.LIZ(str131));
        }
        String str132 = (String) concurrentHashMap.get("net_worker");
        if (str132 != null) {
            sparkPopupSchemaParam.setNetWorker(Integer.valueOf(C1545520qJy.LIZIZ("net_worker", str132, map, false)));
        }
        String str133 = (String) concurrentHashMap.get("only_local");
        if (str133 != null) {
            sparkPopupSchemaParam.setOnlyLocal(Boolean.valueOf(C1545520qJy.LIZ(str133)));
        }
        String str134 = (String) concurrentHashMap.get("spark_page");
        if (str134 != null) {
            sparkPopupSchemaParam.setPageName(str134);
        }
        String str135 = (String) concurrentHashMap.get("parallel_fetch_resource");
        if (str135 != null) {
            sparkPopupSchemaParam.setParallelFetchResource(C1545520qJy.LIZIZ("parallel_fetch_resource", str135, map, false));
        }
        String str136 = (String) concurrentHashMap.get("peek_down_close_threshold");
        if (str136 != null) {
            sparkPopupSchemaParam.setPeekDownCloseThreshold(C1545520qJy.LIZIZ("peek_down_close_threshold", str136, map, true));
        }
        String str137 = (String) concurrentHashMap.get("popup_compat_show_event");
        if (str137 != null) {
            sparkPopupSchemaParam.setPopupCompatShowEvent(C1545520qJy.LIZ(str137));
        }
        String str138 = (String) concurrentHashMap.get("popup_follow_activity_ui");
        if (str138 != null) {
            sparkPopupSchemaParam.setPopupFollowActivityUi(C1545520qJy.LIZ(str138));
        }
        String str139 = (String) concurrentHashMap.get("preloadFonts");
        if (str139 != null) {
            sparkPopupSchemaParam.setPreloadFonts(str139);
        }
        String str140 = (String) concurrentHashMap.get("preload_setting_keys");
        if (str140 != null) {
            sparkPopupSchemaParam.setPreloadSettingsKeys(str140);
        }
        String str141 = (String) concurrentHashMap.get("preload_storage_keys");
        if (str141 != null) {
            sparkPopupSchemaParam.setPreloadStorageKeys(str141);
        }
        String str142 = (String) concurrentHashMap.get("preset_height");
        if (str142 != null) {
            sparkPopupSchemaParam.setPresetHeight(C1545520qJy.LIZIZ("preset_height", str142, map, true));
        }
        String str143 = (String) concurrentHashMap.get("preset_safe_point");
        if (str143 != null) {
            sparkPopupSchemaParam.setPresetSafePoint(C1545520qJy.LIZ(str143));
        }
        String str144 = (String) concurrentHashMap.get("preset_width");
        if (str144 != null) {
            sparkPopupSchemaParam.setPresetWidth(C1545520qJy.LIZIZ("preset_width", str144, map, true));
        }
        String str145 = (String) concurrentHashMap.get("proxy_enabled_runtime_type");
        if (str145 != null) {
            sparkPopupSchemaParam.setProxyEnabledRuntimeType(C1545520qJy.LIZ(str145));
        }
        String str146 = (String) concurrentHashMap.get("radius");
        if (str146 != null) {
            sparkPopupSchemaParam.setRadius(C1545520qJy.LIZIZ("radius", str146, map, true));
        }
        String str147 = (String) concurrentHashMap.get("redirect_regions");
        if (str147 != null) {
            sparkPopupSchemaParam.setRedirectRegions(str147);
        }
        String str148 = (String) concurrentHashMap.get("remove_wv_in_ua");
        if (str148 != null) {
            sparkPopupSchemaParam.setRemoveWvInUa(C1545520qJy.LIZ(str148));
        }
        String str149 = (String) concurrentHashMap.get("resize_duration");
        if (str149 != null) {
            sparkPopupSchemaParam.setResizeDuration(str149);
        }
        String str150 = (String) concurrentHashMap.get("resource_dynamic");
        if (str150 != null) {
            sparkPopupSchemaParam.setResourceDynamic(Boolean.valueOf(C1545520qJy.LIZ(str150)));
        }
        String str151 = (String) concurrentHashMap.get("spark_page_session");
        if (str151 != null) {
            sparkPopupSchemaParam.setRomaSession(str151);
        }
        String str152 = (String) concurrentHashMap.get("script_url");
        if (str152 != null) {
            sparkPopupSchemaParam.setScriptUrl(str152);
        }
        String str153 = (String) concurrentHashMap.get("sec_link_scene");
        if (str153 != null) {
            sparkPopupSchemaParam.setSecLinkScene(str153);
        }
        String str154 = (String) concurrentHashMap.get("self_adaptive_height");
        if (str154 != null) {
            sparkPopupSchemaParam.setSelfAdaptiveHeight(C1545520qJy.LIZ(str154));
        }
        String str155 = (String) concurrentHashMap.get("session_id");
        if (str155 != null) {
            sparkPopupSchemaParam.setSessionId(str155);
        }
        String str156 = (String) concurrentHashMap.get("share_group");
        if (str156 != null) {
            sparkPopupSchemaParam.setShareGroup(C1545520qJy.LIZ(str156));
        }
        String str157 = (String) concurrentHashMap.get("show_mask");
        if (str157 != null) {
            sparkPopupSchemaParam.setShowMask(C1545520qJy.LIZ(str157));
        }
        String str158 = (String) concurrentHashMap.get("show_progress_bar_in_all_page");
        if (str158 != null) {
            sparkPopupSchemaParam.setShowProgressBarInAllPage(C1545520qJy.LIZ(str158));
        }
        String str159 = (String) concurrentHashMap.get("silent_load_type");
        if (str159 != null) {
            sparkPopupSchemaParam.setSilentLoadType(C1545520qJy.LIZIZ("silent_load_type", str159, map, false));
        }
        String str160 = (String) concurrentHashMap.get("skeleton_duration");
        if (str160 != null) {
            sparkPopupSchemaParam.setSkeletonDuration(Integer.valueOf(C1545520qJy.LIZIZ("skeleton_duration", str160, map, true)));
        }
        String str161 = (String) concurrentHashMap.get("skeleton_from_alpha");
        if (str161 != null) {
            sparkPopupSchemaParam.setSkeletonFromAlpha(str161);
        }
        String str162 = (String) concurrentHashMap.get("skeleton_path");
        if (str162 != null) {
            sparkPopupSchemaParam.setSkeletonPath(str162);
        }
        String str163 = (String) concurrentHashMap.get("skeleton_to_alpha");
        if (str163 != null) {
            sparkPopupSchemaParam.setSkeletonToAlpha(str163);
        }
        String str164 = (String) concurrentHashMap.get("skeleton_with_animation");
        if (str164 != null) {
            sparkPopupSchemaParam.setSkeletonWithAnimation(C1545520qJy.LIZ(str164));
        }
        String str165 = (String) concurrentHashMap.get("spark_perf_bid");
        if (str165 != null) {
            sparkPopupSchemaParam.setSparkPerfBid(str165);
        }
        String str166 = (String) concurrentHashMap.get("spark_perf_bid_strict_mode");
        if (str166 != null) {
            sparkPopupSchemaParam.setSparkPerfBidStrictMode(C1545520qJy.LIZ(str166));
        }
        String str167 = (String) concurrentHashMap.get("spark_perf_biz");
        if (str167 != null) {
            sparkPopupSchemaParam.setSparkPerfBiz(str167);
        }
        String str168 = (String) concurrentHashMap.get("ssp_config");
        if (str168 != null) {
            sparkPopupSchemaParam.setSspConfig(C1545520qJy.LIZIZ("ssp_config", str168, map, false));
        }
        String str169 = (String) concurrentHashMap.get("ssr_cache_key");
        if (str169 != null) {
            sparkPopupSchemaParam.setSsrCacheKey(str169);
        }
        String str170 = (String) concurrentHashMap.get("ssr_init_data");
        if (str170 != null) {
            sparkPopupSchemaParam.setSsrInitData(str170);
        }
        String str171 = (String) concurrentHashMap.get("ssr_mode");
        if (str171 != null) {
            sparkPopupSchemaParam.setSsrMode(Integer.valueOf(C1545520qJy.LIZIZ("ssr_mode", str171, map, false)));
        }
        String str172 = (String) concurrentHashMap.get("ssr_url");
        if (str172 != null) {
            sparkPopupSchemaParam.setSsrUrl(str172);
        }
        String str173 = (String) concurrentHashMap.get("starling_channel");
        if (str173 != null) {
            sparkPopupSchemaParam.setStarlingChannel(str173);
        }
        String str174 = (String) concurrentHashMap.get("starling_fallback");
        if (str174 != null) {
            sparkPopupSchemaParam.setStarlingFallback(C1545520qJy.LIZ(str174));
        }
        String str175 = (String) concurrentHashMap.get("status_bar_bg_color");
        Object obj9 = concurrentHashMap.get("status_bar_bg_color_dark");
        Object obj10 = concurrentHashMap.get("status_bar_bg_color_light");
        if (str175 != null || obj9 != null || obj10 != null) {
            sparkPopupSchemaParam.setStatusBarBgColor(C1545520qJy.LIZJ("status_bar_bg_color", str175, map));
        }
        String str176 = (String) concurrentHashMap.get("status_font_mode");
        if (str176 != null) {
            sparkPopupSchemaParam.setStatusFontMode(str176);
        }
        String str177 = (String) concurrentHashMap.get("strict_url");
        if (str177 != null) {
            sparkPopupSchemaParam.setStrictUrl(str177);
        }
        String str178 = (String) concurrentHashMap.get("subscribe_network_level");
        if (str178 != null) {
            sparkPopupSchemaParam.setSubscribeNetworkLevel(C1545520qJy.LIZ(str178));
        }
        String str179 = (String) concurrentHashMap.get("surl");
        if (str179 != null) {
            sparkPopupSchemaParam.setSurl(str179);
        }
        String str180 = (String) concurrentHashMap.get("thread_strategy");
        if (str180 != null) {
            sparkPopupSchemaParam.setThreadStrategy(C1545520qJy.LIZIZ("thread_strategy", str180, map, false));
        }
        String str181 = (String) concurrentHashMap.get("tracing_uuid");
        if (str181 != null) {
            sparkPopupSchemaParam.setTracingUUID(str181);
        }
        String str182 = (String) concurrentHashMap.get("trans_navigation_bar");
        if (str182 != null) {
            sparkPopupSchemaParam.setTransNavigationBar(C1545520qJy.LIZ(str182));
        }
        String str183 = (String) concurrentHashMap.get("trans_status_bar");
        if (str183 != null) {
            sparkPopupSchemaParam.setTransStatusBar(C1545520qJy.LIZ(str183));
        }
        String str184 = (String) concurrentHashMap.get("transition_animation");
        if (str184 != null) {
            sparkPopupSchemaParam.setTransitionAnimation(str184);
        }
        String str185 = (String) concurrentHashMap.get("ui_running_mode");
        if (str185 != null) {
            sparkPopupSchemaParam.setUiRunningMode(C1545520qJy.LIZ(str185));
        }
        String str186 = (String) concurrentHashMap.get("url");
        if (str186 != null) {
            sparkPopupSchemaParam.setUrl(str186);
        }
        String str187 = (String) concurrentHashMap.get("use_forest");
        if (str187 != null) {
            sparkPopupSchemaParam.setUseForest(C1545520qJy.LIZ(str187));
        }
        String str188 = (String) concurrentHashMap.get("use_motion");
        if (str188 != null) {
            sparkPopupSchemaParam.setUseMotion(C1545520qJy.LIZ(str188));
        }
        String str189 = (String) concurrentHashMap.get("use_mutable_context");
        if (str189 != null) {
            sparkPopupSchemaParam.setUseMutableContext(C1545520qJy.LIZ(str189));
        }
        String str190 = (String) concurrentHashMap.get("use_preload");
        if (str190 != null) {
            sparkPopupSchemaParam.setUsePreload(C1545520qJy.LIZ(str190));
        }
        String str191 = (String) concurrentHashMap.get("use_preload_resource_h5");
        if (str191 != null) {
            sparkPopupSchemaParam.setUsePreloadResourceH5(C1545520qJy.LIZ(str191));
        }
        String str192 = (String) concurrentHashMap.get("use_system_browser_ua");
        if (str192 != null) {
            sparkPopupSchemaParam.setUseSystemBrowserUa(C1545520qJy.LIZ(str192));
        }
        String str193 = (String) concurrentHashMap.get("variable_height");
        if (str193 != null) {
            sparkPopupSchemaParam.setVariableHeight(C1545520qJy.LIZIZ("variable_height", str193, map, true));
        }
        String str194 = (String) concurrentHashMap.get("wait_gecko_update");
        if (str194 != null) {
            sparkPopupSchemaParam.setWaitGeckoUpdate(Boolean.valueOf(C1545520qJy.LIZ(str194)));
        }
        String str195 = (String) concurrentHashMap.get("wait_low_storage_update");
        if (str195 != null) {
            sparkPopupSchemaParam.setWaitLowStorageUpdate(C1545520qJy.LIZ(str195));
        }
        String str196 = (String) concurrentHashMap.get("webview_scroll_first_when_expanded");
        if (str196 != null) {
            sparkPopupSchemaParam.setWebViewScrollFirstWhenExpanded(C1545520qJy.LIZ(str196));
        }
        String str197 = (String) concurrentHashMap.get("webview_progress_bar");
        if (str197 != null) {
            sparkPopupSchemaParam.setWebviewProgressBar(C1545520qJy.LIZ(str197));
        }
        String str198 = (String) concurrentHashMap.get("width");
        if (str198 != null) {
            sparkPopupSchemaParam.setWidth(C1545520qJy.LIZIZ("width", str198, map, true));
        }
    }
}
