package X;

import Y.ACListenerS142S0100000_7;
import Y.ARunnableS107S0100000_7;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFullScreenSurveyUiAdjustment;
import com.bytedance.android.livesdk.survey.fullscreenstyle.SurveyViewModel;
import com.bytedance.android.livesdk.survey.layoutmanager.LiveSecondSurveyFlexLayoutManager;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdk.survey.model.SurveyOption;
import com.bytedance.android.livesdk.survey.model.SurveyQuestion;
import com.bytedance.android.livesdk.survey.model.SurveySecondQuestion;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0Ix2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C483100Ix2 extends ConstraintLayout implements InterfaceC484900Izw {
    public static final /* synthetic */ int LLJILLL = 0;
    public SurveyViewModel LL;
    public boolean LLILLJJLI;
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

    private final C16FS getGoBack() {
        return (C16FS) this.LLJIJIL.getValue();
    }

    private final C16F5 getGoBackV2() {
        return (C16F5) this.LLJILJIL.getValue();
    }

    private final LinearLayout getPrimaryItemsContainer() {
        return (LinearLayout) this.LLILZ.getValue();
    }

    private final LinearLayout getSecondItemsContainer() {
        return (LinearLayout) this.LLILZLL.getValue();
    }

    private final RecyclerView getSecondItemsContainerRv() {
        return (RecyclerView) this.LLIZ.getValue();
    }

    private final C16F5 getSubTitleTv() {
        return (C16F5) this.LLILZIL.getValue();
    }

    private final C16F5 getTitleTv() {
        return (C16F5) this.LLILLL.getValue();
    }

    public final void e0() {
        Set<SurveySecondQuestion> set;
        Set<SurveySecondQuestion> set2;
        SurveyViewModel surveyViewModel = this.LL;
        if (surveyViewModel != null) {
            surveyViewModel.wQ2();
        }
        SurveyViewModel surveyViewModel2 = this.LL;
        if (surveyViewModel2 != null) {
            surveyViewModel2.CQ2();
        }
        SurveyViewModel surveyViewModel3 = this.LL;
        if (surveyViewModel3 != null) {
            surveyViewModel3.LLJJ = SystemClock.elapsedRealtime();
        }
        SurveyViewModel surveyViewModel4 = this.LL;
        if (surveyViewModel4 != null) {
            surveyViewModel4.LLILLL = null;
            Set<SurveyOption> set3 = surveyViewModel4.LLILZ;
            if (set3 != null) {
                set3.clear();
            }
        }
        SurveyViewModel surveyViewModel5 = this.LL;
        if (surveyViewModel5 != null && (set2 = surveyViewModel5.LLILZIL) != null) {
            set2.clear();
        }
        SurveyViewModel surveyViewModel6 = this.LL;
        if (surveyViewModel6 != null && (set = surveyViewModel6.LLILZLL) != null) {
            set.clear();
        }
        SurveyViewModel surveyViewModel7 = this.LL;
        if (surveyViewModel7 != null) {
            surveyViewModel7.LLIZ = "";
            surveyViewModel7.AQ2();
        }
        SurveyViewModel surveyViewModel8 = this.LL;
        if (surveyViewModel8 != null) {
            surveyViewModel8.LLJJIII = 0L;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(new AnimationAnimationListenerC521650Kd1(this, 1));
        startAnimation(alphaAnimation);
        n0();
    }

    public final C16FS getSubmitBtn() {
        return (C16FS) this.LLJILJILJ.getValue();
    }

    public final RelativeLayout getSurveySecondOtherInput() {
        return (RelativeLayout) this.LLIZLLLIL.getValue();
    }

    public final LiveIconView getSurveySecondOtherInputClear() {
        return (LiveIconView) this.LLJI.getValue();
    }

    public final C16F5 getSurveySecondOtherInputText() {
        return (C16F5) this.LLJ.getValue();
    }

    public final void i0() {
        SurveySecondQuestion surveySecondQuestion;
        Long lValueOf;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        SurveyQuestion surveyQuestion;
        List<SurveyOption> list;
        SurveyOption surveyOption;
        Long lValueOf2;
        SurveyViewModel surveyViewModel = this.LL;
        if (surveyViewModel != null) {
            surveyViewModel.LLJJJJ = -1;
            surveyViewModel.LLJJJJJIL.clear();
            ((LinkedHashMap) surveyViewModel.LLJJJJLIIL).clear();
            surveyViewModel.LLJJJIL = j0(getTitleTv()) ? 1 : 0;
            if (C500260Jjc.LJJJJIZL(getPrimaryItemsContainer())) {
                LinearLayout primaryItemsContainer = getPrimaryItemsContainer();
                int childCount = primaryItemsContainer.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = primaryItemsContainer.getChildAt(i);
                    if ((childAt instanceof TextView) && C500260Jjc.LJJJJIZL(childAt) && (surveyQuestion = surveyViewModel.LLILLJJLI) != null && (list = surveyQuestion.optionList) != null && (surveyOption = (SurveyOption) C13LP.LJJJLZIJ(i, list)) != null && (lValueOf2 = Long.valueOf(surveyOption.optionId)) != null) {
                        if (!j0((TextView) childAt)) {
                            surveyViewModel.LLJJJJJIL.add(lValueOf2);
                        }
                        Map<Long, String> map = surveyViewModel.LLJJJJLIIL;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('[');
                        sbLIZ.append(i + 1);
                        sbLIZ.append(']');
                        map.put(lValueOf2, C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                return;
            }
            if (C500260Jjc.LJJJJIZL(getSecondItemsContainer())) {
                surveyViewModel.LLJJJJ = j0(getSubTitleTv()) ? 1 : 0;
                int width = getSecondItemsContainerRv().getWidth();
                getSecondItemsContainerRv().getHeight();
                RecyclerView secondItemsContainerRv = getSecondItemsContainerRv();
                int childCount2 = secondItemsContainerRv.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    View childAt2 = secondItemsContainerRv.getChildAt(i2);
                    if ((childAt2 instanceof TextView) && C500260Jjc.LJJJJIZL(childAt2)) {
                        TextView textView = (TextView) childAt2;
                        if (textView.getWidth() > 0 && textView.getHeight() > 0) {
                            RecyclerView.ViewHolder childViewHolder = getSecondItemsContainerRv().getChildViewHolder(childAt2);
                            if ((childViewHolder instanceof C483030Iwv) && (surveySecondQuestion = ((C483030Iwv) childViewHolder).LL) != null && (lValueOf = Long.valueOf(surveySecondQuestion.optionId)) != null) {
                                if (!j0(textView)) {
                                    surveyViewModel.LLJJJJJIL.add(lValueOf);
                                }
                                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                                    int width2 = textView.getWidth() + marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
                                    int height = textView.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                                    float x = textView.getX() - marginLayoutParams.getMarginStart();
                                    float y = (textView.getY() - marginLayoutParams.topMargin) / height;
                                    int i3 = 1;
                                    int i4 = (int) (y + 1);
                                    if (width2 == width) {
                                        i3 = 0;
                                    } else if (x != 0.0f) {
                                        i3 = 2;
                                    }
                                    Map<Long, String> map2 = surveyViewModel.LLJJJJLIIL;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append('[');
                                    sbLIZ2.append(i4);
                                    sbLIZ2.append(',');
                                    sbLIZ2.append(i3);
                                    sbLIZ2.append(']');
                                    map2.put(lValueOf, C2188811AlT.LIZIZ(sbLIZ2));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void h0() {
        SurveyQuestion surveyQuestion;
        String str;
        C786410Ut5.LJZL(8, getSecondItemsContainer());
        C786410Ut5.LJZL(0, getPrimaryItemsContainer());
        SurveyViewModel surveyViewModel = this.LL;
        if (surveyViewModel != null && (surveyQuestion = surveyViewModel.LLILLJJLI) != null && (str = surveyQuestion.title) != null) {
            getTitleTv().setText(str);
        }
        C786410Ut5.LLJJJ(getSubmitBtn(), 4);
        C786410Ut5.LLJJJ(getGoBack(), 8);
        C786410Ut5.LLJJJJ(getGoBackV2(), 8);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(new AnimationAnimationListenerC521650Kd1(this, 2));
        startAnimation(alphaAnimation);
    }

    public final void n0() {
        LinearLayout primaryItemsContainer = getPrimaryItemsContainer();
        int childCount = primaryItemsContainer.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = primaryItemsContainer.getChildAt(i);
            if (childAt instanceof C16F5) {
                ((AppCompatTextView) childAt).setBackgroundResource(C483040Iww.LIZ(false));
            }
        }
    }

    public /* synthetic */ C483100Ix2(Context context) {
        this(context, null, 0);
    }

    public static boolean j0(TextView textView) {
        if (textView.getLineCount() <= textView.getMaxLines()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [X.0Iwy] */
    public final void l0(SurveyOption surveyOption) {
        Set<SurveySecondQuestion> set;
        Set<SurveySecondQuestion> set2;
        SurveyOption surveyOption2;
        C786410Ut5.LJZL(8, getPrimaryItemsContainer());
        C786410Ut5.LJZL(0, getSecondItemsContainer());
        SurveyViewModel surveyViewModel = this.LL;
        if (surveyViewModel != null && (surveyOption2 = surveyViewModel.LLILLL) != null) {
            if (!TextUtils.isEmpty(surveyOption2.mainTitle)) {
                getTitleTv().setText(surveyOption2.mainTitle);
            }
            if (!TextUtils.isEmpty(surveyOption2.subTitle)) {
                getSubTitleTv().setText(surveyOption2.subTitle);
            }
        }
        C786410Ut5.LLJJJ(getSubmitBtn(), 0);
        getSubmitBtn().setEnabled(false);
        C786410Ut5.j5(getSubmitBtn(), 0.4f);
        if (LiveFullScreenSurveyUiAdjustment.v2()) {
            C786410Ut5.LLJJJJ(getGoBackV2(), 0);
            getGoBackV2().setTextColor(C20736316Cj.LIZIZ(R.attr.ezq, C1834150xpV.LJII(getContext())));
            C786410Ut5.l8(getGoBackV2(), new ACListenerS142S0100000_7(this, 210));
        } else {
            C786410Ut5.LLJJJ(getGoBack(), 0);
            C786410Ut5.h8(getGoBack(), new ACListenerS142S0100000_7(this, 211));
        }
        LiveSecondSurveyFlexLayoutManager liveSecondSurveyFlexLayoutManager = new LiveSecondSurveyFlexLayoutManager(getContext());
        C483020Iwu c483020Iwu = new C483020Iwu(getContext(), this.LL, surveyOption.secondList, new InterfaceC483050Iwx() { // from class: X.0Iwy
            @Override // X.InterfaceC483050Iwx
            public final void LIZ(C483030Iwv c483030Iwv) {
                Set<SurveySecondQuestion> set3;
                Set<SurveySecondQuestion> set4;
                String str;
                C483100Ix2 c483100Ix2 = this.LIZ;
                SurveyViewModel surveyViewModel2 = c483100Ix2.LL;
                if (surveyViewModel2 != null) {
                    if (C13LP.LJJJJ(c483030Iwv.LL, surveyViewModel2.LLILZIL)) {
                        C19719512Dh.LIZ(surveyViewModel2.LLILZIL).remove(c483030Iwv.LL);
                        c483030Iwv.I5(false);
                    } else {
                        SurveySecondQuestion surveySecondQuestion = c483030Iwv.LL;
                        if (surveySecondQuestion != null) {
                            surveyViewModel2.LLILZIL.add(surveySecondQuestion);
                            surveyViewModel2.LLILZLL.add(surveySecondQuestion);
                        }
                        c483030Iwv.I5(true);
                        SurveySecondQuestion surveySecondQuestion2 = c483030Iwv.LL;
                        if (surveySecondQuestion2 != null && surveySecondQuestion2.isOther) {
                            C16F5 surveySecondOtherInputText = c483100Ix2.getSurveySecondOtherInputText();
                            SurveyViewModel surveyViewModel3 = c483100Ix2.LL;
                            if (surveyViewModel3 != null) {
                                str = surveyViewModel3.LLIZ;
                            } else {
                                str = null;
                            }
                            surveySecondOtherInputText.setText(str);
                        }
                    }
                }
                SurveySecondQuestion surveySecondQuestion3 = c483030Iwv.LL;
                if (surveySecondQuestion3 != null && surveySecondQuestion3.isOther) {
                    SurveyViewModel surveyViewModel4 = this.LIZ.LL;
                    if (surveyViewModel4 != null && (set4 = surveyViewModel4.LLILZIL) != null && C13LP.LJJJJ(surveySecondQuestion3, set4)) {
                        C786410Ut5.LLIIL(this.LIZ.getSurveySecondOtherInput(), 0);
                    } else {
                        C786410Ut5.LLIIL(this.LIZ.getSurveySecondOtherInput(), 8);
                    }
                }
                SurveyViewModel surveyViewModel5 = this.LIZ.LL;
                if (surveyViewModel5 != null && (set3 = surveyViewModel5.LLILZIL) != null && set3.size() > 0) {
                    this.LIZ.getSubmitBtn().setEnabled(true);
                    C786410Ut5.j5(this.LIZ.getSubmitBtn(), 1.0f);
                } else {
                    this.LIZ.getSubmitBtn().setEnabled(false);
                    C786410Ut5.j5(this.LIZ.getSubmitBtn(), 0.4f);
                }
            }
        }, new AwS551S0100000_7(this, 649));
        getSecondItemsContainerRv().setLayoutManager(liveSecondSurveyFlexLayoutManager);
        getSecondItemsContainerRv().setAdapter(c483020Iwu);
        C786410Ut5.LLIIL(getSurveySecondOtherInput(), 8);
        C786410Ut5.S7(getSurveySecondOtherInput(), new ACListenerS142S0100000_7(this, 212));
        C786410Ut5.g8(getSurveySecondOtherInputClear(), new ACListenerS142S0100000_7(this, 213));
        SurveyViewModel surveyViewModel2 = this.LL;
        if (surveyViewModel2 != null && (set2 = surveyViewModel2.LLILZIL) != null) {
            set2.clear();
        }
        SurveyViewModel surveyViewModel3 = this.LL;
        if (surveyViewModel3 != null && (set = surveyViewModel3.LLILZLL) != null) {
            set.clear();
        }
        SurveyViewModel surveyViewModel4 = this.LL;
        if (surveyViewModel4 != null) {
            surveyViewModel4.LLIZ = "";
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(new AnimationAnimationListenerC521650Kd1(this, 3));
        startAnimation(alphaAnimation);
    }

    public final void setSecondaryShow(boolean z) {
        int i;
        if (z) {
            i = 24;
        } else {
            i = 32;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(480));
        float fLJFF = C14KS.LJFF();
        int i2 = 2;
        if (fLJFF > (iLIZIZ * 2) + iLIZIZ2) {
            iLIZIZ = (int) ((fLJFF - iLIZIZ2) / 2);
        }
        setPadding(iLIZIZ, 0, iLIZIZ, 0);
        C16F5 titleTv = getTitleTv();
        if (!z) {
            i2 = 3;
        }
        titleTv.setMaxLines(i2);
    }

    @Override // X.InterfaceC484900Izw
    public void setSmallSize(boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        ViewGroup.MarginLayoutParams marginLayoutParams5;
        ViewGroup.MarginLayoutParams marginLayoutParams6;
        if (z && !this.LLILLJJLI) {
            ViewGroup.LayoutParams layoutParams = getPrimaryItemsContainer().getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                C786410Ut5.d6(getPrimaryItemsContainer(), marginLayoutParams);
            }
            LinearLayout primaryItemsContainer = getPrimaryItemsContainer();
            int childCount = primaryItemsContainer.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = primaryItemsContainer.getChildAt(i);
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    marginLayoutParams6.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                    if (i > 0) {
                        marginLayoutParams6.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    }
                    C786410Ut5.W5(childAt, marginLayoutParams6);
                }
            }
            ViewGroup.LayoutParams layoutParams3 = getSubmitBtn().getLayoutParams();
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                marginLayoutParams5.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                marginLayoutParams5.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                marginLayoutParams5.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                C786410Ut5.x6(getSubmitBtn(), marginLayoutParams5);
            }
            ViewGroup.LayoutParams layoutParams4 = getGoBack().getLayoutParams();
            if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                marginLayoutParams4.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                marginLayoutParams4.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                C786410Ut5.x6(getGoBack(), marginLayoutParams4);
            }
            ViewGroup.LayoutParams layoutParams5 = getSurveySecondOtherInput().getLayoutParams();
            if ((layoutParams5 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams5) != null) {
                marginLayoutParams3.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                marginLayoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                C786410Ut5.e6(getSurveySecondOtherInput(), marginLayoutParams3);
            }
            ViewGroup.LayoutParams layoutParams6 = getSecondItemsContainerRv().getLayoutParams();
            if ((layoutParams6 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams6) != null) {
                marginLayoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                marginLayoutParams2.leftMargin = -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                marginLayoutParams2.rightMargin = -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                C786410Ut5.p6(getSecondItemsContainerRv(), marginLayoutParams2);
            }
            this.LLILLJJLI = true;
        }
    }

    @Override // X.InterfaceC484900Izw
    public void setSurveyViewModel(SurveyViewModel surveyViewModel) {
        this.LL = surveyViewModel;
    }

    @Override // X.InterfaceC484900Izw
    public final void t(SurveyData surveyData) {
        List<SurveyQuestion> list;
        SurveyQuestion surveyQuestion;
        Context context;
        Resources resources;
        SurveyData surveyData2;
        getSubmitBtn().setTextColor(C20736316Cj.LIZIZ(R.attr.eyv, C1834150xpV.LJII(getContext())));
        getSubmitBtn().setBackgroundColor(C20736316Cj.LIZIZ(R.attr.ey7, C1834150xpV.LJII(getContext())));
        SurveyViewModel surveyViewModel = this.LL;
        if (surveyViewModel != null && (surveyData2 = surveyViewModel.LL) != null && surveyData2.surveyVersion == 3) {
            C786410Ut5.LLJJJ(getSubmitBtn(), 4);
        } else {
            C786410Ut5.LLJJJ(getSubmitBtn(), 0);
        }
        if (LiveFullScreenSurveyUiAdjustment.v2() && (context = getContext()) != null && (resources = context.getResources()) != null) {
            getSubmitBtn().setRadius(resources.getDimension(R.dimen.b4));
        }
        setSecondaryShow(false);
        if (surveyData != null && (list = surveyData.questionList) != null && list.size() > 0 && 1 != 0 && (surveyQuestion = (SurveyQuestion) ListProtector.get(list, 0)) != null) {
            SurveyViewModel surveyViewModel2 = this.LL;
            if (surveyViewModel2 != null) {
                surveyViewModel2.LLILLJJLI = surveyQuestion;
            }
            getTitleTv().setText(surveyQuestion.title);
            List<SurveyOption> list2 = surveyQuestion.optionList;
            if (list2 != null) {
                int i = 0;
                for (final SurveyOption surveyOption : list2) {
                    int i2 = i + 1;
                    C16F5 c16f5 = new C16F5(getContext(), null);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) C497740JfY.LIZIZ(44.0f));
                    if (i > 0) {
                        layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    }
                    c16f5.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))));
                    c16f5.setGravity(17);
                    C786410Ut5.y6(c16f5, layoutParams);
                    c16f5.setText(surveyOption.content);
                    c16f5.setMaxLines(2);
                    c16f5.setBreakStrategy(2);
                    c16f5.LJJJI(R.style.ako);
                    c16f5.setBackgroundResource(C483040Iww.LIZ(false));
                    TypedArray typedArrayObtainStyledAttributes = c16f5.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.c9i});
                    int color = typedArrayObtainStyledAttributes.getColor(0, 0);
                    typedArrayObtainStyledAttributes.recycle();
                    c16f5.setTextColor(color);
                    try {
                        C21382118m3.LIZJ(c16f5, 1);
                        C21382118m3.LIZIZ(c16f5, 12, 15, 1, 1);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                    getPrimaryItemsContainer().addView(c16f5, i);
                    surveyOption.LIZ = i2;
                    C786410Ut5.l8(c16f5, new C01DW() { // from class: X.0Iwz
                        @Override // X.C01DW
                        public final void LIZ(View view) {
                            boolean z;
                            List<SurveySecondQuestion> list3;
                            SurveyData surveyData3;
                            final C483100Ix2 c483100Ix2 = this.LLILLL;
                            final SurveyOption surveyOption2 = surveyOption;
                            c483100Ix2.n0();
                            if (view != null) {
                                view.setBackgroundResource(C483040Iww.LIZ(true));
                            }
                            SurveyViewModel surveyViewModel3 = c483100Ix2.LL;
                            if (surveyViewModel3 != null) {
                                surveyViewModel3.LLILLL = surveyOption2;
                                Set<SurveyOption> set = surveyViewModel3.LLILZ;
                                if (set != null) {
                                    set.add(surveyOption2);
                                }
                            }
                            SurveyViewModel surveyViewModel4 = c483100Ix2.LL;
                            if (surveyViewModel4 != null && (surveyData3 = surveyViewModel4.LL) != null && surveyData3.surveyVersion == 3) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z && (list3 = surveyOption2.secondList) != null && !list3.isEmpty()) {
                                C786410Ut5.LLJJJ(c483100Ix2.getSubmitBtn(), 4);
                                SurveyViewModel surveyViewModel5 = c483100Ix2.LL;
                                if (surveyViewModel5 != null) {
                                    surveyViewModel5.BQ2();
                                }
                                SurveyViewModel surveyViewModel6 = c483100Ix2.LL;
                                if (surveyViewModel6 != null) {
                                    surveyViewModel6.LLJJI = SystemClock.elapsedRealtime();
                                }
                                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                                alphaAnimation.setDuration(500L);
                                alphaAnimation.setFillAfter(true);
                                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: X.0Ix0
                                    @Override // android.view.animation.Animation.AnimationListener
                                    public final void onAnimationRepeat(Animation animation) {
                                    }

                                    @Override // android.view.animation.Animation.AnimationListener
                                    public final void onAnimationStart(Animation animation) {
                                    }

                                    @Override // android.view.animation.Animation.AnimationListener
                                    public final void onAnimationEnd(Animation animation) {
                                        c483100Ix2.setSecondaryShow(true);
                                        c483100Ix2.l0(surveyOption2);
                                    }
                                });
                                c483100Ix2.startAnimation(alphaAnimation);
                                return;
                            }
                            C786410Ut5.LLJJJ(c483100Ix2.getSubmitBtn(), 0);
                            c483100Ix2.getSubmitBtn().setEnabled(true);
                            C786410Ut5.j5(c483100Ix2.getSubmitBtn(), 1.0f);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1000L);
                        }
                    });
                    i = i2;
                }
            }
        }
        C786410Ut5.h8(getSubmitBtn(), new C01DW() { // from class: X.0Ix1
            {
                super(3000L);
            }

            @Override // X.C01DW
            public final void LIZ(View view) {
                SurveyViewModel surveyViewModel3 = this.LLILLL.LL;
                if (surveyViewModel3 != null) {
                    surveyViewModel3.DQ2();
                }
            }
        });
        HandlerHook.viewPost(this, new ARunnableS107S0100000_7(this, 182));
    }

    public C483100Ix2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 648));
        this.LLILZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 640));
        this.LLILZIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 643));
        this.LLILZLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 641));
        this.LLIZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 642));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 645));
        this.LLJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 647));
        this.LLJI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 646));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 638));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 639));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 644));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.hq1, this, true);
    }
}
