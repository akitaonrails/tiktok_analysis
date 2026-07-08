package X;

/* JADX INFO: renamed from: X.16DI, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16DI extends Exception {
    public static final long serialVersionUID = 3731842424390998726L;
    public final int LL;

    public int getCloseCode() {
        return this.LL;
    }

    public C16DI(int i) {
        this.LL = i;
    }

    public C16DI(int i, String str) {
        super(str);
        this.LL = i;
    }

    public C16DI(int i, Throwable th) {
        super(th);
        this.LL = i;
    }

    public C16DI(int i, String str, Throwable th) {
        super(str, th);
        this.LL = i;
    }
}
