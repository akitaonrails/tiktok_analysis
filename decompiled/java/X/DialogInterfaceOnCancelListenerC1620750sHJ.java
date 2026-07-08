package X;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sHJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class DialogInterfaceOnCancelListenerC1620750sHJ implements DialogInterface.OnCancelListener {
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
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DialogInterfaceOnCancelListenerC1620750sHJ(Function0 function0, Function0<Unit> function02) {
        this.$t = function02;
        this.l0 = function0;
    }

    public static final void onCancel$0(DialogInterfaceOnCancelListenerC1620750sHJ dialogInterfaceOnCancelListenerC1620750sHJ, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnCancelListenerC1620750sHJ.l0).invoke();
    }

    public static final void onCancel$1(DialogInterfaceOnCancelListenerC1620750sHJ dialogInterfaceOnCancelListenerC1620750sHJ, DialogInterface dialogInterface) {
        Function0 function0 = (Function0) dialogInterfaceOnCancelListenerC1620750sHJ.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
