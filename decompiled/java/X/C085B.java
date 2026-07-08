package X;

import android.os.Looper;
import android.webkit.TracingConfig;
import android.webkit.TracingController;
import android.webkit.WebView;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.085B, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C085B {
    public static TracingController LIZ() {
        return TracingController.getInstance();
    }

    public static ClassLoader LIZIZ() {
        return WebView.getWebViewClassLoader();
    }

    public static Looper LIZJ(WebView webView) {
        return webView.getWebViewLooper();
    }

    public static boolean LIZLLL(TracingController tracingController) {
        return tracingController.isTracing();
    }

    public static void LJ(String str) {
        WebView.setDataDirectorySuffix(str);
    }

    public static void LJFF(TracingController tracingController, C085C c085c) {
        new TracingConfig.Builder();
        throw null;
    }

    public static boolean LJI(TracingController tracingController, OutputStream outputStream, Executor executor) {
        return tracingController.stop(outputStream, executor);
    }
}
