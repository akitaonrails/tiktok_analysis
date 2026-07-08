package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicLayoutApplogCombineSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.scene.Scene;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0k18, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1303200k18 {
    public static String LIZIZ;
    public static long LIZJ;
    public static String LIZLLL;
    public static String LJ;
    public static String LJFF;
    public static String LIZ = "audience";
    public static int LJI = -1;

    public static JSONObject LIZ(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        int i = LJI;
        if (i != 0) {
            if (i != 2) {
                if (i != 4) {
                    str2 = "unknown";
                } else {
                    str2 = "multi-guest";
                }
            } else {
                str2 = "multi-host";
            }
        } else {
            str2 = "union";
        }
        String str3 = LIZIZ;
        if (str3 != null) {
            jSONObject.put("linkmic_id", str3);
        }
        if (str != null) {
            jSONObject.put("extra", str);
        }
        jSONObject.put("role", LIZ);
        jSONObject.put("layout_change_times", LIZJ);
        jSONObject.put("timestamp", C963140bAe.LIZIZ());
        jSONObject.put("room_id", LJ);
        jSONObject.put("channel_id", LIZLLL);
        jSONObject.put("live_type", LJFF);
        jSONObject.put(Scene.SCENE_SERVICE, str2);
        jSONObject.put("source", "multi_live_sdk");
        return jSONObject;
    }

    public static void LIZIZ(String str, String str2) throws JSONException {
        String str3;
        if (LivesdkLinkmicLayoutApplogCombineSetting.INSTANCE.isChannelIdMismatchReportEnable() && (str3 = LIZLLL) != null && (!TextUtils.equals(str3, "-1"))) {
            JSONObject jSONObjectLIZ = LIZ(null);
            jSONObjectLIZ.put("sub_event", "channel_id_mismatch");
            if (str == null) {
                str = "null";
            }
            jSONObjectLIZ.put("room_channel_id", str);
            if (str2 == null) {
                str2 = "null";
            }
            jSONObjectLIZ.put("sei_channel_id", str2);
            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_linkmic_layout_exception", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_1000()));
            c474500IjALIZIZ.LJJIIJZLJL(jSONObjectLIZ);
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
                c474500IjALIZIZ.LIZ();
            } else {
                c474500IjALIZIZ.LJJIJLIJ();
                c474500IjALIZIZ.LJJIJL();
            }
            C1304680k3W.LIZ.LIZ(40002, C786410Ut5.J3(jSONObjectLIZ), null);
        }
    }

    public static void LIZJ(boolean z, int i, String str) throws JSONException {
        String str2;
        if (LivesdkLinkmicLayoutApplogCombineSetting.INSTANCE.isDslLoadFailedReportEnable()) {
            JSONObject jSONObjectLIZ = LIZ(null);
            jSONObjectLIZ.put("sub_event", "dsl_loading_failed");
            if (z) {
                str2 = "local";
            } else {
                str2 = "gecko";
            }
            jSONObjectLIZ.put("dsl_source", str2);
            jSONObjectLIZ.put("error_code", i);
            jSONObjectLIZ.put("error_msg", str);
            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_linkmic_layout_exception", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_1000()));
            c474500IjALIZIZ.LJJIIJZLJL(jSONObjectLIZ);
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
                c474500IjALIZIZ.LIZ();
            } else {
                c474500IjALIZIZ.LJJIJLIJ();
                c474500IjALIZIZ.LJJIJL();
            }
            C1304680k3W.LIZ.LIZ(40006, C786410Ut5.J3(jSONObjectLIZ), null);
        }
    }
}
