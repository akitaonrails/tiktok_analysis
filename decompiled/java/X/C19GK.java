package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.19GK, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19GK {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(InterfaceC1119910fFV interfaceC1119910fFV, C19GL c19gl) throws JSONException {
        if (interfaceC1119910fFV != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cancelable", c19gl.LJ);
            jSONObject.put("canceledOnTouchOutside", c19gl.LJFF);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("title", c19gl.LIZ);
            jSONObject2.put("content", c19gl.LIZIZ);
            jSONObject2.put("positive_action", c19gl.LIZJ);
            jSONObject2.put("negative_action", c19gl.LIZLLL);
            C1119860fFQ.LIZ("ttlive_livesdk_dialog_show", jSONObject, jSONObject2, new JSONObject());
        }
    }

    public static void LIZIZ(InterfaceC1119910fFV interfaceC1119910fFV, C19GL c19gl) throws JSONException {
        if (interfaceC1119910fFV != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cancelable", c19gl.LJ);
            jSONObject.put("canceledOnTouchOutside", c19gl.LJFF);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("title", c19gl.LIZ);
            jSONObject2.put("content", c19gl.LIZIZ);
            jSONObject2.put("positive_action", c19gl.LIZJ);
            jSONObject2.put("negative_action", c19gl.LIZLLL);
            C1119860fFQ.LIZ("ttlive_livesdk_dialog_negative_action_click", jSONObject, jSONObject2, new JSONObject());
        }
    }

    public static void LIZJ(InterfaceC1119910fFV interfaceC1119910fFV, C19GL c19gl) throws JSONException {
        if (interfaceC1119910fFV != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cancelable", c19gl.LJ);
            jSONObject.put("canceledOnTouchOutside", c19gl.LJFF);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("title", c19gl.LIZ);
            jSONObject2.put("content", c19gl.LIZIZ);
            jSONObject2.put("positive_action", c19gl.LIZJ);
            jSONObject2.put("negative_action", c19gl.LIZLLL);
            C1119860fFQ.LIZ("ttlive_livesdk_dialog_positive_action_click", jSONObject, jSONObject2, new JSONObject());
        }
    }
}
