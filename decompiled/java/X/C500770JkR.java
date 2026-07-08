package X;

import Y.AfS62S0400000_7;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.game.broadcast.dialog.GameFloatWindowTipsDialog;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastInteractionLibraSetting;
import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.0JkR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C500770JkR implements InterfaceC759380Tqa {
    public String LIZ = "go_live_page";

    @Override // X.InterfaceC759380Tqa
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC759380Tqa
    public final int getErrorCode() {
        return 111;
    }

    public final void LIZLLL() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_overlay_permission_banner_show");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(this.LIZ, "enter_from");
        c474500IjALIZ.LJJII("before_live", "scene_type");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC759380Tqa
    public final Object LIZIZ(final C500840JkY c500840JkY, boolean z, C759360TqY c759360TqY) {
        this.LIZ = "go_live_page";
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c759360TqY));
        if (BroadcastInteractionLibraSetting.INSTANCE.getValue() == 2 && !C0W78.LJFF(c500840JkY.LIZ)) {
            FragmentManager fragmentManagerLJIL = C520010KaN.LJIL(c500840JkY.LIZ, false);
            if (fragmentManagerLJIL == null) {
                C1124870fNV.LIZJ().getClass();
                String strLIZIZ = C1124870fNV.LIZIZ("pm_mt_mobile_gaming_unauthorized_toast");
                if (strLIZIZ == null) {
                    strLIZIZ = C497740JfY.LJIJI(2131843109);
                }
                C766270U4b.LJIIJJI(strLIZIZ);
                C189200o6.m2constructorimpl(true);
                c23260099m.resumeWith(true);
            } else {
                C19489311Mt c19489311Mt = new C19489311Mt();
                GameFloatWindowTipsDialog gameFloatWindowTipsDialogNs1 = ((IGameService) C1161920gLG.LIZJ(IGameService.class)).ns1("before_live");
                if (gameFloatWindowTipsDialogNs1 != null) {
                    gameFloatWindowTipsDialogNs1.setOnDismissListener(new DialogInterfaceOnDismissListenerC521770KdD(c19489311Mt, 11));
                }
                C013C c013c = new C013C();
                c013c.element = true;
                final C11JF c11jfLIZJ = ((C0J1N) C11RB.LIZIZ(c500840JkY.LIZJ).LIZIZ.LIZJ(C11RD.LJ(c500840JkY.LIZJ))).LIZJ(new AfS62S0400000_7(c500840JkY, gameFloatWindowTipsDialogNs1, c013c, this, 4));
                ((InterfaceC500100JjM) c19489311Mt.LJIIJ(new InterfaceC781210Ukh() { // from class: X.0JkQ
                    @Override // X.InterfaceC781210Ukh
                    public final void run() {
                        InterfaceC420801kM interfaceC420801kM = c11jfLIZJ;
                        if (interfaceC420801kM != null) {
                            interfaceC420801kM.dispose();
                        }
                        boolean zLJFF = C0W78.LJFF(c500840JkY.LIZ);
                        C500770JkR c500770JkR = this;
                        c500770JkR.getClass();
                        String str = zLJFF ? "setting_success" : "cancel_setting";
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_overlay_permission_banner_left");
                        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                        c474500IjALIZ.LJJII(c500770JkR.LIZ, "enter_from");
                        c474500IjALIZ.LJJII(str, "action_type");
                        c474500IjALIZ.LJJII(Integer.valueOf(zLJFF ? 1 : 0), "is_success");
                        c474500IjALIZ.LJJII("before_live", "scene_type");
                        c474500IjALIZ.LIZ();
                        InterfaceC1364105Vn<Boolean> interfaceC1364105Vn = c23260099m;
                        Boolean bool = Boolean.FALSE;
                        C189200o6.m2constructorimpl(bool);
                        interfaceC1364105Vn.resumeWith(bool);
                    }
                }).LIZLLL(C11RD.LJ(c500840JkY.LIZJ))).subscribe();
                if (gameFloatWindowTipsDialogNs1 != null) {
                    gameFloatWindowTipsDialogNs1.show(fragmentManagerLJIL, "GameFloatWindowTipsDialog");
                }
                LIZLLL();
            }
        } else {
            C189200o6.m2constructorimpl(false);
            c23260099m.resumeWith(false);
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c759360TqY);
        }
        return objLIZ;
    }

    @Override // X.InterfaceC759380Tqa
    public final Object LIZJ(C500840JkY c500840JkY, boolean z, C09AX c09ax) {
        return C759370TqZ.LIZ(this, c500840JkY, z, c09ax);
    }
}
