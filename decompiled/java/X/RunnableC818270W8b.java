package X;

/* JADX INFO: renamed from: X.0W8b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class RunnableC818270W8b implements Runnable {
    public static final RunnableC818270W8b LL = new RunnableC818270W8b();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PushInitTracker@f306.startUpdateTimeoutTimer$2");
        try {
            if (!C818260W8a.LJIIIIZZ) {
                C818260W8a c818260W8a = C818260W8a.LIZ;
                C818260W8a.LJI("Timeout reached (5 minutes), forcing report even if not all steps are completed", EnumC809870Vpp.UPDATE, EnumC818290W8d.WARNING);
                c818260W8a.LJFF();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PushInitTracker@f306.startUpdateTimeoutTimer$2");
    }
}
