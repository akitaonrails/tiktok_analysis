package X;

import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Zvc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C915380Zvc {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final Map<String, String> LIZIZ() {
        return C2097608Jq.LJIIIIZZ(new Pair("uid", this.LIZ), new Pair("displayStatus", this.LIZIZ), new Pair("displayStatusStr", this.LIZJ), new Pair("connectionType", this.LIZLLL), new Pair("playType", this.LJ), new Pair("countdown", this.LJFF));
    }

    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uid", this.LIZ);
        jSONObject.put("displayStatus", this.LIZIZ);
        jSONObject.put("displayStatusStr", this.LIZJ);
        jSONObject.put("connectionType", this.LIZLLL);
        jSONObject.put("playType", this.LJ);
        jSONObject.put("countdown", this.LJFF);
        return jSONObject;
    }

    public C915380Zvc(String str, String str2, String str3, String str4, String str5, String str6) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
    }
}
