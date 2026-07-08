package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.deeplink.RequireLoginActivity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XQt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C848610XQt {
    public static Intent LIZ(Intent intent) {
        String string;
        Intent intent2 = new Intent();
        Uri data = intent.getData();
        if (data != null) {
            string = data.toString();
        } else {
            string = null;
        }
        C0XI4 c0xi4 = new C0XI4(string);
        c0xi4.LJ("random", new Random(1000L).toString());
        intent2.setData(UriProtector.parse(c0xi4.LJFF()));
        intent2.putExtras(intent);
        intent2.putExtra("inner_from", "require_login");
        return intent2;
    }

    public static boolean LIZIZ(Uri uri) {
        Uri uri2;
        if (uri != null) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "multi_account_push_uid");
            if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) && !Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
                return true;
            }
        }
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return false;
        }
        if (((IMandatoryLoginService) ServiceManager.get().getService(IMandatoryLoginService.class)).shouldShowForcedLogin(true)) {
            return true;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = null;
        if (uri != null) {
            if (Intrinsics.LJFF(uri.getHost(), "webview")) {
                C0X96.LIZ.getClass();
                if (TextUtils.equals(uri.getHost(), "webview") && UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url") != null && (uri2 = UriProtector.parse(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url"))) != null && !uri2.isOpaque()) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "awedp_require_login");
                }
            } else {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "awedp_require_login");
            }
        }
        return Intrinsics.LJFF("normal", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
    }

    public static void LIZJ(Activity activity, String str, C1962707mT c1962707mT) {
        boolean z;
        Intent intent = new Intent(activity, (Class<?>) RequireLoginActivity.class);
        if (c1962707mT != null && c1962707mT.LIZ) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            intent.putExtra("deep_link_intent", c1962707mT.LIZIZ);
        } else {
            intent.putExtra("deep_link_intent", activity.getIntent());
        }
        intent.putExtra("enter_from", str);
        intent.putExtra("is_new_procedure", true);
        C786410Ut5.ae(0, activity, 0);
        if (c1962707mT != null && c1962707mT.LIZ) {
            intent.putExtra("is_saf", true);
        }
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO6tZo/C1TxW+m6se6wTpPXkueRiPCS04uuSOSZj", null));
    }
}
