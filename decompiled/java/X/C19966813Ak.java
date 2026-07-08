package X;

/* JADX INFO: renamed from: X.13Ak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19966813Ak extends AbstractC19966113Ad {
    public static final C19966813Ak LLILZIL = new C19966813Ak(0, new Object[0]);
    public final transient Object[] LLILLL;
    public final transient int LLILZ;

    @Override // X.AbstractC19966513Ah
    public final int LJ() {
        return this.LLILZ;
    }

    @Override // X.AbstractC19966513Ah
    public final int LJFF() {
        return 0;
    }

    @Override // X.AbstractC19966513Ah
    public final Object[] LJIIIIZZ() {
        return this.LLILLL;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LLILZ;
    }

    @Override // X.AbstractC19966113Ad, X.AbstractC19966513Ah
    public final void LIZJ(Object[] objArr) {
        System.arraycopy(this.LLILLL, 0, objArr, 0, this.LLILZ);
    }

    @Override // java.util.List
    public final Object get(int i) {
        C19863712nj.LIZ(i, this.LLILZ);
        Object obj = this.LLILLL[i];
        obj.getClass();
        return obj;
    }

    public C19966813Ak(int i, Object[] objArr) {
        this.LLILLL = objArr;
        this.LLILZ = i;
    }
}
