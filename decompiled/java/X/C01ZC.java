package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: renamed from: X.01ZC, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01ZC {
    public static boolean LIZ() {
        User owner;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        return (room == null || (owner = room.getOwner()) == null || UserService.getInstance().user().getCurrentUserId() != owner.getId()) ? false : true;
    }

    public static boolean LIZIZ() {
        if (LIZ()) {
            if (LiveAbLabelSetting.INSTANCE.getIntValue("enable_guest_showdown_top3_mode") < 1) {
                return false;
            }
        } else if (!C500260Jjc.LJJIL()) {
            Integer numLJ = C931820aM8.LJ("enable_guest_showdown_top3_mode");
            if (numLJ == null || numLJ.intValue() < 1) {
                return false;
            }
        } else if (LiveAbLabelSetting.INSTANCE.getIntValue("enable_guest_showdown_top3_mode") < 1) {
            return false;
        }
        return true;
    }
}
