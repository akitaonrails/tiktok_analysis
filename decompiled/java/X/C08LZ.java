package X;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: renamed from: X.08LZ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08LZ<R> implements Iterator<R>, C03W4 {
    public final Iterator<T> LL;
    public int LLILLJJLI;
    public final /* synthetic */ C2101208La<T, R> LLILLL;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LL.hasNext();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.util.Iterator
    public final R next() {
        Function2<Integer, T, R> function2 = this.LLILLL.LIZIZ;
        int i = this.LLILLJJLI;
        this.LLILLJJLI = i + 1;
        if (i >= 0) {
            return function2.invoke(Integer.valueOf(i), (T) this.LL.next());
        }
        C1697810uHb.LJIJI();
        throw null;
    }

    public C08LZ(C2101208La<T, R> c2101208La) {
        this.LLILLL = c2101208La;
        this.LL = c2101208La.LIZ.iterator();
    }
}
