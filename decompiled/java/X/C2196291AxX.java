package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.common.TiktokMinisQueryParams;

/* JADX INFO: renamed from: X.1AxX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2196291AxX {
    public static String LIZ(String str) {
        if (C2197221Az2.LIZ(str)) {
            return EnumC2196301AxY.MINI_GAME.getValue();
        }
        return EnumC2196301AxY.MINI_APP.getValue();
    }

    public static String LIZIZ(String str) {
        boolean z;
        TiktokMinisQueryParams tiktokMinisQueryParams;
        String string;
        Uri uri = UriProtector.parse(str);
        if (uri == null) {
            return str;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "_tiktok_minis_params");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            try {
                C1227904rF.LIZ.getClass();
                tiktokMinisQueryParams = (TiktokMinisQueryParams) C1227904rF.LIZIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, TiktokMinisQueryParams.class);
                if (tiktokMinisQueryParams == null) {
                    tiktokMinisQueryParams = new TiktokMinisQueryParams(null, null, null, null, null, null, null);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                tiktokMinisQueryParams = new TiktokMinisQueryParams(null, null, null, null, null, null, null);
            }
        } else {
            tiktokMinisQueryParams = new TiktokMinisQueryParams(null, null, null, null, null, null, null);
        }
        tiktokMinisQueryParams.enterFrom = "fyf_promotion_direct_feed_play";
        C1227904rF.LIZ.getClass();
        Uri uriLJI = C1943007jI.LJI(uri, C1227904rF.LJI(tiktokMinisQueryParams));
        if (uriLJI == null || (string = uriLJI.toString()) == null) {
            return str;
        }
        return string;
    }
}
