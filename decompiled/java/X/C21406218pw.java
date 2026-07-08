package X;

import android.os.Build;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdk.livesetting.other.LiveClientAISettings;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.other.LivePitayaTaskFrequentControlManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18pw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21406218pw {
    public static boolean LIZIZ;
    public static int LIZ = 1;
    public static final C1ADU LIZJ = ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).wC();

    public static void LIZIZ() {
        C20441214yg.LIZIZ("LivePitayaRunTaskFrequentControlManager", "createRoomSuccess");
        LIZ = 0;
    }

    public static void LIZJ() {
        C20441214yg.LIZIZ("LivePitayaRunTaskFrequentControlManager", "startCreateRoom");
        LIZ = 3;
        LIZIZ = false;
    }

    public static boolean LIZ(double d, double d2, double d3, float f, String str) throws JSONException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        LivePitayaTaskFrequentControlManager livePitayaTaskFrequentControlManagerFrequentControlSettings = LiveClientAISettings.INSTANCE.frequentControlSettings();
        if (LIZIZ) {
            double d4 = livePitayaTaskFrequentControlManagerFrequentControlSettings.fpsLimit;
            double d5 = livePitayaTaskFrequentControlManagerFrequentControlSettings.cpuSpeedLimit;
            double d6 = livePitayaTaskFrequentControlManagerFrequentControlSettings.cpuRateLimit;
            double d7 = livePitayaTaskFrequentControlManagerFrequentControlSettings.memoryLimit;
            if (Build.VERSION.SDK_INT >= 26) {
                C20441214yg.LIZIZ("LivePitayaRunTaskFrequentControlManager", "android>=8");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cpuSpeed: ");
                sbLIZ.append(d2);
                C20441214yg.LIZIZ("LivePitayaRunTaskFrequentControlManager", C2188811AlT.LIZIZ(sbLIZ));
                if (d3 <= d7 && f >= d4 && d2 <= d5) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                LIZLLL(d2, f, d3, z4, d5, d4, d7, str);
                return z4;
            }
            C20441214yg.LIZIZ("LivePitayaRunTaskFrequentControlManager", "android<8");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cpuRate: ");
            sbLIZ2.append(d);
            C20441214yg.LIZIZ("LivePitayaRunTaskFrequentControlManager", C2188811AlT.LIZIZ(sbLIZ2));
            if (d3 <= d7 && f >= d4 && d <= d6) {
                z3 = false;
            } else {
                z3 = true;
            }
            LIZLLL(d, f, d3, z3, d5, d4, d7, str);
            return z3;
        }
        double d8 = livePitayaTaskFrequentControlManagerFrequentControlSettings.fpsLimitAnchor;
        double d9 = livePitayaTaskFrequentControlManagerFrequentControlSettings.cpuSpeedLimitAnchor;
        double d10 = livePitayaTaskFrequentControlManagerFrequentControlSettings.cpuRateLimitAnchor;
        double d11 = livePitayaTaskFrequentControlManagerFrequentControlSettings.memoryLimitAnchor;
        if (Build.VERSION.SDK_INT >= 26) {
            C20441214yg.LIZIZ("LivePitayaRunTaskFrequentControlManager", "android>=8");
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("cpuSpeed: ");
            sbLIZ3.append(d2);
            C20441214yg.LIZIZ("LivePitayaRunTaskFrequentControlManager", C2188811AlT.LIZIZ(sbLIZ3));
            if (d3 <= d11 && f >= d8 && d2 <= d9) {
                z2 = false;
            } else {
                z2 = true;
            }
            LIZLLL(d2, f, d3, z2, d9, d8, d11, str);
            return z2;
        }
        C20441214yg.LIZIZ("LivePitayaRunTaskFrequentControlManager", "android<8");
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("cpuRate: ");
        sbLIZ4.append(d);
        C20441214yg.LIZIZ("LivePitayaRunTaskFrequentControlManager", C2188811AlT.LIZIZ(sbLIZ4));
        if (d3 <= d11 && f >= d8 && d <= d10) {
            z = false;
        } else {
            z = true;
        }
        LIZLLL(d, f, d3, z, d9, d8, d11, str);
        return z;
    }

    public static void LIZLLL(double d, float f, double d2, boolean z, double d3, double d4, double d5, String str) throws JSONException {
        boolean z2;
        int i;
        boolean z3;
        int i2;
        int i3;
        if (!LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_client_ai_frequent_control_performance_data", 0.01d)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        int i4 = 1;
        if (d == 0.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i5 = 4;
        if (z2) {
            i = 4;
        } else {
            i = 0;
        }
        if (f == 60.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i6 = 2;
        if (z3) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        if (d2 == 0.0d) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (d <= d3) {
            i5 = 0;
        }
        if (f >= d4) {
            i6 = 0;
        }
        if (d2 <= d5) {
            i4 = 0;
        }
        int i7 = i | i3 | i2;
        jSONObject.put("performanceData", i7);
        jSONObject.put("frequent_control_take_effect", z ? 1 : 0);
        jSONObject.put("is_take_effect_strategy", i5 | i4 | i6);
        jSONObject.put("limit_fps", d4);
        jSONObject.put("limit_cpu", d3);
        jSONObject.put("limit_mem", d5);
        jSONObject.put("business_name", str);
        jSONObject2.put("real_fps", Float.valueOf(f));
        jSONObject2.put("real_cpu", d);
        jSONObject2.put("real_mem", d2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("performanceDataStatus: ");
        sbLIZ.append(i7);
        C20441214yg.LIZIZ("LivePitayaRunTaskFrequentControlManager", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("isFrequentControl: ");
        sbLIZ2.append(z ? 1 : 0);
        C20441214yg.LIZIZ("LivePitayaRunTaskFrequentControlManager", C2188811AlT.LIZIZ(sbLIZ2));
        C1CC2.LJ("ttlive_client_ai_frequent_control_performance_data", jSONObject, jSONObject2, jSONObject3);
    }
}
