package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.0uHa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1697800uHa<T> implements ListIterator<T>, C03W4 {
    public final List<T> LL;
    public int LLILLJJLI;

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.LLILLJJLI < this.LL.size() - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.LLILLJJLI >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        List<T> list = this.LL;
        int i = this.LLILLJJLI + 1;
        this.LLILLJJLI = i;
        return (T) ListProtector.get(list, i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.LLILLJJLI + 1;
    }

    @Override // java.util.ListIterator
    public final T previous() {
        List<T> list = this.LL;
        int i = this.LLILLJJLI;
        this.LLILLJJLI = i - 1;
        return (T) ListProtector.get(list, i);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        ListProtector.remove(this.LL, this.LLILLJJLI);
        this.LLILLJJLI--;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.LLILLJJLI;
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        List<T> list = this.LL;
        int i = this.LLILLJJLI + 1;
        this.LLILLJJLI = i;
        ListProtector.add(list, i, t);
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        ListProtector.set(this.LL, this.LLILLJJLI, t);
    }

    public C1697800uHa(List<T> list, int i) {
        this.LL = list;
        this.LLILLJJLI = i - 1;
    }
}
