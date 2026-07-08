package X;

import android.content.DialogInterface;

/* JADX INFO: renamed from: X.0UsF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class DialogInterfaceOnClickListenerC785890UsF implements DialogInterface.OnClickListener {
    public final int $t;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                dialogInterface.dismiss();
                break;
            case 1:
                dialogInterface.cancel();
                break;
        }
    }

    public DialogInterfaceOnClickListenerC785890UsF(int i) {
        this.$t = i;
    }
}
