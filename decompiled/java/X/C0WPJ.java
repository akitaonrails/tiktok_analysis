package X;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0WPJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0WPJ<V> extends C08J6 implements Future<V> {
    @Override // java.util.concurrent.Future
    public final V get() {
        return ((C0WPH) this).LL.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return ((C0WPH) this).LL.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return ((C0WPH) this).LL.isDone();
    }

    public boolean cancel(boolean z) {
        return ((C0WPH) this).LL.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        return ((C0WPH) this).LL.get(j, timeUnit);
    }
}
