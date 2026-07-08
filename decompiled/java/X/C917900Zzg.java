package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestAllLayoutCornerOptAudienceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMgPreviewLivePageSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: renamed from: X.0Zzg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917900Zzg {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        User owner = room != null ? room.getOwner() : null;
        if (owner != null && UserService.getInstance().user().getCurrentUserId() == owner.getId()) {
            if (LiveAbLabelSetting.INSTANCE.getIntValue("multi_guest_all_layout_corner_opt") != 1) {
                return false;
            }
        } else if (!LinkMicMgPreviewLivePageSetting.INSTANCE.showLayoutInPreviewLivePage() || !C500260Jjc.LJJIL()) {
            Integer numLJ = C931820aM8.LJ("multi_guest_all_layout_corner_opt");
            if (numLJ == null || numLJ.intValue() != 1 || !MultiGuestAllLayoutCornerOptAudienceSetting.INSTANCE.isEnable()) {
                return false;
            }
        } else if (LiveAbLabelSetting.INSTANCE.getIntValue("multi_guest_all_layout_corner_opt") != 1) {
            return false;
        }
        return true;
    }
}
