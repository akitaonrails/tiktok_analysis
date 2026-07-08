package X;

import com.bytedance.ies.xbridge.autoservice.IReadableJSONService;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ypo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1872780ypo {
    public static final C1872780ypo LIZ = new C1872780ypo();

    public static JSONArray LIZ(InterfaceC1871920yoQ interfaceC1871920yoQ) {
        JSONArray jSONArrayXReadableArrayToJSONArray;
        C587540N2q.LIZ.getClass();
        IReadableJSONService iReadableJSONService = (IReadableJSONService) C587540N2q.LIZ(IReadableJSONService.class);
        if (iReadableJSONService == null || (jSONArrayXReadableArrayToJSONArray = iReadableJSONService.xReadableArrayToJSONArray(interfaceC1871920yoQ)) == null) {
            return new JSONArray();
        }
        return jSONArrayXReadableArrayToJSONArray;
    }

    public static JSONObject LIZIZ(InterfaceC1107590evd interfaceC1107590evd) {
        JSONObject jSONObjectXReadableMapToJSONObject;
        C587540N2q.LIZ.getClass();
        IReadableJSONService iReadableJSONService = (IReadableJSONService) C587540N2q.LIZ(IReadableJSONService.class);
        if (iReadableJSONService == null || (jSONObjectXReadableMapToJSONObject = iReadableJSONService.xReadableMapToJSONObject(interfaceC1107590evd)) == null) {
            return new JSONObject();
        }
        return jSONObjectXReadableMapToJSONObject;
    }
}
