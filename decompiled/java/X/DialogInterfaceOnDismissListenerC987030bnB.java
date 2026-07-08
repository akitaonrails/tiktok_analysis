package X;

import android.content.DialogInterface;
import com.bytedance.android.live.liveinteract.api.ShowGuestManagePanelEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0bnB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class DialogInterfaceOnDismissListenerC987030bnB implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
        }
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC987030bnB dialogInterfaceOnDismissListenerC987030bnB, DialogInterface dialogInterface) {
        DataChannel dataChannel;
        if (!((DialogC933230aOP) dialogInterfaceOnDismissListenerC987030bnB.l1).LLJJJJJIL && (dataChannel = ((C931830aM9) dialogInterfaceOnDismissListenerC987030bnB.l2).LL) != null) {
            dataChannel.LC0(ShowGuestManagePanelEvent.class, dialogInterfaceOnDismissListenerC987030bnB.s0);
        }
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC987030bnB dialogInterfaceOnDismissListenerC987030bnB, DialogInterface dialogInterface) {
        DataChannel dataChannel;
        if (!((DialogC933230aOP) dialogInterfaceOnDismissListenerC987030bnB.l1).LLJJJJJIL && (dataChannel = ((MultiLiveAsAnchorListDialogV2) dialogInterfaceOnDismissListenerC987030bnB.l2).LLJI) != null) {
            dataChannel.LC0(ShowGuestManagePanelEvent.class, dialogInterfaceOnDismissListenerC987030bnB.s0);
        }
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC987030bnB dialogInterfaceOnDismissListenerC987030bnB, DialogInterface dialogInterface) {
        DataChannel dataChannel;
        if (!((DialogC933230aOP) dialogInterfaceOnDismissListenerC987030bnB.l1).LLJJJJJIL && (dataChannel = ((C932050aMV) dialogInterfaceOnDismissListenerC987030bnB.l2).LL) != null) {
            dataChannel.LC0(ShowGuestManagePanelEvent.class, dialogInterfaceOnDismissListenerC987030bnB.s0);
        }
    }

    public static final void onDismiss$3(DialogInterfaceOnDismissListenerC987030bnB dialogInterfaceOnDismissListenerC987030bnB, DialogInterface dialogInterface) {
        DataChannel dataChannel;
        if (!((DialogC933230aOP) dialogInterfaceOnDismissListenerC987030bnB.l1).LLJJJJJIL && (dataChannel = ((C932420aN6) dialogInterfaceOnDismissListenerC987030bnB.l2).LLILZIL) != null) {
            dataChannel.LC0(ShowGuestManagePanelEvent.class, dialogInterfaceOnDismissListenerC987030bnB.s0);
        }
    }

    public static final void onDismiss$4(DialogInterfaceOnDismissListenerC987030bnB dialogInterfaceOnDismissListenerC987030bnB, DialogInterface dialogInterface) {
        if (!((DialogC933230aOP) dialogInterfaceOnDismissListenerC987030bnB.l1).LLJJJJJIL) {
            ((C920060a3A) dialogInterfaceOnDismissListenerC987030bnB.l2).LIZ.LIZ.LC0(ShowGuestManagePanelEvent.class, dialogInterfaceOnDismissListenerC987030bnB.s0);
        }
    }

    public static final void onDismiss$5(DialogInterfaceOnDismissListenerC987030bnB dialogInterfaceOnDismissListenerC987030bnB, DialogInterface dialogInterface) {
        if (!((DialogC933230aOP) dialogInterfaceOnDismissListenerC987030bnB.l1).LLJJJJJIL) {
            ((C920070a3B) dialogInterfaceOnDismissListenerC987030bnB.l2).LIZ.LIZ.LC0(ShowGuestManagePanelEvent.class, dialogInterfaceOnDismissListenerC987030bnB.s0);
        }
    }

    public DialogInterfaceOnDismissListenerC987030bnB(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
