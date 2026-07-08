package X;

import Y.AObjectS366S0100000_23;
import java.util.List;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pmK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1524660pmK {
    public final InterfaceC1524580pmC LIZ;
    public final InterfaceC1525090pn1 LIZIZ;
    public final C1304160k2g LIZJ;
    public int LIZLLL;

    public final C1525120pn4 LIZ(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectLIZ;
        C1524680pmM c1524680pmM = new C1524680pmM(jSONObject);
        C1525120pn4 c1525120pn4 = c1524680pmM.LIZ;
        if (c1525120pn4 != null) {
            return c1525120pn4;
        }
        String strValueOf = String.valueOf(c1524680pmM.LIZIZ);
        List<String> list = C1524670pmL.LIZ;
        EnumC1524730pmR enumC1524730pmR = C1524670pmL.LIZ("download", strValueOf, this.LIZJ).LIZ;
        if (enumC1524730pmR != EnumC1524730pmR.SUCCESS) {
            int i = C1524880pmg.LIZ[enumC1524730pmR.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return C1524690pmN.LJ("downloadFile");
                    }
                    return C1525150pn7.LIZ(600009, "downloadFile", C786410Ut5.j4("invalid URL", new Object[0])).LIZIZ();
                }
                return C1525150pn7.LIZ(21100, "downloadFile", u.LJJIFFI("url not in domain list, url == %s", "%s", strValueOf, false)).LIZIZ();
            }
            return C1525150pn7.LIZ(600009, "downloadFile", "invalid URL").LIZIZ();
        }
        if (C244700x3.LIZIZ(strValueOf)) {
            jSONObjectLIZ = C244700x3.LIZ(c1524680pmM.LIZJ);
        } else {
            jSONObjectLIZ = c1524680pmM.LIZJ;
        }
        this.LIZ.LJJIZ(new C1524500pm4(this.LIZLLL, strValueOf, new C1502140pC0(jSONObjectLIZ, null, 2), c1524680pmM.LIZLLL, new AObjectS366S0100000_23(this, 4), new AObjectS366S0100000_23(this, 5)));
        C1525140pn6 c1525140pn6 = new C1525140pn6();
        c1525140pn6.LIZ.put("requestTaskId", this.LIZLLL);
        return C1524690pmN.LIZJ("downloadFile", c1525140pn6.LIZ);
    }

    public C1524660pmK(InterfaceC1524580pmC interfaceC1524580pmC, InterfaceC1525090pn1 interfaceC1525090pn1, C1304160k2g c1304160k2g) {
        this.LIZ = interfaceC1524580pmC;
        this.LIZIZ = interfaceC1525090pn1;
        this.LIZJ = c1304160k2g;
    }
}
