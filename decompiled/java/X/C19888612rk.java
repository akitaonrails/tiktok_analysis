package X;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.12rk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19888612rk extends AbstractC19887212rW<Double> implements InterfaceC19888712rl, RandomAccess, InterfaceC19888312rh {
    public static final double[] LLILZ;
    public static final C19888612rk LLILZIL;
    public double[] LLILLJJLI;
    public int LLILLL;

    static {
        double[] dArr = new double[0];
        LLILZ = dArr;
        LLILZIL = new C19888612rk(dArr, 0, false);
    }

    @Override // X.AbstractC19887212rW, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iLIZJ = 1;
        for (int i = 0; i < this.LLILLL; i++) {
            iLIZJ = (iLIZJ * 31) + C19922012x8.LIZJ(Double.doubleToLongBits(this.LLILLJJLI[i]));
        }
        return iLIZJ;
    }

    public C19888612rk() {
        this(LLILZ, 0, true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LLILLL;
    }

    public final void LJ(double d) {
        LIZJ();
        int i = this.LLILLL;
        double[] dArr = this.LLILLJJLI;
        if (i == dArr.length) {
            double[] dArr2 = new double[Math.max(((dArr.length * 3) / 2) + 1, 10)];
            System.arraycopy(this.LLILLJJLI, 0, dArr2, 0, this.LLILLL);
            this.LLILLJJLI = dArr2;
        }
        double[] dArr3 = this.LLILLJJLI;
        int i2 = this.LLILLL;
        this.LLILLL = i2 + 1;
        dArr3[i2] = d;
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
    public final C19888612rk LJIILL(int i) {
        double[] dArrCopyOf;
        if (i >= this.LLILLL) {
            if (i == 0) {
                dArrCopyOf = LLILZ;
            } else {
                dArrCopyOf = Arrays.copyOf(this.LLILLJJLI, i);
            }
            return new C19888612rk(dArrCopyOf, this.LLILLL, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        LJ(((Double) obj).doubleValue());
        return true;
    }

    @Override // X.AbstractC19887212rW, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        LIZJ();
        Charset charset = C19922012x8.LIZ;
        collection.getClass();
        if (!(collection instanceof C19888612rk)) {
            return super.addAll(collection);
        }
        C19888612rk c19888612rk = (C19888612rk) collection;
        int i = c19888612rk.LLILLL;
        if (i == 0) {
            return false;
        }
        int i2 = this.LLILLL;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.LLILLJJLI;
            if (i3 > dArr.length) {
                this.LLILLJJLI = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(c19888612rk.LLILLJJLI, 0, this.LLILLJJLI, this.LLILLL, c19888612rk.LLILLL);
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
        if (!(obj instanceof C19888612rk)) {
            return super.equals(obj);
        }
        C19888612rk c19888612rk = (C19888612rk) obj;
        if (this.LLILLL != c19888612rk.LLILLL) {
            return false;
        }
        double[] dArr = c19888612rk.LLILLJJLI;
        for (int i = 0; i < this.LLILLL; i++) {
            if (Double.doubleToLongBits(this.LLILLJJLI[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        LJFF(i);
        return Double.valueOf(this.LLILLJJLI[i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.LLILLJJLI[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // X.AbstractC19887212rW, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        LIZJ();
        LJFF(i);
        double[] dArr = this.LLILLJJLI;
        double d = dArr[i];
        if (i < this.LLILLL - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r2 - i) - 1);
        }
        this.LLILLL--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        LIZJ();
        if (i >= 0 && i <= (i2 = this.LLILLL)) {
            double[] dArr = this.LLILLJJLI;
            if (i2 < dArr.length) {
                System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
            } else {
                double[] dArr2 = new double[Math.max(((dArr.length * 3) / 2) + 1, 10)];
                System.arraycopy(this.LLILLJJLI, 0, dArr2, 0, i);
                System.arraycopy(this.LLILLJJLI, i, dArr2, i + 1, this.LLILLL - i);
                this.LLILLJJLI = dArr2;
            }
            this.LLILLJJLI[i] = dDoubleValue;
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
            double[] dArr = this.LLILLJJLI;
            System.arraycopy(dArr, i2, dArr, i, this.LLILLL - i2);
            this.LLILLL -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        LIZJ();
        LJFF(i);
        double[] dArr = this.LLILLJJLI;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    public C19888612rk(double[] dArr, int i, boolean z) {
        super(z);
        this.LLILLJJLI = dArr;
        this.LLILLL = i;
    }
}
