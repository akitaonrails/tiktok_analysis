package X;

/* JADX INFO: renamed from: X.12nv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19864912nv<T> extends AbstractC19864712nt<T> {
    public static final C19864912nv LLILZIL = new C19864912nv(new Object[0]);
    public final T[] LLILLL;
    public final int LLILZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C19864912nv(Object[] objArr) {
        super(0, 0);
        this.LLILLL = objArr;
        this.LLILZ = 0;
    }

    @Override // X.AbstractC19864712nt
    public final T LIZ(int i) {
        return this.LLILLL[this.LLILZ + i];
    }
}
