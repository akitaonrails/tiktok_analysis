package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1A6G, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A6G<T> extends AbstractList<T> {
    public static final List LLJ = new ArrayList();
    public int LL;
    public final ArrayList<List<T>> LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;

    public final int LJ() {
        int i = this.LL;
        int size = this.LLILLJJLI.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = ListProtector.get(this.LLILLJJLI, i2);
            if (obj != null && obj != LLJ) {
                break;
            }
            i += this.LLILZLL;
        }
        return i;
    }

    public final int LJFF() {
        int i = this.LLILLL;
        for (int size = this.LLILLJJLI.size() - 1; size >= 0; size--) {
            Object obj = ListProtector.get(this.LLILLJJLI, size);
            if (obj != null && obj != LLJ) {
                break;
            }
            i += this.LLILZLL;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LL + this.LLILZIL + this.LLILLL;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("leading ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", storage ");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", trailing ");
        sbLIZ.append(this.LLILLL);
        StringBuilder sb = new StringBuilder(C2188811AlT.LIZIZ(sbLIZ));
        for (int i = 0; i < this.LLILLJJLI.size(); i++) {
            sb.append(" ");
            sb.append(ListProtector.get(this.LLILLJJLI, i));
        }
        return sb.toString();
    }

    public C1A6G() {
        this.LLILLJJLI = new ArrayList<>();
        this.LLILLL = 0;
        this.LLILZ = 0;
        this.LLILZIL = 0;
        this.LLILZLL = 1;
        this.LLIZ = 0;
        this.LLIZLLLIL = 0;
    }

    public C1A6G(C1A6G<T> c1a6g) {
        this.LL = c1a6g.LL;
        this.LLILLJJLI = new ArrayList<>(c1a6g.LLILLJJLI);
        this.LLILLL = c1a6g.LLILLL;
        this.LLILZ = c1a6g.LLILZ;
        this.LLILZIL = c1a6g.LLILZIL;
        this.LLILZLL = c1a6g.LLILZLL;
        this.LLIZ = c1a6g.LLIZ;
        this.LLIZLLLIL = c1a6g.LLIZLLLIL;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        if (i >= 0 && i < size()) {
            int i2 = i - this.LL;
            if (i2 >= 0 && i2 < this.LLILZIL) {
                int i3 = this.LLILZLL;
                int i4 = 0;
                if (i3 > 0) {
                    i4 = i2 / i3;
                    i2 %= i3;
                } else {
                    int size = this.LLILLJJLI.size();
                    while (i4 < size) {
                        int size2 = ((List) ListProtector.get(this.LLILLJJLI, i4)).size();
                        if (size2 > i2) {
                            break;
                        }
                        i2 -= size2;
                        i4++;
                    }
                }
                List list = (List) ListProtector.get(this.LLILLJJLI, i4);
                if (list != null && list.size() != 0) {
                    return (T) ListProtector.get(list, i2);
                }
            }
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Index: ");
        sbLIZ.append(i);
        sbLIZ.append(", Size: ");
        sbLIZ.append(size());
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZJ(int i, int i2) {
        int i3;
        int i4 = this.LL / this.LLILZLL;
        if (i < i4) {
            int i5 = 0;
            while (true) {
                i3 = i4 - i;
                if (i5 >= i3) {
                    break;
                }
                ListProtector.add(this.LLILLJJLI, 0, null);
                i5++;
            }
            int i6 = i3 * this.LLILZLL;
            this.LLILZIL += i6;
            this.LL -= i6;
        } else {
            i = i4;
        }
        if (i2 >= this.LLILLJJLI.size() + i) {
            int iMin = Math.min(this.LLILLL, ((i2 + 1) - (this.LLILLJJLI.size() + i)) * this.LLILZLL);
            for (int size = this.LLILLJJLI.size(); size <= i2 - i; size++) {
                ArrayList<List<T>> arrayList = this.LLILLJJLI;
                ListProtector.add(arrayList, arrayList.size(), null);
            }
            this.LLILZIL += iMin;
            this.LLILLL -= iMin;
        }
    }

    public final boolean LJIIIIZZ(int i, int i2) {
        Object obj;
        int i3 = this.LL / i;
        if (i2 < i3 || i2 >= this.LLILLJJLI.size() + i3 || (obj = ListProtector.get(this.LLILLJJLI, i2 - i3)) == null || obj == LLJ) {
            return false;
        }
        return true;
    }

    public final void LJIIJ(int i, List list, C1A6J c1a6j) {
        boolean z;
        int size = list.size();
        if (size != this.LLILZLL) {
            int size2 = size();
            int i2 = this.LLILZLL;
            if (i == size2 - (size2 % i2) && size < i2) {
                z = true;
            } else {
                z = false;
            }
            if (this.LLILLL == 0 && this.LLILLJJLI.size() == 1 && size > this.LLILZLL) {
                this.LLILZLL = size;
            } else if (!z) {
                throw new IllegalArgumentException("page introduces incorrect tiling");
            }
        }
        int i3 = i / this.LLILZLL;
        LIZJ(i3, i3);
        int i4 = i3 - (this.LL / this.LLILZLL);
        Object obj = ListProtector.get(this.LLILLJJLI, i4);
        if (obj != null && obj != LLJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid position ");
            sbLIZ.append(i);
            sbLIZ.append(": data already loaded");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        ListProtector.set(this.LLILLJJLI, i4, list);
        if (c1a6j != null) {
            c1a6j.LJIJ(i, list.size());
        }
    }

    public final void LJIIIZ(int i, int i2, int i3, List list) {
        this.LL = i;
        this.LLILLJJLI.clear();
        this.LLILLJJLI.add(list);
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZIL = list.size();
        this.LLILZLL = list.size();
        this.LLIZ = 0;
        this.LLIZLLLIL = 0;
    }
}
