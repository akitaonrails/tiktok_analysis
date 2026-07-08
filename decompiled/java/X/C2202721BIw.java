package X;

import com.facebook.AccessToken;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BIw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2202721BIw {
    public static AccessToken LIZIZ() {
        return C2202741BIy.LJFF.LIZ().LIZJ;
    }

    public static boolean LIZJ() {
        AccessToken accessToken = C2202741BIy.LJFF.LIZ().LIZJ;
        return (accessToken == null || new Date().after(accessToken.expires)) ? false : true;
    }

    public static AccessToken LIZ(JSONObject jSONObject) throws JSONException {
        Collection collectionLJIIZILJ;
        if (jSONObject.getInt("version") <= 1) {
            String string = jSONObject.getString("token");
            Date date = new Date(jSONObject.getLong("expires_at"));
            JSONArray jSONArray = jSONObject.getJSONArray("permissions");
            JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("expired_permissions");
            Date date2 = new Date(jSONObject.getLong("last_refresh"));
            C1BJ0 c1bj0ValueOf = C1BJ0.valueOf(jSONObject.getString("source"));
            String string2 = jSONObject.getString("application_id");
            String string3 = jSONObject.getString("user_id");
            Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0L));
            String strOptString = jSONObject.optString("graph_domain", null);
            List<String> listLJIIZILJ = C0W7Q.LJIIZILJ(jSONArray);
            List<String> listLJIIZILJ2 = C0W7Q.LJIIZILJ(jSONArray2);
            if (jSONArrayOptJSONArray == null) {
                collectionLJIIZILJ = new ArrayList();
            } else {
                collectionLJIIZILJ = C0W7Q.LJIIZILJ(jSONArrayOptJSONArray);
            }
            return new AccessToken(string, string2, string3, listLJIIZILJ, listLJIIZILJ2, collectionLJIIZILJ, c1bj0ValueOf, date, date2, date3, strOptString);
        }
        throw new C1BJO("Unknown AccessToken serialization format.");
    }
}
