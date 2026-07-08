package X;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0q3m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1535480q3m implements WebResourceRequest {
    public final /* synthetic */ InterfaceC1535470q3l LIZ;

    @Override // android.webkit.WebResourceRequest
    public final String getMethod() {
        return "GET";
    }

    @Override // android.webkit.WebResourceRequest
    public final boolean hasGesture() {
        return false;
    }

    @Override // android.webkit.WebResourceRequest
    public final boolean isRedirect() {
        return false;
    }

    @Override // android.webkit.WebResourceRequest
    public final Map<String, String> getRequestHeaders() {
        Map<String, String> requestHeaders = this.LIZ.getRequestHeaders();
        return requestHeaders != null ? requestHeaders : new LinkedHashMap();
    }

    @Override // android.webkit.WebResourceRequest
    public final Uri getUrl() {
        return this.LIZ.getUrl();
    }

    @Override // android.webkit.WebResourceRequest
    public final boolean isForMainFrame() {
        return this.LIZ.isForMainFrame();
    }

    public C1535480q3m(InterfaceC1535470q3l interfaceC1535470q3l) {
        this.LIZ = interfaceC1535470q3l;
    }
}
