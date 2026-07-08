package X;

import Y.AfS151S0200000_15;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.competition.api.CompetitionApi;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionCommon;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionFinishParams;
import com.bytedance.android.live.liveinteract.competition.states.event.CompetitionStateTransitCountdownEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0bf8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982040bf8 extends C982020bf6 implements InterfaceC983570bhb {
    public LinkDialog LJFF;

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LJIIL(List list, List list2) {
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LJJ() {
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LJJIII() {
    }

    @Override // X.C982020bf6, X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LJFF() {
        super.LJFF();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismiss and coordinator = ");
        sbLIZ.append(this);
        C20441214yg.LIZIZ("TakeStagePunishCoordinatorAnchor", C2188811AlT.LIZIZ(sbLIZ));
        LinkDialog linkDialog = this.LJFF;
        if (linkDialog != null) {
            linkDialog.dismiss();
        }
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LIZIZ() {
        super.LIZIZ();
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LIZ(AbstractC982800bgM abstractC982800bgM) {
    }

    public C982040bf8(MatchBaseWidget matchBaseWidget, InterfaceC981940bey interfaceC981940bey) {
        super(matchBaseWidget, interfaceC981940bey);
    }

    @Override // X.InterfaceC983570bhb
    public final void LJIILLIIL(String str, Function2<? super EnumC983140bgu, ? super Long, Unit> function2) {
        EnumC977660bY4 enumC977660bY4;
        if (this.LIZ == null) {
            return;
        }
        LinkDialog linkDialog = this.LJFF;
        FragmentManager fragmentManager = null;
        if (linkDialog != null && C500260Jjc.LJJJI(Boolean.valueOf(linkDialog.isVisible()))) {
            LinkDialog linkDialog2 = this.LJFF;
            if (linkDialog2 == null || (enumC977660bY4 = linkDialog2.LLILZIL) == null) {
                enumC977660bY4 = null;
            }
            if (enumC977660bY4 == EnumC977660bY4.TAKE_THE_STAGE_PUNISH_MANAGE_ANCHOR) {
                C20441214yg.LJ("TakeStagePunishCoordinatorAnchor", "punishManageDialog is showing, no need create again");
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
            LinkDialog linkDialog3 = new LinkDialog(matchBaseWidget);
            EnumC977660bY4 enumC977660bY42 = EnumC977660bY4.TAKE_THE_STAGE_PUNISH_MANAGE_ANCHOR;
            C981170bdj c981170bdj = new C981170bdj();
            c981170bdj.LIZIZ = function2;
            c981170bdj.LIZJ = str;
            c981170bdj.LIZLLL = zLJ;
            linkDialog3.LLILZIL = enumC977660bY42;
            linkDialog3.LLILZLL = c981170bdj;
            DataChannel dataChannel = this.LIZLLL;
            if (dataChannel != null) {
                fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
            }
            linkDialog3.show(fragmentManager, "LinkDialog");
            this.LJFF = linkDialog3;
        }
    }

    @Override // X.C982020bf6, X.InterfaceC983130bgt
    public final void LJIJJLI(C982460bfo c982460bfo, AbstractC982800bgM abstractC982800bgM, EnumC975850bV9 enumC975850bV9) {
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel != null) {
            dataChannel.zW(CompetitionStateTransitCountdownEvent.class, new C983300bhA("TakeStagePunishCoordinatorAnchor_doIfNeedOnStateDidEnter", LJJJJJ().LJIIJ.LJIIIZ - C158B.LIZJ()));
        }
        C958040b2Q.LJIILIIL("enter_punish_state", LJJJJJ());
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
            competitionCommon.type = EnumC962960bAM.TAKE_THE_STAGE.getType();
            competitionCommon.channelId = channelId;
            competitionCommon.competitionId = j;
            competitionFinishParams.bizCommon = competitionCommon;
            competitionApi.competitionFinish(competitionFinishParams).LJIILIIL(new C0UO0()).LJJLL(new AfS151S0200000_15(c974560bT42, function1, 6), new AfS151S0200000_15(c974560bT42, function12, 7));
        }
    }
}
