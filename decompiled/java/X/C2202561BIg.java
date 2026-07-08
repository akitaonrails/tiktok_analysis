package X;

import android.os.Bundle;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import kotlin.text.Charsets;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1BIg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2202561BIg {
    public static AuthenticationToken LIZJ(Bundle bundle, String str) {
        String string = bundle.getString("id_token");
        if (string != null && string.length() != 0 && str != null && str.length() != 0) {
            try {
                return new AuthenticationToken(string, str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw new C1BJO(e.getMessage(), e);
            }
        }
        return null;
    }

    public static AccessToken LIZ(Bundle bundle, C1BJ0 c1bj0, String str) {
        String string;
        Date dateLJII = C0W7Q.LJII(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date dateLJII2 = C0W7Q.LJII(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
        if (string2 != null && string2.length() != 0 && (string = bundle.getString("com.facebook.platform.extra.USER_ID")) != null && string.length() != 0) {
            return new AccessToken(string2, str, string, stringArrayList, null, null, c1bj0, dateLJII, new Date(), dateLJII2, bundle.getString("graph_domain"));
        }
        return null;
    }

    public static AccessToken LIZIZ(Collection collection, Bundle bundle, C1BJ0 c1bj0, String str) {
        ArrayList arrayListLJ;
        ArrayList arrayListLJ2;
        Object[] array;
        Collection collectionLJ = collection;
        Date dateLJII = C0W7Q.LJII(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        if (string == null) {
            return null;
        }
        Date dateLJII2 = C0W7Q.LJII(bundle, "data_access_expiration_time", new Date(0L));
        String string2 = bundle.getString("granted_scopes");
        if (string2 != null && string2.length() > 0) {
            Object[] array2 = a0.LJJLIIIJILLIZJL(string2, new String[]{","}, 0, 6).toArray(new String[0]);
            if (array2 != null) {
                String[] strArr = (String[]) array2;
                collectionLJ = C1697810uHb.LJ(Arrays.copyOf(strArr, strArr.length));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        String string3 = bundle.getString("denied_scopes");
        if (string3 != null && string3.length() > 0) {
            Object[] array3 = a0.LJJLIIIJILLIZJL(string3, new String[]{","}, 0, 6).toArray(new String[0]);
            if (array3 != null) {
                String[] strArr2 = (String[]) array3;
                arrayListLJ = C1697810uHb.LJ(Arrays.copyOf(strArr2, strArr2.length));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            arrayListLJ = null;
        }
        String string4 = bundle.getString("expired_scopes");
        if (string4 != null && string4.length() > 0) {
            Object[] array4 = a0.LJJLIIIJILLIZJL(string4, new String[]{","}, 0, 6).toArray(new String[0]);
            if (array4 != null) {
                String[] strArr3 = (String[]) array4;
                arrayListLJ2 = C1697810uHb.LJ(Arrays.copyOf(strArr3, strArr3.length));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            arrayListLJ2 = null;
        }
        if (C0W7Q.LJIILL(string)) {
            return null;
        }
        String string5 = bundle.getString("graph_domain");
        String string6 = bundle.getString("signed_request");
        if (string6 != null && string6.length() != 0) {
            try {
                array = a0.LJJLIIIJILLIZJL(string6, new String[]{e3.d}, 0, 6).toArray(new String[0]);
            } catch (UnsupportedEncodingException | JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (array != null) {
                String[] strArr4 = (String[]) array;
                if (strArr4.length == 2) {
                    return new AccessToken(string, str, new JSONObject(new String(Base64.decode(strArr4[1], 0), Charsets.UTF_8)).getString("user_id"), collectionLJ, arrayListLJ, arrayListLJ2, c1bj0, dateLJII, new Date(), dateLJII2, string5);
                }
                throw new C1BJO("Failed to retrieve user_id from signed_request");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new C1BJO("Authorization response does not contain the signed_request");
    }
}
