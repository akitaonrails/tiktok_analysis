package X;

import com.ss.android.ugc.aweme.feed.model.live.LiveEventInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.PaidEventPreview;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1AAZ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AAZ {
    public static final C1AAZ LIZ = new C1AAZ();

    public static Map LIZ(C1ACA c1aca) {
        String str;
        Long lValueOf;
        LiveRoomStruct liveRoomStruct;
        User user;
        LiveRoomStruct liveRoomStruct2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String uid = null;
        if (c1aca != null) {
            str = c1aca.LIZLLL;
        } else {
            str = null;
        }
        linkedHashMap.put("enter_from_merge", str);
        linkedHashMap.put("enter_method", "live_cell");
        if (c1aca != null && (liveRoomStruct2 = c1aca.LIZJ) != null) {
            lValueOf = Long.valueOf(liveRoomStruct2.id);
        } else {
            lValueOf = null;
        }
        linkedHashMap.put("room_id", String.valueOf(lValueOf));
        if (c1aca != null && (liveRoomStruct = c1aca.LIZJ) != null && (user = liveRoomStruct.owner) != null) {
            uid = user.getUid();
        }
        linkedHashMap.put("anchor_id", uid);
        linkedHashMap.put("event_page", "preview_card");
        return linkedHashMap;
    }

    public static void LIZIZ(C1ACA c1aca) {
        EnumC2175001AAg enumC2175001AAgLJIILLIIL;
        LiveEventInfo liveEventInfo;
        PaidEventPreview paidEventPreview;
        LiveRoomStruct liveRoomStruct;
        Long l = null;
        if (c1aca != null && (liveRoomStruct = c1aca.LIZJ) != null) {
            enumC2175001AAgLJIILLIIL = C1ABT.LJIILLIIL(liveRoomStruct);
        } else {
            enumC2175001AAgLJIILLIIL = null;
        }
        if (enumC2175001AAgLJIILLIIL == EnumC2175001AAg.PREVIEW) {
            Map mapLIZ = LIZ(c1aca);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJII(mapLIZ);
            LiveRoomStruct liveRoomStruct2 = c1aca.LIZJ;
            if (liveRoomStruct2 != null && (liveEventInfo = liveRoomStruct2.liveEventInfo) != null && (paidEventPreview = liveEventInfo.paidEventPreview) != null) {
                l = paidEventPreview.allowPreviewTime;
            }
            c2344009Gk.LJIIIIZZ("count_down_time", String.valueOf(l));
            C20684815ws.LJIILLIIL("livesdk_paid_event_count_down_click", c2344009Gk.LIZ);
        }
    }

    public static void LIZJ(C1ACA c1aca, String str, String str2) {
        Map mapLIZ = LIZ(c1aca);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(mapLIZ);
        c2344009Gk.LJIIIIZZ("action_type", str2);
        c2344009Gk.LJIIIIZZ("button_name", str);
        C20684815ws.LJIILLIIL("livesdk_paid_event_stop_page_click", c2344009Gk.LIZ);
    }
}
