package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0df3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1058870df3 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public JSONObject LIZLLL;
    public final JSONObject LJ;
    public final Boolean LJFF;
    public final JSONObject LJI;
    public final JSONObject LJII;

    public C1058870df3(String str, String str2, JSONObject jSONObject, int i) {
        Boolean bool;
        str2 = (i & 4) != 0 ? null : str2;
        jSONObject = (i & 8) != 0 ? null : jSONObject;
        if ((i & 32) != 0) {
            bool = Boolean.FALSE;
        } else {
            bool = null;
        }
        this.LIZ = str;
        this.LIZIZ = null;
        this.LIZJ = str2;
        this.LIZLLL = jSONObject;
        this.LJ = null;
        this.LJFF = bool;
        this.LJI = null;
        this.LJII = null;
    }
}
