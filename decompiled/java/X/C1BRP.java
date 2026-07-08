package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BRP, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BRP {
    public static C1BRS LIZ(C1058910df7 c1058910df7, JSONObject jSONObject, IESJsBridge iESJsBridge, InterfaceC2204871BRd interfaceC2204871BRd, InterfaceC2204861BRc interfaceC2204861BRc) {
        JSONObject jSONObject2;
        String strOptString;
        String strOptString2;
        Uri uri;
        Set<String> queryParameterNames;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        if (c1058910df7 != null) {
            jSONObject2 = c1058910df7.LIZLLL;
        } else {
            jSONObject2 = null;
        }
        String string = "";
        if (jSONObject2 != null && (strOptString = c1058910df7.LIZLLL.optString("url", "")) != null && strOptString.length() != 0 && (strOptString2 = c1058910df7.LIZLLL.optString("method", "get")) != null && strOptString2.length() != 0 && TextUtils.equals(strOptString2.toLowerCase(Locale.getDefault()), "get")) {
            JSONObject jSONObjectOptJSONObject = c1058910df7.LIZLLL.optJSONObject("params");
            try {
                uri = UriProtector.parse(strOptString);
                queryParameterNames = UriProtector.getQueryParameterNames(uri);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                for (String str : queryParameterNames) {
                    if (str != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                        jSONObjectOptJSONObject.put(str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    }
                }
            } else if (jSONObjectOptJSONObject != null) {
            }
            if (jSONObjectOptJSONObject.length() > 0) {
                C0W75.LIZ().getClass();
                C0W75.LJ(strOptString, jSONObjectOptJSONObject);
            }
        }
        if (TextUtils.isEmpty(c1058910df7.LIZIZ)) {
            string = "v2";
        } else {
            try {
                string = JSONObjectProtectorUtils.getString(c1058910df7.LIZLLL, "proto");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        string.getClass();
        if (!string.equals("v2")) {
            return new C2204901BRg(c1058910df7, jSONObject, iESJsBridge, interfaceC2204871BRd, interfaceC2204861BRc);
        }
        return new C2204911BRh(c1058910df7, jSONObject, iESJsBridge, interfaceC2204871BRd, interfaceC2204861BRc);
    }
}
