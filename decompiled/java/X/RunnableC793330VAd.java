package X;

/* JADX INFO: renamed from: X.0VAd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class RunnableC793330VAd implements Runnable {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ AbstractC793300VAa LLILLL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("AbsBatteryTimeStats@d6d8.record$1");
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z = this.LL;
            C0VAY.LIZ.LIZJ(new C793390VAj(jCurrentTimeMillis, this.LLILLJJLI, this.LLILLL.LIZ, z));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbsBatteryTimeStats@d6d8.record$1");
    }

    public RunnableC793330VAd(AbstractC793300VAa abstractC793300VAa, boolean z, long j) {
        this.LLILLL = abstractC793300VAa;
        this.LL = z;
        this.LLILLJJLI = j;
    }
}
