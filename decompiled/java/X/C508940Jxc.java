package X;

import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.model.LiveSubscribeLynxMap;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0Jxc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C508940Jxc {
    public static final C508940Jxc LIZ = new C508940Jxc();

    public static String LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sslocal://webcast_subscribe");
        sbLIZ.append(str);
        sbLIZ.append('?');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZLLL(String str, Map map) {
        C495520Jby c495520Jby = new C495520Jby(LIZ("/sub_package"));
        c495520Jby.LIZJ("sec_anchor_id", str);
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            c495520Jby.LIZJ((String) entry.getKey(), (String) entry.getValue());
        }
        return c495520Jby.LIZLLL();
    }

    public static String LIZIZ(Map map, Room room, String str) {
        boolean zBooleanValue;
        String user_subscribe_state_five_split;
        SubscribeInfo subscribeInfo;
        LiveSubscribeLynxMap value = LiveSubscribeLynxUrl.INSTANCE.getValue();
        Boolean bool = (Boolean) DataChannelGlobal.LLILZ.gg0(C930840aKY.class);
        int i = 1;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        if (zBooleanValue) {
            user_subscribe_state_five_split = value.getUser_subscribe_state();
        } else {
            user_subscribe_state_five_split = value.getUser_subscribe_state_five_split();
        }
        C495520Jby c495520Jby = new C495520Jby(user_subscribe_state_five_split);
        String strLJIJ = UserService.getInstance().user().LJIJ(room.getOwnerUserId());
        c495520Jby.LIZJ("anchor_id", strLJIJ);
        c495520Jby.LIZIZ(room.getId(), "room_id");
        c495520Jby.LIZJ("sec_another_user_id", strLJIJ);
        c495520Jby.LIZJ("sec_anchor_id", strLJIJ);
        w.LIZ.getClass();
        c495520Jby.LIZJ("enter_from_merge", w.LJIIIZ());
        c495520Jby.LIZJ("enter_method", w.LJIIL());
        c495520Jby.LIZJ("show_entrance", str);
        c495520Jby.LIZJ("request_id", w.LJIJI());
        c495520Jby.LIZJ("video_id", w.LJJII());
        User owner = room.getOwner();
        if (owner == null || (subscribeInfo = owner.getSubscribeInfo()) == null || !subscribeInfo.isSubscribed()) {
            i = 0;
        }
        c495520Jby.LIZ(i, "is_subscribe");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("subs_btn_click", System.currentTimeMillis());
        c495520Jby.LIZJ("subs_perf_tracker", C786410Ut5.J3(jSONObject));
        if (map != null) {
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                c495520Jby.LIZJ((String) entry.getKey(), (String) entry.getValue());
            }
        }
        c495520Jby.LIZJ("extra_log_pb", C497390Jez.LIZ("live_room"));
        return c495520Jby.LIZLLL();
    }

    public static final String LIZJ(Room room, String str, String str2, String str3) {
        String secUid;
        long id = room.getId();
        long ownerUserId = room.getOwnerUserId();
        User owner = room.getOwner();
        if (owner != null) {
            secUid = owner.getSecUid();
        } else {
            secUid = null;
        }
        C495520Jby c495520Jby = new C495520Jby("sslocal://webcast_subscribe/sub_package");
        c495520Jby.LIZJ("page_type", EnumC513390KBl.PLAN_CHANGE_PAGE.getPageName());
        c495520Jby.LIZJ("is_previous_page_popup", "1");
        c495520Jby.LIZJ("privilege_cache_timestamp", "");
        c495520Jby.LIZJ("sub_source", "normal_sub");
        c495520Jby.LIZIZ(ownerUserId, "log_anchor_id");
        c495520Jby.LIZJ("current_package_id", str);
        c495520Jby.LIZJ("package_id", "");
        c495520Jby.LIZJ("anchor_username", C0KVU.LIZ(room.getOwner()));
        c495520Jby.LIZJ("allow_cache", CardStruct.IStatusCode.DEFAULT);
        c495520Jby.LIZJ("sec_anchor_id", secUid);
        c495520Jby.LIZ(0, "sub_scene");
        c495520Jby.LIZJ("from_id", "");
        c495520Jby.LIZJ("show_entrance", "live_detail_service_plus");
        c495520Jby.LIZJ("subscribe_state", str2);
        c495520Jby.LIZJ("is_in_live_room", "1");
        c495520Jby.LIZJ("from_sub_enter", "");
        c495520Jby.LIZJ("show_back", "1");
        c495520Jby.LIZJ("backPage", "user_all_in_one_in_live_room");
        c495520Jby.LIZIZ(id, "room_id");
        c495520Jby.LIZJ("is_native", "1");
        c495520Jby.LIZJ("open_benefit_page", "1");
        c495520Jby.LIZJ("native_back_scheme", str3);
        c495520Jby.LIZJ("use_default_package_id", "true");
        return c495520Jby.LIZLLL();
    }

    public static String LJ(String str, String str2, String str3, String str4, Map map) {
        C495520Jby c495520Jby = new C495520Jby(LIZ("/sub_only_space"));
        c495520Jby.LIZJ("sec_anchor_id", str);
        c495520Jby.LIZJ("enter_from", str2);
        c495520Jby.LIZJ("is_fullscreen", str3);
        c495520Jby.LIZJ("preview_mode", str4);
        for (Map.Entry entry : map.entrySet()) {
            c495520Jby.LIZJ((String) entry.getKey(), (String) entry.getValue());
        }
        return c495520Jby.LIZLLL();
    }
}
