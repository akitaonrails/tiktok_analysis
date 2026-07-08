package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0qEx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1542410qEx {
    public static int LIZ(String str) {
        try {
            Uri uri = UriProtector.parse(str);
            String host = uri.getHost();
            if (host != null && u.LJIIZILJ(host, "_page", false)) {
                return 1;
            }
            String host2 = uri.getHost();
            if (host2 != null && u.LJIIZILJ(host2, "_popup", false)) {
                return 2;
            }
            String host3 = uri.getHost();
            if (host3 == null || !u.LJIIZILJ(host3, "_card", false)) {
                String host4 = uri.getHost();
                if (host4 == null) {
                    return 1;
                }
                if (!u.LJIIZILJ(host4, "_xr", false)) {
                    return 1;
                }
                return 4;
            }
            return 3;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 1;
        }
    }

    public static String LIZIZ(Uri uri, String str) {
        String strLIZIZ;
        String strLIZIZ2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        if (uri != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
            return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        }
        if (uri != null) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && (strLIZIZ2 = LIZIZ(C1537540q76.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2), str)) != null) {
                return strLIZIZ2;
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "surl");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null && (strLIZIZ = LIZIZ(C1537540q76.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3), str)) != null) {
                return strLIZIZ;
            }
        }
        return null;
    }
}
