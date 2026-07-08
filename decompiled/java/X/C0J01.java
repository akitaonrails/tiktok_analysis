package X;

import Y.ACListenerS142S0100000_7;
import Y.AObjectS189S0300000_7;
import Y.ARunnableS107S0100000_7;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.watchlive.LightSurveyDelayConfig;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdk.survey.model.SurveyOption;
import com.bytedance.android.livesdk.survey.model.SurveyQuestion;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.widget.survey.PreviewSurveyViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0J01, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J01 extends AbstractC484810Izn {
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public final ARunnableS107S0100000_7 LLIZLLLIL;
    public final ARunnableS107S0100000_7 LLJ;

    @Override // X.AbstractC484810Izn
    public final void h0(int i) {
    }

    public final void s0() {
        this.LLIZ = true;
        long delay = getDelay();
        if (delay <= 0) {
            this.LLJ.run();
        } else {
            getUiHandler().removeCallbacksAndMessages(null);
            C786410Ut5.LJLIIL(delay, getUiHandler(), this.LLJ);
        }
    }

    public final void u0() {
        this.LLILZLL = true;
        long delay = getDelay();
        if (delay <= 0) {
            this.LLIZLLLIL.run();
        } else {
            getUiHandler().removeCallbacksAndMessages(null);
            C786410Ut5.LJLIIL(delay, getUiHandler(), this.LLIZLLLIL);
        }
    }

    private final TuxIconView getCloseIv() {
        return (TuxIconView) this.LLILZ.getValue();
    }

    private final C1203370hQ7 getRatingStar() {
        return (C1203370hQ7) this.LLILZIL.getValue();
    }

    private final TuxTextView getTitleTv() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    @Override // X.AbstractC484810Izn
    public final ViewGroup.LayoutParams i0() {
        int iLIZ = C439101nJ.LIZ(8);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.setMarginStart(C439101nJ.LIZ(12));
        marginLayoutParams.setMarginEnd(C439101nJ.LIZ(12));
        marginLayoutParams.bottomMargin = iLIZ;
        return marginLayoutParams;
    }

    private final long getDelay() {
        SurveyData surveyData;
        Long lValueOf;
        PreviewSurveyViewModel surveyViewModel = getSurveyViewModel();
        if (surveyViewModel == null || (surveyData = surveyViewModel.LL) == null || (lValueOf = Long.valueOf(surveyData.surveyVersion)) == null) {
            return 0L;
        }
        if (lValueOf.longValue() == 4) {
            return 1000L;
        }
        if (lValueOf.longValue() == 5) {
            return LightSurveyDelayConfig.INSTANCE.delay();
        }
        return 0L;
    }

    @Override // X.AbstractC484810Izn
    public final void l0() {
        PreviewSurveyViewModel surveyViewModel = getSurveyViewModel();
        if (surveyViewModel == null) {
            return;
        }
        SurveyQuestion surveyQuestion = surveyViewModel.LLILLJJLI;
        if (surveyQuestion != null) {
            int size = surveyQuestion.optionList.size();
            for (int i = 0; i < size; i++) {
                SurveyOption surveyOption = (SurveyOption) ListProtector.get(surveyQuestion.optionList, i);
                if (surveyOption != null) {
                    int i2 = i + 1;
                    surveyOption.LIZ = i2;
                    Map<Long, String> map = surveyViewModel.LLJJJJLIIL;
                    Long lValueOf = Long.valueOf(surveyOption.optionId);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('[');
                    sbLIZ.append(i2);
                    sbLIZ.append(']');
                    map.put(lValueOf, C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            C2271391DvN.LIZ(getCloseIv(), (C1A5L) C2271381DvM.LL.getValue());
            C2271391DvN.LIZ(getRatingStar(), (C1A5L) C2271381DvM.LLD.getValue());
            getTitleTv().setText(surveyQuestion.title);
            C786410Ut5.a9(getCloseIv(), new ACListenerS142S0100000_7(this, 251));
            getRatingStar().setValue(0);
            getRatingStar().setOnValueSelectedListener(new AObjectS189S0300000_7(surveyQuestion, surveyViewModel, this, 1));
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(this);
            }
            setOnClickListener(null);
        }
        AbstractC484810Izn.n0(getCloseIv());
    }

    @Override // X.AbstractC484810Izn
    public final void reset() {
        super.reset();
        this.LLILZLL = false;
        this.LLIZ = false;
    }

    @Override // X.AbstractC484810Izn
    public final void j0(String str) {
        PreviewSurveyViewModel surveyViewModel;
        if (this.LLILZLL && (surveyViewModel = getSurveyViewModel()) != null) {
            surveyViewModel.EQ2();
        }
        if (this.LLIZ) {
            p0();
        }
        this.LLILZLL = false;
        this.LLIZ = false;
        super.j0(str);
    }

    public C0J01(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.df0, this, true);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zh, context);
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            C0J09 c0j09 = C0J09.LIVE_SURVEY_CARD;
            if (C0J07.LIZLLL(c0j09)) {
                setBackground(C0J07.LIZIZ(c0j09, getContext(), C418440Gaw.LIZIZ(12), R.attr.zh));
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(12));
                gradientDrawable.setColor(iIntValue);
                setBackground(gradientDrawable);
            }
        }
        this.LLILLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 713));
        this.LLILZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 711));
        this.LLILZIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 712));
        this.LLIZLLLIL = new ARunnableS107S0100000_7(this, 205);
        this.LLJ = new ARunnableS107S0100000_7(this, 204);
    }
}
