package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AoL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2190591AoL {
    public static final C2190611AoN LIZIZ;
    public static final C2190611AoN LIZJ;
    public static final C2190611AoN LIZLLL;
    public static final List<String> LJ;
    public final JSONObject LIZ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1AoN] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.1AoN] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.1AoN] */
    static {
        final String str = "authorization_endpoint";
        LIZIZ = new AbstractC2190631AoP<Uri>(str) { // from class: X.1AoN
        };
        final String str2 = "token_endpoint";
        LIZJ = new AbstractC2190631AoP<Uri>(str2) { // from class: X.1AoN
        };
        final String str3 = "registration_endpoint";
        LIZLLL = new AbstractC2190631AoP<Uri>(str3) { // from class: X.1AoN
        };
        Arrays.asList("authorization_code", "implicit");
        Collections.singletonList("client_secret_basic");
        Collections.singletonList("normal");
        final String str4 = "claims_parameter_supported";
        final boolean z = false;
        new AbstractC2190631AoP<Boolean>(str4, z) { // from class: X.1AoM
            {
                Boolean boolValueOf = Boolean.valueOf(z);
            }
        };
        final String str5 = "request_parameter_supported";
        new AbstractC2190631AoP<Boolean>(str5, z) { // from class: X.1AoM
            {
                Boolean boolValueOf = Boolean.valueOf(z);
            }
        };
        final String str6 = "request_uri_parameter_supported";
        final boolean z2 = true;
        new AbstractC2190631AoP<Boolean>(str6, z2) { // from class: X.1AoM
            {
                Boolean boolValueOf = Boolean.valueOf(z2);
            }
        };
        final String str7 = "require_request_uri_registration";
        new AbstractC2190631AoP<Boolean>(str7, z) { // from class: X.1AoM
            {
                Boolean boolValueOf = Boolean.valueOf(z);
            }
        };
        LJ = Arrays.asList("issuer", "authorization_endpoint", "jwks_uri", "response_types_supported", "subject_types_supported", "id_token_signing_alg_values_supported");
    }

    public C2190591AoL(JSONObject jSONObject) throws C2190241Anm {
        jSONObject.getClass();
        this.LIZ = jSONObject;
        for (String str : LJ) {
            if (!this.LIZ.has(str) || this.LIZ.get(str) == null) {
                throw new C2190241Anm(str);
            }
        }
    }

    public final Object LIZ(C2190611AoN c2190611AoN) {
        JSONObject jSONObject = this.LIZ;
        try {
            if (!jSONObject.has(c2190611AoN.LIZ)) {
                return c2190611AoN.LIZIZ;
            }
            return UriProtector.parse(JSONObjectProtectorUtils.getString(jSONObject, c2190611AoN.LIZ));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalStateException("unexpected JSONException", e);
        }
    }
}
