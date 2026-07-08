package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0W77, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W77 {
    public static void LIZ(String str) {
        Uri uri;
        List<String> pathSegments;
        if (!TextUtils.isEmpty(str) && str.startsWith("aweme://user/profile/") && (pathSegments = (uri = UriProtector.parse(str)).getPathSegments()) != null && pathSegments.size() >= 2) {
            String str2 = (String) ListProtector.get(pathSegments, 1);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sec_uid");
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                C0W75.LIZ().LJI(str2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            }
        }
    }
}
