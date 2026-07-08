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
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.1BVP, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BVP extends WebChromeClient implements InterfaceC1548170qOF, Cloneable {
    public static final AtomicInteger LLILZIL = new AtomicInteger(0);
    public static final List<C1BVP>[] LLILZLL = new List[10];
    public static final WeakHashMap<WebChromeClient, Map<Integer, WeakReference<C1BVP>>> LLIZ = new WeakHashMap<>();
    public static final WebChromeClient LLIZLLLIL = new WebChromeClient();
    public String LLILLL;
    public WebChromeClient LLILZ = LLIZLLLIL;
    public int LLILLJJLI = LLILZIL.getAndIncrement();
    public final int LL = -1;

    @Override // X.InterfaceC1548170qOF
    public final String LIZ() {
        return C1BVP.class.getName();
    }

    public final Object clone() {
        try {
            C1BVP c1bvp = (C1BVP) super.clone();
            c1bvp.LLILLJJLI = this.LLILLJJLI;
            return c1bvp;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("WebChromeClientExt clone error");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        C1BVP c1bvpLIZJ = LIZJ(this);
        return c1bvpLIZJ != null ? c1bvpLIZJ.getDefaultVideoPoster() : this.LLILZ.getDefaultVideoPoster();
    }

    @Override // android.webkit.WebChromeClient
    public final View getVideoLoadingProgressView() {
        C1BVP c1bvpLIZJ = LIZJ(this);
        return c1bvpLIZJ != null ? c1bvpLIZJ.getVideoLoadingProgressView() : this.LLILZ.getVideoLoadingProgressView();
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        C1BVP c1bvpLIZJ = LIZJ(this);
        if (c1bvpLIZJ != null) {
            c1bvpLIZJ.onGeolocationPermissionsHidePrompt();
        } else {
            this.LLILZ.onGeolocationPermissionsHidePrompt();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        C1BVP c1bvpLIZJ = LIZJ(this);
        if (c1bvpLIZJ != null) {
            c1bvpLIZJ.onHideCustomView();
        } else {
            this.LLILZ.onHideCustomView();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsTimeout() {
        C1BVP c1bvpLIZJ = LIZJ(this);
        return c1bvpLIZJ != null ? c1bvpLIZJ.onJsTimeout() : this.LLILZ.onJsTimeout();
    }

    public static C1BVP LIZJ(C1BVP c1bvp) {
        boolean z;
        int i = c1bvp.LL;
        if (i < 0) {
            i = 2;
            z = true;
        } else {
            z = false;
        }
        while (true) {
            List<C1BVP>[] listArr = LLILZLL;
            if (i < listArr.length) {
                List<C1BVP> list = listArr[i];
                if (list != null) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        C1BVP c1bvp2 = (C1BVP) ListProtector.get(list, i2);
                        if (c1bvp2 != null) {
                            if (z) {
                                C1BVP c1bvpLIZIZ = LIZIZ(c1bvp2, c1bvp);
                                if (!C1548160qOE.LIZ(c1bvpLIZIZ.LLILLL, c1bvpLIZIZ)) {
                                    return c1bvpLIZIZ;
                                }
                            } else if (c1bvp2.LLILLJJLI != c1bvp.LLILLJJLI) {
                                continue;
                            } else {
                                int i3 = i2 + 1;
                                if (i3 < list.size()) {
                                    C1BVP c1bvp3 = (C1BVP) ListProtector.get(list, i3);
                                    if (c1bvp3 != null) {
                                        C1BVP c1bvpLIZIZ2 = LIZIZ(c1bvp3, c1bvp);
                                        if (!C1548160qOE.LIZ(c1bvpLIZIZ2.LLILLL, c1bvpLIZIZ2)) {
                                            return c1bvpLIZIZ2;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                i++;
            } else {
                return null;
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        C1BVP c1bvpLIZJ = LIZJ(this);
        if (c1bvpLIZJ != null) {
            c1bvpLIZJ.getVisitedHistory(valueCallback);
        } else {
            this.LLILZ.getVisitedHistory(valueCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        C1BVP c1bvpLIZJ = LIZJ(this);
        if (c1bvpLIZJ != null) {
            c1bvpLIZJ.onCloseWindow(webView);
        } else {
            this.LLILZ.onCloseWindow(webView);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        C1BVP c1bvpLIZJ = LIZJ(this);
        if (c1bvpLIZJ != null) {
            return c1bvpLIZJ.onConsoleMessage(consoleMessage);
        }
        return this.LLILZ.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) throws Throwable {
        Object obj;
        PermissionRequest permissionRequest2 = permissionRequest;
        C0WST c0wst = new C0WST();
        Object[] objArr = {permissionRequest2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/webkit/PermissionRequest;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyIfx2bdaMzSphZ1vNnQrubtpFH2MzflQ/UJmahh3yuOF4VkRpQ", null));
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(102604, "com/bytedance/lynx/hybrid/webkit/WebChromeClientExt", "onPermissionRequest", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(102604, "com/bytedance/lynx/hybrid/webkit/WebChromeClientExt", "onPermissionRequest", null, objArr, this, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            permissionRequest2 = (PermissionRequest) obj;
        }
        C1BVP c1bvpLIZJ = LIZJ(this);
        if (c1bvpLIZJ != null) {
            c1bvpLIZJ.onPermissionRequest(permissionRequest2);
        } else {
            this.LLILZ.onPermissionRequest(permissionRequest2);
        }
        c0wst.LIZ(102604, "com/bytedance/lynx/hybrid/webkit/WebChromeClientExt", "onPermissionRequest", null, objArr, this, c0wzw, true);
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        C1BVP c1bvpLIZJ = LIZJ(this);
        if (c1bvpLIZJ != null) {
            c1bvpLIZJ.onPermissionRequestCanceled(permissionRequest);
        } else {
            this.LLILZ.onPermissionRequestCanceled(permissionRequest);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onRequestFocus(WebView webView) {
        C1BVP c1bvpLIZJ = LIZJ(this);
        if (c1bvpLIZJ != null) {
            c1bvpLIZJ.onRequestFocus(webView);
        } else {
            this.LLILZ.onRequestFocus(webView);
        }
    }

    public static C1BVP LIZIZ(C1BVP c1bvp, C1BVP c1bvp2) {
        C1BVP c1bvp3;
        Map<Integer, WeakReference<C1BVP>> map = LLIZ.get(c1bvp2.LLILZ);
        if (map == null) {
            map = new HashMap<>();
            LLIZ.put(c1bvp2.LLILZ, map);
        }
        WeakReference<C1BVP> weakReference = map.get(Integer.valueOf(c1bvp.LLILLJJLI));
        if (weakReference == null || (c1bvp3 = weakReference.get()) == null) {
            try {
                c1bvp3 = (C1BVP) super.clone();
                c1bvp3.LLILLJJLI = c1bvp.LLILLJJLI;
                WebChromeClient webChromeClient = c1bvp2.LLILZ;
                if (webChromeClient == null) {
                    c1bvp3.LLILZ = LLIZLLLIL;
                } else {
                    c1bvp3.LLILZ = webChromeClient;
                }
                map.put(Integer.valueOf(c1bvp.LLILLJJLI), new WeakReference<>(c1bvp3));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException("WebChromeClientExt clone error");
            }
        }
        c1bvp3.LLILLL = c1bvp2.LLILLL;
        return c1bvp3;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) throws Throwable {
        GeolocationPermissions.Callback callback2 = callback;
        String str2 = str;
        C0WST c0wst = new C0WST();
        Object[] objArr = {str2, callback2};
        C0WZW c0wzw = new C0WZW(false, "(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyIfx2bdaMzSphZ1vNnQrubtpFH2MzflQ/UJmahh3yuOF4VkRpQ", null));
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100003, "com/bytedance/lynx/hybrid/webkit/WebChromeClientExt", "onGeolocationPermissionsShowPrompt", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100003, "com/bytedance/lynx/hybrid/webkit/WebChromeClientExt", "onGeolocationPermissionsShowPrompt", null, objArr, this, c0wzw, false);
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
        C1BVP c1bvpLIZJ = LIZJ(this);
        if (c1bvpLIZJ != null) {
            c1bvpLIZJ.onGeolocationPermissionsShowPrompt(str2, callback2);
        } else {
            this.LLILZ.onGeolocationPermissionsShowPrompt(str2, callback2);
        }
        c0wst.LIZ(100003, "com/bytedance/lynx/hybrid/webkit/WebChromeClientExt", "onGeolocationPermissionsShowPrompt", null, objArr, this, c0wzw, true);
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        C1BVP c1bvpLIZJ = LIZJ(this);
        if (c1bvpLIZJ != null) {
            c1bvpLIZJ.onProgressChanged(webView, i);
        } else {
            this.LLILZ.onProgressChanged(webView, i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        C1BVP c1bvpLIZJ = LIZJ(this);
        if (c1bvpLIZJ != null) {
            c1bvpLIZJ.onReceivedIcon(webView, bitmap);
        } else {
            this.LLILZ.onReceivedIcon(webView, bitmap);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        C1BVP c1bvpLIZJ = LIZJ(this);
        if (c1bvpLIZJ != null) {
            c1bvpLIZJ.onReceivedTitle(webView, str);
        } else {
            this.LLILZ.onReceivedTitle(webView, str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        C1BVP c1bvpLIZJ = LIZJ(this);
        if (c1bvpLIZJ != null) {
            c1bvpLIZJ.onShowCustomView(view, customViewCallback);
        } else {
            this.LLILZ.onShowCustomView(view, customViewCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onConsoleMessage(String str, int i, String str2) {
        C1BVP c1bvpLIZJ = LIZJ(this);
        if (c1bvpLIZJ != null) {
            c1bvpLIZJ.onConsoleMessage(str, i, str2);
        } else {
            this.LLILZ.onConsoleMessage(str, i, str2);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        C1BVP c1bvpLIZJ = LIZJ(this);
        if (c1bvpLIZJ != null) {
            c1bvpLIZJ.onReceivedTouchIconUrl(webView, str, z);
        } else {
            this.LLILZ.onReceivedTouchIconUrl(webView, str, z);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        C1BVP c1bvpLIZJ = LIZJ(this);
        if (c1bvpLIZJ != null) {
            c1bvpLIZJ.onShowCustomView(view, i, customViewCallback);
        } else {
            this.LLILZ.onShowCustomView(view, i, customViewCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        C1BVP c1bvpLIZJ = LIZJ(this);
        if (c1bvpLIZJ != null) {
            return c1bvpLIZJ.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        return this.LLILZ.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        C1BVP c1bvpLIZJ = LIZJ(this);
        if (c1bvpLIZJ != null) {
            return c1bvpLIZJ.onCreateWindow(webView, z, z2, message);
        }
        return this.LLILZ.onCreateWindow(webView, z, z2, message);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        C1BVP c1bvpLIZJ = LIZJ(this);
        if (c1bvpLIZJ != null) {
            return c1bvpLIZJ.onJsAlert(webView, str, str2, jsResult);
        }
        return this.LLILZ.onJsAlert(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        C1BVP c1bvpLIZJ = LIZJ(this);
        if (c1bvpLIZJ != null) {
            return c1bvpLIZJ.onJsBeforeUnload(webView, str, str2, jsResult);
        }
        return this.LLILZ.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        C1BVP c1bvpLIZJ = LIZJ(this);
        if (c1bvpLIZJ != null) {
            return c1bvpLIZJ.onJsConfirm(webView, str, str2, jsResult);
        }
        return this.LLILZ.onJsConfirm(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        C1BVP c1bvpLIZJ = LIZJ(this);
        if (c1bvpLIZJ != null) {
            return c1bvpLIZJ.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
        return this.LLILZ.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        C1BVP c1bvpLIZJ = LIZJ(this);
        if (c1bvpLIZJ != null) {
            c1bvpLIZJ.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
        } else {
            this.LLILZ.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
        }
    }
}
