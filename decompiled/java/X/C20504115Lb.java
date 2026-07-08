package X;

import com.bytedance.keva.Keva;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15Lb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20504115Lb {
    public final String LIZ;
    public String LIZIZ;
    public String LIZJ;

    public final String LIZ() {
        String str = this.LIZIZ;
        if (str != null) {
            return String.valueOf(str);
        }
        String str2 = this.LIZJ;
        if (str2 != null) {
            return String.valueOf(str2);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("kv_");
        sbLIZ.append(this.LIZ);
        String string = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ)).getString("setting", null);
        this.LIZJ = string;
        return String.valueOf(string);
    }

    public C20504115Lb(String str) {
        this.LIZ = str;
        C0XPR c0xpr = C0XPR.LIZ;
        C0XPT c0xpt = new C0XPT() { // from class: X.15Lc
            @Override // X.C0XPT
            public final void onFailed(Throwable th) {
            }

            @Override // X.C0XPT
            public final void LIZIZ(JSONObject jSONObject) {
                JSONObject jSONObjectOptJSONObject;
                String strJ3;
                if (jSONObject != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject(this.LIZ.LIZ)) != null && (strJ3 = C786410Ut5.J3(jSONObjectOptJSONObject)) != null) {
                    C20504115Lb c20504115Lb = this.LIZ;
                    c20504115Lb.LIZIZ = strJ3;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("kv_");
                    sbLIZ.append(c20504115Lb.LIZ);
                    Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ)).storeString("setting", strJ3);
                }
            }
        };
        c0xpr.getClass();
        C0XPR.LJ(c0xpt);
    }
}
