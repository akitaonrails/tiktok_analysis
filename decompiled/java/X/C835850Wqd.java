package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Wqd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C835850Wqd {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static boolean LJI;
    public static final C835850Wqd LIZ = new C835850Wqd();
    public static final List<String> LJII = new ArrayList();

    public static void LIZIZ() {
        JSONObject jSONObject = new JSONObject();
        StringBuilder sb = new StringBuilder();
        sb.append(LIZIZ ? 1 : 0);
        sb.append(LIZJ ? 1 : 0);
        sb.append(LIZLLL ? 1 : 0);
        sb.append(LJ ? 1 : 0);
        sb.append(LJFF ? 1 : 0);
        sb.append(LJI ? 1 : 0);
        jSONObject.put("feed_back_generate_process", sb.toString());
        List<String> list = LJII;
        jSONObject.put("feed_back_error_message", C13LP.LJJLIIIJ(list, null, null, null, 0, null, null, 63));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(Scene.SCENE_SERVICE, "feed_back_info_case");
        jSONObject2.put("extra", C786410Ut5.J3(jSONObject));
        C20684815ws.LJIJ("special_case_common_monitor", jSONObject2);
        LJ = false;
        LJFF = false;
        ((ArrayList) list).clear();
    }

    public static boolean LIZ(JSONObject jSONObject) {
        try {
            return jSONObject.has("streak_feedback_info");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
