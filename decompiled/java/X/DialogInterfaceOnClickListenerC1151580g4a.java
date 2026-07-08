package X;

import android.content.DialogInterface;

/* JADX INFO: renamed from: X.0g4a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class DialogInterfaceOnClickListenerC1151580g4a implements DialogInterface.OnClickListener {
    public final int $t;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                dialogInterface.dismiss();
                break;
            case 1:
                dialogInterface.dismiss();
                break;
        }
    }

    public DialogInterfaceOnClickListenerC1151580g4a(int i) {
        this.$t = i;
    }
}
