package X;

import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03yb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1018703yb {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str, Map map) {
        JSONObject jSONObject = new JSONObject();
        Object key = "";
        try {
            for (Map.Entry entry : map.entrySet()) {
                key = entry.getKey();
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZLLL(str, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ECLoggerUtils, sendLog2: fail send event ");
            sbLIZ.append(str);
            sbLIZ.append(", key = ");
            sbLIZ.append((String) key);
            C1AF0.LJFF(e, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LIZLLL(String str, Function1 function1) {
        JSONObject jSONObject = new JSONObject();
        C957403oi c957403oi = new C957403oi();
        function1.invoke(c957403oi);
        Object key = "";
        try {
            for (Map.Entry entry : ((HashMap) c957403oi.LIZ).entrySet()) {
                key = entry.getKey();
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZLLL(str, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ECLoggerUtils, sendLog4: fail send event ");
            sbLIZ.append(str);
            sbLIZ.append(", key = ");
            sbLIZ.append((String) key);
            C1AF0.LJFF(e, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LJ(String str, Map map) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C01MV(str, map, null), 2);
    }

    public static void LJFF(String str, JSONObject jSONObject) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1018803yc(str, null, jSONObject), 2);
    }

    public static void LJI(String str, Map map) {
        JSONObject jSONObject = new JSONObject();
        Object key = "";
        try {
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                key = entry.getKey();
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZLLL(str, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ECLoggerUtils, sendLog2: fail send event ");
            sbLIZ.append(str);
            sbLIZ.append(", key = ");
            sbLIZ.append((String) key);
            C1AF0.LJFF(e, C2188811AlT.LIZIZ(sbLIZ));
            C2097608Jq.LJ();
        }
    }

    public static void LJII(String str, Function1 function1) {
        JSONObject jSONObject = new JSONObject();
        C957403oi c957403oi = new C957403oi();
        function1.invoke(c957403oi);
        Object key = "";
        try {
            for (Map.Entry entry : ((HashMap) c957403oi.LIZ).entrySet()) {
                key = entry.getKey();
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZLLL(str, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ECLoggerUtils, sendLog4: fail send event ");
            sbLIZ.append(str);
            sbLIZ.append(", key = ");
            sbLIZ.append((String) key);
            C1AF0.LJFF(e, C2188811AlT.LIZIZ(sbLIZ));
            C2097608Jq.LJ();
        }
    }

    public static void LIZJ(String str, Map map, Function1 function1) {
        JSONObject jSONObject = new JSONObject();
        Object key = "";
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            function1.invoke(linkedHashMap);
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                key = entry.getKey();
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZLLL(str, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ECLoggerUtils, sendLog3: fail send event ");
            sbLIZ.append(str);
            sbLIZ.append(", key = ");
            sbLIZ.append((String) key);
            C1AF0.LJFF(e, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LIZ(PageFinder pageFinder, String str, String str2, Map map) {
        JSONObject jSONObject = new JSONObject();
        Object key = "";
        if (str2 != null && pageFinder != null) {
            try {
                Map mapCreateReportParams$default = BtmSDK.createReportParams$default(BtmSDK.INSTANCE, str2, pageFinder, null, 4, null);
                if (!mapCreateReportParams$default.isEmpty()) {
                    ArrayList arrayList = new ArrayList(mapCreateReportParams$default.size());
                    for (Map.Entry entry : mapCreateReportParams$default.entrySet()) {
                        arrayList.add(jSONObject.put((String) entry.getKey(), String.valueOf(entry.getValue())));
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ECLoggerUtils, sendLog2: fail send event ");
                sbLIZ.append(str);
                sbLIZ.append(", key = ");
                sbLIZ.append((String) key);
                C1AF0.LJFF(e, C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            key = entry2.getKey();
            jSONObject.put((String) entry2.getKey(), entry2.getValue());
        }
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZLLL(str, jSONObject);
    }
}
