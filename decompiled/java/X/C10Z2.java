package X;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;

/* JADX INFO: renamed from: X.10Z2, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10Z2 extends AbstractC1893900zNs {
    @Override // X.InterfaceC19271510aP
    public final String getName() {
        return "one_link_handler";
    }

    public C10Z2(InterfaceC1879420z0W interfaceC1879420z0W) {
        super(interfaceC1879420z0W);
    }

    @Override // X.InterfaceC19271510aP
    public final boolean LIZIZ(int i, String str) {
        Activity activityLJFF;
        if (str == null || TextUtils.isEmpty(str)) {
            return false;
        }
        Uri uri = UriProtector.parse(str);
        if (!TextUtils.equals("snssdk1180.onelink.me", uri.getHost()) && !TextUtils.equals("snssdk1233.onelink.me", uri.getHost()) && !TextUtils.equals("snssdk259.onelink.me", uri.getHost()) && !TextUtils.equals("snssdk473824.onelink.me", uri.getHost()) && !TextUtils.equals("snssdk845221.onelink.me", uri.getHost())) {
            return false;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "af_dp");
        if (!C2431009fo.LIZJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) || (activityLJFF = C2214201BlK.LJFF()) == null) {
            return false;
        }
        new C1909590znB().LIZ(activityLJFF, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        return true;
    }
}
