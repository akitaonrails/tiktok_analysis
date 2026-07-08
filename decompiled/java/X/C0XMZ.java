package X;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.net.URI;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XMZ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XMZ {
    public static final SecureRandom LIZ = new SecureRandom();

    static {
        new HashSet();
    }

    public static String LIZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                URI uri = new URI(str);
                StringBuilder sb = new StringBuilder();
                if (!TextUtils.isEmpty(uri.getHost())) {
                    sb.append(uri.getHost());
                }
                if (!TextUtils.isEmpty(uri.getPath())) {
                    sb.append(uri.getPath());
                }
                return sb.toString();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return str;
    }

    public static void LIZJ(Throwable th) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception_msg", th.getMessage());
            jSONObject.put("exception_stack_trace", Log.getStackTraceString(th));
            LJIIL("tt_token_exception", jSONObject);
            boolean z = C847400XMc.LIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZLLL(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_msg", str);
            jSONObject.put("error_code", -1);
            jSONObject.put("logid", str2);
            LJIIJ("passport_invalid_logout", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJIIJ(String str, JSONObject jSONObject) {
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
        C847400XMc.LJIIJ(str, jSONObject);
    }

    public static void LJIIL(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        jSONObject.put("passport-sdk-version", "1");
        jSONObject.put("result", 0);
        LJIIJ(str, jSONObject);
    }

    public static void LIZIZ(String str, String str2, JSONObject jSONObject) {
        int i;
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        jSONObject.put("error_name", str);
        jSONObject.put("error_message", str2);
        int i2 = 1;
        if (C847400XMc.LJIIIIZZ()) {
            i = 1;
        } else {
            i = 0;
        }
        jSONObject.put("network_available", i);
        if (C847580XMu.LIZ <= 0) {
            i2 = 0;
        }
        jSONObject.put("app_in_foreground", i2);
        LJIIL("token_config_err_v2", jSONObject);
    }

    public static void LJFF(String str, String str2, String str3) {
        C847410XMd.LIZ();
        if (!C847410XMd.LIZJ) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("host", str);
            jSONObject.put("path", str2);
            jSONObject.put("reason", str3);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(" not mark get ticket");
            C0XNL.LIZ("account_not_mark_get", "all", 0, C2188811AlT.LIZIZ(sbLIZ), C786410Ut5.J3(jSONObject), null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJII(String str, boolean z, List list) {
        try {
            String str2 = "";
            StringBuilder sb = new StringBuilder();
            if (list != null && !list.isEmpty()) {
                for (Object obj : list) {
                    if (obj instanceof C20667087t) {
                        if ("X-TT-LOGID".equalsIgnoreCase(((C20667087t) obj).LIZ)) {
                            str2 = ((C20667087t) obj).LIZIZ;
                        }
                    } else if (obj != null) {
                        sb.append(obj.toString());
                        sb.append(";");
                    }
                }
            }
            LJIIJJI(LIZ(str), str2, sb.toString(), z);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZJ(e);
        }
    }

    public static void LJ(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_path", str);
            jSONObject.put("from_host", str2);
            jSONObject.put("from_logid", str3);
            jSONObject.put("error_code", -1);
            jSONObject.put("error_msg", str4);
            LJIIJ("passport_invalid_xtoken", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJI(int i, String str, String str2, boolean z) {
        int i2;
        if (LIZ.nextInt(100) > 0) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("result", i2);
            if (!z) {
                jSONObject.put("errorCode", i);
                jSONObject.put("errorMsg", str2);
            }
            jSONObject.put("sdkVersion", "1");
            jSONObject.put("platform", "android");
            jSONObject.put("urlpath", str);
            C847400XMc.LJIIJ("passport_token_beat_v2", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJIIIZ(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", str);
            jSONObject.put("type", str2);
            jSONObject.put("error_code", str3);
            jSONObject.put("error_desc", str4);
            LJIIJ("passport_token_guard_fail", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJIIJJI(String str, String str2, String str3, boolean z) {
        String str4 = "1";
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("logid", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("urlpath", str);
            }
            jSONObject.put("", 2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("extra", str3);
            }
            jSONObject.put("passport-sdk-version", "1");
            if (!z) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("user_was_login", str4);
            jSONObject.put("result", 0);
            LJIIJ("tt_token_logout", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJIIIIZZ(String str, String str2, String str3, String str4, EnumC846850XJz enumC846850XJz) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", enumC846850XJz.toString().toLowerCase(Locale.ENGLISH));
            jSONObject.put("from_host", str);
            jSONObject.put("from_path", str2);
            jSONObject.put("from_logid", str3);
            int i2 = 0;
            if (TextUtils.isEmpty(str4)) {
                i = 0;
            } else {
                i = 1;
            }
            jSONObject.put("request_xtoken", i);
            if (!TextUtils.isEmpty(C0XMV.LLJJJIL.LLILZIL.LIZ)) {
                i2 = 1;
            }
            jSONObject.put("local_xtoken", i2);
            LJIIJ("passport_session_expired_handle_result", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZJ(e);
        }
    }
}
