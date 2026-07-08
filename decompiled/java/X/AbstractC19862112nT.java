package X;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: renamed from: X.12nT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19862112nT extends AbstractC19860812nG implements NavigableSet, InterfaceC19863512nh {
    public final transient Comparator LLILLL;
    public transient AbstractC19862112nT LLILZ;

    public abstract C19862012nS LJIILIIL();

    public abstract C19862012nS LJIILJJIL(Object obj, boolean z);

    public abstract C19862012nS LJIIZILJ(Object obj, boolean z, Object obj2, boolean z2);

    public abstract C19862012nS LJIJ(Object obj, boolean z);

    @Override // java.util.SortedSet, X.InterfaceC19863512nh
    public final Comparator comparator() {
        return this.LLILLL;
    }

    @Override // X.AbstractC19860912nH, X.AbstractC19861612nO
    /* JADX INFO: renamed from: zzd */
    public abstract AbstractC19851112lh iterator();

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC19851112lh descendingIterator();

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final AbstractC19862112nT descendingSet() {
        AbstractC19862112nT abstractC19862112nT = this.LLILZ;
        if (abstractC19862112nT != null) {
            return abstractC19862112nT;
        }
        C19862012nS c19862012nSLJIILIIL = LJIILIIL();
        this.LLILZ = c19862012nSLJIILIIL;
        c19862012nSLJIILIIL.LLILZ = this;
        return c19862012nSLJIILIIL;
    }

    public Object first() {
        return iterator().next();
    }

    @Override // X.AbstractC19860912nH, X.AbstractC19861612nO, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public Object last() {
        return descendingIterator().next();
    }

    public AbstractC19862112nT(Comparator comparator) {
        this.LLILLL = comparator;
    }

    public static C19862012nS LJIJI(Comparator comparator) {
        if (C19863212ne.LL.equals(comparator)) {
            return C19862012nS.LLILZLL;
        }
        C19863012nc c19863012nc = AbstractC19861312nL.LLILLJJLI;
        return new C19862012nS(C19861712nP.LLILZIL, comparator);
    }

    public Object ceiling(Object obj) {
        obj.getClass();
        AbstractC19862212nU abstractC19862212nU = (AbstractC19862212nU) LJIJ(obj, true).LLILZIL.listIterator(0);
        if (abstractC19862212nU.hasNext()) {
            return abstractC19862212nU.next();
        }
        return null;
    }

    public Object floor(Object obj) {
        obj.getClass();
        AbstractC19851112lh abstractC19851112lhDescendingIterator = LJIILJJIL(obj, true).descendingIterator();
        if (abstractC19851112lhDescendingIterator.hasNext()) {
            return abstractC19851112lhDescendingIterator.next();
        }
        return null;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        obj.getClass();
        return LJIILJJIL(obj, false);
    }

    public Object higher(Object obj) {
        obj.getClass();
        AbstractC19862212nU abstractC19862212nU = (AbstractC19862212nU) LJIJ(obj, false).LLILZIL.listIterator(0);
        if (abstractC19862212nU.hasNext()) {
            return abstractC19862212nU.next();
        }
        return null;
    }

    public Object lower(Object obj) {
        obj.getClass();
        AbstractC19851112lh abstractC19851112lhDescendingIterator = LJIILJJIL(obj, false).descendingIterator();
        if (abstractC19851112lhDescendingIterator.hasNext()) {
            return abstractC19851112lhDescendingIterator.next();
        }
        return null;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        obj.getClass();
        return LJIJ(obj, true);
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        return LJIILJJIL(obj, z);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        return LJIJ(obj, z);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final AbstractC19862112nT subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.LLILLL.compare(obj, obj2) <= 0) {
            return LJIIZILJ(obj, z, obj2, z2);
        }
        throw new IllegalArgumentException();
    }
}
