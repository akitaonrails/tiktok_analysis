package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.14dA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20307814dA implements Iterator, C03W4 {
    public final int $t;
    public int i1;
    public Object l0;

    public static final void remove$0(C20307814dA c20307814dA) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final void remove$1(C20307814dA c20307814dA) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final void remove$2(C20307814dA c20307814dA) {
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
        }
    }

    public static final boolean hasNext$0(C20307814dA c20307814dA) {
        if (c20307814dA.i1 > 0) {
            return true;
        }
        return false;
    }

    public static final boolean hasNext$1(C20307814dA c20307814dA) {
        if (c20307814dA.i1 > 0) {
            return true;
        }
        return false;
    }

    public static final boolean hasNext$2(C20307814dA c20307814dA) {
        if (c20307814dA.i1 < ((C1119470fEn) c20307814dA.l0).LJII()) {
            return true;
        }
        return false;
    }

    public static final Object next$0(C20307814dA c20307814dA) {
        InterfaceC19983313Gt interfaceC19983313Gt = (InterfaceC19983313Gt) c20307814dA.l0;
        int iLJ = interfaceC19983313Gt.LJ();
        int i = c20307814dA.i1;
        c20307814dA.i1 = i - 1;
        return interfaceC19983313Gt.LJIIIIZZ(iLJ - i);
    }

    public static final Object next$1(C20307814dA c20307814dA) {
        InterfaceC19983313Gt interfaceC19983313Gt = (InterfaceC19983313Gt) c20307814dA.l0;
        int iLJ = interfaceC19983313Gt.LJ();
        int i = c20307814dA.i1;
        c20307814dA.i1 = i - 1;
        return interfaceC19983313Gt.LIZJ(iLJ - i);
    }

    public static final Object next$2(C20307814dA c20307814dA) {
        C1119470fEn c1119470fEn = (C1119470fEn) c20307814dA.l0;
        int i = c20307814dA.i1;
        c20307814dA.i1 = i + 1;
        return c1119470fEn.LJIIIIZZ(i);
    }

    public C20307814dA(InterfaceC19983313Gt interfaceC19983313Gt, int i) {
        this.$t = i;
        this.l0 = interfaceC19983313Gt;
        this.i1 = interfaceC19983313Gt.LJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20307814dA(C1119470fEn c1119470fEn, C1119470fEn<Object> c1119470fEn2) {
        this.$t = c1119470fEn2;
        this.l0 = c1119470fEn;
    }
}
