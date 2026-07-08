package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0OAI, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OAI extends Exception implements InterfaceC1550110qRN {
    public final String LL;

    @Override // X.InterfaceC1550110qRN
    public JSONObject getFormatData() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error_type", this.LL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getCause().getClass().getSimpleName());
        sbLIZ.append(": ");
        sbLIZ.append(getCause().getMessage());
        jSONObject.put("error_message", C2188811AlT.LIZIZ(sbLIZ));
        return jSONObject;
    }

    public final String getType() {
        return this.LL;
    }

    public C0OAI(String str, Throwable th) {
        super(str, th);
        this.LL = str;
    }
}
