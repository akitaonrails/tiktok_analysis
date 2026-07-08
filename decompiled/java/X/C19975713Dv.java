package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.13Dv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19975713Dv<E> extends AbstractC19975913Dx<E> implements C13D5<E> {
    public static final C19975713Dv LLILLL = new C19975713Dv(new Object[0]);
    public final Object[] LLILLJJLI;

    @Override // X.AbstractC2253808sK
    public final int LIZJ() {
        return this.LLILLJJLI.length;
    }

    @Override // X.C13E1
    public final C19975613Du builder() {
        return new C19975613Du(this, null, this.LLILLJJLI, 0);
    }

    public C19975713Dv(Object[] objArr) {
        this.LLILLJJLI = objArr;
    }

    @Override // X.C13E1
    public final C13E1 LJIILLIIL(AwS609S0100000_30 awS609S0100000_30) {
        Object[] objArrCopyOf = this.LLILLJJLI;
        int length = objArrCopyOf.length;
        int length2 = objArrCopyOf.length;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = this.LLILLJJLI[i];
            if (((Boolean) awS609S0100000_30.invoke(obj)).booleanValue()) {
                if (!z) {
                    Object[] objArr = this.LLILLJJLI;
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == this.LLILLJJLI.length) {
            return this;
        }
        if (length == 0) {
            return LLILLL;
        }
        C1691430u7J.LIZ(length, objArrCopyOf.length);
        return new C19975713Dv(Arrays.copyOfRange(objArrCopyOf, 0, length));
    }

    @Override // X.C13E1
    public final C13E1<E> LJZI(int i) {
        C19973813Dc.LIZ(i, LIZJ());
        if (LIZJ() == 1) {
            return LLILLL;
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.LLILLJJLI, LIZJ() - 1);
        int i2 = i + 1;
        System.arraycopy(this.LLILLJJLI, i2, objArrCopyOf, i, LIZJ() - i2);
        return new C19975713Dv(objArrCopyOf);
    }

    @Override // java.util.Collection, java.util.List, X.C13E1
    public final C13E1<E> add(E e) {
        Object[] objArr = this.LLILLJJLI;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[this.LLILLJJLI.length] = e;
            return new C19975713Dv(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = e;
        return new C19975813Dw(objArr.length + 1, 0, objArr, objArr2);
    }

    @Override // X.AbstractC19975913Dx, java.util.Collection, java.util.List, X.C13E1
    public final C13E1<E> addAll(Collection<? extends E> collection) {
        if (this.LLILLJJLI.length + collection.size() <= 32) {
            Object[] objArr = this.LLILLJJLI;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + collection.size());
            int length = this.LLILLJJLI.length;
            Iterator<? extends E> it2 = collection.iterator();
            while (it2.hasNext()) {
                objArrCopyOf[length] = it2.next();
                length++;
            }
            return new C19975713Dv(objArrCopyOf);
        }
        C19975613Du c19975613DuBuilder = builder();
        c19975613DuBuilder.addAll(collection);
        return c19975613DuBuilder.LIZJ();
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final E get(int i) {
        C19973813Dc.LIZ(i, LIZJ());
        return (E) this.LLILLJJLI[i];
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final int indexOf(Object obj) {
        return C13LQ.LJJIJIIJI(obj, this.LLILLJJLI);
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final int lastIndexOf(Object obj) {
        return C13LQ.LJJJJ(obj, this.LLILLJJLI);
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final ListIterator<E> listIterator(final int i) {
        C19973813Dc.LIZIZ(i, LIZJ());
        final Object[] objArr = this.LLILLJJLI;
        final int iLIZJ = LIZJ();
        return new C13E2<T>(i, iLIZJ, objArr) { // from class: X.13E3
            public final T[] LLILLL;

            @Override // java.util.ListIterator, java.util.Iterator
            public final T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T[] tArr = this.LLILLL;
                int i2 = this.LL;
                this.LL = i2 + 1;
                return tArr[i2];
            }

            @Override // java.util.ListIterator
            public final T previous() {
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                T[] tArr = this.LLILLL;
                int i2 = this.LL - 1;
                this.LL = i2;
                return tArr[i2];
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LLILLL = objArr;
            }
        };
    }

    @Override // java.util.List, X.C13E1
    public final C13E1<E> add(int i, E e) {
        C19973813Dc.LIZIZ(i, this.LLILLJJLI.length);
        Object[] objArr = this.LLILLJJLI;
        if (i == objArr.length) {
            return add((Object) e);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            C13DL.LJ(objArr, objArr2, 0, i, 6);
            Object[] objArr3 = this.LLILLJJLI;
            System.arraycopy(objArr3, i, objArr2, i + 1, objArr3.length - i);
            objArr2[i] = e;
            return new C19975713Dv(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        System.arraycopy(this.LLILLJJLI, i, objArrCopyOf, i + 1, (r2.length - 1) - i);
        objArrCopyOf[i] = e;
        Object[] objArr4 = this.LLILLJJLI;
        Object[] objArr5 = new Object[32];
        objArr5[0] = objArr4[31];
        return new C19975813Dw(objArr4.length + 1, 0, objArrCopyOf, objArr5);
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final C13E1<E> set(int i, E e) {
        C19973813Dc.LIZ(i, LIZJ());
        Object[] objArr = this.LLILLJJLI;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = e;
        return new C19975713Dv(objArrCopyOf);
    }
}
