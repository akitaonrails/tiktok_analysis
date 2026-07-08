package X;

import android.util.SparseArray;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0FX4, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FX4 implements Iterator, C03W4 {
    public final int $t;
    public int i1;
    public Object l0;

    public static final void remove$0(C0FX4 c0fx4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final void remove$1(C0FX4 c0fx4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.$t) {
            case 0:
                return hasNext$0(this);
            case 1:
                return hasNext$1(this);
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
        }
    }

    public static final boolean hasNext$0(C0FX4 c0fx4) {
        if (c0fx4.i1 < ((SparseArray) c0fx4.l0).size()) {
            return true;
        }
        return false;
    }

    public static final boolean hasNext$1(C0FX4 c0fx4) {
        if (c0fx4.i1 < ((ViewGroup) c0fx4.l0).getChildCount()) {
            return true;
        }
        return false;
    }

    public static final Object next$0(C0FX4 c0fx4) {
        SparseArray sparseArray = (SparseArray) c0fx4.l0;
        int i = c0fx4.i1;
        c0fx4.i1 = i + 1;
        return sparseArray.valueAt(i);
    }

    public static final Object next$1(C0FX4 c0fx4) {
        ViewGroup viewGroup = (ViewGroup) c0fx4.l0;
        int i = c0fx4.i1;
        c0fx4.i1 = i + 1;
        return viewGroup.getChildAt(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0FX4(Object obj, SparseArray<Object> sparseArray) {
        this.$t = sparseArray;
        this.l0 = obj;
    }
}
