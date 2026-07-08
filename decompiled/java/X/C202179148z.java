package X;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.148z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202179148z {
    public static long LIZ = 0;
    public static String LIZIZ = "";
    public static String LIZJ;
    public static String LIZLLL;
    public static final Map<String, Double> LJ;

    static {
        HashMap map = new HashMap();
        LJ = map;
        Double dValueOf = Double.valueOf(0.0d);
        map.put("init", dValueOf);
        map.put("setting", dValueOf);
    }

    public static double LIZIZ(JSONObject jSONObject) {
        String string;
        double dDoubleValue;
        try {
            string = JSONObjectProtectorUtils.getString(jSONObject, "key");
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            string = null;
        }
        Map<String, Double> map = LJ;
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

    public static void LJ(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("custom", str);
            jSONObject.put("key", "console_message");
            LIZJ("turing_verify_sdk", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20221514Aj.LIZIZ();
        }
    }

    public static void LIZJ(String str, JSONObject jSONObject) {
        AnonymousClass1494 anonymousClass1494;
        Activity activity;
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
        AnonymousClass1490 anonymousClass1490 = C1498550p6D.LIZ.LIZ;
        if (anonymousClass1490 == null || (anonymousClass1494 = anonymousClass1490.LJIILLIIL) == null) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!jSONObject.has("time")) {
                jSONObject.put("time", jCurrentTimeMillis);
            }
            LIZ(jSONObject, "params_for_special", "turing");
            LIZ(jSONObject, "sdk_version", "2.4.2.i18n");
            LIZ(jSONObject, "did", anonymousClass1490.LJIIIIZZ);
            LIZ(jSONObject, "device_brand", anonymousClass1490.LJIIIZ);
            LIZ(jSONObject, "device_model", anonymousClass1490.LJIIJ);
            if (!jSONObject.has("os_type")) {
                jSONObject.put("os_type", 0);
            }
            LIZ(jSONObject, "os_name", "Android");
            LIZ(jSONObject, "os_version", AnonymousClass1490.LJJIII);
            LIZ(jSONObject, "host_app_id", anonymousClass1490.LIZIZ);
            LIZ(jSONObject, "aid", anonymousClass1490.LIZIZ);
            LIZ(jSONObject, "app_name", anonymousClass1490.LIZLLL);
            LIZ(jSONObject, "app_version", anonymousClass1490.LJII);
            LIZ(jSONObject, "appkey", anonymousClass1490.LJFF);
            LIZ(jSONObject, "iid", anonymousClass1490.LJI);
            LIZ(jSONObject, "session_id", anonymousClass1490.LJIJJLI);
            String strLJI = null;
            LIZ(jSONObject, "uid", null);
            LIZ(jSONObject, "region", anonymousClass1490.LIZ);
            LIZ(jSONObject, "lang", anonymousClass1490.LIZJ);
            LIZ(jSONObject, "locale", anonymousClass1490.LIZ());
            LIZ(jSONObject, "mode", anonymousClass1490.LJIILJJIL);
            LIZ(jSONObject, "channel", anonymousClass1490.LJ);
            InterfaceC1494370ozT interfaceC1494370ozT = anonymousClass1490.LJJI;
            if (interfaceC1494370ozT != null && (activity = interfaceC1494370ozT.getActivity()) != null) {
                strLJI = C148N.LJI(activity);
            }
            LIZ(jSONObject, "resolution", strLJI);
            double dLIZIZ2 = LIZIZ(jSONObject);
            if (!jSONObject.has("sampling_rate")) {
                jSONObject.put("sampling_rate", dLIZIZ2);
            }
            LIZ(jSONObject, "verify_id", LIZIZ);
            LIZ(jSONObject, "log_id", LIZJ);
            LIZ(jSONObject, "detail", LIZLLL);
            anonymousClass1494.onEvent(str, jSONObject);
            if (C20221514Aj.LIZ()) {
                C786410Ut5.J3(jSONObject);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20221514Aj.LIZIZ();
        }
    }

    public static void LIZLLL(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        if (str == null) {
            str = "";
        }
        try {
            jSONObject.put("custom", str);
            jSONObject.put("result", i);
            jSONObject.put("key", "captcha_function_call");
            LIZJ("turing_verify_sdk", jSONObject);
            C202178148y.LJFF = null;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20221514Aj.LIZIZ();
        }
    }

    public static <T> void LIZ(JSONObject jSONObject, String str, T t) throws JSONException {
        if (!jSONObject.has(str) && t != null) {
            jSONObject.put(str, t);
        }
    }

    public static void LJFF(int i, int i2, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", System.currentTimeMillis() - LIZ);
            jSONObject.put("result", i);
            JSONObject jSONObject2 = new JSONObject();
            if (str == null) {
                str = "";
            }
            jSONObject2.put("message", str);
            jSONObject.put("custom", C786410Ut5.J3(jSONObject2));
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("product_path_mobile", str2);
            jSONObject.put("container_type", i2);
            jSONObject.put("key", "load_webview");
            LIZJ("turing_verify_sdk", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20221514Aj.LIZIZ();
        }
    }
}
