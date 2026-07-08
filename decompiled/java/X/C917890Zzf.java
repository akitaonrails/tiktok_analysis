package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestAllLayoutCornerOptAudienceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: renamed from: X.0Zzf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917890Zzf {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(boolean z) {
        User owner;
        boolean z2;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            owner = room.getOwner();
        } else {
            owner = null;
        }
        if (owner != null && UserService.getInstance().user().getCurrentUserId() == owner.getId()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (LiveAbLabelSetting.INSTANCE.getIntValue("enable_mic_avatar_size_opt") != 1) {
                return false;
            }
        } else {
            if (z) {
                return true;
            }
            Integer numLJ = C931820aM8.LJ("enable_mic_avatar_size_opt");
            if (numLJ == null || numLJ.intValue() != 1 || !MultiGuestAllLayoutCornerOptAudienceSetting.INSTANCE.isEnable()) {
                return false;
            }
        }
        return true;
    }
}
