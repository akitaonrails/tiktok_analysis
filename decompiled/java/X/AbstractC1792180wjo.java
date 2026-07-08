package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wjo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1792180wjo {
    public final String LIZ = "_start";
    public final String LIZIZ = "_result";
    public long LIZJ;

    public abstract String LIZ();

    public final void LIZLLL(JSONObject jSONObject) {
        this.LIZJ = System.currentTimeMillis();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        LIZIZ(this.LIZ, jSONObject);
    }

    public final void LJ(JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZJ;
        jSONObject.put("result_code", 0);
        jSONObject.put("result_detail_code", 0);
        jSONObject.put("result_message", "");
        jSONObject.put("time_consuming", jCurrentTimeMillis);
        LIZIZ(this.LIZIZ, jSONObject);
    }

    public final void LIZIZ(String str, JSONObject jSONObject) {
        InterfaceC1794350wnJ interfaceC1794350wnJLJ = ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJ();
        EnumC1794330wnH enumC1794330wnH = EnumC1794330wnH.BOTH;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZ());
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1794310wnF c1794310wnF = (C1794310wnF) interfaceC1794350wnJLJ;
        c1794310wnF.getClass();
        c1794310wnF.LIZ(enumC1794330wnH, strLIZIZ, jSONObject, null, null);
    }

    public final void LIZJ(C1792840wks c1792840wks, JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZJ;
        jSONObject.put("result_code", c1792840wks.LIZ);
        jSONObject.put("result_detail_code", c1792840wks.LIZIZ);
        jSONObject.put("result_message", c1792840wks.LJ);
        jSONObject.put("time_consuming", jCurrentTimeMillis);
        C1791850wjH c1791850wjH = c1792840wks.LJIIIIZZ;
        if (c1791850wjH != null) {
            jSONObject.put("iap_error_code", c1791850wjH.LIZ.getValue());
            jSONObject.put("iap_error_message", c1791850wjH.LIZIZ);
        }
        LIZIZ(this.LIZIZ, jSONObject);
    }
}
