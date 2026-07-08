package X;

import android.content.DialogInterface;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.FastGiftVisibleChannel;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideDialogWidget;
import com.bytedance.android.livesdk.dataChannel.RemindFollowDialogVisibilityChannel;
import com.bytedance.android.livesdk.grouplive.memberselection.UserSelectionAssem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0g4k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class DialogInterfaceOnDismissListenerC1151680g4k implements DialogInterface.OnDismissListener {
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
            case 8:
                onDismiss$8(this, dialogInterface);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onDismiss$9(this, dialogInterface);
                break;
        }
    }

    public DialogInterfaceOnDismissListenerC1151680g4k(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC1151680g4k dialogInterfaceOnDismissListenerC1151680g4k, DialogInterface dialogInterface) {
        long jLongValue;
        UserSelectionAssem userSelectionAssem = (UserSelectionAssem) dialogInterfaceOnDismissListenerC1151680g4k.l0;
        userSelectionAssem.getClass();
        C1121570fIB c1121570fIB = new C1121570fIB((User) null);
        Long l = userSelectionAssem.Go().LLILLL;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c1121570fIB.LJIIIZ = jLongValue;
        c1121570fIB.LIZJ = userSelectionAssem.Go().LLILLJJLI;
        DataChannel dataChannel = userSelectionAssem.Go().LL;
        if (dataChannel != null) {
            dataChannel.LC0(SendGiftEvent.class, c1121570fIB);
        }
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC1151680g4k dialogInterfaceOnDismissListenerC1151680g4k, DialogInterface dialogInterface) {
        DataChannel dataChannel = ((FollowGuideDialogWidget) dialogInterfaceOnDismissListenerC1151680g4k.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(RemindFollowDialogVisibilityChannel.class, Boolean.FALSE);
        }
        C1105740ese c1105740eseLIZ = C1105770esh.LIZ();
        c1105740eseLIZ.LIZIZ = false;
        c1105740eseLIZ.LIZLLL = null;
        c1105740eseLIZ.LIZIZ();
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC1151680g4k dialogInterfaceOnDismissListenerC1151680g4k, DialogInterface dialogInterface) {
        AbstractC1149720g1a.LJI.remove(((AbstractC1149720g1a) dialogInterfaceOnDismissListenerC1151680g4k.l0).getClass().getSimpleName());
        ((C11NJ) ((AbstractC1149720g1a) dialogInterfaceOnDismissListenerC1151680g4k.l0).LIZJ().LL.LIZ.getValue()).dispose();
    }

    public static final void onDismiss$3(DialogInterfaceOnDismissListenerC1151680g4k dialogInterfaceOnDismissListenerC1151680g4k, DialogInterface dialogInterface) {
        DataChannel dataChannel = (DataChannel) dialogInterfaceOnDismissListenerC1151680g4k.l0;
        if (dataChannel != null) {
            dataChannel.zW(FastGiftVisibleChannel.class, Boolean.FALSE);
        }
    }

    public static final void onDismiss$4(DialogInterfaceOnDismissListenerC1151680g4k dialogInterfaceOnDismissListenerC1151680g4k, DialogInterface dialogInterface) {
        ((C1129040fUE) dialogInterfaceOnDismissListenerC1151680g4k.l0).LIZ(null);
        ((C1129040fUE) dialogInterfaceOnDismissListenerC1151680g4k.l0).LJI.invoke();
    }

    public static final void onDismiss$5(DialogInterfaceOnDismissListenerC1151680g4k dialogInterfaceOnDismissListenerC1151680g4k, DialogInterface dialogInterface) {
        ((C1134030fcH) dialogInterfaceOnDismissListenerC1151680g4k.l0).LJII = null;
    }

    public static final void onDismiss$6(DialogInterfaceOnDismissListenerC1151680g4k dialogInterfaceOnDismissListenerC1151680g4k, DialogInterface dialogInterface) {
        ((C1134030fcH) dialogInterfaceOnDismissListenerC1151680g4k.l0).LJ = null;
    }

    public static final void onDismiss$7(DialogInterfaceOnDismissListenerC1151680g4k dialogInterfaceOnDismissListenerC1151680g4k, DialogInterface dialogInterface) {
        ((C1134030fcH) dialogInterfaceOnDismissListenerC1151680g4k.l0).LJI = null;
    }

    public static final void onDismiss$8(DialogInterfaceOnDismissListenerC1151680g4k dialogInterfaceOnDismissListenerC1151680g4k, DialogInterface dialogInterface) {
        ((C1134030fcH) dialogInterfaceOnDismissListenerC1151680g4k.l0).LJFF = null;
    }

    public static final void onDismiss$9(DialogInterfaceOnDismissListenerC1151680g4k dialogInterfaceOnDismissListenerC1151680g4k, DialogInterface dialogInterface) {
        DialogC1118080fCY dialogC1118080fCY = (DialogC1118080fCY) dialogInterfaceOnDismissListenerC1151680g4k.l0;
        dialogC1118080fCY.getClass();
        C473050Igp.LIZIZ().LJ();
        DialogInterface.OnDismissListener onDismissListener = dialogC1118080fCY.LLJI;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogC1118080fCY);
        }
    }
}
