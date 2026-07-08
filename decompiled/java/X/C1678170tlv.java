package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.0tlv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1678170tlv<T> implements ListIterator<T>, C03W4 {
    public final List<T> LL;
    public int LLILLJJLI;

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.LLILLJJLI < this.LL.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.LLILLJJLI > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        List<T> list = this.LL;
        int i = this.LLILLJJLI;
        this.LLILLJJLI = i + 1;
        return (T) ListProtector.get(list, i);
    }

    @Override // java.util.ListIterator
    public final T previous() {
        int i = this.LLILLJJLI - 1;
        this.LLILLJJLI = i;
        return (T) ListProtector.get(this.LL, i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.LLILLJJLI - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.LLILLJJLI - 1;
        this.LLILLJJLI = i;
        ListProtector.remove(this.LL, i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.LLILLJJLI;
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        ListProtector.add(this.LL, this.LLILLJJLI, t);
        this.LLILLJJLI++;
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        ListProtector.set(this.LL, this.LLILLJJLI, t);
    }

    public C1678170tlv(List<T> list, int i) {
        this.LL = list;
        this.LLILLJJLI = i;
    }
}
