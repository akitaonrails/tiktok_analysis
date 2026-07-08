package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;

/* JADX INFO: renamed from: X.1BVW, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BVW extends C1BVQ {
    public final Bitmap LIZ() {
        return super.getDefaultVideoPoster();
    }

    public final View LIZJ() {
        return super.getVideoLoadingProgressView();
    }

    public final boolean LJIILLIIL() {
        return super.onJsTimeout();
    }

    @Override // X.C1BVQ, android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "getDefaultVideoPoster");
        if (!(abstractC1541670qDlLIZIZ instanceof C1BVX)) {
            return super.getDefaultVideoPoster();
        }
        C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
        c1542630qFJ.get().LIZIZ();
        Bitmap defaultVideoPoster = ((C1BVX) abstractC1541670qDlLIZIZ).getDefaultVideoPoster();
        c1542630qFJ.get().LIZ();
        return defaultVideoPoster;
    }

    @Override // X.C1BVQ, android.webkit.WebChromeClient
    public final View getVideoLoadingProgressView() {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "getVideoLoadingProgressView");
        if (!(abstractC1541670qDlLIZIZ instanceof C1BVX)) {
            return super.getVideoLoadingProgressView();
        }
        C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
        c1542630qFJ.get().LIZIZ();
        View videoLoadingProgressView = ((C1BVX) abstractC1541670qDlLIZIZ).getVideoLoadingProgressView();
        c1542630qFJ.get().LIZ();
        return videoLoadingProgressView;
    }

    @Override // X.C1BVQ, android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onGeolocationPermissionsHidePrompt");
        if (!(abstractC1541670qDlLIZIZ instanceof C1BVX)) {
            super.onGeolocationPermissionsHidePrompt();
            return;
        }
        C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
        c1542630qFJ.get().LIZIZ();
        ((C1BVX) abstractC1541670qDlLIZIZ).onGeolocationPermissionsHidePrompt();
        c1542630qFJ.get().LIZ();
    }

    @Override // X.C1BVQ, android.webkit.WebChromeClient
    public final void onHideCustomView() {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onHideCustomView");
        if (!(abstractC1541670qDlLIZIZ instanceof C1BVX)) {
            super.onHideCustomView();
            return;
        }
        C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
        c1542630qFJ.get().LIZIZ();
        ((C1BVX) abstractC1541670qDlLIZIZ).onHideCustomView();
        c1542630qFJ.get().LIZ();
    }

    @Override // X.C1BVQ, android.webkit.WebChromeClient
    public final boolean onJsTimeout() {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onJsTimeout");
        if (!(abstractC1541670qDlLIZIZ instanceof C1BVX)) {
            return super.onJsTimeout();
        }
        C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
        c1542630qFJ.get().LIZIZ();
        boolean zOnJsTimeout = ((C1BVX) abstractC1541670qDlLIZIZ).onJsTimeout();
        c1542630qFJ.get().LIZ();
        return zOnJsTimeout;
    }

    public final void LJIIIZ() {
        super.onGeolocationPermissionsHidePrompt();
    }

    public final void LJIIJJI() {
        super.onHideCustomView();
    }

    public final void LIZLLL(ValueCallback<String[]> valueCallback) {
        super.getVisitedHistory(valueCallback);
    }

    public final void LJ(WebView webView) {
        super.onCloseWindow(webView);
    }

    public final boolean LJI(ConsoleMessage consoleMessage) {
        return super.onConsoleMessage(consoleMessage);
    }

    public final void LJIIZILJ(PermissionRequest permissionRequest) {
        super.onPermissionRequest(permissionRequest);
    }

    public final void LJIJ(PermissionRequest permissionRequest) {
        super.onPermissionRequestCanceled(permissionRequest);
    }

    public final void LJJ(WebView webView) {
        super.onRequestFocus(webView);
    }

    @Override // X.C1BVQ, android.webkit.WebChromeClient
    public final void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "getVisitedHistory");
        if (abstractC1541670qDlLIZIZ instanceof C1BVX) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1BVX) abstractC1541670qDlLIZIZ).getVisitedHistory(valueCallback);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.getVisitedHistory(valueCallback);
    }

    @Override // X.C1BVQ, android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onCloseWindow");
        if (abstractC1541670qDlLIZIZ instanceof C1BVX) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1BVX) abstractC1541670qDlLIZIZ).onCloseWindow(webView);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onCloseWindow(webView);
    }

    @Override // X.C1BVQ, android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onConsoleMessage");
        if (abstractC1541670qDlLIZIZ instanceof C1BVX) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            boolean zOnConsoleMessage = ((C1BVX) abstractC1541670qDlLIZIZ).onConsoleMessage(consoleMessage);
            c1542630qFJ.get().LIZ();
            return zOnConsoleMessage;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // X.C1BVQ, android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) throws Throwable {
        Object obj;
        PermissionRequest permissionRequest2 = permissionRequest;
        C0WST c0wst = new C0WST();
        Object[] objArr = {permissionRequest2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/webkit/PermissionRequest;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyMf71DPq0mRD7+YFLRMkGtCltio4XZNqtgXUsxIfG0oI27b37DGDoYMFxHbkxxZ29ZvxaF+OW8rd4kOR4pGSyQhg==", null));
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(102604, "com/bytedance/hybrid/web/extension/core/webview/client/WebChromeContainerClient", "onPermissionRequest", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(102604, "com/bytedance/hybrid/web/extension/core/webview/client/WebChromeContainerClient", "onPermissionRequest", null, objArr, this, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            permissionRequest2 = (PermissionRequest) obj;
        }
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onPermissionRequest");
        if (abstractC1541670qDlLIZIZ instanceof C1BVX) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1BVX) abstractC1541670qDlLIZIZ).onPermissionRequest(permissionRequest2);
            c1542630qFJ.get().LIZ();
        } else {
            super.onPermissionRequest(permissionRequest2);
        }
        c0wst.LIZ(102604, "com/bytedance/hybrid/web/extension/core/webview/client/WebChromeContainerClient", "onPermissionRequest", null, objArr, this, c0wzw, true);
    }

    @Override // X.C1BVQ, android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onPermissionRequestCanceled");
        if (abstractC1541670qDlLIZIZ instanceof C1BVX) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1BVX) abstractC1541670qDlLIZIZ).onPermissionRequestCanceled(permissionRequest);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onPermissionRequestCanceled(permissionRequest);
    }

    @Override // X.C1BVQ, android.webkit.WebChromeClient
    public final void onRequestFocus(WebView webView) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onRequestFocus");
        if (abstractC1541670qDlLIZIZ instanceof C1BVX) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1BVX) abstractC1541670qDlLIZIZ).onRequestFocus(webView);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onRequestFocus(webView);
    }

    public final void LJIIJ(String str, GeolocationPermissions.Callback callback) {
        super.onGeolocationPermissionsShowPrompt(str, callback);
    }

    public final void LJIJI(WebView webView, int i) {
        super.onProgressChanged(webView, i);
    }

    public final void LJIJJ(WebView webView, Bitmap bitmap) {
        super.onReceivedIcon(webView, bitmap);
    }

    public final void LJIJJLI(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
    }

    public final void LJJIFFI(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
    }

    @Override // X.C1BVQ, android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) throws Throwable {
        GeolocationPermissions.Callback callback2 = callback;
        String str2 = str;
        C0WST c0wst = new C0WST();
        Object[] objArr = {str2, callback2};
        C0WZW c0wzw = new C0WZW(false, "(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyMf71DPq0mRD7+YFLRMkGtCltio4XZNqtgXUsxIfG0oI27b37DGDoYMFxHbkxxZ29ZvxaF+OW8rd4kOR4pGSyQhg==", null));
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100003, "com/bytedance/hybrid/web/extension/core/webview/client/WebChromeContainerClient", "onGeolocationPermissionsShowPrompt", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100003, "com/bytedance/hybrid/web/extension/core/webview/client/WebChromeContainerClient", "onGeolocationPermissionsShowPrompt", null, objArr, this, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                str2 = (String) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                callback2 = (GeolocationPermissions.Callback) obj2;
            }
        }
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onGeolocationPermissionsShowPrompt");
        if (abstractC1541670qDlLIZIZ instanceof C1BVX) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1BVX) abstractC1541670qDlLIZIZ).onGeolocationPermissionsShowPrompt(str2, callback2);
            c1542630qFJ.get().LIZ();
        } else {
            super.onGeolocationPermissionsShowPrompt(str2, callback2);
        }
        c0wst.LIZ(100003, "com/bytedance/hybrid/web/extension/core/webview/client/WebChromeContainerClient", "onGeolocationPermissionsShowPrompt", null, objArr, this, c0wzw, true);
    }

    @Override // X.C1BVQ, android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onProgressChanged");
        if (abstractC1541670qDlLIZIZ instanceof C1BVX) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1BVX) abstractC1541670qDlLIZIZ).onProgressChanged(webView, i);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onProgressChanged(webView, i);
    }

    @Override // X.C1BVQ, android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onReceivedIcon");
        if (abstractC1541670qDlLIZIZ instanceof C1BVX) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1BVX) abstractC1541670qDlLIZIZ).onReceivedIcon(webView, bitmap);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onReceivedIcon(webView, bitmap);
    }

    @Override // X.C1BVQ, android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onReceivedTitle");
        if (abstractC1541670qDlLIZIZ instanceof C1BVX) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1BVX) abstractC1541670qDlLIZIZ).onReceivedTitle(webView, str);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onReceivedTitle(webView, str);
    }

    @Override // X.C1BVQ, android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onShowCustomView");
        if (abstractC1541670qDlLIZIZ instanceof C1BVX) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1BVX) abstractC1541670qDlLIZIZ).onShowCustomView(view, customViewCallback);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onShowCustomView(view, customViewCallback);
    }

    public final void LJFF(int i, String str, String str2) {
        super.onConsoleMessage(str, i, str2);
    }

    public final void LJIL(WebView webView, String str, boolean z) {
        super.onReceivedTouchIconUrl(webView, str, z);
    }

    public final void LJJI(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, i, customViewCallback);
    }

    public final boolean LJJII(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    @Override // X.C1BVQ, android.webkit.WebChromeClient
    public final void onConsoleMessage(String str, int i, String str2) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onConsoleMessage");
        if (abstractC1541670qDlLIZIZ instanceof C1BVX) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1BVX) abstractC1541670qDlLIZIZ).onConsoleMessage(str, i, str2);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onConsoleMessage(str, i, str2);
    }

    @Override // X.C1BVQ, android.webkit.WebChromeClient
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onReceivedTouchIconUrl");
        if (abstractC1541670qDlLIZIZ instanceof C1BVX) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1BVX) abstractC1541670qDlLIZIZ).onReceivedTouchIconUrl(webView, str, z);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onReceivedTouchIconUrl(webView, str, z);
    }

    @Override // X.C1BVQ, android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onShowCustomView");
        if (abstractC1541670qDlLIZIZ instanceof C1BVX) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1BVX) abstractC1541670qDlLIZIZ).onShowCustomView(view, i, customViewCallback);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onShowCustomView(view, i, customViewCallback);
    }

    @Override // X.C1BVQ, android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onShowFileChooser");
        if (abstractC1541670qDlLIZIZ instanceof C1BVX) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            boolean zOnShowFileChooser = ((C1BVX) abstractC1541670qDlLIZIZ).onShowFileChooser(webView, valueCallback, fileChooserParams);
            c1542630qFJ.get().LIZ();
            return zOnShowFileChooser;
        }
        return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    public final boolean LJII(WebView webView, boolean z, boolean z2, Message message) {
        return super.onCreateWindow(webView, z, z2, message);
    }

    public final boolean LJIIL(WebView webView, String str, String str2, JsResult jsResult) {
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    public final boolean LJIILIIL(WebView webView, String str, String str2, JsResult jsResult) {
        return super.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    public final boolean LJIILJJIL(WebView webView, String str, String str2, JsResult jsResult) {
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    @Override // X.C1BVQ, android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onCreateWindow");
        if (abstractC1541670qDlLIZIZ instanceof C1BVX) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            boolean zOnCreateWindow = ((C1BVX) abstractC1541670qDlLIZIZ).onCreateWindow(webView, z, z2, message);
            c1542630qFJ.get().LIZ();
            return zOnCreateWindow;
        }
        return super.onCreateWindow(webView, z, z2, message);
    }

    @Override // X.C1BVQ, android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onJsAlert");
        if (abstractC1541670qDlLIZIZ instanceof C1BVX) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            boolean zOnJsAlert = ((C1BVX) abstractC1541670qDlLIZIZ).onJsAlert(webView, str, str2, jsResult);
            c1542630qFJ.get().LIZ();
            return zOnJsAlert;
        }
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    @Override // X.C1BVQ, android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onJsBeforeUnload");
        if (abstractC1541670qDlLIZIZ instanceof C1BVX) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            boolean zOnJsBeforeUnload = ((C1BVX) abstractC1541670qDlLIZIZ).onJsBeforeUnload(webView, str, str2, jsResult);
            c1542630qFJ.get().LIZ();
            return zOnJsBeforeUnload;
        }
        return super.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    @Override // X.C1BVQ, android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onJsConfirm");
        if (abstractC1541670qDlLIZIZ instanceof C1BVX) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            boolean zOnJsConfirm = ((C1BVX) abstractC1541670qDlLIZIZ).onJsConfirm(webView, str, str2, jsResult);
            c1542630qFJ.get().LIZ();
            return zOnJsConfirm;
        }
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    public final boolean LJIILL(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    @Override // X.C1BVQ, android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onJsPrompt");
        if (abstractC1541670qDlLIZIZ instanceof C1BVX) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            boolean zOnJsPrompt = ((C1BVX) abstractC1541670qDlLIZIZ).onJsPrompt(webView, str, str2, str3, jsPromptResult);
            c1542630qFJ.get().LIZ();
            return zOnJsPrompt;
        }
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    public final void LJIIIIZZ(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        super.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
    }

    @Override // X.C1BVQ, android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onExceededDatabaseQuota");
        if (abstractC1541670qDlLIZIZ instanceof C1BVX) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((C1BVX) abstractC1541670qDlLIZIZ).onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
    }
}
