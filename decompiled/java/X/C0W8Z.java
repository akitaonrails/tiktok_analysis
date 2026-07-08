package X;

/* JADX INFO: renamed from: X.0W8Z, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W8Z implements Runnable {
    public static final C0W8Z LL = new C0W8Z();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PushInitTracker@f306.startInitTimeoutTimer$2");
        try {
            if (!C818260W8a.LJII) {
                C818260W8a c818260W8a = C818260W8a.LIZ;
                C818260W8a.LJI("Timeout reached (1 minutes), forcing report even if not all steps are completed", EnumC809870Vpp.INIT, EnumC818290W8d.WARNING);
                c818260W8a.LJ();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PushInitTracker@f306.startInitTimeoutTimer$2");
    }
}
