package X;

import android.app.Activity;
import android.content.DialogInterface;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Xfq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class DialogInterfaceOnDismissListenerC854640Xfq implements DialogInterface.OnDismissListener {
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
        }
    }

    public DialogInterfaceOnDismissListenerC854640Xfq(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC854640Xfq dialogInterfaceOnDismissListenerC854640Xfq, DialogInterface dialogInterface) {
        Function0 function0 = (Function0) dialogInterfaceOnDismissListenerC854640Xfq.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C0W09.LIZ = null;
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC854640Xfq dialogInterfaceOnDismissListenerC854640Xfq, DialogInterface dialogInterface) {
        ((Activity) dialogInterfaceOnDismissListenerC854640Xfq.l0).finish();
    }
}
