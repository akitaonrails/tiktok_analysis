package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.ui.AIBotDisclaimerDialogFragment;

/* JADX INFO: renamed from: X.14d3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class DialogInterfaceOnCancelListenerC20307114d3 implements DialogInterface.OnCancelListener {
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

    public DialogInterfaceOnCancelListenerC20307114d3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(DialogInterfaceOnCancelListenerC20307114d3 dialogInterfaceOnCancelListenerC20307114d3, DialogInterface dialogInterface) {
        ((AIBotDisclaimerDialogFragment) dialogInterfaceOnCancelListenerC20307114d3.l0).LLJI.LIZIZ.invoke();
    }

    public static final void onCancel$1(DialogInterfaceOnCancelListenerC20307114d3 dialogInterfaceOnCancelListenerC20307114d3, DialogInterface dialogInterface) {
        ((AbstractC20277614Vy) dialogInterfaceOnCancelListenerC20307114d3.l0).LIZ(0, "uploadCancel");
    }

    public static final void onCancel$2(DialogInterfaceOnCancelListenerC20307114d3 dialogInterfaceOnCancelListenerC20307114d3, DialogInterface dialogInterface) {
        C20277714Vz c20277714Vz = (C20277714Vz) dialogInterfaceOnCancelListenerC20307114d3.l0;
        if (c20277714Vz.LIZIZ.get() != null) {
            c20277714Vz.LIZIZ.get().cancelUpload();
        }
    }
}
