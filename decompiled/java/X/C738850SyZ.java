package X;

import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0SyZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C738850SyZ implements Iterator, C03W4 {
    public final int $t;
    public int i1;
    public Object l0;

    public static final void remove$0(C738850SyZ c738850SyZ) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final void remove$1(C738850SyZ c738850SyZ) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final void remove$2(C738850SyZ c738850SyZ) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final void remove$3(C738850SyZ c738850SyZ) {
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
        }
    }

    public static final boolean hasNext$0(C738850SyZ c738850SyZ) {
        if (c738850SyZ.i1 < ((ViewGroup) c738850SyZ.l0).getChildCount()) {
            return true;
        }
        return false;
    }

    public static final boolean hasNext$1(C738850SyZ c738850SyZ) {
        if (c738850SyZ.i1 < ((ViewGroup) c738850SyZ.l0).getChildCount()) {
            return true;
        }
        return false;
    }

    public static final boolean hasNext$2(C738850SyZ c738850SyZ) {
        if (c738850SyZ.i1 < ((ViewGroup) c738850SyZ.l0).getChildCount()) {
            return true;
        }
        return false;
    }

    public static final boolean hasNext$3(C738850SyZ c738850SyZ) {
        if (c738850SyZ.i1 < ((ViewGroup) c738850SyZ.l0).getChildCount()) {
            return true;
        }
        return false;
    }

    public static final Object next$0(C738850SyZ c738850SyZ) {
        ViewGroup viewGroup = (ViewGroup) c738850SyZ.l0;
        int i = c738850SyZ.i1;
        c738850SyZ.i1 = i + 1;
        return viewGroup.getChildAt(i);
    }

    public static final Object next$1(C738850SyZ c738850SyZ) {
        ViewGroup viewGroup = (ViewGroup) c738850SyZ.l0;
        int i = c738850SyZ.i1;
        c738850SyZ.i1 = i + 1;
        return viewGroup.getChildAt(i);
    }

    public static final Object next$2(C738850SyZ c738850SyZ) {
        ViewGroup viewGroup = (ViewGroup) c738850SyZ.l0;
        int i = c738850SyZ.i1;
        c738850SyZ.i1 = i + 1;
        return viewGroup.getChildAt(i);
    }

    public static final Object next$3(C738850SyZ c738850SyZ) {
        ViewGroup viewGroup = (ViewGroup) c738850SyZ.l0;
        int i = c738850SyZ.i1;
        c738850SyZ.i1 = i + 1;
        return viewGroup.getChildAt(i);
    }

    public C738850SyZ(ViewGroup viewGroup, int i) {
        this.$t = i;
        this.l0 = viewGroup;
    }
}
