package X;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01Sy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C338201Sy {
    public static final C338201Sy LIZ = new C338201Sy();

    public static void LIZ(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        String strOptString;
        if (jSONObject3 != null) {
            strOptString = jSONObject3.optString("event_name");
        } else {
            strOptString = null;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (Intrinsics.LJFF(next, "trigger")) {
                    c2344009Gk.LJFF("trigger_v2", jSONObject.optString(next));
                } else {
                    c2344009Gk.LJFF(next, jSONObject.optString(next));
                }
            }
        }
        if (jSONObject2 != null) {
            Iterator<String> itKeys2 = jSONObject2.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                if (Intrinsics.LJFF(next2, "trigger")) {
                    c2344009Gk.LIZLLL(jSONObject2.optLong(next2), "trigger_v2");
                } else {
                    c2344009Gk.LIZLLL(jSONObject2.optLong(next2), next2);
                }
            }
        }
        C20684815ws.LJIILLIIL(strOptString, c2344009Gk.LIZ);
    }
}
