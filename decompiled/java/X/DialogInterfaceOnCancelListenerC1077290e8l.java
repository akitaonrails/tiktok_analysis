package X;

import android.content.DialogInterface;

/* JADX INFO: renamed from: X.0e8l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class DialogInterfaceOnCancelListenerC1077290e8l implements DialogInterface.OnCancelListener {
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

    public DialogInterfaceOnCancelListenerC1077290e8l(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(DialogInterfaceOnCancelListenerC1077290e8l dialogInterfaceOnCancelListenerC1077290e8l, DialogInterface dialogInterface) {
        ((C1038030d7R) dialogInterfaceOnCancelListenerC1077290e8l.l0).LLIZLLLIL = false;
    }

    public static final void onCancel$1(DialogInterfaceOnCancelListenerC1077290e8l dialogInterfaceOnCancelListenerC1077290e8l, DialogInterface dialogInterface) {
        C1022620cia.LJ("AdCIPMiniCardAnoleModul", "setOnCancelListener");
        ((C1017940cb2) dialogInterfaceOnCancelListenerC1077290e8l.l0).LJFF();
        C1017940cb2 c1017940cb2 = (C1017940cb2) dialogInterfaceOnCancelListenerC1077290e8l.l0;
        c1017940cb2.LIZJ = null;
        c1017940cb2.LJI = true;
    }
}
