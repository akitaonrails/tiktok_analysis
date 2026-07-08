package X;

import android.content.DialogInterface;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.ContainerAbility;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolusers.SchoolUsersListFragment;

/* JADX INFO: renamed from: X.0Dhy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class DialogInterfaceOnCancelListenerC346360Dhy implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onCancel$0(this, dialogInterface);
                break;
            case 1:
                onCancel$1(this, dialogInterface);
                break;
            case 2:
                onCancel$2(this, dialogInterface);
                break;
            case 3:
                onCancel$3(this, dialogInterface);
                break;
            case 4:
                onCancel$4(this, dialogInterface);
                break;
        }
    }

    public DialogInterfaceOnCancelListenerC346360Dhy(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(DialogInterfaceOnCancelListenerC346360Dhy dialogInterfaceOnCancelListenerC346360Dhy, DialogInterface dialogInterface) {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((View) dialogInterfaceOnCancelListenerC346360Dhy.l0, C343970De7.LIZ);
    }

    public static final void onCancel$1(DialogInterfaceOnCancelListenerC346360Dhy dialogInterfaceOnCancelListenerC346360Dhy, DialogInterface dialogInterface) {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((View) dialogInterfaceOnCancelListenerC346360Dhy.l0, C343970De7.LIZ);
    }

    public static final void onCancel$2(DialogInterfaceOnCancelListenerC346360Dhy dialogInterfaceOnCancelListenerC346360Dhy, DialogInterface dialogInterface) {
        if (((InterfaceC20236714Gf) dialogInterfaceOnCancelListenerC346360Dhy.l0).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) dialogInterfaceOnCancelListenerC346360Dhy.l0;
            C189200o6.m2constructorimpl(null);
            interfaceC20236714Gf.resumeWith(null);
        }
    }

    public static final void onCancel$3(DialogInterfaceOnCancelListenerC346360Dhy dialogInterfaceOnCancelListenerC346360Dhy, DialogInterface dialogInterface) {
        ContainerAbility containerAbilityRR = ((SchoolUsersListFragment) dialogInterfaceOnCancelListenerC346360Dhy.l0).RR();
        if (containerAbilityRR != null) {
            containerAbilityRR.X11(EnumC346100DhY.CLICK_CANCEL_GRADUATION_YEAR_POPUP, null);
        }
    }

    public static final void onCancel$4(DialogInterfaceOnCancelListenerC346360Dhy dialogInterfaceOnCancelListenerC346360Dhy, DialogInterface dialogInterface) {
        ((C0HXY) dialogInterfaceOnCancelListenerC346360Dhy.l0).LJIILIIL();
        C0HWW.LIZ.getClass();
        C0HWW.LJI("cancel", "sa_aiself_sticker_banner");
    }
}
