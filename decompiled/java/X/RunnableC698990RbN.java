package X;

/* JADX INFO: renamed from: X.0RbN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC698990RbN implements Runnable {
    public final /* synthetic */ C698980RbM LL;

    public RunnableC698990RbN(C698980RbM c698980RbM) {
        this.LL = c698980RbM;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("CallNodeProcessor@2ae0.callbackRunnable$1");
        try {
            C698980RbM c698980RbM = this.LL;
            c698980RbM.LIZ.Bb(c698980RbM.LIZLLL);
            this.LL.LIZIZ().clear();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CallNodeProcessor@2ae0.callbackRunnable$1");
    }
}
