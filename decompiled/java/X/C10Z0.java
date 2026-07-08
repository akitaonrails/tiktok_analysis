package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* JADX INFO: renamed from: X.10Z0, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10Z0 {
    public static String LIZ(String str) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!str.contains("microapp") && !str.contains("microgame")) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Uri uri = UriProtector.parse(str);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "android_scheme");
            if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "ios_scheme");
            }
            if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                return str;
            }
            try {
                uri = UriProtector.parse(URLDecoder.decode(str, "UTF8"));
            } catch (UnsupportedEncodingException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter + "&app_id=" + UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "app_id") + "&token=" + UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "token") + "&channel=" + UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "channel") + "&iid=" + UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "iid");
        }
        return str;
    }

    public static String LIZIZ(String str) {
        try {
            return ((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJLIIL(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }
}
