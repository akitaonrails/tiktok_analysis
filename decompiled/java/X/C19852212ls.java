package X;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: X.12ls, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19852212ls<T> extends AbstractC19852312lt<T> {
    public static final C19852212ls<Object> LL = new C19852212ls<>();
    public static final long serialVersionUID = 0;

    @Override // X.AbstractC19852312lt
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // X.AbstractC19852312lt
    public final int hashCode() {
        return 2040732332;
    }

    @Override // X.AbstractC19852312lt
    public final boolean isPresent() {
        return false;
    }

    @Override // X.AbstractC19852312lt
    public final T orNull() {
        return null;
    }

    @Override // X.AbstractC19852312lt
    public final String toString() {
        return "Optional.absent()";
    }

    @Override // X.AbstractC19852312lt
    public final T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // X.AbstractC19852312lt
    public final Set<T> asSet() {
        return Collections.emptySet();
    }

    private Object readResolve() {
        return LL;
    }

    @Override // X.AbstractC19852312lt
    public final T or(InterfaceC1456340o08<? extends T> interfaceC1456340o08) {
        T t = interfaceC1456340o08.get();
        C19864312np.LJI(t, "use Optional.orNull() instead of a Supplier that returns null");
        return t;
    }

    @Override // X.AbstractC19852312lt
    public final <V> AbstractC19852312lt<V> transform(InterfaceC19882712qn<? super T, V> interfaceC19882712qn) {
        interfaceC19882712qn.getClass();
        return AbstractC19852312lt.absent();
    }

    @Override // X.AbstractC19852312lt
    public final T or(T t) {
        C19864312np.LJI(t, "use Optional.orNull() instead of Optional.or(null)");
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC19852312lt
    public final AbstractC19852312lt<T> or(AbstractC19852312lt<? extends T> abstractC19852312lt) {
        abstractC19852312lt.getClass();
        return abstractC19852312lt;
    }
}
