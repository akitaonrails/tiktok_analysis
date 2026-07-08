package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.12qg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19882012qg<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
    public static final long serialVersionUID = 0;
    public final List<F> LL;
    public final InterfaceC19882712qn<? super F, ? extends T> LLILLJJLI;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.LL.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.LL.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LL.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return this.LLILLJJLI.apply((Object) ListProtector.get(this.LL, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i) {
        final ListIterator<F> listIterator = this.LL.listIterator(i);
        return new AbstractC19882512ql<F, T>(listIterator) { // from class: X.12qi
            @Override // X.AbstractC19882412qk
            public final T LIZ(F f) {
                return this.LLILLJJLI.LLILLJJLI.apply(f);
            }
        };
    }

    @Override // java.util.AbstractList, java.util.List
    public final T remove(int i) {
        return this.LLILLJJLI.apply((Object) ListProtector.remove(this.LL, i));
    }

    public C19882012qg(List<F> list, InterfaceC19882712qn<? super F, ? extends T> interfaceC19882712qn) {
        list.getClass();
        this.LL = list;
        this.LLILLJJLI = interfaceC19882712qn;
    }
}
