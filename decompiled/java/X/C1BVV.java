package X;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import android.webkit.WebChromeClient;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.ss.android.ugc.aweme.memory.profiler.strategy.LynxProfiler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.1BVV, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1BVV extends WebView implements InterfaceC1541730qDr, InterfaceC1541840qE2, C0V1Y {
    public C1541610qDf LL;
    public final C1542660qFM LLILLJJLI;
    public C2205951BVh LLILLL;
    public C1BVW LLILZ;

    @Override // X.InterfaceC1541730qDr
    public C1541620qDg getExtendableContext() {
        C1542660qFM c1542660qFM = this.LLILLJJLI;
        if (c1542660qFM == null) {
            return null;
        }
        return c1542660qFM.LIZ;
    }

    @Override // android.webkit.WebView
    public WebChromeClient getWebChromeClient() {
        return this.LL == null ? super.getWebChromeClient() : this.LLILZ;
    }

    public WebChromeClient getWebChromeClientCompat() {
        return this.LLILZ.LLILLL;
    }

    @Override // android.webkit.WebView
    public WebViewClient getWebViewClient() {
        return this.LL == null ? super.getWebViewClient() : this.LLILLL;
    }

    public WebViewClient getWebViewClientCompat() {
        return this.LLILLL.LLILLL;
    }

    @Override // android.webkit.WebView
    public WebMessagePort[] createWebMessageChannel() {
        return super.createWebMessageChannel();
    }

    @Override // android.webkit.WebView
    public WebViewRenderProcess getWebViewRenderProcess() {
        return super.getWebViewRenderProcess();
    }

    @Override // android.webkit.WebView
    public WebViewRenderProcessClient getWebViewRenderProcessClient() {
        return super.getWebViewRenderProcessClient();
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com_bytedance_hybrid_web_extension_core_webview_inner_WebViewContainerInner__onAttachedToWindow$___twin___();
        if (LynxProfiler.isOpen()) {
            LynxProfiler.onAttached(C2095108Ir.LIZ(this));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        com_bytedance_hybrid_web_extension_core_webview_inner_WebViewContainerInner__onDetachedFromWindow$___twin___();
        if (LynxProfiler.isOpen()) {
            LynxProfiler.onDetached(C2095108Ir.LIZ(this));
        }
    }

    public void com_bytedance_hybrid_web_extension_core_webview_inner_WebViewContainerInner__onAttachedToWindow$___twin___() {
        super.onAttachedToWindow();
    }

    public void com_bytedance_hybrid_web_extension_core_webview_inner_WebViewContainerInner__onDetachedFromWindow$___twin___() {
        super.onDetachedFromWindow();
    }

    public C1BVW getExtendableWebChromeClient() {
        return this.LLILZ;
    }

    public C2205951BVh getExtendableWebViewClient() {
        return this.LLILLL;
    }

    public C1BVV(Context context) {
        super(context);
        this.LLILLJJLI = new C1542660qFM();
        if (LynxProfiler.isOpen()) {
            String name = getClass().getName();
            String strLIZ = C2095108Ir.LIZ(this);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("new WebViewContainerInner subCls:");
            sbLIZ.append(name);
            LynxProfiler.onCreate(this, strLIZ, name, Log.getStackTraceString(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ))));
        }
    }

    @Override // X.InterfaceC1541730qDr
    public final void LIZIZ(C1541610qDf c1541610qDf) {
        C1541610qDf.LIZIZ();
        this.LL = c1541610qDf;
        this.LLILLJJLI.LIZ = new C1541620qDg(this.LL, this);
    }

    @Override // android.webkit.WebView, android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        super.autofill(sparseArray);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onProvideVirtualStructure(ViewStructure viewStructure) {
        super.onProvideVirtualStructure(viewStructure);
    }

    public void setExtendableWebViewClient(C1BVW c1bvw) {
        this.LLILZ = c1bvw;
        super.setWebChromeClient(c1bvw);
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        if (this.LL == null) {
            super.setWebChromeClient(webChromeClient);
        } else {
            this.LLILZ.LLILLL = webChromeClient;
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        if (this.LL == null) {
            super.setWebViewClient(webViewClient);
        } else {
            this.LLILLL.LLILLL = webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewRenderProcessClient(WebViewRenderProcessClient webViewRenderProcessClient) {
        super.setWebViewRenderProcessClient(webViewRenderProcessClient);
    }

    @Override // android.webkit.WebView
    public void zoomBy(float f) {
        super.zoomBy(f);
    }

    public void setExtendableWebViewClient(C2205951BVh c2205951BVh) {
        this.LLILLL = c2205951BVh;
        super.setWebViewClient(c2205951BVh);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        super.onProvideAutofillVirtualStructure(viewStructure, i);
    }

    @Override // android.webkit.WebView
    public void postWebMessage(WebMessage webMessage, Uri uri) {
        super.postWebMessage(webMessage, uri);
    }

    @Override // android.webkit.WebView
    public void setWebViewRenderProcessClient(Executor executor, WebViewRenderProcessClient webViewRenderProcessClient) {
        super.setWebViewRenderProcessClient(executor, webViewRenderProcessClient);
    }
}
