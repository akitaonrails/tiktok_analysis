package X;

import android.app.Activity;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ILoginService;

/* JADX INFO: renamed from: X.0XMM, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XMM extends C0XMO {
    @Override // X.C0XMO
    public final void LIZ(Uri uri) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("event_type", "logout");
            c2344009Gk.LJIIIIZZ("enter_from", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            C20684815ws.LJIILLIIL("hydrogen_event", c2344009Gk.LIZ);
            ILoginService iLoginServiceLIZJ = C0XQ7.LIZJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            sbLIZ.append("_hydrogen");
            iLoginServiceLIZJ.logout(C2188811AlT.LIZIZ(sbLIZ), "user_logout");
            return;
        }
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLJFF);
            c1389890mGx.LJIIJ("Logout url parameter is invalid. Please add enter_from.");
            c1389890mGx.LJIIJJI();
        }
    }
}
