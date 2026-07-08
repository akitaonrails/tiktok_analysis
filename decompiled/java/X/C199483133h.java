package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: X.133h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199483133h implements InterfaceFutureC1488980oqm {
    public static final C199476133a LLILLJJLI = new C199476133a(C199483133h.class);
    public final Object LL;

    public C199483133h(Object obj) {
        this.LL = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.LL;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Object obj = this.LL;
        String string = super.toString();
        String string2 = obj.toString();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(string);
        sbLIZ.append("[status=SUCCESS, result=[");
        sbLIZ.append(string2);
        sbLIZ.append("]]");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceFutureC1488980oqm
    public final void LJFF(Runnable runnable, Executor executor) {
        C19863812nk.LIZJ(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Logger loggerLIZ = LLILLJJLI.LIZ();
            Level level = Level.SEVERE;
            String string = runnable.toString();
            String strValueOf = String.valueOf(executor);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RuntimeException while executing runnable ");
            sbLIZ.append(string);
            sbLIZ.append(" with executor ");
            sbLIZ.append(strValueOf);
            loggerLIZ.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", C2188811AlT.LIZIZ(sbLIZ), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.LL;
    }
}
