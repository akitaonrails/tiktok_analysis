package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.0k3s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1304900k3s<T> implements Iterator<T> {
    public T LL;

    public abstract InterfaceC199613138h LIZ(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LL != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        try {
            T t = this.LL;
            this.LL = (T) LIZ(t);
            return t;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LL = (T) LIZ(this.LL);
            throw th;
        }
    }

    public AbstractC1304900k3s(T t) {
        this.LL = t;
    }
}
