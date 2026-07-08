package X;

import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1At9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2193571At9 extends Exception {
    public final int code;
    public final String error;
    public final String errorDescription;
    public final Uri errorUri;
    public final int type;

    public int hashCode() {
        return ((this.type + 31) * 31) + this.code;
    }

    public Intent toIntent() {
        Intent intent = new Intent();
        intent.putExtra("net.openid.appauth.AuthorizationException", toJsonString());
        return intent;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        C2191471Apl.LJII(this.type, "type", jSONObject);
        C2191471Apl.LJII(this.code, "code", jSONObject);
        C2191471Apl.LJIIJJI("error", this.error, jSONObject);
        C2191471Apl.LJIIJJI("errorDescription", this.errorDescription, jSONObject);
        C2191471Apl.LJIIL(jSONObject, "errorUri", this.errorUri);
        return jSONObject;
    }

    public String toJsonString() {
        return C786410Ut5.J3(toJson());
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AuthorizationException: ");
        sbLIZ.append(toJsonString());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static Map<String, C2193571At9> exceptionMapByString(C2193571At9... c2193571At9Arr) {
        int length;
        if (c2193571At9Arr != null) {
            length = c2193571At9Arr.length;
        } else {
            length = 0;
        }
        C830490Whz c830490Whz = new C830490Whz(length);
        if (c2193571At9Arr != null) {
            for (C2193571At9 c2193571At9 : c2193571At9Arr) {
                String str = c2193571At9.error;
                if (str != null) {
                    c830490Whz.put(str, c2193571At9);
                }
            }
        }
        return Collections.unmodifiableMap(c830490Whz);
    }

    public static C2193571At9 fromIntent(Intent intent) {
        intent.getClass();
        if (!intent.hasExtra("net.openid.appauth.AuthorizationException")) {
            return null;
        }
        try {
            return fromJson(INVOKEVIRTUAL_net_openid_appauth_AuthorizationException_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "net.openid.appauth.AuthorizationException"));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalArgumentException("Intent contains malformed exception data", e);
        }
    }

    public static C2193571At9 fromJson(JSONObject jSONObject) {
        C20137213qk.LIZJ(jSONObject, "json cannot be null");
        return new C2193571At9(JSONObjectProtectorUtils.getInt(jSONObject, "type"), JSONObjectProtectorUtils.getInt(jSONObject, "code"), C2191471Apl.LIZJ("error", jSONObject), C2191471Apl.LIZJ("errorDescription", jSONObject), C2191471Apl.LJFF("errorUri", jSONObject), null);
    }

    public static C2193571At9 fromOAuthRedirect(Uri uri) {
        Uri uri2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "error");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "error_description");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "error_uri");
        C2193571At9 c2193571At9 = C2193601AtC.LIZLLL.get(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        if (c2193571At9 == null) {
            c2193571At9 = C2193601AtC.LIZIZ;
        }
        int i = c2193571At9.type;
        int i2 = c2193571At9.code;
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = c2193571At9.errorDescription;
        }
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null) {
            uri2 = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
        } else {
            uri2 = c2193571At9.errorUri;
        }
        return new C2193571At9(i, i2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, uri2, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C2193571At9)) {
            return false;
        }
        C2193571At9 c2193571At9 = (C2193571At9) obj;
        if (this.type == c2193571At9.type && this.code == c2193571At9.code) {
            return true;
        }
        return false;
    }

    public static C2193571At9 fromJson(String str) {
        C20137213qk.LIZIZ("jsonStr cannot be null or empty", str);
        return fromJson(new JSONObject(str));
    }

    public static String INVOKEVIRTUAL_net_openid_appauth_AuthorizationException_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static C2193571At9 authEx(int i, String str) {
        return new C2193571At9(1, i, str, null, null, null);
    }

    public static C2193571At9 fromTemplate(C2193571At9 c2193571At9, Throwable th) {
        return new C2193571At9(c2193571At9.type, c2193571At9.code, c2193571At9.error, c2193571At9.errorDescription, c2193571At9.errorUri, th);
    }

    public static C2193571At9 generalEx(int i, String str) {
        return new C2193571At9(0, i, null, str, null, null);
    }

    public static C2193571At9 registrationEx(int i, String str) {
        return new C2193571At9(4, i, str, null, null, null);
    }

    public static C2193571At9 tokenEx(int i, String str) {
        return new C2193571At9(2, i, str, null, null, null);
    }

    public static C2193571At9 fromOAuthTemplate(C2193571At9 c2193571At9, String str, String str2, Uri uri) {
        String str3 = str;
        String str4 = str2;
        Uri uri2 = uri;
        int i = c2193571At9.type;
        int i2 = c2193571At9.code;
        if (str3 == null) {
            str3 = c2193571At9.error;
        }
        if (str4 == null) {
            str4 = c2193571At9.errorDescription;
        }
        if (uri2 == null) {
            uri2 = c2193571At9.errorUri;
        }
        return new C2193571At9(i, i2, str3, str4, uri2, null);
    }

    public C2193571At9(int i, int i2, String str, String str2, Uri uri, Throwable th) {
        super(str2, th);
        this.type = i;
        this.code = i2;
        this.error = str;
        this.errorDescription = str2;
        this.errorUri = uri;
    }
}
