package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.12m5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19853512m5<T> extends AbstractC19853312m3<T> {
    public T LL;

    public abstract InterfaceC199564136k LIZ(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LL != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t = this.LL;
        if (t == null) {
            throw new NoSuchElementException();
        }
        this.LL = (T) LIZ(t);
        return t;
    }

    public AbstractC19853512m5(T t) {
        this.LL = t;
    }
}
