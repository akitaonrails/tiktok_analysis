package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.event.MatchCutShortEvent;
import com.bytedance.android.live.liveinteract.competition.game.event.GameScoreUpdateChannel;
import com.bytedance.android.live.liveinteract.competition.states.event.CompetitionStateTransitCountdownEvent;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.model.message.LinkMicBattleNoticeMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeAnchorGiftGuide;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeText;
import com.bytedance.android.livesdk.sei.LiveSeiStruct;
import com.bytedance.android.livesdk.sei.MatchGameSeiInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS11S0300100_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bf5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C982010bf5 extends AbstractC981930bex implements InterfaceC983920biA {
    public final DataChannel LIZLLL;

    @Override // X.InterfaceC983130bgt
    public final void LJIJ(long j, AwS381S0200000_15 awS381S0200000_15, AwS594S0100000_15 awS594S0100000_15) {
    }

    @Override // X.InterfaceC983470bhR
    public final void LJIJI(long j, String str, Function2<? super EnumC983140bgu, ? super Long, Unit> function2) {
    }

    @Override // X.InterfaceC983470bhR
    public final void LJJIIJ(int i, long j, Function1 function1, Function1 function12) {
    }

    @Override // X.InterfaceC983130bgt
    public final void LJJJI(long j, long j2, long j3, String str, AwS11S0300100_15 awS11S0300100_15, AwS594S0100000_15 awS594S0100000_15) {
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
        battleNoticeText.text = C497740JfY.LJIJI(2131851649);
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
    public void LIZIZ() {
        super.LIZIZ();
        LJFF();
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LJFF() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismiss and coordinator = ");
        sbLIZ.append(this);
        C20441214yg.LIZIZ("CatchBeansPlayingCoordinatorAudience", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LJJ() {
        DataChannel dataChannel;
        if (C963580bBM.LIZ() || (dataChannel = this.LIZLLL) == null) {
            return;
        }
        dataChannel.zW(LinkCrossRoomStateChangeEvent.class, new C956380azk(8, "CatchBeansPlayingCoordinatorAudience , onForceTerminated"));
    }

    @Override // X.InterfaceC983130bgt
    public final void LJII(int i) {
        LJJJJJ();
        if (C973910bS1.LIZ(LJJJJJ().LJIIIZ)) {
            C20441214yg.LIZIZ("CatchBeansPlayingCoordinatorAudience", "post MatchCutShortEvent, had showed, return");
            return;
        }
        LJJJJJ();
        C973910bS1.LJ.put(Long.valueOf(LJJJJJ().LJIIIZ), Boolean.TRUE);
        if (i == EnumC982500bfs.LOSE.getType()) {
            C20441214yg.LJIIIZ("CatchBeansPlayingCoordinatorAudience", "post MatchCutShortEvent, lose");
            DataChannel dataChannel = this.LIZ.dataChannel;
            if (dataChannel != null) {
                dataChannel.LC0(MatchCutShortEvent.class, new C948560an8(LJJJJJL(), true, EnumC919170a1j.MATCH_TYPE_CATCH_BEANS.getType(), 4));
                return;
            }
            return;
        }
        if (i == EnumC982500bfs.WIN.getType()) {
            C20441214yg.LJIIIZ("CatchBeansPlayingCoordinatorAudience", "post MatchCutShortEvent, win");
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
        C20441214yg.LJ("CatchBeansPlayingCoordinatorAudience", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC983920biA
    public void LJIILL(C945320ahu c945320ahu) {
        String str;
        MatchGameSeiInfo matchGameSeiInfo;
        int i;
        User owner;
        MatchGameSeiInfo matchGameSeiInfo2;
        long id;
        String str2;
        int i2;
        int i3;
        User owner2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateAudienceInfoFromSEI");
        String str3 = null;
        if (c945320ahu != null) {
            str = c945320ahu.LIZIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C20441214yg.LIZIZ("CatchBeansPlayingCoordinatorAudience", C2188811AlT.LIZIZ(sbLIZ));
        long id2 = 0;
        int i4 = -10000;
        if (c945320ahu != null) {
            LiveSeiStruct liveSeiStruct = c945320ahu.LIZ;
            if (liveSeiStruct != null && (matchGameSeiInfo2 = liveSeiStruct.matchGameUpdateInfo) != null) {
                String str4 = matchGameSeiInfo2.linkMicId;
                IMultiHostService iMultiHostServiceLJII = C915980Zwa.LJII();
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                if (room != null && (owner2 = room.getOwner()) != null) {
                    id = owner2.getId();
                } else {
                    id = 0;
                }
                C954460awe c954460aweLLILL = iMultiHostServiceLJII.LLILL(id);
                if (c954460aweLLILL != null) {
                    str2 = c954460aweLLILL.LJIIJJI;
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str4, str2)) {
                    i2 = (int) matchGameSeiInfo2.score;
                    i3 = -10000;
                } else {
                    i2 = -10000;
                    i3 = (int) matchGameSeiInfo2.score;
                }
                C982760bgI c982760bgI = new C982760bgI(EnumC919170a1j.MATCH_TYPE_CATCH_BEANS, i2, false, i3, false, null, matchGameSeiInfo2.createTime);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateAudienceInfoFromSEI");
                sbLIZ2.append(", gameScore update, score=");
                sbLIZ2.append(c982760bgI);
                C20441214yg.LIZIZ("CatchBeansPlayingCoordinatorAudience", C2188811AlT.LIZIZ(sbLIZ2));
                DataChannel dataChannel = this.LIZLLL;
                if (dataChannel != null) {
                    dataChannel.zW(GameScoreUpdateChannel.class, c982760bgI);
                }
            }
            LiveSeiStruct liveSeiStruct2 = c945320ahu.LIZ;
            if (liveSeiStruct2 != null && (matchGameSeiInfo = liveSeiStruct2.matchGameFinalScore) != null) {
                String str5 = matchGameSeiInfo.linkMicId;
                IMultiHostService iMultiHostServiceLJII2 = C915980Zwa.LJII();
                Room room2 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                if (room2 != null && (owner = room2.getOwner()) != null) {
                    id2 = owner.getId();
                }
                C954460awe c954460aweLLILL2 = iMultiHostServiceLJII2.LLILL(id2);
                if (c954460aweLLILL2 != null) {
                    str3 = c954460aweLLILL2.LJIIJJI;
                }
                boolean zLJFF = Intrinsics.LJFF(str5, str3);
                if (zLJFF) {
                    i = (int) matchGameSeiInfo.score;
                } else {
                    i = -10000;
                    i4 = (int) matchGameSeiInfo.score;
                }
                C982760bgI c982760bgI2 = new C982760bgI(EnumC919170a1j.MATCH_TYPE_CATCH_BEANS, i, zLJFF, i4, !zLJFF, null, matchGameSeiInfo.createTime);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("updateAudienceInfoFromSEI");
                sbLIZ3.append(", gameScore update, score=");
                sbLIZ3.append(c982760bgI2);
                C20441214yg.LIZIZ("CatchBeansPlayingCoordinatorAudience", C2188811AlT.LIZIZ(sbLIZ3));
                DataChannel dataChannel2 = this.LIZLLL;
                if (dataChannel2 != null) {
                    dataChannel2.zW(GameScoreUpdateChannel.class, c982760bgI2);
                }
            }
        }
    }

    public C982010bf5(MatchBaseWidget matchBaseWidget, InterfaceC981940bey interfaceC981940bey) {
        super(matchBaseWidget, interfaceC981940bey);
        this.LIZLLL = matchBaseWidget.provideDataChannel();
    }

    @Override // X.InterfaceC983130bgt
    public final void LJIJJLI(C982460bfo c982460bfo, AbstractC982800bgM abstractC982800bgM, EnumC975850bV9 enumC975850bV9) {
        LJIIIIZZ();
    }

    @Override // X.InterfaceC983130bgt
    public void LJJIJL(C982460bfo c982460bfo, AbstractC982800bgM abstractC982800bgM, EnumC975850bV9 enumC975850bV9) {
        if (abstractC982800bgM instanceof C982470bfp) {
            long jLIZ = ((C982470bfp) abstractC982800bgM).LJIIIIZZ.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("remaining countdown seconds = ");
            sbLIZ.append(jLIZ);
            C20441214yg.LIZIZ("CatchBeansPlayingCoordinatorAudience", C2188811AlT.LIZIZ(sbLIZ));
            DataChannel dataChannel = this.LIZLLL;
            if (dataChannel != null) {
                dataChannel.zW(CompetitionStateTransitCountdownEvent.class, new C983300bhA("CompetitionStartMessage", jLIZ));
                return;
            }
            return;
        }
        if (c982460bfo == null) {
            return;
        }
        long jLIZ2 = c982460bfo.LJIIIIZZ.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("remaining countdown seconds = ");
        sbLIZ2.append(jLIZ2);
        C20441214yg.LIZIZ("CatchBeansPlayingCoordinatorAudience", C2188811AlT.LIZIZ(sbLIZ2));
        DataChannel dataChannel2 = this.LIZLLL;
        if (dataChannel2 == null) {
            return;
        }
        dataChannel2.zW(CompetitionStateTransitCountdownEvent.class, new C983300bhA("CompetitionStartMessage", jLIZ2));
    }
}
