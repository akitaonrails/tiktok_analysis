package Y;

import X.C1C7U;
import com.ss.android.ugc.aweme.hangout.component.livecard.view.PlayCardFeedCellV2;

/* JADX INFO: loaded from: classes8.dex */
public class ARunnableS1S0120000_7 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;
    public boolean z2;

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

    public static final void run$0(ARunnableS1S0120000_7 aRunnableS1S0120000_7) {
        boolean zLIZ;
        C1C7U.LIZ("PlayCardFeedCellV2@6bc1.updatePlusJoinContainer$1");
        try {
            ((PlayCardFeedCellV2) aRunnableS1S0120000_7.l0).u6(aRunnableS1S0120000_7.z1, aRunnableS1S0120000_7.z2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PlayCardFeedCellV2@6bc1.updatePlusJoinContainer$1");
    }

    public static final void run$1(ARunnableS1S0120000_7 aRunnableS1S0120000_7) {
        boolean zLIZ;
        C1C7U.LIZ("PlayCardFeedCellV2@6bc1.updatePlusJoinContainer$2");
        try {
            ((PlayCardFeedCellV2) aRunnableS1S0120000_7.l0).u6(aRunnableS1S0120000_7.z1, aRunnableS1S0120000_7.z2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PlayCardFeedCellV2@6bc1.updatePlusJoinContainer$2");
    }

    public ARunnableS1S0120000_7(PlayCardFeedCellV2 playCardFeedCellV2, boolean z, boolean z2, int i) {
        this.$t = i;
        this.l0 = playCardFeedCellV2;
        this.z1 = z;
        this.z2 = z2;
    }
}
