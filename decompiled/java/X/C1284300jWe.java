package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jWe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1284300jWe {
    public static final C1284290jWd LIZJ = new C1284290jWd();
    public final String LIZ;
    public final JSONObject LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyDataPushCommand(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", paramCount=");
        sbLIZ.append(this.LIZIZ.length());
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1284300jWe(String str, JSONObject jSONObject) {
        this.LIZ = str;
        this.LIZIZ = jSONObject;
    }
}
