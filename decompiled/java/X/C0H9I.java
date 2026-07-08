package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.utils.IECContextService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0H9I, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H9I {
    public static Context LIZIZ() {
        return ((IECContextService) ServiceManager.get().getService(IECContextService.class)).getContext();
    }

    public static int LIZ(double d) {
        Context contextLIZIZ = LIZIZ();
        if (contextLIZIZ != null && contextLIZIZ.getResources() != null && contextLIZIZ.getResources().getDisplayMetrics() != null) {
            return (int) ((d * ((double) contextLIZIZ.getResources().getDisplayMetrics().density)) + 0.5d);
        }
        return 0;
    }

    public static int LIZJ(double d) {
        return (int) ((d / ((double) C786410Ut5.N3(LIZIZ()).getResources().getDisplayMetrics().scaledDensity)) + 0.5d);
    }
}
