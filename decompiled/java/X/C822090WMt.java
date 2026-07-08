package X;

import android.webkit.WebView;

/* JADX INFO: renamed from: X.0WMt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C822090WMt {
    public final String LIZ;
    public final String LIZIZ;
    public final WebView LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final C828420Wee LJI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        WebView webView = this.LIZJ;
        int iHashCode3 = (((iHashCode2 + (webView != null ? webView.hashCode() : 0)) * 31) + this.LIZLLL) * 31;
        boolean z = this.LJ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return ((((iHashCode3 + r0) * 31) + (this.LJFF ? 1 : 0)) * 31) + this.LJI.hashCode();
    }

    public C822090WMt(String str, String str2, WebView webView, int i, boolean z, boolean z2, C828420Wee c828420Wee) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = webView;
        this.LIZLLL = i;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = c828420Wee;
    }
}
