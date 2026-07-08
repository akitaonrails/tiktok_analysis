package X;

import android.content.DialogInterface;

/* JADX INFO: renamed from: X.0g4h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class DialogInterfaceOnClickListenerC1151650g4h implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                break;
            case 1:
                onClick$1(this, dialogInterface, i);
                break;
            case 2:
                onClick$2(this, dialogInterface, i);
                break;
        }
    }

    public DialogInterfaceOnClickListenerC1151650g4h(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(DialogInterfaceOnClickListenerC1151650g4h dialogInterfaceOnClickListenerC1151650g4h, DialogInterface dialogInterface, int i) {
        ((Runnable) dialogInterfaceOnClickListenerC1151650g4h.l0).run();
    }

    public static final void onClick$1(DialogInterfaceOnClickListenerC1151650g4h dialogInterfaceOnClickListenerC1151650g4h, DialogInterface dialogInterface, int i) {
        ((Runnable) dialogInterfaceOnClickListenerC1151650g4h.l0).run();
    }

    public static final void onClick$2(DialogInterfaceOnClickListenerC1151650g4h dialogInterfaceOnClickListenerC1151650g4h, DialogInterface dialogInterface, int i) {
        ((C1134030fcH) dialogInterfaceOnClickListenerC1151650g4h.l0).getClass();
        C1134030fcH.LIZIZ(1);
        dialogInterface.dismiss();
    }
}
