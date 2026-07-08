package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi;
import com.ss.android.ugc.aweme.plugin.IPluginService;

/* JADX INFO: renamed from: X.10UB, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10UB {
    public static final C10UB LIZ = new C10UB();

    public static String LIZ() {
        IPluginService.ReinstallCheck deviceCheckResult;
        IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        return String.valueOf((iPluginService == null || (deviceCheckResult = iPluginService.getDeviceCheckResult()) == null) ? null : Integer.valueOf(deviceCheckResult.getValue()));
    }

    public static boolean LIZJ() {
        String strLIZJ;
        IAppsflyerApi iAppsflyerApi = (IAppsflyerApi) PluggableExtentionKt.pluggableSpi$default(IAppsflyerApi.class, false, false, false, 14, null);
        return (iAppsflyerApi == null || (strLIZJ = iAppsflyerApi.LIZJ()) == null || strLIZJ.length() <= 0) ? false : true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int LIZIZ(String str) {
        IDeepLinkService iDeepLinkService;
        IDeepLinkService iDeepLinkService2;
        IDeepLinkService iDeepLinkService3;
        IDeepLinkService iDeepLinkService4;
        switch (str.hashCode()) {
            case -963885357:
                if (!str.equals("active_days_record_switch")) {
                    return 0;
                }
                if (C0TKA.LJI) {
                    return C0C64.LJIILLIIL().LJIJ(31744, 1, "active_days_record_switch", true);
                }
                return -1;
            case -720326856:
                if (str.equals("short_to_long_link_cache_save_enable_v4") && (iDeepLinkService4 = (IDeepLinkService) PluggableExtentionKt.pluggableSpi$default(IDeepLinkService.class, false, false, false, 14, null)) != null && iDeepLinkService4.LJJLIIIJILLIZJL()) {
                    return 1;
                }
                return 0;
            case -523607362:
                if (!str.equals("kmp_exception_report_switch")) {
                    return 0;
                }
                try {
                    return C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 1, "kmp_exception_report_switch", true);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return -1;
                }
            case -305111814:
                if (!str.equals("shortcut_entry_for_feed_refresh_low_active")) {
                    return 0;
                }
                C19249510Sn c19249510Sn = C19249510Sn.LIZ;
                if (C19249510Sn.LIZIZ == null) {
                    c19249510Sn.getClass();
                    C19249510Sn.LIZ();
                } else {
                    c19249510Sn.getClass();
                }
                Integer num = C19249510Sn.LIZIZ;
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            case -193202165:
                if (!str.equals("push_video_preload_read_ab")) {
                    return 0;
                }
                try {
                    return C0C64.LJIILLIIL().LJIJ(31744, 0, "push_video_preload_read_ab", true);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return -1;
                }
            case 599208644:
                if (!str.equals("push_video_preload_save_ab")) {
                    return 0;
                }
                try {
                    return C0C64.LJIILLIIL().LJIJ(31744, 0, "push_video_preload_save_ab", true);
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    return -1;
                }
            case 695817290:
                if (!str.equals("short_to_long_link_cache_opt_v4") || (iDeepLinkService3 = (IDeepLinkService) PluggableExtentionKt.pluggableSpi$default(IDeepLinkService.class, false, false, false, 14, null)) == null) {
                    return 0;
                }
                return iDeepLinkService3.LJJLIIIJL();
            case 1056788057:
                if (!str.equals("short_to_long_link_cache_max_time_limit_v4") || (iDeepLinkService2 = (IDeepLinkService) PluggableExtentionKt.pluggableSpi$default(IDeepLinkService.class, false, false, false, 14, null)) == null) {
                    return 0;
                }
                return (int) iDeepLinkService2.LJJIII();
            case 1428414089:
                if (!str.equals("short_to_long_link_cache_max_record_size_v4") || (iDeepLinkService = (IDeepLinkService) PluggableExtentionKt.pluggableSpi$default(IDeepLinkService.class, false, false, false, 14, null)) == null) {
                    return 0;
                }
                return iDeepLinkService.LJLIL();
            case 1461393058:
                if (!str.equals("shortcut_entry_for_feed_refresh_dnu")) {
                    return 0;
                }
                return ((Number) C10UC.LIZ.getValue()).intValue();
            default:
                return 0;
        }
    }
}
