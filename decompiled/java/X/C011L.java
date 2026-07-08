package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.011L, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C011L {
    public static final C011L LIZ = new C011L();

    public static String LIZ(String str) {
        Object obj;
        boolean z;
        String string;
        try {
            Uri uri = UriProtector.parse(str);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                string = str;
            } else {
                string = uri.buildUpon().appendQueryParameter("enter_from", "gift_panel_bubble").build().toString();
            }
            C189200o6.m2constructorimpl(string);
            obj = string;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        Object obj2 = str;
        if (!C189200o6.m7isFailureimpl(obj)) {
            obj2 = obj;
        }
        return (String) obj2;
    }
}
