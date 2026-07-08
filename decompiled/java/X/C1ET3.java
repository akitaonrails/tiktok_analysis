package X;

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

/* JADX INFO: renamed from: X.1ET3, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public abstract class C1ET3 extends AbstractC1541670qDl<C1ET2> implements InterfaceC1541840qE2 {
    public boolean LIZJ() {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "canGoBack");
        return abstractC1541670qDlLIZ instanceof C1ET3 ? ((C1ET3) abstractC1541670qDlLIZ).LIZJ() : getExtendable().LJFF();
    }

    public boolean LJ() {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "canGoForward");
        return abstractC1541670qDlLIZ instanceof C1ET3 ? ((C1ET3) abstractC1541670qDlLIZ).LJ() : getExtendable().LJII();
    }

    public final WebMessagePort[] LJFF() {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "createWebMessageChannel");
        return abstractC1541670qDlLIZ instanceof C1ET3 ? ((C1ET3) abstractC1541670qDlLIZ).LJFF() : getExtendable().LJIIIIZZ();
    }

    public void LJI() {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "destroy");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJI();
        } else {
            getExtendable().LJIIIZ();
        }
    }

    public final SslCertificate LJIILJJIL() {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "getCertificate");
        return abstractC1541670qDlLIZ instanceof C1ET3 ? ((C1ET3) abstractC1541670qDlLIZ).LJIILJJIL() : getExtendable().LJIIZILJ();
    }

    public final WebSettings LJIILLIIL() {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "getSettings");
        return abstractC1541670qDlLIZ instanceof C1ET3 ? ((C1ET3) abstractC1541670qDlLIZ).LJIILLIIL() : getExtendable().LJIJI();
    }

    public final WebChromeClient LJIIZILJ() {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "getWebChromeClient");
        return abstractC1541670qDlLIZ instanceof C1ET3 ? ((C1ET3) abstractC1541670qDlLIZ).LJIIZILJ() : getExtendable().LJIJJ();
    }

    public final WebViewClient LJIJ() {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "getWebViewClient");
        return abstractC1541670qDlLIZ instanceof C1ET3 ? ((C1ET3) abstractC1541670qDlLIZ).LJIJ() : getExtendable().LJIL();
    }

    public final WebViewRenderProcess LJIJI() {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "getWebViewRenderProcess");
        return abstractC1541670qDlLIZ instanceof C1ET3 ? ((C1ET3) abstractC1541670qDlLIZ).LJIJI() : getExtendable().LJJ();
    }

    public final WebViewRenderProcessClient LJIJJ() {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "getWebViewRenderProcessClient");
        return abstractC1541670qDlLIZ instanceof C1ET3 ? ((C1ET3) abstractC1541670qDlLIZ).LJIJJ() : getExtendable().LJJI();
    }

    public void LJIJJLI() {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "goBack");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJIJJLI();
        } else {
            getExtendable().LJJIFFI();
        }
    }

    public void LJJ() {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "goForward");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJ();
        } else {
            getExtendable().LJJIII();
        }
    }

    public final void LJJIIJ() {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onAttachedToWindow");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJIIJ();
        } else {
            getExtendable().LJJIJ();
        }
    }

    public final boolean LJJIIJZLJL() {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onCheckIsTextEditor");
        return abstractC1541670qDlLIZ instanceof C1ET3 ? ((C1ET3) abstractC1541670qDlLIZ).LJJIIJZLJL() : getExtendable().LJJIJIIJI();
    }

    public final void LJJIJIIJIL() {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onFinishTemporaryDetach");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJIJIIJIL();
        } else {
            getExtendable().LJJIL();
        }
    }

    public final void LJJJJL() {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onStartTemporaryDetach");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJJJL();
        } else {
            getExtendable().LJJJLL();
        }
    }

    public void LJJLIIIIJ() {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "reload");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJLIIIIJ();
        } else {
            getExtendable().LJJLIIIJLJLI();
        }
    }

    public final void LJL() {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "stopLoading");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJL();
        } else {
            getExtendable().LJLJI();
        }
    }

    public final boolean LJLIIIL() {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "zoomIn");
        return abstractC1541670qDlLIZ instanceof C1ET3 ? ((C1ET3) abstractC1541670qDlLIZ).LJLIIIL() : getExtendable().LJLJJL();
    }

    public final boolean LJLIIL() {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "zoomOut");
        return abstractC1541670qDlLIZ instanceof C1ET3 ? ((C1ET3) abstractC1541670qDlLIZ).LJLIIL() : getExtendable().LJLJJLL();
    }

    public final void onPause() {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onPause");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).onPause();
        } else {
            getExtendable().LJJJJL();
        }
    }

    public final void onResume() {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onResume");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).onResume();
        } else {
            getExtendable().LJJJJZ();
        }
    }

    public void LIZIZ(SparseArray<AutofillValue> sparseArray) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "autofill");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LIZIZ(sparseArray);
        } else {
            getExtendable().LJ(sparseArray);
        }
    }

    public final boolean LIZLLL(int i) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "canGoBackOrForward");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            return ((C1ET3) abstractC1541670qDlLIZ).LIZLLL(i);
        }
        return getExtendable().LJI(i);
    }

    public final void LJII(Canvas canvas) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "dispatchDraw");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJII(canvas);
        } else {
            getExtendable().LJIIJ(canvas);
        }
    }

    public final boolean LJIIIIZZ(KeyEvent keyEvent) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "dispatchKeyEvent");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            return ((C1ET3) abstractC1541670qDlLIZ).LJIIIIZZ(keyEvent);
        }
        return getExtendable().LJIIJJI(keyEvent);
    }

    public final boolean LJIIIZ(MotionEvent motionEvent) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "dispatchTouchEvent");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            return ((C1ET3) abstractC1541670qDlLIZ).LJIIIZ(motionEvent);
        }
        return getExtendable().LJIIL(motionEvent);
    }

    public final void LJIIJ(Message message) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "documentHasImages");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJIIJ(message);
        } else {
            getExtendable().LJIILIIL(message);
        }
    }

    public final void LJIIJJI(Canvas canvas) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "draw");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJIIJJI(canvas);
        } else {
            getExtendable().LJIILJJIL(canvas);
        }
    }

    public final void LJIL(int i) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "goBackOrForward");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJIL(i);
        } else {
            getExtendable().LJJII(i);
        }
    }

    public void LJJII(String str) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "loadUrl");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJII(str);
        } else {
            getExtendable().LJJIIZ(str);
        }
    }

    public final void LJJIIZ(Configuration configuration) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onConfigurationChanged");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJIIZ(configuration);
        } else {
            getExtendable().LJJIJIIJIL(configuration);
        }
    }

    public final InputConnection LJJIIZI(EditorInfo editorInfo) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onCreateInputConnection");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            return ((C1ET3) abstractC1541670qDlLIZ).LJJIIZI(editorInfo);
        }
        return getExtendable().LJJIJIL(editorInfo);
    }

    public final boolean LJJIJ(DragEvent dragEvent) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onDragEvent");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            return ((C1ET3) abstractC1541670qDlLIZ).LJJIJ(dragEvent);
        }
        return getExtendable().LJJIJL(dragEvent);
    }

    public final void LJJIJIIJI(Canvas canvas) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onDraw");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJIJIIJI(canvas);
        } else {
            getExtendable().LJJIJLIJ(canvas);
        }
    }

    public final boolean LJJIJL(MotionEvent motionEvent) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onGenericMotionEvent");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            return ((C1ET3) abstractC1541670qDlLIZ).LJJIJL(motionEvent);
        }
        return getExtendable().LJJJ(motionEvent);
    }

    public final boolean LJJIJLIJ(MotionEvent motionEvent) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onHoverEvent");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            return ((C1ET3) abstractC1541670qDlLIZ).LJJIJLIJ(motionEvent);
        }
        return getExtendable().LJJJI(motionEvent);
    }

    public final boolean LJJIL(MotionEvent motionEvent) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onInterceptTouchEvent");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            return ((C1ET3) abstractC1541670qDlLIZ).LJJIL(motionEvent);
        }
        return getExtendable().LJJJIL(motionEvent);
    }

    public final void LJJJJIZL(ViewStructure viewStructure) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onProvideVirtualStructure");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJJJIZL(viewStructure);
        } else {
            getExtendable().LJJJJLL(viewStructure);
        }
    }

    public boolean LJJJJLI(MotionEvent motionEvent) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onTouchEvent");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            return ((C1ET3) abstractC1541670qDlLIZ).LJJJJLI(motionEvent);
        }
        return getExtendable().LJJJLZIJ(motionEvent);
    }

    public final boolean LJJJJLL(MotionEvent motionEvent) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onTrackballEvent");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            return ((C1ET3) abstractC1541670qDlLIZ).LJJJJLL(motionEvent);
        }
        return getExtendable().LJJJZ(motionEvent);
    }

    public final void LJJJJZI(boolean z) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onWindowFocusChanged");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJJJZI(z);
        } else {
            getExtendable().LJJLI(z);
        }
    }

    public final void LJJJLIIL(int i) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onWindowVisibilityChanged");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJJLIIL(i);
        } else {
            getExtendable().LJJLIIIIJ(i);
        }
    }

    public final boolean LJJJLZIJ(boolean z) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "pageDown");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            return ((C1ET3) abstractC1541670qDlLIZ).LJJJLZIJ(z);
        }
        return getExtendable().LJJLIIIJILLIZJL(z);
    }

    public final boolean LJJJZ(boolean z) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "pageUp");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            return ((C1ET3) abstractC1541670qDlLIZ).LJJJZ(z);
        }
        return getExtendable().LJJLIIIJJI(z);
    }

    public final void LJJLIIIJ(String str) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "removeJavascriptInterface");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJLIIIJ(str);
        } else {
            getExtendable().LJJLIIIJLLLLLLLZ(str);
        }
    }

    public final WebBackForwardList LJJLIIIJJI(Bundle bundle) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "restoreState");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            return ((C1ET3) abstractC1541670qDlLIZ).LJJLIIIJJI(bundle);
        }
        return getExtendable().LJJLIL(bundle);
    }

    public final WebBackForwardList LJJLIIIJL(Bundle bundle) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "saveState");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            return ((C1ET3) abstractC1541670qDlLIZ).LJJLIIIJL(bundle);
        }
        return getExtendable().LJJLJLI(bundle);
    }

    public final void LJJLIIIJLJLI(String str) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "saveWebArchive");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJLIIIJLJLI(str);
        } else {
            getExtendable().LJJLL(str);
        }
    }

    public final void LJJLIIJ(SslCertificate sslCertificate) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "setCertificate");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJLIIJ(sslCertificate);
        } else {
            getExtendable().LJJZZI(sslCertificate);
        }
    }

    public final void LJJLIL(DownloadListener downloadListener) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "setDownloadListener");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJLIL(downloadListener);
        } else {
            getExtendable().LJJZZIII(downloadListener);
        }
    }

    public final void LJJLJ(WebView.FindListener findListener) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "setFindListener");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJLJ(findListener);
        } else {
            getExtendable().LJL(findListener);
        }
    }

    public final void LJJLL(WebChromeClient webChromeClient) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "setWebChromeClient");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJLL(webChromeClient);
        } else {
            getExtendable().LJLIIIL(webChromeClient);
        }
    }

    public void LJJZ(WebViewClient webViewClient) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "setWebViewClient");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJZ(webViewClient);
        } else {
            getExtendable().LJLIIL(webViewClient);
        }
    }

    public final void LJJZZI(WebViewRenderProcessClient webViewRenderProcessClient) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "setWebViewRenderProcessClient");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJZZI(webViewRenderProcessClient);
        } else {
            getExtendable().LJLIL(webViewRenderProcessClient);
        }
    }

    public final void LJLI(float f) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "zoomBy");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJLI(f);
        } else {
            getExtendable().LJLJJI(f);
        }
    }

    public void LIZ(Object obj, String str) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "addJavascriptInterface");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LIZ(obj, str);
        } else {
            getExtendable().LIZLLL(obj, str);
        }
    }

    public void LJIIL(String str, ValueCallback<String> valueCallback) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "evaluateJavascript");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJIIL(str, valueCallback);
        } else {
            getExtendable().LJIILL(valueCallback, str);
        }
    }

    public final void LJIILIIL(int i, int i2) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "flingScroll");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJIILIIL(i, i2);
        } else {
            getExtendable().LJIILLIIL(i, i2);
        }
    }

    public final String[] LJIILL(String str, String str2) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "getHttpAuthUsernamePassword");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            return ((C1ET3) abstractC1541670qDlLIZ).LJIILL(str, str2);
        }
        return getExtendable().LJIJ(str, str2);
    }

    public void LJJIII(String str, Map<String, String> map) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "loadUrl");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJIII(str, map);
        } else {
            getExtendable().LJJIIZI(str, map);
        }
    }

    public final boolean LJJIZ(int i, KeyEvent keyEvent) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onKeyDown");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            return ((C1ET3) abstractC1541670qDlLIZ).LJJIZ(i, keyEvent);
        }
        return getExtendable().LJJJJ(i, keyEvent);
    }

    public final boolean LJJJI(int i, KeyEvent keyEvent) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onKeyUp");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            return ((C1ET3) abstractC1541670qDlLIZ).LJJJI(i, keyEvent);
        }
        return getExtendable().LJJJJIZL(i, keyEvent);
    }

    public final void LJJJIL(int i, int i2) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onMeasure");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJJIL(i, i2);
        } else {
            getExtendable().LJJJJJ(i, i2);
        }
    }

    public final void LJJJJI(ViewStructure viewStructure, int i) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onProvideAutofillVirtualStructure");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJJJI(viewStructure, i);
        } else {
            getExtendable().LJJJJLI(viewStructure, i);
        }
    }

    public final void LJJJJZ(View view, int i) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onVisibilityChanged");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJJJZ(view, i);
        } else {
            getExtendable().LJJL(i, view);
        }
    }

    public final void LJJL(String str, byte[] bArr) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "postUrl");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJL(str, bArr);
        } else {
            getExtendable().LJJLIIIJJIZ(str, bArr);
        }
    }

    public final void LJJLI(WebMessage webMessage, Uri uri) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "postWebMessage");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJLI(webMessage, uri);
        } else {
            getExtendable().LJJLIIIJL(webMessage, uri);
        }
    }

    public final boolean LJJLIIIJILLIZJL(int i, Rect rect) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "requestFocus");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            return ((C1ET3) abstractC1541670qDlLIZ).LJJLIIIJILLIZJL(i, rect);
        }
        return getExtendable().LJJLIIJ(i, rect);
    }

    public final void LJJZZIII(Executor executor, WebViewRenderProcessClient webViewRenderProcessClient) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "setWebViewRenderProcessClient");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJZZIII(executor, webViewRenderProcessClient);
        } else {
            getExtendable().LJLILLLLZI(executor, webViewRenderProcessClient);
        }
    }

    public final void LJJI(String str, String str2, String str3) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "loadData");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJI(str, str2, str3);
        } else {
            getExtendable().LJJIIJ(str, str2, str3);
        }
    }

    public final void LJJIJIL(boolean z, int i, Rect rect) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onFocusChanged");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJIJIL(z, i, rect);
        } else {
            getExtendable().LJJIZ(z, i, rect);
        }
    }

    public final boolean LJJJ(int i, int i2, KeyEvent keyEvent) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onKeyMultiple");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            return ((C1ET3) abstractC1541670qDlLIZ).LJJJ(i, i2, keyEvent);
        }
        return getExtendable().LJJJJI(i, i2, keyEvent);
    }

    public final void LJJLIIIJJIZ(String str, String str2, String str3) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "savePassword");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJLIIIJJIZ(str, str2, str3);
        } else {
            getExtendable().LJJLJ(str, str2, str3);
        }
    }

    public final void LJJLIIIJLLLLLLLZ(String str, boolean z, ValueCallback<String> valueCallback) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "saveWebArchive");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJLIIIJLLLLLLLZ(str, z, valueCallback);
        } else {
            getExtendable().LJJZ(str, z, valueCallback);
        }
    }

    public void LJJJJ(int i, int i2, boolean z, boolean z2) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onOverScrolled");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJJJ(i, i2, z, z2);
        } else {
            getExtendable().LJJJJJL(i, i2, z, z2);
        }
    }

    public void LJJJJJ(int i, int i2, int i3, int i4) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onScrollChanged");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJJJJ(i, i2, i3, i4);
        } else {
            getExtendable().LJJJJZI(i, i2, i3, i4);
        }
    }

    public final void LJJJJJL(int i, int i2, int i3, int i4) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onSizeChanged");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJJJJL(i, i2, i3, i4);
        } else {
            getExtendable().LJJJLIIL(i, i2, i3, i4);
        }
    }

    public final void LJJLJLI(String str, String str2, String str3, String str4) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "setHttpAuthUsernamePassword");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJLJLI(str, str2, str3, str4);
        } else {
            getExtendable().LJLI(str, str2, str3, str4);
        }
    }

    public final void LJJIFFI(String str, String str2, String str3, String str4, String str5) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "loadDataWithBaseURL");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            ((C1ET3) abstractC1541670qDlLIZ).LJJIFFI(str, str2, str3, str4, str5);
        } else {
            getExtendable().LJJIIJZLJL(str, str2, str3, str4, str5);
        }
    }

    public final boolean LJJJLL(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "overScrollBy");
        if (abstractC1541670qDlLIZ instanceof C1ET3) {
            return ((C1ET3) abstractC1541670qDlLIZ).LJJJLL(i, i2, i3, i4, i5, i6, i7, i8, z);
        }
        return getExtendable().LJJLIIIJ(i, i2, i3, i4, i5, i6, i7, i8, z);
    }
}
