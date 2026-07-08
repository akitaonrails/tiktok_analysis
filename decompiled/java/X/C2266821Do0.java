package X;

import android.webkit.WebResourceError;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: renamed from: X.1Do0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2266821Do0 extends AbstractC2266841Do2 {
    public WebResourceError LIZ;
    public WebResourceErrorBoundaryInterface LIZIZ;

    public C2266821Do0(InvocationHandler invocationHandler) {
        this.LIZIZ = (WebResourceErrorBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    public C2266821Do0(WebResourceError webResourceError) {
        this.LIZ = webResourceError;
    }
}
