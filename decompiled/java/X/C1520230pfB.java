package X;

import android.app.Application;
import com.bytedance.android.monitorV2.hybridSetting.entity.HybridSettingInitConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS212S0000000_23;
import okhttp3.Request;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pfB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1520230pfB {
    public static HybridSettingInitConfig LIZ;
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(113));
    public static final String LIZJ = "/monitor/data/validation";
    public static final Map<String, String> LIZLLL;

    static {
        C1520380pfQ.LIZ.getClass();
        Application application = C1520380pfQ.LJIIJ;
        Pair[] pairArr = new Pair[10];
        pairArr[0] = new Pair("EVENT_CREATE", application != null ? application.getString(2131834255) : null);
        pairArr[1] = new Pair("EVENT_UPLOAD", application != null ? application.getString(2131834264) : null);
        pairArr[2] = new Pair("SAMPLE_THROW", application != null ? application.getString(2131846721) : null);
        pairArr[3] = new Pair("EVENT_TERMINATED", application != null ? application.getString(2131834262) : null);
        pairArr[4] = new Pair("SWITCH_OFF", application != null ? application.getString(2131849420) : null);
        pairArr[5] = new Pair("PARAM_EXCEPTION", application != null ? application.getString(2131839094) : null);
        pairArr[6] = new Pair("CATCH_EXCEPTION", application != null ? application.getString(2131828410) : null);
        pairArr[7] = new Pair("EVENT_REPEATED", application != null ? application.getString(2131834261) : null);
        pairArr[8] = new Pair("INVALID_CASE", application != null ? application.getString(2131836215) : null);
        pairArr[9] = new Pair("BLOCK_LIST", application != null ? application.getString(2131836215) : null);
        LIZLLL = C2097608Jq.LJI(pairArr);
    }

    public static void LIZ(String str) {
        String str2;
        C842540X3k c842540X3kLIZJ = AbstractC842530X3j.LIZJ(C0X0P.LIZJ("application/json"), str);
        C0X33 c0x33 = new C0X33();
        StringBuilder sb = new StringBuilder();
        HybridSettingInitConfig hybridSettingInitConfig = LIZ;
        if (hybridSettingInitConfig != null) {
            str2 = hybridSettingInitConfig.LIZIZ;
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append(LIZJ);
        c0x33.LJII(sb.toString());
        c0x33.LIZLLL("POST", c842540X3kLIZJ);
        c0x33.LIZLLL.LIZ("Content-Type", "application/json");
        Request requestLIZIZ = c0x33.LIZIZ();
        try {
            C1495520p1K c1495520p1K = (C1495520p1K) LIZIZ.getValue();
            c1495520p1K.getClass();
            int i = C2204961BRm.j0(C1495500p1I.LIZJ(c1495520p1K, requestLIZIZ, false), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K480evCE4lduWSeLlxXLcLUIbzybEQRyCSYhbbsaWGDKfo9sG8CxLI=", null)).LLILLL;
            int i2 = C2187451AjH.LIZ;
            C1521730phb.LIZ("Validation", "report code " + i);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            C1520960pgM.LIZIZ(e);
        }
    }

    public static void LIZJ(C1520560pfi c1520560pfi) throws JSONException {
        boolean z;
        String str;
        String str2;
        String str3;
        JSONObject jSONObjectPut = new JSONObject().put("extra", c1520560pfi.LJII());
        JSONObject jSONObject = new JSONObject();
        C1520640pfq.LJIILIIL("module", "monitor", jSONObject);
        EnumC1520240pfC enumC1520240pfC = EnumC1520240pfC.EVENT_UPLOAD;
        EnumC1520240pfC enumC1520240pfC2 = c1520560pfi.LIZLLL.LIZ;
        if (enumC1520240pfC != enumC1520240pfC2 && EnumC1520240pfC.SAMPLE_THROW != enumC1520240pfC2) {
            C1520640pfq.LJIILJJIL(jSONObject, "body", new JSONObject());
        } else {
            C1520640pfq.LJIILJJIL(jSONObject, "body", jSONObjectPut);
        }
        C1520640pfq.LJIILIIL("ev_type", c1520560pfi.LIZ, jSONObject);
        C1520640pfq.LJIIL("timestamp", System.currentTimeMillis(), jSONObject);
        int i = 1;
        if (EnumC1520240pfC.SAMPLE_THROW != c1520560pfi.LIZLLL.LIZ) {
            z = true;
        } else {
            z = false;
        }
        C1520640pfq.LJIILJJIL(jSONObject, "hit_sample", Boolean.valueOf(z));
        HybridSettingInitConfig hybridSettingInitConfig = LIZ;
        String strName = null;
        if (hybridSettingInitConfig != null) {
            str = hybridSettingInitConfig.LJ;
        } else {
            str = null;
        }
        C1520640pfq.LJIILIIL("device_id", str, jSONObject);
        HybridSettingInitConfig hybridSettingInitConfig2 = LIZ;
        if (hybridSettingInitConfig2 != null) {
            str2 = hybridSettingInitConfig2.LIZJ;
        } else {
            str2 = null;
        }
        C1520640pfq.LJIILIIL("os", str2, jSONObject);
        C1520640pfq.LJIILIIL("container_name", LIZIZ("container_name", c1520560pfi.LIZ, jSONObjectPut), jSONObject);
        C1520640pfq.LJIILIIL("container_type", c1520560pfi.LJFF.LIZJ, jSONObject);
        C1520640pfq.LJIILIIL("url", LIZIZ("url", c1520560pfi.LIZ, jSONObjectPut), jSONObject);
        C1520640pfq.LJIILIIL("bid", c1520560pfi.LIZIZ(), jSONObject);
        HybridSettingInitConfig hybridSettingInitConfig3 = LIZ;
        if (hybridSettingInitConfig3 != null) {
            str3 = hybridSettingInitConfig3.LIZ;
        } else {
            str3 = null;
        }
        C1520640pfq.LJIILIIL("aid", str3, jSONObject);
        C1520640pfq.LJIILIIL("sdk_version", "1.0-tiktok-monorepo", jSONObject);
        C1520640pfq.LJIILIIL("sdk_name", "Android Hybrid Monitor", jSONObject);
        C1520640pfq.LJIILJJIL(jSONObject, "trace_id", c1520560pfi.LIZ());
        EnumC1520240pfC enumC1520240pfC3 = c1520560pfi.LIZLLL.LIZ;
        if (enumC1520240pfC != enumC1520240pfC3 && EnumC1520240pfC.EVENT_CREATE != enumC1520240pfC3) {
            i = 0;
        }
        C1520640pfq.LJIIJJI(i, "trace_type", jSONObject);
        EnumC1520240pfC enumC1520240pfC4 = EnumC1520240pfC.EVENT_TERMINATED;
        C1520260pfE c1520260pfE = c1520560pfi.LIZLLL;
        EnumC1520240pfC enumC1520240pfC5 = c1520260pfE.LIZ;
        if (enumC1520240pfC4 == enumC1520240pfC5) {
            EnumC1520250pfD enumC1520250pfD = c1520260pfE.LIZIZ;
            if (enumC1520250pfD != null) {
                strName = enumC1520250pfD.name();
            }
        } else if (enumC1520240pfC5 != null) {
            strName = enumC1520240pfC5.name();
        }
        String str4 = (String) ((HashMap) LIZLLL).get(strName);
        if (str4 != null) {
            strName = str4;
        }
        C1520640pfq.LJIILIIL("trace_content", strName, jSONObject);
        LIZ(C786410Ut5.J3(jSONObject));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(java.lang.String r4, java.lang.String r5, org.json.JSONObject r6) {
        /*
            java.lang.String r3 = "url"
            java.lang.String r2 = ""
            boolean r0 = android.text.TextUtils.equals(r3, r4)     // Catch: org.json.JSONException -> L4d
            java.lang.String r1 = "extra"
            if (r0 == 0) goto L32
            java.lang.String r0 = "custom"
            boolean r0 = android.text.TextUtils.equals(r0, r5)     // Catch: org.json.JSONException -> L4d
            if (r0 == 0) goto L1f
            org.json.JSONObject r0 = r6.optJSONObject(r1)     // Catch: org.json.JSONException -> L4d
            if (r0 == 0) goto L56
            java.lang.String r0 = r0.optString(r3)     // Catch: org.json.JSONException -> L4d
            goto L57
        L1f:
            org.json.JSONObject r1 = r6.optJSONObject(r1)     // Catch: org.json.JSONException -> L4d
            if (r1 == 0) goto L56
            java.lang.String r0 = "nativeBase"
            org.json.JSONObject r0 = r1.optJSONObject(r0)     // Catch: org.json.JSONException -> L4d
            if (r0 == 0) goto L56
            java.lang.String r0 = r0.optString(r4)     // Catch: org.json.JSONException -> L4d
            goto L57
        L32:
            java.lang.String r0 = "container_name"
            boolean r0 = android.text.TextUtils.equals(r0, r4)     // Catch: org.json.JSONException -> L4d
            if (r0 == 0) goto L54
            org.json.JSONObject r1 = r6.optJSONObject(r1)     // Catch: org.json.JSONException -> L4d
            if (r1 == 0) goto L56
            java.lang.String r0 = "containerBase"
            org.json.JSONObject r0 = r1.optJSONObject(r0)     // Catch: org.json.JSONException -> L4d
            if (r0 == 0) goto L56
            java.lang.String r0 = r0.optString(r4)     // Catch: org.json.JSONException -> L4d
            goto L57
        L4d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1520960pgM.LIZIZ(r0)
        L54:
            r0 = r2
            goto L57
        L56:
            r0 = 0
        L57:
            if (r0 == 0) goto L5a
            return r0
        L5a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1520230pfB.LIZIZ(java.lang.String, java.lang.String, org.json.JSONObject):java.lang.String");
    }
}
