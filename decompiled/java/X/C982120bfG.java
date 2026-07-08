package X;

import Y.AfS16S0310000_15;
import com.bytedance.android.live.liveinteract.competition.api.CompetitionApi;
import com.bytedance.android.live.liveinteract.competition.game.event.GameRivalTeamMaxComboUpdateChannel;
import com.bytedance.android.live.liveinteract.competition.game.event.GameSelfTeamMaxComboUpdateChannel;
import com.bytedance.android.live.liveinteract.competition.game.event.GameSettlementStart;
import com.bytedance.android.live.liveinteract.competition.game.playing.CatchBeansPlayingCoordinatorAnchor;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionCommon;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSettlementEndParams;
import com.bytedance.android.live.liveinteract.competition.states.event.CompetitionStateTransitCountdownEvent;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageSettlementClockDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchBeansSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0bfG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982120bfG extends CatchBeansPlayingCoordinatorAnchor implements InterfaceC983270bh7 {
    public boolean LJIILIIL;
    public boolean LJIILJJIL;

    @Override // com.bytedance.android.live.liveinteract.competition.game.playing.CatchBeansPlayingCoordinatorAnchor, X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LIZIZ() {
        super.LIZIZ();
        LJFF();
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.competition.game.playing.CatchBeansPlayingCoordinatorAnchor
    public final void LJJJJL(C982760bgI c982760bgI) {
        DataChannel dataChannel;
        if (c982760bgI.LIZJ) {
            this.LJIILIIL = true;
            C20441214yg.LIZIZ("CatchBeansSettlementCoordinatorAnchor", "self final score received");
        }
        if (c982760bgI.LJ) {
            this.LJIILJJIL = true;
            C20441214yg.LIZIZ("CatchBeansSettlementCoordinatorAnchor", "rival final score received");
        }
        if (this.LJIILIIL && this.LJIILJJIL && (dataChannel = this.LIZLLL) != null) {
            dataChannel.zW(CompetitionStateTransitCountdownEvent.class, new C983300bhA("CatchBeansSettlementCoordinatorAnchor_doIfNeedOnStateDidEnter", 0L));
        }
    }

    public C982120bfG(MatchBaseWidget matchBaseWidget, InterfaceC981940bey interfaceC981940bey) {
        super(matchBaseWidget, interfaceC981940bey);
    }

    @Override // com.bytedance.android.live.liveinteract.competition.game.playing.CatchBeansPlayingCoordinatorAnchor, X.InterfaceC983130bgt
    public final void LJIJJLI(C982460bfo c982460bfo, AbstractC982800bgM abstractC982800bgM, EnumC975850bV9 enumC975850bV9) {
        super.LJIJJLI(c982460bfo, abstractC982800bgM, enumC975850bV9);
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel != null) {
            dataChannel.LC0(GameSettlementStart.class, Boolean.TRUE);
        }
        C013C c013c = new C013C();
        EnumC962960bAM enumC962960bAM = LJJJJJ().LJIIIIZZ;
        EnumC982850bgR enumC982850bgR = EnumC982850bgR.SETTLEMENT;
        long jLJ = C950220apo.LJ();
        long value = LJJJJJ().LJIIJ.LJII;
        if (value <= 0) {
            value = LiveCoHostTakeTheStageSettlementClockDurationSetting.INSTANCE.getValue();
        }
        C982320bfa.LIZ(enumC962960bAM, enumC982850bgR, jLJ, 0L, LiveMatchBeansSettings.INSTANCE.getWaitingFinalScoreMaxDurationInSecs() + value, true, new AwS381S0200000_15(this, c013c, 198), new AwS559S0100000_15(this, 1234));
    }

    @Override // X.InterfaceC983270bh7
    public final void LJJIIZI(long j, String str, Function2<? super EnumC983140bgu, ? super Long, Unit> function2) {
        LJIJI(j, str, function2);
    }

    @Override // X.InterfaceC983270bh7
    public final void LJJIIJZLJL(long j, long j2, long j3, int i, C982230bfR c982230bfR, C982370bff c982370bff) {
        Room roomLJJLIIIIJ;
        long j4;
        Long l;
        Long l2;
        if (this.LJFF) {
            return;
        }
        this.LJFF = true;
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel != null) {
            roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
        } else {
            roomLJJLIIIIJ = null;
        }
        new C974560bT4().LJJIIZ(C974540bT2.LJJIJIIJI(i, j3, roomLJJLIIIIJ), LJJJJJ().LJJIJ.LIZIZ());
        C974560bT4 c974560bT4 = new C974560bT4();
        long jLIZLLL = C950220apo.LIZLLL();
        C930480aJy c930480aJy = C930480aJy.LIZ;
        C480460Ism.LIZ().getClass();
        CompetitionApi competitionApi = (CompetitionApi) C480460Ism.LIZLLL(CompetitionApi.class);
        CompetitionSettlementEndParams competitionSettlementEndParams = new CompetitionSettlementEndParams();
        CompetitionCommon competitionCommon = new CompetitionCommon();
        competitionCommon.type = EnumC962960bAM.CATCH_BEANS.getType();
        competitionCommon.channelId = j2;
        competitionCommon.competitionId = j;
        competitionCommon.roomId = jLIZLLL;
        competitionSettlementEndParams.bizCommon = competitionCommon;
        CompetitionSettlementEndParams.BeansBiz beansBiz = new CompetitionSettlementEndParams.BeansBiz();
        Iterator<T> it2 = LJJJJJ().LJIILLIIL.keySet().iterator();
        while (it2.hasNext()) {
            long jLongValue = ((Number) it2.next()).longValue();
            CompetitionSettlementEndParams.BeansBiz.AnchorInfo anchorInfo = new CompetitionSettlementEndParams.BeansBiz.AnchorInfo();
            C982390bfh c982390bfh = LJJJJJ().LJIILLIIL.get(Long.valueOf(jLongValue));
            long jLongValue2 = 0;
            if (c982390bfh != null) {
                j4 = c982390bfh.LIZIZ;
            } else {
                j4 = 0;
            }
            anchorInfo.score = j4;
            anchorInfo.anchorId = jLongValue;
            if (jLongValue == C950220apo.LJ()) {
                DataChannel dataChannel2 = this.LIZLLL;
                if (dataChannel2 != null && (l2 = (Long) dataChannel2.gg0(GameSelfTeamMaxComboUpdateChannel.class)) != null) {
                    jLongValue2 = l2.longValue();
                }
                anchorInfo.maxCombo = jLongValue2;
            } else {
                DataChannel dataChannel3 = this.LIZLLL;
                if (dataChannel3 != null && (l = (Long) dataChannel3.gg0(GameRivalTeamMaxComboUpdateChannel.class)) != null) {
                    jLongValue2 = l.longValue();
                }
                anchorInfo.maxCombo = jLongValue2;
            }
            beansBiz.anchorsInfo.add(anchorInfo);
        }
        competitionSettlementEndParams.beansBiz = beansBiz;
        InterfaceC420801kM interfaceC420801kMLJJLL = competitionApi.competitionSettlementEnd(competitionSettlementEndParams).LJIILIIL(new C0UO0()).LJJLL(new AfS16S0310000_15(this, c974560bT4, c982230bfR, 4), new AfS16S0310000_15(this, c974560bT4, c982370bff, 5));
        C11NJ c11njLJJJJIZL = LJJJJIZL();
        c930480aJy.getClass();
        c11njLJJJJIZL.LIZ(interfaceC420801kMLJJLL);
    }
}
