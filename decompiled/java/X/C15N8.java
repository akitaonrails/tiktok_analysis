package X;

import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15N8, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15N8 {
    public static final C15N8 LIZ = new C15N8();

    public static void LIZ(IESJsBridge iESJsBridge, InterfaceC1028200cra interfaceC1028200cra, String str) {
        final JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("is_agreed", str);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "bc_music_alert_confirm");
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        if (iESJsBridge != null) {
            iESJsBridge.LJ("notification", jSONObject);
        }
        if (interfaceC1028200cra != null) {
            interfaceC1028200cra.onEvent(new InterfaceC1047320dMQ(jSONObject) { // from class: X.15N9
                public final JSONObject LIZ;

                @Override // X.InterfaceC1047320dMQ
                public final String getName() {
                    return "notification";
                }

                @Override // X.InterfaceC1047320dMQ
                public final /* bridge */ /* synthetic */ Object getParams() {
                    return this.LIZ;
                }

                {
                    this.LIZ = jSONObject;
                }
            });
        }
    }
}
