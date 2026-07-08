package X;

import android.app.Activity;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0KbP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C520650KbP {
    public static void LIZ(Activity activity) {
        Uri data;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        if (activity.getIntent() != null && activity.getIntent().getData() != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter((data = activity.getIntent().getData()), "from")) != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.contains("com.tt.miniapp") && "1".equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(data, "isNeedRTLAnim")) && C444960Hcc.LIZJ(activity)) {
            C786410Ut5.ae(0, activity, R.anim.g0);
        }
    }
}
