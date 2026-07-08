package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.13Ad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19966113Ad extends AbstractC19966513Ah implements List, RandomAccess {
    public static final C19966913Al LLILLJJLI = new C19966913Al(C19966813Ak.LLILZIL, 0);
    public static final /* synthetic */ int zzd = 0;

    @Override // X.AbstractC19966513Ah, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // X.AbstractC19966513Ah
    /* JADX INFO: renamed from: zzd */
    public final AbstractC19967113An iterator() {
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

    public static AbstractC19966113Ad zzh(Object[] objArr) {
        if (objArr.length == 0) {
            return C19966813Ak.LLILZIL;
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
        if (length == 0) {
            return C19966813Ak.LLILZIL;
        }
        return new C19966813Ak(length, objArr2);
    }

    @Override // X.AbstractC19966513Ah
    public void LIZJ(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        Object obj2 = ListProtector.get(this, i);
                        Object obj3 = ListProtector.get(list, i);
                        if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                        }
                    }
                    return true;
                }
                Iterator it2 = iterator();
                Iterator it3 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it3.hasNext() || ((next = it2.next()) != (next2 = it3.next()) && (next == null || !next.equals(next2)))) {
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
    /* JADX INFO: renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final AbstractC19967013Am listIterator(int i) {
        int size = size();
        if (i >= 0 && i <= size) {
            if (isEmpty()) {
                return LLILLJJLI;
            }
            return new C19966913Al(this, i);
        }
        throw new IndexOutOfBoundsException(C19863712nj.LIZJ(i, size, "index"));
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
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public AbstractC19966113Ad subList(final int i, int i2) {
        C19863712nj.LIZIZ(i, i2, size());
        final int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return C19966813Ak.LLILZIL;
        }
        return new AbstractC19966113Ad(i, i3) { // from class: X.13Ae
            public final transient int LLILLL;
            public final transient int LLILZ;

            @Override // X.AbstractC19966513Ah
            public final int LJ() {
                return this.LLILZIL.LJFF() + this.LLILLL + this.LLILZ;
            }

            @Override // X.AbstractC19966513Ah
            public final int LJFF() {
                return this.LLILZIL.LJFF() + this.LLILLL;
            }

            @Override // X.AbstractC19966513Ah
            public final Object[] LJIIIIZZ() {
                return this.LLILZIL.LJIIIIZZ();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.LLILZ;
            }

            @Override // java.util.List
            public final Object get(int i4) {
                C19863712nj.LIZ(i4, this.LLILZ);
                return this.LLILZIL.get(i4 + this.LLILLL);
            }

            @Override // X.AbstractC19966113Ad, java.util.List
            public final /* bridge */ /* synthetic */ List subList(int i4, int i5) {
                return subList(i4, i5);
            }

            @Override // X.AbstractC19966113Ad
            /* JADX INFO: renamed from: zzf */
            public final AbstractC19966113Ad subList(int i4, int i5) {
                C19863712nj.LIZIZ(i4, i5, this.LLILZ);
                AbstractC19966113Ad abstractC19966113Ad = this.LLILZIL;
                int i6 = this.LLILLL;
                return abstractC19966113Ad.subList(i4 + i6, i5 + i6);
            }

            {
                this.LLILLL = i;
                this.LLILZ = i3;
            }
        };
    }
}
