package X;

import android.webkit.WebView;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0X6G, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X6G {
    public static final C01GW<CopyOnWriteArrayList<C0X67>> LIZJ = C452501pT.LIZIZ(new C0X6Y());
    public int LIZ;
    public int LIZIZ;

    public final C0X68 LIZ(WebView webView, C0X6M c0x6m) {
        int i = this.LIZ;
        C01GW<CopyOnWriteArrayList<C0X67>> c01gw = LIZJ;
        if (i == c01gw.getValue().size()) {
            return null;
        }
        CopyOnWriteArrayList<C0X67> value = c01gw.getValue();
        int i2 = this.LIZ;
        this.LIZ = i2 + 1;
        value.get(i2).LIZ(webView, c0x6m);
        return LIZ(webView, c0x6m);
    }

    public final void LIZIZ(WebView webView, C0X6M c0x6m, C843360X6o c843360X6o) {
        int i = this.LIZIZ;
        C01GW<CopyOnWriteArrayList<C0X67>> c01gw = LIZJ;
        if (i == c01gw.getValue().size()) {
            return;
        }
        CopyOnWriteArrayList<C0X67> value = c01gw.getValue();
        int i2 = this.LIZIZ;
        this.LIZIZ = i2 + 1;
        value.get(i2).LIZJ();
        LIZIZ(webView, c0x6m, c843360X6o);
    }
}
