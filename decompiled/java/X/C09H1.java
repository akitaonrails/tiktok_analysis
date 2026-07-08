package X;

/* JADX INFO: renamed from: X.09H1, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C09H1 {
    public int LIZ;
    public final C09H0 LIZIZ;

    public abstract void LIZ();

    public abstract void LIZIZ();

    /* JADX WARN: Type inference failed for: r0v1, types: [X.09H0] */
    public C09H1() {
        this.LIZ = 30000;
        this.LIZIZ = new Runnable() { // from class: X.09H0
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LifeCycleMonitor$NetworkAppStateListener@9c57.<field>$1");
                try {
                    if (C2345509Gz.LLILLJJLI) {
                        C2345509Gz.LLILLJJLI = false;
                        this.LL.LIZ();
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LifeCycleMonitor$NetworkAppStateListener@9c57.<field>$1");
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.09H0] */
    public C09H1(int i) {
        this.LIZIZ = new Runnable() { // from class: X.09H0
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LifeCycleMonitor$NetworkAppStateListener@9c57.<field>$1");
                try {
                    if (C2345509Gz.LLILLJJLI) {
                        C2345509Gz.LLILLJJLI = false;
                        this.LL.LIZ();
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LifeCycleMonitor$NetworkAppStateListener@9c57.<field>$1");
            }
        };
        this.LIZ = 30000;
    }
}
