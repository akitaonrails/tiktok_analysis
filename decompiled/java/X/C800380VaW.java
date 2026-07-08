package X;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VaW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C800380VaW {
    public static final void LIZ(InterfaceC800420Vaa interfaceC800420Vaa, JSONObject jSONObject) throws JSONException {
        for (Map.Entry<String, Object> entry : interfaceC800420Vaa.LIZ().entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
    }
}
