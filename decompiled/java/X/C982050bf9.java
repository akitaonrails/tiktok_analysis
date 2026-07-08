package X;

import Y.AfS16S0310000_15;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.competition.api.CompetitionApi;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionCommon;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSettlementEndParams;
import com.bytedance.android.live.liveinteract.competition.states.event.CompetitionStateTransitCountdownEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageSettlementClockDurationSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS629S0100000_15;

/* JADX INFO: renamed from: X.0bf9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982050bf9 extends C982020bf6 implements InterfaceC983270bh7 {
    public LinkDialog LJFF;

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LIZ(AbstractC982800bgM abstractC982800bgM) {
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LJIIL(List list, List list2) {
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LJJ() {
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LJJIII() {
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LIZIZ() {
        super.LIZIZ();
        LJFF();
        LJJJJJ().LJJIJIIJI.LJIILIIL = false;
        C958040b2Q.LJIIJJI("playing_state_will_leave", this.LIZLLL, LJJJJJ(), EnumC958080b2U.TAKE_STAGE_RESULT);
    }

    @Override // X.C982020bf6, X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LJFF() {
        super.LJFF();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismiss and coordinator = ");
        sbLIZ.append(this);
        C20441214yg.LIZIZ("TakeStageSettlementCoordinatorAnchor", C2188811AlT.LIZIZ(sbLIZ));
        LinkDialog linkDialog = this.LJFF;
        if (linkDialog != null) {
            linkDialog.dismiss();
        }
    }

    public C982050bf9(MatchBaseWidget matchBaseWidget, InterfaceC981940bey interfaceC981940bey) {
        super(matchBaseWidget, interfaceC981940bey);
    }

    @Override // X.C982020bf6, X.InterfaceC983130bgt
    public final void LJIJJLI(C982460bfo c982460bfo, AbstractC982800bgM abstractC982800bgM, EnumC975850bV9 enumC975850bV9) {
        DataChannel dataChannel;
        if (enumC975850bV9 == EnumC975850bV9.TIME_OVER_SETTLEMENT && (dataChannel = this.LIZLLL) != null) {
            long value = LJJJJJ().LJIIJ.LJII;
            if (value <= 0) {
                value = LiveCoHostTakeTheStageSettlementClockDurationSetting.INSTANCE.getValue();
            }
            dataChannel.zW(CompetitionStateTransitCountdownEvent.class, new C983300bhA("TakeStageSettlementCoordinatorAnchor_doIfNeedOnStateDidEnter", value));
        }
    }

    @Override // X.InterfaceC983270bh7
    public final void LJJIIZI(long j, String str, Function2<? super EnumC983140bgu, ? super Long, Unit> function2) {
        EnumC977660bY4 enumC977660bY4;
        LinkDialog linkDialog = this.LJFF;
        FragmentManager fragmentManager = null;
        if (linkDialog != null && C500260Jjc.LJJJI(Boolean.valueOf(linkDialog.isVisible()))) {
            LinkDialog linkDialog2 = this.LJFF;
            if (linkDialog2 == null || (enumC977660bY4 = linkDialog2.LLILZIL) == null) {
                enumC977660bY4 = null;
            }
            if (enumC977660bY4 == EnumC977660bY4.TAKE_THE_STAGE_SETTLEMENT_MANAGE_ANCHOR) {
                C20441214yg.LJ("TakeStageSettlementCoordinatorAnchor", "settlementManageDialog is showing, no need create again");
                return;
            } else if (linkDialog2 != null) {
                linkDialog2.dismiss();
            }
        }
        if (!C500260Jjc.LJJIFFI(Boolean.valueOf(LJJJJJ().LIZIZ))) {
            MatchBaseWidget matchBaseWidget = this.LIZ;
            if (str == null) {
                str = "";
            }
            boolean zLJ = LJJJJJ().LJJIJIIJI.LJ();
            AwS629S0100000_15 awS629S0100000_15 = new AwS629S0100000_15((AwS629S0100000_15) function2, 50);
            LinkDialog linkDialog3 = new LinkDialog(matchBaseWidget);
            EnumC977660bY4 enumC977660bY42 = EnumC977660bY4.TAKE_THE_STAGE_SETTLEMENT_MANAGE_ANCHOR;
            C981180bdk c981180bdk = new C981180bdk();
            c981180bdk.LIZIZ = awS629S0100000_15;
            c981180bdk.LIZJ = str;
            c981180bdk.LIZLLL = zLJ;
            linkDialog3.LLILZIL = enumC977660bY42;
            linkDialog3.LLILZLL = c981180bdk;
            DataChannel dataChannel = this.LIZLLL;
            if (dataChannel != null) {
                fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
            }
            linkDialog3.show(fragmentManager, "LinkDialog");
            this.LJFF = linkDialog3;
        }
    }

    @Override // X.InterfaceC983270bh7
    public final void LJJIIJZLJL(long j, long j2, long j3, int i, C982230bfR c982230bfR, C982370bff c982370bff) {
        Room roomLJJLIIIIJ;
        if (this.LJ) {
            return;
        }
        this.LJ = true;
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel != null) {
            roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
        } else {
            roomLJJLIIIIJ = null;
        }
        int iLJJIJIIJI = C974540bT2.LJJIJIIJI(i, j3, roomLJJLIIIIJ);
        ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground();
        String str = C954660awy.LJFF;
        new C974560bT4().LJJIIZ(iLJJIJIIJI, LJJJJJ().LJJIJ.LIZIZ());
        C974560bT4 c974560bT4 = new C974560bT4();
        C930480aJy c930480aJy = C930480aJy.LIZ;
        C480460Ism.LIZ().getClass();
        CompetitionApi competitionApi = (CompetitionApi) C480460Ism.LIZLLL(CompetitionApi.class);
        CompetitionSettlementEndParams competitionSettlementEndParams = new CompetitionSettlementEndParams();
        CompetitionCommon competitionCommon = new CompetitionCommon();
        competitionCommon.type = EnumC962960bAM.TAKE_THE_STAGE.getType();
        competitionCommon.channelId = j2;
        competitionCommon.competitionId = j;
        competitionSettlementEndParams.bizCommon = competitionCommon;
        InterfaceC420801kM interfaceC420801kMLJJLL = competitionApi.competitionSettlementEnd(competitionSettlementEndParams).LJIILIIL(new C0UO0()).LJJLL(new AfS16S0310000_15(this, c974560bT4, c982230bfR, 1), new AfS16S0310000_15(this, c974560bT4, c982370bff, 2));
        C11NJ c11njLJJJJIZL = LJJJJIZL();
        c930480aJy.getClass();
        c11njLJJJJIZL.LIZ(interfaceC420801kMLJJLL);
    }
}
