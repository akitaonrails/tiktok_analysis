package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.12nL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19861312nL extends AbstractC19861612nO implements List, RandomAccess {
    public static final C19863012nc LLILLJJLI = new C19863012nc(C19861712nP.LLILZIL, 0);
    public static final /* synthetic */ int zzd = 0;

    @Override // X.AbstractC19861612nO, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // X.AbstractC19861612nO
    /* JADX INFO: renamed from: zzd */
    public final AbstractC19851112lh iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    public AbstractC19861312nL zzf() {
        return size() <= 1 ? this : new AbstractC19861312nL(this) { // from class: X.12nM
            public final transient AbstractC19861312nL LLILLL;

            @Override // X.AbstractC19861312nL
            public final AbstractC19861312nL zzf() {
                return this.LLILLL;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.LLILLL.size();
            }

            {
                this.LLILLL = this;
            }

            @Override // X.AbstractC19861312nL, X.AbstractC19861612nO, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return this.LLILLL.contains(obj);
            }

            @Override // java.util.List
            public final Object get(int i) {
                C19862312nV.LIZ(i, this.LLILLL.size());
                return this.LLILLL.get((r1.size() - 1) - i);
            }

            @Override // X.AbstractC19861312nL, java.util.List
            public final int indexOf(Object obj) {
                int iLastIndexOf = this.LLILLL.lastIndexOf(obj);
                if (iLastIndexOf < 0) {
                    return -1;
                }
                return (this.LLILLL.size() - 1) - iLastIndexOf;
            }

            @Override // X.AbstractC19861312nL, java.util.List
            public final int lastIndexOf(Object obj) {
                int iIndexOf = this.LLILLL.indexOf(obj);
                if (iIndexOf < 0) {
                    return -1;
                }
                return (this.LLILLL.size() - 1) - iIndexOf;
            }

            @Override // X.AbstractC19861312nL, java.util.List
            public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
                return subList(i, i2);
            }

            @Override // X.AbstractC19861312nL
            /* JADX INFO: renamed from: zzg */
            public final AbstractC19861312nL subList(int i, int i2) {
                C19862312nV.LIZIZ(i, i2, this.LLILLL.size());
                AbstractC19861312nL abstractC19861312nL = this.LLILLL;
                return abstractC19861312nL.subList(abstractC19861312nL.size() - i2, this.LLILLL.size() - i).zzf();
            }
        };
    }

    public static AbstractC19861312nL zzi(Object[] objArr) {
        if (objArr.length == 0) {
            return C19861712nP.LLILZIL;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        for (int i = 0; i < length; i++) {
            if (objArr2[i] == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("at index ");
                sbLIZ.append(i);
                throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return LJIIIZ(length, objArr2);
    }

    public static AbstractC19861312nL zzj(Object obj) {
        Object[] objArr = {obj};
        if (objArr[0] != null) {
            return LJIIIZ(1, objArr);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("at index ");
        sbLIZ.append(0);
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC19861612nO
    public int LIZJ(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    @Override // X.AbstractC19861612nO, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (C19845412km.LIZ(ListProtector.get(this, i), ListProtector.get(list, i))) {
                        }
                    }
                    return true;
                }
                Iterator it2 = iterator();
                Iterator it3 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it3.hasNext() || !C19845412km.LIZ(it2.next(), it3.next())) {
                            break;
                        }
                    } else if (!it3.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(ListProtector.get(this, i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(ListProtector.get(this, size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final AbstractC19861212nK listIterator(int i) {
        int size = size();
        if (i >= 0 && i <= size) {
            if (isEmpty()) {
                return LLILLJJLI;
            }
            return new C19863012nc(this, i);
        }
        throw new IndexOutOfBoundsException(C19862312nV.LIZJ(i, size, "index"));
    }

    public static C19861712nP LJIIIZ(int i, Object[] objArr) {
        if (i == 0) {
            return C19861712nP.LLILZIL;
        }
        return new C19861712nP(i, objArr);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public AbstractC19861312nL subList(final int i, int i2) {
        C19862312nV.LIZIZ(i, i2, size());
        final int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return C19861712nP.LLILZIL;
        }
        return new AbstractC19861312nL(i, i3) { // from class: X.12nN
            public final transient int LLILLL;
            public final transient int LLILZ;

            @Override // X.AbstractC19861612nO
            public final Object[] LJIIIIZZ() {
                return this.LLILZIL.LJIIIIZZ();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.LLILZ;
            }

            @Override // X.AbstractC19861612nO
            public final int LJ() {
                return this.LLILZIL.LJFF() + this.LLILLL + this.LLILZ;
            }

            @Override // X.AbstractC19861612nO
            public final int LJFF() {
                return this.LLILZIL.LJFF() + this.LLILLL;
            }

            @Override // java.util.List
            public final Object get(int i4) {
                C19862312nV.LIZ(i4, this.LLILZ);
                return this.LLILZIL.get(i4 + this.LLILLL);
            }

            @Override // X.AbstractC19861312nL, java.util.List
            public final /* bridge */ /* synthetic */ List subList(int i4, int i5) {
                return subList(i4, i5);
            }

            @Override // X.AbstractC19861312nL
            /* JADX INFO: renamed from: zzg */
            public final AbstractC19861312nL subList(int i4, int i5) {
                C19862312nV.LIZIZ(i4, i5, this.LLILZ);
                AbstractC19861312nL abstractC19861312nL = this.LLILZIL;
                int i6 = this.LLILLL;
                return abstractC19861312nL.subList(i4 + i6, i5 + i6);
            }

            {
                this.LLILLL = i;
                this.LLILZ = i3;
            }
        };
    }
}
