package X;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vxy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814920Vxy {
    public long LIZ;
    public long LIZIZ;
    public int LIZJ;
    public long LIZLLL;
    public String LJ = "";
    public String LJFF = "";
    public String LJI = "";

    public static Map<String, String> LIZ(C814920Vxy c814920Vxy) {
        HashMap map = new HashMap();
        map.put("push_label", c814920Vxy.LJ);
        map.put("rule_id", String.valueOf(c814920Vxy.LIZ));
        map.put("aggregate_num", c814920Vxy.LJFF);
        map.put("itemid", c814920Vxy.LJI);
        map.put("revoke_type", String.valueOf(c814920Vxy.LIZJ));
        return map;
    }

    public static C814920Vxy LIZIZ(JSONObject jSONObject) {
        C814920Vxy c814920Vxy = new C814920Vxy();
        c814920Vxy.LIZ = jSONObject.optLong("rid", 0L);
        c814920Vxy.LIZIZ = jSONObject.optLong("revoke_id", 0L);
        c814920Vxy.LIZJ = jSONObject.optInt("revoke_type", 0);
        c814920Vxy.LIZLLL = jSONObject.optLong("ts", 0L);
        c814920Vxy.LJ = jSONObject.optString("push_label", "");
        c814920Vxy.LJFF = jSONObject.optString("aggregate_num", "");
        c814920Vxy.LJI = jSONObject.optString("itemid", "");
        return c814920Vxy;
    }
}
