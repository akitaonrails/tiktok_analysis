package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0m9r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1385490m9r {
    public static final JSONObject LIZ(C1504590pFx c1504590pFx, Number number) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error_code", -2001);
        jSONObject.put("error_msg", "background_load_ui_blocked: UI operation rejected because the mini game container is still being pre-rendered offscreen");
        c1504590pFx.LJ(number, jSONObject);
        return C1504590pFx.LIZ(-2001, null, "background_load_ui_blocked: UI operation rejected because the mini game container is still being pre-rendered offscreen", new JSONObject());
    }
}
