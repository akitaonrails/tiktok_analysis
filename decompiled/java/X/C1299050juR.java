package X;

import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0juR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1299050juR {
    public static final /* synthetic */ C1299050juR LIZ = new C1299050juR();

    public static String LIZ(Object obj) {
        JSONObject jSONObject;
        ReadableMap map;
        if (obj instanceof JSONObject) {
            jSONObject = (JSONObject) obj;
        } else if ((obj instanceof ReadableMap) && (map = ((ReadableMap) obj).getMap("data")) != null && (map instanceof JavaOnlyMap)) {
            C1297550js1.LIZ.getClass();
            jSONObject = C1297550js1.LJ((JavaOnlyMap) map);
        } else {
            jSONObject = new JSONObject();
        }
        return C786410Ut5.J3(jSONObject);
    }
}
