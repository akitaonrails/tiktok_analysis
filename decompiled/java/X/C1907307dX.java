package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07dX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1907307dX {
    public final Map<String, C20110213mO> LIZ;

    public C1907307dX(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            linkedHashMap.put(next, new C20110213mO(next, JSONObjectProtectorUtils.getJSONObject(jSONObject, next)));
        }
        this.LIZ = linkedHashMap;
    }
}
