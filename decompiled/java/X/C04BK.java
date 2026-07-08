package X;

import com.google.gson.Gson;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.04BK, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04BK implements C04D3 {
    public static final /* synthetic */ int LIZ = 0;

    @Override // X.C04D3
    public final void LIZIZ(Exception exc) {
        C1019103yf.LIZ(EnumC1014603xw.ERR_GODA_30000, exc, null);
    }

    @Override // X.C04D3
    public final void LIZ(String str, Map<String, ? extends Object> map) throws JSONException {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Gson gson = C051O.LIZ;
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            jSONObject.putOpt((String) entry.getKey(), entry.getValue());
        }
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL(str, jSONObject);
    }
}
