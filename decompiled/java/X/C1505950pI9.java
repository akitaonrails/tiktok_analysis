package X;

import com.bytedance.scene.Scene;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.ecommerce.preloader.experiment.ECNetworkContextChangedMonitorConfig;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pI9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1505950pI9 {
    public static final int LIZ;

    static {
        Character chLJLLJ;
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
        LIZ = ((strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId == null || (chLJLLJ = C13LN.LJLLJ(0, strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId)) == null) ? '9' : chLJLLJ.charValue()) - '0';
    }

    public static boolean LJFF() {
        return LIZ <= ((Number) C269660AhY.LIZ.getValue()).intValue();
    }

    public static void LIZJ(long j, String str, String str2) {
        if (!LJFF()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("end_type", str);
        jSONObject.put("api_interceptor_dur", j);
        jSONObject.put("path", str2);
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZLLL("rd_tiktokec_common_interceptor_monitor", jSONObject);
    }

    public static void LJ(AbstractC2132008Ww abstractC2132008Ww, String str, String str2) throws JSONException {
        if (!LJFF()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stage", "end");
        jSONObject.put("end_type", str);
        jSONObject.put("msg", str2);
        jSONObject.put("execute_to_end_dur", abstractC2132008Ww.LJ() - abstractC2132008Ww.LIZJ());
        jSONObject.put("create_to_end_dur", abstractC2132008Ww.LJ() - abstractC2132008Ww.LJIIJ());
        jSONObject.put("count", abstractC2132008Ww.LJII());
        String strLJIIIZ = abstractC2132008Ww.LJIIIZ();
        String str3 = abstractC2132008Ww.LJFF().pageName;
        String str4 = "unknown";
        if (str3 == null) {
            str3 = "unknown";
        }
        String str5 = abstractC2132008Ww.LJFF().entryId;
        if (str5 == null) {
            str5 = "unknown";
        }
        String str6 = abstractC2132008Ww.LJFF().type;
        if (str6 != null) {
            str4 = str6;
        }
        LIZ(jSONObject, strLJIIIZ, str3, str5, str4, abstractC2132008Ww.LIZLLL());
    }

    public static void LIZIZ(JSONObject jSONObject, String str, boolean z, C1507990pLR c1507990pLR) throws JSONException {
        String str2;
        C1507890pLH c1507890pLHLIZ;
        String str3;
        jSONObject.put("task_id", str);
        jSONObject.put("page_name", c1507990pLR.LIZIZ);
        jSONObject.put(Scene.SCENE_SERVICE, c1507990pLR.LIZIZ);
        jSONObject.put("preload_type", c1507990pLR.LIZJ);
        jSONObject.put("preload_name", c1507990pLR.LIZ);
        jSONObject.put("btm_code", c1507990pLR.LJIIIZ);
        jSONObject.put("priority", c1507990pLR.LIZLLL);
        jSONObject.put("count", c1507990pLR.LJ);
        jSONObject.put("extra", c1507990pLR.LJIIJ);
        jSONObject.put("is_exempt_task", z);
        if (Intrinsics.LJFF(jSONObject.get("stage"), "end") && ((ECNetworkContextChangedMonitorConfig) C1504170pFH.LIZIZ.getValue()).isEnabled && (str2 = c1507990pLR.LJIIJJI) != null && (c1507890pLHLIZ = C1507890pLH.LIZJ.LIZ()) != null && (str3 = c1507890pLHLIZ.LIZIZ.LJIIJ) != null) {
            jSONObject.put("context_changed", !Intrinsics.LJFF(str2, str3));
        }
        if (C1506020pIG.LIZ()) {
            C1505940pI8 c1505940pI8 = C1505940pI8.LIZ;
            String str4 = (String) c1507990pLR.LJIILLIIL.getValue();
            c1505940pI8.getClass();
            if (C1505970pIB.LIZ().enable) {
                C1504230pFN c1504230pFN = C1505940pI8.LJIIIZ;
                if (str4 != null && (!a0.LJJJIL(str4))) {
                    jSONObject.put("network_category_v2_start", str4);
                }
                jSONObject.put("network_category_v2_end", c1504230pFN.LIZ);
                Integer num = c1504230pFN.LIZIZ;
                if (num != null) {
                    jSONObject.put("connectivity_type", num.intValue());
                }
                C1505990pID c1505990pID = C1505940pI8.LJIIJ;
                if (c1505990pID != null) {
                    jSONObject.put("img_tput_metric", c1505990pID.LIZ);
                    jSONObject.put("api_ttfb_metric", c1505990pID.LIZIZ);
                    jSONObject.put("pending_metric", c1505990pID.LIZJ);
                }
            }
        }
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZLLL("rd_tiktokec_common_preload_v2", jSONObject);
    }

    public static void LIZ(JSONObject jSONObject, String str, String str2, String str3, String str4, String str5) throws JSONException {
        C1507890pLH c1507890pLHLIZ;
        String str6;
        jSONObject.put("task_id", str);
        jSONObject.put("page_name", str2);
        jSONObject.put("entry_id", str3);
        jSONObject.put("preload_type", str4);
        if (Intrinsics.LJFF(jSONObject.get("stage"), "end") && ((ECNetworkContextChangedMonitorConfig) C1504170pFH.LIZIZ.getValue()).isEnabled && str5 != null && (c1507890pLHLIZ = C1507890pLH.LIZJ.LIZ()) != null && (str6 = c1507890pLHLIZ.LIZIZ.LJIIJ) != null) {
            jSONObject.put("context_changed", !Intrinsics.LJFF(str5, str6));
        }
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZLLL("rd_tiktokec_common_preload_v1", jSONObject);
    }

    public static void LIZLLL(String str, C1507990pLR c1507990pLR, String str2, String str3, long j, long j2, long j3, boolean z, String str4) throws JSONException {
        if (!LJFF()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stage", "end");
        jSONObject.put("end_type", str2);
        jSONObject.put("msg", str3);
        jSONObject.put("create_to_execute_dur", j);
        jSONObject.put("execute_to_end_dur", j2);
        jSONObject.put("create_to_end_dur", j3);
        jSONObject.put("end_btm_code", str4);
        LIZIZ(jSONObject, str, z, c1507990pLR);
    }
}
