package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.12r9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19884912r9 extends AbstractC19884712r7 implements List, RandomAccess {
    public static final C19885312rD LLILLJJLI = new C19885312rD(C19885112rB.LLILZIL, 0);
    public static final /* synthetic */ int zzd = 0;

    @Override // X.AbstractC19884712r7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // X.AbstractC19884712r7
    public final AbstractC19884912r9 zzd() {
        return this;
    }

    @Override // X.AbstractC19884712r7
    /* JADX INFO: renamed from: zze */
    public final AbstractC19885512rF iterator() {
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

    public static AbstractC19884912r9 zzk() {
        return C19885112rB.LLILZIL;
    }

    public static AbstractC19884912r9 zzj(Collection collection) {
        if (collection instanceof AbstractC19884712r7) {
            AbstractC19884912r9 abstractC19884912r9Zzd = ((AbstractC19884712r7) collection).zzd();
            if (abstractC19884912r9Zzd.LJIIIIZZ()) {
                Object[] array = abstractC19884912r9Zzd.toArray();
                return LJIIJ(array.length, array);
            }
            return abstractC19884912r9Zzd;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        C1702220uOi.LIZ(length, array2);
        return LJIIJ(length, array2);
    }

    public static AbstractC19884912r9 zzl(Object obj) {
        Object[] objArr = {"inapp"};
        C1702220uOi.LIZ(1, objArr);
        return LJIIJ(1, objArr);
    }

    @Override // X.AbstractC19884712r7
    public int LIZJ(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    @Override // X.AbstractC19884712r7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
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
                        if (Objects.equals(ListProtector.get(this, i), ListProtector.get(list, i))) {
                        }
                    }
                    return true;
                }
                Iterator it2 = iterator();
                Iterator it3 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it3.hasNext() || !Objects.equals(it2.next(), it3.next())) {
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
    public final int indexOf(Object obj) {
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
    public final int lastIndexOf(Object obj) {
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
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final AbstractC19885412rE listIterator(int i) {
        C19863812nk.LIZIZ(i, size());
        if (isEmpty()) {
            return LLILLJJLI;
        }
        return new C19885312rD(this, i);
    }

    public static C19885112rB LJIIJ(int i, Object[] objArr) {
        if (i == 0) {
            return C19885112rB.LLILZIL;
        }
        return new C19885112rB(i, objArr);
    }

    public static AbstractC19884912r9 zzm(Object obj, Object obj2) {
        Object[] objArr = {"subs", "inapp"};
        C1702220uOi.LIZ(2, objArr);
        return LJIIJ(2, objArr);
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
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public AbstractC19884912r9 subList(final int i, int i2) {
        C19863812nk.LIZLLL(i, i2, size());
        final int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return C19885112rB.LLILZIL;
        }
        return new AbstractC19884912r9(this, i, i3) { // from class: X.12rA
            public final transient int LLILLL;
            public final transient int LLILZ;
            public final /* synthetic */ AbstractC19884912r9 LLILZIL;

            @Override // X.AbstractC19884712r7
            public final boolean LJIIIIZZ() {
                return true;
            }

            @Override // X.AbstractC19884712r7
            public final Object[] LJIIIZ() {
                return this.LLILZIL.LJIIIZ();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.LLILZ;
            }

            @Override // X.AbstractC19884712r7
            public final int LJ() {
                return this.LLILZIL.LJFF() + this.LLILLL + this.LLILZ;
            }

            @Override // X.AbstractC19884712r7
            public final int LJFF() {
                return this.LLILZIL.LJFF() + this.LLILLL;
            }

            @Override // java.util.List
            public final Object get(int i4) {
                C19863812nk.LIZ(i4, this.LLILZ);
                return this.LLILZIL.get(i4 + this.LLILLL);
            }

            @Override // X.AbstractC19884912r9, java.util.List
            public final /* bridge */ /* synthetic */ List subList(int i4, int i5) {
                return subList(i4, i5);
            }

            @Override // X.AbstractC19884912r9
            /* JADX INFO: renamed from: zzh */
            public final AbstractC19884912r9 subList(int i4, int i5) {
                C19863812nk.LIZLLL(i4, i5, this.LLILZ);
                int i6 = this.LLILLL;
                return this.LLILZIL.subList(i4 + i6, i5 + i6);
            }

            {
                Objects.requireNonNull(this);
                this.LLILZIL = this;
                this.LLILLL = i;
                this.LLILZ = i3;
            }
        };
    }
}
