package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.service.earlyfeedback.EarlyFeedbackButtonData;
import java.util.List;

/* JADX INFO: renamed from: X.1DDV, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DDV {
    public static final EarlyFeedbackButtonData LIZ = new EarlyFeedbackButtonData(0, false, 0.0d, -1, -1, -1, -1, 0, Integer.MAX_VALUE, -1, null, null, -1, -1, 0);
    public static EarlyFeedbackButtonData LIZIZ;

    static {
        Keva.getRepo("EarlyFeedbackExperiment");
        LIZIZ = new EarlyFeedbackButtonData(0, false, 0.0d, -1, -1L, -1L, -1, 0, Integer.MAX_VALUE, -1, null, null, -1L, -1L, 0L);
    }

    public static EarlyFeedbackButtonData LIZIZ() {
        EarlyFeedbackButtonData earlyFeedbackButtonData = LIZIZ;
        if (earlyFeedbackButtonData.abGroup > 0) {
            return earlyFeedbackButtonData;
        }
        EarlyFeedbackButtonData earlyFeedbackButtonData2 = (EarlyFeedbackButtonData) C0C64.LJIILLIIL().LJJII(EarlyFeedbackButtonData.class, LIZ, "early_feedback", false);
        if (earlyFeedbackButtonData2 == null) {
            earlyFeedbackButtonData2 = new EarlyFeedbackButtonData(0, false, 0.0d, -1, -1L, -1L, -1, 0, Integer.MAX_VALUE, -1, null, null, -1L, -1L, 0L);
        }
        LIZIZ = earlyFeedbackButtonData2;
        return earlyFeedbackButtonData2;
    }

    public static long LIZ() {
        long j = LIZIZ().displayDelaySec;
        if (j < 0) {
            j = 0;
        }
        return j * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public static int LIZJ() {
        return LIZIZ().minVvInterval;
    }

    public static List LIZLLL() {
        return LIZIZ().questionnaires;
    }
}
