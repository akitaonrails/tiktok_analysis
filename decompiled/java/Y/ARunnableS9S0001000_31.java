package Y;

import X.C1B7N;
import X.C1C7U;
import X.C204585153n;

/* JADX INFO: loaded from: classes32.dex */
public class ARunnableS9S0001000_31 implements Runnable {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f289i0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS9S0001000_31 aRunnableS9S0001000_31) {
        boolean zLIZ;
        C1C7U.LIZ("AbsDownloadEngine@9f1b.clearDownloadData$1");
        try {
            C1B7N.LIZ().cancelNotification(aRunnableS9S0001000_31.f289i0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbsDownloadEngine@9f1b.clearDownloadData$1");
    }

    public static final void run$1(ARunnableS9S0001000_31 aRunnableS9S0001000_31) {
        boolean zLIZ;
        C1C7U.LIZ("AbsDownloadEngine@9f1b.resetDownloadData$1");
        try {
            C1B7N.LIZ().cancelNotification(aRunnableS9S0001000_31.f289i0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbsDownloadEngine@9f1b.resetDownloadData$1");
    }

    public static final void run$2(ARunnableS9S0001000_31 aRunnableS9S0001000_31) {
        boolean zLIZ;
        C1C7U.LIZ("LiveOhrService@5f09.retryRegisterOHRServiceObserver$1");
        try {
            C204585153n.LJ(C204585153n.LIZ, aRunnableS9S0001000_31.f289i0 - 1, 2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveOhrService@5f09.retryRegisterOHRServiceObserver$1");
    }

    public ARunnableS9S0001000_31(int i, int i2) {
        this.$t = i2;
        this.f289i0 = i;
    }
}
