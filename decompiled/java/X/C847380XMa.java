package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XMa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C847380XMa {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final JSONObject LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Response{errorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", detailErrorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMessage='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append(", detailErrorMessage='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('\'');
        sbLIZ.append(", data=");
        sbLIZ.append(this.LJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C847380XMa(int i, int i2, String str, String str2, JSONObject jSONObject) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = jSONObject;
    }
}
