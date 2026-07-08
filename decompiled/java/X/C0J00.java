package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdk.survey.model.SurveyOption;
import com.bytedance.android.livesdk.survey.model.SurveyQuestion;
import com.bytedance.android.livesdk.survey.model.SurveySecondQuestion;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.widget.survey.PreviewSurveyViewModel;
import com.ss.android.ugc.aweme.feed.exp.LivePreviewExtraCardDetail;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0J00, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public abstract class C0J00 extends AbstractC484810Izn implements View.OnClickListener {
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;

    private final TuxIconView getCloseIv() {
        return (TuxIconView) this.LLILZ.getValue();
    }

    private final C197039127h getFirstBtn() {
        return (C197039127h) this.LLILZIL.getValue();
    }

    private final C197039127h getSecondBtn() {
        return (C197039127h) this.LLILZLL.getValue();
    }

    private final TuxTextView getTitleTv() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    @Override // X.AbstractC484810Izn
    public final void l0() {
        PreviewSurveyViewModel surveyViewModel = getSurveyViewModel();
        if (surveyViewModel == null) {
            return;
        }
        SurveyQuestion surveyQuestion = surveyViewModel.LLILLJJLI;
        if (surveyQuestion != null) {
            C2271391DvN.LIZ(getCloseIv(), (C1A5L) C2271381DvM.LL.getValue());
            C2271391DvN.LIZ(getFirstBtn(), (C1A5L) C2271381DvM.LJZI.getValue());
            C2271391DvN.LIZ(getSecondBtn(), (C1A5L) C2271381DvM.LJZL.getValue());
            getTitleTv().setText(surveyQuestion.title);
            if (surveyQuestion.optionList.size() >= 2) {
                SurveyOption surveyOption = (SurveyOption) ListProtector.get(surveyQuestion.optionList, 0);
                surveyOption.LIZ = 1;
                surveyViewModel.LLJJJJLIIL.put(Long.valueOf(surveyOption.optionId), "[1]");
                getFirstBtn().setText(surveyOption.content);
                C786410Ut5.U8(getFirstBtn(), this);
                SurveyOption surveyOption2 = (SurveyOption) ListProtector.get(surveyQuestion.optionList, 1);
                surveyOption2.LIZ = 2;
                surveyViewModel.LLJJJJLIIL.put(Long.valueOf(surveyOption2.optionId), "[2]");
                getSecondBtn().setText(surveyOption2.content);
                C786410Ut5.U8(getSecondBtn(), this);
            }
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(this);
            }
            setOnClickListener(null);
            C786410Ut5.a9(getCloseIv(), this);
        }
        LivePreviewExtraCardDetail livePreviewExtraCardDetailLIZ = C0J07.LIZ(C0J09.LIVE_SURVEY_CARD);
        if (livePreviewExtraCardDetailLIZ != null && livePreviewExtraCardDetailLIZ.optButtonCorner) {
            setStandardStyle(getFirstBtn());
            setStandardStyle(getSecondBtn());
        }
        AbstractC484810Izn.n0(getCloseIv());
    }

    private final void setStandardStyle(C197039127h c197039127h) {
        c197039127h.LJJJJL(new AwS586S0100000_7(c197039127h, 451));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PreviewSurveyViewModel surveyViewModel;
        SurveyQuestion surveyQuestion;
        List<SurveyOption> list;
        SurveyOption surveyOption;
        PreviewSurveyViewModel surveyViewModel2;
        SurveyData surveyData;
        SurveyQuestion surveyQuestion2;
        List<SurveyOption> list2;
        SurveyOption surveyOption2;
        PreviewSurveyViewModel surveyViewModel3;
        SurveyData surveyData2;
        PreviewSurveyViewModel surveyViewModel4 = getSurveyViewModel();
        Integer numValueOf = null;
        if (surveyViewModel4 != null) {
            surveyViewModel4.LLILLL = null;
        }
        if (view != null && (numValueOf = Integer.valueOf(view.getId())) != null && numValueOf.intValue() == R.id.e26) {
            if (getSurveyViewModel() != null) {
                j0("user_close");
                return;
            }
            return;
        }
        if (numValueOf == null) {
            return;
        }
        if (numValueOf.intValue() == R.id.cqe) {
            PreviewSurveyViewModel surveyViewModel5 = getSurveyViewModel();
            if (surveyViewModel5 == null || (surveyQuestion2 = surveyViewModel5.LLILLJJLI) == null || (list2 = surveyQuestion2.optionList) == null || (surveyOption2 = (SurveyOption) ListProtector.get(list2, 0)) == null) {
                return;
            }
            surveyViewModel5.LLILLL = surveyOption2;
            surveyViewModel5.LLILZ.add(surveyOption2);
            List<SurveySecondQuestion> list3 = surveyOption2.secondList;
            if (list3 != null && !list3.isEmpty() && (surveyViewModel3 = getSurveyViewModel()) != null && (surveyData2 = surveyViewModel3.LL) != null && surveyData2.surveyVersion == 5) {
                p0();
                return;
            }
            PreviewSurveyViewModel surveyViewModel6 = getSurveyViewModel();
            if (surveyViewModel6 != null) {
                surveyViewModel6.EQ2();
            }
            j0("submit");
            return;
        }
        if (numValueOf.intValue() != R.id.cup || (surveyViewModel = getSurveyViewModel()) == null || (surveyQuestion = surveyViewModel.LLILLJJLI) == null || (list = surveyQuestion.optionList) == null || (surveyOption = (SurveyOption) ListProtector.get(list, 1)) == null) {
            return;
        }
        surveyViewModel.LLILLL = surveyOption;
        surveyViewModel.LLILZ.add(surveyOption);
        List<SurveySecondQuestion> list4 = surveyOption.secondList;
        if (list4 != null && !list4.isEmpty() && (surveyViewModel2 = getSurveyViewModel()) != null && (surveyData = surveyViewModel2.LL) != null && surveyData.surveyVersion == 5) {
            p0();
            return;
        }
        PreviewSurveyViewModel surveyViewModel7 = getSurveyViewModel();
        if (surveyViewModel7 != null) {
            surveyViewModel7.EQ2();
        }
        j0("submit");
    }

    public C0J00(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 718));
        this.LLILZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 715));
        this.LLILZIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 716));
        this.LLILZLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 717));
    }
}
