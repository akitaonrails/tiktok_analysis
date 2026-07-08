package X;

/* JADX INFO: renamed from: X.19kj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21628719kj extends AbstractC21628819kk {
    public static final C21628719kj LLILLL;

    static {
        C21628719kj c21628719kj = new C21628719kj();
        LLILLL = c21628719kj;
        c21628719kj.setStackTrace(AbstractC21628819kk.LLILLJJLI);
    }

    public static C21628719kj getFormatInstance() {
        return AbstractC21628819kk.LL ? new C21628719kj() : LLILLL;
    }

    public C21628719kj() {
    }

    public C21628719kj(Throwable th) {
        super(th);
    }

    public static C21628719kj getFormatInstance(Throwable th) {
        if (AbstractC21628819kk.LL) {
            return new C21628719kj(th);
        }
        return LLILLL;
    }
}
