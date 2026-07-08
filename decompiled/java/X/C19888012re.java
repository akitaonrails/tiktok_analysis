package X;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.12re, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19888012re<E> extends AbstractC19887212rW<E> implements RandomAccess {
    public static final Object[] LLILZ;
    public static final C19888012re<Object> LLILZIL;
    public E[] LLILLJJLI;
    public int LLILLL;

    static {
        Object[] objArr = new Object[0];
        LLILZ = objArr;
        LLILZIL = new C19888012re<>(objArr, 0, false);
    }

    public C19888012re() {
        this(LLILZ, 0, true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LLILLL;
    }

    public final void LJ(int i) {
        E[] eArr = this.LLILLJJLI;
        if (i <= eArr.length) {
            return;
        }
        if (eArr.length == 0) {
            this.LLILLJJLI = (E[]) new Object[Math.max(i, 10)];
            return;
        }
        int length = eArr.length;
        while (length < i) {
            length = Math.max(((length * 3) / 2) + 1, 10);
        }
        this.LLILLJJLI = (E[]) Arrays.copyOf(this.LLILLJJLI, length);
    }

    public final void LJFF(int i) {
        if (i >= 0 && i < this.LLILLL) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Index:");
        sbLIZ.append(i);
        sbLIZ.append(", Size:");
        sbLIZ.append(this.LLILLL);
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC19921012wy
    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
    public final C19888012re<E> LJIILL(int i) {
        Object[] objArrCopyOf;
        if (i >= this.LLILLL) {
            if (i == 0) {
                objArrCopyOf = LLILZ;
            } else {
                objArrCopyOf = Arrays.copyOf(this.LLILLJJLI, i);
            }
            return new C19888012re<>(objArrCopyOf, this.LLILLL, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        LIZJ();
        int i = this.LLILLL;
        E[] eArr = this.LLILLJJLI;
        if (i == eArr.length) {
            this.LLILLJJLI = (E[]) Arrays.copyOf(this.LLILLJJLI, Math.max(((eArr.length * 3) / 2) + 1, 10));
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
        LJFF(i);
        return this.LLILLJJLI[i];
    }

    @Override // X.AbstractC19887212rW, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        LIZJ();
        LJFF(i);
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
        LIZJ();
        if (i >= 0 && i <= (i2 = this.LLILLL)) {
            E[] eArr = this.LLILLJJLI;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) new Object[Math.max(((eArr.length * 3) / 2) + 1, 10)];
                System.arraycopy(this.LLILLJJLI, 0, eArr2, 0, i);
                System.arraycopy(this.LLILLJJLI, i, eArr2, i + 1, this.LLILLL - i);
                this.LLILLJJLI = eArr2;
            }
            this.LLILLJJLI[i] = e;
            this.LLILLL++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Index:");
        sbLIZ.append(i);
        sbLIZ.append(", Size:");
        sbLIZ.append(this.LLILLL);
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        LIZJ();
        LJFF(i);
        E[] eArr = this.LLILLJJLI;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    public C19888012re(E[] eArr, int i, boolean z) {
        super(z);
        this.LLILLJJLI = eArr;
        this.LLILLL = i;
    }
}
