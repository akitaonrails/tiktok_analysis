package X;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.12ra, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19887612ra extends AbstractC19887112rV implements RandomAccess {
    public static final float[] LLILZ;
    public float[] LLILLJJLI;
    public int LLILLL;

    static {
        float[] fArr = new float[0];
        LLILZ = fArr;
        new C19887612ra(0, fArr, false);
    }

    @Override // X.AbstractC19887112rV, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.LLILLL; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.LLILLJJLI[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LLILLL;
    }

    public C19887612ra() {
        this(0, LLILZ, true);
    }

    public final void LIZJ(float f) {
        zza();
        int i = this.LLILLL;
        int length = this.LLILLJJLI.length;
        if (i == length) {
            float[] fArr = new float[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.LLILLJJLI, 0, fArr, 0, this.LLILLL);
            this.LLILLJJLI = fArr;
        }
        float[] fArr2 = this.LLILLJJLI;
        int i2 = this.LLILLL;
        this.LLILLL = i2 + 1;
        fArr2[i2] = f;
    }

    public final void LJ(int i) {
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
        float[] fArrCopyOf;
        if (i >= this.LLILLL) {
            if (i == 0) {
                fArrCopyOf = LLILZ;
            } else {
                fArrCopyOf = Arrays.copyOf(this.LLILLJJLI, i);
            }
            return new C19887612ra(this.LLILLL, fArrCopyOf, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        LIZJ(((Float) obj).floatValue());
        return true;
    }

    @Override // X.AbstractC19887112rV, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = C19856312mX.LIZ;
        collection.getClass();
        if (!(collection instanceof C19887612ra)) {
            return super.addAll(collection);
        }
        C19887612ra c19887612ra = (C19887612ra) collection;
        int i = c19887612ra.LLILLL;
        if (i == 0) {
            return false;
        }
        int i2 = this.LLILLL;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.LLILLJJLI;
            if (i3 > fArr.length) {
                this.LLILLJJLI = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(c19887612ra.LLILLJJLI, 0, this.LLILLJJLI, this.LLILLL, c19887612ra.LLILLL);
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

    @Override // X.AbstractC19887112rV, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19887612ra)) {
            return super.equals(obj);
        }
        C19887612ra c19887612ra = (C19887612ra) obj;
        if (this.LLILLL != c19887612ra.LLILLL) {
            return false;
        }
        float[] fArr = c19887612ra.LLILLJJLI;
        for (int i = 0; i < this.LLILLL; i++) {
            if (Float.floatToIntBits(this.LLILLJJLI[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        LJ(i);
        return Float.valueOf(this.LLILLJJLI[i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.LLILLJJLI[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // X.AbstractC19887112rV, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        LJ(i);
        float[] fArr = this.LLILLJJLI;
        float f = fArr[i];
        if (i < this.LLILLL - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.LLILLL--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        zza();
        if (i >= 0 && i <= (i2 = this.LLILLL)) {
            int i3 = i + 1;
            float[] fArr = this.LLILLJJLI;
            int length = fArr.length;
            if (i2 < length) {
                System.arraycopy(fArr, i, fArr, i3, i2 - i);
            } else {
                float[] fArr2 = new float[Math.max(((length * 3) / 2) + 1, 10)];
                System.arraycopy(this.LLILLJJLI, 0, fArr2, 0, i);
                System.arraycopy(this.LLILLJJLI, i, fArr2, i3, this.LLILLL - i);
                this.LLILLJJLI = fArr2;
            }
            this.LLILLJJLI[i] = fFloatValue;
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

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zza();
        if (i2 >= i) {
            float[] fArr = this.LLILLJJLI;
            System.arraycopy(fArr, i2, fArr, i, this.LLILLL - i2);
            this.LLILLL -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        zza();
        LJ(i);
        float[] fArr = this.LLILLJJLI;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    public C19887612ra(int i, float[] fArr, boolean z) {
        super(z);
        this.LLILLJJLI = fArr;
        this.LLILLL = i;
    }
}
