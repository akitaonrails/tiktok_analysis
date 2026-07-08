package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kAV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1309010kAV implements InterfaceC1309050kAZ {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ C1309000kAU LIZJ;

    public final void LIZ(JSONObject jSONObject, Error error) {
        if (error != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("error = ");
            sbLIZ.append(error);
            C2188811AlT.LIZIZ(sbLIZ);
            this.LIZJ.LIZ(this.LIZ, this.LIZIZ);
            return;
        }
        if (jSONObject == null) {
            this.LIZJ.LIZ(this.LIZ, this.LIZIZ);
            return;
        }
        C1309000kAU c1309000kAU = this.LIZJ;
        System.currentTimeMillis();
        c1309000kAU.getClass();
        if (this.LIZJ.LIZIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fetch suc, fetch count = ");
            sbLIZ2.append(this.LIZJ.LJFF);
            sbLIZ2.append(", response = ");
            sbLIZ2.append(C786410Ut5.J3(jSONObject));
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("extra");
        InterfaceC1308990kAT interfaceC1308990kAT = this.LIZJ.LIZ;
        if (interfaceC1308990kAT != null) {
            ((C1309070kAb) interfaceC1308990kAT).LIZIZ(jSONObject.optInt("code"), jSONObject.optString("message"), jSONObjectOptJSONObject, jSONObjectOptJSONObject2, this.LIZ, this.LIZIZ);
        }
    }

    public C1309010kAV(C1309000kAU c1309000kAU, String str, String str2) {
        this.LIZJ = c1309000kAU;
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
