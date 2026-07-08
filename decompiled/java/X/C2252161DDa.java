package X;

import com.ss.android.ugc.aweme.service.earlyfeedback.EarlyFeedbackButtonData;
import java.util.List;

/* JADX INFO: renamed from: X.1DDa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2252161DDa {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ() {
        EarlyFeedbackButtonData earlyFeedbackButtonData;
        if (C2252171DDb.LIZ && (earlyFeedbackButtonData = C21151317pv.LIZIZ().lowActive) != null) {
            return earlyFeedbackButtonData.correctedQuestionnaires;
        }
        C19250110St.LIZ.getClass();
        return C19250110St.LIZJ();
    }

    public static List LIZIZ() {
        EarlyFeedbackButtonData earlyFeedbackButtonDataLIZ;
        return (!C2252171DDb.LIZ || (earlyFeedbackButtonDataLIZ = C21151317pv.LIZ()) == null) ? C1DDV.LIZLLL() : earlyFeedbackButtonDataLIZ.correctedQuestionnaires;
    }
}
