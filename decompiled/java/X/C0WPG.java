package X;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0WPG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WPG<V> extends C0WPH<V> implements ScheduledFuture {
    public final ScheduledFuture<?> LLILLJJLI;

    @Override // X.C0WPJ, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = super.cancel(z);
        if (zCancel) {
            this.LLILLJJLI.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.LLILLJJLI.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.LLILLJJLI.getDelay(timeUnit);
    }

    public C0WPG(AbstractC199488133m abstractC199488133m, ScheduledFuture scheduledFuture) {
        super(abstractC199488133m);
        this.LLILLJJLI = scheduledFuture;
    }
}
