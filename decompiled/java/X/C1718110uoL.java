package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bnpl.IBNPLService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uoL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1718110uoL {
    public static final C1718110uoL LIZ = new C1718110uoL();

    public static String LJ() {
        try {
            String property = System.getProperty("http.agent");
            if (property == null) {
                property = "";
            }
            StringBuilder sb = new StringBuilder();
            int length = property.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = property.charAt(i);
                if (Intrinsics.LJI(cCharAt, 31) <= 0 || Intrinsics.LJI(cCharAt, 127) >= 0) {
                    sb.append(C786410Ut5.j4("\\u%04x", Arrays.copyOf(new Object[]{Character.valueOf(cCharAt)}, 1)));
                } else {
                    sb.append(cCharAt);
                }
            }
            return sb.toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            return "";
        }
    }

    public static String LIZ(String str) {
        String strJ3;
        JSONObject jSONObjectLIZJ = LIZJ(str);
        if (jSONObjectLIZJ == null || (strJ3 = C786410Ut5.J3(jSONObjectLIZJ)) == null) {
            return "{}";
        }
        return strJ3;
    }

    public static JSONObject LIZJ(String str) {
        Object c098200Yq;
        Object obj;
        String methodName;
        Object c098200Yq2;
        String methodName2;
        String str2;
        String str3;
        Map<String, String> mapLJ;
        Object obj2 = "get_exception";
        Object obj3 = null;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                IBNPLService iBNPLService = (IBNPLService) PluggableExtentionKt.pluggableSpi$default(IBNPLService.class, false, false, false, 14, null);
                if (iBNPLService != null && (mapLJ = iBNPLService.LJ()) != null) {
                    for (Map.Entry<String, String> entry : mapLJ.entrySet()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    c098200Yq2 = th.getMessage();
                    if (c098200Yq2 == null) {
                        StackTraceElement stackTraceElement = th.getStackTrace()[0];
                        if (stackTraceElement != null) {
                            methodName2 = stackTraceElement.getMethodName();
                        } else {
                            methodName2 = null;
                        }
                        c098200Yq2 = String.valueOf(methodName2);
                    }
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                    c098200Yq2 = null;
                }
                String str4 = (String) c098200Yq2;
                if (str4 == null) {
                    str4 = "get_exception";
                }
                C1716310ulR c1716310ulR = C1716310ulR.LIZ;
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("step", "get_risk3"), new Pair("error_msg", str4));
                c1716310ulR.getClass();
                C1716310ulR.LIZLLL("rd_pipo_on_boarding", mapLJIIIIZZ);
            }
            C1716550ulp.LIZ.getClass();
            C1717080umg c1717080umgLJFF = C1716550ulp.LJFF(str);
            if (c1717080umgLJFF != null && (str3 = c1717080umgLJFF.LJIJ) != null) {
                linkedHashMap.put("product_code", str3);
            }
            C1717080umg c1717080umgLJFF2 = C1716550ulp.LJFF(str);
            if (c1717080umgLJFF2 != null && (str2 = c1717080umgLJFF2.LIZJ) != null) {
                linkedHashMap.put("source_id", str2);
            }
            JSONObject jSONObjectLIZJ = C1722320uv8.LIZJ(str, linkedHashMap);
            jSONObjectLIZJ.put("user_agent", LJ());
            String strLIZIZ = C09GC.LIZIZ();
            String str5 = "0.0.0.0";
            if (strLIZIZ == null) {
                strLIZIZ = "0.0.0.0";
            }
            jSONObjectLIZJ.put("ip_address", strLIZIZ);
            String strLIZIZ2 = C09GC.LIZIZ();
            if (strLIZIZ2 != null) {
                str5 = strLIZIZ2;
            }
            jSONObjectLIZJ.put("ip", str5);
            jSONObjectLIZJ.put("true_ip", String.valueOf(C09GC.LIZIZ()));
            jSONObjectLIZJ.put("eth_ip", String.valueOf(C09GC.LIZ()));
            return jSONObjectLIZJ;
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            try {
                c098200Yq = th3.getMessage();
                if (c098200Yq == null) {
                    StackTraceElement stackTraceElement2 = th3.getStackTrace()[0];
                    if (stackTraceElement2 != null) {
                        methodName = stackTraceElement2.getMethodName();
                    } else {
                        methodName = null;
                    }
                    c098200Yq = String.valueOf(methodName);
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                c098200Yq = new C098200Yq(th4);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            if (c098200Yq != null) {
                obj2 = c098200Yq;
            }
            C1716310ulR c1716310ulR2 = C1716310ulR.LIZ;
            Map mapLJIIIIZZ2 = C2097608Jq.LJIIIIZZ(new Pair("step", "get_risk"), new Pair("error_msg", obj2));
            c1716310ulR2.getClass();
            C1716310ulR.LIZLLL("rd_pipo_on_boarding", mapLJIIIIZZ2);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("aid", String.valueOf(C1717770unn.LIZJ().getAppId()));
                jSONObject.put("app_id", String.valueOf(C1717770unn.LIZJ().getAppId()));
                C189200o6.m2constructorimpl(jSONObject);
                obj = jSONObject;
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
                C098200Yq c098200Yq3 = new C098200Yq(th5);
                C189200o6.m2constructorimpl(c098200Yq3);
                obj = c098200Yq3;
            }
            if (!C189200o6.m7isFailureimpl(obj)) {
                obj3 = obj;
            }
            return (JSONObject) obj3;
        }
    }
}
