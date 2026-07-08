package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: X.12pf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19875712pf<E> extends AbstractC19875612pe<E> {
    public static final C19875712pf<Comparable> LLILZIL = new C19875712pf<>(AbstractC19875512pd.of(), C19876912pr.LL);
    public final transient AbstractC19875512pd<E> LLILZ;

    @Override // X.AbstractC19875812pg
    public final Object[] LJ() {
        return this.LLILZ.LJ();
    }

    @Override // X.AbstractC19875812pg
    public final int LJFF() {
        return this.LLILZ.LJFF();
    }

    @Override // X.AbstractC19875812pg
    public final int LJIIIIZZ() {
        return this.LLILZ.LJIIIIZZ();
    }

    @Override // X.AbstractC19875812pg
    public final boolean LJIIIZ() {
        return this.LLILZ.LJIIIZ();
    }

    @Override // X.AbstractC19875612pe
    public final C19875712pf LJIILJJIL() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.comparator);
        return isEmpty() ? AbstractC19875612pe.LJIIZILJ(comparatorReverseOrder) : new C19875712pf(this.LLILZ.reverse(), comparatorReverseOrder);
    }

    @Override // X.AbstractC19875612pe, java.util.NavigableSet
    public final AbstractC19853312m3<E> descendingIterator() {
        return this.LLILZ.reverse().iterator();
    }

    @Override // X.AbstractC19875612pe, X.AbstractC19875112pZ, X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC19853312m3<E> iterator() {
        return this.LLILZ.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LLILZ.size();
    }

    @Override // X.AbstractC19875612pe, java.util.SortedSet
    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.LLILZ.get(0);
    }

    @Override // X.AbstractC19875612pe, java.util.SortedSet
    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.LLILZ.get(size() - 1);
    }

    @Override // X.AbstractC19875112pZ, X.AbstractC19875812pg
    public final AbstractC19875512pd<E> asList() {
        return this.LLILZ;
    }

    @Override // X.AbstractC19875612pe, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ Iterator descendingIterator() {
        return descendingIterator();
    }

    @Override // X.AbstractC19875612pe, X.AbstractC19875112pZ, X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // X.AbstractC19875612pe, java.util.NavigableSet
    public final E ceiling(E e) {
        int iLJJIFFI = LJJIFFI(e, true);
        if (iLJJIFFI == size()) {
            return null;
        }
        return this.LLILZ.get(iLJJIFFI);
    }

    @Override // X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.LLILZ, obj, this.comparator) >= 0) {
                    return true;
                }
            } catch (ClassCastException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        if (collection instanceof InterfaceC19879212qE) {
            collection = ((InterfaceC19879212qE) collection).elementSet();
        }
        if (C19876512pn.LIZ(comparator(), collection) && collection.size() > 1) {
            AbstractC19853312m3<E> it2 = iterator();
            Iterator<?> it3 = collection.iterator();
            if (!it2.hasNext()) {
                return false;
            }
            Object next = it3.next();
            E next2 = it2.next();
            while (true) {
                try {
                    int iCompare = this.comparator.compare(next2, next);
                    if (iCompare < 0) {
                        if (!it2.hasNext()) {
                            return false;
                        }
                        next2 = it2.next();
                    } else {
                        if (iCompare != 0) {
                            return false;
                        }
                        if (!it3.hasNext()) {
                            return true;
                        }
                        next = it3.next();
                    }
                } catch (ClassCastException | NullPointerException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return false;
                }
            }
        } else {
            return super.containsAll(collection);
        }
    }

    @Override // X.AbstractC19875112pZ, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (C19876512pn.LIZ(this.comparator, set)) {
            Iterator<E> it2 = set.iterator();
            try {
                AbstractC19853312m3<E> it3 = iterator();
                while (it3.hasNext()) {
                    E next = it3.next();
                    E next2 = it2.next();
                    if (next2 == null || this.comparator.compare(next, next2) != 0) {
                        return false;
                    }
                }
                return true;
            } catch (ClassCastException e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            } catch (NoSuchElementException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return false;
            }
        }
        return containsAll(set);
    }

    @Override // X.AbstractC19875612pe, java.util.NavigableSet
    public final E floor(E e) {
        int iLJJI = LJJI(e, true) - 1;
        if (iLJJI == -1) {
            return null;
        }
        return this.LLILZ.get(iLJJI);
    }

    @Override // X.AbstractC19875612pe, java.util.NavigableSet
    public final E higher(E e) {
        int iLJJIFFI = LJJIFFI(e, false);
        if (iLJJIFFI == size()) {
            return null;
        }
        return this.LLILZ.get(iLJJIFFI);
    }

    @Override // X.AbstractC19875612pe, java.util.NavigableSet
    public final E lower(E e) {
        int iLJJI = LJJI(e, false) - 1;
        if (iLJJI == -1) {
            return null;
        }
        return this.LLILZ.get(iLJJI);
    }

    public C19875712pf(AbstractC19875512pd<E> abstractC19875512pd, Comparator<? super E> comparator) {
        super(comparator);
        this.LLILZ = abstractC19875512pd;
    }

    @Override // X.AbstractC19875812pg
    public final int LIZJ(int i, Object[] objArr) {
        return this.LLILZ.LIZJ(i, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC19875612pe
    public final C19875712pf LJIJ(Object obj, boolean z) {
        return LJJ(0, LJJI(obj, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC19875612pe
    public final C19875712pf LJIL(Object obj, boolean z) {
        return LJJ(LJJIFFI(obj, z), size());
    }

    public final C19875712pf<E> LJJ(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i < i2) {
            return new C19875712pf<>(this.LLILZ.subList(i, i2), this.comparator);
        }
        return AbstractC19875612pe.LJIIZILJ(this.comparator);
    }

    public final int LJJI(E e, boolean z) {
        AbstractC19875512pd<E> abstractC19875512pd = this.LLILZ;
        e.getClass();
        int iBinarySearch = Collections.binarySearch(abstractC19875512pd, e, comparator());
        if (iBinarySearch >= 0) {
            if (z) {
                return iBinarySearch + 1;
            }
            return iBinarySearch;
        }
        return ~iBinarySearch;
    }

    public final int LJJIFFI(E e, boolean z) {
        AbstractC19875512pd<E> abstractC19875512pd = this.LLILZ;
        e.getClass();
        int iBinarySearch = Collections.binarySearch(abstractC19875512pd, e, comparator());
        if (iBinarySearch >= 0) {
            if (!z) {
                return iBinarySearch + 1;
            }
            return iBinarySearch;
        }
        return ~iBinarySearch;
    }

    @Override // X.AbstractC19875612pe
    public final C19875712pf LJIJI(Object obj, boolean z, Object obj2, boolean z2) {
        C19875712pf c19875712pfLJIL = LJIL(obj, z);
        return c19875712pfLJIL.LJJ(0, c19875712pfLJIL.LJJI(obj2, z2));
    }
}
