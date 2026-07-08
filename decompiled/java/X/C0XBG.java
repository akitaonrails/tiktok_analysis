package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XBG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XBG extends C0XB9 {
    public final C844770XBz LJ;
    public final C844630XBl LJFF;

    @Override // X.C0XB9
    public final boolean LIZ(JSONObject jSONObject) throws JSONException {
        String strLIZLLL;
        C820710WHl c820710WHl = this.LJ.LJJIIJ;
        String strLIZJ = "";
        if (c820710WHl == null) {
            strLIZLLL = "";
        } else {
            strLIZLLL = c820710WHl.LIZLLL();
        }
        C2123908Tt.LJFF("carrier", strLIZLLL, jSONObject);
        C820710WHl c820710WHl2 = this.LJ.LJJIIJ;
        if (c820710WHl2 != null) {
            strLIZJ = c820710WHl2.LIZJ();
        }
        C2123908Tt.LJFF("mcc_mnc", strLIZJ, jSONObject);
        C0XBK c0xbk = (C0XBK) C0XBH.LIZ(C0XBK.class, String.valueOf(this.LJ.LIZ));
        C2123908Tt.LJFF("clientudid", c0xbk.LIZLLL(), jSONObject);
        if (!this.LJFF.LL) {
            C2123908Tt.LJFF("openudid", c0xbk.getOpenUdid(), jSONObject);
            return true;
        }
        return true;
    }

    @Override // X.C0XB9
    public final void LIZIZ(JSONObject jSONObject) {
        jSONObject.remove("carrier");
        jSONObject.remove("mcc_mnc");
        jSONObject.remove("clientudid");
        jSONObject.remove("openudid");
    }

    public C0XBG(C844630XBl c844630XBl, C844770XBz c844770XBz) {
        super(false, true);
        this.LJ = c844770XBz;
        this.LJFF = c844630XBl;
    }
}
