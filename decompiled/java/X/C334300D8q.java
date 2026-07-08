package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0D8q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C334300D8q {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;

    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("first_name", this.LIZ);
        jSONObject.put("last_name", this.LIZIZ);
        jSONObject.put("street_address", this.LIZJ);
        String str = this.LIZLLL;
        if (str != null) {
            jSONObject.put("extended_address", str);
        }
        jSONObject.put("address_locality", this.LJ);
        jSONObject.put("address_region", this.LJFF);
        jSONObject.put("postal_code", this.LJI);
        jSONObject.put("address_country", this.LJII);
        return jSONObject;
    }

    public C334300D8q(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = str8;
    }
}
