package X;

import com.bytedance.android.live.liveinteract.competition.game.playing.CatchBeansPlayingCoordinatorAnchor;
import com.bytedance.android.live.liveinteract.competition.states.event.CompetitionStateTransitCountdownEvent;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0bfg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982380bfg extends CatchBeansPlayingCoordinatorAnchor implements InterfaceC983570bhb {
    @Override // X.InterfaceC983570bhb
    public final void LJIILLIIL(String str, Function2<? super EnumC983140bgu, ? super Long, Unit> function2) {
    }

    @Override // X.InterfaceC983570bhb
    public final void LJJJIL(int i, long j, Function1 function1, Function1 function12) {
    }

    @Override // com.bytedance.android.live.liveinteract.competition.game.playing.CatchBeansPlayingCoordinatorAnchor, X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LIZ(AbstractC982800bgM abstractC982800bgM) {
        if (!(abstractC982800bgM instanceof C982470bfp)) {
            super.LIZ(abstractC982800bgM);
        }
    }

    public C982380bfg(MatchBaseWidget matchBaseWidget, InterfaceC981940bey interfaceC981940bey) {
        super(matchBaseWidget, interfaceC981940bey);
    }

    @Override // com.bytedance.android.live.liveinteract.competition.game.playing.CatchBeansPlayingCoordinatorAnchor, X.InterfaceC983130bgt
    public final void LJIJJLI(C982460bfo c982460bfo, AbstractC982800bgM abstractC982800bgM, EnumC975850bV9 enumC975850bV9) {
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel != null) {
            dataChannel.zW(CompetitionStateTransitCountdownEvent.class, new C983300bhA("CatchBeansPunishCoordinatorAudience_doIfNeedOnStateDidEnter", LJJJJJ().LJIIJ.LJIIIZ - C158B.LIZJ()));
        }
    }
}
