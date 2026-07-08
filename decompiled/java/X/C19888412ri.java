package X;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.12ri, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19888412ri extends AbstractC19887212rW<Boolean> implements InterfaceC19888512rj, RandomAccess, InterfaceC19888312rh {
    public static final boolean[] LLILZ;
    public static final C19888412ri LLILZIL;
    public boolean[] LLILLJJLI;
    public int LLILLL;

    static {
        boolean[] zArr = new boolean[0];
        LLILZ = zArr;
        LLILZIL = new C19888412ri(zArr, 0, false);
    }

    @Override // X.AbstractC19887212rW, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iLIZIZ = 1;
        for (int i = 0; i < this.LLILLL; i++) {
            iLIZIZ = (iLIZIZ * 31) + C19922012x8.LIZIZ(this.LLILLJJLI[i]);
        }
        return iLIZIZ;
    }

    public C19888412ri() {
        this(LLILZ, 0, true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LLILLL;
    }

    public final void LJ(boolean z) {
        LIZJ();
        int i = this.LLILLL;
        boolean[] zArr = this.LLILLJJLI;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[Math.max(((zArr.length * 3) / 2) + 1, 10)];
            System.arraycopy(this.LLILLJJLI, 0, zArr2, 0, this.LLILLL);
            this.LLILLJJLI = zArr2;
        }
        boolean[] zArr3 = this.LLILLJJLI;
        int i2 = this.LLILLL;
        this.LLILLL = i2 + 1;
        zArr3[i2] = z;
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
    public final C19888412ri LJIILL(int i) {
        boolean[] zArrCopyOf;
        if (i >= this.LLILLL) {
            if (i == 0) {
                zArrCopyOf = LLILZ;
            } else {
                zArrCopyOf = Arrays.copyOf(this.LLILLJJLI, i);
            }
            return new C19888412ri(zArrCopyOf, this.LLILLL, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        LJ(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // X.AbstractC19887212rW, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        LIZJ();
        Charset charset = C19922012x8.LIZ;
        collection.getClass();
        if (!(collection instanceof C19888412ri)) {
            return super.addAll(collection);
        }
        C19888412ri c19888412ri = (C19888412ri) collection;
        int i = c19888412ri.LLILLL;
        if (i == 0) {
            return false;
        }
        int i2 = this.LLILLL;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.LLILLJJLI;
            if (i3 > zArr.length) {
                this.LLILLJJLI = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(c19888412ri.LLILLJJLI, 0, this.LLILLJJLI, this.LLILLL, c19888412ri.LLILLL);
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
        if (!(obj instanceof C19888412ri)) {
            return super.equals(obj);
        }
        C19888412ri c19888412ri = (C19888412ri) obj;
        if (this.LLILLL != c19888412ri.LLILLL) {
            return false;
        }
        boolean[] zArr = c19888412ri.LLILLJJLI;
        for (int i = 0; i < this.LLILLL; i++) {
            if (this.LLILLJJLI[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        LJFF(i);
        return Boolean.valueOf(this.LLILLJJLI[i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.LLILLJJLI[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // X.AbstractC19887212rW, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        LIZJ();
        LJFF(i);
        boolean[] zArr = this.LLILLJJLI;
        boolean z = zArr[i];
        if (i < this.LLILLL - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.LLILLL--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        LIZJ();
        if (i >= 0 && i <= (i2 = this.LLILLL)) {
            boolean[] zArr = this.LLILLJJLI;
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[Math.max(((zArr.length * 3) / 2) + 1, 10)];
                System.arraycopy(this.LLILLJJLI, 0, zArr2, 0, i);
                System.arraycopy(this.LLILLJJLI, i, zArr2, i + 1, this.LLILLL - i);
                this.LLILLJJLI = zArr2;
            }
            this.LLILLJJLI[i] = zBooleanValue;
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
            boolean[] zArr = this.LLILLJJLI;
            System.arraycopy(zArr, i2, zArr, i, this.LLILLL - i2);
            this.LLILLL -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        LIZJ();
        LJFF(i);
        boolean[] zArr = this.LLILLJJLI;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    public C19888412ri(boolean[] zArr, int i, boolean z) {
        super(z);
        this.LLILLJJLI = zArr;
        this.LLILLL = i;
    }
}
