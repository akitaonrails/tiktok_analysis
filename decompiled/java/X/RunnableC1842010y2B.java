package X;

/* JADX INFO: renamed from: X.0y2B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class RunnableC1842010y2B implements Runnable {
    public final /* synthetic */ C2197471AzR LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    public RunnableC1842010y2B(C2197471AzR c2197471AzR, String str, long j) {
        this.LL = c2197471AzR;
        this.LLILLJJLI = str;
        this.LLILLL = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("MinisRechargeBeanTask@c3fd.postQueryOrderTask$1");
        try {
            this.LL.LJIIJJI(this.LLILLL, this.LLILLJJLI);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisRechargeBeanTask@c3fd.postQueryOrderTask$1");
    }
}
