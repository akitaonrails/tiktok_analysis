package X;

import android.content.DialogInterface;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hYr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class DialogInterfaceOnCancelListenerC1208790hYr implements DialogInterface.OnCancelListener {
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
        }
    }

    public DialogInterfaceOnCancelListenerC1208790hYr(int i) {
        this.$t = i;
        this.l0 = null;
    }

    public DialogInterfaceOnCancelListenerC1208790hYr(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(DialogInterfaceOnCancelListenerC1208790hYr dialogInterfaceOnCancelListenerC1208790hYr, DialogInterface dialogInterface) {
        Function0 function0 = (Function0) dialogInterfaceOnCancelListenerC1208790hYr.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onCancel$1(DialogInterfaceOnCancelListenerC1208790hYr dialogInterfaceOnCancelListenerC1208790hYr, DialogInterface dialogInterface) {
        Function0 function0 = (Function0) dialogInterfaceOnCancelListenerC1208790hYr.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onCancel$2(DialogInterfaceOnCancelListenerC1208790hYr dialogInterfaceOnCancelListenerC1208790hYr, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnCancelListenerC1208790hYr.l0).invoke();
    }

    public static final void onCancel$3(DialogInterfaceOnCancelListenerC1208790hYr dialogInterfaceOnCancelListenerC1208790hYr, DialogInterface dialogInterface) {
        ((C1189730h47) dialogInterfaceOnCancelListenerC1208790hYr.l0).LJIIL("close");
    }
}
