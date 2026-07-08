package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.lemon.Lemon8ProfileContentSyncConfig;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.10kO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class DialogInterfaceOnDismissListenerC19333410kO implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC19333410kO dialogInterfaceOnDismissListenerC19333410kO, DialogInterface dialogInterface) {
        C10EA c10ea = (C10EA) dialogInterfaceOnDismissListenerC19333410kO.l0;
        C10EW c10ew = (C10EW) dialogInterfaceOnDismissListenerC19333410kO.l1;
        C10EI c10ei = (C10EI) dialogInterfaceOnDismissListenerC19333410kO.l2;
        WeakReference<C1397510mTF> weakReference = C10E9.LIZ;
        if (weakReference != null) {
            weakReference.clear();
        }
        if (c10ea != null) {
            c10ea.onCancel();
        }
        if (c10ew != null) {
            c10ew.LIZJ();
        }
        C10EH c10eh = (C10EH) c10ei;
        C10EA c10ea2 = c10eh.LIZ.LLIZLLLIL;
        if (c10ea2 != null) {
            c10ea2.onCancel();
        }
        C10EW c10ew2 = c10eh.LIZ.LLJ;
        if (c10ew2 != null) {
            c10ew2.LIZJ();
        }
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC19333410kO dialogInterfaceOnDismissListenerC19333410kO, DialogInterface dialogInterface) {
        ((C20656615sK) dialogInterfaceOnDismissListenerC19333410kO.l0).LIZ();
        if (!((C013C) dialogInterfaceOnDismissListenerC19333410kO.l1).element) {
            C10G1 c10g1 = C10G1.LIZ;
            Lemon8ProfileContentSyncConfig lemon8ProfileContentSyncConfig = (Lemon8ProfileContentSyncConfig) dialogInterfaceOnDismissListenerC19333410kO.l2;
            c10g1.getClass();
            C10G1.LIZJ(lemon8ProfileContentSyncConfig, "click", "cancel");
        }
    }

    public DialogInterfaceOnDismissListenerC19333410kO(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
