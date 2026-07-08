package X;

import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import java.util.Collections;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0X7O, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0X7O extends AbstractC1544900qIy {
    @Override // X.AbstractC1544900qIy
    public final String LJI() {
        return "_jsmanage_shopify_commerce_channel";
    }

    @Override // X.InterfaceC1544830qIr
    public final JSInjectConfig LIZ() {
        return new JSInjectConfig("_jsmanage_shopify_commerce_channel", "custom_manual", 1, Collections.singletonList(e3.d), C13BV.INSTANCE, "https://lf16-gecko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/tt/webview/js_manage/tiktok_webview_js_inject_manage/assets/js/shopify_commerce_channel.js", null, null, null, true, 448, null);
    }

    @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
    public final String LJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("window.Shopify.CheckoutSheetProtocol.postMessage");
        sbLIZ.append("(getClientContext().eventType, getClientContext().data)");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
