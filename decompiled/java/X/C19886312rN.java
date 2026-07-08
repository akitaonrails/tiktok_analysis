package X;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.12rN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19886312rN<E> extends AbstractC19886812rS<E> implements RandomAccess {
    public static final C19886312rN<Object> LLILZ = new C19886312rN<>(new Object[0], 0, false);
    public E[] LLILLJJLI;
    public int LLILLL;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LLILLL;
    }

    public final void LIZJ(int i) {
        if (i >= 0 && i < this.LLILLL) {
            return;
        }
        throw new IndexOutOfBoundsException("Index:" + i + ", Size:" + this.LLILLL);
    }

    @Override // X.InterfaceC19875012pY
    public final /* synthetic */ InterfaceC19875012pY LJII(int i) {
        if (i >= this.LLILLL) {
            return new C19886312rN(Arrays.copyOf(this.LLILLJJLI, i), this.LLILLL, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        zza();
        int i = this.LLILLL;
        E[] eArr = this.LLILLJJLI;
        if (i == eArr.length) {
            this.LLILLJJLI = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.LLILLJJLI;
        int i2 = this.LLILLL;
        this.LLILLL = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        LIZJ(i);
        return this.LLILLJJLI[i];
    }

    @Override // X.AbstractC19886812rS, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        zza();
        LIZJ(i);
        E[] eArr = this.LLILLJJLI;
        E e = eArr[i];
        if (i < this.LLILLL - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (r2 - i) - 1);
        }
        this.LLILLL--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        zza();
        if (i >= 0 && i <= (i2 = this.LLILLL)) {
            E[] eArr = this.LLILLJJLI;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(eArr, 0, eArr2, 0, i);
                System.arraycopy(this.LLILLJJLI, i, eArr2, i + 1, this.LLILLL - i);
                this.LLILLJJLI = eArr2;
            }
            this.LLILLJJLI[i] = e;
            this.LLILLL++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index:" + i + ", Size:" + this.LLILLL);
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        zza();
        LIZJ(i);
        E[] eArr = this.LLILLJJLI;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    public C19886312rN(E[] eArr, int i, boolean z) {
        super(z);
        this.LLILLJJLI = eArr;
        this.LLILLL = i;
    }
}
