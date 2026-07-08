package X;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.12qf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19881912qf<F, T> extends AbstractSequentialList<T> implements Serializable {
    public static final long serialVersionUID = 0;
    public final List<F> LL;
    public final InterfaceC19882712qn<? super F, ? extends T> LLILLJJLI;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.LL.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LL.size();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i) {
        final ListIterator<F> listIterator = this.LL.listIterator(i);
        return new AbstractC19882512ql<F, T>(listIterator) { // from class: X.12qj
            @Override // X.AbstractC19882412qk
            public final T LIZ(F f) {
                return this.LLILLJJLI.LLILLJJLI.apply(f);
            }
        };
    }

    public C19881912qf(List<F> list, InterfaceC19882712qn<? super F, ? extends T> interfaceC19882712qn) {
        list.getClass();
        this.LL = list;
        this.LLILLJJLI = interfaceC19882712qn;
    }
}
