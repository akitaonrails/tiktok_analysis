package Y;

import X.C1C7U;
import com.ss.android.ugc.aweme.series.feed.tab.feed.MiniDramaTabPreloadTask;

/* JADX INFO: loaded from: classes10.dex */
public class ARunnableS0S0101200_9 implements Runnable {
    public final int $t;
    public int i1;
    public long j2;
    public long j3;
    public Object l0;

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

    public static final void run$0(ARunnableS0S0101200_9 aRunnableS0S0101200_9) {
        boolean zLIZ;
        C1C7U.LIZ("MiniDramaTabPreloadTask@ba56.runFetchFeedAttempt$1");
        try {
            ((MiniDramaTabPreloadTask) aRunnableS0S0101200_9.l0).LJIL(aRunnableS0S0101200_9.i1 + 1, aRunnableS0S0101200_9.j2, aRunnableS0S0101200_9.j3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MiniDramaTabPreloadTask@ba56.runFetchFeedAttempt$1");
    }

    public static final void run$1(ARunnableS0S0101200_9 aRunnableS0S0101200_9) {
        boolean zLIZ;
        C1C7U.LIZ("MiniDramaTabPreloadTask@ba56.handleFetchAllSuccess$1");
        try {
            ((MiniDramaTabPreloadTask) aRunnableS0S0101200_9.l0).LJIL(aRunnableS0S0101200_9.i1 + 1, aRunnableS0S0101200_9.j2, aRunnableS0S0101200_9.j3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MiniDramaTabPreloadTask@ba56.handleFetchAllSuccess$1");
    }

    public static final void run$2(ARunnableS0S0101200_9 aRunnableS0S0101200_9) {
        boolean zLIZ;
        C1C7U.LIZ("MiniDramaTabPreloadTask@ba56.runFetchThreeColumnAttempt$1");
        try {
            ((MiniDramaTabPreloadTask) aRunnableS0S0101200_9.l0).LJIL(aRunnableS0S0101200_9.i1 + 1, aRunnableS0S0101200_9.j2, aRunnableS0S0101200_9.j3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MiniDramaTabPreloadTask@ba56.runFetchThreeColumnAttempt$1");
    }

    public ARunnableS0S0101200_9(MiniDramaTabPreloadTask miniDramaTabPreloadTask, long j, int i, long j2, int i2) {
        this.$t = i2;
        this.l0 = miniDramaTabPreloadTask;
        this.j2 = j;
        this.i1 = i;
        this.j3 = j2;
    }
}
