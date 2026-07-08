package com.bytedance.android.live.liveinteract.competition.game.playing;

import X.AbstractC981930bex;
import X.AbstractC982800bgM;
import X.C0J1N;
import X.C0UO0;
import X.C1161920gLG;
import X.C118300cf;
import X.C11RD;
import X.C1C7U;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C480460Ism;
import X.C500260Jjc;
import X.C748880TZe;
import X.C768790UDt;
import X.C769470UGj;
import X.C769500UGm;
import X.C914770Zud;
import X.C915980Zwa;
import X.C948560an8;
import X.C950220apo;
import X.C956380azk;
import X.C963580bBM;
import X.C973850bRv;
import X.C973910bS1;
import X.C974560bT4;
import X.C982460bfo;
import X.C982470bfp;
import X.C982580bg0;
import X.C982760bgI;
import X.C982790bgL;
import X.C982880bgU;
import X.C983300bhA;
import X.C983560bha;
import X.C983670bhl;
import X.EnumC2010107u7;
import X.EnumC919170a1j;
import X.EnumC962960bAM;
import X.EnumC975850bV9;
import X.EnumC977660bY4;
import X.EnumC982500bfs;
import X.EnumC983140bgu;
import X.InterfaceC981940bey;
import X.InterfaceC983470bhR;
import Y.ARunnableS84S0200000_15;
import Y.AfS109S0300000_15;
import Y.AfS151S0200000_15;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.event.MatchCutShortEvent;
import com.bytedance.android.live.liveinteract.competition.api.CompetitionApi;
import com.bytedance.android.live.liveinteract.competition.core.model.bizextra.CatchBeansDropBeanInfo;
import com.bytedance.android.live.liveinteract.competition.game.event.BeansAvatarEvent;
import com.bytedance.android.live.liveinteract.competition.game.event.DropBeanEvent;
import com.bytedance.android.live.liveinteract.competition.game.event.DropComboBombEvent;
import com.bytedance.android.live.liveinteract.competition.game.event.GameComboTriggerChannel;
import com.bytedance.android.live.liveinteract.competition.game.event.GameReady;
import com.bytedance.android.live.liveinteract.competition.game.event.GameScoreUpdateChannel;
import com.bytedance.android.live.liveinteract.competition.model.BeansUpdateScoreParams;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionCommon;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionFinishParams;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionLeaveParams;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionUserBase;
import com.bytedance.android.live.liveinteract.competition.states.event.CompetitionStateTransitCountdownEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchBeansSettings;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS11S0300100_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public class CatchBeansPlayingCoordinatorAnchor extends AbstractC981930bex implements InterfaceC983470bhR {
    public final DataChannel LIZLLL;
    public LinkDialog LJ;
    public boolean LJFF;
    public long LJI;
    public final List<BeansUpdateScoreParams.DropCaught> LJII;
    public int LJIIIIZZ;
    public long LJIIIZ;
    public final AwS594S0100000_15 LJIIJ;
    public final CatchBeansPlayingCoordinatorAnchor$handler$1 LJIIJJI;
    public final ARunnableS84S0200000_15 LJIIL;

    @Override // X.InterfaceC983470bhR
    public final void LJJIIJ(int i, long j, Function1 function1, Function1 function12) {
    }

    @Override // X.InterfaceC983130bgt
    public final void LJJIJL(C982460bfo c982460bfo, AbstractC982800bgM abstractC982800bgM, EnumC975850bV9 enumC975850bV9) {
    }

    public void LJJJJL(C982760bgI c982760bgI) {
    }

    public final int LJJJJJL() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View viewFindViewById = this.LIZ.findViewById(R.id.mbw);
        if (viewFindViewById == null) {
            return -1;
        }
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        return ((!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) ? 0 : marginLayoutParams.topMargin) + (viewFindViewById.getHeight() / 2);
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public void LIZIZ() {
        super.LIZIZ();
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        removeMessages(4736);
        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJIIIIZZ(this.LJIIJ);
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LJFF() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismiss and coordinator = ");
        sbLIZ.append(this);
        C20441214yg.LIZIZ("CatchBeansPlayingCoordinatorAnchor", C2188811AlT.LIZIZ(sbLIZ));
        LinkDialog linkDialog = this.LJ;
        if (linkDialog != null) {
            linkDialog.dismiss();
        }
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LJJ() {
        DataChannel dataChannel;
        if (C963580bBM.LIZ() || (dataChannel = this.LIZLLL) == null) {
            return;
        }
        dataChannel.zW(LinkCrossRoomStateChangeEvent.class, new C956380azk(8, "CatchBeansPlayingCoordinatorAnchor , onForceTerminated"));
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public void LIZ(AbstractC982800bgM abstractC982800bgM) {
        C983670bhl c983670bhl;
        List<Long> list;
        if ((abstractC982800bgM instanceof C983670bhl) && (list = (c983670bhl = (C983670bhl) abstractC982800bgM).LJI) != null && list.contains(Long.valueOf(C950220apo.LJFF()))) {
            C768790UDt c768790UDt = new C768790UDt(c983670bhl.LJFF);
            DataChannel dataChannel = this.LIZLLL;
            if (dataChannel != null) {
                dataChannel.LC0(DropComboBombEvent.class, c768790UDt);
            }
            new C982790bgL().LJJJJJL(EnumC2010107u7.BE_DROP_BOMB);
        }
        if (abstractC982800bgM instanceof C982880bgU) {
            for (CatchBeansDropBeanInfo catchBeansDropBeanInfo : ((C982880bgU) abstractC982800bgM).LJFF) {
                if (catchBeansDropBeanInfo.anchorId == C950220apo.LJFF()) {
                    long j = catchBeansDropBeanInfo.numberComments;
                    List arrayList = catchBeansDropBeanInfo.gifts;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    C769500UGm c769500UGm = new C769500UGm(arrayList, j, catchBeansDropBeanInfo.version);
                    DataChannel dataChannel2 = this.LIZLLL;
                    if (dataChannel2 != null) {
                        dataChannel2.LC0(DropBeanEvent.class, c769500UGm);
                    }
                    new C982790bgL().LJJJJJL(EnumC2010107u7.BE_DROP_BEAN);
                }
            }
        }
        if (abstractC982800bgM instanceof C982580bg0) {
            new C982790bgL().LJJJJJL(EnumC2010107u7.BE_RECEIVE_AVATAR);
            C982580bg0 c982580bg0 = (C982580bg0) abstractC982800bgM;
            C769470UGj c769470UGj = new C769470UGj(c982580bg0.LJFF, c982580bg0.LJI, c982580bg0.LJII, System.currentTimeMillis());
            DataChannel dataChannel3 = this.LIZLLL;
            if (dataChannel3 != null) {
                dataChannel3.LC0(BeansAvatarEvent.class, c769470UGj);
            }
        }
    }

    @Override // X.InterfaceC983130bgt
    public final void LJII(int i) {
        LJJJJJ();
        if (C973910bS1.LIZ(LJJJJJ().LJIIIZ)) {
            C20441214yg.LIZIZ("CatchBeansPlayingCoordinatorAnchor", "post MatchCutShortEvent, had showed, return");
            return;
        }
        LJJJJJ();
        C973910bS1.LJ.put(Long.valueOf(LJJJJJ().LJIIIZ), Boolean.TRUE);
        if (i == EnumC982500bfs.LOSE.getType()) {
            C20441214yg.LJIIIZ("CatchBeansPlayingCoordinatorAnchor", "post MatchCutShortEvent, lose");
            DataChannel dataChannel = this.LIZ.dataChannel;
            if (dataChannel != null) {
                dataChannel.LC0(MatchCutShortEvent.class, new C948560an8(LJJJJJL(), true, EnumC919170a1j.MATCH_TYPE_CATCH_BEANS.getType(), 4));
                return;
            }
            return;
        }
        if (i == EnumC982500bfs.WIN.getType()) {
            C20441214yg.LJIIIZ("CatchBeansPlayingCoordinatorAnchor", "post MatchCutShortEvent, win");
            DataChannel dataChannel2 = this.LIZ.dataChannel;
            if (dataChannel2 == null) {
                return;
            }
            dataChannel2.LC0(MatchCutShortEvent.class, new C948560an8(LJJJJJL(), false, EnumC919170a1j.MATCH_TYPE_CATCH_BEANS.getType(), 4));
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("postShowCutShortEventByResult, result = ");
        sbLIZ.append(i);
        C20441214yg.LJ("CatchBeansPlayingCoordinatorAnchor", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.live.liveinteract.competition.game.playing.CatchBeansPlayingCoordinatorAnchor$handler$1] */
    public CatchBeansPlayingCoordinatorAnchor(MatchBaseWidget matchBaseWidget, InterfaceC981940bey interfaceC981940bey) {
        super(matchBaseWidget, interfaceC981940bey);
        this.LIZLLL = matchBaseWidget.provideDataChannel();
        this.LJII = new ArrayList();
        this.LJIIIIZZ = -10000;
        this.LJIIIZ = -1L;
        this.LJIIJ = new AwS594S0100000_15(this, 106);
        final Looper mainLooper = Looper.getMainLooper();
        this.LJIIJJI = new BPEAHandler(mainLooper) { // from class: com.bytedance.android.live.liveinteract.competition.game.playing.CatchBeansPlayingCoordinatorAnchor$handler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("CatchBeansPlayingCoordinatorAnchor@ec60.handler$1");
                if (message.what == 4736) {
                    this.LL.LJIIL.run();
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 4736;
                    sendMessageDelayed(messageObtain, ((long) LiveMatchBeansSettings.INSTANCE.getScoreSyncIntervalInSecs()) * 1000);
                } else {
                    super.handleMessage(message);
                }
                C1C7U.LIZIZ("CatchBeansPlayingCoordinatorAnchor@ec60.handler$1");
            }
        };
        this.LJIIL = new ARunnableS84S0200000_15(this, matchBaseWidget, 9);
    }

    @Override // X.InterfaceC983130bgt
    public final void LJIJ(long j, AwS381S0200000_15 awS381S0200000_15, AwS594S0100000_15 awS594S0100000_15) {
        long channelId = C915980Zwa.LJII().getChannelId();
        new C974560bT4().LJJIL(LJJJJJ().LJJIJ.LIZJ(), LJJJJJ().LJJIJ.LJIILJJIL, true);
        C974560bT4 c974560bT4 = new C974560bT4();
        C480460Ism.LIZ().getClass();
        CompetitionApi competitionApi = (CompetitionApi) C480460Ism.LIZLLL(CompetitionApi.class);
        CompetitionFinishParams competitionFinishParams = new CompetitionFinishParams();
        CompetitionCommon competitionCommon = new CompetitionCommon();
        competitionCommon.type = EnumC962960bAM.CATCH_BEANS.getType();
        competitionCommon.channelId = channelId;
        competitionCommon.competitionId = j;
        competitionFinishParams.bizCommon = competitionCommon;
        ((C0J1N) competitionApi.competitionFinish(competitionFinishParams).LJIILIIL(new C0UO0()).LIZJ(C11RD.LJ(this.LIZ))).LIZ(new AfS151S0200000_15(c974560bT4, awS381S0200000_15, 72), new AfS109S0300000_15(awS594S0100000_15, c974560bT4, this, 28));
    }

    @Override // X.InterfaceC983470bhR
    public final void LJIJI(long j, String str, Function2<? super EnumC983140bgu, ? super Long, Unit> function2) {
        EnumC977660bY4 enumC977660bY4;
        LinkDialog linkDialog = this.LJ;
        FragmentManager fragmentManager = null;
        if (linkDialog != null && C500260Jjc.LJJJI(Boolean.valueOf(linkDialog.isVisible()))) {
            LinkDialog linkDialog2 = this.LJ;
            if (linkDialog2 == null || (enumC977660bY4 = linkDialog2.LLILZIL) == null) {
                enumC977660bY4 = null;
            }
            if (enumC977660bY4 == EnumC977660bY4.CATCH_BEANS_MANAGEMENT_PANEL_ANCHOR) {
                C20441214yg.LJ("CatchBeansPlayingCoordinatorAnchor", "managementDialog is showing, we don't need to create one again");
                return;
            } else if (linkDialog2 != null) {
                linkDialog2.dismiss();
            }
        }
        MatchBaseWidget matchBaseWidget = this.LIZ;
        AwS629S0100000_15 awS629S0100000_15 = new AwS629S0100000_15(function2, (Function2<? super EnumC983140bgu, ? super Long, Unit>) 14);
        LinkDialog linkDialog3 = new LinkDialog(matchBaseWidget);
        EnumC977660bY4 enumC977660bY42 = EnumC977660bY4.CATCH_BEANS_MANAGEMENT_PANEL_ANCHOR;
        C983560bha c983560bha = new C983560bha();
        c983560bha.LIZIZ = awS629S0100000_15;
        linkDialog3.LLILZIL = enumC977660bY42;
        linkDialog3.LLILZLL = c983560bha;
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel != null) {
            fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
        }
        linkDialog3.show(fragmentManager, "LinkDialog");
        this.LJ = linkDialog3;
    }

    public void LJIJJLI(C982460bfo c982460bfo, AbstractC982800bgM abstractC982800bgM, EnumC975850bV9 enumC975850bV9) {
        if (abstractC982800bgM instanceof C982470bfp) {
            long jLIZ = ((C982470bfp) abstractC982800bgM).LJIIIIZZ.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("remaining countdown seconds = ");
            sbLIZ.append(jLIZ);
            C20441214yg.LIZIZ("CatchBeansPlayingCoordinatorAnchor", C2188811AlT.LIZIZ(sbLIZ));
            DataChannel dataChannel = this.LIZLLL;
            if (dataChannel != null) {
                dataChannel.zW(CompetitionStateTransitCountdownEvent.class, new C983300bhA("CompetitionStartMessage", jLIZ));
            }
        }
        DataChannel dataChannel2 = this.LIZLLL;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(GameComboTriggerChannel.class, this, new AwS594S0100000_15(this, 1171));
        }
        DataChannel dataChannel3 = this.LIZLLL;
        if (dataChannel3 != null) {
            dataChannel3.CQ2(GameReady.class, this, new AwS594S0100000_15(this, 1172));
        }
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = -10000;
        DataChannel dataChannel4 = this.LIZLLL;
        if (dataChannel4 != null) {
            dataChannel4.CQ2(GameScoreUpdateChannel.class, this, new AwS381S0200000_15(c118300cf, this, 169));
        }
        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJIIJJI(this.LJIIJ);
        C914770Zud.LIZ("match_info", C2097608Jq.LJIIJ(new Pair("match_type", String.valueOf(LJJJJJ().LJIIIIZZ.getType())), new Pair("competition_id", String.valueOf(LJJJJJ().LJIIIZ)), new Pair("match_stage", String.valueOf(C973850bRv.LIZ()))), true);
    }

    @Override // X.InterfaceC983130bgt
    public final void LJJJI(long j, long j2, long j3, String str, AwS11S0300100_15 awS11S0300100_15, AwS594S0100000_15 awS594S0100000_15) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestLinkMicLeaveApi on CatchBeansPlayingCoordinatorAnchor, leaveAnchorId = ");
        sbLIZ.append(j3);
        C20441214yg.LIZIZ("CatchBeansPlayingCoordinatorAnchor", C2188811AlT.LIZIZ(sbLIZ));
        new C974560bT4().LJJIJLIJ(LJJJJJ().LJJIJ.LIZIZ(), LJJJJJ().LJJIJ.LJIILJJIL, LJJJJJ().LJJI);
        C974560bT4 c974560bT4 = new C974560bT4();
        C480460Ism.LIZ().getClass();
        CompetitionApi competitionApi = (CompetitionApi) C480460Ism.LIZLLL(CompetitionApi.class);
        CompetitionLeaveParams competitionLeaveParams = new CompetitionLeaveParams();
        CompetitionCommon competitionCommon = new CompetitionCommon();
        competitionCommon.type = EnumC962960bAM.CATCH_BEANS.getType();
        competitionCommon.channelId = j2;
        competitionCommon.competitionId = j;
        competitionLeaveParams.bizCommon = competitionCommon;
        CompetitionUserBase competitionUserBase = new CompetitionUserBase();
        competitionUserBase.userId = j3;
        competitionUserBase.role = 1;
        competitionLeaveParams.leaveUser = competitionUserBase;
        competitionApi.competitionLeave(competitionLeaveParams).LJIILIIL(new C0UO0()).LJJLL(new AfS109S0300000_15(this, c974560bT4, awS11S0300100_15, 27), new AfS151S0200000_15(awS594S0100000_15, c974560bT4, 71));
    }
}
