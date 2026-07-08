package X;

import com.ss.android.ugc.aweme.feed.ab.PromptConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14ag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20292414ag {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C20292914al());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C20292714aj());

    public static PromptConfig LIZ() {
        return (PromptConfig) LIZ.getValue();
    }

    public static boolean LIZIZ(Aweme aweme) {
        String str;
        String str2;
        List<SurveyInfo> surveyInfos;
        SurveyInfo surveyInfo;
        String str3 = null;
        if (aweme != null && (surveyInfos = aweme.getSurveyInfos()) != null && (surveyInfo = (SurveyInfo) C13LP.LJJJLL(surveyInfos)) != null) {
            str = surveyInfo.surveyKey;
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            return false;
        }
        PromptConfig promptConfigLIZ = LIZ();
        if (promptConfigLIZ != null) {
            str2 = promptConfigLIZ.negativeFeedbackKey;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str, str2)) {
            return true;
        }
        PromptConfig promptConfigLIZ2 = LIZ();
        if (promptConfigLIZ2 != null) {
            str3 = promptConfigLIZ2.positiveFeedbackKey;
        }
        if (Intrinsics.LJFF(str, str3)) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(String str) {
        String str2;
        if (str == null || str.length() == 0) {
            return false;
        }
        PromptConfig promptConfigLIZ = LIZ();
        String str3 = null;
        if (promptConfigLIZ != null) {
            str2 = promptConfigLIZ.negativeFeedbackKey;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str, str2)) {
            return true;
        }
        PromptConfig promptConfigLIZ2 = LIZ();
        if (promptConfigLIZ2 != null) {
            str3 = promptConfigLIZ2.positiveFeedbackKey;
        }
        if (Intrinsics.LJFF(str, str3)) {
            return true;
        }
        return false;
    }
}
