package X;

import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0JEo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C488720JEo {
    public static final void LIZ(LiveRoomStruct liveRoomStruct, String str, String str2, String str3) {
        String uid;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        InterfaceC488740JEq interfaceC488740JEqLJJJJLL;
        if (liveRoomStruct != null) {
            HashMap map = new HashMap();
            map.put("enter_from_merge", str);
            map.put("enter_method", "live_cell");
            User user = liveRoomStruct.owner;
            if (user == null || (uid = user.getUid()) == null) {
                uid = "";
            }
            map.put("anchor_id", uid);
            map.put("room_id", String.valueOf(liveRoomStruct.id));
            map.put("action_type", str3);
            map.put("click_icon", str2);
            ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
            if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null && (interfaceC488740JEqLJJJJLL = interfaceC20673515v3K4.LJJJJLL("livesdk_mask_layer_click")) != null) {
                interfaceC488740JEqLJJJJLL.LIZIZ(map);
                interfaceC488740JEqLJJJJLL.LIZ();
            }
        }
    }
}
