package X;

import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: renamed from: X.0jc4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class RunnableC1287660jc4 implements Runnable {
    public final /* synthetic */ C1287750jcD LL;
    public final /* synthetic */ EnumC1287080jb8 LLILLJJLI;
    public final /* synthetic */ Map LLILLL;
    public final /* synthetic */ Map LLILZ = null;

    public /* synthetic */ RunnableC1287660jc4(C1287750jcD c1287750jcD, EnumC1287080jb8 enumC1287080jb8, Map map) {
        this.LL = c1287750jcD;
        this.LLILLJJLI = enumC1287080jb8;
        this.LLILLL = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1287750jcD c1287750jcD = this.LL;
        final EnumC1287080jb8 enumC1287080jb8 = this.LLILLJJLI;
        final Map map = this.LLILLL;
        final Map map2 = this.LLILZ;
        c1287750jcD.getClass();
        C1C7U.LIZ("PiaMetrics@8663.report$1L");
        for (final InterfaceC1287060jb6 interfaceC1287060jb6 : (HashSet) c1287750jcD.LIZJ) {
            if (interfaceC1287060jb6 != null) {
                WeakReference<WebView> weakReference = c1287750jcD.LJFF;
                final WebView webView = weakReference == null ? null : weakReference.get();
                C1287700jc8.LIZIZ(new Runnable() { // from class: X.0jb7
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1287060jb6 interfaceC1287060jb62 = interfaceC1287060jb6;
                        EnumC1287080jb8 enumC1287080jb82 = enumC1287080jb8;
                        WebView webView2 = webView;
                        Map<String, Object> map3 = map;
                        Map<String, Object> map4 = map2;
                        C1C7U.LIZ("PiaMetrics@8663.report$1L$1L");
                        interfaceC1287060jb62.LIZ(enumC1287080jb82.getValue(), webView2, map3, map4);
                        C1C7U.LIZIZ("PiaMetrics@8663.report$1L$1L");
                    }
                });
            }
        }
        C1C7U.LIZIZ("PiaMetrics@8663.report$1L");
    }
}
