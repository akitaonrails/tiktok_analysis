package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.data.HybridAbLimitTrackConfigModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CR3, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CR3 {
    public static String LJII;
    public static boolean LJIIIZ;
    public static final C0CR3 LIZ = new C0CR3();
    public static final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public static int LIZJ = 1;
    public static final Set<String> LIZLLL = new LinkedHashSet();
    public static final Set<String> LJ = new LinkedHashSet();
    public static final Set<String> LJFF = new LinkedHashSet();
    public static final Set<String> LJI = new LinkedHashSet();
    public static final INetworkStateService LJIIIIZZ = (INetworkStateService) ServiceManager.get().getService(INetworkStateService.class);

    public static void LIZJ() {
        long j = C1150504el.LIZ().LJJIII;
        long jElapsedRealtime = j > 0 ? SystemClock.elapsedRealtime() - j : -1L;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C312840COc.LIZ.getClass();
        c2344009Gk.LIZJ(C312840COc.LIZIZ() ? 1 : 0, "is_cold_start_first_launch");
        c2344009Gk.LIZLLL(jElapsedRealtime, "duration_from_start");
        Set<String> set = LIZLLL;
        c2344009Gk.LJIIIIZZ("delivered_vids", set.toString());
        c2344009Gk.LIZJ(set.size(), "delivered_vids_cnt");
        Set<String> set2 = LJ;
        c2344009Gk.LJIIIIZZ("f_delivered_vids", set2.toString());
        c2344009Gk.LIZJ(set2.size(), "f_delivered_vids_cnt");
        Set<String> set3 = LJFF;
        c2344009Gk.LJIIIIZZ("f_append_vids", set3.toString());
        c2344009Gk.LIZJ(set3.size(), "f_append_vids_cnt");
        Set<String> set4 = LJI;
        c2344009Gk.LJIIIIZZ("f_unappend_vids", set4.toString());
        c2344009Gk.LIZJ(set4.size(), "f_unappend_vids_cnt");
        c2344009Gk.LJIIIIZZ("logid", LJII);
        LIZ("hybrid_ab_flow_track_full", c2344009Gk.LIZ);
    }

    public static void LIZ(String str, Map map) {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        HybridAbLimitTrackConfigModel hybridAbLimitTrackConfigModel = C0CR8.LIZ;
        HybridAbLimitTrackConfigModel hybridAbLimitTrackConfigModel2 = (HybridAbLimitTrackConfigModel) settingsManagerLIZLLL.LJIIIIZZ("hybrid_ab_limit_track_config", HybridAbLimitTrackConfigModel.class, hybridAbLimitTrackConfigModel);
        if (hybridAbLimitTrackConfigModel2 != null) {
            hybridAbLimitTrackConfigModel = hybridAbLimitTrackConfigModel2;
        }
        if (hybridAbLimitTrackConfigModel.limitTrackEnable) {
            if (hybridAbLimitTrackConfigModel.limitTrackEvent.contains(str)) {
                return;
            }
            if (Intrinsics.LJFF(str, "hybrid_ab_flow_track_precise")) {
                if (C13LP.LJJJJ(((HashMap) map).get("p_key"), hybridAbLimitTrackConfigModel.limitPreciseExposureKey)) {
                    return;
                }
            }
        }
        C20684815ws.LJIILLIIL(str, map);
    }

    public static void LIZIZ(String str, String str2, String str3, boolean z) {
        long jElapsedRealtime;
        ConcurrentHashMap<String, String> concurrentHashMap = LIZIZ;
        if (Intrinsics.LJFF(concurrentHashMap.get(str2), str)) {
            return;
        }
        concurrentHashMap.put(str2, str);
        long j = C1150504el.LIZ().LJJIII;
        if (j > 0) {
            jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        } else {
            jElapsedRealtime = -1;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        C312840COc.LIZ.getClass();
        c2344009Gk.LIZJ(C312840COc.LIZIZ() ? 1 : 0, "is_cold_start_first_launch");
        c2344009Gk.LIZLLL(jElapsedRealtime, "duration_from_start");
        c2344009Gk.LJIIIIZZ("p_key", str2);
        c2344009Gk.LJIIIIZZ("p_vid", str3);
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        c2344009Gk.LJIIIIZZ("logid", LJII);
        if (Intrinsics.LJFF(str, "time_out")) {
            c2344009Gk.LIZJ(z ? 1 : 0, "stable");
        }
        LIZ("hybrid_ab_flow_track_precise", c2344009Gk.LIZ);
    }

    public static void LIZLLL(long j, int i, String str, String str2, boolean z) {
        long jElapsedRealtime;
        long j2 = C1150504el.LIZ().LJJIII;
        if (j2 > 0) {
            jElapsedRealtime = SystemClock.elapsedRealtime() - j2;
        } else {
            jElapsedRealtime = -1;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LIZLLL(SystemClock.elapsedRealtime() - j, "req_duration");
        C312840COc.LIZ.getClass();
        c2344009Gk.LIZJ(C312840COc.LIZIZ() ? 1 : 0, "is_cold_start_first_launch");
        int i2 = 1;
        c2344009Gk.LIZJ(!TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId()) ? 1 : 0, "is_did_ready");
        c2344009Gk.LIZJ(LIZJ, "is_in_nuj_process");
        c2344009Gk.LIZLLL(jElapsedRealtime, "from_start_to_current_duration");
        c2344009Gk.LJIIIIZZ("feature_name", str);
        c2344009Gk.LJIIIIZZ("error_message", str2);
        c2344009Gk.LIZJ(z ? 1 : 0, "is_from_network_change");
        c2344009Gk.LIZJ(C2214201BlK.LJIIJJI ? 1 : 0, "is_app_background");
        c2344009Gk.LIZJ(LJIIIIZZ.getNetworkStatus().ordinal(), "network_status");
        Set<String> set = LJI;
        if (set.size() != 0) {
            i2 = 0;
        }
        c2344009Gk.LIZJ(i2, "full_exposure");
        c2344009Gk.LJIIIIZZ("logid", LJII);
        LIZ("hybrid_ab_api_req_recv", c2344009Gk.LIZ);
        if (set.size() != 0 && ((Boolean) C0CR6.LIZ.getValue()).booleanValue()) {
            if (C0CR6.LIZIZ) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0CRE(null), 3);
            } else {
                LIZJ();
            }
        }
    }

    public static void LJ(C0CR3 c0cr3, String str, String str2, String str3, boolean z, int i) {
        boolean z2 = z;
        String str4 = str3;
        if ((i & 4) != 0) {
            str4 = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        c0cr3.getClass();
        if (((Boolean) C0CR6.LIZ.getValue()).booleanValue()) {
            if (C0CR6.LIZIZ) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0CRD(str, str2, str4, z2, null), 3);
            } else {
                LIZIZ(str, str2, str4, z2);
            }
        }
    }
}
