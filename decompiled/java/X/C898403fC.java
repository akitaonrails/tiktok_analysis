package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03fC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C898403fC extends AbstractC915103ht {
    public String LJ;
    public String LJFF;
    public List<String> LJI;
    public C900403fW LJII;
    public String LJIIIIZZ;

    @Override // X.AbstractC915103ht
    public final JSONObject LIZIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("nonce", "");
            Object obj = this.LJ;
            if (obj == null) {
                obj = "";
            }
            jSONObject.put("pay_id", obj);
            Object obj2 = this.LJFF;
            if (obj2 == null) {
                obj2 = "";
            }
            jSONObject.put("merchant_user_id", obj2);
            Object obj3 = this.LJIIIIZZ;
            jSONObject.put("pipo_error_code_params", obj3 != null ? obj3 : "");
            JSONArray jSONArray = new JSONArray();
            List<String> list = this.LJI;
            if (list != null) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    jSONArray.put(it2.next());
                }
            }
            C900403fW c900403fW = this.LJII;
            if (c900403fW != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    C901203fe c901203fe = c900403fW.LIZ;
                    if (c901203fe != null) {
                        JSONObject jSONObject3 = new JSONObject();
                        try {
                            jSONObject3.put("risk_info", c901203fe.LIZ);
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        jSONObject2.put("risk_review_info", jSONObject3);
                    }
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                jSONObject.put("action_infos", jSONObject2);
            }
            jSONObject.put("action_types", jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return jSONObject;
        }
    }

    @Override // X.AbstractC915103ht
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadPayInfoRequest{mNonce = '");
        sbLIZ.append((String) null);
        sbLIZ.append("', mPayId = '");
        sbLIZ.append(this.LJ);
        sbLIZ.append("', mMerchantUserId = '");
        sbLIZ.append(this.LJFF);
        sbLIZ.append("', mActionInfo = '");
        sbLIZ.append(this.LJII);
        sbLIZ.append("', mActionTypes = '");
        sbLIZ.append(this.LJI.toString());
        sbLIZ.append("'}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
