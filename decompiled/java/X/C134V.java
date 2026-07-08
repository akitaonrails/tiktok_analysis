package X;

/* JADX INFO: renamed from: X.134V, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C134V {
    public static final C134V LIZIZ = new C134V(new Throwable() { // from class: X.134W
        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    });
    public final Throwable LIZ;

    public C134V(Throwable th) {
        boolean z = C134M.LLILZ;
        th.getClass();
        this.LIZ = th;
    }
}
