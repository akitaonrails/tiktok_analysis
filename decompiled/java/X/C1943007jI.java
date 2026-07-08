package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.07jI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1943007jI {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZJ(String str) {
        boolean z;
        boolean z2 = true;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "/";
        }
        String path = "";
        try {
            path = UriProtector.parse(str).getPath();
            if (path != null && path.length() != 0) {
                z2 = false;
            }
            if (z2) {
                path = "/";
            } else if (!u.LJJIIJZLJL(path, "/", false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('/');
                sbLIZ.append(path);
                path = C2188811AlT.LIZIZ(sbLIZ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (path == null) {
            return "/";
        }
        return path;
    }

    public static boolean LIZLLL(String str) {
        if (str != null && str.length() != 0 && a0.LJJIIZI(str, "://", false)) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(String str) {
        if (str.length() == 0 || Intrinsics.LJFF(str, "/") || Intrinsics.LJFF(str, "/home")) {
            return true;
        }
        return false;
    }

    public static final String LJFF(String str) {
        String strLJJLIL = a0.LJJLIL(str, "#", "");
        String string = a0.LJLIIIL(a0.LJJZ(strLJJLIL, "?", strLJJLIL)).toString();
        if (!u.LJJIIJZLJL(string, "/", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('/');
            sbLIZ.append(string);
            string = C2188811AlT.LIZIZ(sbLIZ);
        }
        String strLJJJLL = a0.LJJJLL("/", string);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("standardizeHash, uri:");
        sbLIZ2.append(str);
        sbLIZ2.append(", result:");
        sbLIZ2.append(strLJJJLL);
        C2188811AlT.LIZIZ(sbLIZ2);
        return strLJJJLL;
    }

    public static String LIZIZ(String str, Map map) {
        boolean z;
        Uri uri;
        boolean z2;
        boolean z3 = true;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return str;
        }
        try {
            uri = UriProtector.parse(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            uri = null;
        }
        if (uri == null) {
            return str;
        }
        String encodedPath = uri.getEncodedPath();
        if (encodedPath == null) {
            encodedPath = "";
        }
        String fragment = uri.getFragment();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str2 : UriProtector.getQueryParameterNames(uri)) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2);
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
            }
            linkedHashMap.put(str2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(linkedHashMap.entrySet(), "&", null, null, 0, null, AFwS229S0000000_2.get$arr$(708), 30);
        if (strLJJLIIIJ.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(encodedPath);
            sbLIZ.append('?');
            sbLIZ.append(strLJJLIIIJ);
            encodedPath = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (encodedPath != null && encodedPath.length() != 0) {
            z3 = false;
        }
        if (!z3 && C123100dR.LIZ(fragment)) {
            if (!u.LJIIZILJ(encodedPath, "#", false)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(encodedPath);
                sbLIZ2.append('#');
                sbLIZ2.append(fragment);
                encodedPath = C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(encodedPath);
                sbLIZ3.append(fragment);
                encodedPath = C2188811AlT.LIZIZ(sbLIZ3);
            }
        }
        if (encodedPath == null) {
            return "";
        }
        return encodedPath;
    }

    public static Uri LJI(Uri uri, String str) {
        if (uri == null) {
            return null;
        }
        try {
            Uri.Builder builderBuildUpon = uri.buildUpon();
            builderBuildUpon.clearQuery();
            Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
            if (queryParameterNames != null) {
                for (String str2 : queryParameterNames) {
                    if (Intrinsics.LJFF(str2, "_tiktok_minis_params")) {
                        builderBuildUpon.appendQueryParameter(str2, str);
                    } else {
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2);
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                            builderBuildUpon.appendQueryParameter(str2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                        }
                    }
                }
            }
            if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "_tiktok_minis_params") == null) {
                builderBuildUpon.appendQueryParameter("_tiktok_minis_params", str);
            }
            return builderBuildUpon.build();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return uri;
        }
    }

    public static String LIZ(String str, String str2, String str3) {
        try {
            return UriProtector.parse(str).buildUpon().appendQueryParameter(str2, str3).build().toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }
}
