package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.concurrent.ThreadLocalRandom;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XDj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C845130XDj {
    public static final C845130XDj LIZ = new C845130XDj();

    public static void LIZ(int i, int i2, int i3, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("service", i);
        jSONObject.put("method", i2);
        jSONObject.put("type", i3);
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[mobMsgEvent], json = ");
        sbLIZ.append(jSONObject);
        C845400XEk.LIZIZ("WsMobTool", C2188811AlT.LIZIZ(sbLIZ));
        if (ThreadLocalRandom.current().nextDouble() < ((Number) C0B4E.LIZ.getValue()).doubleValue() / 100.0d) {
            C20684815ws.LJIJ("ws_msg_event", jSONObject);
        }
    }
}
