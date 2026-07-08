package X;

import android.content.DialogInterface;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity;

/* JADX INFO: renamed from: X.10kJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class DialogInterfaceOnClickListenerC19332910kJ implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;

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
            case 3:
                onClick$3(this, dialogInterface, i);
                break;
            case 4:
                onClick$4(this, dialogInterface, i);
                break;
            case 5:
                onClick$5(this, dialogInterface, i);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DialogInterfaceOnClickListenerC19332910kJ(Object obj, CompletionBlock<InterfaceC1887310zDF> completionBlock) {
        this.$t = completionBlock;
        this.l0 = obj;
    }

    public static final void onClick$0(DialogInterfaceOnClickListenerC19332910kJ dialogInterfaceOnClickListenerC19332910kJ, DialogInterface dialogInterface, int i) {
        C0W79.LIZLLL((QRCodePermissionActivity) dialogInterfaceOnClickListenerC19332910kJ.l0);
        ((QRCodePermissionActivity) dialogInterfaceOnClickListenerC19332910kJ.l0).finish();
    }

    public static final void onClick$1(DialogInterfaceOnClickListenerC19332910kJ dialogInterfaceOnClickListenerC19332910kJ, DialogInterface dialogInterface, int i) {
        ((QRCodePermissionActivity) dialogInterfaceOnClickListenerC19332910kJ.l0).finish();
    }

    public static final void onClick$2(DialogInterfaceOnClickListenerC19332910kJ dialogInterfaceOnClickListenerC19332910kJ, DialogInterface dialogInterface, int i) {
        CompletionBlock completionBlock = (CompletionBlock) dialogInterfaceOnClickListenerC19332910kJ.l0;
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1887310zDF.class, null);
        ((InterfaceC1887310zDF) xBaseModelLIZJ).setAction("cancel");
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }

    public static final void onClick$3(DialogInterfaceOnClickListenerC19332910kJ dialogInterfaceOnClickListenerC19332910kJ, DialogInterface dialogInterface, int i) {
        CompletionBlock completionBlock = (CompletionBlock) dialogInterfaceOnClickListenerC19332910kJ.l0;
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1887310zDF.class, null);
        ((InterfaceC1887310zDF) xBaseModelLIZJ).setAction("confirm");
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }

    public static final void onClick$4(DialogInterfaceOnClickListenerC19332910kJ dialogInterfaceOnClickListenerC19332910kJ, DialogInterface dialogInterface, int i) {
        InterfaceC1887370zDL interfaceC1887370zDL = (InterfaceC1887370zDL) dialogInterfaceOnClickListenerC19332910kJ.l0;
        C1887360zDK c1887360zDK = new C1887360zDK();
        c1887360zDK.LIZ = "cancel";
        interfaceC1887370zDL.LIZ(c1887360zDK, "");
    }

    public static final void onClick$5(DialogInterfaceOnClickListenerC19332910kJ dialogInterfaceOnClickListenerC19332910kJ, DialogInterface dialogInterface, int i) {
        InterfaceC1887370zDL interfaceC1887370zDL = (InterfaceC1887370zDL) dialogInterfaceOnClickListenerC19332910kJ.l0;
        C1887360zDK c1887360zDK = new C1887360zDK();
        c1887360zDK.LIZ = "confirm";
        interfaceC1887370zDL.LIZ(c1887360zDK, "");
    }
}
