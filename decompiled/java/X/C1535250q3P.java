package X;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q3P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1535250q3P {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Map<String, Object> LIZLLL;
    public final Throwable LJ;
    public final boolean LJFF;
    public final JSONObject LJI;

    public C1535250q3P() {
        throw null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LogMessage(tag=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", functionName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", msg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", map=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", throwable=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", needALog=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", json=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1535250q3P(String str, String str2, String str3, Map map, Throwable th, boolean z, JSONObject jSONObject, int i) {
        str3 = (i & 4) != 0 ? null : str3;
        map = (i & 8) != 0 ? null : map;
        th = (i & 16) != 0 ? null : th;
        z = (i & 32) != 0 ? false : z;
        jSONObject = (i & 64) != 0 ? null : jSONObject;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = map;
        this.LJ = th;
        this.LJFF = z;
        this.LJI = jSONObject;
    }
}
