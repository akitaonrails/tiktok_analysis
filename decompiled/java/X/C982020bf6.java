package X;

import Y.AfS109S0300000_15;
import Y.AfS151S0200000_15;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.api.event.MatchCutShortEvent;
import com.bytedance.android.live.liveinteract.competition.api.CompetitionApi;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionCommon;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionFinishParams;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionLeaveParams;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionUserBase;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.model.message.LinkMicBattleNoticeMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeAnchorGiftGuide;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeText;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS11S0300100_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0bf6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C982020bf6 extends AbstractC981930bex implements InterfaceC983130bgt {
    public final DataChannel LIZLLL;
    public boolean LJ;

    public void LJIJJLI(C982460bfo c982460bfo, AbstractC982800bgM abstractC982800bgM, EnumC975850bV9 enumC975850bV9) {
    }

    public void LJJIJL(C982460bfo c982460bfo, AbstractC982800bgM abstractC982800bgM, EnumC975850bV9 enumC975850bV9) {
    }

    private final int LJJJJJL() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View viewFindViewById = this.LIZ.findViewById(R.id.mbw);
        if (viewFindViewById == null) {
            return -1;
        }
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        return ((!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) ? 0 : marginLayoutParams.topMargin) + (viewFindViewById.getHeight() / 2);
    }

    @Override // X.InterfaceC983130bgt
    public final void LJIIIIZZ() {
        IMessageManager iMessageManager;
        BattleNoticeAnchorGiftGuide battleNoticeAnchorGiftGuide = new BattleNoticeAnchorGiftGuide();
        BattleNoticeText battleNoticeText = new BattleNoticeText();
        battleNoticeText.text = C497740JfY.LJIJI(2131842752);
        battleNoticeAnchorGiftGuide.content = battleNoticeText;
        LinkMicBattleNoticeMessage linkMicBattleNoticeMessage = new LinkMicBattleNoticeMessage();
        CommonMessageData commonMessageData = new CommonMessageData();
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LIZLLL);
        commonMessageData.roomId = roomLJJLIIIIJ != null ? roomLJJLIIIIJ.getId() : 0L;
        commonMessageData.showMsg = true;
        linkMicBattleNoticeMessage.baseMessage = commonMessageData;
        linkMicBattleNoticeMessage.noticeType = 3;
        linkMicBattleNoticeMessage.anchorGiftGuide = battleNoticeAnchorGiftGuide;
        linkMicBattleNoticeMessage.LL = true;
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel == null || (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) == null) {
            return;
        }
        iMessageManager.insertMessage(linkMicBattleNoticeMessage);
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public void LJFF() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismiss and coordinator = ");
        sbLIZ.append(this);
        C20441214yg.LIZIZ("TakeStagePlayBaseCoordinator", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC983130bgt
    public final void LJII(int i) {
        DataChannel dataChannel;
        C20441214yg.LJIIIZ("TakeStagePlayBaseCoordinator", "post MatchCutShortEvent");
        LJJJJJ();
        if (C973910bS1.LIZ(LJJJJJ().LJIIIZ)) {
            C20441214yg.LIZIZ("TakeStagePlayBaseCoordinator", "post MatchCutShortEvent, had showed, return");
            return;
        }
        LJJJJJ();
        C973910bS1.LJ.put(Long.valueOf(LJJJJJ().LJIIIZ), Boolean.TRUE);
        if (i == 1) {
            DataChannel dataChannel2 = this.LIZ.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.LC0(MatchCutShortEvent.class, new C948560an8(LJJJJJL(), true, 0, 12));
                return;
            }
            return;
        }
        if (i == 0 && (dataChannel = this.LIZ.dataChannel) != null) {
            dataChannel.LC0(MatchCutShortEvent.class, new C948560an8(LJJJJJL(), false, 0, 12));
        }
    }

    public C982020bf6(MatchBaseWidget matchBaseWidget, InterfaceC981940bey interfaceC981940bey) {
        super(matchBaseWidget, interfaceC981940bey);
        this.LIZLLL = matchBaseWidget.provideDataChannel();
    }

    @Override // X.InterfaceC983130bgt
    public final void LJIJ(long j, AwS381S0200000_15 awS381S0200000_15, AwS594S0100000_15 awS594S0100000_15) {
        long channelId = C915980Zwa.LJII().getChannelId();
        LJJJJJ().LJJIJ.LJIILJJIL = "disconnect_pk";
        new C974560bT4().LJJIL(LJJJJJ().LJJIJ.LIZJ(), LJJJJJ().LJJIJ.LJIILJJIL, true);
        C974560bT4 c974560bT4 = new C974560bT4();
        C480460Ism.LIZ().getClass();
        CompetitionApi competitionApi = (CompetitionApi) C480460Ism.LIZLLL(CompetitionApi.class);
        CompetitionFinishParams competitionFinishParams = new CompetitionFinishParams();
        CompetitionCommon competitionCommon = new CompetitionCommon();
        competitionCommon.type = EnumC962960bAM.TAKE_THE_STAGE.getType();
        competitionCommon.channelId = channelId;
        competitionCommon.competitionId = j;
        competitionFinishParams.bizCommon = competitionCommon;
        ((C0J1N) competitionApi.competitionFinish(competitionFinishParams).LJIILIIL(new C0UO0()).LIZJ(C11RD.LJ(this.LIZ))).LIZ(new AfS151S0200000_15(c974560bT4, awS381S0200000_15, 5), new AfS109S0300000_15(awS594S0100000_15, c974560bT4, this, 1));
    }

    @Override // X.InterfaceC983130bgt
    public final void LJJJI(long j, long j2, long j3, String str, AwS11S0300100_15 awS11S0300100_15, AwS594S0100000_15 awS594S0100000_15) {
        ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground();
        String str2 = C954660awy.LJFF;
        LJJJJJ().LJJIJ.LJIILJJIL = str;
        new C974560bT4().LJJIJLIJ(LJJJJJ().LJJIJ.LIZIZ(), LJJJJJ().LJJIJ.LJIILJJIL, LJJJJJ().LJJI);
        C974560bT4 c974560bT4 = new C974560bT4();
        C930480aJy c930480aJy = C930480aJy.LIZ;
        C480460Ism.LIZ().getClass();
        CompetitionApi competitionApi = (CompetitionApi) C480460Ism.LIZLLL(CompetitionApi.class);
        CompetitionLeaveParams competitionLeaveParams = new CompetitionLeaveParams();
        CompetitionCommon competitionCommon = new CompetitionCommon();
        competitionCommon.type = EnumC962960bAM.TAKE_THE_STAGE.getType();
        competitionCommon.channelId = j2;
        competitionCommon.competitionId = j;
        competitionLeaveParams.bizCommon = competitionCommon;
        CompetitionUserBase competitionUserBase = new CompetitionUserBase();
        competitionUserBase.userId = j3;
        competitionUserBase.role = 1;
        competitionLeaveParams.leaveUser = competitionUserBase;
        InterfaceC420801kM interfaceC420801kMLJJLL = competitionApi.competitionLeave(competitionLeaveParams).LJIILIIL(new C0UO0()).LJJLL(new AfS109S0300000_15(this, c974560bT4, awS11S0300100_15, 0), new AfS151S0200000_15(awS594S0100000_15, c974560bT4, 4));
        C11NJ c11njLJJJJIZL = LJJJJIZL();
        c930480aJy.getClass();
        c11njLJJJJIZL.LIZ(interfaceC420801kMLJJLL);
    }
}
