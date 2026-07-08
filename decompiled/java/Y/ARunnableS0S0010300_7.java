package Y;

import X.C1440005kM;
import X.C1C7U;
import X.C468770IZv;

/* JADX INFO: loaded from: classes8.dex */
public class ARunnableS0S0010300_7 implements Runnable {
    public final int $t;
    public long j1;
    public long j2;
    public long j3;
    public boolean z0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS0S0010300_7 aRunnableS0S0010300_7) {
        boolean zLIZ;
        C1C7U.LIZ("LongPressWidget@f607.playWatchLaterAddedAnimation$1");
        try {
            if (aRunnableS0S0010300_7.z0) {
                C1440005kM.LIZ(new C468770IZv(Long.valueOf(aRunnableS0S0010300_7.j1), Long.valueOf(aRunnableS0S0010300_7.j2), Long.valueOf(aRunnableS0S0010300_7.j3), 0, 8));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LongPressWidget@f607.playWatchLaterAddedAnimation$1");
    }

    public static final void run$1(ARunnableS0S0010300_7 aRunnableS0S0010300_7) {
        boolean zLIZ;
        C1C7U.LIZ("LongPressWidget@f607.playWatchLaterAddedAnimation$2$1");
        try {
            if (aRunnableS0S0010300_7.z0) {
                C1440005kM.LIZ(new C468770IZv(Long.valueOf(aRunnableS0S0010300_7.j1), Long.valueOf(aRunnableS0S0010300_7.j2), Long.valueOf(aRunnableS0S0010300_7.j3), 0, 8));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LongPressWidget@f607.playWatchLaterAddedAnimation$2$1");
    }

    public ARunnableS0S0010300_7(boolean z, long j, long j2, long j3, int i) {
        this.$t = i;
        this.z0 = z;
        this.j1 = j;
        this.j2 = j2;
        this.j3 = j3;
    }
}
