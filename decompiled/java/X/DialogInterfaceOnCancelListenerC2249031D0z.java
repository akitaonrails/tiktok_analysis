package X;

import android.content.DialogInterface;
import com.facebook.internal.WebDialog;
import com.ss.android.ugc.aweme.share.linkshare.OpenLinkShareMainActivity;

/* JADX INFO: renamed from: X.1D0z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class DialogInterfaceOnCancelListenerC2249031D0z implements DialogInterface.OnCancelListener {
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

    public DialogInterfaceOnCancelListenerC2249031D0z(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(DialogInterfaceOnCancelListenerC2249031D0z dialogInterfaceOnCancelListenerC2249031D0z, DialogInterface dialogInterface) {
        OpenLinkShareMainActivity openLinkShareMainActivity = (OpenLinkShareMainActivity) dialogInterfaceOnCancelListenerC2249031D0z.l0;
        openLinkShareMainActivity.getClass();
        openLinkShareMainActivity.LLLLZI(C1B4F.LJIILL);
        openLinkShareMainActivity.close();
    }

    public static final void onCancel$1(DialogInterfaceOnCancelListenerC2249031D0z dialogInterfaceOnCancelListenerC2249031D0z, DialogInterface dialogInterface) {
        ((WebDialog) dialogInterfaceOnCancelListenerC2249031D0z.l0).cancel();
    }
}
