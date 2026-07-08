package X;

import com.ss.android.ugc.aweme.IAppWidgetService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0829, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0829 extends C09AY implements Function0<ScheduledFuture<?>> {
    public final /* synthetic */ C19EG LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0829(C19EG c19eg) {
        super(0);
        this.LL = c19eg;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ScheduledFuture<?> invoke() {
        C070O c070o = new C070O();
        if (!C070Q.LIZ()) {
            c070o.invoke();
        } else if (!C0CBW.LIZIZ()) {
            C1785006yu.LIZIZ();
        }
        ScheduledExecutorService scheduledExecutorServiceLJ = C823050WQl.LJ();
        final C19EG c19eg = this.LL;
        return scheduledExecutorServiceLJ.schedule(new Runnable(c19eg) { // from class: X.082A
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MainActivityHelperAssem@1bc9.notifyWidget$optimize$1$1");
                try {
                    ((IAppWidgetService) ServiceManager.get().getService(IAppWidgetService.class)).LJIIIIZZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MainActivityHelperAssem@1bc9.notifyWidget$optimize$1$1");
            }
        }, ((Number) C070L.LIZLLL.getValue()).longValue(), TimeUnit.MILLISECONDS);
    }
}
