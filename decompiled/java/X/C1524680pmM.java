package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pmM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1524680pmM extends C1525230pnF {
    public final C1525120pn4 LIZ;
    public final String LIZIZ;
    public final JSONObject LIZJ;
    public final long LIZLLL;

    public C1524680pmM(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        super(jSONObject);
        if (!jSONObject.has("url")) {
            this.LIZ = C1525150pn7.LIZ(600005, "downloadFile", "network argv error").LIZIZ();
            this.LIZIZ = null;
        } else {
            Object obj = jSONObject.get("url");
            if (obj instanceof String) {
                this.LIZIZ = (String) obj;
            } else {
                this.LIZ = C1524690pmN.LIZLLL("downloadFile");
                this.LIZIZ = null;
            }
            if (this.LIZIZ != null && Intrinsics.LJFF("", obj)) {
                this.LIZ = C1524690pmN.LIZ("downloadFile");
                this.LIZIZ = null;
            } else {
                String str = this.LIZIZ;
                if (str != null) {
                    Uri uri = UriProtector.parse(str);
                    if (uri.getScheme() == null || uri.getHost() == null) {
                        this.LIZ = C1525150pn7.LIZ(600011, "downloadFile", C786410Ut5.j4("url validate error", new Object[0])).LIZIZ();
                        this.LIZIZ = null;
                    }
                }
            }
        }
        if (jSONObject.has("header")) {
            jSONObject2 = jSONObject.optJSONObject("header");
        } else {
            jSONObject2 = new JSONObject();
        }
        this.LIZJ = jSONObject2;
        this.LIZLLL = jSONObject.optLong("timeout", 60000L);
        if (!TextUtils.isEmpty(jSONObject.optString("filePath", ""))) {
            this.LIZ = C1525150pn7.LIZ(600005, "downloadFile", "not support set filePath").LIZIZ();
        }
    }
}
