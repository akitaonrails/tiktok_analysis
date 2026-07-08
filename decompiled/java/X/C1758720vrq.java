package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vrq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1758720vrq extends C1758700vro implements InterfaceC2337209Du {
    public C1758720vrq() {
        super(0, null, 15);
    }

    @Override // X.InterfaceC2337209Du
    public final void setJsonData(String str) {
        JSONObject jSONObjectOptJSONObject;
        try {
            JSONObject jSONObjectOptJSONObject2 = new JSONObject(str).optJSONObject("data");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("goda_protocol_v2");
            } else {
                jSONObjectOptJSONObject = null;
            }
            this.LL = jSONObjectOptJSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1019103yf.LIZ(EnumC1014603xw.ERR_PDP_JSON_PARSE, e, null);
        }
    }
}
