package X;

import android.content.DialogInterface;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0j2w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class DialogInterfaceOnCancelListenerC1265880j2w implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;
    public Object l1;

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

    public static final void onCancel$0(DialogInterfaceOnCancelListenerC1265880j2w dialogInterfaceOnCancelListenerC1265880j2w, DialogInterface dialogInterface) {
        T t = ((C259800zU) dialogInterfaceOnCancelListenerC1265880j2w.l0).element;
        if (t != 0) {
            ((Function1) dialogInterfaceOnCancelListenerC1265880j2w.l1).invoke(t);
        }
    }

    public static final void onCancel$1(DialogInterfaceOnCancelListenerC1265880j2w dialogInterfaceOnCancelListenerC1265880j2w, DialogInterface dialogInterface) {
        C1261270ivV c1261270ivV = (C1261270ivV) dialogInterfaceOnCancelListenerC1265880j2w.l0;
        if (c1261270ivV != null) {
            Integer num = (Integer) dialogInterfaceOnCancelListenerC1265880j2w.l1;
            C1261250ivT c1261250ivT = C1261250ivT.LIZ;
            EnumC1261310ivZ enumC1261310ivZ = EnumC1261310ivZ.CANCEL;
            c1261250ivT.getClass();
            C1261250ivT.LIZIZ(enumC1261310ivZ, c1261270ivV, num);
        }
    }

    public DialogInterfaceOnCancelListenerC1265880j2w(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
