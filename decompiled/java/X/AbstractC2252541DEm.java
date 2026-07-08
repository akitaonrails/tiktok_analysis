package X;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: X.1DEm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2252541DEm extends AbstractC2252601DEs {
    public abstract Thread getThread();

    public final void unpark() {
        Thread thread = getThread();
        if (C786410Ut5.u3() != thread) {
            LockSupport.unpark(thread);
        }
    }

    public void reschedule(long j, AbstractRunnableC2252511DEj abstractRunnableC2252511DEj) {
        RunnableC2252521DEk.LL.schedule(j, abstractRunnableC2252511DEj);
    }
}
