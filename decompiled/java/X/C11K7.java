package X;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.11K7, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11K7<T> extends AtomicInteger implements InterfaceC19495611Pe<T> {
    public static final long serialVersionUID = -1001730202384742097L;

    public abstract /* synthetic */ void clear();

    public abstract /* synthetic */ void dispose();

    public abstract /* synthetic */ boolean isDisposed();

    public abstract /* synthetic */ boolean isEmpty();

    public abstract /* synthetic */ T poll();

    public abstract /* synthetic */ int requestFusion(int i);

    @Override // X.InterfaceC19494911Ox
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called");
    }

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
