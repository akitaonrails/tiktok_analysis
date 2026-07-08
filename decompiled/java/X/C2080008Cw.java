package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08Cw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2080008Cw {
    public static Map LIZ(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, JSONObjectProtectorUtils.getString(jSONObject, next));
            }
        }
        return map;
    }
}
