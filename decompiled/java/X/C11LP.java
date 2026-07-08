package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11LP, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11LP<T> extends AtomicReference<T> implements InterfaceC420801kM {
    public static final long serialVersionUID = 6537757548749041217L;

    public abstract void LIZ(T t);

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        LIZ(andSet);
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return get() == null;
    }

    public C11LP(T t) {
        super(t);
    }
}
