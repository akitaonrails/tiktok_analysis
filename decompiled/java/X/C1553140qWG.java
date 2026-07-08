package X;

import Y.ARunnableS98S0000000_23;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0qWG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1553140qWG {
    public static int LIZ;
    public static int LIZIZ;
    public static final RunnableC1553150qWH LIZJ = new Runnable() { // from class: X.0qWH
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("GeckoBlockHelper@3dae.<field>$1");
            try {
                int i = C1553140qWG.LIZIZ;
                if (i < 15) {
                    C1553140qWG.LIZIZ = i + 1;
                    C2280631EOn.LIZ.getClass();
                    long jLJIIJ = C13LZ.LJIIJ(AbstractC19994813Le.Default, new IntRange(5, 10)) * LSPassThroughRecordSizeConfig.DEFAULT;
                    C1553140qWG.LIZ(jLJIIJ);
                    C786410Ut5.LJLIIL(jLJIIJ + Mp4ScreenVideoLoadTimeout.CONTROL, C799570VYd.LIZIZ(), C1553140qWG.LIZJ);
                }
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("GeckoBlockHelper@3dae.<field>$1");
        }
    };

    public static void LIZ(long j) {
        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS98S0000000_23(14));
        C786410Ut5.LJLIIL(j, C799570VYd.LIZIZ(), new ARunnableS98S0000000_23(15));
    }
}
