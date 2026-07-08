package X;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.11NT, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11NT<T> extends AtomicInteger implements InterfaceC19495511Pd<T> {
    public static final long serialVersionUID = -6671519529404341862L;

    public abstract /* synthetic */ void cancel();

    public abstract /* synthetic */ void clear();

    public abstract /* synthetic */ boolean isEmpty();

    public abstract /* synthetic */ T poll();

    public abstract /* synthetic */ void request(long j);

    public abstract /* synthetic */ int requestFusion(int i);

    @Override // X.InterfaceC19494911Ox
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
