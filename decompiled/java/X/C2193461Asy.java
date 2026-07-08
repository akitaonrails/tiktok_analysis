package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Asy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2193461Asy {
    public static final Set<String> LJIILJJIL = Collections.unmodifiableSet(new HashSet(Arrays.asList("client_id", "code_challenge", "code_challenge_method", "display", "login_hint", "prompt", "redirect_uri", "response_mode", "response_type", "scope", "state")));
    public final C2193451Asx LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final Uri LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final Map<String, String> LJIILIIL;

    public final JSONObject LIZIZ() {
        JSONObject jSONObject = new JSONObject();
        C2191471Apl.LJIIIZ("configuration", jSONObject, this.LIZ.LIZIZ());
        C2191471Apl.LJIIIIZZ("clientId", this.LIZIZ, jSONObject);
        C2191471Apl.LJIIIIZZ("responseType", this.LJFF, jSONObject);
        C2191471Apl.LJIIIIZZ("redirectUri", this.LJI.toString(), jSONObject);
        C2191471Apl.LJIIJJI("display", this.LIZJ, jSONObject);
        C2191471Apl.LJIIJJI("login_hint", this.LIZLLL, jSONObject);
        C2191471Apl.LJIIJJI("scope", this.LJII, jSONObject);
        C2191471Apl.LJIIJJI("prompt", this.LJ, jSONObject);
        C2191471Apl.LJIIJJI("state", this.LJIIIIZZ, jSONObject);
        C2191471Apl.LJIIJJI("codeVerifier", this.LJIIIZ, jSONObject);
        C2191471Apl.LJIIJJI("codeVerifierChallenge", this.LJIIJ, jSONObject);
        C2191471Apl.LJIIJJI("codeVerifierChallengeMethod", this.LJIIJJI, jSONObject);
        C2191471Apl.LJIIJJI("responseMode", this.LJIIL, jSONObject);
        C2191471Apl.LJIIIZ("additionalParameters", jSONObject, C2191471Apl.LJI(this.LJIILIIL));
        return jSONObject;
    }

    public final Uri LIZJ() {
        Uri.Builder builderAppendQueryParameter = this.LIZ.LIZ.buildUpon().appendQueryParameter("redirect_uri", this.LJI.toString()).appendQueryParameter("client_id", this.LIZIZ).appendQueryParameter("response_type", this.LJFF);
        C011U.LIZ(builderAppendQueryParameter, "display", this.LIZJ);
        C011U.LIZ(builderAppendQueryParameter, "login_hint", this.LIZLLL);
        C011U.LIZ(builderAppendQueryParameter, "prompt", this.LJ);
        C011U.LIZ(builderAppendQueryParameter, "state", this.LJIIIIZZ);
        C011U.LIZ(builderAppendQueryParameter, "scope", this.LJII);
        C011U.LIZ(builderAppendQueryParameter, "response_mode", this.LJIIL);
        if (this.LJIIIZ != null) {
            builderAppendQueryParameter.appendQueryParameter("code_challenge", this.LJIIJ).appendQueryParameter("code_challenge_method", this.LJIIJJI);
        }
        for (Map.Entry<String, String> entry : this.LJIILIIL.entrySet()) {
            builderAppendQueryParameter.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builderAppendQueryParameter.build();
    }

    public static C2193461Asy LIZ(JSONObject jSONObject) throws JSONException {
        C2193451Asx c2193451Asx;
        C20137213qk.LIZJ(jSONObject, "json cannot be null");
        JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "configuration");
        C20137213qk.LIZJ(jSONObject2, "json object cannot be null");
        if (jSONObject2.has("discoveryDoc")) {
            try {
                c2193451Asx = new C2193451Asx(new C2190591AoL(jSONObject2.optJSONObject("discoveryDoc")));
            } catch (C2190241Anm e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Missing required field in discovery doc: ");
                sbLIZ.append(e.getMissingField());
                throw new JSONException(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            C20137213qk.LIZ("missing authorizationEndpoint", jSONObject2.has("authorizationEndpoint"));
            C20137213qk.LIZ("missing tokenEndpoint", jSONObject2.has("tokenEndpoint"));
            c2193451Asx = new C2193451Asx(C2191471Apl.LJ("authorizationEndpoint", jSONObject2), C2191471Apl.LJ("tokenEndpoint", jSONObject2), C2191471Apl.LJFF("registrationEndpoint", jSONObject2));
        }
        C2193471Asz c2193471Asz = new C2193471Asz(c2193451Asx, C2191471Apl.LIZIZ(jSONObject, "clientId"), C2191471Apl.LIZIZ(jSONObject, "responseType"), C2191471Apl.LJ("redirectUri", jSONObject));
        String strLIZJ = C2191471Apl.LIZJ("display", jSONObject);
        if (strLIZJ != null) {
            C20137213qk.LIZIZ("display must be null or not empty", strLIZJ);
        }
        c2193471Asz.LIZJ = strLIZJ;
        String strLIZJ2 = C2191471Apl.LIZJ("login_hint", jSONObject);
        if (strLIZJ2 != null) {
            C20137213qk.LIZIZ("login hint must be null or not empty", strLIZJ2);
        }
        c2193471Asz.LIZLLL = strLIZJ2;
        String strLIZJ3 = C2191471Apl.LIZJ("prompt", jSONObject);
        if (strLIZJ3 != null) {
            C20137213qk.LIZIZ("prompt must be null or non-empty", strLIZJ3);
        }
        c2193471Asz.LJ = strLIZJ3;
        String strLIZJ4 = C2191471Apl.LIZJ("state", jSONObject);
        if (strLIZJ4 != null) {
            C20137213qk.LIZIZ("state cannot be empty if defined", strLIZJ4);
        }
        c2193471Asz.LJIIIIZZ = strLIZJ4;
        c2193471Asz.LIZIZ(C2191471Apl.LIZJ("codeVerifier", jSONObject), C2191471Apl.LIZJ("codeVerifierChallenge", jSONObject), C2191471Apl.LIZJ("codeVerifierChallengeMethod", jSONObject));
        String strLIZJ5 = C2191471Apl.LIZJ("responseMode", jSONObject);
        C20137213qk.LIZLLL("responseMode must not be empty", strLIZJ5);
        c2193471Asz.LJIIL = strLIZJ5;
        c2193471Asz.LJIILIIL = C1278804zS.LIZ(C2191471Apl.LIZLLL("additionalParameters", jSONObject), LJIILJJIL);
        if (jSONObject.has("scope")) {
            List listAsList = Arrays.asList(TextUtils.split(C2191471Apl.LIZIZ(jSONObject, "scope"), " "));
            LinkedHashSet linkedHashSet = new LinkedHashSet(listAsList.size());
            linkedHashSet.addAll(listAsList);
            c2193471Asz.LJII = C1742070vQz.LIZ(linkedHashSet);
        }
        return c2193471Asz.LIZ();
    }

    public C2193461Asy(C2193451Asx c2193451Asx, String str, String str2, Uri uri, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Map map) {
        this.LIZ = c2193451Asx;
        this.LIZIZ = str;
        this.LJFF = str2;
        this.LJI = uri;
        this.LJIILIIL = map;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJII = str6;
        this.LJIIIIZZ = str7;
        this.LJIIIZ = str8;
        this.LJIIJ = str9;
        this.LJIIJJI = str10;
        this.LJIIL = str11;
    }
}
