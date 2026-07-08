package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0omB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1486130omB {
    public int LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LJ;
    public String LJI;
    public int LIZLLL = -1;
    public int LJFF = -1;

    public final boolean LIZIZ() {
        if (this.LIZ != 0 || !TextUtils.isEmpty(this.LIZIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ContentSteeringResponse hasError code=");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(", msg=");
            sbLIZ.append(this.LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            C1698940uJQ.LIZIZ();
        } else if (!TextUtils.isEmpty(this.LJ) && this.LJFF > 0) {
            return true;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ContentSteeringResponse is not valid PlayUrlList=");
        sbLIZ2.append(this.LJ);
        sbLIZ2.append(", TTL=");
        sbLIZ2.append(this.LJFF);
        C2188811AlT.LIZIZ(sbLIZ2);
        C1698940uJQ.LIZIZ();
        return false;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContentSteeringResponse{ErrorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ErrorMsg='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", SessionID='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append(", DisableFallback=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", PlayUrlList='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('\'');
        sbLIZ.append(", TTL=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", SwitchReason='");
        sbLIZ.append(this.LJI);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1486130omB LIZ(JSONObject jSONObject) {
        C1486130omB c1486130omB = new C1486130omB();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("Error");
        if (jSONObjectOptJSONObject != null) {
            c1486130omB.LIZ = jSONObjectOptJSONObject.optInt("Code");
            c1486130omB.LIZIZ = jSONObjectOptJSONObject.optString("Message");
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("Result");
        if (jSONObjectOptJSONObject2 != null) {
            c1486130omB.LIZJ = jSONObjectOptJSONObject2.optString("SessionID");
            c1486130omB.LIZLLL = jSONObjectOptJSONObject2.optInt("DisableFallback", -1);
            c1486130omB.LJ = jSONObjectOptJSONObject2.optString("PlayUrlList");
            c1486130omB.LJFF = jSONObjectOptJSONObject2.optInt("TTL", -1);
            c1486130omB.LJI = jSONObjectOptJSONObject2.optString("SwitchReason");
        }
        return c1486130omB;
    }
}
