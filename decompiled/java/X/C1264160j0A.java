package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0j0A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1264160j0A {
    public static final C1264160j0A LIZ = new C1264160j0A();

    public static final void LIZ(C1749280vcc c1749280vcc, EnumC1609900rzo enumC1609900rzo, Throwable th, Function0<Unit> function0) {
        Exception exc;
        INetworkStandardUIService iNetworkStandardUIService = (INetworkStandardUIService) ServiceManager.get().getService(INetworkStandardUIService.class);
        if (th instanceof Exception) {
            exc = (Exception) th;
        } else {
            exc = null;
        }
        iNetworkStandardUIService.setStatusView(c1749280vcc, enumC1609900rzo, function0, exc);
    }

    public static final void LIZIZ(C1749280vcc c1749280vcc, String str, Throwable th, Function0<Unit> function0) {
        Exception exc;
        INetworkStandardUIService iNetworkStandardUIService = (INetworkStandardUIService) ServiceManager.get().getService(INetworkStandardUIService.class);
        if (th instanceof Exception) {
            exc = (Exception) th;
        } else {
            exc = null;
        }
        iNetworkStandardUIService.setStatusView(c1749280vcc, str, function0, exc);
    }
}
