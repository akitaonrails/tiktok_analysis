package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;

/* JADX INFO: renamed from: X.0KAz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513270KAz {
    public static C0KYM LIZ(String str) {
        C0KYM c0kym = new C0KYM();
        Uri uri = UriProtector.parse(str);
        Uri.Builder builder = c0kym.LIZIZ;
        if (builder != null) {
            builder.scheme(uri.getScheme());
        }
        Uri.Builder builder2 = c0kym.LIZIZ;
        if (builder2 != null) {
            builder2.authority(uri.getAuthority());
        }
        for (String str2 : UriProtector.getQueryParameterNames(uri)) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2);
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                c0kym.LJII(str2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            }
        }
        return c0kym;
    }
}
