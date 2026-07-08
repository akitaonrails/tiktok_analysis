package X;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* JADX INFO: renamed from: X.1BoM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class ConditionC2216081BoM implements Condition {
    public final Condition LL;
    public boolean LLILLJJLI;

    @Override // java.util.concurrent.locks.Condition
    public final void await() throws InterruptedException {
        this.LL.await();
    }

    @Override // java.util.concurrent.locks.Condition
    public final boolean await(long j, TimeUnit timeUnit) {
        return this.LL.await(j, timeUnit);
    }

    @Override // java.util.concurrent.locks.Condition
    public final long awaitNanos(long j) {
        return this.LL.awaitNanos(j);
    }

    @Override // java.util.concurrent.locks.Condition
    public final void awaitUninterruptibly() {
        this.LL.awaitUninterruptibly();
    }

    @Override // java.util.concurrent.locks.Condition
    public final boolean awaitUntil(Date date) {
        return this.LL.awaitUntil(date);
    }

    @Override // java.util.concurrent.locks.Condition
    public final void signal() {
        this.LL.signal();
    }

    @Override // java.util.concurrent.locks.Condition
    public final void signalAll() {
        this.LL.signalAll();
        this.LLILLJJLI = true;
    }

    public ConditionC2216081BoM(Condition condition) {
        this.LL = condition;
    }
}
