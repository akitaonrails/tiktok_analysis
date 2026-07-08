package Y;

import X.C1C7U;
import X.C1DDW;
import X.C1DDX;
import X.C20018813Uk;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes36.dex */
public class ARunnableS5S0010000_35 implements Runnable {
    public final int $t;
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

    public static final void run$0(ARunnableS5S0010000_35 aRunnableS5S0010000_35) {
        boolean zLIZ;
        C1C7U.LIZ("LowActiveSurveyInvestigator@6bb4.persistFeedbackUIRecords$1");
        try {
            if (aRunnableS5S0010000_35.z0) {
                C1DDX c1ddx = C1DDX.LIZ;
                C1DDX.LJFF().storeBoolean("disable_feature_low_active", true);
                C20018813Uk.LIZ.getClass();
                C20018813Uk.LIZ().erase("vv_records_set");
                ((LinkedHashMap) C1DDX.LIZJ).clear();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LowActiveSurveyInvestigator@6bb4.persistFeedbackUIRecords$1");
    }

    public static final void run$1(ARunnableS5S0010000_35 aRunnableS5S0010000_35) {
        boolean zLIZ;
        C1C7U.LIZ("NewUserSurveyInvestigator@3072.persistFeedbackUIRecords$1");
        try {
            if (aRunnableS5S0010000_35.z0) {
                C1DDW c1ddw = C1DDW.LIZ;
                C1DDW.LJFF().storeBoolean("disable_feature", true);
                C20018813Uk.LIZ.getClass();
                C20018813Uk.LIZ().erase("vv_records_set");
                ((LinkedHashMap) C1DDW.LIZLLL).clear();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NewUserSurveyInvestigator@3072.persistFeedbackUIRecords$1");
    }

    public ARunnableS5S0010000_35(boolean z, int i) {
        this.$t = i;
        this.z0 = z;
    }
}
