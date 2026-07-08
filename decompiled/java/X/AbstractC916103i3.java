package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03i3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC916103i3 {
    public final JSONObject LIZ;
    public final String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseResponse{mResponseJsonObject=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mSign='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", mResultCode='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append(", mErrorCode='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('\'');
        sbLIZ.append(", mErrorMessage='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AbstractC916103i3() {
    }

    public AbstractC916103i3(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Object obj = jSONObject.get("response");
            if (obj instanceof JSONObject) {
                this.LIZ = (JSONObject) obj;
            } else if (obj instanceof String) {
                this.LIZ = new JSONObject((String) obj);
            }
            this.LIZLLL = this.LIZ.optString("error_code");
            this.LJ = this.LIZ.optString("error_message");
            this.LIZJ = this.LIZ.optString("result_code");
            this.LIZIZ = jSONObject.optString("sign");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public AbstractC916103i3(String str, int i) {
        try {
            JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(new JSONObject(str), "data");
            this.LIZ = jSONObject;
            this.LIZLLL = jSONObject.optString("error_code");
            this.LJ = jSONObject.optString("error_message");
            this.LIZJ = jSONObject.optString("result_code");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
