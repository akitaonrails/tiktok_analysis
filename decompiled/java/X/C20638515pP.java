package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.PersonalizedSurveyUI;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15pP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20638515pP {
    public static boolean LIZ(Aweme aweme) {
        String storeRegionUpperCase;
        if (aweme == null) {
            return false;
        }
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService == null || (storeRegionUpperCase = iAccountService.getStoreRegionUpperCase()) == null) {
            storeRegionUpperCase = "";
        }
        if (storeRegionUpperCase.length() == 0) {
            return false;
        }
        C19315910hZ.LIZ.getClass();
        if (!C15442062u.LJIIIIZZ("US", C19315910hZ.LJIIIIZZ).contains(storeRegionUpperCase)) {
            return true;
        }
        PersonalizedSurveyUI personalizedSurveyUI = aweme.getPersonalizedSurveyUI();
        if (personalizedSurveyUI == null) {
            return false;
        }
        return Intrinsics.LJFF(personalizedSurveyUI.showOptimizedButtonIcon, Boolean.TRUE);
    }

    public static boolean LIZIZ(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if ((LIZJ(aweme.getAid()) && C20639015pU.LIZ().isEnable) || C20638915pT.LIZ().isEnable) {
            return true;
        }
        return LIZ(aweme);
    }

    public static boolean LIZJ(String str) {
        String name;
        InterfaceC20639315pX interfaceC20639315pXLJ;
        IEarlyFeedbackService iEarlyFeedbackService = (IEarlyFeedbackService) PluggableExtentionKt.pluggableSpi$default(IEarlyFeedbackService.class, false, false, false, 14, null);
        if (iEarlyFeedbackService != null && (interfaceC20639315pXLJ = iEarlyFeedbackService.LJ(str)) != null) {
            name = interfaceC20639315pXLJ.getName();
        } else {
            name = null;
        }
        if (!Intrinsics.LJFF(name, "new_user") && !Intrinsics.LJFF(name, "low_active")) {
            return false;
        }
        return true;
    }
}
