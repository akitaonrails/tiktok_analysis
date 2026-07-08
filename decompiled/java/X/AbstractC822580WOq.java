package X;

import android.webkit.WebView;

/* JADX INFO: renamed from: X.0WOq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC822580WOq implements InterfaceC822590WOr, InterfaceC822570WOp, InterfaceC822600WOs {
    @Override // X.InterfaceC822590WOr
    public String onLoadUrl(WebView webView, String str) {
        String strOnLoadUrl;
        if (getNext() != null && (strOnLoadUrl = ((InterfaceC822590WOr) getNext()).onLoadUrl(webView, str)) != null) {
            return strOnLoadUrl;
        }
        return str;
    }
}
