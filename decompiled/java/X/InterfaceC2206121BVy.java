package X;

import android.net.Uri;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: renamed from: X.1BVy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public interface InterfaceC2206121BVy {
    void LIZ(String str, GeolocationPermissions.Callback callback);

    boolean LIZIZ(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams);

    void LIZJ(WebView webView, String str);

    void LIZLLL(PermissionRequest permissionRequest);

    void LJ(String str);

    void onProgressChanged(WebView webView, int i);
}
