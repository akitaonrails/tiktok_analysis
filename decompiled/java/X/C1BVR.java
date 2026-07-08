package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: renamed from: X.1BVR, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BVR extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        throw new C1BVS("An operation is not implemented");
    }

    @Override // android.webkit.WebChromeClient
    public final View getVideoLoadingProgressView() {
        throw new C1BVS("An operation is not implemented");
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) throws Throwable {
        C1BVU c1bvu;
        C0WST c0wst = new C0WST();
        Object[] objArr = {permissionRequest};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/webkit/PermissionRequest;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5Yp35E7D7kMuf6Bv4fFeOOl/KkfhSKBViBiQ/+rp2IlFCgiif/268hI4Qpa3ErP0c=", null));
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(102604, "com/bytedance/ies/bullet/service/base/web/WebChromeClientDelegate", "onPermissionRequest", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(102604, "com/bytedance/ies/bullet/service/base/web/WebChromeClientDelegate", "onPermissionRequest", null, objArr, this, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if ((objArr2 != null && objArr2[0] != null) || permissionRequest != null) {
            c1bvu = new C1BVU() { // from class: X.1BVT
            };
        } else {
            c1bvu = null;
        }
        C0WST c0wst2 = new C0WST();
        Object[] objArr3 = {c1bvu};
        C0WZW c0wzw2 = new C0WZW(false, "(Lcom/bytedance/ies/bullet/service/base/web/IPermissionRequest;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5Yp35E7D7kMuf6Bv4fFeOOl/KkfhSKBViBiQ/+rp2IlFCgiif/268hI4Qpa3ErP0c=", null));
        C0WSU c0wsuLIZIZ2 = c0wst2.LIZIZ(102604, "com/bytedance/ies/bullet/service/base/web/WebChromeClientDelegate", "onPermissionRequest", this, objArr3, "void", c0wzw2);
        if (c0wsuLIZIZ2.LIZ) {
            c0wst2.LIZ(102604, "com/bytedance/ies/bullet/service/base/web/WebChromeClientDelegate", "onPermissionRequest", null, objArr3, this, c0wzw2, false);
        } else {
            Object[] objArr4 = c0wsuLIZIZ2.LIZJ;
            if (objArr4 != null) {
                Object obj = objArr4[0];
            }
            c0wst2.LIZ(102604, "com/bytedance/ies/bullet/service/base/web/WebChromeClientDelegate", "onPermissionRequest", null, objArr3, this, c0wzw2, true);
        }
        c0wst.LIZ(102604, "com/bytedance/ies/bullet/service/base/web/WebChromeClientDelegate", "onPermissionRequest", null, objArr, this, c0wzw, true);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        throw new C1BVS("An operation is not implemented");
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        throw new C1BVS("An operation is not implemented");
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        throw new C1BVS("An operation is not implemented");
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        throw new C1BVS("An operation is not implemented");
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        throw new C1BVS("An operation is not implemented");
    }
}
