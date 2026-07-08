package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vp5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C809410Vp5 {
    public static InterfaceC809250Vop LIZ;

    public static void LIZ(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 != null) {
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                try {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObject2.get(next));
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    public static void LIZIZ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("serviceName=");
        sbLIZ.append(str);
        sbLIZ.append(", category=");
        sbLIZ.append(jSONObject);
        sbLIZ.append(", metric=");
        sbLIZ.append(jSONObject2);
        sbLIZ.append(", extraLog=");
        sbLIZ.append(jSONObject3);
        C2188811AlT.LIZIZ(sbLIZ);
        if (LIZ != null) {
            C793770VBv.LJII(str, jSONObject, jSONObject2, jSONObject3);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("monitor impl is null when send event = ");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        JSONObject jSONObject4 = new JSONObject();
        LIZ(jSONObject4, jSONObject);
        LIZ(jSONObject4, jSONObject2);
        LIZ(jSONObject4, jSONObject3);
        ((C808750Vo1) C809030VoT.LJIILLIIL()).LIZ(str, jSONObject4);
    }
}
