package X;

/* JADX INFO: renamed from: X.0T0Z, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T0Z implements Runnable {
    public final /* synthetic */ boolean LL;

    public C0T0Z(boolean z) {
        this.LL = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("MainTabGuidePreferences@b699.setHasSwipedUp$1");
        try {
            C740400T2o.LIZ().edit().putBoolean("hasSwipedUp", this.LL).apply();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MainTabGuidePreferences@b699.setHasSwipedUp$1");
    }
}
