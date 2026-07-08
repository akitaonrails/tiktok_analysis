package X;

import android.webkit.WebView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0X6B, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X6B extends FilterInputStream {
    public final /* synthetic */ C843360X6o LL;
    public final /* synthetic */ C0X68 LLILLJJLI;
    public final /* synthetic */ WebView LLILLL;
    public final /* synthetic */ C0X70 LLILZ;
    public final /* synthetic */ C0X61 LLILZIL;

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C843360X6o c843360X6o = this.LL;
        C0X68 c0x68 = this.LLILLJJLI;
        WebView webView = this.LLILLL;
        C0X70 c0x70 = this.LLILZ;
        C0X61 c0x61 = this.LLILZIL;
        try {
            super.close();
            c843360X6o.LIZIZ.LJFF = System.currentTimeMillis();
            c843360X6o.LIZIZ.LIZIZ = System.currentTimeMillis();
            Map<String, String> map = c0x68.LJ;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Locale locale = Locale.US;
                    if (Intrinsics.LJFF(key.toLowerCase(locale), "content-type")) {
                        c843360X6o.LIZ.LJIIIIZZ = entry.getValue();
                    }
                    if (Intrinsics.LJFF(entry.getKey().toLowerCase(locale), "content-encoding")) {
                        c843360X6o.LIZ.LJIIIZ = entry.getValue();
                    }
                }
            }
            C0X72.LIZLLL(webView, c0x61, c843360X6o, c0x70);
            C0X6F c0x6f = C0X6F.BLOCK_BY_INTERCEPTOR;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("request failed for intercept ");
            c0x68.getClass();
            sbLIZ.append((String) null);
            c843360X6o.LIZ(webView, c0x6f, C2188811AlT.LIZIZ(sbLIZ), c0x61, c0x70);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0X6B(C843360X6o c843360X6o, C0X68 c0x68, WebView webView, C0X70 c0x70, C0X61 c0x61, InputStream inputStream) {
        super(inputStream);
        this.LL = c843360X6o;
        this.LLILLJJLI = c0x68;
        this.LLILLL = webView;
        this.LLILZ = c0x70;
        this.LLILZIL = c0x61;
    }
}
