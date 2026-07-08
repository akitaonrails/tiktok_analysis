package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WM1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WM1 {
    public final boolean LIZ;
    public final JSONObject LIZIZ;
    public final JSONObject LIZJ;
    public final C821850WLv LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("(blocked: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", aspectResult: ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", reportData: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", blockData: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0WM1(boolean z, JSONObject jSONObject, JSONObject jSONObject2, C821850WLv c821850WLv) {
        this.LIZ = z;
        this.LIZIZ = jSONObject;
        this.LIZJ = jSONObject2;
        this.LIZLLL = c821850WLv;
    }
}
