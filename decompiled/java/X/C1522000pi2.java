package X;

import Y.ARunnableS28S1100000_23;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pi2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1522000pi2 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZ(String str, String str2, AbstractC1520150pf3 abstractC1520150pf3) {
        if (abstractC1520150pf3 == null) {
        }
        switch (str.hashCode()) {
            case 194292771:
                if (str.equals("res_loader_perf_template")) {
                    C824310WVh.LIZJ(new ARunnableS28S1100000_23(abstractC1520150pf3, str2, 20));
                }
                break;
            case 1157772918:
                if (str.equals("res_loader_perf") && EnumC1520990pgP.ENABLE_RES_AND_JSB_SPARK_TRACING.isEnabled()) {
                    C824310WVh.LIZJ(new ARunnableS28S1100000_23(abstractC1520150pf3, str2, 21));
                    break;
                }
                break;
            case 1521451035:
                if (str.equals("res_loader_error")) {
                    C824310WVh.LIZJ(new ARunnableS28S1100000_23(abstractC1520150pf3, str2, 23));
                }
                break;
            case 1830775838:
                if (str.equals("res_loader_error_template")) {
                    C824310WVh.LIZJ(new ARunnableS28S1100000_23(abstractC1520150pf3, str2, 22));
                }
                break;
        }
    }

    public static void LIZIZ(C1491690ov9 c1491690ov9, JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (c1491690ov9 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (jSONObject.optJSONObject("res_load_perf") == null && jSONObject.optString("res_loader_name").equals("forestX")) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(next);
                linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ), jSONObject.opt(next));
            }
        } else {
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("res_load_perf");
            if (jSONObjectOptJSONObject3 == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("res_loader_info")) == null || (jSONObjectOptJSONObject2 = jSONObject.optJSONObject("res_info")) == null) {
                return;
            }
            Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append(next2);
                linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ2), jSONObjectOptJSONObject.opt(next2));
            }
            Iterator<String> itKeys3 = jSONObjectOptJSONObject2.keys();
            while (itKeys3.hasNext()) {
                String next3 = itKeys3.next();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str);
                sbLIZ3.append(next3);
                linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ3), jSONObjectOptJSONObject2.opt(next3));
            }
            Iterator<String> itKeys4 = jSONObjectOptJSONObject3.keys();
            while (itKeys4.hasNext()) {
                String next4 = itKeys4.next();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(str);
                sbLIZ4.append(next4);
                linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ4), jSONObjectOptJSONObject3.opt(next4));
            }
        }
        c1491690ov9.LJ(linkedHashMap);
    }
}
