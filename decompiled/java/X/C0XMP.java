package X;

import android.app.Activity;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;

/* JADX INFO: renamed from: X.0XMP, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XMP extends C0XMO {
    @Override // X.C0XMO
    public final void LIZ(Uri uri) {
        Activity activityLJFF = C2214201BlK.LJFF();
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "message");
        if (activityLJFF != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLJFF);
            c1389890mGx.LJIIJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            c1389890mGx.LJIIJJI();
        }
    }
}
