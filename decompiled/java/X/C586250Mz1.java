package X;

import com.ss.android.ugc.aweme.ab.ResumeFeedConfig;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: renamed from: X.0Mz1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C586250Mz1 {
    public static final ResumeFeedConfig LIZ = new ResumeFeedConfig(0, Mp4ScreenVideoLoadTimeout.CONTROL, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C586260Mz2());

    public static ResumeFeedConfig LIZIZ() {
        return (ResumeFeedConfig) LIZIZ.getValue();
    }

    public static boolean LIZ(EnumC584490MwB enumC584490MwB) {
        if (LIZIZ().enable == 3) {
            return true;
        }
        int i = C584410Mw3.LIZ[enumC584490MwB.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (LIZIZ().enable == 2) {
                    return true;
                }
                return false;
            }
            throw new C1954807lC();
        }
        if (LIZIZ().enable == 1) {
            return true;
        }
        return false;
    }
}
