package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.FacebookRequestError;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WVK, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WVK {
    public static final /* synthetic */ int LJ = 0;
    public final HttpURLConnection LIZ;
    public final JSONObject LIZIZ;
    public final FacebookRequestError LIZJ;
    public final JSONObject LIZLLL;

    public final String toString() {
        String strK4;
        try {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.LIZ;
            objArr[0] = Integer.valueOf(httpURLConnection == null ? 200 : httpURLConnection.getResponseCode());
            strK4 = C786410Ut5.k4(locale, "%d", Arrays.copyOf(objArr, 1));
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            strK4 = "unknown";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{Response: ");
        sbLIZ.append(" responseCode: ");
        sbLIZ.append(strK4);
        sbLIZ.append(", graphObject: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", error: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0WVK(HttpURLConnection httpURLConnection, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        this.LIZ = httpURLConnection;
        this.LIZIZ = jSONObject;
        this.LIZJ = facebookRequestError;
        this.LIZLLL = jSONObject;
    }
}
