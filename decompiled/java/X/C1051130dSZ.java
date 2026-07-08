package X;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;

/* JADX INFO: renamed from: X.0dSZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1051130dSZ extends Exception {
    public final WebResourceRequest LL;
    public final WebResourceError LLILLJJLI;
    public final WebResourceResponse LLILLL;

    public final WebResourceError getError() {
        return this.LLILLJJLI;
    }

    public final WebResourceRequest getRequest() {
        return this.LL;
    }

    public final WebResourceResponse getResponse() {
        return this.LLILLL;
    }

    public C1051130dSZ(WebResourceRequest webResourceRequest, WebResourceError webResourceError, WebResourceResponse webResourceResponse) {
        this.LL = webResourceRequest;
        this.LLILLJJLI = webResourceError;
        this.LLILLL = webResourceResponse;
    }
}
