package X;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS550S0100000_6;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10ud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19396910ud {
    public static final C19396910ud LIZ = new C19396910ud();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(379));

    public static void LIZIZ(C1A5L c1a5l) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("gestureName", c1a5l.LIZ);
        C793770VBv.LJII("feed_gesture_hotfix", jSONObject, new JSONObject(), new JSONObject());
        ((AbstractC1604130rqV) LIZIZ.getValue()).LJII(new AwS550S0100000_6(c1a5l, 1242));
    }

    public static void LIZJ(C1A5D c1a5d, String str) {
        C20684815ws.LJIILLIIL("feed_gesture_tree_detect_item", C2097608Jq.LJIILIIL(c1a5d.LIZIZ(), new Pair("alarm_type", str)));
    }

    public static void LIZ(C1A5L c1a5l, String str, String str2, String str3, List list) throws JSONException {
        String str4;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("feed_gesture_error_type", str3);
        if (c1a5l != null) {
            str4 = c1a5l.LIZ;
        } else {
            str4 = null;
        }
        jSONObject.put("gestureName", str4);
        jSONObject.put("gestureTechIdentify", str);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("viewId", str2);
        jSONObject3.put("error_list", list);
        C793770VBv.LJII("feed_gesture_error", jSONObject, jSONObject2, jSONObject3);
        ((AbstractC1604130rqV) LIZIZ.getValue()).LJII(new C19348910mt(str3, str, str2, list));
    }
}
