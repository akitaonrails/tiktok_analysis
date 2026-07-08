package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.03fZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C900703fZ {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Boolean LIZLLL;

    public C900703fZ(JSONObject jSONObject) {
        String strOptString;
        String strOptString2;
        String strOptString3;
        if (jSONObject != null) {
            strOptString = jSONObject.optString("tips");
        } else {
            strOptString = null;
        }
        this.LIZ = strOptString;
        if (jSONObject != null) {
            strOptString2 = jSONObject.optString("font_color");
        } else {
            strOptString2 = null;
        }
        this.LIZIZ = strOptString2;
        if (jSONObject != null) {
            strOptString3 = jSONObject.optString("dark_font_color");
        } else {
            strOptString3 = null;
        }
        this.LIZJ = strOptString3;
        this.LIZLLL = jSONObject != null ? Boolean.valueOf(jSONObject.optBoolean("show_description_default")) : null;
    }
}
