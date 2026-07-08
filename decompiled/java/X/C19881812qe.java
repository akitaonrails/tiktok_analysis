package X;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: X.12qe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19881812qe<F, T> extends AbstractCollection<T> {
    public final Collection<F> LL;
    public final InterfaceC19882712qn<? super F, ? extends T> LLILLJJLI;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.LL.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.LL.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        Iterator<F> it2 = this.LL.iterator();
        InterfaceC19882712qn<? super F, ? extends T> interfaceC19882712qn = this.LLILLJJLI;
        interfaceC19882712qn.getClass();
        return new C19874912pX(it2, interfaceC19882712qn);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.LL.size();
    }

    public C19881812qe(Collection<F> collection, InterfaceC19882712qn<? super F, ? extends T> interfaceC19882712qn) {
        this.LL = collection;
        this.LLILLJJLI = interfaceC19882712qn;
    }
}
