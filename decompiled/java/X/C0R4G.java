package X;

import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0R4G, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0R4G implements Iterator, C03W4 {
    public final int $t;
    public int i1;
    public Object l0;

    public static final void remove$0(C0R4G c0r4g) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final void remove$1(C0R4G c0r4g) {
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

    public static final boolean hasNext$0(C0R4G c0r4g) {
        if (c0r4g.i1 < ((ViewGroup) c0r4g.l0).getChildCount()) {
            return true;
        }
        return false;
    }

    public static final boolean hasNext$1(C0R4G c0r4g) {
        if (c0r4g.i1 < ((ViewGroup) c0r4g.l0).getChildCount()) {
            return true;
        }
        return false;
    }

    public static final Object next$0(C0R4G c0r4g) {
        ViewGroup viewGroup = (ViewGroup) c0r4g.l0;
        int i = c0r4g.i1;
        c0r4g.i1 = i + 1;
        return viewGroup.getChildAt(i);
    }

    public static final Object next$1(C0R4G c0r4g) {
        ViewGroup viewGroup = (ViewGroup) c0r4g.l0;
        int i = c0r4g.i1;
        c0r4g.i1 = i + 1;
        return viewGroup.getChildAt(i);
    }

    public C0R4G(ViewGroup viewGroup, int i) {
        this.$t = i;
        this.l0 = viewGroup;
    }
}
