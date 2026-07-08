package X;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: X.0WTK, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WTK<V> extends FutureTask<V> implements Comparable<Object> {
    public final Comparable<?> LL;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        if (obj instanceof C0WTK) {
            obj = ((C0WTK) obj).LL;
        }
        Comparable<?> comparable = this.LL;
        if (comparable != null && obj != null) {
            return comparable.compareTo(obj);
        }
        return 0;
    }

    public C0WTK(Callable<V> callable, Comparable<?> comparable) {
        super(callable);
        this.LL = comparable;
    }

    public C0WTK(Runnable runnable, V v, Comparable<?> comparable) {
        super(runnable, v);
        this.LL = comparable;
    }
}
