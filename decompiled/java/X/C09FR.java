package X;

import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.09FR, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09FR {
    public static final String LIZ(Uri uri, Bundle bundle, String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String string;
        String str2;
        String string2;
        String string3 = bundle.getString(str);
        if (string3 != null && (string2 = a0.LJLIIIL(string3).toString()) != null && string2.length() > 0) {
            str2 = string2;
        } else if (uri != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null && (string = a0.LJLIIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).toString()) != null && string.length() > 0) {
            str2 = string;
        } else {
            bundle.remove(str);
            return null;
        }
        C786410Ut5.LJJJI(str, str2, bundle);
        return str2;
    }
}
