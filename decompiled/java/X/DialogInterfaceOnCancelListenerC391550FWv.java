package X;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0FWv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class DialogInterfaceOnCancelListenerC391550FWv implements DialogInterface.OnCancelListener {
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
    public DialogInterfaceOnCancelListenerC391550FWv(Object obj, C1452090ntH<InterfaceC1446740nke> c1452090ntH) {
        this.$t = c1452090ntH;
        this.l0 = obj;
    }

    public static final void onCancel$0(DialogInterfaceOnCancelListenerC391550FWv dialogInterfaceOnCancelListenerC391550FWv, DialogInterface dialogInterface) {
        ((C1452090ntH) dialogInterfaceOnCancelListenerC391550FWv.l0).kc().onBackPressed();
    }

    public static final void onCancel$1(DialogInterfaceOnCancelListenerC391550FWv dialogInterfaceOnCancelListenerC391550FWv, DialogInterface dialogInterface) {
        Function0<Unit> function0 = ((C386240FCk) dialogInterfaceOnCancelListenerC391550FWv.l0).LIZJ;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
