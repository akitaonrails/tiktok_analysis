package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.game.broadcast.dialog.GameMessageAlertDialog;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;

/* JADX INFO: renamed from: X.0Kd9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class DialogInterfaceOnClickListenerC521730Kd9 implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                break;
            case 1:
                onClick$1(this, dialogInterface, i);
                break;
            case 2:
                onClick$2(this, dialogInterface, i);
                break;
            case 3:
                onClick$3(this, dialogInterface, i);
                break;
            case 4:
                onClick$4(this, dialogInterface, i);
                break;
        }
    }

    public DialogInterfaceOnClickListenerC521730Kd9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(DialogInterfaceOnClickListenerC521730Kd9 dialogInterfaceOnClickListenerC521730Kd9, DialogInterface dialogInterface, int i) {
        Context context = ((GameMessageAlertDialog) dialogInterfaceOnClickListenerC521730Kd9.l0).getContext();
        if (Build.VERSION.SDK_INT >= 28) {
            C0W78.LJIIIIZZ(context, "android.settings.action.MANAGE_OVERLAY_PERMISSION");
        } else {
            C0W78.LJII(context);
        }
        dialogInterface.dismiss();
    }

    public static final void onClick$1(DialogInterfaceOnClickListenerC521730Kd9 dialogInterfaceOnClickListenerC521730Kd9, DialogInterface dialogInterface, int i) {
        ((GameMessageAlertDialog) dialogInterfaceOnClickListenerC521730Kd9.l0).getClass();
        dialogInterface.dismiss();
    }

    public static final void onClick$2(DialogInterfaceOnClickListenerC521730Kd9 dialogInterfaceOnClickListenerC521730Kd9, DialogInterface dialogInterface, int i) {
        CommentWidget commentWidget = (CommentWidget) dialogInterfaceOnClickListenerC521730Kd9.l0;
        commentWidget.LLLIILIL = null;
        C473050Igp.LIZIZ().LJ();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_tns_ags_float_comment_ban");
        c474500IjALIZ.LJIJJLI(commentWidget.dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII("click_ok", "action_type");
        c474500IjALIZ.LIZ();
    }

    public static final void onClick$3(DialogInterfaceOnClickListenerC521730Kd9 dialogInterfaceOnClickListenerC521730Kd9, DialogInterface dialogInterface, int i) {
        CommentWidget commentWidget = (CommentWidget) dialogInterfaceOnClickListenerC521730Kd9.l0;
        commentWidget.getClass();
        IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        if (iHostAction != null) {
            iHostAction.jumpToAgsStatusPage(commentWidget.getContext(), "popup_live_comment_ban");
        }
        commentWidget.LLLIILIL = null;
        C473050Igp.LIZIZ().LJ();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_tns_ags_float_comment_ban");
        c474500IjALIZ.LJIJJLI(commentWidget.dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII("click_details", "action_type");
        c474500IjALIZ.LIZ();
    }

    public static final void onClick$4(DialogInterfaceOnClickListenerC521730Kd9 dialogInterfaceOnClickListenerC521730Kd9, DialogInterface dialogInterface, int i) {
        String str;
        if (TextUtils.equals(((EnterRoomConfig) dialogInterfaceOnClickListenerC521730Kd9.l0).mRoomsData.enterFromMerge, "push")) {
            if (C2093608Ic.LJ(((EnterRoomConfig) dialogInterfaceOnClickListenerC521730Kd9.l0).mRoomsData.userId)) {
                str = "";
            } else {
                str = ((EnterRoomConfig) dialogInterfaceOnClickListenerC521730Kd9.l0).mRoomsData.userId;
            }
            C486660J6q.LJIIJJI(((EnterRoomConfig) dialogInterfaceOnClickListenerC521730Kd9.l0).mRoomsData.roomId, str, "no_wifi_dialog_cancel");
        }
        dialogInterface.dismiss();
    }
}
