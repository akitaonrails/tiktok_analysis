package X;

import android.view.View;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qHP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543930qHP {
    public static final HashMap<String, Object> LJIIIIZZ = new HashMap<>();
    public String LIZ;
    public String LIZIZ;
    public Integer LIZJ;
    public String LIZLLL;
    public View LJ;
    public String LJFF;
    public final HashMap<String, Object> LJI = new HashMap<>();
    public final Integer[] LJII = {-1, -2, -3, -5, Integer.valueOf(C386801es.DEFAULT), -1128, -2000, -2001, -10, -11, -12, -13};

    public final void LIZJ(C1543930qHP c1543930qHP) throws JSONException {
        if (!C13LQ.LJIILLIIL(this.LIZJ, this.LJII)) {
            return;
        }
        if (C13LP.LJJJJ(this.LIZ, C1543410qGZ.LJIJJ)) {
            return;
        }
        LIZIZ(c1543930qHP, "jsb_sdk_error_event", 0);
    }

    public final void LIZ(Object obj, String str) {
        if (obj != null) {
            this.LJI.put(str, obj);
        }
    }

    public final void LIZIZ(C1543930qHP c1543930qHP, String str, int i) throws JSONException {
        HashMap<String, Object> map;
        View view = this.LJ;
        C1520360pfO c1520360pfO = new C1520360pfO(str);
        c1520360pfO.LIZIZ = "jsb_sdk_error_bid";
        c1520360pfO.LIZ = this.LIZIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jsb_method_name", this.LIZ);
        jSONObject.put("jsb_url", this.LIZIZ);
        jSONObject.put("jsb_error_code", this.LIZJ);
        jSONObject.put("jsb_bridge_sdk", this.LIZLLL);
        jSONObject.put("jsb_engine", this.LJFF);
        for (Map.Entry<String, Object> entry : this.LJI.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue().toString());
        }
        Integer num = this.LIZJ;
        if (num != null && num.intValue() == -2) {
            for (Map.Entry<String, Object> entry2 : LJIIIIZZ.entrySet()) {
                jSONObject.put(entry2.getKey(), entry2.getValue().toString());
            }
        }
        if (c1543930qHP != null && (map = c1543930qHP.LJI) != null) {
            for (Map.Entry<String, Object> entry3 : map.entrySet()) {
                jSONObject.put(entry3.getKey(), entry3.getValue().toString());
            }
        }
        c1520360pfO.LIZLLL = jSONObject;
        c1520360pfO.LIZIZ(i);
        C1538660q8u.LIZ(view, c1520360pfO.LIZ());
    }
}
