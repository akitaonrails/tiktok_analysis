package X;

import Y.ACallableS148S0000000_4;
import Y.ARunnableS104S0100000_4;
import Y.ARunnableS84S0000000_4;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.ies.ugc.statisticlogger.config.AppLogSendCallbackConfig;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.IAccountFeatureFlagService;
import com.ss.android.ugc.aweme.app.crash.LaunchProtectService;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.experiment.ReDexExperimentOpt;
import com.ss.android.ugc.aweme.experiment.ViewStubOptExperiment;
import com.ss.android.ugc.aweme.experiment.ViewStubOptExperimentV2;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabTopExperiment;
import com.ss.android.ugc.aweme.legacy.ColdLaunchRequestCombinerImpl;
import com.ss.android.ugc.aweme.legoImp.ClientSLIDataUploader;
import com.ss.android.ugc.aweme.legoImp.task.TryCatchConfig;
import com.ss.android.ugc.aweme.relation.recuser.IRecUserService;
import com.ss.android.ugc.aweme.search.ISearchServiceLowEnd;
import com.ss.android.ugc.aweme.services.IAVInitializer;
import com.ss.android.ugc.aweme.setting.IAbTestManager;
import com.ss.android.ugc.aweme.setting.api.ABApi;
import com.ss.android.ugc.aweme.settings.ForestStrategy;
import com.ss.android.ugc.aweme.settings.JsbSdkErrorBlockJsbListSettings;
import com.ss.android.ugc.aweme.settings.JsbSecureAuthConfigSettings;
import com.ss.android.ugc.aweme.settings.SDUIGlobalSettings;
import com.ss.android.ugc.aweme.settings.SparkEcomOptimizeExperiment;
import com.ss.android.ugc.aweme.settings.SparkIABOptimizeConfig;
import com.ss.android.ugc.aweme.settings.SparkLynxBridgeThreadDispatcherSettings;
import com.ss.android.ugc.aweme.settings.SparkWebViewOptimizeExperiment;
import com.ss.android.ugc.aweme.settings.TTWebViewEnableStatusSettings;
import com.ss.android.ugc.aweme.settings.TiktokInterceptIllegalBundleConfigModel;
import com.ss.android.ugc.aweme.settings.TiktokInterceptThirdPartyCdnResourceConfigModel;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService;
import com.ss.android.ugc.aweme.specact.ab.SparkOptimizationModel;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedMultiSceneComponentsData;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0Bt0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C302240Bt0 implements InterfaceC303670BvJ, IAbTestManager {
    public static volatile C302240Bt0 LIZIZ;
    public final C1519760peQ<InterfaceC302500BtQ> LIZ = new C1519760peQ<>();

    public static C302240Bt0 LJFF() {
        if (LIZIZ == null) {
            synchronized (C302240Bt0.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C302240Bt0();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public C302240Bt0() {
        C20237514Gn.LIZIZ.LIZ.put(3, new C20237614Go(System.currentTimeMillis(), this));
    }

    public static void LJI() {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutBoolean;
        SharedPreferences.Editor editorEdit2;
        SharedPreferences.Editor editorPutBoolean2;
        int i = 31744;
        ((Keva) C302540BtU.LIZ.getValue()).storeBoolean("useSurfaceView", C0C64.LJIILLIIL().LJIIIZ(31744, "use_surface_view", true, false));
        VideoBitRateABManager videoBitRateABManager = VideoBitRateABManager.LJFF;
        videoBitRateABManager.getClass();
        if (!ColdLaunchRequestCombinerImpl.LIZJ().LIZ()) {
            videoBitRateABManager.LIZ();
        }
        KevaImpl.getRepoSync(FollowFeedViewStubExperiment.REPO_NAME, 0).storeBoolean("clear_red_point_cost", true);
        C303010BuF.LIZ().initNotificationChannel();
        C15O7.LIZJ(new ACallableS148S0000000_4(0));
        C823670WSv.LJ = true;
        C303320Buk.LIZIZ(C072Z.LIZ(), C1852707Nl.LIZIZ());
        C1519810peV c1519810peV = new C1519810peV(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME));
        c1519810peV.storeInt("optimize_user_service", C0C64.LJIILLIIL().LJIJ(31744, 2, "optimize_user_service_option", true));
        c1519810peV.storeBoolean("key_get_player_config", C0C64.LJIILLIIL().LJIIIZ(31744, "key_get_player_config", true, false));
        c1519810peV.storeBoolean("async_audio_opt_ab_enabled", C0C64.LJIILLIIL().LJIIIZ(31744, "async_audio_request_focus_ab", true, false));
        c1519810peV.storeBoolean("audio_focus_opt_ab", C0C64.LJIILLIIL().LJIIIZ(31744, "disable_audio_manager_helper", true, false));
        C08Q0.LJFF(C1BWL.LIZ()).edit().putBoolean("isInTikTokRegionForAbTestInit", C2222691Bz1.LJIIIIZZ()).apply();
        c1519810peV.storeBoolean("isInTikTokRegionForAbTestInit", C2222691Bz1.LJIIIIZZ());
        c1519810peV.storeInt("jump_cookie", C0C64.LJIILLIIL().LJIJ(31744, 0, "jump_cookie", true));
        c1519810peV.storeInt("cold_boot_degradation", C0C64.LJIILLIIL().LJIJ(31744, 2, "cold_boot_degradation", true));
        c1519810peV.storeBoolean("npth_init_anr_ahead", C302330Bt9.LIZ());
        c1519810peV.storeInt("feed_preload_request", C0C64.LJIILLIIL().LJIJI(ClientExpManager.new_user_nonuj_feed_preload_opt(), "new_user_nonuj_feed_preload_opt"));
        C0BEC.LJII();
        c1519810peV.storeInt("event_bus_opt_v3", C302320Bt8.LIZ());
        c1519810peV.storeInt("apm_thread_opt_type", C302820Btw.LIZJ());
        c1519810peV.storeBoolean("apm_net_monitor_opt", C302650Btf.LIZ());
        c1519810peV.storeBoolean("hybrid_monitor_regex_opt", C072V.LIZ());
        c1519810peV.storeBoolean("apm_sdk_monitor_opt", C302620Btc.LIZ());
        c1519810peV.storeBoolean("apm_terminal_monitor_opt", C302590BtZ.LIZIZ());
        c1519810peV.storeBoolean("optimize_av_early", C17925070h.LIZ);
        c1519810peV.storeBoolean("optimize_appfly_early", C17926070i.LIZ);
        c1519810peV.storeBoolean("optimize_newuserjourney", C17962071s.LIZ);
        c1519810peV.storeBoolean("optimize_newuserjourneyelaborate", C17961071r.LIZ);
        IRecUserService iRecUserService = (IRecUserService) ServiceManager.get().getService(IRecUserService.class);
        if (iRecUserService != null && iRecUserService.LIZ() != null) {
            iRecUserService.LIZ().LIZIZ();
        }
        C1076010e6h.LIZJ.LJIJJLI();
        c1519810peV.storeInt("cold_boot_mainfragment_opt", C0C64.LJIILLIIL().LJIJ(31744, 2, "cold_boot_mainfragment_opt", true));
        c1519810peV.storeBoolean("no_network_opt", C0C64.LJIILLIIL().LJIIIZ(31744, "no_network_opt", true, false));
        c1519810peV.storeBoolean("optimize_webview", false);
        c1519810peV.storeInt("cold_boot_optim_v1", C0C64.LJIILLIIL().LJIJ(31744, 0, "cold_boot_optim_v1", true));
        c1519810peV.storeInt("enable_request_tag", C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_request_tag", true));
        c1519810peV.storeInt("cold_boot_mainfragment_opt", C0C64.LJIILLIIL().LJIJ(31744, 2, "cold_boot_mainfragment_opt", true));
        c1519810peV.storeInt("splash_opt", C0C64.LJIILLIIL().LJIJ(31744, 18, "splash_opt", true));
        c1519810peV.storeInt("splash_new_factory_opt", C0C64.LJIILLIIL().LJIJ(31744, 1, "splash_new_factory_opt", true));
        ISplashAdService iSplashAdService = (ISplashAdService) ServiceManager.get().getService(ISplashAdService.class);
        if (iSplashAdService != null) {
            iSplashAdService.LJJIIJ();
        }
        C303320Buk.LIZIZ(C072Z.LIZ(), C1852707Nl.LIZIZ());
        c1519810peV.storeBoolean("passive_gecko_clean_enbled_v7", C0C64.LJIILLIIL().LJIIIZ(31744, "passive_gecko_clean_enbled_v7", true, false));
        c1519810peV.storeInt("preload_feed_count", C0C64.LJIILLIIL().LJIJ(31744, 1, "preload_feed_count", true));
        c1519810peV.storeBoolean("first_feed_msg_focus_send_opt", C302090Bsl.LIZ);
        c1519810peV.storeBoolean("first_feed_msg_asynchronous_opt", C302230Bsz.LIZ);
        c1519810peV.storeBoolean("first_feed_msg_post_animation_opt", C302100Bsm.LIZ);
        c1519810peV.storeBoolean("first_feed_preloadcachevideocover_v2", C302110Bsn.LIZ);
        c1519810peV.storeBoolean("first_feed_preloadnetvideocover_v2", C302200Bsw.LIZ);
        c1519810peV.storeBoolean("first_feed_usecachedcoverbitmap_v2", C302210Bsx.LIZ);
        c1519810peV.storeBoolean("first_feed_dont_move_doframe_opt", C302220Bsy.LIZ);
        c1519810peV.storeInt("is_downgrade_splite_opt", C0C64.LJIILLIIL().LJIJ(31744, 1024, "is_downgrade_splite_opt", true));
        c1519810peV.storeInt("appflyer_opt", C0C64.LJIILLIIL().LJIJ(31744, 7, "appflyer_opt", true));
        c1519810peV.storeBoolean("optimize_andinflatethread", C072H.LIZ);
        c1519810peV.storeInt("optimize_preloadfeedtype", C302450BtL.LIZ);
        c1519810peV.storeBoolean("optimize_asyncinflatefragmentmainpage_v2", C302410BtH.LIZ);
        c1519810peV.storeBoolean("optimize_asyncinflatefragmentmain", C302390BtF.LIZ);
        c1519810peV.storeBoolean("optimize_asyncinflatefragmentfeed", C302350BtB.LIZ);
        c1519810peV.storeBoolean("optimize_asyncinflatefragmentfeedfollow", C302370BtD.LIZ);
        c1519810peV.storeLong("optimize_asyncinflateprofiledelaytime", C302430BtJ.LIZ);
        c1519810peV.storeLong("degradation_pendinginterval", AnonymousClass0710.LIZ);
        c1519810peV.storeBoolean("optimize_publishtabelaborate", C072R.LIZ);
        c1519810peV.storeBoolean("optimize_maintabstrip", C072U.LIZ);
        c1519810peV.storeBoolean("optimize_precreaterecommendfragment", C072P.LIZ);
        c1519810peV.storeBoolean("optimize_precreatefollowfragment", C072N.LIZ);
        c1519810peV.storeBoolean("optimize_liveiconelaborate", C072L.LIZ);
        c1519810peV.storeBoolean("optimize_asynccheckfission", C072J.LIZ);
        c1519810peV.storeBoolean("optimize_feedloading", C072F.LIZ);
        c1519810peV.storeBoolean("optimize_reuseunconsumefeed", C302440BtK.LIZ);
        c1519810peV.storeBoolean("optimize_preloawarmdvideocover", C302420BtI.LIZ);
        c1519810peV.storeBoolean("optimize_preloadallvideo", C302340BtA.LIZ);
        c1519810peV.storeInt("optimize_cachevideocount", C302460BtM.LIZ);
        c1519810peV.storeInt("optimize_preloadwarmfeedcount", C302360BtC.LIZ);
        c1519810peV.storeBoolean("optimize_preloadwarmfragmentviews", C302380BtE.LIZ);
        c1519810peV.storeBoolean("optimize_preloadtabs", C302400BtG.LIZ);
        c1519810peV.storeInt("splash_downgrade", C0C64.LJIILLIIL().LJIJ(31744, 0, "splash_downgrade", true));
        C20595215iQ.LIZ.LIZ();
        c1519810peV.storeBoolean("optimize_deletefilesless128m", C17945071b.LIZ);
        c1519810peV.storeBoolean("optimize_deletefilesless64m", C17947071d.LIZ);
        c1519810peV.storeBoolean("key_string_builder_optimize", C0C64.LJIILLIIL().LJIIIZ(31744, "key_string_builder_optimize", true, false));
        c1519810peV.storeBoolean("key_jit_debug_info_optimize", C0C64.LJIILLIIL().LJIIIZ(31744, "key_jit_debug_info_optimize", true, true));
        c1519810peV.storeInt("key_anr_collect_interval_ab", C0C64.LJIILLIIL().LJIJ(31744, 500, "NpthANRCollectOpt", true));
        c1519810peV.storeInt("live_preParse_dns_exp", C17964071u.LIZ());
        c1519810peV.storeBoolean("optimize_preloadinstance", C17955071l.LIZ);
        c1519810peV.storeBoolean("optimize_preexecutehookwebview", C17958071o.LIZ);
        c1519810peV.storeBoolean("optimize_hookmainassetv2", C285690BHr.LIZ);
        c1519810peV.storeBoolean("optimize_launchactivity", C17952071i.LIZ);
        C303320Buk.LIZIZ(C072Z.LIZ(), C1852707Nl.LIZIZ());
        c1519810peV.storeBoolean("optimize_mainlooperenhance", C17934070q.LIZ);
        c1519810peV.storeBoolean("optimize_mainlooperprinter", C17936070s.LIZ);
        c1519810peV.storeBoolean("optimize_unusedpreload", C17957071n.LIZ);
        c1519810peV.storeBoolean("optimize_userservice", C17959071p.LIZ);
        c1519810peV.storeBoolean("optimize_disablefirstfission", C17921070d.LIZ);
        c1519810peV.storeBoolean("enable_preload_codec_list", C17963071t.LIZ);
        c1519810peV.storeBoolean("optimize_preexecuteavenv", C17918070a.LIZ);
        c1519810peV.storeBoolean("optimize_preloadsplash", C17948071e.LIZ);
        c1519810peV.storeBoolean("optimize_enablelogtask_v3", C17946071c.LIZ);
        c1519810peV.storeBoolean("optimize_abreport", C17940070w.LIZ());
        c1519810peV.storeLong("optimize_logbootfinishtaskinterval", C17928070k.LIZ);
        c1519810peV.storeBoolean("optimize_videodecopt", C17951071h.LIZ);
        c1519810peV.storeLong("optimize_delayliverequest", C070T.LIZ);
        c1519810peV.storeBoolean("optimize_disablesharerequest", C17960071q.LIZ);
        c1519810peV.storeBoolean("optimize_mainlooperservice", C17950071g.LIZ);
        c1519810peV.storeBoolean("optimize_anonymoushandler", C17932070o.LIZ);
        c1519810peV.storeBoolean("optimize_loadedapkdispatcher", C17944071a.LIZ);
        c1519810peV.storeBoolean("optimize_corehandler", AnonymousClass0712.LIZ);
        c1519810peV.storeBoolean("optimize_assemhandler", C17938070u.LIZ());
        c1519810peV.storeBoolean("optimize_dispatchedcontinuation", C17954071k.LIZ());
        c1519810peV.storeBoolean("optimize_looperidle", C17930070m.LIZ);
        c1519810peV.storeBoolean("optimize_controlloadedapk", C17942070y.LIZ);
        c1519810peV.storeBoolean("optimize_degradepredrawable_v2", C17949071f.LIZ);
        c1519810peV.storeBoolean("optimize_degradepreload", AnonymousClass0714.LIZ);
        c1519810peV.storeInt("optimize_endlesslooper", C17953071j.LIZ());
        c1519810peV.storeBoolean("optimize_createbeforecreatetask_v2", C17956071m.LIZ);
        c1519810peV.storeBoolean("optimize_logictab", C072D.LIZ);
        c1519810peV.storeInt("app_widget_optimize_experiment_2370", C0C64.LJIILLIIL().LJIJ(31744, 0, "app_widget_optimize_experiment_2370", true));
        c1519810peV.storeInt("main_looper_private_repo_opt_enable", C0C64.LJIILLIIL().LJIJ(31744, 0, "main_looper_private_opt_switch", true));
        C2073308Ah.LIZ();
        ClientSLIDataUploader.LIZ();
        C844470XAv c844470XAv = C844470XAv.LIZ;
        c844470XAv.getClass();
        C08OB.LIZIZ(C844470XAv.LIZ());
        c1519810peV.storeBoolean("tryplay_preexecute", ((Boolean) C17965071v.LIZ.getValue()).booleanValue());
        c1519810peV.storeInt("settings_manager_notify_settings_experiment_2370", C0C64.LJIILLIIL().LJIJ(31744, 0, "settings_manager_notify_settings_experiment_2370", true));
        c1519810peV.storeBoolean("enable_safe_air_cushion", C0C64.LJIILLIIL().LJIIIZ(31744, "enable_safe_air_cushion", true, false));
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        C01GW c01gw = C302710Btl.LIZ;
        c1519810peV.storeString("dynamic_try_catch_ab", C08JS.LIZLLL(c0c64LJIILLIIL.LJJIIJ(true, "dynamic_try_catch_ab", 31744, TryCatchConfig.class, null, 2)));
        C0C64 c0c64LJIILLIIL2 = C0C64.LJIILLIIL();
        C01GW c01gw2 = C302730Btn.LIZ;
        c1519810peV.storeString("dynamic_try_catch_ab2", C08JS.LIZLLL(c0c64LJIILLIIL2.LJJIIJ(true, "dynamic_try_catch_ab2", 31744, TryCatchConfig.class, null, 2)));
        c1519810peV.storeBoolean("disable_throwable_print_stack_trace", C0C64.LJIILLIIL().LJIIIZ(31744, "disable_throwable_print_stack_trace", true, false));
        c1519810peV.storeInt("key_binder_cache_1", C0C64.LJIILLIIL().LJIJ(31744, 0, "key_binder_cache_1", true));
        c1519810peV.storeInt("key_jato_hwui_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "key_jato_hwui_opt", true));
        c1519810peV.storeInt("feed_cache_video_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "feed_cache_video_opt", true));
        c1519810peV.storeInt("feed_cache_get_order", C0C64.LJIILLIIL().LJIJ(31744, 0, "feed_cache_get_order", true));
        c1519810peV.storeInt("feed_cache_preload_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "feed_cache_preload_opt", true));
        c1519810peV.storeInt("xjl_feed_enter_homepage_binder_call_opt_v2", C0C64.LJIILLIIL().LJIJ(31744, 0, "xjl_feed_enter_homepage_binder_call_opt_v2", true));
        c1519810peV.storeInt("xjl_feed_enter_homepage_binder_call_opt_v3", C0C64.LJIILLIIL().LJIJ(31744, 0, "xjl_feed_enter_homepage_binder_call_opt_v3", true));
        AnonymousClass0811 anonymousClass0811 = AnonymousClass0810.LIZ;
        if (anonymousClass0811.LIZJ == 2) {
            c1519810peV.storeInt("zl_perflock_mtk", C0C64.LJIILLIIL().LJIJ(31744, 60, "zl_perflock_mtk", true));
        } else if (anonymousClass0811.LIZJ == 3) {
            c1519810peV.storeInt("zl_perflock_kirin", C0C64.LJIILLIIL().LJIJ(31744, 46, "zl_perflock_kirin", true));
        }
        if (C2408409cA.LIZJ) {
            C1834207Gi.LIZ.getClass();
            c1519810peV.storeInt("zl_network_ipc_fix", C1834207Gi.LIZ());
        }
        c1519810peV.storeInt("feed_cache_filter_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "feed_cache_filter_opt", true));
        c1519810peV.storeInt("fluency_downgrade_opt_v2", C0C64.LJIILLIIL().LJIJ(31744, 0, "fluency_downgrade_opt_v2", true));
        c1519810peV.storeInt("cold_boot_mainAct_degradation", C0C64.LJIILLIIL().LJIJ(31744, 0, "cold_boot_mainAct_degradation", true));
        c1519810peV.storeInt("set_main_thread_priority", C0C64.LJIILLIIL().LJIJ(31744, -100, "set_main_thread_priority", true));
        C303320Buk.LIZIZ(C072Z.LIZ(), C1852707Nl.LIZIZ());
        C2503209rS.LIZ.getClass();
        C2503209rS.LIZIZ();
        IAVInitializer iAVInitializer = (IAVInitializer) PluggableExtentionKt.pluggableSpi(IAVInitializer.class);
        if (iAVInitializer != null) {
            iAVInitializer.updateAB();
        }
        C303320Buk.LIZIZ(C072Z.LIZ(), C1852707Nl.LIZIZ());
        c1519810peV.storeInt("thread_convergence_optimize_experiment", C0C64.LJIILLIIL().LJIJ(31744, 0, "thread_convergence_optimize_experiment", true));
        c1519810peV.storeBoolean("performance_opt_great_reversal_2440", C0C64.LJIILLIIL().LJIIIZ(31744, "performance_opt_great_reversal_2440", true, false));
        c1519810peV.storeBoolean("performance_player_opt_great_reversal", C0C64.LJIILLIIL().LJIIIZ(31744, "performance_player_opt_great_reversal", true, false));
        c1519810peV.storeInt("ab_dynamic_feature_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "ab_dynamic_feature_opt", true));
        c1519810peV.storeBoolean(ViewStubOptExperiment.KEY, C0C64.LJIILLIIL().LJIIIZ(31744, ViewStubOptExperiment.KEY, true, false));
        c1519810peV.storeBoolean("coldboot_commerce_logic_opt_enable", C17967071x.LIZ());
        c1519810peV.storeInt("paging_transition_experiment", C0C64.LJIILLIIL().LJIJ(31744, 0, "paging_transition_experiment", true));
        c1519810peV.storeInt("fresco_executor_supplier_fix_experiment", C0C64.LJIILLIIL().LJIJ(31744, 0, "fresco_executor_supplier_fix_experiment", true));
        c1519810peV.storeBoolean("tt_mall_top_tab_experiment", ((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).hitTopTabExpExperiment());
        SettingsManager.LIZLLL().getClass();
        c1519810peV.storeString("sliver_tracker_str", SettingsManager.LJI("sliver_tracker_str", ""));
        SettingsManager.LIZLLL().getClass();
        c1519810peV.storeString("sliver_tracker_str_full", SettingsManager.LJI("sliver_tracker_str_full", ""));
        SettingsManager.LIZLLL().getClass();
        c1519810peV.storeString("sliver_scene_str", SettingsManager.LJI("sliver_scene_str", ""));
        SettingsManager.LIZLLL().getClass();
        c1519810peV.storeString("gwpasan_scene_action_setting", SettingsManager.LJI("gwpasan_scene_action_setting", ""));
        c1519810peV.storeBoolean(ViewStubOptExperimentV2.KEY, C0C64.LJIILLIIL().LJIIIZ(31744, ViewStubOptExperimentV2.KEY, true, false));
        c1519810peV.storeFloat("xjl_feed_apm_sampling_opt", C0C64.LJIILLIIL().LJIILL(31744, "xjl_feed_apm_sampling_opt", true, -1.0f));
        c1519810peV.storeFloat("xjl_feed_apm_sampling_opt_report_v1", C0C64.LJIILLIIL().LJIILL(31744, "xjl_feed_apm_sampling_opt_report_v1", true, 1.0f));
        c1519810peV.storeInt("new_fps_monitor_exp", C0C64.LJIILLIIL().LJIJ(31744, 0, "new_fps_monitor_exp", true));
        c1519810peV.storeInt("xjl_feed_apm_looper_println_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "xjl_feed_apm_looper_println_opt", true));
        SettingsManager.LIZLLL().getClass();
        c1519810peV.storeBoolean("network_set_rxjava_error_handler", SettingsManager.LIZ("network_set_rxjava_error_handler", true));
        c1519810peV.storeInt("double_color_ball_invalidate_delay_experiment", C0C64.LJIILLIIL().LJIJ(31744, 0, "double_color_ball_invalidate_delay_experiment", true));
        c1519810peV.storeInt("fresco_fade_duration_disable_experiment", C0C64.LJIILLIIL().LJIJ(31744, 0, "fresco_fade_duration_disable_experiment", true));
        c1519810peV.storeInt("fyp_animation_delay_experiment", C0C64.LJIILLIIL().LJIJ(31744, 0, "fyp_animation_delay_experiment", true));
        c1519810peV.storeString("AppLog_send_callback_config", C08JS.LIZLLL(C0C59.LJ().LJIILIIL(AppLogSendCallbackConfig.Model.class, AppLogSendCallbackConfig.LIZIZ, "AppLog_send_callback_config", false)));
        SettingsManager.LIZLLL().getClass();
        c1519810peV.storeString("lancet_hook_method_collector", SettingsManager.LJI("lancet_hook_method_collector", ""));
        C1482305rB.LIZ();
        C1482205rA.LIZ();
        ReDexExperimentOpt.update();
        C810370Vqd.LIZIZ();
        C810370Vqd.LIZ();
        c1519810peV.storeString("multi_scene_feed_components", C08JS.LIZLLL(C0C59.LJ().LJIILIIL(FeedMultiSceneComponentsData.class, null, "multi_scene_feed_components", true)));
        c1519810peV.storeInt("video_consistency_experiment", C0C64.LJIILLIIL().LJIJ(31744, 0, "video_consistency_experiment", true));
        c1519810peV.storeLong("player_jato_boot_config", C0C64.LJIILLIIL().LJIJJLI(31744, 0L, "player_jato_boot_config", true));
        c1519810peV.storeLong("player_jato_start_activity_config", C0C64.LJIILLIIL().LJIJJLI(31744, 0L, "player_jato_start_activity_config", true));
        c1519810peV.storeLong("player_jato_start_service_config", C0C64.LJIILLIIL().LJIJJLI(31744, 0L, "player_jato_start_service_config", true));
        c1519810peV.storeLong("player_jato_receiver_config", C0C64.LJIILLIIL().LJIJJLI(31744, 0L, "player_jato_receiver_config", true));
        c1519810peV.storeLong("player_jato_pager_scroll_config", C0C64.LJIILLIIL().LJIJJLI(31744, 0L, "player_jato_pager_scroll_config", true));
        c1519810peV.storeLong("player_jato_pager_adapter_config", C0C64.LJIILLIIL().LJIJJLI(31744, 0L, "player_jato_pager_adapter_config", true));
        c1519810peV.storeLong("player_jato_view_scroll_config", C0C64.LJIILLIIL().LJIJJLI(31744, 0L, "player_jato_view_scroll_config", true));
        c1519810peV.storeLong("player_jato_view_adapter_config", C0C64.LJIILLIIL().LJIJJLI(31744, 0L, "player_jato_view_adapter_config", true));
        c1519810peV.storeLong("player_jato_boost_min_interval", C0C64.LJIILLIIL().LJIJJLI(31744, 500L, "player_jato_boost_min_interval", true));
        c1519810peV.storeBoolean("zero_video_view_monitor_olduser_exp", C0C64.LJIILLIIL().LJIIIZ(31744, "zero_video_view_monitor_olduser_exp", true, false));
        c1519810peV.storeInt("v_provider_cache_experiment", C0C64.LJIILLIIL().LJIJ(31744, 0, "v_provider_cache_experiment", true));
        c1519810peV.storeInt("slow_method_drop_count_index_experiment", C0C64.LJIILLIIL().LJIJ(31744, 0, "slow_method_drop_count_index_experiment", true));
        c1519810peV.storeInt("app_launcher_cpu_stage", C0C64.LJIILLIIL().LJIJ(31744, 0, "app_launcher_cpu_stage", true));
        c1519810peV.storeInt("xjl_alog_report_by_thread_pool_exp", C0C64.LJIILLIIL().LJIJ(31744, 0, "xjl_alog_report_by_thread_pool_exp", true));
        c1519810peV.storeInt("xjl_tux_auto_size_cache_exp", C0C64.LJIILLIIL().LJIJ(31744, 0, "xjl_tux_auto_size_cache_exp", true));
        c1519810peV.storeInt("feed_small_screen_for_size_experiment", C0C64.LJIILLIIL().LJIJ(31744, 0, "feed_small_screen_for_size_experiment", true));
        c1519810peV.storeInt("feed_small_screen_for_size_no_bottom_experiment", C0C64.LJIILLIIL().LJIJ(31744, 0, "feed_small_screen_for_size_no_bottom_experiment", true));
        c1519810peV.storeInt("xjl_feed_alog_sampling_exp", C0C64.LJIILLIIL().LJIJ(31744, 0, "xjl_feed_alog_sampling_exp", true));
        c1519810peV.storeInt("xjl_feed_sync_frame_state_opt_exp", C0C64.LJIILLIIL().LJIJ(31744, 0, "xjl_feed_sync_frame_state_opt_exp", true));
        c1519810peV.storeInt("xjl_feed_sync_frame_opt_type_exp", C0C64.LJIILLIIL().LJIJ(31744, 0, "xjl_feed_sync_frame_opt_type_exp", true));
        if (C1157804fw.LIZ()) {
            ((InterfaceC302520BtS) ServiceManager.get().getService(ISearchServiceLowEnd.class)).LLZZLLIL();
        } else {
            C1ER1.LIZIZ.LLZZLLIL();
        }
        C1856607Oy.LIZ();
        C1933507hl.LIZ();
        C1933607hm.LIZIZ();
        C1933407hk.LIZ();
        C291680Bby.LIZLLL();
        C291680Bby.LIZIZ();
        C291680Bby.LIZJ();
        c1519810peV.storeBoolean("aot_disable_opt", C0C64.LJIILLIIL().LJIIIZ(31744, "aot_disable_opt", true, false));
        c1519810peV.storeInt("big_screen_bottom_height", C0C64.LJIILLIIL().LJIJ(31744, 0, "big_screen_bottom_height", true));
        c1519810peV.storeInt("system_launch_ab_preload_experiment", C0C64.LJIILLIIL().LJIJ(31744, 0, "system_launch_ab_preload_experiment", true));
        c1519810peV.storeLong("aot_threshold_opt", C0C64.LJIILLIIL().LJIJJLI(31744, -1L, "aot_threshold_opt", true));
        SettingsManager.LIZLLL().getClass();
        c1519810peV.storeBoolean("enable_assem_log_settings", SettingsManager.LIZ("enable_assem_log_settings", false));
        c1519810peV.storeBoolean(FollowFeedViewStubExperiment.KEY, C0C64.LJIILLIIL().LJIIIZ(31744, FollowFeedViewStubExperiment.KEY, true, false));
        SettingsManager.LIZLLL().getClass();
        c1519810peV.storeInt("tab_preload_for_fcp", SettingsManager.LJ("tab_preload_for_fcp", 0));
        SettingsManager.LIZLLL().getClass();
        c1519810peV.storeInt("adjust_clear_six_tab_result", SettingsManager.LJ("adjust_clear_six_tab_result", 0));
        c1519810peV.storeInt("feed_tab_platform_enable", C0C64.LJIILLIIL().LJIJ(31744, 0, "feed_tab_platform_enable", true));
        c1519810peV.storeInt("ultimate_inflater_layout_preload_for_fyp_at_lest_2880", C0C64.LJIILLIIL().LJIJ(31744, 0, "ultimate_inflater_layout_preload_for_fyp_at_lest_2880", true));
        C1243304tj.LIZIZ.getValue();
        if (C0C64.LJIILLIIL().LJIIZILJ(31744, -1, 2, "tt_friends_experiment", true) != -1) {
            c1519810peV.storeInt("tt_friends_experiment", C0C64.LJIILLIIL().LJIIZILJ(31744, -1, 2, "tt_friends_experiment", true));
        }
        C0CXC.LIZ.getClass();
        int i2 = (C1585030rLh.LIZ(false) ? FriendsTabTopExperiment.LIZIZ : (FriendsTabTopExperiment.FriendsTabTopConfig) FriendsTabTopExperiment.LIZJ.getValue()).indexOnTop;
        if (i2 != -1) {
            c1519810peV.storeInt("tt_friends_top_tab_experiment_index", i2);
        }
        c1519810peV.storeInt("zl_background_runnable1", C0C64.LJIILLIIL().LJIJ(31744, 1, "zl_background_runnable1", true));
        ((IAccountFeatureFlagService) ServiceManager.get().getService(IAccountFeatureFlagService.class)).LIZLLL();
        c1519810peV.storeBoolean("vk_init_provider_startup_experiment", C0C64.LJIILLIIL().LJIIIZ(31744, "vk_init_provider_startup_experiment", true, false));
        c1519810peV.storeInt("splash_realtime", C302760Btq.LIZIZ());
        c1519810peV.storeLong("splash_realtime_timeout", C302570BtX.LIZ());
        c1519810peV.storeInt("traffic_monitor_experiment", C0C64.LJIILLIIL().LJIJ(31744, 0, "traffic_monitor_experiment", true));
        c1519810peV.storeFloat("traffic_monitor_sampling_experiment", C0C64.LJIILLIIL().LJIILL(31744, "traffic_monitor_sampling_experiment", true, 1.0f));
        c1519810peV.storeInt("tt_check_app_compat_theme_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_check_app_compat_theme_opt", true));
        c1519810peV.storeInt("tt_theme_enforcement_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_theme_enforcement_opt", true));
        C302250Bt1.LIZ.getClass();
        c1519810peV.storeInt("tt_resources_compat_opt", C302250Bt1.LIZ());
        c1519810peV.storeInt("tt_disable_event_tracker_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_disable_event_tracker_opt", true));
        c1519810peV.storeInt("tt_tracing_return_false_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_tracing_return_false_opt", true));
        c1519810peV.storeInt("max_bitmap_cache_mb", C0C64.LJIILLIIL().LJIJ(31744, 0, "max_bitmap_cache_mb", true));
        c1519810peV.storeInt("max_anim_cache_mb", C0C64.LJIILLIIL().LJIJ(31744, 0, "max_anim_cache_mb", true));
        c1519810peV.storeInt("max_encoded_cache_mb", C0C64.LJIILLIIL().LJIJ(31744, 0, "max_encoded_cache_mb", true));
        c1519810peV.storeFloat("max_cache_proportion", C0C64.LJIILLIIL().LJIILL(31744, "max_cache_proportion", true, 0.33f));
        C302260Bt2.LIZ.getClass();
        c1519810peV.storeInt("tt_logger_and_tostring_opt", C302260Bt2.LIZ());
        c1519810peV.storeInt("tt_set_max_spins", C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_set_max_spins", true));
        c1519810peV.storeInt("top_thread_runnable_experiment", C0C64.LJIILLIIL().LJIJ(31744, 0, "top_thread_runnable_experiment", true));
        c1519810peV.storeInt("content_capture_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "content_capture_opt", true));
        C08Q0.LJI(C1BWL.LIZ(), C0C64.LJIILLIIL().LJIJ(31744, 0, "key_gson_get_adapter_1", true));
        c1519810peV.storeBoolean("open_bdtracker_event_priority", C0C64.LJIILLIIL().LJIIIZ(31744, "open_bdtracker_event_priority", true, false));
        c1519810peV.storeInt("gecko_clean_phase_three_experiment", C0C64.LJIILLIIL().LJIJ(31744, 0, "gecko_clean_phase_three_experiment", true));
        c1519810peV.storeInt("gecko_clean_phase_three_expire_day_experiment", C0C64.LJIILLIIL().LJIJ(31744, 7, "gecko_clean_phase_three_expire_day_experiment", true));
        c1519810peV.storeBoolean("ttk_a11y_system_setting_track_enabled", C0C64.LJIILLIIL().LJIIIZ(31744, "ttk_a11y_system_setting_track_enabled", true, false));
        c1519810peV.storeInt("aweme_oncreate_before_super_tasks_anr_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "aweme_oncreate_before_super_tasks_anr_opt", true));
        c1519810peV.storeInt("apm_init_push_process_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "apm_init_push_process_opt", true));
        c1519810peV.storeBoolean("strict_mode_thread_policy_violation_check", C0C64.LJIILLIIL().LJIIIZ(31744, "strict_mode_thread_policy_violation_check", true, false));
        C0CD2.LJI();
        c1519810peV.storeInt("paging_transition_more_fast_scroll_experiment", C0C64.LJIILLIIL().LJIJ(31744, 0, "paging_transition_more_fast_scroll_experiment", true));
        c1519810peV.storeString("spark_webview_optimize_experiment", C08JS.LIZLLL(C0C64.LJIILLIIL().LJJII(SparkWebViewOptimizeExperiment.WebViewOptimizeModel.class, SparkWebViewOptimizeExperiment.LIZ, "spark_webview_optimize_experiment", true)));
        c1519810peV.storeString("spark_ecom_optimize_experiment", C08JS.LIZLLL(C0C64.LJIILLIIL().LJJII(SparkEcomOptimizeExperiment.EcomOptimizeModel.class, SparkEcomOptimizeExperiment.LIZ, "spark_ecom_optimize_experiment", true)));
        SettingsManager.LIZLLL().getClass();
        c1519810peV.storeString("ms_settings_android", SettingsManager.LJI("ms_settings_android", "5d3a57922d5da57e49f3625d79d0d4669632612f6582c496d8487843468bbb85fcbe5f71fde92348b08d9efdd9971c3040dcbab55c2b2843"));
        if (C1867110ygf.LIZ()) {
            i = 31744;
            c1519810peV.storeBoolean("spark_enable_e2e_tracing", C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "spark_enable_e2e_tracing", true, false));
            SettingsManager.LIZLLL().getClass();
            c1519810peV.storeString("spark_i18n_starling_prefix", SettingsManager.LJI("spark_i18n_starling_prefix", "10/starling/resource"));
            c1519810peV.storeString("spark_iab_optimize_config", C08JS.LIZLLL(C0C64.LJIILLIIL().LJJIIJ(true, "spark_iab_optimize_config", 31744, SparkIABOptimizeConfig.SparkIABOptimizeConfigModel.class, SparkIABOptimizeConfig.LIZ, 2)));
        }
        if (C1253204vK.LIZ()) {
            c1519810peV.storeStringArray("aweme_gecko_offline_host_prefix", (String[]) SettingsManager.LIZLLL().LJIIIIZZ("aweme_gecko_offline_host_prefix", String[].class, null));
            c1519810peV.storeString("gecko_cdn_config", C08JS.LIZLLL(SettingsManager.LIZLLL().LJIIIIZZ("gecko_cdn_config", n.class, C2010407uA.LIZIZ)));
            c1519810peV.storeBoolean("use_quick_view_monitor", C0C64.LJIILLIIL().LJIIIZ(i, "use_quick_view_monitor", true, false));
            c1519810peV.storeString("jsb_secure_auth_config", C08JS.LIZLLL(SettingsManager.LIZLLL().LJIIIIZZ("jsb_secure_auth_config", JsbSecureAuthConfigSettings.JsbSecureAuthConfigModel.class, JsbSecureAuthConfigSettings.LIZ)));
            c1519810peV.storeString("search_elements_async_white_list", C08JS.LIZLLL(C0C64.LJIILLIIL().LJJII(List.class, C1252804vG.LIZIZ, "search_elements_async_white_list", true)));
            c1519810peV.storeString("hybrid_monitor_settings_android", C08JS.LIZLLL(SettingsManager.LIZLLL().LJIIIIZZ("hybrid_monitor_settings_android", n.class, C1253004vI.LIZ)));
            c1519810peV.storeString("hybrid_monitor_settings_timing", C08JS.LIZLLL(SettingsManager.LIZLLL().LJIIIIZZ("hybrid_monitor_settings_timing", n.class, C1253104vJ.LIZ)));
            c1519810peV.storeBoolean("BDXBridgeManagerOptimize", C0C64.LJIILLIIL().LJIIIZ(i, "BDXBridgeManagerOptimize", true, false));
            SettingsManager.LIZLLL().getClass();
            c1519810peV.storeBoolean("BDXBridgeWebviewMemoryLeak", SettingsManager.LIZ("BDXBridgeWebviewMemoryLeak", true));
            c1519810peV.storeString("spark_lynx_bridge_thread_dispatcher", C08JS.LIZLLL(SettingsManager.LIZLLL().LJIIIIZZ("spark_lynx_bridge_thread_dispatcher", SparkLynxBridgeThreadDispatcherSettings.SparkLynxBridgeThreadDispatcherModel.class, SparkLynxBridgeThreadDispatcherSettings.LIZ)));
            SettingsManager.LIZLLL().getClass();
            c1519810peV.storeBoolean("bdxbridge_log_control", SettingsManager.LIZ("bdxbridge_log_control", false));
            c1519810peV.storeString("jsb_sdk_error_block_jsb_list", C08JS.LIZLLL(SettingsManager.LIZLLL().LJIIIIZZ("jsb_sdk_error_block_jsb_list", JsbSdkErrorBlockJsbListSettings.JsbSdkErrorBlockJsbListModel.class, JsbSdkErrorBlockJsbListSettings.LIZ)));
            SettingsManager.LIZLLL().getClass();
            c1519810peV.storeBoolean("auth_fallback_solution_optimize", SettingsManager.LIZ("auth_fallback_solution_optimize", false));
            c1519810peV.storeString("sdui_enable_switch", C08JS.LIZLLL(SettingsManager.LIZLLL().LJIIIIZZ("sdui_enable_switch", SDUIGlobalSettings.SduiEnableSwitchModel.class, SDUIGlobalSettings.LIZ)));
            c1519810peV.storeString("forest_strategy_settings", C08JS.LIZLLL(SettingsManager.LIZLLL().LJIIIIZZ("forest_strategy_settings", ForestStrategy.class, C302970BuB.LIZIZ)));
            c1519810peV.storeString("tiktok_font_interception", C08JS.LIZLLL(SettingsManager.LIZLLL().LJIIIIZZ("tiktok_font_interception", n.class, C2010307u9.LIZIZ)));
            c1519810peV.storeString("tiktok_intercept_illegal_bundle_config", C08JS.LIZLLL(SettingsManager.LIZLLL().LJIIIIZZ("tiktok_intercept_illegal_bundle_config", TiktokInterceptIllegalBundleConfigModel.class, C20487080v.LIZ)));
            c1519810peV.storeString("tiktok_intercept_third_party_cdn_resource_config", C08JS.LIZLLL(SettingsManager.LIZLLL().LJIIIIZZ("tiktok_intercept_third_party_cdn_resource_config", TiktokInterceptThirdPartyCdnResourceConfigModel.class, C1253804vQ.LIZ)));
            SettingsManager.LIZLLL().getClass();
            c1519810peV.storeString("spark_hide_loading_js", SettingsManager.LJI("spark_hide_loading_js", ""));
            c1519810peV.storeString("ug_spark_optimization", C08JS.LIZLLL(SettingsManager.LIZLLL().LJIIIIZZ("ug_spark_optimization", SparkOptimizationModel.class, C305900Byu.LIZ)));
            SettingsManager.LIZLLL().getClass();
            c1519810peV.storeBoolean("incentive_preload_flag", SettingsManager.LIZ("incentive_preload_flag", false));
            c1519810peV.storeString("incentive_reuse_urls", C08JS.LIZLLL(SettingsManager.LIZLLL().LJIIIIZZ("incentive_reuse_urls", String[].class, C304430BwX.LIZIZ)));
        }
        C2116408Qw.LIZJ("4050_sp_sync_opt", C302310Bt7.LIZ());
        C2116408Qw.LIZJ("4120_internal_get_process_name_opt", C289960BYc.LIZ());
        C2116408Qw.LIZJ("4130_app_init_preload_opt", C2115808Qq.LIZ());
        C2116408Qw.LIZJ("cold_boot_keva_adv_opt", C08R2.LIZ());
        C2116408Qw.LIZJ("cold_boot_preload_pumbaa_so", C2116008Qs.LIZ());
        TTWebViewEnableStatusSettings.LIZ.getClass();
        C2115808Qq.LIZJ(!TTWebViewEnableStatusSettings.LIZ().isTTWebViewEnabled);
        int i3 = i;
        boolean z = C0C64.LJIILLIIL().LJIIZILJ(i3, 0, 2, "less_madvise_opt_config_mode", true) == 1 && C0C64.LJIILLIIL().LJIL(i3, 2, "less_madvise_opt_files", "", true).contains("webview.apk");
        C2116408Qw.LIZJ("resource_not_found_fix", C1974007oI.LIZ());
        C2115808Qq.LIZLLL(z);
        C2115808Qq.LJIIIIZZ(C1973707oF.LIZ());
        C2115808Qq.LJ(C0AG3.LIZ());
        C2115808Qq.LJI(((Number) C2116608Qy.LIZ.getValue()).intValue());
        C2115808Qq.LJFF(((Number) C277800Aug.LIZ.getValue()).intValue());
        C2115808Qq.LJII(C259610AFj.LIZ());
        C2116408Qw.LIZJ("cold_boot_disable_verify_apex_max_version", C302290Bt5.LIZ());
        Context contextLIZ = C844470XAv.LIZ();
        boolean zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(i3, "keva_multi_process_io_exp", true, false);
        if (C302470BtN.LIZ == null) {
            C302470BtN.LIZ = contextLIZ.getSharedPreferences("aweme_keva_exp", 0);
        }
        SharedPreferences sharedPreferences = C302470BtN.LIZ;
        if (sharedPreferences != null && (editorEdit2 = sharedPreferences.edit()) != null && (editorPutBoolean2 = editorEdit2.putBoolean("keva_multi_process_io_exp", zLJIIIZ)) != null) {
            editorPutBoolean2.apply();
        }
        Context contextLIZ2 = C844470XAv.LIZ();
        boolean zLJIIIZ2 = C0C64.LJIILLIIL().LJIIIZ(i3, "keva_single_process_io_exp", true, false);
        if (C302470BtN.LIZ == null) {
            C302470BtN.LIZ = contextLIZ2.getSharedPreferences("aweme_keva_exp", 0);
        }
        SharedPreferences sharedPreferences2 = C302470BtN.LIZ;
        if (sharedPreferences2 != null && (editorEdit = sharedPreferences2.edit()) != null && (editorPutBoolean = editorEdit.putBoolean("keva_single_process_io_exp", zLJIIIZ2)) != null) {
            editorPutBoolean.apply();
        }
        C310440CEw.LIZIZ();
        C810370Vqd.LIZJ();
        c1519810peV.storeBoolean("report_bg_init_status", C1240604tI.LIZ());
        KevaImpl.getRepo("settings_v3_config", 1).storeBoolean("tt_use_libra_config_and", true);
        try {
            if (C823670WSv.LIZ != null) {
                long jCurrentTimeMillis = System.currentTimeMillis() - C823670WSv.LIZIZ;
                ScheduledExecutorService scheduledExecutorServiceLJ = C807400Vlq.LJ();
                long j = 30000 - jCurrentTimeMillis;
                ARunnableS104S0100000_4 aRunnableS104S0100000_4 = new ARunnableS104S0100000_4(scheduledExecutorServiceLJ, 60);
                if (j <= 0) {
                    j = 0;
                }
                scheduledExecutorServiceLJ.schedule(aRunnableS104S0100000_4, j, TimeUnit.MILLISECONDS);
            }
            C823670WSv.LIZ();
            c844470XAv.getClass();
            LaunchProtectService.LIZ(C844470XAv.LIZ());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C844470XAv.LIZ.getClass();
        C0WT5.LIZ(C844470XAv.LIZ());
        C09ET.LIZ();
        C302860Bu0.LJIIIIZZ = true;
        if (((Boolean) C283340B8q.LIZIZ.getValue()).booleanValue()) {
            C15O7.LIZJ(new CallableC311880CKk(AFwS190S0000000_4.get$arr$(4895)));
        }
    }

    @Override // X.InterfaceC303670BvJ
    public final void LIZ() {
        C0C5P.LIZJ().getClass();
        C305750Byf c305750Byf = new C305750Byf();
        c305750Byf.LIZ = "settings_v3_fallback_to_v1";
        C793770VBv.LJI(new C305780Byi(c305750Byf));
        ABApi.LIZ.getClass();
        C302670Bth.LIZIZ.getValue().querySettings().LIZLLL(new C346460Di8(3)).LJ(new C346460Di8(4), C15O7.LJIIIIZZ, null);
        if (C0TKA.LJ) {
            C0TKA.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void LIZIZ(n nVar) {
        n nVar2 = new n();
        nVar2.LJJIFFI("data", nVar);
        C0CLR.LIZ(nVar2);
    }

    @Override // com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void LIZLLL(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C20237514Gn.LIZIZ.LIZ(3, z);
        if (z) {
            if (((Boolean) C1841907Jh.LIZ.getValue()).booleanValue()) {
                C823050WQl.LJFF().execute(new ARunnableS104S0100000_4(this, 43));
            } else {
                if (C0CCS.LIZJ) {
                    C786410Ut5.LJLIIL(300L, C2113808Pw.LIZIZ.LL, new ARunnableS104S0100000_4(this, 45));
                } else {
                    LJI();
                }
                C2344809Gs.LIZLLL(4, "InterestSelectExperiment", "ab value refresh success,start to notify");
                try {
                    for (InterfaceC302500BtQ interfaceC302500BtQ : this.LIZ) {
                        if (interfaceC302500BtQ != null) {
                            interfaceC302500BtQ.LIZ();
                        }
                    }
                } catch (ConcurrentModificationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2344809Gs.LJI(e);
                }
                if (C0CCS.LIZJ) {
                    C786410Ut5.LJJZZIII(C2113808Pw.LIZIZ.LL, new ARunnableS84S0000000_4(10));
                } else {
                    SettingsManager.LIZLLL().getClass();
                    C1488650oqF.LIZ(SettingsManager.LIZ("enable_safe_view_checker", false));
                    ISettingsRequestService iSettingsRequestService = (ISettingsRequestService) ServiceManager.get().getService(ISettingsRequestService.class);
                    C844470XAv.LIZ.getClass();
                    iSettingsRequestService.LIZ(C844470XAv.LIZ());
                }
            }
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            C310770CGd.LIZ("system_launch").LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, "AbTestManager:onAbTestCompleteEvent");
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void LJ(InterfaceC302500BtQ interfaceC302500BtQ) {
        this.LIZ.LIZJ(interfaceC302500BtQ);
    }
}
