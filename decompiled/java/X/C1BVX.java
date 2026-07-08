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

/* JADX INFO: renamed from: X.1BVX, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public abstract class C1BVX extends AbstractC1541670qDl<C1BVW> {
    public Bitmap getDefaultVideoPoster() {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "getDefaultVideoPoster");
        return abstractC1541670qDlLIZ instanceof C1BVX ? ((C1BVX) abstractC1541670qDlLIZ).getDefaultVideoPoster() : getExtendable().LIZ();
    }

    public View getVideoLoadingProgressView() {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "getVideoLoadingProgressView");
        return abstractC1541670qDlLIZ instanceof C1BVX ? ((C1BVX) abstractC1541670qDlLIZ).getVideoLoadingProgressView() : getExtendable().LIZJ();
    }

    public void onGeolocationPermissionsHidePrompt() {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onGeolocationPermissionsHidePrompt");
        if (abstractC1541670qDlLIZ instanceof C1BVX) {
            ((C1BVX) abstractC1541670qDlLIZ).onGeolocationPermissionsHidePrompt();
        } else {
            getExtendable().LJIIIZ();
        }
    }

    public void onHideCustomView() {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onHideCustomView");
        if (abstractC1541670qDlLIZ instanceof C1BVX) {
            ((C1BVX) abstractC1541670qDlLIZ).onHideCustomView();
        } else {
            getExtendable().LJIIJJI();
        }
    }

    public boolean onJsTimeout() {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onJsTimeout");
        return abstractC1541670qDlLIZ instanceof C1BVX ? ((C1BVX) abstractC1541670qDlLIZ).onJsTimeout() : getExtendable().LJIILLIIL();
    }

    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "getVisitedHistory");
        if (abstractC1541670qDlLIZ instanceof C1BVX) {
            ((C1BVX) abstractC1541670qDlLIZ).getVisitedHistory(valueCallback);
        } else {
            getExtendable().LIZLLL(valueCallback);
        }
    }

    public void onCloseWindow(WebView webView) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onCloseWindow");
        if (abstractC1541670qDlLIZ instanceof C1BVX) {
            ((C1BVX) abstractC1541670qDlLIZ).onCloseWindow(webView);
        } else {
            getExtendable().LJ(webView);
        }
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onConsoleMessage");
        if (abstractC1541670qDlLIZ instanceof C1BVX) {
            return ((C1BVX) abstractC1541670qDlLIZ).onConsoleMessage(consoleMessage);
        }
        return getExtendable().LJI(consoleMessage);
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onPermissionRequest");
        if (abstractC1541670qDlLIZ instanceof C1BVX) {
            ((C1BVX) abstractC1541670qDlLIZ).onPermissionRequest(permissionRequest);
        } else {
            getExtendable().LJIIZILJ(permissionRequest);
        }
    }

    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onPermissionRequestCanceled");
        if (abstractC1541670qDlLIZ instanceof C1BVX) {
            ((C1BVX) abstractC1541670qDlLIZ).onPermissionRequestCanceled(permissionRequest);
        } else {
            getExtendable().LJIJ(permissionRequest);
        }
    }

    public void onRequestFocus(WebView webView) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onRequestFocus");
        if (abstractC1541670qDlLIZ instanceof C1BVX) {
            ((C1BVX) abstractC1541670qDlLIZ).onRequestFocus(webView);
        } else {
            getExtendable().LJJ(webView);
        }
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onGeolocationPermissionsShowPrompt");
        if (abstractC1541670qDlLIZ instanceof C1BVX) {
            ((C1BVX) abstractC1541670qDlLIZ).onGeolocationPermissionsShowPrompt(str, callback);
        } else {
            getExtendable().LJIIJ(str, callback);
        }
    }

    public void onProgressChanged(WebView webView, int i) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onProgressChanged");
        if (abstractC1541670qDlLIZ instanceof C1BVX) {
            ((C1BVX) abstractC1541670qDlLIZ).onProgressChanged(webView, i);
        } else {
            getExtendable().LJIJI(webView, i);
        }
    }

    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onReceivedIcon");
        if (abstractC1541670qDlLIZ instanceof C1BVX) {
            ((C1BVX) abstractC1541670qDlLIZ).onReceivedIcon(webView, bitmap);
        } else {
            getExtendable().LJIJJ(webView, bitmap);
        }
    }

    public void onReceivedTitle(WebView webView, String str) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onReceivedTitle");
        if (abstractC1541670qDlLIZ instanceof C1BVX) {
            ((C1BVX) abstractC1541670qDlLIZ).onReceivedTitle(webView, str);
        } else {
            getExtendable().LJIJJLI(webView, str);
        }
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onShowCustomView");
        if (abstractC1541670qDlLIZ instanceof C1BVX) {
            ((C1BVX) abstractC1541670qDlLIZ).onShowCustomView(view, customViewCallback);
        } else {
            getExtendable().LJJIFFI(view, customViewCallback);
        }
    }

    public void onConsoleMessage(String str, int i, String str2) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onConsoleMessage");
        if (abstractC1541670qDlLIZ instanceof C1BVX) {
            ((C1BVX) abstractC1541670qDlLIZ).onConsoleMessage(str, i, str2);
        } else {
            getExtendable().LJFF(i, str, str2);
        }
    }

    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onReceivedTouchIconUrl");
        if (abstractC1541670qDlLIZ instanceof C1BVX) {
            ((C1BVX) abstractC1541670qDlLIZ).onReceivedTouchIconUrl(webView, str, z);
        } else {
            getExtendable().LJIL(webView, str, z);
        }
    }

    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onShowCustomView");
        if (abstractC1541670qDlLIZ instanceof C1BVX) {
            ((C1BVX) abstractC1541670qDlLIZ).onShowCustomView(view, i, customViewCallback);
        } else {
            getExtendable().LJJI(view, i, customViewCallback);
        }
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onShowFileChooser");
        if (abstractC1541670qDlLIZ instanceof C1BVX) {
            return ((C1BVX) abstractC1541670qDlLIZ).onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        return getExtendable().LJJII(webView, valueCallback, fileChooserParams);
    }

    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onCreateWindow");
        if (abstractC1541670qDlLIZ instanceof C1BVX) {
            return ((C1BVX) abstractC1541670qDlLIZ).onCreateWindow(webView, z, z2, message);
        }
        return getExtendable().LJII(webView, z, z2, message);
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onJsAlert");
        if (abstractC1541670qDlLIZ instanceof C1BVX) {
            return ((C1BVX) abstractC1541670qDlLIZ).onJsAlert(webView, str, str2, jsResult);
        }
        return getExtendable().LJIIL(webView, str, str2, jsResult);
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onJsBeforeUnload");
        if (abstractC1541670qDlLIZ instanceof C1BVX) {
            return ((C1BVX) abstractC1541670qDlLIZ).onJsBeforeUnload(webView, str, str2, jsResult);
        }
        return getExtendable().LJIILIIL(webView, str, str2, jsResult);
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onJsConfirm");
        if (abstractC1541670qDlLIZ instanceof C1BVX) {
            return ((C1BVX) abstractC1541670qDlLIZ).onJsConfirm(webView, str, str2, jsResult);
        }
        return getExtendable().LJIILJJIL(webView, str, str2, jsResult);
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onJsPrompt");
        if (abstractC1541670qDlLIZ instanceof C1BVX) {
            return ((C1BVX) abstractC1541670qDlLIZ).onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
        return getExtendable().LJIILL(webView, str, str2, str3, jsPromptResult);
    }

    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onExceededDatabaseQuota");
        if (abstractC1541670qDlLIZ instanceof C1BVX) {
            ((C1BVX) abstractC1541670qDlLIZ).onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
        } else {
            getExtendable().LJIIIIZZ(str, str2, j, j2, j3, quotaUpdater);
        }
    }
}
