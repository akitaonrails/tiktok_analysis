package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.089E, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C089E<T> implements Iterator<T>, C03W4 {
    public final T[] LL;
    public int LLILLJJLI;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LLILLJJLI < this.LL.length;
    }

    @Override // java.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.LL;
            int i = this.LLILLJJLI;
            this.LLILLJJLI = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public C089E(T[] tArr) {
        this.LL = tArr;
    }
}
