package X;

/* JADX INFO: renamed from: X.0URg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class RunnableC772300URg implements Runnable {
    public static final RunnableC772300URg LL = new RunnableC772300URg();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("BroadcastResourceOptManager@4124.safetyStopRunnable$1");
        try {
            if (C772530USd.LIZ) {
                C20441214yg.LIZIZ("BroadcastResOpt", "safety timeout reached, force stopOpt");
                C772530USd.LJII();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BroadcastResourceOptManager@4124.safetyStopRunnable$1");
    }
}
