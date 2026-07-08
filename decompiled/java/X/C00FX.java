package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.00FX, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00FX {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(long j, long j2, long j3, String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("room_id", j);
        jSONObject.put("user_id", j2);
        jSONObject.put("anchor_id", j3);
        jSONObject.put("overall_state", str);
        jSONObject.put("send_state", str2);
        jSONObject.put("receive_state", str3);
        jSONObject.put("progress_effect_state", str4);
        C20441214yg.LIZIZ("ttlive_like", C786410Ut5.J3(jSONObject));
    }
}
