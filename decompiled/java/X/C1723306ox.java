package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.06ox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1723306ox {
    public static final C1723306ox LIZ = new C1723306ox();

    public static final void LIZ(String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        if (str == null) {
            return;
        }
        try {
            Uri uri = UriProtector.parse(str);
            Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
            if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                for (String str2 : queryParameterNames) {
                    if (str2 != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2)) != null) {
                        jSONObject.put(str2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    }
                }
                if (jSONObject.length() <= 0) {
                    return;
                }
                C0W75 c0w75LIZ = C0W75.LIZ();
                String path = uri.getPath();
                c0w75LIZ.getClass();
                C0W75.LJ(path, jSONObject);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
