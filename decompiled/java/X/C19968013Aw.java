package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Aw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19968013Aw<T> implements RandomAccess {
    public T[] LL;
    public C19967913Av LLILLJJLI;
    public int LLILLL = 0;

    public final List<T> LJIIIIZZ() {
        C19967913Av c19967913Av = this.LLILLJJLI;
        if (c19967913Av != null) {
            return c19967913Av;
        }
        C19967913Av c19967913Av2 = new C19967913Av(this);
        this.LLILLJJLI = c19967913Av2;
        return c19967913Av2;
    }

    public final void LJIIIZ() {
        T[] tArr = this.LL;
        int i = this.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            tArr[i2] = null;
        }
        this.LLILLL = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19968013Aw(Object[] objArr) {
        this.LL = objArr;
    }

    public final void LIZLLL(Object obj) {
        int i = this.LLILLL + 1;
        if (this.LL.length < i) {
            LJIILLIIL(i);
        }
        Object[] objArr = (T[]) this.LL;
        int i2 = this.LLILLL;
        objArr[i2] = obj;
        this.LLILLL = i2 + 1;
    }

    public final boolean LJIIJ(T t) {
        int i = this.LLILLL - 1;
        if (i >= 0) {
            for (int i2 = 0; !Intrinsics.LJFF(this.LL[i2], t); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final int LJIIJJI(T t) {
        T[] tArr = this.LL;
        int i = this.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            if (Intrinsics.LJFF(t, tArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean LJIIL(T t) {
        int iLJIIJJI = LJIIJJI(t);
        if (iLJIIJJI >= 0) {
            LJIILIIL(iLJIIJJI);
            return true;
        }
        return false;
    }

    public final T LJIILIIL(int i) {
        T[] tArr = this.LL;
        T t = tArr[i];
        int i2 = this.LLILLL;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(tArr, i3, tArr, i, i2 - i3);
        }
        int i4 = this.LLILLL - 1;
        this.LLILLL = i4;
        tArr[i4] = null;
        return t;
    }

    public final void LJIILLIIL(int i) {
        T[] tArr = this.LL;
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[Math.max(i, length * 2)];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        this.LL = tArr2;
    }

    public final void LJIIZILJ(Comparator<T> comparator) {
        Arrays.sort(this.LL, 0, this.LLILLL, comparator);
    }

    public final void LIZJ(int i, T t) {
        int i2 = this.LLILLL + 1;
        if (this.LL.length < i2) {
            LJIILLIIL(i2);
        }
        T[] tArr = this.LL;
        int i3 = this.LLILLL;
        if (i != i3) {
            System.arraycopy(tArr, i, tArr, i + 1, i3 - i);
        }
        tArr[i] = t;
        this.LLILLL++;
    }

    public final void LJ(int i, C19968013Aw c19968013Aw) {
        int i2 = c19968013Aw.LLILLL;
        if (i2 == 0) {
            return;
        }
        int i3 = this.LLILLL + i2;
        if (this.LL.length < i3) {
            LJIILLIIL(i3);
        }
        T[] tArr = this.LL;
        int i4 = this.LLILLL;
        if (i != i4) {
            System.arraycopy(tArr, i, tArr, i + i2, i4 - i);
        }
        System.arraycopy(c19968013Aw.LL, 0, tArr, i, i2);
        this.LLILLL += i2;
    }

    public final void LJFF(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.LLILLL + size;
        if (this.LL.length < i2) {
            LJIILLIIL(i2);
        }
        Object[] objArr = (T[]) this.LL;
        int i3 = this.LLILLL;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = ListProtector.get(list, i4);
        }
        this.LLILLL += size;
    }

    public final boolean LJI(int i, Collection<? extends T> collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.LLILLL + size;
        if (this.LL.length < i3) {
            LJIILLIIL(i3);
        }
        T[] tArr = this.LL;
        int i4 = this.LLILLL;
        if (i != i4) {
            System.arraycopy(tArr, i, tArr, i + size, i4 - i);
        }
        for (T t : collection) {
            int i5 = i2 + 1;
            if (i2 >= 0) {
                tArr[i2 + i] = t;
                i2 = i5;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        this.LLILLL += size;
        return true;
    }

    public final void LJIILJJIL(int i, int i2) {
        if (i2 > i) {
            int i3 = this.LLILLL;
            if (i2 < i3) {
                T[] tArr = this.LL;
                System.arraycopy(tArr, i2, tArr, i, i3 - i2);
            }
            int i4 = this.LLILLL;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.LL[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.LLILLL = i5;
        }
    }
}
