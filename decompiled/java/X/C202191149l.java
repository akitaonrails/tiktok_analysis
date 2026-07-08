package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tts.oecverify.BdTuring;
import com.tts.oecverify.BdTuringConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.149l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202191149l {
    public static long LIZ;
    public static final Map<String, Double> LIZIZ = new HashMap();

    public static double LIZIZ(JSONObject jSONObject) {
        String string;
        double dDoubleValue;
        try {
            string = JSONObjectProtectorUtils.getString(jSONObject, "key");
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            string = null;
        }
        Map<String, Double> map = LIZIZ;
        synchronized (map) {
            try {
                Double d = (Double) ((HashMap) map).get(string);
                if (d == null) {
                    dDoubleValue = 1.0d;
                } else {
                    dDoubleValue = d.doubleValue();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return dDoubleValue;
    }

    public static void LIZLLL(Map<? extends String, ? extends Double> map) {
        if (map == null) {
            return;
        }
        Map<String, Double> map2 = LIZIZ;
        synchronized (map2) {
            try {
                ((HashMap) map2).putAll(map);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJIIJJI(long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", j);
            jSONObject.put("key", "pre_create_load_success");
            LIZJ("oec_verify_sdk", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C14A6.LIZIZ();
        }
    }

    public static void LJIIL(long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", j);
            jSONObject.put("key", "pre_create_success");
            LIZJ("oec_verify_sdk", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C14A6.LIZIZ();
        }
    }

    public static void LIZJ(String str, JSONObject jSONObject) {
        C14A7 eventClient;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        double dLIZIZ = LIZIZ(jSONObject);
        if (dLIZIZ < 1.0d && Math.random() >= dLIZIZ) {
            return;
        }
        try {
            jSONObject.put("sampling_rate", dLIZIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        BdTuringConfig config = BdTuring.getInstance().getConfig();
        if (config == null || (eventClient = config.getEventClient()) == null) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!jSONObject.has("time")) {
                jSONObject.put("time", jCurrentTimeMillis);
            }
            LIZ(jSONObject, "params_for_special", "oec_turing");
            LIZ(jSONObject, "sdk_version", "3.2.3.i18n");
            LIZ(jSONObject, "did", config.getDeviceId());
            LIZ(jSONObject, "device_brand", config.getDeviceBrand());
            LIZ(jSONObject, "device_model", config.getDeviceModel());
            if (!jSONObject.has("os_type")) {
                jSONObject.put("os_type", 0);
            }
            LIZ(jSONObject, "os_name", "Android");
            LIZ(jSONObject, "os_version", BdTuringConfig.OS_VERSION);
            LIZ(jSONObject, "host_app_id", config.getAppId());
            LIZ(jSONObject, "aid", config.getAppId());
            LIZ(jSONObject, "app_name", config.getAppName());
            LIZ(jSONObject, "app_version", config.getAppVersion());
            LIZ(jSONObject, "appkey", config.getAppKey());
            LIZ(jSONObject, "iid", config.getInstallId());
            LIZ(jSONObject, "session_id", config.getSessionId());
            LIZ(jSONObject, "uid", config.getUserId());
            LIZ(jSONObject, "region", config.getRegion());
            LIZ(jSONObject, "lang", config.getLanguage());
            LIZ(jSONObject, "locale", config.getLocale());
            LIZ(jSONObject, "channel", config.getChannel());
            LIZ(jSONObject, "resolution", config.getResolutionString());
            double dLIZIZ2 = LIZIZ(jSONObject);
            if (!jSONObject.has("sampling_rate")) {
                jSONObject.put("sampling_rate", dLIZIZ2);
            }
            eventClient.onEvent(str, jSONObject);
            if (C14A6.LIZ()) {
                C786410Ut5.J3(jSONObject);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C14A6.LIZIZ();
        }
    }

    public static void LJIILIIL(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", "init_error");
            jSONObject.put("error_code", i);
            jSONObject.put("custom", str);
            LIZJ("oec_verify_sdk", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C14A6.LIZIZ();
        }
    }

    public static <T> void LIZ(JSONObject jSONObject, String str, T t) throws JSONException {
        if (!jSONObject.has(str) && t != null) {
            jSONObject.put(str, t);
        }
    }

    public static void LJ(int i, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("key", "auto_report_orientation");
            jSONObject3.put("gy", "[]");
            jSONObject3.put("tql", i);
            if (jSONObject.has("gy") && jSONObject.get("gy") != null) {
                jSONObject3.put("gy", jSONObject.get("gy"));
            }
            if (jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject3.put(next, jSONObject2.get(next).toString());
                }
            }
            C786410Ut5.J3(jSONObject3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZJ("oec_verify_sdk", jSONObject3);
    }

    public static void LJFF(JSONObject jSONObject, JSONObject jSONObject2, int i, long j) {
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("key", "auto_report_orientation");
            jSONObject3.put("gy", "[]");
            jSONObject3.put("tql", i);
            jSONObject3.put("trigger_timestamp", j);
            if (jSONObject.has("gy") && jSONObject.get("gy") != null) {
                jSONObject3.put("gy", jSONObject.get("gy"));
            }
            if (jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject3.put(next, jSONObject2.get(next).toString());
                }
            }
            C786410Ut5.J3(jSONObject3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZJ("oec_verify_sdk", jSONObject3);
    }

    public static void LJI(int i, String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", "pop");
            jSONObject.put("shark_log_id", str2);
            jSONObject.put("opt_code", i);
            jSONObject.put("req_path", str3);
            jSONObject.put("mode", str);
            if (str4 != null) {
                jSONObject.put("idv_type", str4);
            }
            LIZJ("oec_verify_sdk", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C14A6.LIZIZ();
        }
    }

    public static void LJII(AbstractC202199149t abstractC202199149t, int i, long j, String str, String str2) {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("shark_log_id", abstractC202199149t.LJII());
            jSONObject.put("key", "pop_error");
            jSONObject.put("error_code", i);
            jSONObject.put("req_path", abstractC202199149t.LJFF());
            jSONObject.put("mode", abstractC202199149t.LJIIJ());
            if (j > 0) {
                jSONObject.put("duration", j - LIZ);
            }
            if (str != null) {
                jSONObject.put("custom", str);
            }
            if (str2 != null) {
                jSONObject.put("blocked_by_req_path", str2);
            }
            if (abstractC202199149t.LJ() != null) {
                jSONObject.put("idv_type", abstractC202199149t.LJ());
            }
            int iLJIIJJI = abstractC202199149t.LJIIJJI();
            int i2 = 1;
            if (iLJIIJJI == 14 || iLJIIJJI == 15) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                jSONObject.put("opt_code", -1);
            } else {
                BdTuringConfig config = BdTuring.getInstance().getConfig();
                if (config != null && config.getExpFeatures() != null) {
                    Object obj = config.getExpFeatures().get("useSView");
                    if (obj instanceof Boolean) {
                        if (!((Boolean) obj).booleanValue()) {
                            i2 = 0;
                        }
                        jSONObject.put("opt_code", i2);
                    }
                }
            }
            LIZJ("oec_verify_sdk", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C14A6.LIZIZ();
        }
    }

    public static void LJIIIIZZ(int i, String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("shark_log_id", str);
            jSONObject.put("req_path", str2);
            jSONObject.put("duration", System.currentTimeMillis() - LIZ);
            jSONObject.put("result", 0);
            jSONObject.put("key", "before_load_h5");
            jSONObject.put("opt_code", i);
            jSONObject.put("mode", str3);
            if (str4 != null) {
                jSONObject.put("idv_type", str4);
            }
            LIZJ("oec_verify_sdk", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C14A6.LIZIZ();
        }
    }

    public static void LJIILJJIL(int i, String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", "ttnet_call");
            if (str != null) {
                jSONObject.put("mode", str);
            }
            if (str2 != null) {
                jSONObject.put("shark_log_id", str2);
            }
            if (str3 != null) {
                jSONObject.put("req_path", str3);
            }
            if (str4 != null) {
                jSONObject.put("idv_type", str4);
            }
            jSONObject.put("opt_code", i);
            LIZJ("oec_verify_sdk", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C14A6.LIZIZ();
        }
    }

    public static void LJIILLIIL(AbstractC202199149t abstractC202199149t, long j, String str, int i, int i2) {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("shark_log_id", abstractC202199149t.LJII());
            jSONObject.put("req_path", abstractC202199149t.LJFF());
            jSONObject.put("duration", j - LIZ);
            jSONObject.put("custom", str);
            jSONObject.put("result", i);
            jSONObject.put("error_code", i2);
            jSONObject.put("key", "web_h5_state");
            int iLJIIJJI = abstractC202199149t.LJIIJJI();
            int i3 = 1;
            if (iLJIIJJI == 14 || iLJIIJJI == 15) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                jSONObject.put("opt_code", -1);
            } else {
                BdTuringConfig config = BdTuring.getInstance().getConfig();
                if (config != null && config.getExpFeatures() != null) {
                    Object obj = config.getExpFeatures().get("useSView");
                    if (obj instanceof Boolean) {
                        if (!((Boolean) obj).booleanValue()) {
                            i3 = 0;
                        }
                        jSONObject.put("opt_code", i3);
                    }
                }
            }
            jSONObject.put("mode", abstractC202199149t.LJIIJ());
            if (abstractC202199149t.LJ() != null) {
                jSONObject.put("idv_type", abstractC202199149t.LJ());
            }
            LIZJ("oec_verify_sdk", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C14A6.LIZIZ();
        }
    }

    public static void LJIIIZ(String str, int i, int i2, String str2, String str3, String str4, String str5) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("shark_log_id", str2);
            jSONObject.put("req_path", str3);
            jSONObject.put("duration", System.currentTimeMillis() - LIZ);
            jSONObject.put("result", i);
            if (str == null) {
                str = "";
            }
            jSONObject.put("custom", str);
            jSONObject.put("key", "load_webview");
            jSONObject.put("opt_code", i2);
            jSONObject.put("mode", str4);
            if (str5 != null) {
                jSONObject.put("idv_type", str5);
            }
            LIZJ("oec_verify_sdk", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C14A6.LIZIZ();
        }
    }

    public static void LJIILL(int i, String str, int i2, String str2, String str3, int i3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("shark_log_id", str2);
            jSONObject.put("req_path", str3);
            jSONObject.put("duration", System.currentTimeMillis() - LIZ);
            jSONObject.put("result", i);
            jSONObject.put("key", "result");
            jSONObject.put("opt_code", i3);
            jSONObject.put("mode", str);
            if (i2 > 0) {
                jSONObject.put("blocked_same_path_cnt", i2);
            }
            if (str4 != null) {
                jSONObject.put("idv_type", str4);
            }
            LIZJ("oec_verify_sdk", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C14A6.LIZIZ();
        }
    }

    public static void LJIIJ(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", "login_report");
            if (str != null) {
                jSONObject.put("mode", str);
            }
            if (str2 != null) {
                jSONObject.put("shark_log_id", str2);
            }
            if (str3 != null) {
                jSONObject.put("req_path", str3);
            }
            jSONObject.put("result", i3);
            jSONObject.put("code", i2);
            jSONObject.put("status_code", i);
            jSONObject.put("error_code", i4);
            if (str4 != null && !str4.isEmpty()) {
                jSONObject.put("custom", str4);
            }
            LIZJ("oec_verify_sdk", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C14A6.LIZIZ();
        }
    }
}
