package X;

/* JADX INFO: renamed from: X.0kfn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class RunnableC1328410kfn implements Runnable {
    public final /* synthetic */ C1328400kfm LL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("JobScheduler@ce30.<init>$3");
        try {
            C1328400kfm c1328400kfm = this.LL;
            c1328400kfm.LIZ.execute(c1328400kfm.LIZJ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JobScheduler@ce30.<init>$3");
    }

    public RunnableC1328410kfn(C1328400kfm c1328400kfm) {
        this.LL = c1328400kfm;
    }
}
