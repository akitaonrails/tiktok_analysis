package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;

/* JADX INFO: renamed from: X.0KYL, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KYL {
    public static C760370TsB LIZ(String str) {
        C760370TsB c760370TsB = new C760370TsB();
        Uri uri = UriProtector.parse(str);
        Uri.Builder builder = c760370TsB.LIZIZ;
        if (builder != null) {
            builder.scheme(uri.getScheme());
        }
        Uri.Builder builder2 = c760370TsB.LIZIZ;
        if (builder2 != null) {
            builder2.authority(uri.getAuthority());
        }
        for (String str2 : UriProtector.getQueryParameterNames(uri)) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2);
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                c760370TsB.LJJIFFI(str2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            }
        }
        return c760370TsB;
    }

    public static C760370TsB LIZIZ(String str) {
        C760370TsB c760370TsB = new C760370TsB();
        c760370TsB.LJIL(str);
        c760370TsB.LIZIZ.authority("lynxview_popup");
        return c760370TsB;
    }

    public static C760370TsB LIZJ(String str) {
        C760370TsB c760370TsB = new C760370TsB();
        c760370TsB.LJIL(str);
        c760370TsB.LIZIZ.authority("webview_popup");
        return c760370TsB;
    }
}
