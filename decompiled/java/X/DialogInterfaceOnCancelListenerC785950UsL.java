package X;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import webcast.api.room.EntranceConditionsPopup;

/* JADX INFO: renamed from: X.0UsL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class DialogInterfaceOnCancelListenerC785950UsL implements DialogInterface.OnCancelListener {
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
            case 2:
                onCancel$2(this, dialogInterface);
                break;
        }
    }

    public static final void onCancel$0(DialogInterfaceOnCancelListenerC785950UsL dialogInterfaceOnCancelListenerC785950UsL, DialogInterface dialogInterface) {
        ((VoiceChatBroadcastFragment) dialogInterfaceOnCancelListenerC785950UsL.l0).LLJJIJI = null;
        Integer num = (Integer) dialogInterfaceOnCancelListenerC785950UsL.l1;
        if (num != null && num.intValue() == 4) {
            C781270Ukn.LJIJJLI().Tn1(2);
        }
    }

    public static final void onCancel$1(DialogInterfaceOnCancelListenerC785950UsL dialogInterfaceOnCancelListenerC785950UsL, DialogInterface dialogInterface) {
        C0UQX.LJJII((DataChannel) dialogInterfaceOnCancelListenerC785950UsL.l0, (EntranceConditionsPopup) dialogInterfaceOnCancelListenerC785950UsL.l1, "click", "else", null);
    }

    public static final void onCancel$2(DialogInterfaceOnCancelListenerC785950UsL dialogInterfaceOnCancelListenerC785950UsL, DialogInterface dialogInterface) {
        AbstractC784890Uqd abstractC784890Uqd = (AbstractC784890Uqd) dialogInterfaceOnCancelListenerC785950UsL.l0;
        InterfaceC784910Uqf interfaceC784910Uqf = (InterfaceC784910Uqf) dialogInterfaceOnCancelListenerC785950UsL.l1;
        abstractC784890Uqd.getClass();
        interfaceC784910Uqf.cancel();
        abstractC784890Uqd.LJFF();
    }

    public DialogInterfaceOnCancelListenerC785950UsL(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
