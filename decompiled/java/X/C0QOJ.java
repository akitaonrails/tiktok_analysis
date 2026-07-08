package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QOJ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QOJ extends C0QOL {
    public static final C0QOJ LIZ = new C0QOJ();

    @Override // X.C0QOL
    public final void LIZ() {
        C0QOM c0qom = C0QOM.LIZ;
        C0QRF c0qrf = new C0QRF();
        c0qom.getClass();
        C0QOM.LIZJ(c0qrf);
    }

    public static void LIZIZ(JSONObject jSONObject, String str, Map map) {
        String strLIZ;
        String str2;
        String strOptString;
        Long lLJIILIIL;
        String strOptString2;
        if (!C07DR.LIZ() || !Intrinsics.LJFF(str, "play_time")) {
            return;
        }
        String str3 = "";
        if ((jSONObject == null || (strLIZ = C0QRR.LIZIZ(jSONObject)) == null) && (map == null || (strLIZ = C0QRR.LIZ(map)) == null)) {
            strLIZ = "";
        }
        if (jSONObject != null && (strOptString2 = jSONObject.optString("search_id")) != null) {
            str3 = strOptString2;
        } else if (map != null && (str2 = (String) map.get("search_id")) != null) {
            str3 = str2;
        }
        if (((jSONObject == null || (strOptString = jSONObject.optString("duration")) == null) && (map == null || (strOptString = (String) map.get("duration")) == null)) || (lLJIILIIL = C2095008Iq.LJIILIIL(strOptString)) == null || lLJIILIIL.longValue() < 0) {
            return;
        }
        C0Q3E.LJI().fe(new C0QO1(strLIZ, str3));
    }
}
