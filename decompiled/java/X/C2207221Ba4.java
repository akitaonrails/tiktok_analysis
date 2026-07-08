package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Ba4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2207221Ba4 {
    public static final C2207251Ba7 LIZ = new C593510NPp<InterfaceC2207211Ba3>() { // from class: X.1Ba7
        @Override // X.C593510NPp
        public final InterfaceC2207211Ba3 LIZIZ() {
            return null;
        }
    };

    public static void LIZ(String str, JSONObject jSONObject) {
        C2207251Ba7 c2207251Ba7 = LIZ;
        if (c2207251Ba7.LIZ() != null) {
            try {
                jSONObject.put("sdkVersion", "2.2.21.mt-mt");
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onInternalEventV3 ");
            sbLIZ.append(str);
            sbLIZ.append(": ");
            sbLIZ.append(jSONObject);
            C2188811AlT.LIZIZ(sbLIZ);
            C2207231Ba5.LIZ(3);
            c2207251Ba7.LIZ().LIZ(str, jSONObject);
        }
    }
}
