package X;

import android.content.DialogInterface;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Amk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class DialogInterfaceOnCancelListenerC2189601Amk implements DialogInterface.OnCancelListener {
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
            case 2:
                onCancel$2(this, dialogInterface);
                break;
        }
    }

    public DialogInterfaceOnCancelListenerC2189601Amk(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(DialogInterfaceOnCancelListenerC2189601Amk dialogInterfaceOnCancelListenerC2189601Amk, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnCancelListenerC2189601Amk.l0).invoke();
    }

    public static final void onCancel$1(DialogInterfaceOnCancelListenerC2189601Amk dialogInterfaceOnCancelListenerC2189601Amk, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnCancelListenerC2189601Amk.l0).invoke();
    }

    public static final void onCancel$2(DialogInterfaceOnCancelListenerC2189601Amk dialogInterfaceOnCancelListenerC2189601Amk, DialogInterface dialogInterface) {
        Function0 function0 = (Function0) dialogInterfaceOnCancelListenerC2189601Amk.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
