package X;

import android.net.Uri;
import android.util.ArrayMap;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.011F, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C011F {
    public static String LIZ(String str, Map map) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        if (str != null && str.length() != 0) {
            Uri uri = UriProtector.parse(str);
            Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
            Uri.Builder builderBuildUpon = uri.buildUpon();
            builderBuildUpon.clearQuery();
            if (queryParameterNames != null) {
                for (String str2 : queryParameterNames) {
                    if (!((ArrayMap) map).keySet().contains(str2) && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2)) != null) {
                        builderBuildUpon.appendQueryParameter(str2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    }
                }
            }
            for (Map.Entry entry : ((ArrayMap) map).entrySet()) {
                builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            return builderBuildUpon.build().toString();
        }
        return null;
    }
}
