package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.text.u;

/* JADX INFO: renamed from: X.01jm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C417201jm {
    public static final Uri LIZJ(Uri uri) {
        Uri uri2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null || (uri2 = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) == null || !uri2.isHierarchical()) {
            return null;
        }
        return uri2;
    }

    public static final boolean LIZLLL(Uri uri) {
        String host = uri.getHost();
        if (host == null) {
            return false;
        }
        return u.LJJIIJZLJL(host, "webview", false);
    }

    public static final Map<String, String> LJ(Uri uri) {
        String path;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String host = uri.getHost();
        boolean zLJJIIJZLJL = false;
        if (host != null) {
            zLJJIIJZLJL = u.LJJIIJZLJL(host, "lynxview", false);
        }
        String str = "";
        if (zLJJIIJZLJL) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "channel");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
            }
            linkedHashMap.put("lynx_channel", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "bundle");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
            }
            linkedHashMap.put("lynx_bundle", str);
        } else if (LIZLLL(uri)) {
            Uri uriLIZJ = LIZJ(uri);
            if (uriLIZJ != null && (path = uriLIZJ.getPath()) != null) {
                str = path;
            }
            linkedHashMap.put("h5_path", str);
            return linkedHashMap;
        }
        return linkedHashMap;
    }

    public static final Map<String, String> LJFF(Uri uri) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        if (queryParameterNames != null) {
            for (String str : queryParameterNames) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                    linkedHashMap.put(str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                }
            }
        }
        return linkedHashMap;
    }

    public static final Uri LIZ(Uri uri, Map<String, String> map) {
        Uri uriLIZ;
        if (LIZLLL(uri)) {
            Uri uriLIZJ = LIZJ(uri);
            if (uriLIZJ != null) {
                uriLIZ = LIZ(uriLIZJ, map);
            } else {
                uriLIZ = null;
            }
            return C416901jj.LIZIZ(uri, "url").buildUpon().appendQueryParameter("url", String.valueOf(uriLIZ)).build();
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builderBuildUpon.build();
    }

    public static final String LIZIZ(Uri uri, String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Uri uriLIZJ = LIZJ(uri);
        if (uriLIZJ == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZJ, str)) == null) {
            return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
        }
        return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
    }

    public static final Uri LJI(Uri uri, List<String> list) {
        Uri uriLJI;
        if (LIZLLL(uri)) {
            Uri uriLIZJ = LIZJ(uri);
            if (uriLIZJ != null) {
                uriLJI = LJI(uriLIZJ, list);
            } else {
                uriLJI = null;
            }
            ArrayList arrayList = new ArrayList(list);
            arrayList.add("url");
            return C416901jj.LIZJ(uri, arrayList).buildUpon().appendQueryParameter("url", String.valueOf(uriLJI)).build();
        }
        return C416901jj.LIZJ(uri, list);
    }
}
