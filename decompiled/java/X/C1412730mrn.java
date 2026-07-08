package X;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mrn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1412730mrn {
    public static final /* synthetic */ int LIZ = 0;

    public static JSONArray LIZ(List list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1412720mrm c1412720mrm = (C1412720mrm) it2.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_id", c1412720mrm.LIZ);
            jSONObject.put("asset_parent_type", c1412720mrm.LIZIZ);
            Integer num = c1412720mrm.LIZJ;
            if (num != null) {
                jSONObject.put("asset_type", num.intValue());
            }
            String str = c1412720mrm.LIZLLL;
            if (str != null) {
                jSONObject.put("name", str);
            }
            jSONObject.put("index", c1412720mrm.LJ);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }
}
