package X;

import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.memory.ab.LynxViewConfig;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09PE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09PE {
    public static final C09PE LIZ = new C09PE();

    public static void LIZ(int i, String str, boolean z) throws JSONException {
        Map mapLJ;
        if (str.length() == 0) {
            return;
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("leak!! name:");
            sbLIZ.append(str);
            sbLIZ.append(" type:");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("no leak name:");
            sbLIZ2.append(str);
            sbLIZ2.append(" type:");
            sbLIZ2.append(i);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (i == 3) {
            LynxViewConfig lynxViewConfig = C09P3.LIZ().lynxConfig;
            if (lynxViewConfig != null && lynxViewConfig.overall) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", "lynx_view");
                jSONObject.put("type", i);
                jSONObject.put("leak", z);
                C20684815ws.LJIJ("memory_activity_leak", jSONObject);
            }
            if (z) {
                C1AF0.LIZJ(str);
                try {
                    Throwable th = new Throwable(str);
                    LynxViewConfig lynxViewConfig2 = C09P3.LIZ().lynxConfig;
                    if (lynxViewConfig2 != null && lynxViewConfig2.page) {
                        mapLJ = C0S4Q.LIZIZ();
                    } else {
                        mapLJ = C2097608Jq.LJ();
                    }
                    Npth.reportBizException("HybridViewLeak", th, str, mapLJ);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                    return;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                    return;
                }
            }
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("name", str);
        jSONObject2.put("type", i);
        jSONObject2.put("leak", z);
        C20684815ws.LJIJ("memory_activity_leak", jSONObject2);
    }
}
