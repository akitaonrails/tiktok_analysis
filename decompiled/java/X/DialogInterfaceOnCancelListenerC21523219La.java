package X;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

/* JADX INFO: renamed from: X.19La, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class DialogInterfaceOnCancelListenerC21523219La implements DialogInterface.OnCancelListener {
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

    public DialogInterfaceOnCancelListenerC21523219La(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(DialogInterfaceOnCancelListenerC21523219La dialogInterfaceOnCancelListenerC21523219La, DialogInterface dialogInterface) {
        DialogFragment dialogFragment = (DialogFragment) dialogInterfaceOnCancelListenerC21523219La.l0;
        Dialog dialog = dialogFragment.mDialog;
        if (dialog != null) {
            dialogFragment.onCancel(dialog);
        }
    }

    public static final void onCancel$1(DialogInterfaceOnCancelListenerC21523219La dialogInterfaceOnCancelListenerC21523219La, DialogInterface dialogInterface) {
        ((C190W) dialogInterfaceOnCancelListenerC21523219La.l0).x5();
    }
}
