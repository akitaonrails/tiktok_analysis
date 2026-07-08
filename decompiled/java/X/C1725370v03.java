package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0v03, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1725370v03 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject;
        InterfaceC1725350v01 interfaceC1725350v01;
        String str = this.LIZ;
        if (str == null || (interfaceC1725350v01 = C1725360v02.LIZIZ.get(str)) == null || (jSONObject = interfaceC1725350v01.LJI()) == null) {
            jSONObject = new JSONObject();
        }
        Object objOpt = jSONObject.opt("pipo_additional_tracking_params");
        String str2 = this.LIZIZ;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("schema_url", str2);
        String str3 = this.LIZJ;
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("root_url", str3);
        String str4 = this.LIZLLL;
        if (str4 == null && (str4 = this.LIZJ) == null) {
            str4 = "";
        }
        jSONObject.put("current_url", str4);
        String str5 = this.LIZ;
        if (str5 == null) {
            str5 = "";
        }
        jSONObject.put("container_id", str5);
        String str6 = this.LJ;
        if (str6 == null) {
            str6 = "";
        }
        jSONObject.put("biz", str6);
        String str7 = this.LJFF;
        if (str7 == null) {
            str7 = "";
        }
        jSONObject.put("bdhm_bid", str7);
        jSONObject.put("trigger_source", this.LJI);
        jSONObject.put("ssp_configuration_result", this.LJII);
        jSONObject.put("ssp_configuration_reason", this.LJIIIIZZ);
        if (objOpt == null) {
            objOpt = "";
        }
        jSONObject.put("kPIPOAdditionalTrackingParams", objOpt);
        return jSONObject;
    }

    public C1725370v03(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = str8;
        this.LJIIIIZZ = str9;
    }
}
