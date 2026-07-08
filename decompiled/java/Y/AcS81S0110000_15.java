package Y;

import X.C01GW;
import X.C0JGZ;
import X.C11JN;
import X.C20744116Fj;
import X.C307001Gy;
import X.C924660aAa;
import X.C925140aBM;
import X.C927240aEk;
import X.C927600aFK;
import X.C937520aVK;
import X.C943830afV;
import X.C943840afW;
import X.C955520ayM;
import X.InterfaceC743640TFa;
import X.InterfaceC927120aEY;
import X.InterfaceC934710aQn;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostBeInvitedFragment;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AcS81S0110000_15 implements InterfaceC743640TFa {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC743640TFa
    public final void LIZ(LiveDialog liveDialog) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, liveDialog);
                break;
            case 1:
                LIZ$1(this, liveDialog);
                break;
            case 2:
                LIZ$2(this, liveDialog);
                break;
            case 3:
                LIZ$3(this, liveDialog);
                break;
            case 4:
                LIZ$4(this, liveDialog);
                break;
            case 5:
                LIZ$5(this, liveDialog);
                break;
        }
    }

    public static final void LIZ$0(AcS81S0110000_15 acS81S0110000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        if (!acS81S0110000_15.z1) {
            C937520aVK.LIZLLL = true;
        }
        InterfaceC927120aEY interfaceC927120aEY = (InterfaceC927120aEY) acS81S0110000_15.l0;
        if (interfaceC927120aEY != null) {
            interfaceC927120aEY.Is();
        }
        new C927240aEk("leavePopupV", "quitBtn").LIZ();
    }

    public static final void LIZ$1(AcS81S0110000_15 acS81S0110000_15, LiveDialog liveDialog) {
        boolean z;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke;
        String strLJIILJJIL = ((LayoutSettingContract) acS81S0110000_15.l0).LJIILJJIL();
        Function0<MultiLiveAnchorPanelSettings> function0 = ((LayoutSettingContract) acS81S0110000_15.l0).anchorPanelSettingsTemp;
        if (function0 != null && (multiLiveAnchorPanelSettingsInvoke = function0.invoke()) != null && multiLiveAnchorPanelSettingsInvoke.fixMicNumAction == 0) {
            z = true;
        } else {
            z = false;
        }
        C0JGZ.LIZIZ(strLJIILJJIL, "cancel", ((LayoutSettingContract) acS81S0110000_15.l0).enterFrom, z, acS81S0110000_15.z1);
        Function0<Unit> function02 = ((LayoutSettingContract) acS81S0110000_15.l0).requestRollbackSettingLayout;
        if (function02 != null) {
            function02.invoke();
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$2(AcS81S0110000_15 acS81S0110000_15, LiveDialog liveDialog) {
        C20744116Fj c20744116Fj = ((MultiGuestV3GuestBeInvitedDialog) acS81S0110000_15.l0).deClineDialogCbTurnOffInvitation;
        if (c20744116Fj != null) {
            c20744116Fj.setChecked(false);
        }
        if (acS81S0110000_15.z1) {
            InterfaceC934710aQn.Lb.LJFF(Boolean.TRUE);
            C925140aBM.LIZ("click", "status_setting");
            ((MultiGuestV3GuestBeInvitedDialog) acS81S0110000_15.l0).VR("decline_popup");
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        C924660aAa.LJIIJJI("click", "cancel", C927600aFK.LJII(), Boolean.valueOf(((MultiGuestV3GuestBeInvitedDialog) acS81S0110000_15.l0).fu()));
        liveDialog.dismiss();
    }

    public static final void LIZ$3(AcS81S0110000_15 acS81S0110000_15, LiveDialog liveDialog) {
        C11JN c11jnLIZ = ((MultiCoHostBeInvitedFragment) acS81S0110000_15.l0).LLLJIL.LIZ(C943840afW.LIZLLL, false);
        if (c11jnLIZ != null) {
            c11jnLIZ.LJJLJ();
        }
        liveDialog.dismiss();
        C955520ayM.LJIIIIZZ("live_confirm", acS81S0110000_15.z1);
    }

    public static final void LIZ$4(AcS81S0110000_15 acS81S0110000_15, LiveDialog liveDialog) {
        C11JN c11jnLIZ = ((MultiCoHostBeInvitedFragment) acS81S0110000_15.l0).LLLJIL.LIZ(C943830afV.LIZLLL, false);
        if (c11jnLIZ != null) {
            c11jnLIZ.LJJLJ();
        }
        liveDialog.dismiss();
        C955520ayM.LJIIIIZZ("mg_confirm", acS81S0110000_15.z1);
    }

    public static final void LIZ$5(AcS81S0110000_15 acS81S0110000_15, LiveDialog liveDialog) {
        C11JN c11jnLIZ = ((MultiCoHostBeInvitedFragment) acS81S0110000_15.l0).LLLJIL.LIZ(C943840afW.LIZLLL, false);
        if (c11jnLIZ != null) {
            c11jnLIZ.LJJLJ();
        }
        liveDialog.dismiss();
        C955520ayM.LJIIIIZZ("confirm", acS81S0110000_15.z1);
    }

    public AcS81S0110000_15(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
