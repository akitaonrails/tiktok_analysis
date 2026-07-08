package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IExternalService;

/* JADX INFO: renamed from: X.0CBN, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CBN implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ExternalAttchInitRunnable@b75c.run");
        try {
            IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
            if (iExternalService != null) {
                iExternalService.attachApplication(C1BWL.LIZ());
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExternalAttchInitRunnable@b75c.run");
    }
}
