package X;

/* JADX INFO: renamed from: X.0Uxs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractRunnableC789380Uxs implements Runnable {
    public boolean LL;

    public abstract void LIZ();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SimpleAction@989.run");
        try {
            if (!this.LL) {
                this.LL = true;
                LIZ();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SimpleAction@989.run");
    }
}
