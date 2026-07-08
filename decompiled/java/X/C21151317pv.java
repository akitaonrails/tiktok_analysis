package X;

import com.ss.android.ugc.aweme.service.earlyfeedback.EarlyFeedbackButtonData;
import com.ss.android.ugc.aweme.service.earlyfeedback.EarlyFeedbackUnifiedData;
import com.ss.android.ugc.aweme.service.earlyfeedback.QuestionnaireData;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.17pv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21151317pv {
    public static final List<QuestionnaireData> LIZ;
    public static final List<QuestionnaireData> LIZIZ;
    public static final EarlyFeedbackUnifiedData LIZJ;

    static {
        List<QuestionnaireData> listLJIIJJI = C1697810uHb.LJIIJJI(new QuestionnaireData("interest", 5), new QuestionnaireData("useful", 5));
        LIZ = listLJIIJJI;
        List<QuestionnaireData> listSingletonList = Collections.singletonList(new QuestionnaireData("useful", 0));
        LIZIZ = listSingletonList;
        LIZJ = new EarlyFeedbackUnifiedData(new EarlyFeedbackButtonData(1, true, 0.1d, 200, 0L, 24L, -1, 7, 7, -1, null, listLJIIJJI, -1L, -1L, 0L), new EarlyFeedbackButtonData(1, true, 0.1d, -1, -1L, -1L, -1, 7, 7, -1, null, listLJIIJJI, -1L, -1L, 0L), new EarlyFeedbackButtonData(0, true, 0.1d, -1, -1L, -1L, -1, 0, 3, -1, null, listSingletonList, 259200L, 86400L, 0L));
    }

    public static EarlyFeedbackButtonData LIZ() {
        return LIZIZ().dnu;
    }

    public static EarlyFeedbackUnifiedData LIZIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        EarlyFeedbackUnifiedData earlyFeedbackUnifiedData = LIZJ;
        EarlyFeedbackUnifiedData earlyFeedbackUnifiedData2 = (EarlyFeedbackUnifiedData) c0c64LJIILLIIL.LJJII(EarlyFeedbackUnifiedData.class, earlyFeedbackUnifiedData, "early_feedback_unified", false);
        return earlyFeedbackUnifiedData2 != null ? earlyFeedbackUnifiedData2 : earlyFeedbackUnifiedData;
    }
}
