package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Nwy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C610460Nwy {
    public static int LIZIZ;
    public static boolean LIZJ;
    public static boolean LJ;
    public static final C610460Nwy LIZ = new C610460Nwy();
    public static int LIZLLL = -1;

    public static boolean LJ() {
        if (LIZLLL == -1) {
            C844470XAv.LIZ.getClass();
            LIZLLL = (C2093608Ic.LIZJ(C844470XAv.LJIILL, "local_test") || C2093608Ic.LIZJ(C844470XAv.LJIILL, "lark_inhouse") || C2093608Ic.LIZJ(C844470XAv.LJIILL, "monkey") || C2093608Ic.LIZJ(C844470XAv.LJIILL, "rhea")) ? 1 : 0;
        }
        return LIZLLL == 1;
    }

    public static boolean LJFF(float f) {
        double d = f;
        if (0.0d <= d && d <= 1.0d) {
            if (AbstractC19994813Le.Default.nextFloat() <= f) {
                return true;
            }
            return false;
        }
        "Probability must be between 0 and 1".toString();
        throw new IllegalArgumentException("Probability must be between 0 and 1");
    }

    public static void LIZ(long j, String str) {
        if (LJFF(((Number) C0AD6.LIZ.getValue()).floatValue())) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("db_operation", str);
            jSONObject.put("time_cost", j);
            C20684815ws.LJIJ("offline_rerank", jSONObject);
        }
    }

    public static void LIZIZ(C610460Nwy c610460Nwy, Throwable th) {
        c610460Nwy.getClass();
        C1AF0.LJFF(th, "content_score_rerank");
    }

    public static void LIZJ(int i, List list) {
        if ((((Number) C261710ANl.LIZ.getValue()).intValue() & 1) == 1 && LJFF(((Number) C0AD6.LIZ.getValue()).floatValue()) && (!list.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new Object() { // from class: X.0Nwz
                });
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exist_first_unwatch", i);
            jSONObject.put("next_page_aweme_score", new JSONArray(GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), arrayList)));
            C20684815ws.LJIJ("offline_rerank", jSONObject);
        }
    }

    public static void LIZLLL(String str, Map map) {
        if ((((Number) C261710ANl.LIZ.getValue()).intValue() & 1) == 1 && LJFF(((Number) C0AD6.LIZ.getValue()).floatValue())) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Scene.SCENE_SERVICE, str);
            jSONObject.put("insert_aweme_score", new JSONObject(map));
            C20684815ws.LJIJ("offline_rerank", jSONObject);
        }
    }
}
