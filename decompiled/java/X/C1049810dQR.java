package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dQR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1049810dQR {
    public final JSONObject LIZ;
    public final JSONObject LIZIZ;
    public final String LIZJ;
    public final JSONObject LIZLLL;
    public final JSONObject LJ;
    public final boolean LJFF;
    public float LJI;
    public float LJII;

    /* JADX WARN: Removed duplicated region for block: B:99:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1049830dQT LIZ(org.json.JSONObject r14) {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1049810dQR.LIZ(org.json.JSONObject):X.0dQT");
    }

    public C1049810dQR(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject != null) {
            if (jSONObject.has("body")) {
                this.LIZ = jSONObject.optJSONObject("body");
            } else {
                this.LIZ = jSONObject.optJSONObject("main_template");
            }
            this.LIZIZ = jSONObject.optJSONObject("sub_templates");
            if (jSONObject.has("meta")) {
                jSONObjectOptJSONObject = jSONObject.optJSONObject("meta");
            } else {
                jSONObjectOptJSONObject = jSONObject.optJSONObject("template_info");
            }
            if (jSONObjectOptJSONObject != null) {
                if (jSONObject.has("body")) {
                    this.LJFF = true;
                    String strOptString = jSONObjectOptJSONObject.optString("version");
                    this.LIZJ = strOptString;
                    if (TextUtils.isEmpty(strOptString)) {
                        this.LIZJ = "3.0";
                    }
                } else {
                    this.LIZJ = jSONObjectOptJSONObject.optString("sdk_version");
                }
                if (jSONObjectOptJSONObject.has("adType")) {
                    jSONObjectOptJSONObject.optString("adType");
                }
            } else if (jSONObject.has("body")) {
                this.LIZJ = "3.0";
                this.LJFF = true;
            }
            this.LIZLLL = jSONObject2;
            this.LJ = null;
        }
    }
}
