package X;

import Y.AfS151S0200000_15;
import com.bytedance.android.live.liveinteract.competition.api.CompetitionApi;
import com.bytedance.android.live.liveinteract.competition.game.playing.CatchBeansPlayingCoordinatorAnchor;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionCommon;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionFinishParams;
import com.bytedance.android.live.liveinteract.competition.states.event.CompetitionStateTransitCountdownEvent;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0bfB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982070bfB extends CatchBeansPlayingCoordinatorAnchor implements InterfaceC983570bhb {
    @Override // com.bytedance.android.live.liveinteract.competition.game.playing.CatchBeansPlayingCoordinatorAnchor, X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LIZ(AbstractC982800bgM abstractC982800bgM) {
        if (!(abstractC982800bgM instanceof C982470bfp)) {
            super.LIZ(abstractC982800bgM);
        }
    }

    public C982070bfB(MatchBaseWidget matchBaseWidget, InterfaceC981940bey interfaceC981940bey) {
        super(matchBaseWidget, interfaceC981940bey);
    }

    @Override // X.InterfaceC983570bhb
    public final void LJIILLIIL(String str, Function2<? super EnumC983140bgu, ? super Long, Unit> function2) {
        LJIJI(0L, str, function2);
    }

    @Override // com.bytedance.android.live.liveinteract.competition.game.playing.CatchBeansPlayingCoordinatorAnchor, X.InterfaceC983130bgt
    public final void LJIJJLI(C982460bfo c982460bfo, AbstractC982800bgM abstractC982800bgM, EnumC975850bV9 enumC975850bV9) {
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel != null) {
            dataChannel.zW(CompetitionStateTransitCountdownEvent.class, new C983300bhA("CatchBeansPunishCoordinatorAnchor_doIfNeedOnStateDidEnter", LJJJJJ().LJIIJ.LJIIIZ - C158B.LIZJ()));
        }
        C914770Zud.LIZ("match_info", C2097608Jq.LJIIJ(new Pair("match_type", String.valueOf(LJJJJJ().LJIIIIZZ.getType())), new Pair("competition_id", String.valueOf(LJJJJJ().LJIIIZ)), new Pair("match_stage", String.valueOf(C973850bRv.LIZ()))), true);
    }

    @Override // X.InterfaceC983570bhb
    public final void LJJJIL(int i, long j, Function1 function1, Function1 function12) {
        Room roomLJJLIIIIJ;
        String str;
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel != null) {
            roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
        } else {
            roomLJJLIIIIJ = null;
        }
        long channelId = C915980Zwa.LJII().getChannelId();
        if (roomLJJLIIIIJ != null) {
            C974560bT4 c974560bT4 = new C974560bT4();
            long jLIZJ = LJJJJJ().LJJIJ.LIZJ();
            if (i == 1) {
                str = "201";
            } else {
                str = "disconnect_pk";
            }
            c974560bT4.LJJIL(jLIZJ, str, false);
            C974560bT4 c974560bT42 = new C974560bT4();
            C480460Ism.LIZ().getClass();
            CompetitionApi competitionApi = (CompetitionApi) C480460Ism.LIZLLL(CompetitionApi.class);
            CompetitionFinishParams competitionFinishParams = new CompetitionFinishParams();
            CompetitionCommon competitionCommon = new CompetitionCommon();
            competitionCommon.type = EnumC962960bAM.CATCH_BEANS.getType();
            competitionCommon.channelId = channelId;
            competitionCommon.competitionId = j;
            competitionFinishParams.bizCommon = competitionCommon;
            competitionApi.competitionFinish(competitionFinishParams).LJIILIIL(new C0UO0()).LJJLL(new AfS151S0200000_15(c974560bT42, function1, 75), new AfS151S0200000_15(c974560bT42, function12, 76));
        }
    }
}
