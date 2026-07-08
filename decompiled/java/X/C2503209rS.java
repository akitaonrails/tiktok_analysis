package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.experiment.INewUserDefaultGroup;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashSet;

/* JADX INFO: renamed from: X.09rS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2503209rS {
    public static final C2503209rS LIZ = new C2503209rS();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C2539209xG());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C277930Aut());

    public static Keva LIZ() {
        return (Keva) LIZIZ.getValue();
    }

    public static void LIZIZ() {
        LIZ().storeInt("fluency_insert_downgrade_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "fluency_insert_downgrade_opt", true));
        LIZ().storeInt("is_opt_lego_bootfinish", C0C64.LJIILLIIL().LJIJ(31744, 1, "is_opt_lego_bootfinish", true));
        LIZ().storeLong("lego_boot_finish_sparse", C0C64.LJIILLIIL().LJIJJLI(31744, 300L, "lego_boot_finish_sparse", true));
        Keva kevaLIZ = LIZ();
        SettingsManager.LIZLLL().getClass();
        kevaLIZ.storeLong("coldboot_log_batch_delay_time", SettingsManager.LJFF("coldboot_log_batch_delay_time", Mp4ScreenVideoLoadTimeout.CONTROL));
        LIZ().storeInt("applog_batch", C0C64.LJIILLIIL().LJIJ(31744, 0, "applog_batch", true));
        LIZ().storeLong("lego_boot_finish_trigger_delay", C0C64.LJIILLIIL().LJIJJLI(31744, 1000L, "lego_boot_finish_trigger_delay", true));
        LIZ().storeLong("lego_boot_finish_min_sparse", C0C64.LJIILLIIL().LJIJJLI(31744, 0L, "lego_boot_finish_min_sparse", true));
        LIZ().storeInt("downgrade_bg_experiment", C0C64.LJIILLIIL().LJIJ(31744, 0, "downgrade_bg_experiment", true));
        LIZ().storeInt("is_downgrade_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "is_downgrade_opt", true));
        LIZ().storeInt("backgroundtask_opt", C0C64.LJIILLIIL().LJIJ(31744, 145, "backgroundtask_opt", true));
        LIZ().storeInt("backgroundtask_opt_v2", C0C64.LJIILLIIL().LJIJ(31744, 30, "backgroundtask_opt_v2", true));
        LIZ().storeInt("launchertask_opt", C0C64.LJIILLIIL().LJIJ(31744, 29, "launchertask_opt", true));
        LIZ().storeInt("boot_do_frame_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "boot_do_frame_opt", true));
        LIZ().storeInt("activity_start_downgrade", C0C64.LJIILLIIL().LJIJ(31744, 13, "activity_start_downgrade", true));
        LIZ().storeInt("measure_downgrade", C0C64.LJIILLIIL().LJIJ(31744, 0, "measure_downgrade", true));
        LIZ().storeInt("java_threadpriority", C0C64.LJIILLIIL().LJIJ(31744, 3680, "java_threadpriority", true));
        LIZ().storeInt("fresco_total_opt", C0C64.LJIILLIIL().LJIJ(31744, 1, "fresco_total_opt", true));
        LIZ().storeInt("bootfinish_task_idle_opt", C0C64.LJIILLIIL().LJIJ(31744, 1, "bootfinish_task_idle_opt", true));
        LIZ().storeInt("swipe_ui_downgrade_experiment", C0C64.LJIILLIIL().LJIJ(31744, 0, "swipe_ui_downgrade_experiment", true));
        LIZ().storeInt("first_frame_do_frame_opt", C0C64.LJIILLIIL().LJIJ(31744, 1, "first_frame_do_frame_opt", true));
        Keva kevaLIZ2 = LIZ();
        C2539009xE.LIZ.getClass();
        kevaLIZ2.storeBoolean("repo_init_cukaie_opt", ((INewUserDefaultGroup) ServiceManager.get().getService(INewUserDefaultGroup.class)).LIZJ() ? true : C0C64.LJIILLIIL().LJIIIZ(31744, "init_cukaie_opt", true, false));
        LIZ().storeInt("jsbridge2_init_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "jsbridge2_init_opt", true));
        LIZ().storeInt("instance_preload_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "instance_preload_opt", true));
        LIZ().storeInt("thread_suppression_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "thread_suppression_opt", true));
        LIZ().storeInt("backgroundtask_schedule_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "backgroundtask_schedule_opt", true));
        LIZ().storeInt("device_screen_info_cache_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "device_screen_info_cache_opt", true));
        LIZ().storeInt("linux_threadpriority", C0C64.LJIILLIIL().LJIJ(31744, 0, "linux_threadpriority", true));
        LIZ().storeInt("initinflate_task_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "initinflate_task_opt", true));
        LIZ().storeInt("lego_request_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "lego_request_opt", true));
        LIZ().storeLong("lego_request_boot_finish_trigger_delay", C0C64.LJIILLIIL().LJIJJLI(31744, 2000L, "lego_request_boot_finish_trigger_delay", true));
        LIZ().storeLong("lego_request_idle_trigger_delay", C0C64.LJIILLIIL().LJIJJLI(31744, 2000L, "lego_request_idle_trigger_delay", true));
        LIZ().storeInt("thread_convergence_local_test_open", C0C64.LJIILLIIL().LJIJ(31744, 0, "thread_convergence_local_test_open", true));
        LIZ().storeInt("assem_performance_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "assem_performance_opt", true));
        LIZ().storeInt("boot_runnable_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "boot_runnable_opt", true));
        Keva kevaLIZ3 = LIZ();
        SettingsManager.LIZLLL().getClass();
        kevaLIZ3.storeLong("sparse_interval_time", SettingsManager.LJFF("sparse_interval_time", 0L));
        LIZ().storeInt("pthread_create_plugin_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "pthread_create_plugin_opt", true));
        LIZ().storeInt("layoutinfalter_hook_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "layoutinfalter_hook_opt", true));
        LIZ().storeInt("load_more_timing_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "load_more_timing_opt", true));
        LIZ().storeInt("apm_downgrade_v2", C0C64.LJIILLIIL().LJIJ(31744, 0, "apm_downgrade_v2", true));
        LIZ().storeInt("feed_assem_performance_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "feed_assem_performance_opt", true));
        LIZ().storeInt("notification_show_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "notification_show_opt", true));
        LIZ().storeInt("ab_lock_opt", C0C64.LJIILLIIL().LJIJ(31744, 2, "ab_lock_opt", true));
        LIZ().storeInt("feed_onsuccess_v1", C0C64.LJIILLIIL().LJIJ(31744, 0, "feed_onsuccess_v1", true));
        LIZ().storeInt("instance_preload_v2_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "instance_preload_v2_opt", true));
        LIZ().storeInt("ab_cache_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "ab_cache_opt", true));
        LIZ().storeInt("keva_cache_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "keva_cache_opt", true));
        LIZ().storeInt("loading_experience_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "loading_experience_opt", true));
        LIZ().storeLong("app_update_versioncode", C104100aN.LIZ().getUpdateVersionCode());
        LIZ().storeInt("hybridkit_config_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "hybridkit_config_opt", true));
        LIZ().storeInt("request_downgrade_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "request_downgrade_opt", true));
        LIZ().storeInt("live_pre_parse_dns_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "live_pre_parse_dns_opt", true));
        LIZ().storeInt("live_pre_init_strategy_sdk", C0C64.LJIILLIIL().LJIJ(31744, 0, "live_pre_init_strategy_sdk", true));
        LIZ().storeInt("push_start_app_opt_precise", C0C64.LJIILLIIL().LJIJ(31744, 0, "push_start_app_opt_precise", true));
        LIZ().storeInt("casting_experiment_precise", C0C64.LJIILLIIL().LJIJ(31744, 1, "casting_experiment", true));
        LIZ().storeLong("bg_task_sum_time", C0C64.LJIILLIIL().LJIJJLI(31744, 0L, "bg_task_sum_time", true));
        LIZ().storeLong("bg_task_sparse_time", C0C64.LJIILLIIL().LJIJJLI(31744, 0L, "bg_task_sparse_time", true));
        LIZ().storeLong("cold_boot_request_sparse_time", C0C64.LJIILLIIL().LJIJJLI(31744, 0L, "cold_boot_request_sparse_time", true));
        LIZ().storeInt("push_start_task_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "push_start_task_opt", true));
        LIZ().storeInt("live_sdk_start_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "live_sdk_start_opt", true));
        LIZ().storeInt("cold_boot_request_sparse_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "cold_boot_request_sparse_opt", true));
        LIZ().storeInt("ibe_preload_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "ibe_preload_opt", true));
        LIZ().storeInt("lighten_display_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "lighten_display_opt", true));
        LIZ().storeInt("start_up_memory_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "start_up_memory_opt", true));
        LIZ().storeInt("slide_memory_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "slide_memory_opt", true));
        LIZ().storeInt("network_common_params_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "network_common_params_opt", true));
        LIZ().storeInt("scalpel_runnable_V1", C0C64.LJIILLIIL().LJIJ(31744, 0, "scalpel_runnable_V1", true));
        LIZ().storeInt("helios_logcat_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "helios_logcat_opt", true));
        Keva kevaLIZ4 = LIZ();
        C0A2C.LIZ.getClass();
        kevaLIZ4.storeInt("kin_ship_task_opt", ((INewUserDefaultGroup) ServiceManager.get().getService(INewUserDefaultGroup.class)).LIZJ() ? 3 : C0C64.LJIILLIIL().LJIJ(31744, 0, "kin_ship_task_opt", true));
        Keva kevaLIZ5 = LIZ();
        C0A2D.LIZ.getClass();
        kevaLIZ5.storeInt("keva_and_ab_preload_delay", ((INewUserDefaultGroup) ServiceManager.get().getService(INewUserDefaultGroup.class)).LIZJ() ? 7 : C0C64.LJIILLIIL().LJIJ(31744, 0, "keva_and_ab_preload_delay", true));
        Keva kevaLIZ6 = LIZ();
        C1856007Os.LIZ.getClass();
        kevaLIZ6.storeInt("hybridkit_config_refactor_opt", ((INewUserDefaultGroup) ServiceManager.get().getService(INewUserDefaultGroup.class)).LIZJ() ? -1 : C0C64.LJIILLIIL().LJIJ(31744, 0, "hybridkit_config_refactor_opt", true));
        Keva kevaLIZ7 = LIZ();
        C07OR.LIZ.getClass();
        kevaLIZ7.storeInt("init_avmodule_refactor_opt", ((INewUserDefaultGroup) ServiceManager.get().getService(INewUserDefaultGroup.class)).LIZJ() ? -1 : C0C64.LJIILLIIL().LJIJ(31744, 0, "init_avmodule_refactor_opt", true));
        String str = C1940407is.LIZ;
        k kVar = (k) C0C64.LJIILLIIL().LJJII(h.class, null, "idle_list", true);
        if (kVar != null) {
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeString("idle_list", kVar.toString());
        }
        String str2 = C1940507it.LIZ;
        k kVar2 = (k) C0C64.LJIILLIIL().LJJII(h.class, null, "app_background_list", true);
        if (kVar2 != null) {
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeString("app_background_list", kVar2.toString());
        }
        HashSet<String> hashSet = C1487405s0.LIZ;
        k kVar3 = (k) C0C64.LJIILLIIL().LJJII(h.class, null, "real_idle_list", true);
        if (kVar3 != null) {
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeString("real_idle_list", kVar3.toString());
        }
        int i = C2504609rg.LIZ;
        k kVar4 = (k) C0C64.LJIILLIIL().LJJII(h.class, null, "first_brush_downgrade_whitelist", true);
        if (kVar4 != null) {
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeString("first_brush_downgrade_whitelist", kVar4.toString());
        }
        String str3 = C2504309rd.LIZ;
        k kVar5 = (k) C0C64.LJIILLIIL().LJJII(h.class, null, "cold_boot_request_sparse_set", true);
        if (kVar5 != null) {
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeString("cold_boot_request_sparse_set", kVar5.toString());
        }
        String str4 = C1483905rR.LIZ;
        k kVar6 = (k) C0C64.LJIILLIIL().LJJII(h.class, null, "shoot_high_priority_request_set", true);
        if (kVar6 != null) {
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeString("shoot_high_priority_request_set", kVar6.toString());
        }
        String str5 = C2504509rf.LIZ;
        k kVar7 = (k) C0C64.LJIILLIIL().LJJII(h.class, null, "broadcast_low_priority_request_set", true);
        if (kVar7 != null) {
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeString("broadcast_low_priority_request_set", kVar7.toString());
        }
        String str6 = C1940607iu.LIZ;
        k kVar8 = (k) C0C64.LJIILLIIL().LJJII(h.class, null, "legotask_kinship_downgrade", true);
        if (kVar8 != null) {
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeString("legotask_kinship_downgrade", kVar8.toString());
        }
        String str7 = C2046107zv.LIZ;
        k kVar9 = (k) SettingsManager.LIZLLL().LJIIIIZZ("recommend_score_list", h.class, null);
        if (kVar9 != null) {
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeString("recommend_score_list", kVar9.toString());
        }
        String str8 = C303020BuG.LIZ;
        try {
            n nVar = (n) SettingsManager.LIZLLL().LJIIIIZZ("vod_feature_map", n.class, null);
            if (nVar != null) {
                Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeString("vod_feature_map", nVar.toString());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "vod_feature_map");
        }
        String str9 = C2504209rc.LIZ;
        try {
            n nVar2 = (n) SettingsManager.LIZLLL().LJIIIIZZ("client_ai_stub_map", n.class, null);
            if (nVar2 != null) {
                Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeString("client_ai_stub_map", nVar2.toString());
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1AF0.LJFF(e2, "client_ai_crash");
        }
        String str10 = C2504409re.LIZ;
        k kVar10 = (k) SettingsManager.LIZLLL().LJIIIIZZ("search_recommend_score_list", h.class, null);
        if (kVar10 != null) {
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeString("search_recommend_score_list", kVar10.toString());
        }
        ((Keva) LIZJ.getValue()).storeInt("push_start_opt_strategy", C0C64.LJIILLIIL().LJIJ(31744, 5, "push_start_opt_strategy", true));
    }
}
