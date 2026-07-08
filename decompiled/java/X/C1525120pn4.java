package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pn4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1525120pn4 {
    public final JSONObject LIZ;
    public String LIZIZ;
    public final boolean LIZJ;

    public final String toString() {
        String str = this.LIZIZ;
        if (str != null) {
            return str;
        }
        String strJ3 = C786410Ut5.J3(this.LIZ);
        this.LIZIZ = strJ3;
        return strJ3;
    }

    public C1525120pn4(JSONObject jSONObject, boolean z) {
        this.LIZ = jSONObject;
        this.LIZJ = z;
    }
}
