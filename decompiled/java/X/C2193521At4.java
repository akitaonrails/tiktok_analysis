package X;

import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1At4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2193521At4 {
    public static final Set<String> LJIIIZ = Collections.unmodifiableSet(new HashSet(Arrays.asList("token_type", "state", "code", "access_token", "expires_in", "id_token", "scope")));
    public final C2193461Asy LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Long LJFF;
    public final String LJI;
    public final String LJII;
    public final Map<String, String> LJIIIIZZ;

    public final C2193501At2 LIZ() {
        Map mapEmptyMap = Collections.emptyMap();
        C20137213qk.LIZJ(mapEmptyMap, "additionalExchangeParameters cannot be null");
        if (this.LIZLLL == null) {
            throw new IllegalStateException("authorizationCode not available for exchange request");
        }
        C2193461Asy c2193461Asy = this.LIZ;
        C2193511At3 c2193511At3 = new C2193511At3(c2193461Asy.LIZ, c2193461Asy.LIZIZ);
        C20137213qk.LIZIZ("grantType cannot be null or empty", "authorization_code");
        c2193511At3.LIZJ = "authorization_code";
        Uri uri = this.LIZ.LJI;
        if (uri != null) {
            C20137213qk.LIZJ(uri.getScheme(), "redirectUri must have a scheme");
        }
        c2193511At3.LIZLLL = uri;
        String str = this.LIZ.LJIIIZ;
        if (str != null) {
            C20137313ql.LIZ(str);
        }
        c2193511At3.LJII = str;
        String str2 = this.LIZLLL;
        C20137213qk.LIZLLL("authorization code must not be empty", str2);
        c2193511At3.LJFF = str2;
        c2193511At3.LJIIIIZZ = C1278804zS.LIZ(mapEmptyMap, C2193501At2.LJIIIZ);
        return c2193511At3.LIZ();
    }

    public static C2193521At4 LIZIZ(Intent intent) {
        C20137213qk.LIZJ(intent, "dataIntent must not be null");
        String stringExtra = null;
        try {
            if (!intent.hasExtra("net.openid.appauth.AuthorizationResponse")) {
                return null;
            }
            try {
                stringExtra = intent.getStringExtra("net.openid.appauth.AuthorizationResponse");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            return LIZJ(stringExtra);
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new IllegalArgumentException("Intent contains malformed auth response", e2);
        }
    }

    public static C2193521At4 LIZJ(String str) {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("request")) {
            C2193531At5 c2193531At5 = new C2193531At5(C2193461Asy.LIZ(JSONObjectProtectorUtils.getJSONObject(jSONObject, "request")));
            String strLIZJ = C2191471Apl.LIZJ("token_type", jSONObject);
            C20137213qk.LIZLLL("tokenType must not be empty", strLIZJ);
            c2193531At5.LIZJ = strLIZJ;
            String strLIZJ2 = C2191471Apl.LIZJ("access_token", jSONObject);
            C20137213qk.LIZLLL("accessToken must not be empty", strLIZJ2);
            c2193531At5.LJ = strLIZJ2;
            String strLIZJ3 = C2191471Apl.LIZJ("code", jSONObject);
            C20137213qk.LIZLLL("authorizationCode must not be empty", strLIZJ3);
            c2193531At5.LIZLLL = strLIZJ3;
            String strLIZJ4 = C2191471Apl.LIZJ("id_token", jSONObject);
            C20137213qk.LIZLLL("idToken cannot be empty", strLIZJ4);
            c2193531At5.LJI = strLIZJ4;
            c2193531At5.LIZIZ(C2191471Apl.LIZJ("scope", jSONObject));
            String strLIZJ5 = C2191471Apl.LIZJ("state", jSONObject);
            C20137213qk.LIZLLL("state must not be empty", strLIZJ5);
            c2193531At5.LIZIZ = strLIZJ5;
            c2193531At5.LJFF = C2191471Apl.LIZ(jSONObject);
            c2193531At5.LJIIIIZZ = C1278804zS.LIZ(C2191471Apl.LIZLLL("additional_parameters", jSONObject), LJIIIZ);
            return c2193531At5.LIZ();
        }
        throw new IllegalArgumentException("authorization request not provided and not found in JSON");
    }

    public C2193521At4(C2193461Asy c2193461Asy, String str, String str2, String str3, String str4, Long l, String str5, String str6, Map map) {
        this.LIZ = c2193461Asy;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = l;
        this.LJI = str5;
        this.LJII = str6;
        this.LJIIIIZZ = map;
    }
}
