package X;

import kotlin.jvm.internal.AwS167S1100000_18;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10I9, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10I9 {
    public static final C10I9 LIZ = new C10I9();
    public static final C19319410i8 LIZIZ = new C19319410i8("push_Mob");

    public static JSONObject LIZ(long j, String str) {
        return new JSONObject().put("push_channel", "CLIENT").put("real_receive_time", j).put("push_template", str);
    }

    public static void LIZIZ(String str, JSONObject jSONObject) {
        LIZIZ.LIZIZ(new AwS167S1100000_18(str, jSONObject, 38));
        C20684815ws.LJIJ(str, jSONObject);
    }
}
