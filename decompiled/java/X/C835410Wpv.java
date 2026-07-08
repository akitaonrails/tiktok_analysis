package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.0Wpv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C835410Wpv<E> implements Collection<E>, Set<E>, InterfaceC19719812Dk, InterfaceC835440Wpy {
    public int[] LL;
    public Object[] LLILLJJLI;
    public int LLILLL;

    public C835410Wpv() {
        this(0);
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.LLILLL != 0) {
            this.LL = C830540Wi4.LIZ;
            this.LLILLJJLI = C830540Wi4.LIZJ;
            this.LLILLL = 0;
        }
        if (this.LLILLL != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.LL;
        int i = this.LLILLL;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.LLILLL <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new C835430Wpx(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.LLILLJJLI;
        int i = this.LLILLL;
        C1691430u7J.LIZ(i, objArr.length);
        return Arrays.copyOfRange(objArr, 0, i);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.LLILLL * 14);
        sb.append('{');
        int i = this.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.LLILLJJLI[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return this.LLILLL;
    }

    public C835410Wpv(int i) {
        this.LL = C830540Wi4.LIZ;
        this.LLILLJJLI = C830540Wi4.LIZJ;
        if (i > 0) {
            this.LL = new int[i];
            this.LLILLJJLI = new Object[i];
        }
    }

    public final E LIZJ(int i) {
        int i2 = this.LLILLL;
        Object[] objArr = this.LLILLJJLI;
        E e = (E) objArr[i];
        if (i2 <= 1) {
            clear();
            return e;
        }
        int i3 = i2 - 1;
        int[] iArr = this.LL;
        int i4 = 8;
        if (iArr.length > 8 && i2 < iArr.length / 3) {
            if (i2 > 8) {
                i4 = i2 + (i2 >> 1);
            }
            int[] iArr2 = new int[i4];
            this.LL = iArr2;
            this.LLILLJJLI = new Object[i4];
            if (i > 0) {
                C13DL.LIZLLL(iArr, iArr2, 0, i, 6);
                C13DL.LJ(objArr, this.LLILLJJLI, 0, i, 6);
            }
            if (i < i3) {
                int i5 = i + 1;
                int i6 = (i3 + 1) - i5;
                System.arraycopy(iArr, i5, this.LL, i, i6);
                System.arraycopy(objArr, i5, this.LLILLJJLI, i, i6);
            }
        } else {
            if (i < i3) {
                int i7 = i + 1;
                int i8 = (i3 + 1) - i7;
                System.arraycopy(iArr, i7, iArr, i, i8);
                Object[] objArr2 = this.LLILLJJLI;
                System.arraycopy(objArr2, i7, objArr2, i, i8);
            }
            this.LLILLJJLI[i3] = null;
        }
        if (i2 == this.LLILLL) {
            this.LLILLL = i3;
            return e;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e) {
        int iHashCode;
        int iLIZ;
        int i = this.LLILLL;
        if (e == null) {
            iLIZ = C835420Wpw.LIZ(this, null, 0);
            iHashCode = 0;
        } else {
            iHashCode = e.hashCode();
            iLIZ = C835420Wpw.LIZ(this, e, iHashCode);
        }
        if (iLIZ >= 0) {
            return false;
        }
        int i2 = ~iLIZ;
        int[] iArr = this.LL;
        if (i >= iArr.length) {
            int i3 = 8;
            if (i >= 8) {
                i3 = (i >> 1) + i;
            } else if (i < 4) {
                i3 = 4;
            }
            Object[] objArr = this.LLILLJJLI;
            int[] iArr2 = new int[i3];
            this.LL = iArr2;
            this.LLILLJJLI = new Object[i3];
            if (i == this.LLILLL) {
                if (iArr2.length != 0) {
                    C13DL.LIZLLL(iArr, iArr2, 0, iArr.length, 6);
                    C13DL.LJ(objArr, this.LLILLJJLI, 0, objArr.length, 6);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i2 < i) {
            int[] iArr3 = this.LL;
            int i4 = i2 + 1;
            int i5 = i - i2;
            System.arraycopy(iArr3, i2, iArr3, i4, i5);
            Object[] objArr2 = this.LLILLJJLI;
            System.arraycopy(objArr2, i2, objArr2, i4, i5);
        }
        int i6 = this.LLILLL;
        if (i == i6) {
            int[] iArr4 = this.LL;
            if (i2 < iArr4.length) {
                iArr4[i2] = iHashCode;
                this.LLILLJJLI[i2] = e;
                this.LLILLL = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        int size = this.LLILLL + collection.size();
        int i = this.LLILLL;
        int[] iArr = this.LL;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.LLILLJJLI;
            int[] iArr2 = new int[size];
            this.LL = iArr2;
            this.LLILLJJLI = new Object[size];
            if (i > 0) {
                C13DL.LIZLLL(iArr, iArr2, 0, i, 6);
                C13DL.LJ(objArr, this.LLILLJJLI, 0, this.LLILLL, 6);
            }
        }
        if (this.LLILLL == i) {
            Iterator<? extends E> it2 = collection.iterator();
            while (it2.hasNext()) {
                zAdd |= add(it2.next());
            }
            return zAdd;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int iLIZ;
        if (obj == null) {
            iLIZ = C835420Wpw.LIZ(this, null, 0);
        } else {
            iLIZ = C835420Wpw.LIZ(this, obj, obj.hashCode());
        }
        if (iLIZ < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<? extends Object> collection) {
        Iterator<? extends Object> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.LLILLL == ((Set) obj).size()) {
            try {
                int i = this.LLILLL;
                for (int i2 = 0; i2 < i; i2++) {
                    if (((Set) obj).contains(this.LLILLJJLI[i2])) {
                    }
                }
                return true;
            } catch (ClassCastException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (NullPointerException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iLIZ;
        if (obj == null) {
            iLIZ = C835420Wpw.LIZ(this, null, 0);
        } else {
            iLIZ = C835420Wpw.LIZ(this, obj, obj.hashCode());
        }
        if (iLIZ < 0) {
            return false;
        }
        LIZJ(iLIZ);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> collection) {
        Iterator<? extends Object> it2 = collection.iterator();
        boolean zRemove = false;
        while (it2.hasNext()) {
            zRemove |= remove(it2.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> collection) {
        boolean z = false;
        for (int i = this.LLILLL - 1; -1 < i; i--) {
            if (!C13LP.LJJJJ(this.LLILLJJLI[i], collection)) {
                LIZJ(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        int i = this.LLILLL;
        if (tArr.length < i) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
        } else if (tArr.length > i) {
            tArr[i] = null;
        }
        System.arraycopy(this.LLILLJJLI, 0, tArr, 0, this.LLILLL);
        return tArr;
    }
}
