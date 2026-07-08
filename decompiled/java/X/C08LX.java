package X;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: renamed from: X.08LX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08LX<R> implements Iterator<R>, C03W4 {
    public final Iterator<T> LL;
    public final /* synthetic */ C08LY<T, R> LLILLJJLI;

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
        return this.LLILLJJLI.LIZIZ.invoke((T) this.LL.next());
    }

    public C08LX(C08LY<T, R> c08ly) {
        this.LLILLJJLI = c08ly;
        this.LL = c08ly.LIZ.iterator();
    }
}
