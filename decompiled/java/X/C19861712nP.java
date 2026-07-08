package X;

/* JADX INFO: renamed from: X.12nP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19861712nP extends AbstractC19861312nL {
    public static final C19861712nP LLILZIL = new C19861712nP(0, new Object[0]);
    public final transient Object[] LLILLL;
    public final transient int LLILZ;

    @Override // X.AbstractC19861612nO
    public final int LJ() {
        return this.LLILZ;
    }

    @Override // X.AbstractC19861612nO
    public final int LJFF() {
        return 0;
    }

    @Override // X.AbstractC19861612nO
    public final Object[] LJIIIIZZ() {
        return this.LLILLL;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LLILZ;
    }

    @Override // X.AbstractC19861312nL, X.AbstractC19861612nO
    public final int LIZJ(Object[] objArr) {
        System.arraycopy(this.LLILLL, 0, objArr, 0, this.LLILZ);
        return this.LLILZ;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C19862312nV.LIZ(i, this.LLILZ);
        Object obj = this.LLILLL[i];
        obj.getClass();
        return obj;
    }

    public C19861712nP(int i, Object[] objArr) {
        this.LLILLL = objArr;
        this.LLILZ = i;
    }
}
