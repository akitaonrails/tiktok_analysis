package X;

import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.0IDf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C462890IDf implements Iterator, C03W4 {
    public final int $t;
    public int i1;
    public Object l0;

    public static final void remove$0(C462890IDf c462890IDf) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final void remove$1(C462890IDf c462890IDf) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final void remove$2(C462890IDf c462890IDf) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final void remove$3(C462890IDf c462890IDf) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final void remove$4(C462890IDf c462890IDf) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final void remove$5(C462890IDf c462890IDf) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.$t) {
            case 0:
                return hasNext$0(this);
            case 1:
                return hasNext$1(this);
            case 2:
                return hasNext$2(this);
            case 3:
                return hasNext$3(this);
            case 4:
                return hasNext$4(this);
            case 5:
                return hasNext$5(this);
            default:
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.$t) {
            case 0:
                return next$0(this);
            case 1:
                return next$1(this);
            case 2:
                return next$2(this);
            case 3:
                return next$3(this);
            case 4:
                return next$4(this);
            case 5:
                return next$5(this);
            default:
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.$t) {
            case 0:
                remove$0(this);
                break;
            case 1:
                remove$1(this);
                break;
            case 2:
                remove$2(this);
                break;
            case 3:
                remove$3(this);
                break;
            case 4:
                remove$4(this);
                break;
            case 5:
                remove$5(this);
                break;
        }
    }

    public static final boolean hasNext$0(C462890IDf c462890IDf) {
        if (c462890IDf.i1 < ((ViewGroup) c462890IDf.l0).getChildCount()) {
            return true;
        }
        return false;
    }

    public static final boolean hasNext$1(C462890IDf c462890IDf) {
        if (c462890IDf.i1 < ((ViewGroup) c462890IDf.l0).getChildCount()) {
            return true;
        }
        return false;
    }

    public static final boolean hasNext$2(C462890IDf c462890IDf) {
        if (c462890IDf.i1 < ((ViewGroup) c462890IDf.l0).getChildCount()) {
            return true;
        }
        return false;
    }

    public static final boolean hasNext$3(C462890IDf c462890IDf) {
        if (c462890IDf.i1 < ((ViewGroup) c462890IDf.l0).getChildCount()) {
            return true;
        }
        return false;
    }

    public static final boolean hasNext$4(C462890IDf c462890IDf) {
        if (c462890IDf.i1 < ((ViewGroup) c462890IDf.l0).getChildCount()) {
            return true;
        }
        return false;
    }

    public static final boolean hasNext$5(C462890IDf c462890IDf) {
        if (c462890IDf.i1 < 4) {
            return true;
        }
        return false;
    }

    public static final Object next$0(C462890IDf c462890IDf) {
        ViewGroup viewGroup = (ViewGroup) c462890IDf.l0;
        int i = c462890IDf.i1;
        c462890IDf.i1 = i + 1;
        return viewGroup.getChildAt(i);
    }

    public static final Object next$1(C462890IDf c462890IDf) {
        ViewGroup viewGroup = (ViewGroup) c462890IDf.l0;
        int i = c462890IDf.i1;
        c462890IDf.i1 = i + 1;
        return viewGroup.getChildAt(i);
    }

    public static final Object next$2(C462890IDf c462890IDf) {
        ViewGroup viewGroup = (ViewGroup) c462890IDf.l0;
        int i = c462890IDf.i1;
        c462890IDf.i1 = i + 1;
        return viewGroup.getChildAt(i);
    }

    public static final Object next$3(C462890IDf c462890IDf) {
        ViewGroup viewGroup = (ViewGroup) c462890IDf.l0;
        int i = c462890IDf.i1;
        c462890IDf.i1 = i + 1;
        return viewGroup.getChildAt(i);
    }

    public static final Object next$4(C462890IDf c462890IDf) {
        ViewGroup viewGroup = (ViewGroup) c462890IDf.l0;
        int i = c462890IDf.i1;
        c462890IDf.i1 = i + 1;
        return viewGroup.getChildAt(i);
    }

    public static final Object next$5(C462890IDf c462890IDf) {
        int i = c462890IDf.i1 + 1;
        c462890IDf.i1 = i;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return ((C0HZV) c462890IDf.l0).LLJI;
                        }
                        throw new NoSuchElementException();
                    }
                    return ((C0HZV) c462890IDf.l0).LLJ;
                }
                return ((C0HZV) c462890IDf.l0).LLIZLLLIL;
            }
            return ((C0HZV) c462890IDf.l0).LLIZ;
        }
        return ((C0HZV) c462890IDf.l0).LLILZLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C462890IDf(C0HZV c0hzv, C0HZV<T> c0hzv2) {
        this.$t = c0hzv2;
        this.l0 = c0hzv;
        this.i1 = -1;
    }

    public C462890IDf(ViewGroup viewGroup, int i) {
        this.$t = i;
        this.l0 = viewGroup;
    }
}
