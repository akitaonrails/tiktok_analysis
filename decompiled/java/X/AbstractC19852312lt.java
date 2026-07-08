package X;

import java.io.Serializable;
import java.util.Set;

/* JADX INFO: renamed from: X.12lt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19852312lt<T> implements Serializable {
    public static final long serialVersionUID = 0;

    public abstract Set<T> asSet();

    public abstract boolean equals(Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract AbstractC19852312lt<T> or(AbstractC19852312lt<? extends T> abstractC19852312lt);

    public abstract T or(InterfaceC1456340o08<? extends T> interfaceC1456340o08);

    public abstract T or(T t);

    public abstract T orNull();

    public abstract String toString();

    public abstract <V> AbstractC19852312lt<V> transform(InterfaceC19882712qn<? super T, V> interfaceC19882712qn);

    public static <T> AbstractC19852312lt<T> absent() {
        return C19852212ls.LL;
    }

    public static <T> AbstractC19852312lt<T> fromNullable(T t) {
        if (t == null) {
            return absent();
        }
        return new C19852112lr(t);
    }

    public static <T> AbstractC19852312lt<T> of(T t) {
        t.getClass();
        return new C19852112lr(t);
    }

    public static <T> Iterable<T> presentInstances(Iterable<? extends AbstractC19852312lt<? extends T>> iterable) {
        iterable.getClass();
        return new C19852412lu(iterable);
    }
}
