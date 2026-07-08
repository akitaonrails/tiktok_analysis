package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;

/* JADX INFO: renamed from: X.07jX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1944507jX {
    public static final C1944607jY LIZ(String str) {
        HashMap map;
        if (TextUtils.isEmpty(str)) {
            map = new HashMap();
        } else {
            Uri uri = UriProtector.parse(str);
            map = new HashMap();
            for (String str2 : UriProtector.getQueryParameterNames(uri)) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2);
                if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                    map.put(str2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                }
            }
        }
        return new C1944607jY(map, UriProtector.parse(str).buildUpon().clearQuery());
    }
}
