package X;

import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.Map;
import qo2.w;

/* JADX INFO: renamed from: X.0fMF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1124090fMF {
    public static final /* synthetic */ int LIZ = 0;

    public static HashMap LIZIZ(DataChannel dataChannel) {
        boolean z;
        String strLIZ;
        HashMap map = new HashMap();
        w wVar = w.LIZ;
        wVar.getClass();
        map.put("param_live_enter_from_merge", w.LJIIIZ());
        map.put("param_live_enter_method_merge", w.LJIIL());
        map.put("param_live_window_mode", w.LJIILLIIL());
        map.put("param_live_action_type", w.LIZLLL());
        map.put("param_live_rec_content_id", wVar.LIZ());
        map.put("param_live_rec_content_type", wVar.LIZIZ());
        map.put("param_search_id", w.LJIL());
        map.put("param_enter_room_video_id", w.LJJII());
        map.put("param_search_result_id", w.LJJ());
        map.put("param_live_begin_time", Long.valueOf(w.LJFF()));
        map.put("param_live_begin_time_real", Long.valueOf(w.LJI()));
        map.put("param_ec_recommend_info", w.LJIIIIZZ());
        Map mapLJII = w.LJII();
        LIZ("is_inner", map, mapLJII);
        LIZ("inner_search_id", map, mapLJII);
        LIZ("rank_inner", map, mapLJII);
        LIZ("is_slide", map, mapLJII);
        LIZ("slide_rank", map, mapLJII);
        if (dataChannel != null) {
            map.put("param_room", dataChannel.gg0(RoomChannel.class));
            map.put("live_activity_created_time_stamp_data", dataChannel.gg0(C781130UkZ.class));
            AdLiveEnterRoomConfig adLiveEnterRoomConfigLJII = C0IXW.LJII(dataChannel);
            if (adLiveEnterRoomConfigLJII != null) {
                map.put("param_effect_ad_extra", adLiveEnterRoomConfigLJII.LIZIZ());
                String str = adLiveEnterRoomConfigLJII.adId;
                if (str != null) {
                    map.put("param_effect_ad_id", str);
                }
                map.put("param_ad_ttclid", adLiveEnterRoomConfigLJII.ttclId);
            }
            map.put("param_enter_from_effect_ad_bool", dataChannel.gg0(C755580TkS.class));
            map.put("param_extra_auto_route_schema", dataChannel.gg0(C1083300eIS.class));
            map.put("param_enter_room_from_click_product_card", dataChannel.gg0(C753930Thn.class));
            map.put("param_enter_room_has_shown_ec_preview_card", dataChannel.gg0(C753950Thp.class));
            map.put("param_extra_auto_open_product_bag", dataChannel.gg0(C752690Tfn.class));
            map.put("param_product_bag_page_params", dataChannel.gg0(C1094870eb7.class));
            map.put("param_extra_opt_auto_route_schema_routing_timing", dataChannel.gg0(C752670Tfl.class));
            map.put("param_extra_auto_open_product_bag_params", dataChannel.gg0(C1094880eb8.class));
            map.put("param_extra_ec_common_extra_param", dataChannel.gg0(C749490Tad.class));
            if (dataChannel.gg0(LiveModeChannel.class) == LiveMode.LIVE_VOICE) {
                z = true;
            } else {
                z = false;
            }
            map.put("param_is_hidden_ec_widget", Boolean.valueOf(z));
            map.put("param_before_live_ec_params", dataChannel.gg0(C772110UQn.class));
            LiveMode liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
            if (liveMode != null) {
                strLIZ = C354201Zc.LIZ(liveMode);
            } else {
                strLIZ = null;
            }
            map.put("param_live_type", strLIZ);
        }
        return map;
    }

    public static void LIZ(String str, Map map, Map map2) {
        if (map2.containsKey(str)) {
            ((HashMap) map).put(str, map2.get(str));
        }
    }
}
