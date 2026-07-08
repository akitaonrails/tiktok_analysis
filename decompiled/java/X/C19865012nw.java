package X;

import java.util.Objects;

/* JADX INFO: renamed from: X.12nw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19865012nw<E> extends AbstractC19875512pd<E> {
    public static final C19865012nw LLILZIL = new C19865012nw(0, new Object[0]);
    public final transient Object[] LLILLL;
    public final transient int LLILZ;

    @Override // X.AbstractC19875812pg
    public final int LJIIIIZZ() {
        return 0;
    }

    @Override // X.AbstractC19875812pg
    public final boolean LJIIIZ() {
        return false;
    }

    @Override // X.AbstractC19875812pg
    public final Object[] LJ() {
        return this.LLILLL;
    }

    @Override // X.AbstractC19875812pg
    public final int LJFF() {
        return this.LLILZ;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LLILZ;
    }

    @Override // java.util.List
    public final E get(int i) {
        C19864312np.LJFF(i, this.LLILZ);
        E e = (E) this.LLILLL[i];
        Objects.requireNonNull(e);
        return e;
    }

    public C19865012nw(int i, Object[] objArr) {
        this.LLILLL = objArr;
        this.LLILZ = i;
    }

    @Override // X.AbstractC19875512pd, X.AbstractC19875812pg
    public final int LIZJ(int i, Object[] objArr) {
        System.arraycopy(this.LLILLL, 0, objArr, i, this.LLILZ);
        return i + this.LLILZ;
    }
}
