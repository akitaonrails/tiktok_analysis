package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.subscription.pgc.api.service.api.ILiveSdkSubscriptionOtherServicePgc;

/* JADX INFO: renamed from: X.00bR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C110700bR {
    public static final C110700bR LIZ = new C110700bR();
    public static volatile ILiveSdkSubscriptionOtherServicePgc LIZIZ;

    public static final ILiveSdkSubscriptionOtherServicePgc LIZ() {
        Object c098200Yq;
        Object c098200Yq2;
        ILiveSdkSubscriptionOtherServicePgc iLiveSdkSubscriptionOtherServicePgc = LIZIZ;
        if (iLiveSdkSubscriptionOtherServicePgc != null) {
            return iLiveSdkSubscriptionOtherServicePgc;
        }
        LIZ.getClass();
        try {
            c098200Yq = (ILiveSdkSubscriptionOtherServicePgc) PluggableExtentionKt.pluggableSpi$default(ILiveSdkSubscriptionOtherServicePgc.class, false, false, false, 14, null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        ILiveSdkSubscriptionOtherServicePgc iLiveSdkSubscriptionOtherServicePgc2 = (ILiveSdkSubscriptionOtherServicePgc) c098200Yq;
        if (iLiveSdkSubscriptionOtherServicePgc2 == null) {
            try {
                c098200Yq2 = (ILiveSdkSubscriptionOtherServicePgc) ServiceManager.get().getService(ILiveSdkSubscriptionOtherServicePgc.class);
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            iLiveSdkSubscriptionOtherServicePgc2 = (ILiveSdkSubscriptionOtherServicePgc) (C189200o6.m7isFailureimpl(c098200Yq2) ? null : c098200Yq2);
            if (iLiveSdkSubscriptionOtherServicePgc2 == null) {
                "PgcSubscriptionOtherServiceProvider is not initialized. Please call set(...) or provide ILiveSdkSubscriptionOtherServicePgc via pluggableSpi/ServiceManager.".toString();
                throw new IllegalStateException("PgcSubscriptionOtherServiceProvider is not initialized. Please call set(...) or provide ILiveSdkSubscriptionOtherServicePgc via pluggableSpi/ServiceManager.");
            }
        }
        LIZIZ = iLiveSdkSubscriptionOtherServicePgc2;
        return iLiveSdkSubscriptionOtherServicePgc2;
    }
}
