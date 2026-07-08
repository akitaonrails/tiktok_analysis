package Y;

import X.C1869890yl9;
import X.C1C7U;

/* JADX INFO: loaded from: classes29.dex */
public class ARunnableS18S1000000_28 implements Runnable {
    public final int $t;
    public String s0;

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

    public static final void run$0(ARunnableS18S1000000_28 aRunnableS18S1000000_28) {
        boolean zLIZ;
        C1C7U.LIZ("NewUserIntentionMarker@77.onGetAFMediaSource$1");
        try {
            C1869890yl9.LIZIZ(aRunnableS18S1000000_28.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NewUserIntentionMarker@77.onGetAFMediaSource$1");
    }

    public static final void run$1(ARunnableS18S1000000_28 aRunnableS18S1000000_28) {
        boolean zLIZ;
        C1C7U.LIZ("NewUserIntentionMarker@77.onGetLink$1");
        try {
            C1869890yl9.LIZJ(aRunnableS18S1000000_28.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NewUserIntentionMarker@77.onGetLink$1");
    }

    public static final void run$2(ARunnableS18S1000000_28 aRunnableS18S1000000_28) {
        boolean zLIZ;
        C1C7U.LIZ("NewUserIntentionMarker@77.onGetPaidAdsApi$1");
        try {
            C1869890yl9.LIZLLL(aRunnableS18S1000000_28.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NewUserIntentionMarker@77.onGetPaidAdsApi$1");
    }

    public ARunnableS18S1000000_28(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
