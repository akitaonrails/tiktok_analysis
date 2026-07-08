package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.business.search.feedback.QuestionData;
import com.ss.android.ugc.aweme.compliance.business.search.feedback.SearchAidFeedbackFragment;
import com.ss.android.ugc.aweme.compliance.business.search.feedback.SurveyConfig;
import com.ss.android.ugc.aweme.compliance.business.search.feedback.UserSurveyConfigDetail;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TUk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C747640TUk extends C09AY implements Function1<UserSurveyConfigDetail, Unit> {
    public final /* synthetic */ DialogC1389620mGW LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ FragmentManager LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C747640TUk(DialogC1389620mGW dialogC1389620mGW, C19EG c19eg, String str, String str2, String str3, int i, FragmentManager fragmentManager) {
        super(1);
        this.LL = dialogC1389620mGW;
        this.LLILLJJLI = c19eg;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = i;
        this.LLIZ = fragmentManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UserSurveyConfigDetail userSurveyConfigDetail) {
        String str;
        UserSurveyConfigDetail userSurveyConfigDetail2 = userSurveyConfigDetail;
        C786410Ut5.LJIIJ(this.LL);
        if (!userSurveyConfigDetail2.surveyConfig.isEmpty() && !((SurveyConfig) ListProtector.get(userSurveyConfigDetail2.surveyConfig, 0)).questionData.isEmpty()) {
            String str2 = this.LLILLL;
            int i = userSurveyConfigDetail2.sceneType;
            String str3 = ((SurveyConfig) ListProtector.get(userSurveyConfigDetail2.surveyConfig, 0)).surveyConfigId;
            String str4 = this.LLILZ;
            String str5 = this.LLILZIL;
            int i2 = this.LLILZLL;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        str = "unknown";
                    } else {
                        str = "search_guide_detail_page";
                    }
                } else {
                    str = "search_guide";
                }
            } else {
                str = "search_aid";
            }
            QuestionData questionData = (QuestionData) ListProtector.get(((SurveyConfig) ListProtector.get(userSurveyConfigDetail2.surveyConfig, 0)).questionData, 0);
            SearchAidFeedbackFragment searchAidFeedbackFragment = new SearchAidFeedbackFragment();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("search_id", str2, bundle);
            bundle.putInt("scene_type", i);
            C786410Ut5.LJJJI("survey_config_id", str3, bundle);
            C786410Ut5.LJJIZ(bundle, "question_data", questionData);
            C786410Ut5.LJJJI("channel", str4, bundle);
            C786410Ut5.LJJJI("search_aid_issue_name", str5, bundle);
            C786410Ut5.LJJJI("survey_source_page", str, bundle);
            searchAidFeedbackFragment.setArguments(bundle);
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIJI = searchAidFeedbackFragment;
            c1390920mIc.LJIIIIZZ(0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJLLL = false;
            FragmentManager fragmentManager = this.LLIZ;
            if (fragmentManager != null) {
                tuxSheet.show(fragmentManager, "search_aid_feedback");
            }
        } else {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLJJLI);
            c1389890mGx.LJIIIZ(2131835079);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }
}
