package X;

import android.content.DialogInterface;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem;
import com.ss.android.ugc.aweme.setting.serverpush.ui.PushOffReasonBottomSheetFragment;

/* JADX INFO: renamed from: X.0wJZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class DialogInterfaceOnDismissListenerC1775910wJZ implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
            case 2:
                onDismiss$2(this, dialogInterface);
                break;
            case 3:
                onDismiss$3(this, dialogInterface);
                break;
            case 4:
                onDismiss$4(this, dialogInterface);
                break;
        }
    }

    public DialogInterfaceOnDismissListenerC1775910wJZ(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC1775910wJZ dialogInterfaceOnDismissListenerC1775910wJZ, DialogInterface dialogInterface) {
        CompletionBlock completionBlock = (CompletionBlock) dialogInterfaceOnDismissListenerC1775910wJZ.l0;
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1766350w49.class, null);
        ((InterfaceC1766350w49) xBaseModelLIZJ).setAction("dismiss");
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC1775910wJZ dialogInterfaceOnDismissListenerC1775910wJZ, DialogInterface dialogInterface) {
        ((InterfaceC1752190vhJ) dialogInterfaceOnDismissListenerC1775910wJZ.l0).LJJJJJL(false);
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC1775910wJZ dialogInterfaceOnDismissListenerC1775910wJZ, DialogInterface dialogInterface) {
        ((PushOffReasonBottomSheetFragment) dialogInterfaceOnDismissListenerC1775910wJZ.l0).OR("close");
    }

    public static final void onDismiss$3(DialogInterfaceOnDismissListenerC1775910wJZ dialogInterfaceOnDismissListenerC1775910wJZ, DialogInterface dialogInterface) {
        ((SkuPanelBaseReusedAssem) ((InterfaceC10458047c) dialogInterfaceOnDismissListenerC1775910wJZ.l0)).getViewModel().LLLILZJ = false;
    }

    public static final void onDismiss$4(DialogInterfaceOnDismissListenerC1775910wJZ dialogInterfaceOnDismissListenerC1775910wJZ, DialogInterface dialogInterface) {
        ((InterfaceC1750090vdv) dialogInterfaceOnDismissListenerC1775910wJZ.l0).LJJJJJL(false);
    }
}
