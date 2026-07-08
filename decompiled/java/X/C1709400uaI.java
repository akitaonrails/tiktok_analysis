package X;

import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uaI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1709400uaI {
    public static final C1708990uZd LIZIZ(C1709570uaZ c1709570uaZ) {
        C1708990uZd c1708990uZd;
        if (c1709570uaZ == null || (c1708990uZd = c1709570uaZ.LJIIZILJ) == null) {
            return C1709000uZe.LIZ;
        }
        return c1708990uZd;
    }

    public static final Map<String, Object> LIZ(String str, Map<String, ? extends Object> map) {
        if (str != null) {
            Map<String, Object> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("dataId", str));
            mapLJIIJ.putAll(map);
            return mapLJIIJ;
        }
        return map;
    }

    public static final void LIZJ(String str, String str2) throws JSONException {
        InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ(str);
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("EVENT_ORIGIN_FEATURE", "TEMAI");
        pairArr[1] = new Pair("item", "payment_option_installation_review_hit");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("reason", "app_dependency_unavailable");
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("source_key", str2);
        pairArr[2] = new Pair("value", C786410Ut5.J3(jSONObject));
        interfaceC1709310ua9LIZIZ.LJIIIZ(C2097608Jq.LJIIIIZZ(pairArr));
    }
}
