package X;

import com.bytedance.bpea.cert.token.TokenCert;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hTW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1205480hTW {
    public static final C1205480hTW LIZ = new C1205480hTW();

    public static void LIZ(EnumC1205470hTV enumC1205470hTV, TokenCert tokenCert) {
        JSONObject jSONObject = new JSONObject();
        C2365509Or.LIZLLL(jSONObject, "code", Integer.valueOf(enumC1205470hTV.getValue()));
        C2365509Or.LIZLLL(jSONObject, "cert", tokenCert.getToken());
        C20684815ws.LJIJ("ttls_location_api_monitor", jSONObject);
    }
}
