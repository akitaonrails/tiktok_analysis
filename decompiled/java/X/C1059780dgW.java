package X;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.ies.web.jsbridge.IESJsBridge;

/* JADX INFO: renamed from: X.0dgW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1059780dgW {
    public static final View LIZ(C1059860dge c1059860dge) {
        WebView webView;
        InterfaceC1541990qEH interfaceC1541990qEH;
        View viewE1;
        if (c1059860dge == null) {
            return null;
        }
        C1051660dTQ c1051660dTQ = (C1051660dTQ) c1059860dge.LIZ(C1051660dTQ.class);
        if (c1051660dTQ != null && (interfaceC1541990qEH = (InterfaceC1541990qEH) c1051660dTQ.LIZIZ(InterfaceC1541990qEH.class)) != null && (viewE1 = interfaceC1541990qEH.e1()) != null) {
            return viewE1;
        }
        IESJsBridge iESJsBridge = (IESJsBridge) c1059860dge.LIZ(IESJsBridge.class);
        if (iESJsBridge != null && (webView = iESJsBridge.LIZ) != null) {
            return webView;
        }
        View view = (View) c1059860dge.LIZ(View.class);
        if (view == null) {
            return null;
        }
        return view;
    }
}
