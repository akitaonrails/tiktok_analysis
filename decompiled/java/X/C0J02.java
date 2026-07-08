package X;

import Y.ACListenerS142S0100000_7;
import Y.ARunnableS107S0100000_7;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.watchlive.LightSurveyDelayConfig;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdk.survey.model.SurveyOption;
import com.bytedance.android.livesdk.survey.model.SurveyQuestion;
import com.bytedance.android.livesdk.survey.model.SurveySecondQuestion;
import com.bytedance.android.livesdk.survey.model.SurveyShowMode;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.widget.survey.PreviewSurveyViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0J02, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J02 extends AbstractC484810Izn {
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public ViewGroup LLJILLL;
    public TuxIconView LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public final ARunnableS107S0100000_7 LLJJIJI;
    public final ARunnableS107S0100000_7 LLJJIJIIJIL;

    @Override // X.AbstractC484810Izn
    public final void h0(int i) {
    }

    public final void s0() {
        this.LLJJIII = true;
        if (getDelay() <= 0) {
            this.LLJJIJIIJIL.run();
            return;
        }
        getUiHandler().removeCallbacksAndMessages(null);
        C786410Ut5.LJLIIL(LightSurveyDelayConfig.INSTANCE.delay(), getUiHandler(), this.LLJJIJIIJIL);
    }

    public final void u0() {
        this.LLJJI = true;
        if (getDelay() <= 0) {
            this.LLJJIJI.run();
            return;
        }
        getUiHandler().removeCallbacksAndMessages(null);
        C786410Ut5.LJLIIL(LightSurveyDelayConfig.INSTANCE.delay(), getUiHandler(), this.LLJJIJI);
    }

    private final TuxIconView getCloseIv() {
        return (TuxIconView) this.LLILZ.getValue();
    }

    private final TuxIconView getEmoji0() {
        return (TuxIconView) this.LLILZLL.getValue();
    }

    private final ViewGroup getEmoji0Container() {
        return (ViewGroup) this.LLILZIL.getValue();
    }

    private final TuxTextView getEmoji0Tv() {
        return (TuxTextView) this.LLIZ.getValue();
    }

    private final TuxIconView getEmoji1() {
        return (TuxIconView) this.LLJ.getValue();
    }

    private final ViewGroup getEmoji1Container() {
        return (ViewGroup) this.LLIZLLLIL.getValue();
    }

    private final TuxTextView getEmoji1Tv() {
        return (TuxTextView) this.LLJI.getValue();
    }

    private final TuxIconView getEmoji2() {
        return (TuxIconView) this.LLJILJIL.getValue();
    }

    private final ViewGroup getEmoji2Container() {
        return (ViewGroup) this.LLJIJIL.getValue();
    }

    private final TuxTextView getEmoji2Tv() {
        return (TuxTextView) this.LLJILJILJ.getValue();
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
            C2271391DvN.LIZ(getCloseIv(), (C1A5L) C2271381DvM.LL.getValue());
            C2271391DvN.LIZ(getEmoji0Container(), (C1A5L) C2271381DvM.LLF.getValue());
            C2271391DvN.LIZ(getEmoji1Container(), (C1A5L) C2271381DvM.LLFF.getValue());
            C2271391DvN.LIZ(getEmoji2Container(), (C1A5L) C2271381DvM.LLFFF.getValue());
            getTitleTv().setText(surveyQuestion.title);
            if (surveyQuestion.optionList.size() >= 3) {
                B0(getEmoji0Container(), getEmoji0(), getEmoji0Tv(), 0);
                B0(getEmoji1Container(), getEmoji1(), getEmoji1Tv(), 1);
                B0(getEmoji2Container(), getEmoji2(), getEmoji2Tv(), 2);
            }
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(this);
            }
            setOnClickListener(null);
            C786410Ut5.a9(getCloseIv(), new ACListenerS142S0100000_7(this, 254));
        }
        AbstractC484810Izn.n0(getCloseIv());
    }

    @Override // X.AbstractC484810Izn
    public final void reset() {
        super.reset();
        this.LLJJI = false;
        this.LLJJIII = false;
        this.LLJILLL = null;
        this.LLJJ = null;
    }

    @Override // X.AbstractC484810Izn
    public final void j0(String str) {
        PreviewSurveyViewModel surveyViewModel;
        if (this.LLJJI && (surveyViewModel = getSurveyViewModel()) != null) {
            surveyViewModel.EQ2();
        }
        if (this.LLJJIII) {
            p0();
        }
        this.LLJJI = false;
        this.LLJJIII = false;
        super.j0(str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final int z0(String str, boolean z) {
        if (str == null) {
            return 0;
        }
        switch (str.hashCode()) {
            case -712059990:
                if (!str.equals("unsatisfy")) {
                    return 0;
                }
                if (z) {
                    return R.raw.icon_bitmap_big_moji_bad;
                }
                return R.raw.icon_bitmap_big_moji_bad_gray;
            case -224567701:
                if (!str.equals("satisfy_wink")) {
                    return 0;
                }
                if (z) {
                    return R.raw.icon_bitmap_big_moji_good;
                }
                return R.raw.icon_bitmap_big_moji_good_gray;
            case 1844321735:
                if (!str.equals("neutral")) {
                    return 0;
                }
                if (z) {
                    return R.raw.icon_bitmap_big_moji_neutral;
                }
                return R.raw.icon_bitmap_big_moji_neutral_gray;
            case 1871106147:
                if (!str.equals("satisfy")) {
                    return 0;
                }
                if (z) {
                    return R.raw.icon_bitmap_big_moji_very_good;
                }
                return R.raw.icon_bitmap_big_moji_very_good_gray;
            default:
                return 0;
        }
    }

    public C0J02(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dey, this, true);
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
        this.LLILLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 732));
        this.LLILZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 722));
        this.LLILZIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 724));
        this.LLILZLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 723));
        this.LLIZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 725));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 727));
        this.LLJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 726));
        this.LLJI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 728));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 730));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 729));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 731));
        this.LLJJIJI = new ARunnableS107S0100000_7(this, 211);
        this.LLJJIJIIJIL = new ARunnableS107S0100000_7(this, 210);
    }

    public final void B0(final ViewGroup viewGroup, final TuxIconView tuxIconView, TuxTextView tuxTextView, int i) {
        SurveyQuestion surveyQuestion;
        List<SurveyOption> list;
        final SurveyOption surveyOption;
        final boolean z;
        final int i2;
        SurveyData surveyData;
        SurveyShowMode surveyShowMode;
        Map<Long, String> map;
        PreviewSurveyViewModel surveyViewModel = getSurveyViewModel();
        if (surveyViewModel != null && (surveyQuestion = surveyViewModel.LLILLJJLI) != null && (list = surveyQuestion.optionList) != null && (surveyOption = (SurveyOption) ListProtector.get(list, i)) != null) {
            int i3 = i + 1;
            surveyOption.LIZ = i3;
            PreviewSurveyViewModel surveyViewModel2 = getSurveyViewModel();
            if (surveyViewModel2 != null && (map = surveyViewModel2.LLJJJJLIIL) != null) {
                Long lValueOf = Long.valueOf(surveyOption.optionId);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(i3);
                sbLIZ.append(']');
                map.put(lValueOf, C2188811AlT.LIZIZ(sbLIZ));
            }
            if (surveyOption.content.length() > 0) {
                C500260Jjc.LLFFF(tuxTextView);
                tuxTextView.setText(surveyOption.content);
            } else {
                C500260Jjc.LJIILIIL(tuxTextView);
            }
            PreviewSurveyViewModel surveyViewModel3 = getSurveyViewModel();
            if (surveyViewModel3 != null && (surveyData = surveyViewModel3.LL) != null && (surveyShowMode = surveyData.showMode) != null && surveyShowMode.lightSurveyEmojiStyle == 1) {
                z = true;
            } else {
                z = false;
            }
            int i4 = 12;
            if (z) {
                if (i != 0) {
                    if (i == 2) {
                        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                        if (layoutParams != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.setMarginEnd(C439101nJ.LIZ(12));
                            C786410Ut5.W5(viewGroup, marginLayoutParams);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                    if (layoutParams2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.setMarginStart(C439101nJ.LIZ(12));
                        C786410Ut5.W5(viewGroup, marginLayoutParams2);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }
                i2 = R.attr.zj;
            } else {
                i2 = R.attr.a02;
            }
            if (!z) {
                i4 = 8;
            }
            final float fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf(i4));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(fLIZIZ);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, C1385040m98.LIZ(getContext(), true));
            if (numLIZJ != null) {
                gradientDrawable.setColor(numLIZJ.intValue());
            }
            viewGroup.setBackground(gradientDrawable);
            if (z) {
                tuxIconView.setIconRes(z0(surveyOption.emojiId, true));
            } else {
                tuxIconView.setIconRes(z0(surveyOption.emojiId, false));
            }
            C786410Ut5.K7(viewGroup, new View.OnClickListener() { // from class: X.0J03
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SurveyOption surveyOption2;
                    PreviewSurveyViewModel surveyViewModel4;
                    SurveyData surveyData2;
                    Set<SurveyOption> set;
                    SurveyOption surveyOption3;
                    PreviewSurveyViewModel surveyViewModel5 = this.LL.getSurveyViewModel();
                    String str = null;
                    if (surveyViewModel5 != null) {
                        surveyOption2 = surveyViewModel5.LLILLL;
                    } else {
                        surveyOption2 = null;
                    }
                    if (Intrinsics.LJFF(surveyOption2, surveyOption)) {
                        return;
                    }
                    try {
                        ViewGroup viewGroup2 = this.LL.LLJILLL;
                        if (viewGroup2 != null) {
                            GradientDrawable gradientDrawable2 = new GradientDrawable();
                            float f = fLIZIZ;
                            C0J02 c0j02 = this.LL;
                            gradientDrawable2.setCornerRadius(f);
                            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a03, C1385040m98.LIZ(c0j02.getContext(), true));
                            if (numLIZJ2 != null) {
                                gradientDrawable2.setColor(numLIZJ2.intValue());
                            }
                            viewGroup2.setBackground(gradientDrawable2);
                        }
                        C0J02 c0j022 = this.LL;
                        ViewGroup viewGroup3 = viewGroup;
                        c0j022.LLJILLL = viewGroup3;
                        GradientDrawable gradientDrawable3 = new GradientDrawable();
                        float f2 = fLIZIZ;
                        C0J02 c0j023 = this.LL;
                        int i5 = i2;
                        gradientDrawable3.setCornerRadius(f2);
                        Integer numLIZJ3 = C1308910kAL.LIZJ(i5, C1385040m98.LIZ(c0j023.getContext(), true));
                        if (numLIZJ3 != null) {
                            gradientDrawable3.setColor(numLIZJ3.intValue());
                        }
                        viewGroup3.setBackground(gradientDrawable3);
                        if (z) {
                            this.LL.LLJJ = tuxIconView;
                        } else {
                            C0J02 c0j024 = this.LL;
                            TuxIconView tuxIconView2 = c0j024.LLJJ;
                            if (tuxIconView2 != null) {
                                PreviewSurveyViewModel surveyViewModel6 = c0j024.getSurveyViewModel();
                                if (surveyViewModel6 != null && (surveyOption3 = surveyViewModel6.LLILLL) != null) {
                                    str = surveyOption3.emojiId;
                                }
                                tuxIconView2.setIconRes(C0J02.z0(str, false));
                            }
                            C0J02 c0j025 = this.LL;
                            TuxIconView tuxIconView3 = tuxIconView;
                            c0j025.LLJJ = tuxIconView3;
                            tuxIconView3.setIconRes(C0J02.z0(surveyOption.emojiId, true));
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    PreviewSurveyViewModel surveyViewModel7 = this.LL.getSurveyViewModel();
                    if (surveyViewModel7 != null) {
                        surveyViewModel7.LLILLL = surveyOption;
                    }
                    PreviewSurveyViewModel surveyViewModel8 = this.LL.getSurveyViewModel();
                    if (surveyViewModel8 != null && (set = surveyViewModel8.LLILZ) != null) {
                        set.add(surveyOption);
                    }
                    List<SurveySecondQuestion> list2 = surveyOption.secondList;
                    if (list2 != null && !list2.isEmpty() && (surveyViewModel4 = this.LL.getSurveyViewModel()) != null && (surveyData2 = surveyViewModel4.LL) != null && surveyData2.surveyVersion == 5) {
                        this.LL.s0();
                    } else {
                        this.LL.u0();
                    }
                }
            });
        }
    }
}
