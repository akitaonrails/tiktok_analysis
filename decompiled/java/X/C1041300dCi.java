package X;

import android.os.Looper;
import android.webkit.WebView;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dCi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1041300dCi {
    public static final AtomicInteger LIZ = new AtomicInteger(0);
    public static WebView LIZIZ;
    public static C1041330dCl LIZJ;

    public static void LIZ() {
        LIZ.incrementAndGet();
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C15O7.LIZIZ(new Callable() { // from class: X.0dBk
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("PreMemWebManager@818c.stopPrefetching$1");
                    C1041300dCi.LIZ();
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PreMemWebManager@818c.stopPrefetching$1");
                    return unit;
                }
            }, C15O7.LJIIIIZZ, null);
            return;
        }
        WebView webView = LIZIZ;
        if (webView != null) {
            webView.stopLoading();
        }
        C1041330dCl c1041330dCl = LIZJ;
        if (c1041330dCl != null) {
            c1041330dCl.LIZ = null;
        }
    }
}
