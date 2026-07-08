package X;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.12rc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19887812rc extends AbstractC19887112rV implements RandomAccess {
    public static final Object[] LLILZ;
    public static final C19887812rc LLILZIL;
    public Object[] LLILLJJLI;
    public int LLILLL;

    static {
        Object[] objArr = new Object[0];
        LLILZ = objArr;
        LLILZIL = new C19887812rc(objArr, 0, false);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LLILLL;
    }

    public C19887812rc() {
        this(LLILZ, 0, true);
    }

    public final void LIZJ(int i) {
        if (i >= 0 && i < this.LLILLL) {
            return;
        }
        int i2 = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Index:");
        sbLIZ.append(i);
        sbLIZ.append(", Size:");
        sbLIZ.append(i2);
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC19911812vU
    public final /* bridge */ /* synthetic */ InterfaceC19911812vU LJIJJ(int i) {
        Object[] objArrCopyOf;
        if (i >= this.LLILLL) {
            if (i == 0) {
                objArrCopyOf = LLILZ;
            } else {
                objArrCopyOf = Arrays.copyOf(this.LLILLJJLI, i);
            }
            return new C19887812rc(objArrCopyOf, this.LLILLL, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i = this.LLILLL;
        int length = this.LLILLJJLI.length;
        if (i == length) {
            this.LLILLJJLI = Arrays.copyOf(this.LLILLJJLI, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.LLILLJJLI;
        int i2 = this.LLILLL;
        this.LLILLL = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        LIZJ(i);
        return this.LLILLJJLI[i];
    }

    @Override // X.AbstractC19887112rV, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        zza();
        LIZJ(i);
        Object[] objArr = this.LLILLJJLI;
        Object obj = objArr[i];
        if (i < this.LLILLL - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.LLILLL--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zza();
        if (i >= 0 && i <= (i2 = this.LLILLL)) {
            int i3 = i + 1;
            Object[] objArr = this.LLILLJJLI;
            int length = objArr.length;
            if (i2 < length) {
                System.arraycopy(objArr, i, objArr, i3, i2 - i);
            } else {
                Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
                System.arraycopy(this.LLILLJJLI, 0, objArr2, 0, i);
                System.arraycopy(this.LLILLJJLI, i, objArr2, i3, this.LLILLL - i);
                this.LLILLJJLI = objArr2;
            }
            this.LLILLJJLI[i] = obj;
            this.LLILLL++;
            ((AbstractList) this).modCount++;
            return;
        }
        int i4 = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Index:");
        sbLIZ.append(i);
        sbLIZ.append(", Size:");
        sbLIZ.append(i4);
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zza();
        LIZJ(i);
        Object[] objArr = this.LLILLJJLI;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    public C19887812rc(Object[] objArr, int i, boolean z) {
        super(z);
        this.LLILLJJLI = objArr;
        this.LLILLL = i;
    }
}
