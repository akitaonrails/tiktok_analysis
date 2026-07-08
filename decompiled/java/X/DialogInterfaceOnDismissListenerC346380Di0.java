package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.social.thought.ui.SocialThoughtPanelFragment;

/* JADX INFO: renamed from: X.0Di0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class DialogInterfaceOnDismissListenerC346380Di0 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;

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

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC346380Di0 dialogInterfaceOnDismissListenerC346380Di0, DialogInterface dialogInterface) {
        if (((C09AE) dialogInterfaceOnDismissListenerC346380Di0.l0).isActive()) {
            ((C571990Mc1) dialogInterfaceOnDismissListenerC346380Di0.l1).w2().iv();
            ((C09AE) dialogInterfaceOnDismissListenerC346380Di0.l0).LIZIZ(null);
        }
        ((C571990Mc1) dialogInterfaceOnDismissListenerC346380Di0.l1).LLJIJIL = false;
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC346380Di0 dialogInterfaceOnDismissListenerC346380Di0, DialogInterface dialogInterface) {
        if (!((C013C) dialogInterfaceOnDismissListenerC346380Di0.l0).element) {
            ((SocialThoughtPanelFragment) dialogInterfaceOnDismissListenerC346380Di0.l1).WR("cancel");
        }
    }

    public DialogInterfaceOnDismissListenerC346380Di0(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
