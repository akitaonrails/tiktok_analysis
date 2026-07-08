package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0X98, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X98 extends AbstractC2420009e2 {
    @Override // X.AbstractC2420009e2
    public final boolean LJII(String str, String str2) {
        return Intrinsics.LJFF(str, "chat");
    }

    @Override // X.AbstractC2420009e2
    public final void LJ(Activity activity, Uri uri, boolean z) {
        Uri uriBuild;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "multi_account_push_uid");
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            Intent intentLIZ = C0X99.LIZ(activity, null, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intentLIZ, "Context_startActivity_1");
            C1701330uNH.LIZ(intentLIZ, activity);
            C2204961BRm.LJIILLIIL(activity, intentLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu4c9HnjWpdZV3/EfRLGIf1VNg=", null));
            return;
        }
        if (C1336205Ku.LIZ(false).getImChatService().LIZJ(activity, uri)) {
            return;
        }
        if (((Number) C258570ABj.LIZ.getValue()).intValue() == 1) {
            uriBuild = uri.buildUpon().scheme("aweme").build();
        } else {
            uriBuild = uri;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, uriBuild.toString());
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "outer_push";
        }
        smartRouteBuildRoute.withParam("enter_from", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_method");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "cell";
        }
        smartRouteBuildRoute.withParam("enter_method", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
        smartRouteBuildRoute.open();
    }
}
