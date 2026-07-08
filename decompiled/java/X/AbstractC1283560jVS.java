package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.0jVS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1283560jVS implements AutoCloseable {
    public final AbstractC1283580jVU LL;
    public final AtomicBoolean LLILLJJLI = new AtomicBoolean(false);
    public final AtomicLong LLILLL = new AtomicLong(1);

    public abstract void LIZ();

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.LLILLJJLI.compareAndSet(false, true) && this.LLILLL.decrementAndGet() == 0) {
            LIZ();
        }
    }

    public AbstractC1283560jVS(AbstractC1283580jVU abstractC1283580jVU) {
        this.LL = abstractC1283580jVU;
    }
}
