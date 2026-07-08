package X;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0odx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481030odx {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("event", str);
        jSONObject2.put("data", jSONObject);
        return C786410Ut5.J3(jSONObject2);
    }

    public static final void LIZIZ(String str, JSONObject jSONObject) throws JSONException {
        if (!InterfaceC1481090oe3.LIZ) {
            return;
        }
        String strLIZ = LIZ(str, jSONObject);
        if (!TextUtils.isEmpty(strLIZ)) {
            C2344809Gs.LIZLLL(3, "VideoPlayer_Log", strLIZ);
        }
    }

    public static final void LIZJ(String str, String str2) {
        if (!InterfaceC1481090oe3.LIZ) {
            return;
        }
        C2344809Gs.LIZLLL(6, str, str2);
    }
}
