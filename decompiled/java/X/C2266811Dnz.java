package X;

import android.webkit.SafeBrowsingResponse;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: renamed from: X.1Dnz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2266811Dnz extends AbstractC2266831Do1 {
    public SafeBrowsingResponse LIZ;
    public SafeBrowsingResponseBoundaryInterface LIZIZ;

    public C2266811Dnz(InvocationHandler invocationHandler) {
        this.LIZIZ = (SafeBrowsingResponseBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    public C2266811Dnz(SafeBrowsingResponse safeBrowsingResponse) {
        this.LIZ = safeBrowsingResponse;
    }
}
