package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.statisticlogger.experiment.AppLogEventFilterDelayExperiment;
import com.bytedance.pumbaa.utility.settings.PerformanceExprSwitchConfig;
import com.bytedance.pumbaa.utility.settings.SystemApiPerfOptConfigV1;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.experiment.GsonTypeAdapterOpt;
import com.ss.android.ugc.aweme.experiment.ThreadConvergenceAB;

/* JADX INFO: renamed from: X.0BEC, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0BEC {
    public static boolean LIZLLL() {
        int i = Build.VERSION.SDK_INT;
        return i >= 31 && i <= C2116408Qw.LIZ(34, "cold_boot_disable_verify_apex_max_version", false);
    }

    public static void LJII() {
        boolean zLIZ;
        String strLJIILL;
        C2439109h7.LIZJ = C0C64.LJIILLIIL().LJIIIZ(31744, "fly_main_color_support_argb_8888", true, false);
        C1389890mGx.LJFF = C0C64.LJIILLIIL().LJIJ(31744, 0, "tux_toast_upgrade", true);
        SharedPreferences.Editor editorPutInt = C08Q0.LJFF(C1BWL.LIZ()).edit().putBoolean("optimize_cold_boot_hook_app_context", C284770BEd.LIZ).putInt("HIGH_FREQ_FUNC_OPT", C0C64.LJIILLIIL().LJIJ(31744, 0, "high_freq_func_cache_value", true)).putInt("net_func_opt_ab", C0C64.LJIILLIIL().LJIJ(31744, 0, "net_func_opt_ab", true)).putBoolean("photomode_cold_boot_event_track_opt_v4110", ((Number) C18170079s.LIZ.getValue()).intValue() == 1).putInt("GSON_OPT", C0C64.LJIILLIIL().LJIJ(31744, 0, "gson_reflect_opt", true)).putInt("GSON_INNER_OPT", C0C64.LJIILLIIL().LJIJ(31744, 0, "gson_inner_opt_config", true)).putInt("TTNET_INIT_OPT", C0C64.LJIILLIIL().LJIJ(31744, 0, "ttnet_init_opt", true)).putBoolean("gson_instance_reuse", C0C64.LJIILLIIL().LJIIIZ(31744, "gson_instance_reuse_opt", true, false)).putBoolean("KEY_GSON_MONITOR", C0C64.LJIILLIIL().LJIIIZ(31744, "json_monitor_config", true, false)).putInt("GSON_MAIN_THREAD_CONFIG", C0C64.LJIILLIIL().LJIJ(31744, 5, "json_main_cost", true)).putInt("GSON_SUB_THREAD_CONFIG", C0C64.LJIILLIIL().LJIJ(31744, 50, "json_sub_cost", true)).putBoolean("optimize_initkeva_v2", C0BE9.LIZ).putBoolean("optimize_kevaio", C0BEA.LIZ).putBoolean("optimize_loadabrepo_v2", C1833907Gf.LIZ).putBoolean("load_so_main_process_opt", C1833707Gd.LIZ).putBoolean("optimize_asyncpreload", C0BEX.LIZ).putBoolean("optimize_kevasp", C1250404us.LIZ).putInt("key_idle_loadso", C0C64.LJIILLIIL().LJIJ(31744, 0, "key_idle_loadso", true)).putInt("resaltas_collect_load_so_event", C0C64.LJIILLIIL().LJIJ(31744, 0, "resaltas_collect_load_so_event", true)).putInt("resaltas_collect_load_so_event_sample_rate", C0C64.LJIILLIIL().LJIJ(31744, 50, "resaltas_collect_load_so_event_sample_rate", true)).putInt("ab_resaltas_event", C0C64.LJIILLIIL().LJIJ(31744, 0, "ab_resaltas_event", true)).putBoolean("open_switch_to_bdtrakcer", C0C64.LJIILLIIL().LJIIIZ(31744, "open_switch_to_bdtrakcer", true, true)).putBoolean("bdtracker_migrate_old_log", C0C64.LJIILLIIL().LJIIIZ(31744, "bdtracker_migrate_old_log", true, false)).putBoolean("optimize_apprefactor", ((Boolean) C0BEI.LIZ.getValue()).booleanValue()).putBoolean("optimize_npthsample", ((Boolean) C073V.LIZ.getValue()).booleanValue()).putBoolean("optimize_npthternimate_v3", ((Boolean) C073W.LIZ.getValue()).booleanValue()).putBoolean("optimize_npthinit", ((Boolean) C073Y.LIZ.getValue()).booleanValue()).putBoolean("optimize_oppo_crash_upload", ((Boolean) C284850BEl.LIZ.getValue()).booleanValue()).putInt("open_keva_load_optimized_2", C0C64.LJIILLIIL().LJIJ(31744, 0, "open_keva_load_optimized_2", true)).putBoolean("open_release_java_memory_key_2", C0C64.LJIILLIIL().LJIIIZ(31744, "open_release_java_memory_key_2", true, false)).putBoolean("open_release_native_memory_key_2", C0C64.LJIILLIIL().LJIIIZ(31744, "open_release_native_memory_key_2", true, false)).putInt("clean_interval_time_2", C0C64.LJIILLIIL().LJIJ(31744, Integer.MAX_VALUE, "clean_interval_time_2", true)).putInt("cache_expiration_time_2", C0C64.LJIILLIIL().LJIJ(31744, Integer.MAX_VALUE, "cache_expiration_time_2", true)).putInt("open_keva_multi_process_optimized", C0C64.LJIILLIIL().LJIJ(31744, 0, "open_keva_multi_process_optimized", true)).putInt("gc_block_max_duration_key", C0C64.LJIILLIIL().LJIJ(31744, -1, "gc_block_max_duration_key", true)).putInt("gc_block_heap_limit_mb", C0C64.LJIILLIIL().LJIJ(31744, -1, "gc_block_heap_limit_mb", true)).putBoolean("gc_block_heap_disable", C0C64.LJIILLIIL().LJIIIZ(31744, "gc_block_heap_disable", true, false)).putBoolean("gc_block_support_apex", C0C64.LJIILLIIL().LJIIIZ(31744, "gc_block_support_apex", true, false)).putInt("less_madvise_opt_config_mode", C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 2, "less_madvise_opt_config_mode", true)).putString("less_madvise_opt_files", C0C64.LJIILLIIL().LJIL(31744, 2, "less_madvise_opt_files", "", true)).putBoolean("open_psp_init_task", C0C64.LJIILLIIL().LJIIIZ(31744, "open_psp_init_task", true, false)).putBoolean("ab_erase_opt", C1833807Ge.LIZ).putBoolean("optimize_transformtasks", ((Boolean) C0BEK.LIZ.getValue()).booleanValue()).putBoolean("pns_slardar_route_opt_enable_boot", C0BEG.LIZ).putBoolean("pns_slardar_route_opt_enable_ttnet", C0BEG.LIZIZ).putInt("coldboot_eglinit_fix", C0BEH.LIZ).putInt("coldboot_nativelib_report_port", C0BEH.LIZIZ).putInt("opt_apm_data_pipeline_cache_size", C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 2, "opt_apm_data_pipeline_cache_size", true)).putInt("sandbox_sdk_launch_refactor", C0C64.LJIILLIIL().LJIJ(31744, 1, "sandbox_sdk_launch_refactor", true)).putInt("sandbox_sdk_enable", C0C64.LJIILLIIL().LJIJ(31744, 0, "sandbox_sdk_enable", true)).putInt("pns_sandbox_config", C0C64.LJIILLIIL().LJIJ(31744, 0, "pns_sandbox_config", true)).putString("sandbox_rules_experiment_group", C0C64.LJIILLIIL().LJJ(31744, "sandbox_rules_experiment_group", "default", true)).putInt("control_sandbox_pumbaa_network_aspect", C0C64.LJIILLIIL().LJIJ(31744, 0, "control_sandbox_pumbaa_network_aspect", true)).putInt("control_sandbox_wrapper_pre_load_so", C0C64.LJIILLIIL().LJIJ(31744, 0, "control_sandbox_wrapper_pre_load_so", true)).putInt("pns_sandbox_sampling_rate", C0C64.LJIILLIIL().LJIJ(31744, 0, "pns_sandbox_sampling_rate", true)).putInt("pns_socket_aspect_switch", C0C64.LJIILLIIL().LJIJ(31744, 0, "pns_socket_aspect_switch", true)).putInt("pns_socket_sampling_rate", C0C64.LJIILLIIL().LJIJ(31744, 100, "pns_socket_sampling_rate", true));
        try {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("pns_bpea_sandbox_switch", true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            zLIZ = true;
        }
        SharedPreferences.Editor editorPutBoolean = editorPutInt.putBoolean("pns_bpea_sandbox_switch", zLIZ);
        PerformanceExprSwitchConfig performanceExprSwitchConfig = C284780BEe.LIZ;
        PerformanceExprSwitchConfig performanceExprSwitchConfig2 = (PerformanceExprSwitchConfig) C308480C7i.LIZLLL(PerformanceExprSwitchConfig.class, "pumbaa_performance_expr_switch", performanceExprSwitchConfig);
        if (performanceExprSwitchConfig2 != null) {
            performanceExprSwitchConfig = performanceExprSwitchConfig2;
        }
        long j = performanceExprSwitchConfig.globalInitEnable ? 1L : 0L;
        if (performanceExprSwitchConfig.hybridEnable) {
            j |= 2;
        }
        if (performanceExprSwitchConfig.networkEnable) {
            j |= 4;
        }
        if (performanceExprSwitchConfig.systemApiEnable) {
            j |= 8;
        }
        if (performanceExprSwitchConfig.apiCacheEnable) {
            j |= 16;
        }
        if (performanceExprSwitchConfig.systemApiOldEnable) {
            j |= 32;
        }
        if (performanceExprSwitchConfig.engineEnable) {
            j |= 64;
        }
        if (performanceExprSwitchConfig.bpeaEnable) {
            j |= 128;
        }
        if (performanceExprSwitchConfig.pdpEnable) {
            j |= 256;
        }
        if (performanceExprSwitchConfig.sdkEnable) {
            j |= 512;
        }
        if (performanceExprSwitchConfig.utilityEnable) {
            j |= 1024;
        }
        if (performanceExprSwitchConfig.app2appEnable) {
            j |= 2048;
        }
        if (performanceExprSwitchConfig.userInputEnable) {
            j |= 4096;
        }
        if (performanceExprSwitchConfig.permissionPopUpEnable) {
            j |= 8192;
        }
        SharedPreferences.Editor editorPutLong = editorPutBoolean.putLong("PumbaaPerfExprMask", j);
        SystemApiPerfOptConfigV1 systemApiPerfOptConfigV1 = C1229704rX.LIZ;
        SystemApiPerfOptConfigV1 systemApiPerfOptConfigV12 = (SystemApiPerfOptConfigV1) C308480C7i.LIZLLL(SystemApiPerfOptConfigV1.class, "pumbaa_system_api_perf_opt_v1", systemApiPerfOptConfigV1);
        if (systemApiPerfOptConfigV12 != null) {
            systemApiPerfOptConfigV1 = systemApiPerfOptConfigV12;
        }
        long j2 = systemApiPerfOptConfigV1.hookOptEnable ? 1L : 0L;
        if (systemApiPerfOptConfigV1.bpeaOptEnable) {
            j2 |= 2;
        }
        SharedPreferences.Editor editorPutInt2 = editorPutLong.putLong("PumbaaSysOptMask", j2).putInt("bd_btm_sdk_switch_v3", C0C59.LJ().LJI("bd_btm_sdk_switch_v3", 3, true));
        new Object() { // from class: X.0BF6
        }.getClass();
        SharedPreferences.Editor editorPutBoolean2 = editorPutInt2.putBoolean("open_network_bcm_chain_backup", C0C59.LJ().LIZIZ("open_network_bcm_chain_backup", true, true)).putBoolean("optimize_anr_filter_low_memory", ((Boolean) C284910BEr.LIZ.getValue()).booleanValue()).putBoolean("npth_intercept_sigquit", ((Boolean) C284950BEv.LIZ.getValue()).booleanValue()).putBoolean("opt_npth_dump_stack", ((Boolean) C284940BEu.LIZ.getValue()).booleanValue()).putBoolean("anrthanos_start_reason", C0C64.LJIILLIIL().LJIIIZ(31744, "anrthanos_start_reason", true, false)).putInt("anropt_start_broadcast_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "anropt_start_broadcast_opt", true)).putBoolean("get_thread_tid_opt", ((Boolean) C284790BEf.LIZ.getValue()).booleanValue()).putInt("anr_main_and_render_thread_opt", ((Number) C284880BEo.LIZ.getValue()).intValue()).putInt("enable_jato_priority_protect", C0BEP.LIZ).putInt("cache_settings_string", ((Number) C0BF1.LIZ.getValue()).intValue()).putInt("opt_settings_tostring_size", ((Number) C0BF0.LIZ.getValue()).intValue()).putInt("memory_compat_low_memory", ((Number) C1237904sr.LIZ.getValue()).intValue()).putBoolean("memory_process_quit_startup", ((Boolean) C284980BEy.LIZ.getValue()).booleanValue()).putInt("opt_gson_tostring_type", ((Number) C0BF3.LIZ.getValue()).intValue()).putBoolean("opt_gson_tostring_region", ((Boolean) C0BEN.LIZ.getValue()).booleanValue()).putBoolean("coroutine_exception_opt", ((Boolean) C1238204su.LIZ.getValue()).booleanValue()).putBoolean("kotlin_lambda_tostring_opt", ((Boolean) C1238104st.LIZ.getValue()).booleanValue()).putInt("global_io_executor_max", ((Number) C1238004ss.LIZ.getValue()).intValue()).putLong("global_io_executor_reset_delay", ((Number) C0BEM.LIZ.getValue()).longValue()).putInt("fix_librarian_empty_apks", ((Number) C284990BEz.LIZ.getValue()).intValue()).putInt("cold_boot_message_monitor_exp", ((Number) C285360BGk.LIZ.getValue()).intValue()).putBoolean("enable_process_start_event", ((Boolean) C0BEL.LIZ.getValue()).booleanValue()).putInt("precise_exposure_strategy", C0BEZ.LIZ).putInt("ab_precise_exposure_repo_version", InterfaceC284740BEa.LIZ).putBoolean("optimize_preloadnpthso", C0BEB.LIZ).putBoolean("optimize_preload_keva_v2", C0BET.LIZ).putBoolean("cold_boot_ab_repo_merge_opt", ((Boolean) C1219004po.LIZ.getValue()).booleanValue()).putBoolean("fix_lego_init_crash", ((Boolean) C1219104pp.LIZ.getValue()).booleanValue());
        String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "milo_schedule_task_exp", "", true);
        SharedPreferences.Editor editorPutLong2 = editorPutBoolean2.putString("milo_schedule_task_exp", strLJJ != null ? strLJJ : "").putBoolean("preload_ab_setting_creative_exp", C0C64.LJIILLIIL().LJIIIZ(31744, "preload_ab_setting_creative_exp", true, false)).putBoolean("nx_reword_open_log_cat", C0C64.LJIILLIIL().LJIIIZ(31744, "nx_reword_open_log_cat", true, true)).putBoolean("nx_reword_open_offline_nx_string", C0C64.LJIILLIIL().LJIIIZ(31744, "nx_reword_open_offline_nx_string", true, true)).putBoolean("npth_open_leak_object", ((Boolean) C284810BEh.LIZ.getValue()).booleanValue()).putBoolean("npth_open_looper_monitor", ((Boolean) C284830BEj.LIZ.getValue()).booleanValue()).putInt("npth_open_looper_mode_monitor", ((Number) C284820BEi.LIZ.getValue()).intValue()).putInt("locale_match_automatically", C0C64.LJIILLIIL().LJIJ(31744, 0, "locale_match_automatically", true)).putBoolean("anr_monitor_opt_ignore_anrinfo", ((Boolean) C284900BEq.LIZ.getValue()).booleanValue()).putBoolean("npth_async_dump", ((Boolean) C284920BEs.LIZ.getValue()).booleanValue()).putBoolean("npth_open_block_monitor", ((Boolean) C284930BEt.LIZ.getValue()).booleanValue()).putBoolean("ffd_perf_monitor_ab", ((Boolean) C284960BEw.LIZ.getValue()).booleanValue()).putBoolean("optimize_appmonitor_v2", ((Boolean) C284800BEg.LIZ.getValue()).booleanValue()).putBoolean("opt_ab_multi_process_java_cache", C0C64.LJIILLIIL().LJIIIZ(31744, "opt_ab_multi_process_java_cache", true, false)).putBoolean("abmock_io_opt_ab_get_value", C0C64.LJIILLIIL().LJIIIZ(31744, "abmock_io_opt_ab_get_value", true, false)).putBoolean("ab_record_vid_keva_multi_process_cache_opt", C0C64.LJIILLIIL().LJIIIZ(31744, "ab_record_vid_keva_multi_process_cache_opt", true, false)).putInt("memory_biz_exception_type", ((Number) C284840BEk.LIZ.getValue()).intValue()).putLong("ab_record_vid_delay_start_time_ms_opt", C0C64.LJIILLIIL().LJIJJLI(31744, 0L, "ab_record_vid_delay_start_time_ms_opt", true)).putInt("4040_keva_sync_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "4040_keva_sync_opt", true)).putInt("4290_keva_sync_global_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "4290_keva_sync_global_opt", true)).putInt("4040_thread_priority_adjust_opt", C0C64.LJIILLIIL().LJIJ(31744, 0, "4040_thread_priority_adjust_opt", true)).putBoolean("cold_bg_anr_opt", C08DI.LIZ).putBoolean("milo_delegate_all_boot_finish_task_exp", ((Boolean) C1831307Ff.LIZ.getValue()).booleanValue()).putBoolean("milo_task_boot_finish_preload_exp", ((Boolean) C1831407Fg.LIZ.getValue()).booleanValue()).putString("milo_task_opt_list", (String) C0BEO.LIZ.getValue()).putBoolean("opt_abmock_enable_lazy_init", ((Boolean) C284870BEn.LIZ.getValue()).booleanValue()).putBoolean("ab_instance_anr_opt", C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "ab_instance_anr_opt", true, false)).putInt("optimize_i18n", C0C64.LJIILLIIL().LJIJ(31744, 0, "optimize_i18n", true)).putBoolean("optimize_keva_sp_lazy_init", C0BEY.LIZ).putBoolean("is_ab_exposure_vid_check_enabled", ((Boolean) C284970BEx.LIZ.getValue()).booleanValue()).putInt("GSON_OPT_AB_V2", C0C64.LJIILLIIL().LJIJ(31744, 0, "gson_opt_ab_v2", true)).putInt("OBJ_CACHE_POOL_SIZE_AB", C0C64.LJIILLIIL().LJIJ(31744, 6405, "obj_cache_pool_size_ab", true)).putBoolean("startup_state_utils_migrate_opt", ((Boolean) C1219304pr.LIZ.getValue()).booleanValue()).putString("downgrade_ability_config_string", (String) C312410CMl.LIZIZ.getValue()).putBoolean("downgrade_ability_string_switch", ((Boolean) C1218904pn.LIZ.getValue()).booleanValue()).putInt("downgrade_ability_performance_opt", ((Number) C1221004q8.LIZ.getValue()).intValue()).putInt("Horae_Thread_Nice_AB", C0C64.LJIILLIIL().LJIJ(31744, 100, "Horae_Thread_Nice_AB", true)).putLong(AppLogEventFilterDelayExperiment.KEY, AppLogEventFilterDelayExperiment.INSTANCE.getValue());
        GsonTypeAdapterOpt gsonTypeAdapterOpt = C09CD.LIZ;
        try {
            strLJIILL = new Gson().LJIILL((GsonTypeAdapterOpt) C0C64.LJIILLIIL().LJJII(GsonTypeAdapterOpt.class, C09CD.LIZ, "gson_opt_reflect_opt3", true));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        if (strLJIILL == null) {
            strLJIILL = "";
        }
        SharedPreferences.Editor editorPutInt3 = editorPutLong2.putString("gson_opt_reflect_opt3", strLJIILL).putBoolean("enable_layer_1_absettings", ((Boolean) C0BEJ.LIZ.getValue()).booleanValue()).putBoolean("enable_layer_1_network", ((Boolean) C284860BEm.LIZ.getValue()).booleanValue()).putBoolean("keva_thread_priority_opt", C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "keva_thread_priority_opt", true, false)).putInt("keva_thread_priority_value_ab", C0C64.LJIILLIIL().LJIIZILJ(31744, 100, 2, "keva_thread_priority_value_ab", true));
        SettingsManager.LIZLLL().getClass();
        SharedPreferences.Editor editorPutInt4 = editorPutInt3.putInt("sdk_abmock_monitor_sample", SettingsManager.LJ("sdk_abmock_monitor_sample", 10));
        SettingsManager.LIZLLL().getClass();
        editorPutInt4.putInt("sdk_abmock_error_report_sample", SettingsManager.LJ("sdk_abmock_error_report_sample", 10)).putBoolean("use_new_lego", C284750BEb.LIZ).putBoolean("resource_psi_enabled", C0C64.LJIILLIIL().LJIIIZ(31744, "resource_psi_enabled", true, false)).putBoolean("resource_psi_gc_union_enabled", C0C64.LJIILLIIL().LJIIIZ(31744, "resource_psi_gc_union_enabled", true, false)).putBoolean("resource_psi_background_enabled", C0C64.LJIILLIIL().LJIIIZ(31744, "resource_psi_background_enabled", true, false)).putBoolean("cpu_sched_sampling", C0BER.LIZ).putLong("cpu_sched_sample_interval", C0BEQ.LIZ).putBoolean("bootfinish_migrate_phase_one", ((Boolean) C1223204qU.LIZIZ.getValue()).booleanValue()).putBoolean("bootfinish_migrate_fix_invoke_timing", ((Boolean) C1219404ps.LIZIZ.getValue()).booleanValue()).putBoolean("load_so_fallback_ab", ((Boolean) C1225404qq.LIZ.getValue()).booleanValue()).putBoolean("fix_librarian_init_apks", ((Boolean) C1223504qX.LIZ.getValue()).booleanValue()).putBoolean("newlego_enable_startup_engine", C0BEW.LIZ).putBoolean("newlego_migrate_core", C0BEU.LIZ).putBoolean("push_startup_reason_optimize", C0BEV.LIZ).putBoolean("newlego_migrate_attach", C0BES.LIZ).putBoolean("cold_boot_lazy_handlerthread_opt_4560", C284760BEc.LIZ).apply();
        ThreadConvergenceAB.LIZ.getClass();
        C08Q0.LJFF(C1BWL.LIZ()).edit().putInt("thread_convergence_type_ab", C0C64.LJIILLIIL().LJIJ(31744, 0, "thread_convergence_type_ab", true)).putInt("thread_convergence_count_ab", C0C64.LJIILLIIL().LJIJ(31744, 65584, "thread_convergence_count_ab", true)).putLong("thread_dredge_interval_ab", C0C64.LJIILLIIL().LJIJJLI(31744, 10L, "thread_dredge_interval_ab", true)).putLong("thread_serious_block_ab", C0C64.LJIILLIIL().LJIJJLI(31744, 3000L, "thread_serious_block_ab", true)).putLong("thread_schedule_alive_ab", C0C64.LJIILLIIL().LJIJJLI(31744, 1000L, "thread_schedule_alive_ab", true)).apply();
        C2116408Qw.LIZJ("4530_app_init_preload_keep_stable_in_bg", C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "4530_app_init_preload_keep_stable_in_bg", true, false) ? 1 : 0);
        C2116408Qw.LIZJ("4580_push_process_schedule_group_promotion", C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 2, "4580_push_process_schedule_group_promotion", true));
    }

    public static boolean LIZ(Context context) {
        return C08Q0.LJ(context, "opt_gson_tostring_region", false);
    }

    public static boolean LIZIZ(Context context) {
        return C08Q0.LJ(context, "downgrade_ability_string_switch", false);
    }

    public static void LIZJ(Context context) {
        C08Q0.LJ(context, "anrthanos_start_reason", false);
    }

    public static boolean LJ(Context context) {
        return C08Q0.LJ(context, "enable_layer_1_absettings", false);
    }

    public static boolean LJFF(Context context) {
        return C08Q0.LJ(context, "optimize_transformtasks", false);
    }

    public static boolean LJI(Context context) {
        return C08Q0.LJ(context, "use_new_lego", false);
    }
}
