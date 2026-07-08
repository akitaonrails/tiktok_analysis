package Y;

import X.C01VE;
import X.C1088660eR6;
import X.C1088730eRD;
import X.C1105320ery;
import X.C1127050fR1;
import X.C1128950fU5;
import X.C1129000fUA;
import X.C1129150fUP;
import X.C1136870fgr;
import X.C1142020fpA;
import X.C148100hT;
import X.C20441214yg;
import X.C500260Jjc;
import X.C786410Ut5;
import X.EnumC187400no;
import X.InterfaceC1105450esB;
import X.InterfaceC1127990fSX;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import com.bytedance.android.livesdk.livesetting.rank.LiveTopBuyerEntranceGuideAnimationAnchorTimeSetting;
import com.bytedance.android.livesdk.livesetting.rank.LiveTopBuyerEntranceGuideAnimationAudienceTimeSetting;
import com.bytedance.android.livesdk.livesetting.rank.LiveTopBuyerEntranceGuideAnimationSetting;
import com.bytedance.android.livesdk.rank.impl.viewmodel.AudienceRankingEntranceViewModel;
import com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public class AgS298S0100000_17 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS298S0100000_17(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object emit$0(AgS298S0100000_17 agS298S0100000_17, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        long j;
        C1142020fpA c1142020fpA = (C1142020fpA) obj;
        C1127050fR1 c1127050fR1Invoke = ((C1129000fUA) agS298S0100000_17.l0).LIZLLL.invoke();
        if (c1127050fR1Invoke != null) {
            C1136870fgr c1136870fgr = c1142020fpA.LIZ;
            if (c1136870fgr != null) {
                j = c1136870fgr.LIZ;
            } else {
                j = 0;
            }
            long j2 = c1127050fR1Invoke.LLILZLL;
            if (j != j2 || c1142020fpA.LIZJ != c1127050fR1Invoke.LLIZ) {
                c1127050fR1Invoke.LLLILZLLLI(j2);
                c1127050fR1Invoke.LLLILZLLLI(j);
                c1127050fR1Invoke.LLILZLL = j;
                c1127050fR1Invoke.LLIZ = c1142020fpA.LIZJ;
            }
        }
        InterfaceC1127990fSX interfaceC1127990fSXInvoke = ((C1129000fUA) agS298S0100000_17.l0).LJ.invoke();
        if (interfaceC1127990fSXInvoke != null) {
            interfaceC1127990fSXInvoke.LIZLLL(c1142020fpA);
        }
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS298S0100000_17 agS298S0100000_17, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        try {
            ((C1128950fU5) agS298S0100000_17.l0).LJI.LIZ((C1129150fUP) obj);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20441214yg.LJFF("GiftMVI.Delegate", "[Entry] onStateChanged threw - state stays ACTIVE, continue collecting", e2);
        }
        return Unit.LIZ;
    }

    public static final Object emit$2(AgS298S0100000_17 agS298S0100000_17, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        EnumC187400no enumC187400noVQ2;
        C1088660eR6 c1088660eR6;
        int value;
        AudienceRankingEntranceViewModel viewModel;
        C148100hT c148100hT = (C148100hT) obj;
        C20441214yg.LIZIZ("OnlineAudienceRankWidget", "Received ranking data update from ViewModel");
        C1105320ery c1105320ery = ((OnlineAudienceRankWidget) agS298S0100000_17.l0).LLILZ;
        if ((c1105320ery instanceof C01VE) && c1105320ery != null) {
            c1105320ery.LIZIZ(c148100hT);
        }
        C1105320ery c1105320ery2 = ((OnlineAudienceRankWidget) agS298S0100000_17.l0).LLILZ;
        if ((c1105320ery2 instanceof C1105320ery) && c1105320ery2 != null) {
            LiveTopBuyerEntranceGuideAnimationSetting liveTopBuyerEntranceGuideAnimationSetting = LiveTopBuyerEntranceGuideAnimationSetting.INSTANCE;
            if (liveTopBuyerEntranceGuideAnimationSetting.getValue()) {
                InterfaceC1105450esB interfaceC1105450esB = c1105320ery2.LLILLJJLI;
                if (interfaceC1105450esB != null && (viewModel = interfaceC1105450esB.getViewModel()) != null) {
                    enumC187400noVQ2 = viewModel.vQ2();
                } else {
                    enumC187400noVQ2 = null;
                }
                EnumC187400no enumC187400no = EnumC187400no.TOP_BUYER;
                if (enumC187400noVQ2 == enumC187400no && !c1105320ery2.LLJJIJI) {
                    c1105320ery2.LLJJIJI = true;
                    C1088730eRD c1088730eRD = c1105320ery2.LLJJJJ;
                    if (c1088730eRD != null && liveTopBuyerEntranceGuideAnimationSetting.getValue() && !Intrinsics.LJFF(c1088730eRD.LJFF.LIZ(), Boolean.TRUE) && enumC187400noVQ2 == enumC187400no && !c1088730eRD.LJI && (((c1088660eR6 = c1088730eRD.LJ) == null || !c1088660eR6.LLJ || c1088660eR6.LLIZLLLIL) && c1088730eRD.LIZLLL == null)) {
                        c1088730eRD.LJI = true;
                        DataChannel dataChannel = c1088730eRD.LIZ;
                        if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
                            value = LiveTopBuyerEntranceGuideAnimationAnchorTimeSetting.INSTANCE.getValue();
                        } else {
                            value = LiveTopBuyerEntranceGuideAnimationAudienceTimeSetting.INSTANCE.getValue();
                        }
                        ARunnableS117S0100000_17 aRunnableS117S0100000_17 = c1088730eRD.LIZJ;
                        if (aRunnableS117S0100000_17 != null) {
                            c1088730eRD.LJII.removeCallbacks(aRunnableS117S0100000_17);
                        }
                        c1088730eRD.LIZJ = null;
                        ARunnableS117S0100000_17 aRunnableS117S0100000_172 = new ARunnableS117S0100000_17(c1088730eRD, 249);
                        C786410Ut5.LJLIIL(value, c1088730eRD.LJII, aRunnableS117S0100000_172);
                        c1088730eRD.LIZJ = aRunnableS117S0100000_172;
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
