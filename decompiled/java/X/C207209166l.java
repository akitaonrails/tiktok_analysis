package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.166l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C207209166l extends AbstractC207210166m {
    public final String LJIIIZ;
    public final String LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public final int LJIILIIL;
    public final boolean LJIILJJIL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UrlFileConfig: fileName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" fileDir=");
        sbLIZ.append(C771370UNr.LIZJ(this));
        sbLIZ.append(" url=");
        sbLIZ.append(this.LJIIIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC207210166m
    public void LIZ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) throws JSONException {
        super.LIZ(str, jSONObject, jSONObject2, jSONObject3);
        jSONObject3.putOpt("url", this.LJIIIZ);
        if (this.LJIIJ.length() > 0) {
            jSONObject3.putOpt("extra", this.LJIIJ);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C207209166l(String str, EnumC771350UNp enumC771350UNp, String str2, String str3, String str4, String str5, boolean z, int i, boolean z2, int i2) {
        boolean z3;
        str2 = (i2 & 4) != 0 ? "" : str2;
        str3 = (i2 & 8) != 0 ? "" : str3;
        str5 = (i2 & 32) != 0 ? "" : str5;
        if ((i2 & 64) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        z = (i2 & 128) != 0 ? true : z;
        i = (i2 & 256) != 0 ? 1 : i;
        z2 = (i2 & 512) != 0 ? false : z2;
        super(str, enumC771350UNp, str2, str3);
        this.LJIIIZ = str4;
        this.LJIIJ = str5;
        this.LJIIJJI = z3;
        this.LJIIL = z;
        this.LJIILIIL = i;
        this.LJIILJJIL = z2;
    }
}
