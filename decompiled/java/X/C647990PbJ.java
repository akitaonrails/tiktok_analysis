package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;

/* JADX INFO: renamed from: X.0PbJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C647990PbJ {
    public static final C647990PbJ LIZ = new C647990PbJ();

    public static int LIZ(DynamicPatch dynamicPatch) {
        String str;
        String rawData;
        if (dynamicPatch != null && (str = dynamicPatch.schema) != null && str.length() != 0 && (rawData = dynamicPatch.getRawData()) != null && rawData.length() != 0) {
            Uri uri = UriProtector.parse(dynamicPatch.schema);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "channel");
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "bundle");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                if (C1552050qUV.LJIIZILJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                    return 0;
                }
                return 1;
            }
            return 2;
        }
        return 3;
    }
}
