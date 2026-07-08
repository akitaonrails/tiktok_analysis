package X;

import android.content.DialogInterface;

/* JADX INFO: renamed from: X.0MqL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class DialogInterfaceOnClickListenerC580870MqL implements DialogInterface.OnClickListener {
    public final int $t;

    public static final void onClick$1(DialogInterfaceOnClickListenerC580870MqL dialogInterfaceOnClickListenerC580870MqL, DialogInterface dialogInterface, int i) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                dialogInterface.dismiss();
                break;
            case 1:
                onClick$1(this, dialogInterface, i);
                break;
        }
    }

    public DialogInterfaceOnClickListenerC580870MqL(int i) {
        this.$t = i;
    }
}
