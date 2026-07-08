package X;

/* JADX INFO: renamed from: X.0MD2, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MD2 extends RuntimeException {
    public static final int $stable = 8;
    public final int LL;
    public final Throwable LLILLJJLI;

    public final int getErrorCode() {
        return this.LL;
    }

    public final Throwable getRoot() {
        return this.LLILLJJLI;
    }

    public C0MD2(int i, Throwable th) {
        super(th);
        this.LL = i;
        this.LLILLJJLI = th;
    }
}
