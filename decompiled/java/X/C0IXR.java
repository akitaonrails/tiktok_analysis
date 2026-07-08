package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.RepostInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.SMBInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;

/* JADX INFO: renamed from: X.0IXR, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IXR implements InterfaceC467740IVw<Room> {
    public static final void LIZIZ(Map map, Room room) {
        Object obj;
        String str;
        Object obj2;
        String str2;
        int i;
        Object obj3;
        String str3;
        Object obj4;
        Object obj5;
        if (room != null) {
            int i2 = 1;
            boolean z = !TextUtils.equals((CharSequence) map.get("room_id"), room.getIdStr());
            map.put("log_context_error", String.valueOf(room.getId()));
            if (room.getId() != 0) {
                map.put("room_id", String.valueOf(room.getId()));
            }
            map.put("orientation", String.valueOf(room.getOrientation()));
            if (room.hasCommerceGoods) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_sale", obj);
            if (room.hasCommerceGoods) {
                str = "1";
            } else {
                CommerceStruct commerceStruct = room.getCommerceStruct();
                if (commerceStruct != null && commerceStruct.commercePermission == 1) {
                    str = "2";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
            }
            map.put("is_ecom", str);
            if (room.existedTtlsGoods) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_local_service_live", obj2);
            LiveEventInfo liveEventInfo = room.liveEventInfo;
            if (liveEventInfo != null) {
                map.put("live_event_id", String.valueOf(liveEventInfo.eventId));
                if (room.liveEventInfo.subscribed.booleanValue()) {
                    obj4 = "1";
                } else {
                    obj4 = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("is_registered", obj4);
                if (!room.liveEventInfo.isPaidEvent.booleanValue()) {
                    obj5 = "1";
                } else {
                    obj5 = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("is_free_event", obj5);
            }
            if (!TextUtils.isEmpty(room.getRequestId())) {
                map.put("request_id", room.getRequestId());
            }
            if (!TextUtils.isEmpty(room.getLog_pb())) {
                map.put("log_pb", room.getLog_pb());
            } else {
                map.remove("log_pb");
            }
            if (room.getOwner() != null) {
                map.put("anchor_id", String.valueOf(room.getOwner().getId()));
                if (room.getOwner().getFollowInfo() != null) {
                    map.put("follow_status", String.valueOf(room.getOwner().getFollowInfo().getFollowStatus()));
                }
            } else {
                map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            }
            if (!TextUtils.isEmpty(room.getSourceType())) {
                map.put("moment_room_source", room.getSourceType());
            }
            map.put("live_type", C354201Zc.LIZ(room.getStreamType()));
            if (!map.containsKey("room_orientation")) {
                map.put("room_orientation", String.valueOf(room.getRoomOrientation()));
            }
            Hashtag hashtag = room.hashtag;
            if (hashtag != null) {
                if (hashtag.isUseGameTagAsHashTag()) {
                    obj3 = "1";
                } else {
                    obj3 = CardStruct.IStatusCode.DEFAULT;
                }
                if (TextUtils.isEmpty(room.hashtag.title)) {
                    str3 = "none";
                } else {
                    str3 = room.hashtag.title;
                }
                map.put("hashtag_id", String.valueOf(room.hashtag.id));
                map.put("hashtag_type", str3);
                map.put("hashtag_name", str3);
                map.put("hashtag_is_game", obj3);
            }
            if (room.getOwner() != null && room.getOwner().isAnchorHasSubQualification()) {
                if (room.getOwner().isSubscribed()) {
                    map.put("is_subscription", "1");
                } else {
                    map.put("is_subscription", CardStruct.IStatusCode.DEFAULT);
                }
            } else {
                map.put("is_subscription", "-1");
            }
            if (room.smbIndustryInfo != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("");
                sbLIZ.append(room.smbIndustryInfo.type);
                map.put("smb_industry_type", C2188811AlT.LIZIZ(sbLIZ));
            }
            SMBInfo sMBInfo = room.smbInfo;
            if (sMBInfo != null) {
                map.putAll(sMBInfo.publicRoomParam);
                if (room.smbInfo.optInStatus == 1) {
                    i = 1;
                } else {
                    i = 0;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(i);
                sbLIZ2.append("");
                map.put("is_service_plus_enable", C2188811AlT.LIZIZ(sbLIZ2));
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(room.liveSubOnly);
            sbLIZ3.append("");
            map.put("is_sub_only_live", C2188811AlT.LIZIZ(sbLIZ3));
            RepostInfo repostInfo = room.repostInfo;
            if (repostInfo != null && !z) {
                if (room.reposted) {
                    if (repostInfo.repostersCnt == 1) {
                        i2 = 2;
                    } else {
                        i2 = 3;
                    }
                } else if (repostInfo.repostersCnt <= 0) {
                    i2 = 0;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(i2);
                sbLIZ4.append("");
                map.put("is_reposted", C2188811AlT.LIZIZ(sbLIZ4));
            }
            if (room.getOwner() != null && room.getOwner().isSubscribed()) {
                str2 = "subscribed_not_expired";
            } else if (room.getOwner() != null && room.getOwner().getSubscribeInfo() != null && room.getOwner().getSubscribeInfo().isInGracePeriod()) {
                str2 = "subscribed_expired_grace_period";
            } else {
                str2 = "not_subscribed";
            }
            map.put("subscribe_state", str2);
        }
    }

    @Override // X.InterfaceC467740IVw
    public final /* bridge */ /* synthetic */ void LIZ(Object obj, String str, Map map) {
        LIZIZ(map, (Room) obj);
    }
}
