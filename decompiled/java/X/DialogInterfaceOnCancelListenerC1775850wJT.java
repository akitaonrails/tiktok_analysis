package X;

import android.content.DialogInterface;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.component.phone.change.setting.PhoneSettingAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.bnpl.BnplMiddleActivity;
import com.ss.android.ugc.aweme.pipo.auth.PipoAuthAssem;
import com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0wJT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class DialogInterfaceOnCancelListenerC1775850wJT implements DialogInterface.OnCancelListener {
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
            case 5:
                onCancel$5(this, dialogInterface);
                break;
        }
    }

    public DialogInterfaceOnCancelListenerC1775850wJT(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(DialogInterfaceOnCancelListenerC1775850wJT dialogInterfaceOnCancelListenerC1775850wJT, DialogInterface dialogInterface) {
        ((PhoneSettingAssem) dialogInterfaceOnCancelListenerC1775850wJT.l0).So().onEventVerifyClick("close");
    }

    public static final void onCancel$1(DialogInterfaceOnCancelListenerC1775850wJT dialogInterfaceOnCancelListenerC1775850wJT, DialogInterface dialogInterface) {
        SmartRouter.buildRoute((BnplMiddleActivity) dialogInterfaceOnCancelListenerC1775850wJT.l0, "//bnpl/middle/cancel").open();
        ((BnplMiddleActivity) dialogInterfaceOnCancelListenerC1775850wJT.l0).finish();
    }

    public static final void onCancel$2(DialogInterfaceOnCancelListenerC1775850wJT dialogInterfaceOnCancelListenerC1775850wJT, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnCancelListenerC1775850wJT.l0).invoke();
    }

    public static final void onCancel$3(DialogInterfaceOnCancelListenerC1775850wJT dialogInterfaceOnCancelListenerC1775850wJT, DialogInterface dialogInterface) {
        C19EG c19egLIZ = C724240Sb0.LIZ((PipoAuthAssem) dialogInterfaceOnCancelListenerC1775850wJT.l0);
        if (c19egLIZ != null) {
            c19egLIZ.finish();
        }
    }

    public static final void onCancel$4(DialogInterfaceOnCancelListenerC1775850wJT dialogInterfaceOnCancelListenerC1775850wJT, DialogInterface dialogInterface) {
        ((InterfaceC1711410udX) dialogInterfaceOnCancelListenerC1775850wJT.l0).onCancel();
    }

    public static final void onCancel$5(DialogInterfaceOnCancelListenerC1775850wJT dialogInterfaceOnCancelListenerC1775850wJT, DialogInterface dialogInterface) {
        ((PipoCashierBaseFragment) dialogInterfaceOnCancelListenerC1775850wJT.l0).onCancel(dialogInterface);
    }
}
