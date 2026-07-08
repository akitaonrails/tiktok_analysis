package X;

import Y.ARunnableS3S1101000_19;
import android.view.View;
import com.ss.android.ugc.profile.business.profile.popup.BaseMyProfileGuideWidget;
import com.ss.android.ugc.profile.business.profile.popup.MyProfileGuideWidgetV2;
import com.ss.android.ugc.profile.business.profile.survey.SurveyAnswer;
import com.ss.android.ugc.profile.business.profile.survey.SurveyData;

/* JADX INFO: renamed from: X.0ioT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1256910ioT {
    public final /* synthetic */ AbstractViewOnClickListenerC1256970ioZ LIZ;
    public final /* synthetic */ BaseMyProfileGuideWidget LIZIZ;

    public C1256910ioT(C1257020ioe c1257020ioe, MyProfileGuideWidgetV2 myProfileGuideWidgetV2) {
        this.LIZ = c1257020ioe;
        this.LIZIZ = myProfileGuideWidgetV2;
    }

    public final void LIZ(int i, SurveyData surveyData, String str) {
        if (i != 1 && i != 2) {
            if (i == 3) {
                AbstractViewOnClickListenerC1256970ioZ abstractViewOnClickListenerC1256970ioZ = this.LIZ;
                View view = abstractViewOnClickListenerC1256970ioZ.LLILLJJLI;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                }
                abstractViewOnClickListenerC1256970ioZ.LIZ();
                abstractViewOnClickListenerC1256970ioZ.LLJJ = false;
            }
        } else {
            this.LIZ.LIZIZ();
        }
        C1256940ioW c1256940ioWLIZ = C1256940ioW.LIZ();
        SurveyAnswer surveyAnswer = new SurveyAnswer(i, surveyData.dialogId, surveyData.originId);
        c1256940ioWLIZ.getClass();
        C1256940ioW.LIZIZ(surveyAnswer);
        BaseMyProfileGuideWidget baseMyProfileGuideWidget = this.LIZIZ;
        baseMyProfileGuideWidget.getClass();
        C09UZ.LIZIZ(new ARunnableS3S1101000_19(i, surveyData, str, 1), baseMyProfileGuideWidget.LLJI);
    }
}
