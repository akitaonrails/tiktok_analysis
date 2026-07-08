package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.incentive.crossplatform.experiment.PageConfig;
import com.ss.android.ugc.incentive.crossplatform.experiment.TaskPageRefactorConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0zNO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893600zNO {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ() {
        C01GW c01gw = C0C8W.LIZ;
        if (((String) c01gw.getValue()).length() == 0) {
            return "";
        }
        C01GW c01gw2 = C0C8X.LIZ;
        if (((String) c01gw2.getValue()).length() == 0) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) c01gw.getValue());
        sbLIZ.append('/');
        sbLIZ.append((String) c01gw2.getValue());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LIZJ(Uri uri) {
        String path = uri.getPath();
        if (path == null || !u.LJIIZILJ(path, "template.js", false)) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(Uri uri) {
        String path = uri.getPath();
        if (path == null || !u.LJIIZILJ(path, ".html", false)) {
            return false;
        }
        return true;
    }

    public static String LJI(String str) {
        try {
            Uri uriBuild = UriProtector.parse(str);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriBuild, "surl");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriBuild, "url") == null) {
                Uri.Builder builderBuildUpon = uriBuild.buildUpon();
                builderBuildUpon.appendQueryParameter("url", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                uriBuild = builderBuildUpon.build();
            }
            return uriBuild.toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }

    public static String LJFF(String str, HashMap map) {
        boolean z;
        C01GW c01gw = C1893610zNP.LIZIZ;
        if (((TaskPageRefactorConfig) c01gw.getValue()).enablePageRedirect && !((TaskPageRefactorConfig) c01gw.getValue()).pageReplaceInfos.isEmpty()) {
            try {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "url");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    return str;
                }
                Uri uri = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                String path = uri.getPath();
                boolean z2 = false;
                if (path != null && path.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return str;
                }
                for (PageConfig pageConfig : map.values()) {
                    if (u.LJIIZILJ(path, pageConfig.sourcePagePath, false)) {
                        String str2 = pageConfig.targetPagePathWithParams;
                        String strLIZ = LIZ(uri, UriProtector.parse(str2), pageConfig);
                        if (strLIZ.length() == 0) {
                            z2 = true;
                        }
                        if (z2) {
                            return str;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strLIZ);
                        sbLIZ.append('/');
                        sbLIZ.append(str2);
                        str = LJ(str, C2188811AlT.LIZIZ(sbLIZ), pageConfig);
                        return str;
                    }
                }
                return str;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return str;
    }

    public static String LIZ(Uri uri, Uri uri2, PageConfig pageConfig) {
        boolean z;
        String path = uri.getPath();
        if (path != null && path.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "";
        }
        if (LIZLLL(uri) && LIZJ(uri2)) {
            return LIZIZ();
        }
        if (LIZLLL(uri) && LIZLLL(uri2)) {
            if (pageConfig.useSourceHostAndPathPrefix) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(uri.getScheme());
                sbLIZ.append("://");
                sbLIZ.append(uri.getAuthority());
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return (String) C0C8Q.LIZ.getValue();
        }
        if (LIZJ(uri) && LIZJ(uri2)) {
            if (pageConfig.useSourceHostAndPathPrefix) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('/');
                sbLIZ2.append(pageConfig.sourcePagePath);
                return builderBuildUpon.path(a0.LJJJLL(C2188811AlT.LIZIZ(sbLIZ2), path)).clearQuery().build().toString();
            }
            return LIZIZ();
        }
        if (!LIZJ(uri) || !LIZLLL(uri2)) {
            return "";
        }
        return (String) C0C8Q.LIZ.getValue();
    }

    public static String LJ(String str, String str2, PageConfig pageConfig) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        try {
            Uri uri = UriProtector.parse(str);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return str;
            }
            Uri uri2 = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            Uri uri3 = UriProtector.parse(str2);
            Uri.Builder builderBuildUpon = uri3.buildUpon();
            Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri2);
            Set<String> queryParameterNames2 = UriProtector.getQueryParameterNames(uri3);
            for (String str3 : queryParameterNames) {
                if (!pageConfig.needMergeUrlParams && !pageConfig.forceInheritedUrlParamsKeys.contains(str3)) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (z5 && !pageConfig.neverInheritedUrlParamsKeys.contains(str3)) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6 && !queryParameterNames2.contains(str3)) {
                    Iterator<String> it2 = UriProtector.getQueryParameters(uri2, str3).iterator();
                    while (it2.hasNext()) {
                        builderBuildUpon.appendQueryParameter(str3, it2.next());
                    }
                }
            }
            Uri uriBuild = builderBuildUpon.build();
            String str4 = pageConfig.targetPageSchemaHost;
            if (str4.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return str;
            }
            Uri.Builder builderClearQuery = uri.buildUpon().authority(str4).clearQuery();
            Map<String, String> mapLIZ = pageConfig.LIZ();
            for (String str5 : UriProtector.getQueryParameterNames(uri)) {
                if (str5 != null) {
                    int iHashCode = str5.hashCode();
                    if (iHashCode != -1883856682) {
                        if (iHashCode != 116079) {
                            if (iHashCode == 3542044 && str5.equals("surl")) {
                                builderClearQuery.appendQueryParameter(str5, uriBuild.toString());
                            }
                        } else if (str5.equals("url")) {
                            builderClearQuery.appendQueryParameter(str5, uriBuild.toString());
                        }
                    } else if (str5.equals("origin_url")) {
                        builderClearQuery.appendQueryParameter(str5, uriBuild.toString());
                    }
                }
                if (!pageConfig.needMergeSchemaParams && !pageConfig.forceInheritedSchemaKeys.contains(str5)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3 && !pageConfig.neverInheritedSchemaParamsKeys.contains(str5)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && !mapLIZ.containsKey(str5)) {
                    Iterator<String> it3 = UriProtector.getQueryParameters(uri, str5).iterator();
                    while (it3.hasNext()) {
                        builderClearQuery.appendQueryParameter(str5, it3.next());
                    }
                }
            }
            for (Map.Entry entry : ((LinkedHashMap) mapLIZ).entrySet()) {
                builderClearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            return builderClearQuery.build().toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }
}
