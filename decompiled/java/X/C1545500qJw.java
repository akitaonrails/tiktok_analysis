package X;

import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0qJw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1545500qJw {
    public static final void LIZ(Map map, SparkPageSchemaParam sparkPageSchemaParam) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map;
        String str = (String) concurrentHashMap.get("__use_ttnet");
        if (str != null) {
            sparkPageSchemaParam.set_useTtnet(C1545520qJy.LIZIZ("__use_ttnet", str, map, false));
        }
        String str2 = (String) concurrentHashMap.get("accessKey");
        if (str2 != null) {
            sparkPageSchemaParam.setAccessKey(str2);
        }
        String str3 = (String) concurrentHashMap.get("access_key");
        if (str3 != null) {
            sparkPageSchemaParam.setAccessKeyBp(str3);
        }
        String str4 = (String) concurrentHashMap.get("air_strict_mode_use_piperdata");
        if (str4 != null) {
            sparkPageSchemaParam.setAirStrictModeUsePiperdata(C1545520qJy.LIZ(str4));
        }
        String str5 = (String) concurrentHashMap.get("append_common_params");
        if (str5 != null) {
            sparkPageSchemaParam.setAppendCommonParams(C1545520qJy.LIZ(str5));
        }
        String str6 = (String) concurrentHashMap.get("auto_adaptation_scroll_view_id");
        if (str6 != null) {
            sparkPageSchemaParam.setAutoAdaptationScrollViewId(str6);
        }
        String str7 = (String) concurrentHashMap.get("auto_continue_load");
        if (str7 != null) {
            sparkPageSchemaParam.setAutoContinueLoad(C1545520qJy.LIZ(str7));
        }
        String str8 = (String) concurrentHashMap.get("auto_play_bgm");
        if (str8 != null) {
            sparkPageSchemaParam.setAutoPlayBgm(C1545520qJy.LIZIZ("auto_play_bgm", str8, map, false));
        }
        String str9 = (String) concurrentHashMap.get("bid");
        if (str9 != null) {
            sparkPageSchemaParam.setBid(str9);
        }
        String str10 = (String) concurrentHashMap.get("block_back_press");
        if (str10 != null) {
            sparkPageSchemaParam.setBlockBackPress(C1545520qJy.LIZ(str10));
        }
        String str11 = (String) concurrentHashMap.get("bundle");
        if (str11 != null) {
            sparkPageSchemaParam.setBundle(str11);
        }
        String str12 = (String) concurrentHashMap.get("redirect_cdn_by_region");
        if (str12 != null) {
            sparkPageSchemaParam.setCdnRegionRedirect(C1545520qJy.LIZ(str12));
        }
        String str13 = (String) concurrentHashMap.get("channel");
        if (str13 != null) {
            sparkPageSchemaParam.setChannel(str13);
        }
        String str14 = (String) concurrentHashMap.get("clean_cookie_when_account_change");
        if (str14 != null) {
            sparkPageSchemaParam.setCleanCookieWhenAccountChange(C1545520qJy.LIZ(str14));
        }
        String str15 = (String) concurrentHashMap.get("click_time");
        if (str15 != null) {
            sparkPageSchemaParam.setClickTime(str15);
        }
        String str16 = (String) concurrentHashMap.get("container_bg_color");
        Object obj = concurrentHashMap.get("container_bg_color_dark");
        Object obj2 = concurrentHashMap.get("container_bg_color_light");
        if (str16 != null || obj != null || obj2 != null) {
            sparkPageSchemaParam.setContainerBgColor(C1545520qJy.LIZJ("container_bg_color", str16, map));
        }
        String str17 = (String) concurrentHashMap.get("__debug_global_props");
        if (str17 != null) {
            sparkPageSchemaParam.setDebugGlobalProps(str17);
        }
        String str18 = (String) concurrentHashMap.get("disable_auto_remove_loading");
        if (str18 != null) {
            sparkPageSchemaParam.setDisableAutoRemoveLoading(C1545520qJy.LIZ(str18));
        }
        String str19 = (String) concurrentHashMap.get("disable_back_press");
        if (str19 != null) {
            sparkPageSchemaParam.setDisableBackPress(C1545520qJy.LIZ(str19));
        }
        String str20 = (String) concurrentHashMap.get("disable_builtin");
        if (str20 != null) {
            sparkPageSchemaParam.setDisableBuiltin(Boolean.valueOf(C1545520qJy.LIZ(str20)));
        }
        String str21 = (String) concurrentHashMap.get("disable_cdn");
        if (str21 != null) {
            sparkPageSchemaParam.setDisableCDN(Boolean.valueOf(C1545520qJy.LIZ(str21)));
        }
        String str22 = (String) concurrentHashMap.get("disable_event_cache");
        if (str22 != null) {
            sparkPageSchemaParam.setDisableEventCache(C1545520qJy.LIZ(str22));
        }
        String str23 = (String) concurrentHashMap.get("disable_gecko");
        if (str23 != null) {
            sparkPageSchemaParam.setDisableGecko(Boolean.valueOf(C1545520qJy.LIZ(str23)));
        }
        String str24 = (String) concurrentHashMap.get("disable_gecko_update");
        if (str24 != null) {
            sparkPageSchemaParam.setDisableGeckoUpdate(Boolean.valueOf(C1545520qJy.LIZ(str24)));
        }
        String str25 = (String) concurrentHashMap.get("disable_get_resources_callback");
        if (str25 != null) {
            sparkPageSchemaParam.setDisableGetResourcesCallback(C1545520qJy.LIZ(str25));
        }
        String str26 = (String) concurrentHashMap.get("disable_hardware_accelerate");
        if (str26 != null) {
            sparkPageSchemaParam.setDisableHardwareAccelerate(C1545520qJy.LIZ(str26));
        }
        String str27 = (String) concurrentHashMap.get("disable_offline");
        if (str27 != null) {
            sparkPageSchemaParam.setDisableOffline(Boolean.valueOf(C1545520qJy.LIZ(str27)));
        }
        String str28 = (String) concurrentHashMap.get("disable_safe_browsing");
        if (str28 != null) {
            sparkPageSchemaParam.setDisableSafeBrowsing(C1545520qJy.LIZ(str28));
        }
        String str29 = (String) concurrentHashMap.get("disable_save_image");
        if (str29 != null) {
            sparkPageSchemaParam.setDisableSaveImage(C1545520qJy.LIZ(str29));
        }
        String str30 = (String) concurrentHashMap.get("dynamic");
        if (str30 != null) {
            sparkPageSchemaParam.setDynamic(Integer.valueOf(C1545520qJy.LIZIZ("dynamic", str30, map, false)));
        }
        String str31 = (String) concurrentHashMap.get("air_strict_mode");
        if (str31 != null) {
            sparkPageSchemaParam.setEnableAirStrictMode(C1545520qJy.LIZ(str31));
        }
        String str32 = (String) concurrentHashMap.get("enable_auto_adaptation");
        if (str32 != null) {
            sparkPageSchemaParam.setEnableAutoAdaptation(C1545520qJy.LIZ(str32));
        }
        String str33 = (String) concurrentHashMap.get("enable_auto_concurrency");
        if (str33 != null) {
            sparkPageSchemaParam.setEnableAutoConcurrency(C1545520qJy.LIZIZ("enable_auto_concurrency", str33, map, false));
        }
        String str34 = (String) concurrentHashMap.get("enable_canvas");
        if (str34 != null) {
            sparkPageSchemaParam.setEnableCanvas(C1545520qJy.LIZ(str34));
        }
        String str35 = (String) concurrentHashMap.get("enable_canvas_optimize");
        if (str35 != null) {
            sparkPageSchemaParam.setEnableCanvasOptimization(Boolean.valueOf(C1545520qJy.LIZ(str35)));
        }
        String str36 = (String) concurrentHashMap.get("enable_code_cache");
        if (str36 != null) {
            sparkPageSchemaParam.setEnableCodeCache(C1545520qJy.LIZIZ("enable_code_cache", str36, map, false));
        }
        String str37 = (String) concurrentHashMap.get("enable_dynamic_v8");
        if (str37 != null) {
            sparkPageSchemaParam.setEnableDynamicV8(C1545520qJy.LIZ(str37));
        }
        String str38 = (String) concurrentHashMap.get("enable_extra_info");
        if (str38 != null) {
            sparkPageSchemaParam.setEnableExtraInfo(C1545520qJy.LIZIZ("enable_extra_info", str38, map, false));
        }
        String str39 = (String) concurrentHashMap.get("enable_forest_cdn_cache");
        if (str39 != null) {
            sparkPageSchemaParam.setEnableForestCdnCache(C1545520qJy.LIZ(str39));
        }
        String str40 = (String) concurrentHashMap.get("enable_forest_pre_decode");
        if (str40 != null) {
            sparkPageSchemaParam.setEnableForestPreDecode(C1545520qJy.LIZ(str40));
        }
        String str41 = (String) concurrentHashMap.get("enable_gecko_pre_decompress");
        if (str41 != null) {
            sparkPageSchemaParam.setEnableGeckoPreDecompress(C1545520qJy.LIZIZ("enable_gecko_pre_decompress", str41, map, false));
        }
        String str42 = (String) concurrentHashMap.get("enable_global_props_optimization");
        if (str42 != null) {
            sparkPageSchemaParam.setEnableGlobalPropsOptimization(C1545520qJy.LIZ(str42));
        }
        String str43 = (String) concurrentHashMap.get("enable_js_runtime");
        if (str43 != null) {
            sparkPageSchemaParam.setEnableJSRuntime(C1545520qJy.LIZ(str43));
        }
        String str44 = (String) concurrentHashMap.get("enable_js_group_thread");
        if (str44 != null) {
            sparkPageSchemaParam.setEnableJsGroupThread(C1545520qJy.LIZ(str44));
        }
        String str45 = (String) concurrentHashMap.get("enable_lite_mode");
        if (str45 != null) {
            sparkPageSchemaParam.setEnableLiteMode(C1545520qJy.LIZ(str45));
        }
        String str46 = (String) concurrentHashMap.get("enable_lynx_prefetch");
        if (str46 != null) {
            sparkPageSchemaParam.setEnableLynxPrefetch(C1545520qJy.LIZIZ("enable_lynx_prefetch", str46, map, false));
        }
        String str47 = (String) concurrentHashMap.get("enable_memory_cache");
        if (str47 != null) {
            sparkPageSchemaParam.setEnableMemoryCache(Boolean.valueOf(C1545520qJy.LIZ(str47)));
        }
        String str48 = (String) concurrentHashMap.get("enable_multi_async_thread");
        if (str48 != null) {
            sparkPageSchemaParam.setEnableMultiAsyncThread(C1545520qJy.LIZ(str48));
        }
        String str49 = (String) concurrentHashMap.get("enable_multi_tab");
        if (str49 != null) {
            sparkPageSchemaParam.setEnableMultiTab(C1545520qJy.LIZ(str49));
        }
        String str50 = (String) concurrentHashMap.get("enable_pending_js_task");
        if (str50 != null) {
            sparkPageSchemaParam.setEnablePendingJsTask(C1545520qJy.LIZ(str50));
        }
        String str51 = (String) concurrentHashMap.get("enable_pre_code_cache");
        if (str51 != null) {
            sparkPageSchemaParam.setEnablePreCodeCache(C1545520qJy.LIZIZ("enable_pre_code_cache", str51, map, false));
        }
        String str52 = (String) concurrentHashMap.get("enable_pre_decode");
        if (str52 != null) {
            sparkPageSchemaParam.setEnablePreDecode(C1545520qJy.LIZIZ("enable_pre_decode", str52, map, false));
        }
        String str53 = (String) concurrentHashMap.get("enable_pre_decode_template");
        if (str53 != null) {
            sparkPageSchemaParam.setEnablePreDecodeTemplate(C1545520qJy.LIZIZ("enable_pre_decode_template", str53, map, false));
        }
        String str54 = (String) concurrentHashMap.get("enable_prefetch");
        if (str54 != null) {
            sparkPageSchemaParam.setEnablePrefetch(C1545520qJy.LIZIZ("enable_prefetch", str54, map, false));
        }
        String str55 = (String) concurrentHashMap.get("enable_saf");
        if (str55 != null) {
            sparkPageSchemaParam.setEnableSaf(C1545520qJy.LIZ(str55));
        }
        String str56 = (String) concurrentHashMap.get("enable_scroll_web_view");
        if (str56 != null) {
            sparkPageSchemaParam.setEnableScrollWebView(C1545520qJy.LIZ(str56));
        }
        String str57 = (String) concurrentHashMap.get("enable_storage_group");
        if (str57 != null) {
            sparkPageSchemaParam.setEnableStorageGroup(C1545520qJy.LIZ(str57));
        }
        String str58 = (String) concurrentHashMap.get("enable_sync_flush");
        if (str58 != null) {
            sparkPageSchemaParam.setEnableSyncFlush(C1545520qJy.LIZ(str58));
        }
        String str59 = (String) concurrentHashMap.get("enable_template_bundle_cache");
        if (str59 != null) {
            sparkPageSchemaParam.setEnableTemplateBundleCache(C1545520qJy.LIZ(str59));
        }
        String str60 = (String) concurrentHashMap.get("enable_vsync_aligned_message_loop");
        if (str60 != null) {
            sparkPageSchemaParam.setEnableVsyncAlignedMessageLoop(C1545520qJy.LIZ(str60));
        }
        String str61 = (String) concurrentHashMap.get("fallback_url");
        if (str61 != null) {
            sparkPageSchemaParam.setFallbackUrl(str61);
        }
        String str62 = (String) concurrentHashMap.get("forbidden_anim");
        if (str62 != null) {
            sparkPageSchemaParam.setForbiddenAnim(C1545520qJy.LIZ(str62));
        }
        String str63 = (String) concurrentHashMap.get("force_disable_back_press");
        if (str63 != null) {
            sparkPageSchemaParam.setForceBlockBackPress(C1545520qJy.LIZ(str63));
        }
        String str64 = (String) concurrentHashMap.get("force_lynx_generic_fetcher");
        if (str64 != null) {
            sparkPageSchemaParam.setForceGenericFetcher(Boolean.valueOf(C1545520qJy.LIZ(str64)));
        }
        String str65 = (String) concurrentHashMap.get("force_h5");
        if (str65 != null) {
            sparkPageSchemaParam.setForceH5(C1545520qJy.LIZ(str65));
        }
        String str66 = (String) concurrentHashMap.get("force_release_context_when_destroyed_for_sparkFragment");
        if (str66 != null) {
            sparkPageSchemaParam.setForceReleaseContextWhenDestroyedForSparkFragment(C1545520qJy.LIZ(str66));
        }
        String str67 = (String) concurrentHashMap.get("force_single_group");
        if (str67 != null) {
            sparkPageSchemaParam.setForceSingleGroup(C1545520qJy.LIZ(str67));
        }
        String str68 = (String) concurrentHashMap.get("force_theme_style");
        if (str68 != null) {
            sparkPageSchemaParam.setForceThemeStyle(str68);
        }
        String str69 = (String) concurrentHashMap.get("gecko_url_redirection");
        if (str69 != null) {
            sparkPageSchemaParam.setGeckoUrlRedirection(C1545520qJy.LIZ(str69));
        }
        String str70 = (String) concurrentHashMap.get("global_props_allow_list");
        if (str70 != null) {
            sparkPageSchemaParam.setGlobalPropsAllowList(str70);
        }
        String str71 = (String) concurrentHashMap.get("group");
        if (str71 != null) {
            sparkPageSchemaParam.setGroup(str71);
        }
        String str72 = (String) concurrentHashMap.get("hide_back_button");
        if (str72 != null) {
            sparkPageSchemaParam.setHideBackButton(C1545520qJy.LIZ(str72));
        }
        String str73 = (String) concurrentHashMap.get("hide_debug_label");
        if (str73 != null) {
            sparkPageSchemaParam.setHideDebugLabel(C1545520qJy.LIZ(str73));
        }
        String str74 = (String) concurrentHashMap.get("hide_error");
        if (str74 != null) {
            sparkPageSchemaParam.setHideError(C1545520qJy.LIZ(str74));
        }
        String str75 = (String) concurrentHashMap.get("hide_loading");
        if (str75 != null) {
            sparkPageSchemaParam.setHideLoading(C1545520qJy.LIZ(str75));
        }
        String str76 = (String) concurrentHashMap.get("hide_nav_bar");
        if (str76 != null) {
            sparkPageSchemaParam.setHideNavBar(C1545520qJy.LIZ(str76));
        }
        String str77 = (String) concurrentHashMap.get("hide_status_bar");
        if (str77 != null) {
            sparkPageSchemaParam.setHideStatusBar(C1545520qJy.LIZ(str77));
        }
        String str78 = (String) concurrentHashMap.get("hide_system_video_poster");
        if (str78 != null) {
            sparkPageSchemaParam.setHideSystemVideoPoster(C1545520qJy.LIZ(str78));
        }
        String str79 = (String) concurrentHashMap.get("ignore_all_query_params");
        if (str79 != null) {
            sparkPageSchemaParam.setIgnoreAllQueryParams(C1545520qJy.LIZ(str79));
        }
        String str80 = (String) concurrentHashMap.get("ignore_cache_policy");
        if (str80 != null) {
            sparkPageSchemaParam.setIgnoreCachePolicy(C1545520qJy.LIZIZ("ignore_cache_policy", str80, map, false));
        }
        String str81 = (String) concurrentHashMap.get("ignore_cached_theme");
        if (str81 != null) {
            sparkPageSchemaParam.setIgnoreCachedTheme(C1545520qJy.LIZ(str81));
        }
        String str82 = (String) concurrentHashMap.get("ignore_restore_main");
        if (str82 != null) {
            sparkPageSchemaParam.setIgnoreRestoreMain(C1545520qJy.LIZ(str82));
        }
        String str83 = (String) concurrentHashMap.get("ignore_web_http_or_ssl_error");
        if (str83 != null) {
            sparkPageSchemaParam.setIgnoreWebHttpOrSslError(C1545520qJy.LIZ(str83));
        }
        String str84 = (String) concurrentHashMap.get("ignored_query_params");
        if (str84 != null) {
            sparkPageSchemaParam.setIgnoredQueryParams(str84);
        }
        String str85 = (String) concurrentHashMap.get("init_data_url");
        if (str85 != null) {
            sparkPageSchemaParam.setInitDataUrl(str85);
        }
        String str86 = (String) concurrentHashMap.get("initial_data");
        if (str86 != null) {
            sparkPageSchemaParam.setInitialData(str86);
        }
        String str87 = (String) concurrentHashMap.get("keyboard_adjust");
        if (str87 != null) {
            sparkPageSchemaParam.setKeyboardAdjust(C1545520qJy.LIZIZ("keyboard_adjust", str87, map, false));
        }
        String str88 = (String) concurrentHashMap.get("keyboard_compat");
        if (str88 != null) {
            sparkPageSchemaParam.setKeyboardCompat(C1545520qJy.LIZ(str88));
        }
        String str89 = (String) concurrentHashMap.get("landscape_screen_size_as_portrait");
        if (str89 != null) {
            sparkPageSchemaParam.setLandscapeScreenSizeAsPortrait(C1545520qJy.LIZ(str89));
        }
        String str90 = (String) concurrentHashMap.get("loading_bg_color");
        Object obj3 = concurrentHashMap.get("loading_bg_color_dark");
        Object obj4 = concurrentHashMap.get("loading_bg_color_light");
        if (str90 != null || obj3 != null || obj4 != null) {
            sparkPageSchemaParam.setLoadingBgColor(C1545520qJy.LIZJ("loading_bg_color", str90, map));
        }
        String str91 = (String) concurrentHashMap.get("lock_resource");
        if (str91 != null) {
            sparkPageSchemaParam.setLockResource(C1545520qJy.LIZ(str91));
        }
        String str92 = (String) concurrentHashMap.get("lynx_prefetch_bid");
        if (str92 != null) {
            sparkPageSchemaParam.setLynxPrefetchBid(str92);
        }
        String str93 = (String) concurrentHashMap.get("lynxview_height");
        if (str93 != null) {
            sparkPageSchemaParam.setLynxviewHeight(Integer.valueOf(C1545520qJy.LIZIZ("lynxview_height", str93, map, true)));
        }
        String str94 = (String) concurrentHashMap.get("lynxview_width");
        if (str94 != null) {
            sparkPageSchemaParam.setLynxviewWidth(Integer.valueOf(C1545520qJy.LIZIZ("lynxview_width", str94, map, true)));
        }
        String str95 = (String) concurrentHashMap.get("nav_bar_color");
        Object obj5 = concurrentHashMap.get("nav_bar_color_dark");
        Object obj6 = concurrentHashMap.get("nav_bar_color_light");
        if (str95 != null || obj5 != null || obj6 != null) {
            sparkPageSchemaParam.setNavBarColor(C1545520qJy.LIZJ("nav_bar_color", str95, map));
        }
        String str96 = (String) concurrentHashMap.get("nav_btn_type");
        if (str96 != null) {
            sparkPageSchemaParam.setNavBtnType(str96);
        }
        String str97 = (String) concurrentHashMap.get("navigation_bar_bg_color");
        Object obj7 = concurrentHashMap.get("navigation_bar_bg_color_dark");
        Object obj8 = concurrentHashMap.get("navigation_bar_bg_color_light");
        if (str97 != null || obj7 != null || obj8 != null) {
            sparkPageSchemaParam.setNavigationBarBgColor(C1545520qJy.LIZJ("navigation_bar_bg_color", str97, map));
        }
        String str98 = (String) concurrentHashMap.get("need_bottom_out");
        if (str98 != null) {
            sparkPageSchemaParam.setNeedBottomOut(C1545520qJy.LIZ(str98));
        }
        String str99 = (String) concurrentHashMap.get("need_sec_link");
        if (str99 != null) {
            sparkPageSchemaParam.setNeedSecLink(C1545520qJy.LIZ(str99));
        }
        String str100 = (String) concurrentHashMap.get("need_set_screen_size");
        if (str100 != null) {
            sparkPageSchemaParam.setNeedSetScreenSize(C1545520qJy.LIZ(str100));
        }
        String str101 = (String) concurrentHashMap.get("need_wrapper_view");
        if (str101 != null) {
            sparkPageSchemaParam.setNeedWrapperView(C1545520qJy.LIZ(str101));
        }
        String str102 = (String) concurrentHashMap.get("net_worker");
        if (str102 != null) {
            sparkPageSchemaParam.setNetWorker(Integer.valueOf(C1545520qJy.LIZIZ("net_worker", str102, map, false)));
        }
        String str103 = (String) concurrentHashMap.get("only_local");
        if (str103 != null) {
            sparkPageSchemaParam.setOnlyLocal(Boolean.valueOf(C1545520qJy.LIZ(str103)));
        }
        String str104 = (String) concurrentHashMap.get("opt_title");
        if (str104 != null) {
            sparkPageSchemaParam.setOptTitle(C1545520qJy.LIZ(str104));
        }
        String str105 = (String) concurrentHashMap.get("page_depth_of_report_show");
        if (str105 != null) {
            sparkPageSchemaParam.setPageDepthOfReportShow(C1545520qJy.LIZIZ("page_depth_of_report_show", str105, map, false));
        }
        String str106 = (String) concurrentHashMap.get("spark_page");
        if (str106 != null) {
            sparkPageSchemaParam.setPageName(str106);
        }
        String str107 = (String) concurrentHashMap.get("parallel_fetch_resource");
        if (str107 != null) {
            sparkPageSchemaParam.setParallelFetchResource(C1545520qJy.LIZIZ("parallel_fetch_resource", str107, map, false));
        }
        String str108 = (String) concurrentHashMap.get("preloadFonts");
        if (str108 != null) {
            sparkPageSchemaParam.setPreloadFonts(str108);
        }
        String str109 = (String) concurrentHashMap.get("preload_setting_keys");
        if (str109 != null) {
            sparkPageSchemaParam.setPreloadSettingsKeys(str109);
        }
        String str110 = (String) concurrentHashMap.get("preload_storage_keys");
        if (str110 != null) {
            sparkPageSchemaParam.setPreloadStorageKeys(str110);
        }
        String str111 = (String) concurrentHashMap.get("preset_height");
        if (str111 != null) {
            sparkPageSchemaParam.setPresetHeight(C1545520qJy.LIZIZ("preset_height", str111, map, true));
        }
        String str112 = (String) concurrentHashMap.get("preset_safe_point");
        if (str112 != null) {
            sparkPageSchemaParam.setPresetSafePoint(C1545520qJy.LIZ(str112));
        }
        String str113 = (String) concurrentHashMap.get("preset_width");
        if (str113 != null) {
            sparkPageSchemaParam.setPresetWidth(C1545520qJy.LIZIZ("preset_width", str113, map, true));
        }
        String str114 = (String) concurrentHashMap.get("proxy_enabled_runtime_type");
        if (str114 != null) {
            sparkPageSchemaParam.setProxyEnabledRuntimeType(C1545520qJy.LIZ(str114));
        }
        String str115 = (String) concurrentHashMap.get("redirect_regions");
        if (str115 != null) {
            sparkPageSchemaParam.setRedirectRegions(str115);
        }
        String str116 = (String) concurrentHashMap.get("remove_wv_in_ua");
        if (str116 != null) {
            sparkPageSchemaParam.setRemoveWvInUa(C1545520qJy.LIZ(str116));
        }
        String str117 = (String) concurrentHashMap.get("resource_dynamic");
        if (str117 != null) {
            sparkPageSchemaParam.setResourceDynamic(Boolean.valueOf(C1545520qJy.LIZ(str117)));
        }
        String str118 = (String) concurrentHashMap.get("spark_page_session");
        if (str118 != null) {
            sparkPageSchemaParam.setRomaSession(str118);
        }
        String str119 = (String) concurrentHashMap.get("screen_orientation");
        if (str119 != null) {
            sparkPageSchemaParam.setScreenOrientation(str119);
        }
        String str120 = (String) concurrentHashMap.get("script_url");
        if (str120 != null) {
            sparkPageSchemaParam.setScriptUrl(str120);
        }
        String str121 = (String) concurrentHashMap.get("sec_link_scene");
        if (str121 != null) {
            sparkPageSchemaParam.setSecLinkScene(str121);
        }
        String str122 = (String) concurrentHashMap.get("session_id");
        if (str122 != null) {
            sparkPageSchemaParam.setSessionId(str122);
        }
        String str123 = (String) concurrentHashMap.get("share_group");
        if (str123 != null) {
            sparkPageSchemaParam.setShareGroup(C1545520qJy.LIZ(str123));
        }
        String str124 = (String) concurrentHashMap.get("show_closeall");
        if (str124 != null) {
            sparkPageSchemaParam.setShowCloseAll(str124);
        }
        String str125 = (String) concurrentHashMap.get("show_nav_bar_in_trans_status_bar");
        if (str125 != null) {
            sparkPageSchemaParam.setShowNavBarInTransStatusBar(C1545520qJy.LIZ(str125));
        }
        String str126 = (String) concurrentHashMap.get("show_progress_bar_in_all_page");
        if (str126 != null) {
            sparkPageSchemaParam.setShowProgressBarInAllPage(C1545520qJy.LIZ(str126));
        }
        String str127 = (String) concurrentHashMap.get("show_web_url");
        if (str127 != null) {
            sparkPageSchemaParam.setShowWebUrl(C1545520qJy.LIZ(str127));
        }
        String str128 = (String) concurrentHashMap.get("skeleton_duration");
        if (str128 != null) {
            sparkPageSchemaParam.setSkeletonDuration(Integer.valueOf(C1545520qJy.LIZIZ("skeleton_duration", str128, map, true)));
        }
        String str129 = (String) concurrentHashMap.get("skeleton_from_alpha");
        if (str129 != null) {
            sparkPageSchemaParam.setSkeletonFromAlpha(str129);
        }
        String str130 = (String) concurrentHashMap.get("skeleton_path");
        if (str130 != null) {
            sparkPageSchemaParam.setSkeletonPath(str130);
        }
        String str131 = (String) concurrentHashMap.get("skeleton_to_alpha");
        if (str131 != null) {
            sparkPageSchemaParam.setSkeletonToAlpha(str131);
        }
        String str132 = (String) concurrentHashMap.get("skeleton_with_animation");
        if (str132 != null) {
            sparkPageSchemaParam.setSkeletonWithAnimation(C1545520qJy.LIZ(str132));
        }
        String str133 = (String) concurrentHashMap.get("spark_perf_bid");
        if (str133 != null) {
            sparkPageSchemaParam.setSparkPerfBid(str133);
        }
        String str134 = (String) concurrentHashMap.get("spark_perf_bid_strict_mode");
        if (str134 != null) {
            sparkPageSchemaParam.setSparkPerfBidStrictMode(C1545520qJy.LIZ(str134));
        }
        String str135 = (String) concurrentHashMap.get("spark_perf_biz");
        if (str135 != null) {
            sparkPageSchemaParam.setSparkPerfBiz(str135);
        }
        String str136 = (String) concurrentHashMap.get("ssp_config");
        if (str136 != null) {
            sparkPageSchemaParam.setSspConfig(C1545520qJy.LIZIZ("ssp_config", str136, map, false));
        }
        String str137 = (String) concurrentHashMap.get("ssr_cache_key");
        if (str137 != null) {
            sparkPageSchemaParam.setSsrCacheKey(str137);
        }
        String str138 = (String) concurrentHashMap.get("ssr_init_data");
        if (str138 != null) {
            sparkPageSchemaParam.setSsrInitData(str138);
        }
        String str139 = (String) concurrentHashMap.get("ssr_mode");
        if (str139 != null) {
            sparkPageSchemaParam.setSsrMode(Integer.valueOf(C1545520qJy.LIZIZ("ssr_mode", str139, map, false)));
        }
        String str140 = (String) concurrentHashMap.get("ssr_url");
        if (str140 != null) {
            sparkPageSchemaParam.setSsrUrl(str140);
        }
        String str141 = (String) concurrentHashMap.get("starling_channel");
        if (str141 != null) {
            sparkPageSchemaParam.setStarlingChannel(str141);
        }
        String str142 = (String) concurrentHashMap.get("starling_fallback");
        if (str142 != null) {
            sparkPageSchemaParam.setStarlingFallback(C1545520qJy.LIZ(str142));
        }
        String str143 = (String) concurrentHashMap.get("status_bar_bg_color");
        Object obj9 = concurrentHashMap.get("status_bar_bg_color_dark");
        Object obj10 = concurrentHashMap.get("status_bar_bg_color_light");
        if (str143 != null || obj9 != null || obj10 != null) {
            sparkPageSchemaParam.setStatusBarBgColor(C1545520qJy.LIZJ("status_bar_bg_color", str143, map));
        }
        String str144 = (String) concurrentHashMap.get("status_font_mode");
        if (str144 != null) {
            sparkPageSchemaParam.setStatusFontMode(str144);
        }
        String str145 = (String) concurrentHashMap.get("strict_url");
        if (str145 != null) {
            sparkPageSchemaParam.setStrictUrl(str145);
        }
        String str146 = (String) concurrentHashMap.get("subscribe_network_level");
        if (str146 != null) {
            sparkPageSchemaParam.setSubscribeNetworkLevel(C1545520qJy.LIZ(str146));
        }
        String str147 = (String) concurrentHashMap.get("surl");
        if (str147 != null) {
            sparkPageSchemaParam.setSurl(str147);
        }
        String str148 = (String) concurrentHashMap.get("thread_strategy");
        if (str148 != null) {
            sparkPageSchemaParam.setThreadStrategy(C1545520qJy.LIZIZ("thread_strategy", str148, map, false));
        }
        String str149 = (String) concurrentHashMap.get("title");
        if (str149 != null) {
            sparkPageSchemaParam.setTitle(str149);
        }
        String str150 = (String) concurrentHashMap.get("title_color");
        Object obj11 = concurrentHashMap.get("title_color_dark");
        Object obj12 = concurrentHashMap.get("title_color_light");
        if (str150 != null || obj11 != null || obj12 != null) {
            sparkPageSchemaParam.setTitleColor(C1545520qJy.LIZJ("title_color", str150, map));
        }
        String str151 = (String) concurrentHashMap.get("tracing_uuid");
        if (str151 != null) {
            sparkPageSchemaParam.setTracingUUID(str151);
        }
        String str152 = (String) concurrentHashMap.get("trans_navigation_bar");
        if (str152 != null) {
            sparkPageSchemaParam.setTransNavigationBar(C1545520qJy.LIZ(str152));
        }
        String str153 = (String) concurrentHashMap.get("trans_status_bar");
        if (str153 != null) {
            sparkPageSchemaParam.setTransStatusBar(C1545520qJy.LIZ(str153));
        }
        String str154 = (String) concurrentHashMap.get("ui_running_mode");
        if (str154 != null) {
            sparkPageSchemaParam.setUiRunningMode(C1545520qJy.LIZ(str154));
        }
        String str155 = (String) concurrentHashMap.get("url");
        if (str155 != null) {
            sparkPageSchemaParam.setUrl(str155);
        }
        String str156 = (String) concurrentHashMap.get("use_forest");
        if (str156 != null) {
            sparkPageSchemaParam.setUseForest(C1545520qJy.LIZ(str156));
        }
        String str157 = (String) concurrentHashMap.get("use_motion");
        if (str157 != null) {
            sparkPageSchemaParam.setUseMotion(C1545520qJy.LIZ(str157));
        }
        String str158 = (String) concurrentHashMap.get("use_mutable_context");
        if (str158 != null) {
            sparkPageSchemaParam.setUseMutableContext(C1545520qJy.LIZ(str158));
        }
        String str159 = (String) concurrentHashMap.get("use_preload");
        if (str159 != null) {
            sparkPageSchemaParam.setUsePreload(C1545520qJy.LIZ(str159));
        }
        String str160 = (String) concurrentHashMap.get("use_preload_resource_h5");
        if (str160 != null) {
            sparkPageSchemaParam.setUsePreloadResourceH5(C1545520qJy.LIZ(str160));
        }
        String str161 = (String) concurrentHashMap.get("use_system_browser_ua");
        if (str161 != null) {
            sparkPageSchemaParam.setUseSystemBrowserUa(C1545520qJy.LIZ(str161));
        }
        String str162 = (String) concurrentHashMap.get("use_webview_title");
        if (str162 != null) {
            sparkPageSchemaParam.setUseWebviewTitle(C1545520qJy.LIZ(str162));
        }
        String str163 = (String) concurrentHashMap.get("wait_gecko_update");
        if (str163 != null) {
            sparkPageSchemaParam.setWaitGeckoUpdate(Boolean.valueOf(C1545520qJy.LIZ(str163)));
        }
        String str164 = (String) concurrentHashMap.get("wait_low_storage_update");
        if (str164 != null) {
            sparkPageSchemaParam.setWaitLowStorageUpdate(C1545520qJy.LIZ(str164));
        }
        String str165 = (String) concurrentHashMap.get("webview_scroll_first_when_expanded");
        if (str165 != null) {
            sparkPageSchemaParam.setWebViewScrollFirstWhenExpanded(C1545520qJy.LIZ(str165));
        }
        String str166 = (String) concurrentHashMap.get("webview_progress_bar");
        if (str166 != null) {
            sparkPageSchemaParam.setWebviewProgressBar(C1545520qJy.LIZ(str166));
        }
    }
}
