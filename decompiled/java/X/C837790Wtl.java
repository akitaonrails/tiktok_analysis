package X;

import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.internal.AwS379S0200000_13;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Wtl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C837790Wtl {
    public static void LIZ(String[] strArr, Cert cert, AwS379S0200000_13 awS379S0200000_13) throws JSONException {
        C825940Wae c825940Wae = new C825940Wae(cert, "permission_request", new String[]{"permission"}, Integer.valueOf(EnumC746240TPa.BPEA_ENTRY.getType()), "Collect", 102601);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("permissions", strArr);
        c825940Wae.LIZ(jSONObject, "params");
        C838080WuE.LIZ(c825940Wae, awS379S0200000_13);
    }
}
