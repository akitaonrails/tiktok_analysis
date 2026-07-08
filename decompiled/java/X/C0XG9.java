package X;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.crash.Npth;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.account.TTAccountInit;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XG9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XG9 {
    public static void LIZ(Throwable th) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception_stack_trace", Log.getStackTraceString(th));
            jSONObject.put("exception_msg", th.getMessage());
            jSONObject.put("passport-sdk-version", "1");
            jSONObject.put("sdkVersion", 2);
            LJ("passport_common_err", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJ(String str, JSONObject jSONObject) {
        TTAccountInit.LIZ().getClass();
        C837540WtM c837540WtM = new C837540WtM();
        if (jSONObject != null) {
            try {
                if (!jSONObject.has("passport-sdk-version")) {
                    jSONObject.put("passport-sdk-version", "1");
                }
                jSONObject.put("params_for_special", "uc_login");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        c837540WtM.LIZ(str, jSONObject);
    }

    public static void LIZLLL(int i, String str, String str2, Throwable th) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("urlpath", new URI(str).getPath().toLowerCase());
            if (th != null) {
                jSONObject.put("exception_stack_trace", Log.getStackTraceString(th));
                jSONObject.put("exception_msg", th.getMessage());
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("exception_msg", str2);
            }
            jSONObject.put("errorCode", i);
            jSONObject.put("passport-sdk-version", "1");
            jSONObject.put("sdkVersion", 2);
            if (th instanceof C1494690ozz) {
                jSONObject.put("request_log", ((C1494690ozz) th).getRequestLog());
                jSONObject.put("status_code", ((C1494690ozz) th).getStatusCode());
                jSONObject.put("cronet_internal_error_code", ((C1494690ozz) th).getCronetInternalErrorCode());
            }
            LJ("passport_net_err", jSONObject);
            ((C848000XOk) TTAccountInit.LIZ()).getClass();
            HashMap map = new HashMap();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append("");
            map.put("errCode", C2188811AlT.LIZIZ(sbLIZ));
            if (th instanceof C1494690ozz) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(((C1494690ozz) th).getStatusCode());
                sbLIZ2.append("");
                map.put("status_code", C2188811AlT.LIZIZ(sbLIZ2));
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(((C1494690ozz) th).getCronetInternalErrorCode());
                sbLIZ3.append("");
                map.put("cronet_internal_error_code", C2188811AlT.LIZIZ(sbLIZ3));
                if (((C1494690ozz) th).getStatusCode() == 0 && ((C1494690ozz) th).getCronetInternalErrorCode() == -2223 && i == -15) {
                    return;
                }
            }
            Npth.reportBizException("PassportNetErr", new Throwable(map.toString()), map.toString(), (Map<String, String>) map, true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZIZ(String str, String str2, String str3, C0XGA c0xga, JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (c0xga != null) {
            String str4 = c0xga.LJFF;
            if (TextUtils.isEmpty(str4)) {
                str4 = c0xga.LJI;
            }
            if (jSONObject == null) {
                try {
                    jSONObject2 = new JSONObject();
                } catch (JSONException e) {
                    e = e;
                    jSONObject2 = jSONObject;
                    TryCatchGuardChecker.doCheck(e);
                    LIZJ(str, c0xga.LIZJ, str2, str3, c0xga.LIZIZ, c0xga.LJ, str4, jSONObject2);
                    return;
                }
            } else {
                jSONObject2 = jSONObject;
            }
            try {
                jSONObject2.put("logid", c0xga.LIZ);
                if (c0xga instanceof C848150XOz) {
                    String str5 = ((C848150XOz) c0xga).LJIIIZ;
                    if (!TextUtils.isEmpty(str5)) {
                        jSONObject2.put("logout_from", str5);
                    }
                }
            } catch (JSONException e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
            }
            LIZJ(str, c0xga.LIZJ, str2, str3, c0xga.LIZIZ, c0xga.LJ, str4, jSONObject2);
            return;
        }
        LIZJ(str, null, str2, str3, false, -1, null, jSONObject);
    }

    public static void LIZJ(String str, String str2, String str3, String str4, boolean z, int i, String str5, JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        if (str3 == null) {
            str3 = "android";
        }
        jSONObject.put("platform", str3);
        jSONObject.put(Scene.SCENE_SERVICE, str4);
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("urlpath", str2);
        }
        if (z) {
            jSONObject.put("result", 1);
        } else {
            jSONObject.put("result", 0);
            jSONObject.put("errorCode", i);
            if (str5 != null) {
                jSONObject.put("errDesc", str5);
            }
        }
        jSONObject.put("passport-sdk-version", "1");
        jSONObject.put("sdkVersion", 2);
        LJ(str, jSONObject);
    }
}
