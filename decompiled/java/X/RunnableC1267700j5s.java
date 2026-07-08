package X;

/* JADX INFO: renamed from: X.0j5s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class RunnableC1267700j5s implements Runnable {
    public final InterfaceC1268640j7O LL;
    public volatile boolean LLILLJJLI;
    public volatile long LLILLL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("EffectSequenceCacheController$RefreshSequenceCacheRunnable@2295.run");
        try {
            this.LL.configSequenceCache(this.LLILLL);
            this.LL.refreshSequenceCacheStatus(this.LLILLJJLI);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EffectSequenceCacheController$RefreshSequenceCacheRunnable@2295.run");
    }

    public RunnableC1267700j5s(InterfaceC1268640j7O interfaceC1268640j7O) {
        this.LL = interfaceC1268640j7O;
    }
}
