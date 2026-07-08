package X;

import android.view.View;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;

/* JADX INFO: renamed from: X.0dqg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1066080dqg {
    public static final String LIZ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
        View viewE1;
        C1537710q7N c1537710q7N;
        View viewE12;
        WebKitView webKitView;
        String url = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getUrl();
        if (url == null) {
            return null;
        }
        InterfaceC1541990qEH kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
        if (kitView != null && (viewE12 = kitView.e1()) != null && (viewE12 instanceof WebKitView) && (viewE12 instanceof WebKitView) && (webKitView = (WebKitView) viewE12) != null) {
            return webKitView.getRawUrl();
        }
        InterfaceC1541990qEH kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
        if (kitView2 != null && (viewE1 = kitView2.e1()) != null && (viewE1 instanceof C1537710q7N) && (viewE1 instanceof C1537710q7N) && (c1537710q7N = (C1537710q7N) viewE1) != null) {
            return c1537710q7N.getRawUrl();
        }
        return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(url), "url");
    }
}
