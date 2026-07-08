package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Map;

/* JADX INFO: renamed from: X.0JK3, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public abstract class C0JK3 implements InterfaceC490020JJo {
    @Override // X.InterfaceC490020JJo
    public boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
        Uri uri;
        Uri uri2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        for (C0JK4 c0jk4 : LIZ()) {
            if (c0jk4.LIZIZ == C0JKP.COMPULSORY && ((uri2 = c2436109gd.LIZ) == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, c0jk4.LIZ)) == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0)) {
                C0K74.LIZ(EnumC490130JJz.MISSING_COMPULSORY_PARAM, c2436109gd.LIZ, null, "");
                return false;
            }
            if (c0jk4.LIZIZ == C0JKP.IMPORTANT && (uri = c2436109gd.LIZ) != null) {
                UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, c0jk4.LIZ);
            }
        }
        C0K74.LIZIZ(c2436109gd.LIZ, null);
        return false;
    }
}
