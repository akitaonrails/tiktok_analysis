package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: X.12nS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19862012nS extends AbstractC19862112nT {
    public static final C19862012nS LLILZLL;
    public final transient AbstractC19861312nL LLILZIL;

    @Override // X.AbstractC19860912nH
    public final AbstractC19861312nL zzi() {
        return this.LLILZIL;
    }

    static {
        C19863012nc c19863012nc = AbstractC19861312nL.LLILLJJLI;
        LLILZLL = new C19862012nS(C19861712nP.LLILZIL, C19863212ne.LL);
    }

    @Override // X.AbstractC19861612nO
    public final int LJ() {
        return this.LLILZIL.LJ();
    }

    @Override // X.AbstractC19861612nO
    public final int LJFF() {
        return this.LLILZIL.LJFF();
    }

    @Override // X.AbstractC19861612nO
    public final Object[] LJIIIIZZ() {
        return this.LLILZIL.LJIIIIZZ();
    }

    @Override // X.AbstractC19862112nT
    public final C19862012nS LJIILIIL() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.LLILLL);
        return isEmpty() ? AbstractC19862112nT.LJIJI(comparatorReverseOrder) : new C19862012nS(this.LLILZIL.zzf(), comparatorReverseOrder);
    }

    @Override // X.AbstractC19862112nT, X.AbstractC19860912nH, X.AbstractC19861612nO, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.LLILZIL.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LLILZIL.size();
    }

    @Override // X.AbstractC19862112nT, X.AbstractC19860912nH, X.AbstractC19861612nO
    /* JADX INFO: renamed from: zzd */
    public final AbstractC19851112lh iterator() {
        return this.LLILZIL.listIterator(0);
    }

    @Override // X.AbstractC19862112nT
    /* JADX INFO: renamed from: zzr */
    public final AbstractC19851112lh descendingIterator() {
        return this.LLILZIL.zzf().listIterator(0);
    }

    @Override // X.AbstractC19862112nT, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ Iterator descendingIterator() {
        return descendingIterator();
    }

    @Override // X.AbstractC19862112nT, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.LLILZIL.get(0);
    }

    @Override // X.AbstractC19862112nT, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.LLILZIL.get(r1.size() - 1);
    }

    @Override // X.AbstractC19861612nO
    public final int LIZJ(Object[] objArr) {
        return this.LLILZIL.LIZJ(objArr);
    }

    @Override // X.AbstractC19862112nT, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iLJJ = LJJ(obj, true);
        if (iLJJ == this.LLILZIL.size()) {
            return null;
        }
        return this.LLILZIL.get(iLJJ);
    }

    @Override // X.AbstractC19861612nO, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.LLILZIL, obj, this.LLILLL) >= 0) {
                    return true;
                }
            } catch (ClassCastException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC19863412ng) {
            collection = ((InterfaceC19863412ng) collection).zza();
        }
        if (C19862812na.LIZ(this.LLILLL, collection) && collection.size() > 1) {
            AbstractC19861212nK abstractC19861212nKListIterator = this.LLILZIL.listIterator(0);
            Iterator it2 = collection.iterator();
            AbstractC19862212nU abstractC19862212nU = (AbstractC19862212nU) abstractC19861212nKListIterator;
            if (!abstractC19862212nU.hasNext()) {
                return false;
            }
            Object next = it2.next();
            Object next2 = abstractC19862212nU.next();
            while (true) {
                try {
                    int iCompare = this.LLILLL.compare(next2, next);
                    if (iCompare < 0) {
                        if (!abstractC19862212nU.hasNext()) {
                            return false;
                        }
                        next2 = abstractC19862212nU.next();
                    } else {
                        if (iCompare != 0) {
                            return false;
                        }
                        if (!it2.hasNext()) {
                            return true;
                        }
                        next = it2.next();
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

    @Override // X.AbstractC19860912nH, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.LLILZIL.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (C19862812na.LIZ(this.LLILLL, set)) {
            Iterator it2 = set.iterator();
            try {
                AbstractC19861212nK abstractC19861212nKListIterator = this.LLILZIL.listIterator(0);
                do {
                    AbstractC19862212nU abstractC19862212nU = (AbstractC19862212nU) abstractC19861212nKListIterator;
                    if (!abstractC19862212nU.hasNext()) {
                        return true;
                    }
                    next = abstractC19862212nU.next();
                    next2 = it2.next();
                    if (next2 == null) {
                        break;
                    }
                } while (this.LLILLL.compare(next, next2) == 0);
                return false;
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

    @Override // X.AbstractC19862112nT, java.util.NavigableSet
    public final Object floor(Object obj) {
        int iLJIL = LJIL(obj, true) - 1;
        if (iLJIL == -1) {
            return null;
        }
        return this.LLILZIL.get(iLJIL);
    }

    @Override // X.AbstractC19862112nT, java.util.NavigableSet
    public final Object higher(Object obj) {
        int iLJJ = LJJ(obj, false);
        if (iLJJ == this.LLILZIL.size()) {
            return null;
        }
        return this.LLILZIL.get(iLJJ);
    }

    @Override // X.AbstractC19862112nT, java.util.NavigableSet
    public final Object lower(Object obj) {
        int iLJIL = LJIL(obj, false) - 1;
        if (iLJIL == -1) {
            return null;
        }
        return this.LLILZIL.get(iLJIL);
    }

    public C19862012nS(AbstractC19861312nL abstractC19861312nL, Comparator comparator) {
        super(comparator);
        this.LLILZIL = abstractC19861312nL;
    }

    @Override // X.AbstractC19862112nT
    public final C19862012nS LJIILJJIL(Object obj, boolean z) {
        return LJJI(0, LJIL(obj, z));
    }

    @Override // X.AbstractC19862112nT
    public final C19862012nS LJIJ(Object obj, boolean z) {
        return LJJI(LJJ(obj, z), this.LLILZIL.size());
    }

    public final int LJIL(Object obj, boolean z) {
        AbstractC19861312nL abstractC19861312nL = this.LLILZIL;
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(abstractC19861312nL, obj, this.LLILLL);
        if (iBinarySearch >= 0) {
            if (z) {
                return iBinarySearch + 1;
            }
            return iBinarySearch;
        }
        return ~iBinarySearch;
    }

    public final int LJJ(Object obj, boolean z) {
        AbstractC19861312nL abstractC19861312nL = this.LLILZIL;
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(abstractC19861312nL, obj, this.LLILLL);
        if (iBinarySearch >= 0) {
            if (z) {
                return iBinarySearch;
            }
            return iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    public final C19862012nS LJJI(int i, int i2) {
        if (i == 0) {
            if (i2 != this.LLILZIL.size()) {
                i = 0;
            } else {
                return this;
            }
        }
        if (i < i2) {
            return new C19862012nS(this.LLILZIL.subList(i, i2), this.LLILLL);
        }
        return AbstractC19862112nT.LJIJI(this.LLILLL);
    }

    @Override // X.AbstractC19862112nT
    public final C19862012nS LJIIZILJ(Object obj, boolean z, Object obj2, boolean z2) {
        C19862012nS c19862012nSLJIJ = LJIJ(obj, z);
        return c19862012nSLJIJ.LJJI(0, c19862012nSLJIJ.LJIL(obj2, z2));
    }
}
