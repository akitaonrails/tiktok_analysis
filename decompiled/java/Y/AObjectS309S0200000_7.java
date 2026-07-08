package Y;

import X.C0IEW;
import X.C0IHW;
import X.C0KX8;
import X.C1161920gLG;
import X.C13LP;
import X.C20441214yg;
import X.C2188811AlT;
import X.C464280IIo;
import X.C481250Iu3;
import X.C786410Ut5;
import X.C970800bN0;
import X.EnumC1102740eno;
import X.InterfaceC1103130eoR;
import X.InterfaceC464450IJf;
import X.InterfaceC481170Itv;
import android.os.Handler;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.chatroom.event.LiveRealTimeSurveyEvent;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.widget.RealTimeSurveyStarCardWidget;
import com.bytedance.android.livesdk.survey.fullscreenstyle.InnerSurveyViewModel;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdk.survey.model.SurveyOption;
import com.bytedance.android.livesdk.survey.model.SurveyQuestion;
import com.bytedance.android.livesdk.survey.model.SurveySecondQuestion;
import com.bytedance.android.livesdk.widget.preload.LivePreloadUserInfoWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public class AObjectS309S0200000_7 implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS309S0200000_7 aObjectS309S0200000_7, Object obj) {
        LivePreloadUserInfoWidget livePreloadUserInfoWidget;
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS309S0200000_7.l0;
        RecyclableWidgetManager recyclableWidgetManager = (RecyclableWidgetManager) aObjectS309S0200000_7.l1;
        String str = LivePlayFragment._pnsPageId;
        livePlayFragment.getClass();
        if (((Boolean) obj).booleanValue() && (livePreloadUserInfoWidget = livePlayFragment.f300O) != null) {
            recyclableWidgetManager.unload(livePreloadUserInfoWidget);
            livePlayFragment.f300O = null;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS309S0200000_7 aObjectS309S0200000_7, Object obj) {
        C464280IIo c464280IIo;
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS309S0200000_7.l0;
        C0IEW c0iew = (C0IEW) aObjectS309S0200000_7.l1;
        if (livePlayFragment.LLJLL != 1) {
            if (LivePlayFragment.lV()) {
                livePlayFragment.uT(false, false);
            } else {
                c0iew.LLLIIII(false, false);
                c0iew.setEnableScroll(false);
            }
            livePlayFragment.O0 = false;
            livePlayFragment.n0.LJIIL(false, true);
            return null;
        }
        if (livePlayFragment.L0 == null || (c464280IIo = livePlayFragment.n0) == null || !c464280IIo.LJIIIZ) {
            return null;
        }
        livePlayFragment.AU().Yb();
        HandlerHook.viewPost(livePlayFragment.L0, new ARunnableS107S0100000_7(livePlayFragment, 44));
        return null;
    }

    public static final Object invoke$2(AObjectS309S0200000_7 aObjectS309S0200000_7, Object obj) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS309S0200000_7.l0;
        DataChannel dataChannel = (DataChannel) aObjectS309S0200000_7.l1;
        C970800bN0 c970800bN0 = (C970800bN0) obj;
        if (livePlayFragment.Y1.LJ.containsKey(Long.valueOf(c970800bN0.LIZ))) {
            livePlayFragment.Y1.LJ.put(Long.valueOf(c970800bN0.LIZ), Integer.valueOf(c970800bN0.LIZIZ + livePlayFragment.Y1.LJ.get(Long.valueOf(c970800bN0.LIZ)).intValue()));
        } else {
            livePlayFragment.Y1.LJ.put(Long.valueOf(c970800bN0.LIZ), Integer.valueOf(c970800bN0.LIZIZ));
        }
        C0IHW c0ihw = livePlayFragment.Y1;
        c0ihw.LJII += c970800bN0.LIZIZ;
        c0ihw.LJIIIIZZ += c970800bN0.LIZJ;
        dataChannel.LC0(LiveRealTimeSurveyEvent.class, 0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gift update ");
        sbLIZ.append(livePlayFragment.Y1);
        C20441214yg.LIZIZ("SurveyFeatureCenter", C2188811AlT.LIZIZ(sbLIZ));
        return null;
    }

    public static final Object invoke$3(AObjectS309S0200000_7 aObjectS309S0200000_7, Object obj) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS309S0200000_7.l0;
        C0IEW c0iew = (C0IEW) aObjectS309S0200000_7.l1;
        String str = LivePlayFragment._pnsPageId;
        livePlayFragment.getClass();
        if (((Boolean) obj).booleanValue()) {
            if (LivePlayFragment.lV()) {
                livePlayFragment.uT(false, false);
            } else {
                c0iew.LLLIIII(false, false);
                c0iew.setEnableScroll(false);
            }
            C20441214yg.LJIIIZ("LivePlayFragment", "intercept go live card, because of FullScreenSurveyShowing");
            return null;
        }
        return null;
    }

    public static final Object invoke$4(AObjectS309S0200000_7 aObjectS309S0200000_7, Object obj) {
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aObjectS309S0200000_7.l0;
        InterfaceC464450IJf interfaceC464450IJf = (InterfaceC464450IJf) aObjectS309S0200000_7.l1;
        absAudienceInteractionFragment.getClass();
        if (((C0KX8) obj).LIZLLL) {
            EnumC1102740eno.VOTE.unload(absAudienceInteractionFragment.LLJIJIL);
        } else {
            Room room = absAudienceInteractionFragment.LLJILJIL;
            if (room != null && interfaceC464450IJf.LIZIZ(room.getId())) {
                EnumC1102740eno enumC1102740eno = EnumC1102740eno.VOTE;
                if (!enumC1102740eno.isShowing(absAudienceInteractionFragment.LLJIJIL) && (!enumC1102740eno.isShowingInInteractionDialog(absAudienceInteractionFragment.LLJIJIL) || !absAudienceInteractionFragment.NS())) {
                    ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).eU(absAudienceInteractionFragment.LLJIJIL);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS309S0200000_7 aObjectS309S0200000_7, Object obj) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS309S0200000_7.l0;
        C0IEW c0iew = (C0IEW) aObjectS309S0200000_7.l1;
        if (livePlayFragment.LLJLL != 1) {
            if (LivePlayFragment.lV()) {
                livePlayFragment.uT(false, false);
            } else {
                c0iew.LLLIIII(false, false);
                c0iew.setEnableScroll(false);
            }
            livePlayFragment.O0 = false;
            livePlayFragment.m0.LJIIL(false, true);
            return null;
        }
        return null;
    }

    public static final Object invoke$6(AObjectS309S0200000_7 aObjectS309S0200000_7, Object obj) {
        SurveyOption surveyOption;
        SurveyOption surveyOption2;
        boolean z;
        RealTimeSurveyStarCardWidget realTimeSurveyStarCardWidget;
        InnerSurveyViewModel innerSurveyViewModel;
        SurveyData surveyData;
        int iIntValue = ((Number) obj).intValue();
        List<SurveyOption> list = ((SurveyQuestion) aObjectS309S0200000_7.l0).optionList;
        if (list != null && (surveyOption = (SurveyOption) C13LP.LJJJLZIJ(iIntValue - 1, list)) != null) {
            InnerSurveyViewModel innerSurveyViewModel2 = ((RealTimeSurveyStarCardWidget) aObjectS309S0200000_7.l1).LLILZIL;
            if (innerSurveyViewModel2 != null) {
                surveyOption2 = innerSurveyViewModel2.LLILLL;
            } else {
                surveyOption2 = null;
            }
            if (!Intrinsics.LJFF(surveyOption2, surveyOption)) {
                InnerSurveyViewModel innerSurveyViewModel3 = ((RealTimeSurveyStarCardWidget) aObjectS309S0200000_7.l1).LLILZIL;
                if (innerSurveyViewModel3 != null) {
                    innerSurveyViewModel3.LLILLL = surveyOption;
                    Set<SurveyOption> set = innerSurveyViewModel3.LLILZ;
                    if (set != null) {
                        set.add(surveyOption);
                    }
                }
                List<SurveySecondQuestion> list2 = surveyOption.secondList;
                if (list2 != null && !list2.isEmpty()) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z && (innerSurveyViewModel = (realTimeSurveyStarCardWidget = (RealTimeSurveyStarCardWidget) aObjectS309S0200000_7.l1).LLILZIL) != null && (surveyData = innerSurveyViewModel.LL) != null && surveyData.surveyVersion == 5) {
                    realTimeSurveyStarCardWidget.LLJILLL = true;
                    long jE1 = realTimeSurveyStarCardWidget.E1();
                    if (jE1 > 0) {
                        realTimeSurveyStarCardWidget.C1();
                        ((Handler) realTimeSurveyStarCardWidget.LLJILJIL.getValue()).removeCallbacksAndMessages(null);
                        C786410Ut5.LJLIIL(jE1, (Handler) realTimeSurveyStarCardWidget.LLJILJIL.getValue(), realTimeSurveyStarCardWidget.LLJJI);
                    } else {
                        realTimeSurveyStarCardWidget.LLJJI.run();
                    }
                } else {
                    RealTimeSurveyStarCardWidget realTimeSurveyStarCardWidget2 = (RealTimeSurveyStarCardWidget) aObjectS309S0200000_7.l1;
                    realTimeSurveyStarCardWidget2.LLJILJILJ = true;
                    long jE12 = realTimeSurveyStarCardWidget2.E1();
                    if (jE12 > 0) {
                        realTimeSurveyStarCardWidget2.C1();
                        ((Handler) realTimeSurveyStarCardWidget2.LLJILJIL.getValue()).removeCallbacksAndMessages(null);
                        C786410Ut5.LJLIIL(jE12, (Handler) realTimeSurveyStarCardWidget2.LLJILJIL.getValue(), realTimeSurveyStarCardWidget2.LLJJ);
                    } else {
                        realTimeSurveyStarCardWidget2.LLJJ.run();
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AObjectS309S0200000_7 aObjectS309S0200000_7, Object obj) {
        C481250Iu3 c481250Iu3 = (C481250Iu3) aObjectS309S0200000_7.l0;
        InterfaceC1103130eoR interfaceC1103130eoR = (InterfaceC1103130eoR) aObjectS309S0200000_7.l1;
        c481250Iu3.LLILLL = (InterfaceC481170Itv) obj;
        c481250Iu3.onClick(interfaceC1103130eoR.LJ());
        return Unit.LIZ;
    }

    public AObjectS309S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
