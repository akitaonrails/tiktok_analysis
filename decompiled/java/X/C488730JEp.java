package X;

import com.ss.android.ugc.aweme.commercialize.service.IAdTagLogHelper;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0JEp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C488730JEp {
    public static final C488730JEp LIZ = new C488730JEp();

    public static void LIZIZ(C1ACA c1aca) {
        ILiveOuterService iLiveOuterService;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        InterfaceC488740JEq interfaceC488740JEqLJJJJLL;
        String uid;
        String string;
        User user;
        if (c1aca != null && c1aca.LIZJ != null && (iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)) != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null && (interfaceC488740JEqLJJJJLL = interfaceC20673515v3K4.LJJJJLL("livesdk_live_fyp_toggle_show")) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LiveRoomStruct liveRoomStruct = c1aca.LIZJ;
            String str = "";
            if (liveRoomStruct == null || (user = liveRoomStruct.owner) == null || (uid = user.getUid()) == null) {
                uid = "";
            }
            linkedHashMap.put("anchor_id", uid);
            LiveRoomStruct liveRoomStruct2 = c1aca.LIZJ;
            if (liveRoomStruct2 != null && (string = Long.valueOf(liveRoomStruct2.id).toString()) != null) {
                str = string;
            }
            linkedHashMap.put("room_id", str);
            interfaceC488740JEqLJJJJLL.LIZIZ(linkedHashMap);
            interfaceC488740JEqLJJJJLL.LIZ();
        }
    }

    public static void LIZJ(C1ACA c1aca) {
        LiveRoomStruct liveRoomStruct;
        if (c1aca != null && (liveRoomStruct = c1aca.LIZJ) != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_featured_lable_show");
            c474500IjALIZ.LJJII(c1aca.LIZLLL, "enter_from_merge");
            c474500IjALIZ.LJJII("live_cell", "enter_method");
            c474500IjALIZ.LJJII("click", "action_type");
            c474500IjALIZ.LJJII(Long.valueOf(liveRoomStruct.id), "room_id");
            c474500IjALIZ.LJJII(Long.valueOf(liveRoomStruct.getAnchorId()), "anchor_id");
            c474500IjALIZ.LIZ();
        }
    }

    public static void LIZ(C1ACA c1aca, int i) {
        AwemeRawAd awemeRawAd;
        Aweme aweme;
        IAdTagLogHelper iAdTagLogHelper = (IAdTagLogHelper) PluggableExtentionKt.pluggableSpi$default(IAdTagLogHelper.class, false, false, false, 14, null);
        if (iAdTagLogHelper != null) {
            if (c1aca != null && (aweme = c1aca.LIZIZ) != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            iAdTagLogHelper.LIZ(awemeRawAd, 1, i);
        }
    }
}
