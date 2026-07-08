package X;

/* JADX INFO: renamed from: X.12rK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19886012rK<E> extends AbstractC19885712rH<E> {
    public static final C19886012rK LLILZIL = new C19886012rK(0, new Object[0]);
    public final transient Object[] LLILLL;
    public final transient int LLILZ;

    @Override // X.AbstractC19885812rI
    public final Object[] LIZJ() {
        return this.LLILLL;
    }

    @Override // X.AbstractC19885812rI
    public final int LJ() {
        return 0;
    }

    @Override // X.AbstractC19885812rI
    public final int LJFF() {
        return this.LLILZ;
    }

    @Override // X.AbstractC19885812rI
    public final boolean LJIIIIZZ() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LLILZ;
    }

    @Override // X.AbstractC19885712rH, X.AbstractC19885812rI
    public final void LJIIIZ(Object[] objArr) {
        System.arraycopy(this.LLILLL, 0, objArr, 0, this.LLILZ);
    }

    @Override // java.util.List
    public final E get(int i) {
        C19863612ni.LIZ(i, this.LLILZ);
        return (E) this.LLILLL[i];
    }

    public C19886012rK(int i, Object[] objArr) {
        this.LLILLL = objArr;
        this.LLILZ = i;
    }
}
