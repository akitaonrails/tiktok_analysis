package X;

import com.bytedance.sdk.xbridge.services.IUtilsService;
import com.lynx.react.bridge.WritableMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qHC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543800qHC {
    public static final C1543800qHC LIZ = new C1543800qHC();

    public static final WritableMap LIZ(Map<String, ? extends Object> map) {
        C587540N2q.LIZ.getClass();
        return ((IUtilsService) C587540N2q.LIZ(IUtilsService.class)).convertMapToReadableMap(map);
    }

    public static Map LIZIZ(JSONObject jSONObject) {
        C587540N2q.LIZ.getClass();
        return ((IUtilsService) C587540N2q.LIZ(IUtilsService.class)).jsonToMap(jSONObject);
    }

    public static JSONObject LIZJ(Map map) {
        C587540N2q.LIZ.getClass();
        return ((IUtilsService) C587540N2q.LIZ(IUtilsService.class)).mapToJSON(map);
    }
}
