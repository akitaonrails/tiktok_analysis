package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.07kA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1948407kA {
    public static final C1948407kA LIZ = new C1948407kA();

    public static String LIZ(String str, Map map) {
        if (!u.LJJIIJZLJL(str, "http", true) && !u.LJJIIJZLJL(str, "aweme://roma", true)) {
            if (u.LJJIIJZLJL(str, "aweme://webview", true)) {
                Uri uriLIZIZ = UriProtector.parse(str);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZIZ, "url");
                if (C1948507kB.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                    Uri uriLIZIZ2 = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                        C1948407kA c1948407kA = LIZ;
                        String str2 = (String) entry.getKey();
                        String str3 = (String) entry.getValue();
                        c1948407kA.getClass();
                        uriLIZIZ2 = LIZIZ(uriLIZIZ2, str2, str3);
                    }
                    uriLIZIZ = LIZIZ(uriLIZIZ, "url", uriLIZIZ2.buildUpon().build().toString());
                }
                return uriLIZIZ.buildUpon().toString();
            }
            return str;
        }
        Uri uriLIZIZ3 = UriProtector.parse(str);
        for (Map.Entry entry2 : ((LinkedHashMap) map).entrySet()) {
            C1948407kA c1948407kA2 = LIZ;
            String str4 = (String) entry2.getKey();
            String str5 = (String) entry2.getValue();
            c1948407kA2.getClass();
            uriLIZIZ3 = LIZIZ(uriLIZIZ3, str4, str5);
        }
        return uriLIZIZ3.buildUpon().toString();
    }

    public static Uri LIZIZ(Uri uri, String str, String str2) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        boolean z = false;
        for (String str3 : UriProtector.getQueryParameterNames(uri)) {
            if (!Intrinsics.LJFF(str3, str)) {
                builderBuildUpon.appendQueryParameter(str3, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str3));
            } else {
                builderBuildUpon.appendQueryParameter(str, str2);
                z = true;
            }
        }
        if (!z) {
            builderBuildUpon.appendQueryParameter(str, str2);
        }
        return builderBuildUpon.build();
    }
}
