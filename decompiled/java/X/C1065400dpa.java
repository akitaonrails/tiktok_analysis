package X;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AwS382S0200000_16;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dpa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1065400dpa extends AbstractC1065420dpc {
    @Override // X.AbstractC1549150qPp
    public final boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        return true;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        WebView webView;
        InterfaceC1065410dpb interfaceC1065410dpb = (InterfaceC1065410dpb) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC1065410dpb.getAb_test_names() == null) {
            View view = null;
            if (interfaceC634840OvC != null) {
                view = interfaceC634840OvC.getView();
            }
            if (view instanceof WebView) {
                View view2 = interfaceC634840OvC.getView();
                if ((view2 instanceof WebView) && (webView = (WebView) view2) != null) {
                    InterfaceC1041930dDj webViewMonitorHelper = WebViewMonitorHelper.getInstance();
                    C1520360pfO c1520360pfO = new C1520360pfO("getABTestParams");
                    c1520360pfO.LIZIZ = "getABTestParams";
                    c1520360pfO.LIZLLL = new JSONObject().put("from", "crossPlatform").put("url", webView.getUrl()).put("business", C01CD.LIZLLL(webView.getUrl())).put("container", "web");
                    c1520360pfO.LIZ = webView.getUrl();
                    c1520360pfO.LIZIZ(0);
                    webViewMonitorHelper.customReport(webView, c1520360pfO.LIZ());
                }
            }
        }
        C12863051p.LIZIZ.LIZ(interfaceC1065410dpb.toJSON(), new AwS382S0200000_16(this, (C1065400dpa) completionBlock, (CompletionBlock<InterfaceC1065430dpd>) 129), new AwS382S0200000_16(interfaceC1065410dpb, (InterfaceC1065410dpb) completionBlock, (CompletionBlock<InterfaceC1065430dpd>) 130));
    }
}
