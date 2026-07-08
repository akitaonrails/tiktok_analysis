package X;

import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import java.util.Collections;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0X8W, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0X8W extends AbstractC1544900qIy {
    @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
    public final String LJ() {
        return "const iframe = document.querySelector(atob(getClientContext().query));\nif (iframe && iframe.contentWindow) {\n    iframe.contentWindow.postMessage(getClientContext().data, atob(getClientContext().encodeIFrameUrl));\n}\n";
    }

    @Override // X.AbstractC1544900qIy
    public final String LJI() {
        return "_jsmanage_xbridge_iframe_callback";
    }

    @Override // X.InterfaceC1544830qIr
    public final JSInjectConfig LIZ() {
        return new JSInjectConfig("_jsmanage_xbridge_iframe_callback", "custom_manual", 4, Collections.singletonList(e3.d), C13BV.INSTANCE, "https://lf16-gecko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/tt/webview/js_manage/tiktok_webview_js_inject_manage/assets/js/xbridge_iframe_callback.js", null, null, null, false, 448, null);
    }
}
