package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.018G, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C018G {
    public static List<String> LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return UriProtector.parse(str).getPathSegments();
    }

    public static Map<String, String> LIZJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap();
        }
        Uri uri = UriProtector.parse(str);
        HashMap map = new HashMap();
        for (String str2 : UriProtector.getQueryParameterNames(uri)) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2);
            if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                map.put(str2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            }
        }
        return map;
    }

    public static String LIZIZ(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), str2);
    }

    public static boolean LIZLLL(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        Uri uri = UriProtector.parse(str);
        Uri uri2 = UriProtector.parse(str2);
        if (!TextUtils.equals(uri.getScheme(), uri2.getScheme()) || !TextUtils.equals(uri.getHost(), uri2.getHost())) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        List<String> pathSegments2 = uri2.getPathSegments();
        if (pathSegments.size() != pathSegments2.size()) {
            return false;
        }
        int size = pathSegments.size();
        for (int i = 0; i < size; i++) {
            if (!((String) ListProtector.get(pathSegments, i)).startsWith(":") && !((String) ListProtector.get(pathSegments, i)).equals(ListProtector.get(pathSegments2, i))) {
                return false;
            }
        }
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        if (queryParameterNames != null && queryParameterNames.size() != 0) {
            Set<String> queryParameterNames2 = UriProtector.getQueryParameterNames(uri2);
            Iterator<String> it2 = queryParameterNames.iterator();
            Iterator<String> it3 = queryParameterNames2.iterator();
            while (it2.hasNext()) {
                if (!it3.hasNext() || !TextUtils.equals(it2.next(), it3.next())) {
                    return false;
                }
            }
        }
        return true;
    }
}
