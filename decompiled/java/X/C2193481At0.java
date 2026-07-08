package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1At0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2193481At0 {
    public C2193501At2 LIZ;
    public String LIZIZ;
    public String LIZJ;
    public Long LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public Map<String, String> LJII;

    public C2193481At0(C2193501At2 c2193501At2) {
        C20137213qk.LIZJ(c2193501At2, "request cannot be null");
        this.LIZ = c2193501At2;
        this.LJII = Collections.emptyMap();
    }

    public final void LIZ(JSONObject jSONObject) throws JSONException {
        String strLIZIZ = C2191471Apl.LIZIZ(jSONObject, "token_type");
        C20137213qk.LIZIZ("token type must not be empty if defined", strLIZIZ);
        this.LIZIZ = strLIZIZ;
        String strLIZJ = C2191471Apl.LIZJ("access_token", jSONObject);
        if (strLIZJ != null) {
            C20137213qk.LIZIZ("access token cannot be empty if specified", strLIZJ);
        }
        this.LIZJ = strLIZJ;
        this.LIZLLL = C2191471Apl.LIZ(jSONObject);
        if (jSONObject.has("expires_in")) {
            Long lValueOf = Long.valueOf(JSONObjectProtectorUtils.getLong(jSONObject, "expires_in"));
            if (lValueOf == null) {
                this.LIZLLL = null;
            } else {
                this.LIZLLL = Long.valueOf(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(lValueOf.longValue()));
            }
        }
        String strLIZJ2 = C2191471Apl.LIZJ("refresh_token", jSONObject);
        if (strLIZJ2 != null) {
            C20137213qk.LIZIZ("refresh token must not be empty if defined", strLIZJ2);
        }
        this.LJFF = strLIZJ2;
        String strLIZJ3 = C2191471Apl.LIZJ("id_token", jSONObject);
        if (strLIZJ3 != null) {
            C20137213qk.LIZIZ("id token must not be empty if defined", strLIZJ3);
        }
        this.LJ = strLIZJ3;
        String strLIZJ4 = C2191471Apl.LIZJ("scope", jSONObject);
        if (TextUtils.isEmpty(strLIZJ4)) {
            this.LJI = null;
        } else {
            String[] strArrSplit = strLIZJ4.split(" +");
            if (strArrSplit == null) {
                strArrSplit = new String[0];
            }
            this.LJI = C1742070vQz.LIZ(Arrays.asList(strArrSplit));
        }
        Set<String> set = C2193491At1.LJIIIIZZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!((HashSet) set).contains(next)) {
                linkedHashMap.put(next, jSONObject.get(next).toString());
            }
        }
        this.LJII = C1278804zS.LIZ(linkedHashMap, C2193491At1.LJIIIIZZ);
    }
}
