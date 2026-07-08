package X;

import android.content.DialogInterface;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.anchor.LiveShowAnchorWidget;

/* JADX INFO: renamed from: X.01z4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC512001z4 implements DialogInterface.OnCancelListener {
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

    public DialogInterfaceOnCancelListenerC512001z4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(DialogInterfaceOnCancelListenerC512001z4 dialogInterfaceOnCancelListenerC512001z4, DialogInterface dialogInterface) {
        ((LiveShowAnchorWidget) dialogInterfaceOnCancelListenerC512001z4.l0).L1(2);
    }

    public static final void onCancel$1(DialogInterfaceOnCancelListenerC512001z4 dialogInterfaceOnCancelListenerC512001z4, DialogInterface dialogInterface) {
        ((LiveShowAnchorWidget) dialogInterfaceOnCancelListenerC512001z4.l0).L1(2);
    }

    public static final void onCancel$2(DialogInterfaceOnCancelListenerC512001z4 dialogInterfaceOnCancelListenerC512001z4, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        Runnable runnable = (Runnable) dialogInterfaceOnCancelListenerC512001z4.l0;
        if (runnable != null) {
            runnable.run();
        }
    }
}
