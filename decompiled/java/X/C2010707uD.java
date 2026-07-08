package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07uD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2010707uD {
    public static final String LJI(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return "";
    }

    public static final String LIZIZ(String str, Map<String, Object> map) {
        boolean z;
        try {
            Uri uri = UriProtector.parse(str);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "trackParams");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && !a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return LIZ(Uri.encode(C1741890vQh.LJIIIIZZ(map)), str, "trackParams");
            }
            JSONObject jSONObject = new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.get(next));
            }
            return String.valueOf(LIZJ(uri, "trackParams", C1741890vQh.LJIIIIZZ(map)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return str;
        }
    }

    public static final void LIZLLL(String str, Map<String, ? extends Object> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        LJ(str, jSONObject);
    }

    public static final void LJ(String str, JSONObject jSONObject) throws JSONException {
        jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZLLL(str, jSONObject);
    }

    public static final void LJFF(C2344009Gk c2344009Gk, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((HashMap) c2344009Gk.LIZ).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        LJ(str, jSONObject);
    }

    public static final String LIZ(Object obj, String str, String str2) {
        if (obj == null) {
            obj = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('&');
        sbLIZ.append(str2);
        sbLIZ.append('=');
        sbLIZ.append(obj);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Uri LIZJ(Uri uri, String str, String str2) {
        if (uri != null && !uri.isOpaque()) {
            try {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str) != null) {
                    builderBuildUpon.clearQuery();
                    for (String str3 : UriProtector.getQueryParameterNames(uri)) {
                        if (!Intrinsics.LJFF(str3, str)) {
                            Iterator<String> it2 = UriProtector.getQueryParameters(uri, str3).iterator();
                            while (it2.hasNext()) {
                                builderBuildUpon.appendQueryParameter(str3, it2.next());
                            }
                        }
                    }
                }
                return builderBuildUpon.appendQueryParameter(str, str2).build();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return uri;
    }
}
