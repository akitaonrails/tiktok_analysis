package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0K6K, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K6K {
    public static final /* synthetic */ int LIZ = 0;

    public static JSONObject LIZIZ(Map map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    public static void LIZ(String str, String str2, Map map, Map map2, Map map3, C0K6J c0k6j) {
        String strLIZIZ;
        boolean z;
        String strLIZIZ2;
        if (c0k6j == C0K6J.EVENT_TYPE_TEA_LOG || c0k6j == C0K6J.EVENT_TYPE_TEA_AND_SLARDAR_LOG || c0k6j == C0K6J.EVENT_TYPE_TEA_AND_LIVE_SDK_SLARDAR_LOG) {
            if (!u.LJJIIJZLJL(str2, "livesdk_", false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("livesdk_");
                sbLIZ.append(str2);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = str2;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ(strLIZIZ);
            c474500IjALIZ.LJJIIZI(C500260Jjc.LLD(map));
            c474500IjALIZ.LJJIIZI(C500260Jjc.LLD(map2));
            c474500IjALIZ.LJJIIZI(C500260Jjc.LLD(map3));
            c474500IjALIZ.LJIIIIZZ();
            c474500IjALIZ.LIZ();
        }
        if (c0k6j != C0K6J.EVENT_TYPE_SLARDAR_LOG && c0k6j != C0K6J.EVENT_TYPE_TEA_AND_SLARDAR_LOG) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (!u.LJJIIJZLJL(str2, "ttlive_", false)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ttlive_");
                sbLIZ2.append(str2);
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                strLIZIZ2 = str2;
            }
            try {
                C1CC2.LIZLLL(strLIZIZ2, map, map2, map3);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1CC2.LIZ("CommonEventMonitor exception", e);
            }
        }
        if ((c0k6j == C0K6J.EVENT_TYPE_LIVE_SDK_SLARDAR_LOG || c0k6j == C0K6J.EVENT_TYPE_TEA_AND_LIVE_SDK_SLARDAR_LOG) && str.length() > 0) {
            if (!u.LJJIIJZLJL(str2, "ttlive_", false)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("ttlive_");
                sbLIZ3.append(str2);
                str2 = C2188811AlT.LIZIZ(sbLIZ3);
            }
            try {
                C1CC2.LJIILLIIL(str, str2, LIZIZ(map), LIZIZ(map2), LIZIZ(map3));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1CC2.LIZ("CommonEventMonitor exception", e2);
            }
        }
    }
}
