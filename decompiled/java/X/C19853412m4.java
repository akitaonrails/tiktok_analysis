package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.12m4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19853412m4<E> extends AbstractC19875112pZ<E> {
    public final transient E LLILLL;

    @Override // X.AbstractC19875812pg
    public final boolean LJIIIZ() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // X.AbstractC19875112pZ, X.AbstractC19875812pg
    public final AbstractC19875512pd<E> asList() {
        return AbstractC19875512pd.of((Object) this.LLILLL);
    }

    @Override // X.AbstractC19875112pZ, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.LLILLL.hashCode();
    }

    @Override // X.AbstractC19875112pZ, X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC19853312m3<E> iterator() {
        final E e = this.LLILLL;
        return (AbstractC19853312m3<E>) new AbstractC19853312m3<Object>() { // from class: X.12m2
            public boolean LL;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return !this.LL;
            }

            @Override // java.util.Iterator
            public final Object next() {
                if (this.LL) {
                    throw new NoSuchElementException();
                }
                this.LL = true;
                return e;
            }
        };
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.LLILLL.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append('[');
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }

    @Override // X.AbstractC19875112pZ, X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public C19853412m4(E e) {
        e.getClass();
        this.LLILLL = e;
    }

    @Override // X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.LLILLL.equals(obj);
    }

    @Override // X.AbstractC19875812pg
    public final int LIZJ(int i, Object[] objArr) {
        objArr[i] = this.LLILLL;
        return i + 1;
    }
}
