package X;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: renamed from: X.0Wfw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class DialogFragmentC829220Wfw extends DialogFragment {
    public static final String _pnsPageId = "KyohZyg8JyIgLGEyJiE+JiY3ZiIhOmEwJyHELIOSghJiF9DTc+Jj0XISQgJigVOiQrJCo9PA==";
    public Dialog LL;
    public DialogInterface.OnCancelListener LLILLJJLI;
    public Dialog LLILLL;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.LLILLJJLI;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.LL;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.LLILLL == null) {
                Activity activity = getActivity();
                C0W3J.LJIIIIZZ(activity);
                this.LLILLL = new AlertDialog.Builder(activity).create();
            }
            return this.LLILLL;
        }
        return dialog;
    }

    @Override // android.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
