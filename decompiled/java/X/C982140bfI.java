package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS299S0000000_15;

/* JADX INFO: renamed from: X.0bfI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982140bfI extends C982020bf6 implements InterfaceC985230bkH {
    public LinkDialog LJFF;

    @Override // X.InterfaceC983570bhb
    public final void LJJJIL(int i, long j, Function1 function1, Function1 function12) {
    }

    @Override // X.C982020bf6, X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LJFF() {
        super.LJFF();
        LinkDialog linkDialog = this.LJFF;
        if (linkDialog != null) {
            linkDialog.dismiss();
        }
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LJJIII() {
        if (LJJJJJ().LIZIZ) {
            C958040b2Q.LJIILIIL("enter_punish_state", LJJJJJ());
        }
    }

    public C982140bfI(MatchBaseWidget matchBaseWidget, InterfaceC981940bey interfaceC981940bey) {
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
                C20441214yg.LJ("TakeStageDrawCoordinator", "punishManageDialog is showing, no need create again");
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
            LinkDialog linkDialogLIZIZ = C977650bY3.LIZIZ(this.LIZ, 0L, EnumC982940bga.FINAL_RESULT, zLJ, listLIZIZ, false, AFwS299S0000000_15.get$arr$(47));
            DataChannel dataChannel = this.LIZLLL;
            if (dataChannel != null) {
                fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
            }
            linkDialogLIZIZ.show(fragmentManager, "LinkDialog");
            this.LJFF = linkDialogLIZIZ;
            return;
        }
        MatchBaseWidget matchBaseWidget = this.LIZ;
        if (str == null) {
            str = "";
        }
        boolean zLJ2 = LJJJJJ().LJJIJIIJI.LJ();
        LinkDialog linkDialog3 = new LinkDialog(matchBaseWidget);
        EnumC977660bY4 enumC977660bY42 = EnumC977660bY4.TAKE_THE_STAGE_PUNISH_MANAGE_ANCHOR;
        C981170bdj c981170bdj = new C981170bdj();
        c981170bdj.LIZIZ = function2;
        c981170bdj.LIZJ = str;
        c981170bdj.LIZLLL = zLJ2;
        linkDialog3.LLILZIL = enumC977660bY42;
        linkDialog3.LLILZLL = c981170bdj;
        DataChannel dataChannel2 = this.LIZLLL;
        if (dataChannel2 != null) {
            fragmentManager = (FragmentManager) dataChannel2.gg0(C748880TZe.class);
        }
        linkDialog3.show(fragmentManager, "LinkDialog");
        this.LJFF = linkDialog3;
    }
}
