package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.subscription.pgc.api.host.PgcHostAction;

/* JADX INFO: renamed from: X.07hR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1931507hR {
    public static final C1931507hR LIZ = new C1931507hR();
    public static volatile PgcHostAction LIZIZ;

    public static final PgcHostAction LIZ() {
        Object c098200Yq;
        Object c098200Yq2;
        PgcHostAction pgcHostAction = LIZIZ;
        if (pgcHostAction != null) {
            return pgcHostAction;
        }
        LIZ.getClass();
        try {
            c098200Yq = (PgcHostAction) PluggableExtentionKt.pluggableSpi$default(PgcHostAction.class, false, false, false, 14, null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        PgcHostAction pgcHostAction2 = (PgcHostAction) c098200Yq;
        if (pgcHostAction2 == null) {
            try {
                c098200Yq2 = (PgcHostAction) ServiceManager.get().getService(PgcHostAction.class);
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            pgcHostAction2 = (PgcHostAction) (C189200o6.m7isFailureimpl(c098200Yq2) ? null : c098200Yq2);
            if (pgcHostAction2 == null) {
                "PgcHostActionProvider is not initialized. Please call PgcHostActionProvider.set(...) or provide a PgcHostAction via pluggableSpi/ServiceManager.".toString();
                throw new IllegalStateException("PgcHostActionProvider is not initialized. Please call PgcHostActionProvider.set(...) or provide a PgcHostAction via pluggableSpi/ServiceManager.");
            }
        }
        LIZIZ = pgcHostAction2;
        return pgcHostAction2;
    }
}
