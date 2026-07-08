package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.service.earlyfeedback.EarlyFeedbackButtonData;
import java.util.List;

/* JADX INFO: renamed from: X.10St, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19250110St {
    public static final C19250110St LIZ = new C19250110St();
    public static final EarlyFeedbackButtonData LIZIZ = new EarlyFeedbackButtonData(0, false, 0.0d, -1, -1, -1, -1, 0, Integer.MAX_VALUE, -1, null, null, -1, -1, 0);

    public static EarlyFeedbackButtonData LIZ() {
        EarlyFeedbackButtonData earlyFeedbackButtonData = (EarlyFeedbackButtonData) C0C64.LJIILLIIL().LJJII(EarlyFeedbackButtonData.class, LIZIZ, "low_active_survey", false);
        return earlyFeedbackButtonData == null ? new EarlyFeedbackButtonData(0, false, 0.0d, -1, -1L, -1L, -1, 0, Integer.MAX_VALUE, -1, null, null, -1L, -1L, 0L) : earlyFeedbackButtonData;
    }

    public static int LIZIZ() {
        return LIZ().minVvInterval;
    }

    public static List LIZJ() {
        return LIZ().questionnaires;
    }

    public static boolean LIZLLL() {
        IPluginService.PluginDataWrapper value;
        IPluginService.LowActiveUserSurveyData lowActiveUserSurveyData;
        Boolean bool;
        C0TA0 currentPluginData = ((IPluginService) ServiceManager.get().getService(IPluginService.class)).getCurrentPluginData(EnumC19241510Pl.LOW_ACTIVE_SURVEY);
        return (currentPluginData == null || (value = currentPluginData.getValue()) == null || (lowActiveUserSurveyData = value.lowActiveUserSurveyData) == null || (bool = lowActiveUserSurveyData.isUserLowActive) == null || !bool.booleanValue() || LIZ().abGroup <= 0 || !LIZ().isEnable) ? false : true;
    }
}
