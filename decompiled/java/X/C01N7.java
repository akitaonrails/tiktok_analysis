package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01N7, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01N7 {
    public static final C01N7 LIZ = new C01N7();

    public static final Map<String, String> LIZ(String str) {
        try {
            if (str == null) {
                return C2097608Jq.LJ();
            }
            JSONObject jSONObject = new JSONObject(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, JSONObjectProtectorUtils.getString(jSONObject, next));
            }
            return linkedHashMap;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C2097608Jq.LJ();
        }
    }
}
