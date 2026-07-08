package X;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.keva.KevaImpl;
import com.bytedance.keva.adapter.KevaSpFastAdapter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sp.SharedPreferencesManager;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0Vr7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C810670Vr7 {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static int LIZJ;
    public static File LJIIIIZZ;
    public static final HashSet<String> LIZLLL = new HashSet<>();
    public static final HashSet<String> LJ = new HashSet<>();
    public static final HashSet<String> LJFF = new HashSet<>();
    public static final String[] LJI = {"is_allow_oppo_push", "push_multi_process_config", "traffic_monitor_info", "applog_stats", "wschannel_multi_process_config", "device_register_migrate_detector", "com.ss.android.deviceregister.utils.Cdid", "rec_user", "ab_test_mock_config", "anr_monitor_table", "app_setting", "aweme-abtest-hooker", "gaid_sp_name", "google_ads_flags", "image_opt_table", "KEY_NEED_UPLOAD_LAUNCHLOG", "plugin_meta_data", "pref_registered_pkg_names", "push_setting", "ss_app_config", "ss_location", "test_setting", "update_params", "use_https", "XMPushServiceConfig", "MiniAppCookiePersistence", "tma_jssdk_info", "mini_app_storage", "appbrand_file", "share_setting_preference", "push_switch", "sync", "httpdns_config_cache", "sp_client_report_status", "effect_setting", "d_permit", "Alvin2", "ContextData", "pushConfig", "MainTabPreferences", "sp_download_info", "TTWebView_Json_Config_Manager", "TeenageModeSetting", "extra_group", "WebViewBytedancePrefs", "app_bundle_session_ids"};
    public static final List<Class> LJII = Arrays.asList(C2408809cE.class);
    public static final HashMap<String, Boolean> LJIIIZ = new HashMap<>();
    public static boolean LJIIJ = false;
    public static final AtomicBoolean LJIIJJI = new AtomicBoolean(false);

    public static File LIZ(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public static void LIZLLL(Context context) {
        if (LJIIJJI.compareAndSet(false, true)) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("keva_switch_repo", 0);
            LIZ = sharedPreferences.getBoolean("keva_switch", true);
            HashSet<String> hashSet = LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(context.getPackageName());
            sbLIZ.append("_preferences");
            hashSet.addAll(Arrays.asList("default_config", "awesome_splash", "splash_ad_sp", "ttnetCookieStore", "key_language_sp_key", "reliability_cold_boot_sp", "sp_dark_mode", "ttnet_store_region", "applog_stats", "aweme-app", "av_settings", "av_settings.xml", "ab_test_config", "abmock_debug_info", "aweme_user", "com.ss.spip_setting", "SP_EXPERIMENT_CACHE", "SP_CLIENT_EXPOSURE_CACHE", "SP_EXPERIMENT_EXPOSURE_CACHE", "CLIENT_EXPERIMENT_CACHE_TAG", C2188811AlT.LIZIZ(sbLIZ), "rhea.sp", "ttlive_tabs_cache", "ttlive_sdk_shared_pref_cache", "live_sdk_core", "WebViewChromiumPrefs", "KevaOptNewUser", "tablet_cache", "_debug_fragment_sp_switch_channel", "debug_config_mock", "tpc_sp", "prev_data_sp", "backup_count_sp", "open_audit_hook_sp", "open_audit_config", "open_audit_detect_mode", "audit_cross_stack", "privacybox_sample_rate", "privacybox_scene_tag", "privacybox_data_filter", "open_audit_task_manager", "open_audit_device_info"));
            hashSet.addAll(sharedPreferences.getStringSet("keva_blacklist", Collections.emptySet()));
            Set<String> stringSet = sharedPreferences.getStringSet("keva_migrate", Collections.emptySet());
            hashSet.removeAll(stringSet);
            LJ.addAll(stringSet);
            LJFF.addAll(Arrays.asList(LJI));
            if (LIZ) {
                LIZJ = new Random().nextInt(8);
            }
        }
    }

    public static SharedPreferences LIZIZ(Context context, int i, String str) {
        if (!TextUtils.equals("plugin_meta_data", str) && !TextUtils.equals("bmd_monitor", str) && !TextUtils.equals("multidex.version", str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(context.getPackageName());
            sbLIZ.append("_preferences");
            if (!TextUtils.equals(C2188811AlT.LIZIZ(sbLIZ), str)) {
                SharedPreferences sharedPreferences = SharedPreferencesManager.getInstance().getSharedPreferences(context, str);
                if (sharedPreferences != null) {
                    return sharedPreferences;
                }
                return context.getSharedPreferences(str, i);
            }
        }
        return context.getSharedPreferences(str, i);
    }

    public static SharedPreferences LIZJ(Context context, int i, String str) {
        boolean z;
        boolean zExists;
        if (LJIIJ) {
            LIZLLL(context);
        }
        if (context == null) {
            C844470XAv.LIZ.getClass();
            context = C844470XAv.LIZ();
        }
        boolean z2 = false;
        boolean z3 = true;
        if (LIZ && !LJII.contains(context.getClass()) && !LIZLLL.contains(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return LIZIZ(context, i, str);
        }
        if ((str.length() & 7) == LIZJ) {
            z2 = true;
        }
        if (!z2 && !KevaImpl.isRepoPorted(str)) {
            HashMap<String, Boolean> map = LJIIIZ;
            synchronized (map) {
                try {
                    Boolean bool = map.get(str);
                    if (bool != null) {
                        zExists = bool.booleanValue();
                    } else {
                        if (LJIIIIZZ == null) {
                            File fileLIZ = LIZ(context);
                            if (!fileLIZ.exists()) {
                                fileLIZ.mkdir();
                            }
                            LJIIIIZZ = new File(fileLIZ.getParent(), "shared_prefs");
                        }
                        File file = LJIIIIZZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        sbLIZ.append(".xml");
                        zExists = new File(file, C2188811AlT.LIZIZ(sbLIZ)).exists();
                        map.put(str, Boolean.valueOf(zExists));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (zExists) {
                return LIZIZ(context, i, str);
            }
        }
        if (LJFF.contains(str)) {
            i = 4;
        }
        boolean z4 = LIZIZ;
        if (!LJ.contains(str)) {
            z3 = z4;
        }
        return KevaSpFastAdapter.getSharedPreferences(context, str, i, z3);
    }
}
