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

/* JADX INFO: renamed from: X.1BVQ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1BVQ extends WebChromeClient implements InterfaceC1541730qDr, C0V1Y {
    public C1541610qDf LL;
    public final C1542660qFM LLILLJJLI = new C1542660qFM();
    public WebChromeClient LLILLL;

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        WebChromeClient webChromeClient = this.LLILLL;
        return webChromeClient != null ? webChromeClient.getDefaultVideoPoster() : super.getDefaultVideoPoster();
    }

    @Override // X.InterfaceC1541730qDr
    public final C1541620qDg getExtendableContext() {
        C1542660qFM c1542660qFM = this.LLILLJJLI;
        if (c1542660qFM == null) {
            return null;
        }
        return c1542660qFM.LIZ;
    }

    @Override // android.webkit.WebChromeClient
    public View getVideoLoadingProgressView() {
        WebChromeClient webChromeClient = this.LLILLL;
        return webChromeClient != null ? webChromeClient.getVideoLoadingProgressView() : super.getVideoLoadingProgressView();
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
        WebChromeClient webChromeClient = this.LLILLL;
        if (webChromeClient != null) {
            webChromeClient.onGeolocationPermissionsHidePrompt();
        } else {
            super.onGeolocationPermissionsHidePrompt();
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        WebChromeClient webChromeClient = this.LLILLL;
        if (webChromeClient != null) {
            webChromeClient.onHideCustomView();
        } else {
            super.onHideCustomView();
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsTimeout() {
        WebChromeClient webChromeClient = this.LLILLL;
        return webChromeClient != null ? webChromeClient.onJsTimeout() : super.onJsTimeout();
    }

    @Override // X.InterfaceC1541730qDr
    public final void LIZIZ(C1541610qDf c1541610qDf) {
        this.LL = c1541610qDf;
        this.LLILLJJLI.LIZ = new C1541620qDg(this.LL, this);
    }

    @Override // android.webkit.WebChromeClient
    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        WebChromeClient webChromeClient = this.LLILLL;
        if (webChromeClient != null) {
            webChromeClient.getVisitedHistory(valueCallback);
        } else {
            super.getVisitedHistory(valueCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        WebChromeClient webChromeClient = this.LLILLL;
        if (webChromeClient != null) {
            webChromeClient.onCloseWindow(webView);
        } else {
            super.onCloseWindow(webView);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        WebChromeClient webChromeClient = this.LLILLL;
        if (webChromeClient != null) {
            return webChromeClient.onConsoleMessage(consoleMessage);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        Object obj;
        PermissionRequest permissionRequest2 = permissionRequest;
        C0WST c0wst = new C0WST();
        Object[] objArr = {permissionRequest2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/webkit/PermissionRequest;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyMf71DPq0mRD7+YFLRMkGtCltio4XZNqtgXUsxIfG0oI27b37DGDoYMGJMYmprO1dRuAa8hzRMe/I0WFnEA3DIqUd6JvBnTOJQAzzP", null));
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(102604, "com/bytedance/hybrid/web/extension/core/webview/client/inner/WebChromeContainerClientInner", "onPermissionRequest", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(102604, "com/bytedance/hybrid/web/extension/core/webview/client/inner/WebChromeContainerClientInner", "onPermissionRequest", null, objArr, this, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            permissionRequest2 = (PermissionRequest) obj;
        }
        WebChromeClient webChromeClient = this.LLILLL;
        if (webChromeClient != null) {
            webChromeClient.onPermissionRequest(permissionRequest2);
            c0wst.LIZ(102604, "com/bytedance/hybrid/web/extension/core/webview/client/inner/WebChromeContainerClientInner", "onPermissionRequest", null, objArr, this, c0wzw, true);
        } else {
            super.onPermissionRequest(permissionRequest2);
            c0wst.LIZ(102604, "com/bytedance/hybrid/web/extension/core/webview/client/inner/WebChromeContainerClientInner", "onPermissionRequest", null, objArr, this, c0wzw, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        WebChromeClient webChromeClient = this.LLILLL;
        if (webChromeClient != null) {
            webChromeClient.onPermissionRequestCanceled(permissionRequest);
        } else {
            super.onPermissionRequestCanceled(permissionRequest);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onRequestFocus(WebView webView) {
        WebChromeClient webChromeClient = this.LLILLL;
        if (webChromeClient != null) {
            webChromeClient.onRequestFocus(webView);
        } else {
            super.onRequestFocus(webView);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        GeolocationPermissions.Callback callback2 = callback;
        String str2 = str;
        C0WST c0wst = new C0WST();
        Object[] objArr = {str2, callback2};
        C0WZW c0wzw = new C0WZW(false, "(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyMf71DPq0mRD7+YFLRMkGtCltio4XZNqtgXUsxIfG0oI27b37DGDoYMGJMYmprO1dRuAa8hzRMe/I0WFnEA3DIqUd6JvBnTOJQAzzP", null));
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100003, "com/bytedance/hybrid/web/extension/core/webview/client/inner/WebChromeContainerClientInner", "onGeolocationPermissionsShowPrompt", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100003, "com/bytedance/hybrid/web/extension/core/webview/client/inner/WebChromeContainerClientInner", "onGeolocationPermissionsShowPrompt", null, objArr, this, c0wzw, false);
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
        WebChromeClient webChromeClient = this.LLILLL;
        if (webChromeClient != null) {
            webChromeClient.onGeolocationPermissionsShowPrompt(str2, callback2);
            c0wst.LIZ(100003, "com/bytedance/hybrid/web/extension/core/webview/client/inner/WebChromeContainerClientInner", "onGeolocationPermissionsShowPrompt", null, objArr, this, c0wzw, true);
        } else {
            super.onGeolocationPermissionsShowPrompt(str2, callback2);
            c0wst.LIZ(100003, "com/bytedance/hybrid/web/extension/core/webview/client/inner/WebChromeContainerClientInner", "onGeolocationPermissionsShowPrompt", null, objArr, this, c0wzw, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        WebChromeClient webChromeClient = this.LLILLL;
        if (webChromeClient != null) {
            webChromeClient.onProgressChanged(webView, i);
        } else {
            super.onProgressChanged(webView, i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        WebChromeClient webChromeClient = this.LLILLL;
        if (webChromeClient != null) {
            webChromeClient.onReceivedIcon(webView, bitmap);
        } else {
            super.onReceivedIcon(webView, bitmap);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        WebChromeClient webChromeClient = this.LLILLL;
        if (webChromeClient != null) {
            webChromeClient.onReceivedTitle(webView, str);
        } else {
            super.onReceivedTitle(webView, str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        WebChromeClient webChromeClient = this.LLILLL;
        if (webChromeClient != null) {
            webChromeClient.onShowCustomView(view, customViewCallback);
        } else {
            super.onShowCustomView(view, customViewCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i, String str2) {
        WebChromeClient webChromeClient = this.LLILLL;
        if (webChromeClient != null) {
            webChromeClient.onConsoleMessage(str, i, str2);
        } else {
            super.onConsoleMessage(str, i, str2);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        WebChromeClient webChromeClient = this.LLILLL;
        if (webChromeClient != null) {
            webChromeClient.onReceivedTouchIconUrl(webView, str, z);
        } else {
            super.onReceivedTouchIconUrl(webView, str, z);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        WebChromeClient webChromeClient = this.LLILLL;
        if (webChromeClient != null) {
            webChromeClient.onShowCustomView(view, i, customViewCallback);
        } else {
            super.onShowCustomView(view, i, customViewCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        WebChromeClient webChromeClient = this.LLILLL;
        if (webChromeClient != null) {
            return webChromeClient.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebChromeClient webChromeClient = this.LLILLL;
        if (webChromeClient != null) {
            return webChromeClient.onCreateWindow(webView, z, z2, message);
        }
        return super.onCreateWindow(webView, z, z2, message);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        WebChromeClient webChromeClient = this.LLILLL;
        if (webChromeClient != null) {
            return webChromeClient.onJsAlert(webView, str, str2, jsResult);
        }
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        WebChromeClient webChromeClient = this.LLILLL;
        if (webChromeClient != null) {
            return webChromeClient.onJsBeforeUnload(webView, str, str2, jsResult);
        }
        return super.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        WebChromeClient webChromeClient = this.LLILLL;
        if (webChromeClient != null) {
            return webChromeClient.onJsConfirm(webView, str, str2, jsResult);
        }
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        WebChromeClient webChromeClient = this.LLILLL;
        if (webChromeClient != null) {
            return webChromeClient.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    @Override // android.webkit.WebChromeClient
    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        WebChromeClient webChromeClient = this.LLILLL;
        if (webChromeClient != null) {
            webChromeClient.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
        } else {
            super.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
        }
    }
}
