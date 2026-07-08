package X;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.12qa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19881412qa extends AbstractList<Integer> implements RandomAccess, Serializable {
    public static final long serialVersionUID = 0;
    public final int[] LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.LLILLJJLI; i2 < this.LLILLL; i2++) {
            i = (i * 31) + this.LL[i2];
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LLILLL - this.LLILLJJLI;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder((this.LLILLL - this.LLILLJJLI) * 5);
        sb.append('[');
        sb.append(this.LL[this.LLILLJJLI]);
        int i = this.LLILLJJLI;
        while (true) {
            i++;
            if (i >= this.LLILLL) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(this.LL[i]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.LL;
            int iIntValue = ((Integer) obj).intValue();
            int i = this.LLILLL;
            for (int i2 = this.LLILLJJLI; i2 < i; i2++) {
                if (iArr[i2] == iIntValue) {
                    if (i2 != -1) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C19881412qa) {
            C19881412qa c19881412qa = (C19881412qa) obj;
            int i = this.LLILLL - this.LLILLJJLI;
            if (c19881412qa.LLILLL - c19881412qa.LLILLJJLI != i) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (this.LL[this.LLILLJJLI + i2] != c19881412qa.LL[c19881412qa.LLILLJJLI + i2]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        C19864312np.LJFF(i, this.LLILLL - this.LLILLJJLI);
        return Integer.valueOf(this.LL[this.LLILLJJLI + i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.LL;
            int iIntValue = ((Integer) obj).intValue();
            int i = this.LLILLJJLI;
            int i2 = this.LLILLL;
            while (true) {
                if (i >= i2) {
                    break;
                }
                if (iArr[i] == iIntValue) {
                    if (i >= 0) {
                        return i - this.LLILLJJLI;
                    }
                } else {
                    i++;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.LL;
            int iIntValue = ((Integer) obj).intValue();
            int i = this.LLILLJJLI;
            int i2 = this.LLILLL - 1;
            while (true) {
                if (i2 < i) {
                    break;
                }
                if (iArr[i2] == iIntValue) {
                    if (i2 >= 0) {
                        return i2 - this.LLILLJJLI;
                    }
                } else {
                    i2--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        C19864312np.LJFF(i, this.LLILLL - this.LLILLJJLI);
        int[] iArr = this.LL;
        int i2 = this.LLILLJJLI + i;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<Integer> subList(int i, int i2) {
        C19864312np.LJIIIZ(i, i2, this.LLILLL - this.LLILLJJLI);
        if (i == i2) {
            return Collections.emptyList();
        }
        int[] iArr = this.LL;
        int i3 = this.LLILLJJLI;
        return new C19881412qa(i + i3, i3 + i2, iArr);
    }

    public C19881412qa(int i, int i2, int[] iArr) {
        this.LL = iArr;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }
}
