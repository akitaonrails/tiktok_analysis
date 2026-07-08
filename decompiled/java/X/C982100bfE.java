package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.competition.states.event.CompetitionStateTransitCountdownEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS299S0000000_15;

/* JADX INFO: renamed from: X.0bfE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982100bfE extends C982020bf6 implements InterfaceC983570bhb {
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

    @Override // X.InterfaceC983570bhb
    public final void LJJJIL(int i, long j, Function1 function1, Function1 function12) {
    }

    @Override // X.C982020bf6, X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LJFF() {
        super.LJFF();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismiss and coordinator = ");
        sbLIZ.append(this);
        C20441214yg.LIZIZ("TakeStagePunishCoordinatorAudience", C2188811AlT.LIZIZ(sbLIZ));
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

    public C982100bfE(MatchBaseWidget matchBaseWidget, InterfaceC981940bey interfaceC981940bey) {
        super(matchBaseWidget, interfaceC981940bey);
    }

    @Override // X.InterfaceC983570bhb
    public final void LJIILLIIL(String str, Function2<? super EnumC983140bgu, ? super Long, Unit> function2) {
        List<C954460awe> listLIZIZ;
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
                C20441214yg.LJ("TakeStagePunishCoordinatorAudience", "punishManageDialog is showing, no need create again");
                return;
            } else if (linkDialog2 != null) {
                linkDialog2.dismiss();
            }
        }
        if (C500260Jjc.LJJIFFI(Boolean.valueOf(LJJJJJ().LIZIZ))) {
            boolean zLJ = LJJJJJ().LJJIJIIJI.LJ();
            if (zLJ) {
                listLIZIZ = LJJJJJ().LJJIJIIJI.LIZIZ();
            } else {
                listLIZIZ = C13BV.INSTANCE;
            }
            LinkDialog linkDialogLIZIZ = C977650bY3.LIZIZ(this.LIZ, 0L, EnumC982940bga.FINAL_RESULT, zLJ, listLIZIZ, false, AFwS299S0000000_15.get$arr$(7));
            DataChannel dataChannel = this.LIZLLL;
            if (dataChannel != null) {
                fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
            }
            linkDialogLIZIZ.show(fragmentManager, "LinkDialog");
            this.LJFF = linkDialogLIZIZ;
        }
    }

    @Override // X.C982020bf6, X.InterfaceC983130bgt
    public final void LJIJJLI(C982460bfo c982460bfo, AbstractC982800bgM abstractC982800bgM, EnumC975850bV9 enumC975850bV9) {
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel != null) {
            dataChannel.zW(CompetitionStateTransitCountdownEvent.class, new C983300bhA("TakeStagePunishCoordinatorAudience_doIfNeedOnStateDidEnter", LJJJJJ().LJIIJ.LJIIIZ - C158B.LIZJ()));
        }
    }
}
