package X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: X.12pZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19875112pZ<E> extends AbstractC19875812pg<E> implements Set<E> {
    public transient AbstractC19875512pd<E> LLILLJJLI;

    public static boolean shouldTrim(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public boolean LJIIL() {
        return this instanceof C19876212pk;
    }

    @Override // X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract AbstractC19853312m3<E> iterator();

    public static <E> C19875212pa<E> builder() {
        return new C19875212pa<>();
    }

    @Override // X.AbstractC19875812pg
    public AbstractC19875512pd<E> asList() {
        AbstractC19875512pd<E> abstractC19875512pd = this.LLILLJJLI;
        if (abstractC19875512pd != null) {
            return abstractC19875512pd;
        }
        AbstractC19875512pd<E> abstractC19875512pdLJIIJJI = LJIIJJI();
        this.LLILLJJLI = abstractC19875512pdLJIIJJI;
        return abstractC19875512pdLJIIJJI;
    }

    @Override // X.AbstractC19875812pg
    public Object writeReplace() {
        final Object[] array = toArray();
        return new Serializable(array) { // from class: X.12pp
            public static final long serialVersionUID = 0;
            public final Object[] LL;

            public Object readResolve() {
                return AbstractC19875112pZ.copyOf(this.LL);
            }

            {
                this.LL = array;
            }
        };
    }

    public AbstractC19875512pd<E> LJIIJJI() {
        Object[] array = toArray();
        C19864812nu c19864812nu = AbstractC19875512pd.LLILLJJLI;
        return AbstractC19875512pd.LJIIJ(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return C1664790tQL.LIZIZ(this);
    }

    @Override // X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public static <E> AbstractC19875112pZ<E> of() {
        return C19876212pk.LLJ;
    }

    public static int LJIIJ(int i) {
        int iMax = Math.max(i, 2);
        boolean z = true;
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (((double) iHighestOneBit) * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
            return iHighestOneBit;
        }
        if (iMax >= 1073741824) {
            z = false;
        }
        C19864312np.LIZLLL("collection too large", z);
        return 1073741824;
    }

    public static <E> C19875212pa<E> builderWithExpectedSize(int i) {
        C19863912nl.LIZIZ(i, "expectedSize");
        return new C19875212pa<>(i);
    }

    public static <E> AbstractC19875112pZ<E> copyOf(Iterator<? extends E> it2) {
        if (!it2.hasNext()) {
            return of();
        }
        E next = it2.next();
        if (!it2.hasNext()) {
            return of((Object) next);
        }
        C19875212pa c19875212pa = new C19875212pa();
        c19875212pa.LJI(next);
        c19875212pa.LJIIIIZZ(it2);
        return c19875212pa.LJIIIZ();
    }

    public static <E> AbstractC19875112pZ<E> of(E e) {
        return new C19853412m4(e);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC19875112pZ) && LJIIL() && ((AbstractC19875112pZ) obj).LJIIL() && hashCode() != obj.hashCode()) {
            return false;
        }
        return C1664790tQL.LIZ(obj, this);
    }

    public static <E> AbstractC19875112pZ<E> copyOf(E[] eArr) {
        int length = eArr.length;
        if (length != 0) {
            if (length != 1) {
                return construct(eArr.length, (Object[]) eArr.clone());
            }
            return of((Object) eArr[0]);
        }
        return of();
    }

    public static <E> AbstractC19875112pZ<E> copyOf(Collection<? extends E> collection) {
        if ((collection instanceof AbstractC19875112pZ) && !(collection instanceof SortedSet)) {
            AbstractC19875112pZ<E> abstractC19875112pZ = (AbstractC19875112pZ) collection;
            if (!abstractC19875112pZ.LJIIIZ()) {
                return abstractC19875112pZ;
            }
        }
        Object[] array = collection.toArray();
        return construct(array.length, array);
    }

    public static <E> AbstractC19875112pZ<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    public static <E> AbstractC19875112pZ<E> construct(int i, Object... objArr) {
        Object[] objArrCopyOf = objArr;
        if (i != 0) {
            if (i != 1) {
                int iLJIIJ = LJIIJ(i);
                Object[] objArr2 = new Object[iLJIIJ];
                int i2 = iLJIIJ - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArrCopyOf[i5];
                    if (obj != null) {
                        int iHashCode = obj.hashCode();
                        int iLIZ = C19876812pq.LIZ(iHashCode);
                        while (true) {
                            int i6 = iLIZ & i2;
                            Object obj2 = objArr2[i6];
                            if (obj2 == null) {
                                objArrCopyOf[i4] = obj;
                                objArr2[i6] = obj;
                                i3 += iHashCode;
                                i4++;
                                break;
                            }
                            if (!obj2.equals(obj)) {
                                iLIZ++;
                            }
                        }
                    } else {
                        StringBuilder sb = new StringBuilder(20);
                        sb.append("at index ");
                        sb.append(i5);
                        throw new NullPointerException(sb.toString());
                    }
                }
                Arrays.fill(objArrCopyOf, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj3 = objArrCopyOf[0];
                    Objects.requireNonNull(obj3);
                    return new C19853412m4(obj3);
                }
                if (LJIIJ(i4) < iLJIIJ / 2) {
                    return construct(i4, objArrCopyOf);
                }
                if (shouldTrim(i4, objArrCopyOf.length)) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                }
                return new C19876212pk(i3, i2, i4, objArrCopyOf, objArr2);
            }
            Object obj4 = objArrCopyOf[0];
            Objects.requireNonNull(obj4);
            return of(obj4);
        }
        return of();
    }

    public static <E> AbstractC19875112pZ<E> of(E e, E e2) {
        return construct(2, e, e2);
    }

    public static <E> AbstractC19875112pZ<E> of(E e, E e2, E e3) {
        return construct(3, e, e2, e3);
    }

    public static <E> AbstractC19875112pZ<E> of(E e, E e2, E e3, E e4) {
        return construct(4, e, e2, e3, e4);
    }

    public static <E> AbstractC19875112pZ<E> of(E e, E e2, E e3, E e4, E e5) {
        return construct(5, e, e2, e3, e4, e5);
    }

    public static <E> AbstractC19875112pZ<E> of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        boolean z;
        if (eArr.length <= 2147483641) {
            z = true;
        } else {
            z = false;
        }
        C19864312np.LIZLLL("the total number of elements must fit in an int", z);
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return construct(length, objArr);
    }
}
