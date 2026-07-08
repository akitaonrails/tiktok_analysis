package X;

import Y.ARunnableS5S0401000_33;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* JADX INFO: renamed from: X.1A6D, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public abstract class C1A6D<T, VH extends RecyclerView.ViewHolder> extends AbstractC21673619ry<VH> {
    public final C1A6B<T> LL;

    @Override // X.AbstractC21673619ry
    public int getItemCount() {
        C1A6B<T> c1a6b = this.LL;
        C1A6I<T> c1a6i = c1a6b.LJFF;
        if (c1a6i != null) {
            return c1a6i.size();
        }
        C1A6I<T> c1a6i2 = c1a6b.LJI;
        if (c1a6i2 == null) {
            return 0;
        }
        return c1a6i2.size();
    }

    public C1A6D(AbstractC339510DSr<T> abstractC339510DSr) {
        C1A6E c1a6e = new C1A6E(this);
        C1A6B<T> c1a6b = new C1A6B<>(this, abstractC339510DSr);
        this.LL = c1a6b;
        c1a6b.LIZLLL = c1a6e;
    }

    public T LLLFZ(int i) {
        C1A6B<T> c1a6b = this.LL;
        C1A6I<T> c1a6i = c1a6b.LJFF;
        if (c1a6i == null) {
            C1A6I<T> c1a6i2 = c1a6b.LJI;
            if (c1a6i2 != null) {
                return c1a6i2.get(i);
            }
            throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
        }
        c1a6i.LLILZLL = c1a6i.LLILZIL.LLILZ + i;
        c1a6i.LJIIZILJ(i);
        c1a6i.LLJI = Math.min(c1a6i.LLJI, i);
        c1a6i.LLJIJIL = Math.max(c1a6i.LLJIJIL, i);
        c1a6i.LJJ(true);
        return c1a6b.LJFF.get(i);
    }

    public final void LLLI(C1A6I<T> c1a6i) {
        C1A6I<T> c1a6n;
        int size;
        C1A6B<T> c1a6b = this.LL;
        if (c1a6i != null) {
            if (c1a6b.LJFF == null && c1a6b.LJI == null) {
                c1a6b.LJ = c1a6i.LJIIL();
            } else if (c1a6i.LJIIL() != c1a6b.LJ) {
                throw new IllegalArgumentException("AsyncPagedListDiffer cannot handle both contiguous and non-contiguous lists.");
            }
        }
        int i = c1a6b.LJII + 1;
        c1a6b.LJII = i;
        C1A6I<T> c1a6i2 = c1a6b.LJFF;
        if (c1a6i != c1a6i2) {
            if (c1a6i == null) {
                if (c1a6i2 != null) {
                    size = c1a6i2.size();
                } else {
                    C1A6I<T> c1a6i3 = c1a6b.LJI;
                    if (c1a6i3 == null) {
                        size = 0;
                    } else {
                        size = c1a6i3.size();
                    }
                }
                C1A6I<T> c1a6i4 = c1a6b.LJFF;
                if (c1a6i4 != null) {
                    c1a6i4.LJIL(c1a6b.LJIIIIZZ);
                    c1a6b.LJFF = null;
                } else if (c1a6b.LJI != null) {
                    c1a6b.LJI = null;
                }
                c1a6b.LIZ.LLIZLLLIL(0, size);
                C1A6E c1a6e = c1a6b.LIZLLL;
                if (c1a6e != null) {
                    c1a6e.LIZ.getClass();
                    return;
                }
                return;
            }
            if (c1a6i2 == null) {
                if (c1a6b.LJI == null) {
                    c1a6b.LJFF = c1a6i;
                    c1a6i.LIZJ(null, c1a6b.LJIIIIZZ);
                    c1a6b.LIZ.LJZL(0, c1a6i.size());
                    C1A6E c1a6e2 = c1a6b.LIZLLL;
                    if (c1a6e2 == null) {
                        return;
                    }
                    c1a6e2.LIZ.getClass();
                    return;
                }
            } else {
                c1a6i2.LJIL(c1a6b.LJIIIIZZ);
                C1A6I<T> c1a6n2 = c1a6b.LJFF;
                if (!c1a6n2.LJIILJJIL()) {
                    c1a6n2 = new C1A6N(c1a6n2);
                }
                c1a6b.LJI = c1a6n2;
                c1a6b.LJFF = null;
            }
            C1A6I<T> c1a6i5 = c1a6b.LJI;
            if (c1a6i5 != null && c1a6b.LJFF == null) {
                if (c1a6i.LJIILJJIL()) {
                    c1a6n = c1a6i;
                } else {
                    c1a6n = new C1A6N<>(c1a6i);
                }
                c1a6b.LIZIZ.LIZ.execute(new ARunnableS5S0401000_33(c1a6b, c1a6i5, c1a6n, i, c1a6i, 1));
                return;
            }
            throw new IllegalStateException("must be in snapshot state to diff");
        }
    }
}
