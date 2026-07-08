package X;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.11NY, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11NY<T> extends AtomicLong implements InterfaceC19495511Pd<T> {
    public static final long serialVersionUID = -6671519529404341862L;

    @Override // X.C11LR
    public abstract /* synthetic */ void cancel();

    @Override // X.InterfaceC19494911Ox
    public abstract /* synthetic */ void clear();

    @Override // X.InterfaceC19494911Ox
    public abstract /* synthetic */ boolean isEmpty();

    @Override // X.InterfaceC19494911Ox
    public abstract /* synthetic */ T poll();

    @Override // X.C11LR
    public abstract /* synthetic */ void request(long j);

    @Override // X.InterfaceC19495111Oz
    public abstract /* synthetic */ int requestFusion(int i);

    @Override // X.InterfaceC19494911Ox
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
