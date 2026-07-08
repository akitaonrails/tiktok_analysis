package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: renamed from: X.01ZD, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01ZD {
    public static boolean LIZ(int i) {
        User owner;
        boolean z;
        Integer numLJ;
        int iIntValue;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            owner = room.getOwner();
        } else {
            owner = null;
        }
        if (owner != null && UserService.getInstance().user().getCurrentUserId() == owner.getId()) {
            z = true;
        } else {
            z = false;
        }
        if (z || C500260Jjc.LJJIL()) {
            numLJ = Integer.valueOf(LiveAbLabelSetting.INSTANCE.getIntValue("multi_guest_layout_function_opt"));
        } else {
            numLJ = C931820aM8.LJ("multi_guest_layout_function_opt");
        }
        if (numLJ != null) {
            iIntValue = numLJ.intValue();
        } else {
            iIntValue = 0;
        }
        if ((iIntValue & i) == i) {
            return true;
        }
        return false;
    }
}
