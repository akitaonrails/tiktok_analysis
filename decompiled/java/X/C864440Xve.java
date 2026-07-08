package X;

/* JADX INFO: renamed from: X.0Xve, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C864440Xve implements InterfaceC864170XvD {
    public final C0Y8T LIZ;
    public final C0YMW LIZIZ;
    public final C867350Y0v LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C864440Xve() {
        this((C0YMW) null, (C867350Y0v) (0 == true ? 1 : 0), 7);
    }

    @Override // X.InterfaceC864170XvD
    public final boolean isCompleted() {
        C0Y8K c0y8k;
        if (this.LIZ == null) {
            C0YMW c0ymw = this.LIZIZ;
            if (c0ymw == null) {
                return false;
            }
            Throwable throwable = c0ymw.getThrowable();
            if ((throwable instanceof C0Y8K) && (c0y8k = (C0Y8K) throwable) != null && c0y8k.isRecoverableFailure()) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ C864440Xve(C0YMW c0ymw, C867350Y0v c867350Y0v, int i) {
        this((C0Y8T) null, (i & 2) != 0 ? null : c0ymw, (i & 4) != 0 ? null : c867350Y0v);
    }

    public C864440Xve(C0Y8T c0y8t, C0YMW c0ymw, C867350Y0v c867350Y0v) {
        this.LIZ = c0y8t;
        this.LIZIZ = c0ymw;
        this.LIZJ = c867350Y0v;
    }
}
