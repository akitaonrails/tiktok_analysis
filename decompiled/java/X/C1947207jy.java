package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07jy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1947207jy {
    public static String LIZJ(String str) {
        String strLIZIZ = LIZIZ(true, C1946007jm.LJ(str));
        if (strLIZIZ != null) {
            return strLIZIZ;
        }
        return str;
    }

    public static final String LIZ(Uri uri, String str) {
        String string;
        String string2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
        boolean z = false;
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && (string2 = a0.LJLIIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).toString()) != null && string2.length() == 0) {
            z = true;
        }
        if (!z) {
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                string = a0.LJLIIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).toString();
            } else {
                string = null;
            }
            if (!Intrinsics.LJFF(string, "null")) {
                return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
            }
        }
        return null;
    }

    public static final String LIZIZ(boolean z, Uri uri) {
        String strLIZ = LIZ(uri, "channel");
        if (strLIZ == null) {
            String strLIZ2 = LIZ(uri, "url");
            if (strLIZ2 == null) {
                String strLIZ3 = LIZ(uri, "surl");
                if (strLIZ3 == null) {
                    if (z) {
                        return null;
                    }
                    return uri.toString();
                }
                return strLIZ3;
            }
            return strLIZ2;
        }
        return strLIZ;
    }
}
