package X;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.12ro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19889012ro extends AbstractC19887212rW<Integer> implements InterfaceC19922412xC, RandomAccess, InterfaceC19888312rh {
    public static final int[] LLILZ;
    public static final C19889012ro LLILZIL;
    public int[] LLILLJJLI;
    public int LLILLL;

    static {
        int[] iArr = new int[0];
        LLILZ = iArr;
        LLILZIL = new C19889012ro(iArr, 0, false);
    }

    @Override // X.AbstractC19887212rW, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.LLILLL; i2++) {
            i = (i * 31) + this.LLILLJJLI[i2];
        }
        return i;
    }

    public C19889012ro() {
        this(LLILZ, 0, true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LLILLL;
    }

    public final void LJ(int i) {
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
    /* JADX INFO: renamed from: LJIILL, reason: merged with bridge method [inline-methods] */
    public final InterfaceC19921012wy<Integer> LJIILL2(int i) {
        int[] iArrCopyOf;
        if (i >= this.LLILLL) {
            if (i == 0) {
                iArrCopyOf = LLILZ;
            } else {
                iArrCopyOf = Arrays.copyOf(this.LLILLJJLI, i);
            }
            return new C19889012ro(iArrCopyOf, this.LLILLL, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // X.InterfaceC19922412xC
    public final void LJJLL(int i) {
        LIZJ();
        int i2 = this.LLILLL;
        int[] iArr = this.LLILLJJLI;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[Math.max(((iArr.length * 3) / 2) + 1, 10)];
            System.arraycopy(this.LLILLJJLI, 0, iArr2, 0, this.LLILLL);
            this.LLILLJJLI = iArr2;
        }
        int[] iArr3 = this.LLILLJJLI;
        int i3 = this.LLILLL;
        this.LLILLL = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        LJJLL(((Integer) obj).intValue());
        return true;
    }

    @Override // X.AbstractC19887212rW, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        LIZJ();
        Charset charset = C19922012x8.LIZ;
        collection.getClass();
        if (!(collection instanceof C19889012ro)) {
            return super.addAll(collection);
        }
        C19889012ro c19889012ro = (C19889012ro) collection;
        int i = c19889012ro.LLILLL;
        if (i == 0) {
            return false;
        }
        int i2 = this.LLILLL;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.LLILLJJLI;
            if (i3 > iArr.length) {
                this.LLILLJJLI = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c19889012ro.LLILLJJLI, 0, this.LLILLJJLI, this.LLILLL, c19889012ro.LLILLL);
            this.LLILLL = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC19887212rW, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19889012ro)) {
            return super.equals(obj);
        }
        C19889012ro c19889012ro = (C19889012ro) obj;
        if (this.LLILLL != c19889012ro.LLILLL) {
            return false;
        }
        int[] iArr = c19889012ro.LLILLJJLI;
        for (int i = 0; i < this.LLILLL; i++) {
            if (this.LLILLJJLI[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    @Override // X.InterfaceC19922412xC
    public final int getInt(int i) {
        LJ(i);
        return this.LLILLJJLI[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.LLILLJJLI[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // X.AbstractC19887212rW, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        LIZJ();
        LJ(i);
        int[] iArr = this.LLILLJJLI;
        int i2 = iArr[i];
        if (i < this.LLILLL - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.LLILLL--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19889012ro(C19889012ro c19889012ro, boolean z) {
        int[] iArrCopyOf;
        int i = c19889012ro.LLILLL;
        if (i == 0) {
            iArrCopyOf = LLILZ;
        } else {
            iArrCopyOf = Arrays.copyOf(c19889012ro.LLILLJJLI, i);
        }
        this(iArrCopyOf, c19889012ro.LLILLL, z);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        LIZJ();
        if (i >= 0 && i <= (i2 = this.LLILLL)) {
            int[] iArr = this.LLILLJJLI;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
            } else {
                int[] iArr2 = new int[Math.max(((iArr.length * 3) / 2) + 1, 10)];
                System.arraycopy(this.LLILLJJLI, 0, iArr2, 0, i);
                System.arraycopy(this.LLILLJJLI, i, iArr2, i + 1, this.LLILLL - i);
                this.LLILLJJLI = iArr2;
            }
            this.LLILLJJLI[i] = iIntValue;
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

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        LIZJ();
        if (i2 >= i) {
            int[] iArr = this.LLILLJJLI;
            System.arraycopy(iArr, i2, iArr, i, this.LLILLL - i2);
            this.LLILLL -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        LIZJ();
        LJ(i);
        int[] iArr = this.LLILLJJLI;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    public C19889012ro(int[] iArr, int i, boolean z) {
        super(z);
        this.LLILLJJLI = iArr;
        this.LLILLL = i;
    }
}
