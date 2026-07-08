package X;

import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import java.util.Collections;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0dFo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1043220dFo extends AbstractC1544900qIy {
    @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
    public final String LJ() {
        return "window.__autoFillCallback__(getClientContext())";
    }

    @Override // X.AbstractC1544900qIy
    public final String LJI() {
        return "_jsmanage_auto_fill_callback";
    }

    @Override // X.InterfaceC1544830qIr
    public final JSInjectConfig LIZ() {
        return new JSInjectConfig("_jsmanage_auto_fill_callback", "custom_manual", 1, Collections.singletonList(e3.d), C13BV.INSTANCE, "https://lf16-gecko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/tt/webview/js_manage/tiktok_webview_js_inject_manage/assets/js/auto_fill_callback.js", null, null, null, true, 448, null);
    }
}
