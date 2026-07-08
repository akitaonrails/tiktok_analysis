package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.StickPointGetVideoFrameManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0oGo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class DialogInterfaceOnDismissListenerC1466680oGo implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

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
            case 4:
                onDismiss$4(this, dialogInterface);
                break;
            case 5:
                onDismiss$5(this, dialogInterface);
                break;
            case 6:
                onDismiss$6(this, dialogInterface);
                break;
            case 7:
                onDismiss$7(this, dialogInterface);
                break;
        }
    }

    public DialogInterfaceOnDismissListenerC1466680oGo(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC1466680oGo dialogInterfaceOnDismissListenerC1466680oGo, DialogInterface dialogInterface) {
        ((C1444420ngu) dialogInterfaceOnDismissListenerC1466680oGo.l0).W2(dialogInterface);
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC1466680oGo dialogInterfaceOnDismissListenerC1466680oGo, DialogInterface dialogInterface) {
        ((C1444420ngu) dialogInterfaceOnDismissListenerC1466680oGo.l0).W2(dialogInterface);
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC1466680oGo dialogInterfaceOnDismissListenerC1466680oGo, DialogInterface dialogInterface) {
        ((C1444350ngn) dialogInterfaceOnDismissListenerC1466680oGo.l0).LJIJI(dialogInterface);
    }

    public static final void onDismiss$3(DialogInterfaceOnDismissListenerC1466680oGo dialogInterfaceOnDismissListenerC1466680oGo, DialogInterface dialogInterface) {
        ((C1444350ngn) dialogInterfaceOnDismissListenerC1466680oGo.l0).LJIJI(dialogInterface);
    }

    public static final void onDismiss$4(DialogInterfaceOnDismissListenerC1466680oGo dialogInterfaceOnDismissListenerC1466680oGo, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnDismissListenerC1466680oGo.l0).invoke();
    }

    public static final void onDismiss$5(DialogInterfaceOnDismissListenerC1466680oGo dialogInterfaceOnDismissListenerC1466680oGo, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnDismissListenerC1466680oGo.l0).invoke();
    }

    public static final void onDismiss$6(DialogInterfaceOnDismissListenerC1466680oGo dialogInterfaceOnDismissListenerC1466680oGo, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnDismissListenerC1466680oGo.l0).invoke();
    }

    public static final void onDismiss$7(DialogInterfaceOnDismissListenerC1466680oGo dialogInterfaceOnDismissListenerC1466680oGo, DialogInterface dialogInterface) {
        StickPointGetVideoFrameManager stickPointGetVideoFrameManager = (StickPointGetVideoFrameManager) dialogInterfaceOnDismissListenerC1466680oGo.l0;
        stickPointGetVideoFrameManager.LJIIJ = true;
        InterfaceC1452170ntP interfaceC1452170ntP = stickPointGetVideoFrameManager.LIZ;
        if (interfaceC1452170ntP != null) {
            interfaceC1452170ntP.cancelGenVideoFrame(stickPointGetVideoFrameManager.LIZLLL);
        }
        stickPointGetVideoFrameManager.LJIIL.removeCallbacksAndMessages(null);
    }
}
