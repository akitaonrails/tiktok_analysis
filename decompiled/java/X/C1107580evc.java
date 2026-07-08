package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;

/* JADX INFO: renamed from: X.0evc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1107580evc {
    public static final String LIZ(Uri uri) {
        Uri uri2;
        String strLIZIZ = LIZIZ(uri);
        if (strLIZIZ != null && (uri2 = UriProtector.parse(strLIZIZ)) != null) {
            return uri2.buildUpon().clearQuery().build().getPath();
        }
        return null;
    }

    public static final String LIZIZ(Uri uri) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "surl");
        }
        return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
    }

    public static final String LIZJ(Uri uri) {
        Uri uri2;
        String strLIZIZ = LIZIZ(uri);
        if (strLIZIZ != null && (uri2 = UriProtector.parse(strLIZIZ)) != null) {
            return uri2.buildUpon().clearQuery().build().toString();
        }
        return null;
    }

    public static final String LIZLLL(String str) {
        return LIZJ(UriProtector.parse(str));
    }
}
