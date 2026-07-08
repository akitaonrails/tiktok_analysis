package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0uI8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class DialogInterfaceOnDismissListenerC1698140uI8 implements DialogInterface.OnDismissListener {
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

    public DialogInterfaceOnDismissListenerC1698140uI8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC1698140uI8 dialogInterfaceOnDismissListenerC1698140uI8, DialogInterface dialogInterface) {
        ((MessageNotificationFragment) dialogInterfaceOnDismissListenerC1698140uI8.l0).LLIZ = null;
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC1698140uI8 dialogInterfaceOnDismissListenerC1698140uI8, DialogInterface dialogInterface) {
        Function0 function0 = (Function0) dialogInterfaceOnDismissListenerC1698140uI8.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
