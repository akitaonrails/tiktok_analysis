package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.shortvideo.privacy.ui.PublishDefaultPermissionFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0oGn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class DialogInterfaceOnDismissListenerC1466670oGn implements DialogInterface.OnDismissListener {
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
            case 2:
                onDismiss$2(this, dialogInterface);
                break;
            case 3:
                onDismiss$3(this, dialogInterface);
                break;
        }
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC1466670oGn dialogInterfaceOnDismissListenerC1466670oGn, DialogInterface dialogInterface) {
        ((InterfaceC856160XiI) dialogInterfaceOnDismissListenerC1466670oGn.l0).LIZJ((C1444440ngw) dialogInterfaceOnDismissListenerC1466670oGn.l1);
        DialogInterface.OnDismissListener onDismissListener = ((C1444440ngw) dialogInterfaceOnDismissListenerC1466670oGn.l1).LLIZ;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC1466670oGn dialogInterfaceOnDismissListenerC1466670oGn, DialogInterface dialogInterface) {
        ((Function1) dialogInterfaceOnDismissListenerC1466670oGn.l0).invoke(Boolean.valueOf(((C1418910n1l) dialogInterfaceOnDismissListenerC1466670oGn.l1).LLIZ));
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC1466670oGn dialogInterfaceOnDismissListenerC1466670oGn, DialogInterface dialogInterface) {
        PublishDefaultPermissionFragment publishDefaultPermissionFragment;
        Fragment fragment = (Fragment) dialogInterfaceOnDismissListenerC1466670oGn.l0;
        if ((fragment instanceof PublishDefaultPermissionFragment) && (publishDefaultPermissionFragment = (PublishDefaultPermissionFragment) fragment) != null) {
            publishDefaultPermissionFragment.qS();
        }
        DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) dialogInterfaceOnDismissListenerC1466670oGn.l1;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    public static final void onDismiss$3(DialogInterfaceOnDismissListenerC1466670oGn dialogInterfaceOnDismissListenerC1466670oGn, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnDismissListenerC1466670oGn.l0).invoke();
        if (!C1459930o5v.LJIIL) {
            C1402610mbT.LJJIZ(C778450UgF.LIZ(((C1459930o5v) dialogInterfaceOnDismissListenerC1466670oGn.l1).LIZ), ((C1459930o5v) dialogInterfaceOnDismissListenerC1466670oGn.l1).LIZIZ, "other", 24);
        }
    }

    public DialogInterfaceOnDismissListenerC1466670oGn(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
