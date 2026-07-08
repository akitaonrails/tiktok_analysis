package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00lc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC173800lc implements Runnable {
    public final /* synthetic */ Function0<Unit> LL;

    public RunnableC173800lc(Function0<Unit> function0) {
        this.LL = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("FeedSurveyMonitor@44e3.maybeRunBackground$runnable$1");
        try {
            try {
                this.LL.invoke();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedSurveyMonitor@44e3.maybeRunBackground$runnable$1");
    }
}
