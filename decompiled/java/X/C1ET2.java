package X;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.os.Bundle;
import android.os.Message;
import android.util.SparseArray;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.1ET2, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public class C1ET2 extends C1BVV {
    public final boolean LJFF() {
        return super.canGoBack();
    }

    public final boolean LJII() {
        return super.canGoForward();
    }

    public final WebMessagePort[] LJIIIIZZ() {
        return super.createWebMessageChannel();
    }

    public final SslCertificate LJIIZILJ() {
        return super.getCertificate();
    }

    public final WebSettings LJIJI() {
        return super.getSettings();
    }

    public final WebChromeClient LJIJJ() {
        return super.getWebChromeClient();
    }

    public final WebViewClient LJIL() {
        return super.getWebViewClient();
    }

    public final WebViewRenderProcess LJJ() {
        return super.getWebViewRenderProcess();
    }

    public final WebViewRenderProcessClient LJJI() {
        return super.getWebViewRenderProcessClient();
    }

    public final boolean LJJIJIIJI() {
        return super.onCheckIsTextEditor();
    }

    public final boolean LJLJJL() {
        return super.zoomIn();
    }

    public final boolean LJLJJLL() {
        return super.zoomOut();
    }

    @Override // android.webkit.WebView
    public boolean canGoBack() {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "canGoBack");
        if (!(abstractC1541670qDlLIZIZ instanceof C1ET3)) {
            return super.canGoBack();
        }
        C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
        c1542630qFJ.get().LIZIZ();
        boolean zLIZJ = ((C1ET3) abstractC1541670qDlLIZIZ).LIZJ();
        c1542630qFJ.get().LIZ();
        return zLIZJ;
    }

    @Override // android.webkit.WebView
    public final boolean canGoForward() {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "canGoForward");
        if (!(abstractC1541670qDlLIZIZ instanceof C1ET3)) {
            return super.canGoForward();
        }
        C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
        c1542630qFJ.get().LIZIZ();
        boolean zLJ = ((C1ET3) abstractC1541670qDlLIZIZ).LJ();
        c1542630qFJ.get().LIZ();
        return zLJ;
    }

    @Override // X.C1BVV, android.webkit.WebView
    public final WebMessagePort[] createWebMessageChannel() {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "createWebMessageChannel");
        if (!(abstractC1541670qDlLIZIZ instanceof C1ET3)) {
            return super.createWebMessageChannel();
        }
        C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
        c1542630qFJ.get().LIZIZ();
        WebMessagePort[] webMessagePortArrLJFF = ((C1ET3) abstractC1541670qDlLIZIZ).LJFF();
        c1542630qFJ.get().LIZ();
        return webMessagePortArrLJFF;
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "destroy");
        if (!(abstractC1541670qDlLIZIZ instanceof C1ET3)) {
            super.destroy();
            return;
        }
        C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
        c1542630qFJ.get().LIZIZ();
        ((C1ET3) abstractC1541670qDlLIZIZ).LJI();
        c1542630qFJ.get().LIZ();
    }

    @Override // android.webkit.WebView
    public SslCertificate getCertificate() {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "getCertificate");
        if (!(abstractC1541670qDlLIZIZ instanceof C1ET3)) {
            return super.getCertificate();
        }
        C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
        c1542630qFJ.get().LIZIZ();
        SslCertificate sslCertificateLJIILJJIL = ((C1ET3) abstractC1541670qDlLIZIZ).LJIILJJIL();
        c1542630qFJ.get().LIZ();
        return sslCertificateLJIILJJIL;
    }

    @Override // android.webkit.WebView
    public WebSettings getSettings() {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "getSettings");
        if (!(abstractC1541670qDlLIZIZ instanceof C1ET3)) {
            return super.getSettings();
        }
        C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
        c1542630qFJ.get().LIZIZ();
        WebSettings webSettingsLJIILLIIL = ((C1ET3) abstractC1541670qDlLIZIZ).LJIILLIIL();
        c1542630qFJ.get().LIZ();
        return webSettingsLJIILLIIL;
    }

    @Override // X.C1BVV, android.webkit.WebView
    public WebChromeClient getWebChromeClient() {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "getWebChromeClient");
        if (!(abstractC1541670qDlLIZIZ instanceof C1ET3)) {
            return super.getWebChromeClient();
        }
        C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
        c1542630qFJ.get().LIZIZ();
        WebChromeClient webChromeClientLJIIZILJ = ((C1ET3) abstractC1541670qDlLIZIZ).LJIIZILJ();
        c1542630qFJ.get().LIZ();
        return webChromeClientLJIIZILJ;
    }

    @Override // X.C1BVV, android.webkit.WebView
    public WebViewClient getWebViewClient() {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "getWebViewClient");
        if (!(abstractC1541670qDlLIZIZ instanceof C1ET3)) {
            return super.getWebViewClient();
        }
        C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
        c1542630qFJ.get().LIZIZ();
        WebViewClient webViewClientLJIJ = ((C1ET3) abstractC1541670qDlLIZIZ).LJIJ();
        c1542630qFJ.get().LIZ();
        return webViewClientLJIJ;
    }

    @Override // X.C1BVV, android.webkit.WebView
    public WebViewRenderProcess getWebViewRenderProcess() {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "getWebViewRenderProcess");
        if (!(abstractC1541670qDlLIZIZ instanceof C1ET3)) {
            return super.getWebViewRenderProcess();
        }
        C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
        c1542630qFJ.get().LIZIZ();
        WebViewRenderProcess webViewRenderProcessLJIJI = ((C1ET3) abstractC1541670qDlLIZIZ).LJIJI();
        c1542630qFJ.get().LIZ();
        return webViewRenderProcessLJIJI;
    }

    @Override // X.C1BVV, android.webkit.WebView
    public WebViewRenderProcessClient getWebViewRenderProcessClient() {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "getWebViewRenderProcessClient");
        if (!(abstractC1541670qDlLIZIZ instanceof C1ET3)) {
            return super.getWebViewRenderProcessClient();
        }
        C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
        c1542630qFJ.get().LIZIZ();
        WebViewRenderProcessClient webViewRenderProcessClientLJIJJ = ((C1ET3) abstractC1541670qDlLIZIZ).LJIJJ();
        c1542630qFJ.get().LIZ();
        return webViewRenderProcessClientLJIJJ;
    }

    @Override // android.webkit.WebView
    public void goBack() {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "goBack");
        if (!(abstractC1541670qDlLIZIZ instanceof C1ET3)) {
            super.goBack();
            return;
        }
        C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
        c1542630qFJ.get().LIZIZ();
        ((C1ET3) abstractC1541670qDlLIZIZ).LJIJJLI();
        c1542630qFJ.get().LIZ();
    }

    @Override // android.webkit.WebView
    public final void goForward() {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "goForward");
        if (!(abstractC1541670qDlLIZIZ instanceof C1ET3)) {
            super.goForward();
            return;
        }
        C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
        c1542630qFJ.get().LIZIZ();
        ((C1ET3) abstractC1541670qDlLIZIZ).LJJ();
        c1542630qFJ.get().LIZ();
    }

    @Override // X.C1BVV, android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onAttachedToWindow");
        if (!(abstractC1541670qDlLIZIZ instanceof C1ET3)) {
            super.onAttachedToWindow();
            return;
        }
        C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
        c1542630qFJ.get().LIZIZ();
        ((C1ET3) abstractC1541670qDlLIZIZ).LJJIIJ();
        c1542630qFJ.get().LIZ();
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onCheckIsTextEditor() {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onCheckIsTextEditor");
        if (!(abstractC1541670qDlLIZIZ instanceof C1ET3)) {
            return super.onCheckIsTextEditor();
        }
        C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
        c1542630qFJ.get().LIZIZ();
        boolean zLJJIIJZLJL = ((C1ET3) abstractC1541670qDlLIZIZ).LJJIIJZLJL();
        c1542630qFJ.get().LIZ();
        return zLJJIIJZLJL;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onFinishTemporaryDetach() {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onFinishTemporaryDetach");
        if (!(abstractC1541670qDlLIZIZ instanceof C1ET3)) {
            super.onFinishTemporaryDetach();
            return;
        }
        C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
        c1542630qFJ.get().LIZIZ();
        ((C1ET3) abstractC1541670qDlLIZIZ).LJJIJIIJIL();
        c1542630qFJ.get().LIZ();
    }

    @Override // android.webkit.WebView
    public final void onPause() {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onPause");
        if (!(abstractC1541670qDlLIZIZ instanceof C1ET3)) {
            super.onPause();
            return;
        }
        C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
        c1542630qFJ.get().LIZIZ();
        ((C1ET3) abstractC1541670qDlLIZIZ).onPause();
        c1542630qFJ.get().LIZ();
    }

    @Override // android.webkit.WebView
    public final void onResume() {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onResume");
        if (!(abstractC1541670qDlLIZIZ instanceof C1ET3)) {
            super.onResume();
            return;
        }
        C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
        c1542630qFJ.get().LIZIZ();
        ((C1ET3) abstractC1541670qDlLIZIZ).onResume();
        c1542630qFJ.get().LIZ();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onStartTemporaryDetach() {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onStartTemporaryDetach");
        if (!(abstractC1541670qDlLIZIZ instanceof C1ET3)) {
            super.onStartTemporaryDetach();
            return;
        }
        C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
        c1542630qFJ.get().LIZIZ();
        ((C1ET3) abstractC1541670qDlLIZIZ).LJJJJL();
        c1542630qFJ.get().LIZ();
    }

    @Override // android.webkit.WebView
    public void reload() {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "reload");
        if (!(abstractC1541670qDlLIZIZ instanceof C1ET3)) {
            super.reload();
            return;
        }
        C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
        c1542630qFJ.get().LIZIZ();
        ((C1ET3) abstractC1541670qDlLIZIZ).LJJLIIIIJ();
        c1542630qFJ.get().LIZ();
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "stopLoading");
        if (!(abstractC1541670qDlLIZIZ instanceof C1ET3)) {
            super.stopLoading();
            return;
        }
        C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
        c1542630qFJ.get().LIZIZ();
        ((C1ET3) abstractC1541670qDlLIZIZ).LJL();
        c1542630qFJ.get().LIZ();
    }

    @Override // android.webkit.WebView
    public final boolean zoomIn() {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "zoomIn");
        if (!(abstractC1541670qDlLIZIZ instanceof C1ET3)) {
            return super.zoomIn();
        }
        C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
        c1542630qFJ.get().LIZIZ();
        boolean zLJLIIIL = ((C1ET3) abstractC1541670qDlLIZIZ).LJLIIIL();
        c1542630qFJ.get().LIZ();
        return zLJLIIIL;
    }

    @Override // android.webkit.WebView
    public final boolean zoomOut() {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "zoomOut");
        if (!(abstractC1541670qDlLIZIZ instanceof C1ET3)) {
            return super.zoomOut();
        }
        C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
        c1542630qFJ.get().LIZIZ();
        boolean zLJLIIL = ((C1ET3) abstractC1541670qDlLIZIZ).LJLIIL();
        c1542630qFJ.get().LIZ();
        return zLJLIIL;
    }

    public final void LJIIIZ() {
        super.destroy();
    }

    public final void LJJIFFI() {
        super.goBack();
    }

    public final void LJJIII() {
        super.goForward();
    }

    public final void LJJIJ() {
        super.onAttachedToWindow();
    }

    public final void LJJIL() {
        super.onFinishTemporaryDetach();
    }

    public final void LJJJJL() {
        super.onPause();
    }

    public final void LJJJJZ() {
        super.onResume();
    }

    public final void LJJJLL() {
        super.onStartTemporaryDetach();
    }

    public final void LJJLIIIJLJLI() {
        super.reload();
    }

    public final void LJLJI() {
        super.stopLoading();
    }

    public C1ET2(Context context) {
        super(context);
    }

    public final void LJ(SparseArray<AutofillValue> sparseArray) {
        super.autofill(sparseArray);
    }

    public final boolean LJI(int i) {
        return super.canGoBackOrForward(i);
    }

    public final void LJIIJ(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean LJIIJJI(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean LJIIL(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void LJIILIIL(Message message) {
        super.documentHasImages(message);
    }

    public final void LJIILJJIL(Canvas canvas) {
        super.draw(canvas);
    }

    public final void LJJII(int i) {
        super.goBackOrForward(i);
    }

    public final void LJJIIZ(String str) {
        super.loadUrl(str);
    }

    public final void LJJIJIIJIL(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public final InputConnection LJJIJIL(EditorInfo editorInfo) {
        return super.onCreateInputConnection(editorInfo);
    }

    public final boolean LJJIJL(DragEvent dragEvent) {
        return super.onDragEvent(dragEvent);
    }

    public final void LJJIJLIJ(Canvas canvas) {
        super.onDraw(canvas);
    }

    public final boolean LJJJ(MotionEvent motionEvent) {
        return super.onGenericMotionEvent(motionEvent);
    }

    public final boolean LJJJI(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public final boolean LJJJIL(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void LJJJJLL(ViewStructure viewStructure) {
        super.onProvideVirtualStructure(viewStructure);
    }

    public final boolean LJJJLZIJ(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public final boolean LJJJZ(MotionEvent motionEvent) {
        return super.onTrackballEvent(motionEvent);
    }

    public final void LJJLI(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public final void LJJLIIIIJ(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public final boolean LJJLIIIJILLIZJL(boolean z) {
        return super.pageDown(z);
    }

    public final boolean LJJLIIIJJI(boolean z) {
        return super.pageUp(z);
    }

    public final void LJJLIIIJLLLLLLLZ(String str) {
        super.removeJavascriptInterface(str);
    }

    public final WebBackForwardList LJJLIL(Bundle bundle) {
        return super.restoreState(bundle);
    }

    public final WebBackForwardList LJJLJLI(Bundle bundle) {
        return super.saveState(bundle);
    }

    public final void LJJLL(String str) {
        super.saveWebArchive(str);
    }

    public final void LJJZZI(SslCertificate sslCertificate) {
        super.setCertificate(sslCertificate);
    }

    public final void LJJZZIII(DownloadListener downloadListener) {
        super.setDownloadListener(downloadListener);
    }

    public final void LJL(WebView.FindListener findListener) {
        super.setFindListener(findListener);
    }

    public final void LJLIIIL(WebChromeClient webChromeClient) {
        super.setWebChromeClient(webChromeClient);
    }

    public final void LJLIIL(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
    }

    public final void LJLIL(WebViewRenderProcessClient webViewRenderProcessClient) {
        super.setWebViewRenderProcessClient(webViewRenderProcessClient);
    }

    public final void LJLJJI(float f) {
        super.zoomBy(f);
    }

    @Override // X.C1BVV, android.webkit.WebView, android.view.View
    public final void autofill(SparseArray<AutofillValue> sparseArray) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "autofill");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LIZIZ(sparseArray);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.autofill(sparseArray);
    }

    @Override // android.webkit.WebView
    public final boolean canGoBackOrForward(int i) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "canGoBackOrForward");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            boolean zLIZLLL = ((C1ET3) abstractC1541670qDlLIZIZ).LIZLLL(i);
            c1542630qFJ.get().LIZ();
            return zLIZLLL;
        }
        return super.canGoBackOrForward(i);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "dispatchDraw");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJII(canvas);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "dispatchKeyEvent");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            boolean zLJIIIIZZ = ((C1ET3) abstractC1541670qDlLIZIZ).LJIIIIZZ(keyEvent);
            c1542630qFJ.get().LIZ();
            return zLJIIIIZZ;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "dispatchTouchEvent");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            boolean zLJIIIZ = ((C1ET3) abstractC1541670qDlLIZIZ).LJIIIZ(motionEvent);
            c1542630qFJ.get().LIZ();
            return zLJIIIZ;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView
    public final void documentHasImages(Message message) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "documentHasImages");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJIIJ(message);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.documentHasImages(message);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "draw");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJIIJJI(canvas);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.draw(canvas);
    }

    @Override // android.webkit.WebView
    public final void goBackOrForward(int i) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "goBackOrForward");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJIL(i);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.goBackOrForward(i);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "loadUrl");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJII(str);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.loadUrl(str);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onConfigurationChanged");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJIIZ(configuration);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // android.webkit.WebView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onCreateInputConnection");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            InputConnection inputConnectionLJJIIZI = ((C1ET3) abstractC1541670qDlLIZIZ).LJJIIZI(editorInfo);
            c1542630qFJ.get().LIZ();
            return inputConnectionLJJIIZI;
        }
        return super.onCreateInputConnection(editorInfo);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onDragEvent");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            boolean zLJJIJ = ((C1ET3) abstractC1541670qDlLIZIZ).LJJIJ(dragEvent);
            c1542630qFJ.get().LIZ();
            return zLJJIJ;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onDraw");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJIJIIJI(canvas);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onGenericMotionEvent");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            boolean zLJJIJL = ((C1ET3) abstractC1541670qDlLIZIZ).LJJIJL(motionEvent);
            c1542630qFJ.get().LIZ();
            return zLJJIJL;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onHoverEvent");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            boolean zLJJIJLIJ = ((C1ET3) abstractC1541670qDlLIZIZ).LJJIJLIJ(motionEvent);
            c1542630qFJ.get().LIZ();
            return zLJJIJLIJ;
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onInterceptTouchEvent");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            boolean zLJJIL = ((C1ET3) abstractC1541670qDlLIZIZ).LJJIL(motionEvent);
            c1542630qFJ.get().LIZ();
            return zLJJIL;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // X.C1BVV, android.webkit.WebView, android.view.View
    public final void onProvideVirtualStructure(ViewStructure viewStructure) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onProvideVirtualStructure");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJJJIZL(viewStructure);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onProvideVirtualStructure(viewStructure);
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onTouchEvent");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            boolean zLJJJJLI = ((C1ET3) abstractC1541670qDlLIZIZ).LJJJJLI(motionEvent);
            c1542630qFJ.get().LIZ();
            return zLJJJJLI;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onTrackballEvent");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            boolean zLJJJJLL = ((C1ET3) abstractC1541670qDlLIZIZ).LJJJJLL(motionEvent);
            c1542630qFJ.get().LIZ();
            return zLJJJJLL;
        }
        return super.onTrackballEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onWindowFocusChanged");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJJJZI(z);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onWindowVisibilityChanged");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJJLIIL(i);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.webkit.WebView
    public final boolean pageDown(boolean z) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "pageDown");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            boolean zLJJJLZIJ = ((C1ET3) abstractC1541670qDlLIZIZ).LJJJLZIJ(z);
            c1542630qFJ.get().LIZ();
            return zLJJJLZIJ;
        }
        return super.pageDown(z);
    }

    @Override // android.webkit.WebView
    public final boolean pageUp(boolean z) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "pageUp");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            boolean zLJJJZ = ((C1ET3) abstractC1541670qDlLIZIZ).LJJJZ(z);
            c1542630qFJ.get().LIZ();
            return zLJJJZ;
        }
        return super.pageUp(z);
    }

    @Override // android.webkit.WebView
    public final void removeJavascriptInterface(String str) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "removeJavascriptInterface");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJLIIIJ(str);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.removeJavascriptInterface(str);
    }

    @Override // android.webkit.WebView
    public final WebBackForwardList restoreState(Bundle bundle) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "restoreState");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            WebBackForwardList webBackForwardListLJJLIIIJJI = ((C1ET3) abstractC1541670qDlLIZIZ).LJJLIIIJJI(bundle);
            c1542630qFJ.get().LIZ();
            return webBackForwardListLJJLIIIJJI;
        }
        return super.restoreState(bundle);
    }

    @Override // android.webkit.WebView
    public final WebBackForwardList saveState(Bundle bundle) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "saveState");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            WebBackForwardList webBackForwardListLJJLIIIJL = ((C1ET3) abstractC1541670qDlLIZIZ).LJJLIIIJL(bundle);
            c1542630qFJ.get().LIZ();
            return webBackForwardListLJJLIIIJL;
        }
        return super.saveState(bundle);
    }

    @Override // android.webkit.WebView
    public final void saveWebArchive(String str) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "saveWebArchive");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJLIIIJLJLI(str);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.saveWebArchive(str);
    }

    @Override // android.webkit.WebView
    public void setCertificate(SslCertificate sslCertificate) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "setCertificate");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJLIIJ(sslCertificate);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.setCertificate(sslCertificate);
    }

    @Override // android.webkit.WebView
    public void setDownloadListener(DownloadListener downloadListener) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "setDownloadListener");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJLIL(downloadListener);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.setDownloadListener(downloadListener);
    }

    @Override // android.webkit.WebView
    public void setFindListener(WebView.FindListener findListener) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "setFindListener");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJLJ(findListener);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.setFindListener(findListener);
    }

    @Override // X.C1BVV, android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "setWebChromeClient");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJLL(webChromeClient);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.setWebChromeClient(webChromeClient);
    }

    @Override // X.C1BVV, android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "setWebViewClient");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJZ(webViewClient);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.setWebViewClient(webViewClient);
    }

    @Override // X.C1BVV, android.webkit.WebView
    public void setWebViewRenderProcessClient(WebViewRenderProcessClient webViewRenderProcessClient) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "setWebViewRenderProcessClient");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJZZI(webViewRenderProcessClient);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.setWebViewRenderProcessClient(webViewRenderProcessClient);
    }

    @Override // X.C1BVV, android.webkit.WebView
    public final void zoomBy(float f) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "zoomBy");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJLI(f);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.zoomBy(f);
    }

    public final void LIZLLL(Object obj, String str) {
        super.addJavascriptInterface(obj, str);
    }

    public final void LJIILL(ValueCallback valueCallback, String str) {
        super.evaluateJavascript(str, valueCallback);
    }

    public final void LJIILLIIL(int i, int i2) {
        super.flingScroll(i, i2);
    }

    public final String[] LJIJ(String str, String str2) {
        return super.getHttpAuthUsernamePassword(str, str2);
    }

    public final void LJJIIZI(String str, Map<String, String> map) {
        super.loadUrl(str, map);
    }

    public final boolean LJJJJ(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean LJJJJIZL(int i, KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    public final void LJJJJJ(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public final void LJJJJLI(ViewStructure viewStructure, int i) {
        super.onProvideAutofillVirtualStructure(viewStructure, i);
    }

    public final void LJJL(int i, View view) {
        super.onVisibilityChanged(view, i);
    }

    public final void LJJLIIIJJIZ(String str, byte[] bArr) {
        super.postUrl(str, bArr);
    }

    public final void LJJLIIIJL(WebMessage webMessage, Uri uri) {
        super.postWebMessage(webMessage, uri);
    }

    public final boolean LJJLIIJ(int i, Rect rect) {
        return super.requestFocus(i, rect);
    }

    public final void LJLILLLLZI(Executor executor, WebViewRenderProcessClient webViewRenderProcessClient) {
        super.setWebViewRenderProcessClient(executor, webViewRenderProcessClient);
    }

    @Override // android.webkit.WebView
    public final void addJavascriptInterface(Object obj, String str) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "addJavascriptInterface");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LIZ(obj, str);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.addJavascriptInterface(obj, str);
    }

    @Override // android.webkit.WebView
    public final void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "evaluateJavascript");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJIIL(str, valueCallback);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // android.webkit.WebView
    public final void flingScroll(int i, int i2) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "flingScroll");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJIILIIL(i, i2);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.flingScroll(i, i2);
    }

    @Override // android.webkit.WebView
    public final String[] getHttpAuthUsernamePassword(String str, String str2) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "getHttpAuthUsernamePassword");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            String[] strArrLJIILL = ((C1ET3) abstractC1541670qDlLIZIZ).LJIILL(str, str2);
            c1542630qFJ.get().LIZ();
            return strArrLJIILL;
        }
        return super.getHttpAuthUsernamePassword(str, str2);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "loadUrl");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJIII(str, map);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.loadUrl(str, map);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onKeyDown");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            boolean zLJJIZ = ((C1ET3) abstractC1541670qDlLIZIZ).LJJIZ(i, keyEvent);
            c1542630qFJ.get().LIZ();
            return zLJJIZ;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onKeyUp");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            boolean zLJJJI = ((C1ET3) abstractC1541670qDlLIZIZ).LJJJI(i, keyEvent);
            c1542630qFJ.get().LIZ();
            return zLJJJI;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onMeasure");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJJIL(i, i2);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // X.C1BVV, android.webkit.WebView, android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onProvideAutofillVirtualStructure");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJJJI(viewStructure, i);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onProvideAutofillVirtualStructure(viewStructure, i);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onVisibilityChanged");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJJJZ(view, i);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onVisibilityChanged(view, i);
    }

    @Override // android.webkit.WebView
    public void postUrl(String str, byte[] bArr) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "postUrl");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJL(str, bArr);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.postUrl(str, bArr);
    }

    @Override // X.C1BVV, android.webkit.WebView
    public final void postWebMessage(WebMessage webMessage, Uri uri) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "postWebMessage");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJLI(webMessage, uri);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.postWebMessage(webMessage, uri);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "requestFocus");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            boolean zLJJLIIIJILLIZJL = ((C1ET3) abstractC1541670qDlLIZIZ).LJJLIIIJILLIZJL(i, rect);
            c1542630qFJ.get().LIZ();
            return zLJJLIIIJILLIZJL;
        }
        return super.requestFocus(i, rect);
    }

    @Override // X.C1BVV, android.webkit.WebView
    public final void setWebViewRenderProcessClient(Executor executor, WebViewRenderProcessClient webViewRenderProcessClient) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "setWebViewRenderProcessClient");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJZZIII(executor, webViewRenderProcessClient);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.setWebViewRenderProcessClient(executor, webViewRenderProcessClient);
    }

    public final void LJJIIJ(String str, String str2, String str3) {
        super.loadData(str, str2, str3);
    }

    public final void LJJIZ(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
    }

    public final boolean LJJJJI(int i, int i2, KeyEvent keyEvent) {
        return super.onKeyMultiple(i, i2, keyEvent);
    }

    public final void LJJLJ(String str, String str2, String str3) {
        super.savePassword(str, str2, str3);
    }

    public final void LJJZ(String str, boolean z, ValueCallback<String> valueCallback) {
        super.saveWebArchive(str, z, valueCallback);
    }

    public final void LJLJL(String str, byte[] bArr, C2286671Eev... c2286671EevArr) {
        C1542640qFK c1542640qFK = C1542620qFI.LIZ;
        c1542640qFK.get().LIZ.push(c2286671EevArr);
        postUrl(str, bArr);
        c1542640qFK.get().LIZ.pop();
    }

    @Override // android.webkit.WebView
    public final void loadData(String str, String str2, String str3) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "loadData");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJI(str, str2, str3);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.loadData(str, str2, str3);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onFocusChanged");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJIJIL(z, i, rect);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onFocusChanged(z, i, rect);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onKeyMultiple");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            boolean zLJJJ = ((C1ET3) abstractC1541670qDlLIZIZ).LJJJ(i, i2, keyEvent);
            c1542630qFJ.get().LIZ();
            return zLJJJ;
        }
        return super.onKeyMultiple(i, i2, keyEvent);
    }

    @Override // android.webkit.WebView
    public final void savePassword(String str, String str2, String str3) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "savePassword");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJLIIIJJIZ(str, str2, str3);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.savePassword(str, str2, str3);
    }

    @Override // android.webkit.WebView
    public final void saveWebArchive(String str, boolean z, ValueCallback<String> valueCallback) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "saveWebArchive");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJLIIIJLLLLLLLZ(str, z, valueCallback);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.saveWebArchive(str, z, valueCallback);
    }

    public final void LJJJJJL(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
    }

    public final void LJJJJZI(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    public final void LJJJLIIL(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public final void LJLI(String str, String str2, String str3, String str4) {
        super.setHttpAuthUsernamePassword(str, str2, str3, str4);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onOverScrolled");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJJJ(i, i2, z, z2);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onScrollChanged");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJJJJ(i, i2, i3, i4);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onSizeChanged");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJJJJL(i, i2, i3, i4);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.webkit.WebView
    public final void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "setHttpAuthUsernamePassword");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJLJLI(str, str2, str3, str4);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.setHttpAuthUsernamePassword(str, str2, str3, str4);
    }

    public final void LJJIIJZLJL(String str, String str2, String str3, String str4, String str5) {
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // android.webkit.WebView
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "loadDataWithBaseURL");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1ET3) abstractC1541670qDlLIZIZ).LJJIFFI(str, str2, str3, str4, str5);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public final boolean LJJLIIIJ(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }

    @Override // android.view.View
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "overScrollBy");
        if (abstractC1541670qDlLIZIZ instanceof C1ET3) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            boolean zLJJJLL = ((C1ET3) abstractC1541670qDlLIZIZ).LJJJLL(i, i2, i3, i4, i5, i6, i7, i8, z);
            c1542630qFJ.get().LIZ();
            return zLJJJLL;
        }
        return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }
}
