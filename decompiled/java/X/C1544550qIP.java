package X;

import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0qIP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1544550qIP extends AbstractC1544900qIy {
    @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
    public final String LJ() {
        return "window.mbj_test_manual = 'isUseHardCode=true，mbj_test_inlinewithparam，context：' + JSON.stringify(getClientContext())";
    }

    @Override // X.AbstractC1544900qIy
    public final String LJI() {
        return "_jsmanage_mbj_test_manual";
    }

    @Override // X.InterfaceC1544830qIr
    public final JSInjectConfig LIZ() {
        return new JSInjectConfig(null, null, 0, null, null, null, null, null, null, false, 1023, null);
    }

    @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
    public final String LJFF(Uri uri, WebView webView) {
        Object c098200Yq;
        try {
            InterfaceC1544560qIQ interfaceC1544560qIQ = C1544770qIl.LIZJ;
            if (interfaceC1544560qIQ != null) {
                c098200Yq = (JSInjectConfig) interfaceC1544560qIQ.LIZ("_jsmanage_mbj_test_manual", JSInjectConfig.class, new JSInjectConfig(null, null, 0, null, null, null, null, null, null, false, 1023, null));
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), c098200Yq);
    }
}
