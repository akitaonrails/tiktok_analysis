package X;

import android.content.DialogInterface;
import com.bytedance.android.live.wallet.model.TaxDialogParams;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;

/* JADX INFO: renamed from: X.0g4c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class DialogInterfaceOnClickListenerC1151600g4c implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                break;
            case 1:
                onClick$1(this, dialogInterface, i);
                break;
            case 2:
                onClick$2(this, dialogInterface, i);
                break;
        }
    }

    public DialogInterfaceOnClickListenerC1151600g4c(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onClick$0(DialogInterfaceOnClickListenerC1151600g4c dialogInterfaceOnClickListenerC1151600g4c, DialogInterface dialogInterface, int i) {
        ((C238400w2) dialogInterfaceOnClickListenerC1151600g4c.l0).element = EnumC1094410eaN.USER_LEVEL_SWITCH_STATUS_ON.getValue();
        ((C013C) dialogInterfaceOnClickListenerC1151600g4c.l1).element = true;
        dialogInterface.dismiss();
    }

    public static final void onClick$1(DialogInterfaceOnClickListenerC1151600g4c dialogInterfaceOnClickListenerC1151600g4c, DialogInterface dialogInterface, int i) {
        IUserLevelService iUserLevelService = (IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class);
        if (iUserLevelService != null) {
            iUserLevelService.WN1(EnumC1094410eaN.USER_LEVEL_SWITCH_STATUS_OFF.getValue());
        }
        ((C238400w2) dialogInterfaceOnClickListenerC1151600g4c.l0).element = EnumC1094410eaN.USER_LEVEL_SWITCH_STATUS_OFF.getValue();
        ((C013C) dialogInterfaceOnClickListenerC1151600g4c.l1).element = true;
        dialogInterface.dismiss();
    }

    public static final void onClick$2(DialogInterfaceOnClickListenerC1151600g4c dialogInterfaceOnClickListenerC1151600g4c, DialogInterface dialogInterface, int i) {
        InterfaceC1149950g1x interfaceC1149950g1x = (InterfaceC1149950g1x) dialogInterfaceOnClickListenerC1151600g4c.l0;
        if (interfaceC1149950g1x != null) {
            interfaceC1149950g1x.onCancel();
        }
        C1149970g1z.LIZJ((TaxDialogParams) dialogInterfaceOnClickListenerC1151600g4c.l1, "go_back");
    }
}
