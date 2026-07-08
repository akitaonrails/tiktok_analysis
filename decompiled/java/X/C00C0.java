package X;

/* JADX INFO: renamed from: X.00C0, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00C0<T> {
    public final T LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public C00C0() {
        this(0, null, null, 7);
    }

    public C00C0(int i, String str, Object obj, int i2) {
        obj = (i2 & 1) != 0 ? (T) null : obj;
        i = (i2 & 2) != 0 ? -1 : i;
        str = (i2 & 4) != 0 ? "" : str;
        this.LIZ = (T) obj;
        this.LIZIZ = i;
        this.LIZJ = str;
    }
}
