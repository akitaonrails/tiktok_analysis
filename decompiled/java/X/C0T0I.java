package X;

/* JADX INFO: renamed from: X.0T0I, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T0I implements Runnable {
    public static final C0T0I LL = new C0T0I();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ShareGuideHelper@3518.countDownRunnable$1");
        try {
            C0T0J c0t0j = C1251170ifD.LJIIIIZZ;
            if (c0t0j != null) {
                C1251170ifD.LIZ.getClass();
                C1251170ifD.LJII.removeCallbacks(C1251170ifD.LJIIIZ);
                C1251170ifD.LJI = null;
                C1251170ifD.LJFF = null;
                c0t0j.call();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShareGuideHelper@3518.countDownRunnable$1");
    }
}
