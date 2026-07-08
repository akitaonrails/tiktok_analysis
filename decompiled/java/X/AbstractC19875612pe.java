package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: renamed from: X.12pe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19875612pe<E> extends AbstractC19876112pj<E> implements NavigableSet<E>, C0W39<E> {
    public transient AbstractC19875612pe<E> LLILLL;
    public final transient Comparator<? super E> comparator;

    public abstract C19875712pf LJIILJJIL();

    public abstract C19875712pf LJIJ(Object obj, boolean z);

    public abstract C19875712pf LJIJI(Object obj, boolean z, Object obj2, boolean z2);

    public abstract C19875712pf LJIL(Object obj, boolean z);

    @Override // java.util.NavigableSet
    public abstract AbstractC19853312m3<E> descendingIterator();

    @Override // X.AbstractC19875112pZ, X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract AbstractC19853312m3<E> iterator();

    public static <E extends Comparable<?>> C19875412pc<E> naturalOrder() {
        return new C19875412pc<>(C19876912pr.LL);
    }

    public static <E extends Comparable<?>> C19875412pc<E> reverseOrder() {
        return new C19875412pc<>(Collections.reverseOrder());
    }

    @Override // java.util.NavigableSet
    public AbstractC19875612pe<E> descendingSet() {
        AbstractC19875612pe<E> abstractC19875612pe = this.LLILLL;
        if (abstractC19875612pe != null) {
            return abstractC19875612pe;
        }
        C19875712pf c19875712pfLJIILJJIL = LJIILJJIL();
        this.LLILLL = c19875712pfLJIILJJIL;
        c19875712pfLJIILJJIL.LLILLL = this;
        return c19875712pfLJIILJJIL;
    }

    @Override // java.util.NavigableSet
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // X.AbstractC19875112pZ, X.AbstractC19875812pg
    public Object writeReplace() {
        final Comparator<? super E> comparator = this.comparator;
        final Object[] array = toArray();
        return new Serializable(comparator, array) { // from class: X.12pU
            public static final long serialVersionUID = 0;
            public final Comparator<? super E> LL;
            public final Object[] LLILLJJLI;

            public Object readResolve() {
                C19875412pc c19875412pc = new C19875412pc(this.LL);
                Object[] objArr = this.LLILLJJLI;
                if (c19875412pc.LIZLLL != null) {
                    for (Object obj : objArr) {
                        c19875412pc.LJI(obj);
                    }
                } else {
                    c19875412pc.LIZJ(objArr);
                }
                return c19875412pc.LJIIIZ();
            }

            {
                this.LL = comparator;
                this.LLILLJJLI = array;
            }
        };
    }

    @Override // java.util.SortedSet
    public E first() {
        return iterator().next();
    }

    @Override // X.AbstractC19875112pZ, X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.SortedSet
    public E last() {
        return descendingIterator().next();
    }

    public static <E> AbstractC19875612pe<E> of() {
        return C19875712pf.LLILZIL;
    }

    @Override // java.util.SortedSet, X.C0W39
    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    public AbstractC19875612pe(Comparator<? super E> comparator) {
        this.comparator = comparator;
    }

    public static <E> C19875712pf<E> LJIIZILJ(Comparator<? super E> comparator) {
        if (C19876912pr.LL.equals(comparator)) {
            return (C19875712pf<E>) C19875712pf.LLILZIL;
        }
        return new C19875712pf<>(AbstractC19875512pd.of(), comparator);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)LX/12pe<TE;>; */
    public static AbstractC19875612pe copyOf(Comparable[] comparableArr) {
        return LJIILIIL(C19876912pr.LL, comparableArr.length, (Object[]) comparableArr.clone());
    }

    public static <E> AbstractC19875612pe<E> copyOfSorted(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        if (comparator == null) {
            comparator = C19876912pr.LL;
        }
        AbstractC19875512pd abstractC19875512pdCopyOf = AbstractC19875512pd.copyOf((Collection) sortedSet);
        if (abstractC19875512pdCopyOf.isEmpty()) {
            return LJIIZILJ(comparator);
        }
        return new C19875712pf(abstractC19875512pdCopyOf, comparator);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)LX/12pe<TE;>; */
    public static AbstractC19875612pe of(Comparable comparable) {
        return new C19875712pf(AbstractC19875512pd.of(comparable), C19876912pr.LL);
    }

    public static <E> C19875412pc<E> orderedBy(Comparator<E> comparator) {
        return new C19875412pc<>(comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.NavigableSet
    public E ceiling(E e) {
        Iterator it2 = tailSet((Object) e, true).iterator();
        if (it2.hasNext()) {
            return (E) it2.next();
        }
        return null;
    }

    @Override // java.util.NavigableSet
    public E floor(E e) {
        AbstractC19853312m3<E> abstractC19853312m3DescendingIterator = headSet((Object) e, true).descendingIterator();
        if (abstractC19853312m3DescendingIterator.hasNext()) {
            return abstractC19853312m3DescendingIterator.next();
        }
        return null;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public AbstractC19875612pe<E> headSet(E e) {
        return headSet((Object) e, false);
    }

    @Override // java.util.NavigableSet
    public E higher(E e) {
        Iterator it2 = tailSet((Object) e, false).iterator();
        if (it2.hasNext()) {
            return (E) it2.next();
        }
        return null;
    }

    @Override // java.util.NavigableSet
    public E lower(E e) {
        AbstractC19853312m3<E> abstractC19853312m3DescendingIterator = headSet((Object) e, false).descendingIterator();
        if (abstractC19853312m3DescendingIterator.hasNext()) {
            return abstractC19853312m3DescendingIterator.next();
        }
        return null;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public AbstractC19875612pe<E> tailSet(E e) {
        return tailSet((Object) e, true);
    }

    public static <E> AbstractC19875612pe<E> copyOf(Iterable<? extends E> iterable) {
        return copyOf(C19876912pr.LL, iterable);
    }

    public static <E> AbstractC19875612pe<E> copyOf(Collection<? extends E> collection) {
        return copyOf((Comparator) C19876912pr.LL, (Collection) collection);
    }

    public static <E> AbstractC19875612pe<E> copyOf(Iterator<? extends E> it2) {
        return copyOf(C19876912pr.LL, it2);
    }

    public static <E> AbstractC19875612pe<E> copyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Collection arrayList;
        comparator.getClass();
        if (C19876512pn.LIZ(comparator, iterable) && (iterable instanceof AbstractC19875612pe)) {
            AbstractC19875612pe<E> abstractC19875612pe = (AbstractC19875612pe) iterable;
            if (!abstractC19875612pe.LJIIIZ()) {
                return abstractC19875612pe;
            }
        }
        if (iterable instanceof Collection) {
            arrayList = (Collection) iterable;
        } else {
            Iterator<? extends E> it2 = iterable.iterator();
            arrayList = new ArrayList();
            C19867212oI.LIZ(arrayList, it2);
        }
        Object[] array = arrayList.toArray();
        return LJIILIIL(comparator, array.length, array);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)LX/12pe<TE;>; */
    public static AbstractC19875612pe of(Comparable comparable, Comparable comparable2) {
        return LJIILIIL(C19876912pr.LL, 2, comparable, comparable2);
    }

    @Override // java.util.NavigableSet
    public AbstractC19875612pe<E> headSet(E e, boolean z) {
        e.getClass();
        return LJIJ(e, z);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public AbstractC19875612pe<E> subSet(E e, E e2) {
        return subSet((Object) e, true, (Object) e2, false);
    }

    @Override // java.util.NavigableSet
    public AbstractC19875612pe<E> tailSet(E e, boolean z) {
        e.getClass();
        return LJIL(e, z);
    }

    public static <E> AbstractC19875612pe<E> copyOf(Comparator<? super E> comparator, Iterator<? extends E> it2) {
        C19875412pc c19875412pc = new C19875412pc(comparator);
        c19875412pc.LJIIJ(it2);
        return c19875412pc.LJIIIZ();
    }

    public static <E> AbstractC19875612pe<E> copyOf(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return copyOf((Comparator) comparator, (Iterable) collection);
    }

    public static C19875712pf LJIILIIL(Comparator comparator, int i, Object... objArr) {
        if (i == 0) {
            return LJIIZILJ(comparator);
        }
        C1702230uOj.LIZ(i, objArr);
        Arrays.sort(objArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (comparator.compare(obj, objArr[i2 - 1]) != 0) {
                objArr[i2] = obj;
                i2++;
            }
        }
        Arrays.fill(objArr, i2, i, (Object) null);
        if (i2 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i2);
        }
        return new C19875712pf(AbstractC19875512pd.LJIIJ(i2, objArr), comparator);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)LX/12pe<TE;>; */
    public static AbstractC19875612pe of(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return LJIILIIL(C19876912pr.LL, 3, comparable, comparable2, comparable3);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)LX/12pe<TE;>; */
    public static AbstractC19875612pe of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4) {
        return LJIILIIL(C19876912pr.LL, 4, comparable, comparable2, comparable3, comparable4);
    }

    @Override // java.util.NavigableSet
    public AbstractC19875612pe<E> subSet(E e, boolean z, E e2, boolean z2) {
        boolean z3;
        e.getClass();
        e2.getClass();
        if (this.comparator.compare(e, e2) <= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C19864312np.LJ(z3);
        return LJIJI(e, z, e2, z2);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)LX/12pe<TE;>; */
    public static AbstractC19875612pe of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5) {
        return LJIILIIL(C19876912pr.LL, 5, comparable, comparable2, comparable3, comparable4, comparable5);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)LX/12pe<TE;>; */
    public static AbstractC19875612pe of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5, Comparable comparable6, Comparable... comparableArr) {
        int length = comparableArr.length + 6;
        Comparable[] comparableArr2 = new Comparable[length];
        comparableArr2[0] = comparable;
        comparableArr2[1] = comparable2;
        comparableArr2[2] = comparable3;
        comparableArr2[3] = comparable4;
        comparableArr2[4] = comparable5;
        comparableArr2[5] = comparable6;
        System.arraycopy(comparableArr, 0, comparableArr2, 6, comparableArr.length);
        return LJIILIIL(C19876912pr.LL, length, comparableArr2);
    }
}
