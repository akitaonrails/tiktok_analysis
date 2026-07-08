package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestRecommendRoomInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOptGuestDistributeStateSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0adU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C942580adU {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        String str2;
        if (str != null) {
            if (Intrinsics.LJFF(str, "friend")) {
                str2 = "friend_is_guest";
            } else {
                str2 = str;
            }
            if (Intrinsics.LJFF(str, "follow")) {
                str2 = "following_is_guest";
            }
            if (Intrinsics.LJFF(str, "link")) {
                str2 = "once_as_guest";
            }
            if (Intrinsics.LJFF(str, "hot")) {
                return "popular_live";
            }
            return str2;
        }
        return "";
    }

    public static String LIZIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return "invite_friends";
            }
            if (num.intValue() == 2) {
                return "share_thoughts";
            }
            if (num.intValue() == 3) {
                return "connect_more_people";
            }
            if (num.intValue() == 4) {
                return "get_new_followers";
            }
            if (num.intValue() == 5) {
                return "try_monitize";
            }
            return "";
        }
        return "";
    }

    public static void LJIIJ(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C01Z4.LIZ(null, linkedHashMap);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toast_msg_show");
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LJJII(str, "msg_content");
        c474500IjALIZ.LJJII("ttlive_multiLiveRecom_viewerScreen_recomHalfSheet_errorToast", "msg_id");
        c474500IjALIZ.LJJII("recommend_link_room_ente_fail", "extra");
        c474500IjALIZ.LJJII("user", "user_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIIIZZ(long j, String str) {
        MultiGuestRecommendRoomInfo multiGuestRecommendRoomInfo;
        Integer num;
        String str2;
        Long lValueOf;
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Long lValueOf2 = null;
        C01Z4.LIZ(null, linkedHashMap);
        C942600adW c942600adW = C927170aEd.LJIIIIZZ;
        if (c942600adW != null && (multiGuestRecommendRoomInfo = c942600adW.LIZ) != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_guest_recommend_link_room_request_pop");
            c474500IjALIZ.LJJIIZI(linkedHashMap);
            c474500IjALIZ.LJJII(str, "action_type");
            C942600adW c942600adW2 = C927170aEd.LJIIIIZZ;
            if (c942600adW2 != null) {
                num = c942600adW2.LIZJ;
            } else {
                num = null;
            }
            c474500IjALIZ.LJJII(num, "requesting_user_cnt");
            String str3 = C925600aC6.LIZ;
            if (str3 == null) {
                str3 = "";
            }
            c474500IjALIZ.LJJII(str3, "request_page");
            C942600adW c942600adW3 = C927170aEd.LJIIIIZZ;
            if (c942600adW3 != null) {
                str2 = c942600adW3.LIZIZ;
            } else {
                str2 = null;
            }
            c474500IjALIZ.LJJII(str2, "guest_request_id");
            c474500IjALIZ.LJJII(Long.valueOf(multiGuestRecommendRoomInfo.recoRank + 1), "recommend_rank");
            User user = multiGuestRecommendRoomInfo.hostInfo;
            if (user != null) {
                lValueOf = Long.valueOf(user.getId());
            } else {
                lValueOf = null;
            }
            c474500IjALIZ.LJJII(lValueOf, "recommend_anchor_id");
            c474500IjALIZ.LJJII(Long.valueOf(multiGuestRecommendRoomInfo.roomId), "recommend_room_id");
            c474500IjALIZ.LJJII(LIZ(multiGuestRecommendRoomInfo.recoReason), "recommend_reason");
            if (multiGuestRecommendRoomInfo.hostRecoTags.size() > 0) {
                obj = ListProtector.get(multiGuestRecommendRoomInfo.hostRecoTags, 0);
            } else {
                obj = null;
            }
            c474500IjALIZ.LJJII(obj, "recommend_relation");
            c474500IjALIZ.LJJII(Long.valueOf(multiGuestRecommendRoomInfo.viewerNum), "recommend_viewer_cnt");
            c474500IjALIZ.LJJII(Long.valueOf(multiGuestRecommendRoomInfo.guestNum), "recommend_guest_cnt");
            if (!Intrinsics.LJFF(str, "show")) {
                lValueOf2 = Long.valueOf(System.currentTimeMillis() - j);
            }
            c474500IjALIZ.LJJII(lValueOf2, "duration");
            c474500IjALIZ.LIZ();
        }
    }

    public static void LJIIIZ(long j, String str) {
        MultiGuestRecommendRoomInfo multiGuestRecommendRoomInfo;
        Integer num;
        String str2;
        Long lValueOf;
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Long lValueOf2 = null;
        C01Z4.LIZ(null, linkedHashMap);
        C942600adW c942600adW = C927170aEd.LJIIIIZZ;
        if (c942600adW != null && (multiGuestRecommendRoomInfo = c942600adW.LIZ) != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_guest_recommend_link_room_watch_pop");
            c474500IjALIZ.LJJIIZI(linkedHashMap);
            c474500IjALIZ.LJJII(str, "action_type");
            C942600adW c942600adW2 = C927170aEd.LJIIIIZZ;
            if (c942600adW2 != null) {
                num = c942600adW2.LIZJ;
            } else {
                num = null;
            }
            c474500IjALIZ.LJJII(num, "requesting_user_cnt");
            String str3 = C925600aC6.LIZ;
            if (str3 == null) {
                str3 = "";
            }
            c474500IjALIZ.LJJII(str3, "request_page");
            C942600adW c942600adW3 = C927170aEd.LJIIIIZZ;
            if (c942600adW3 != null) {
                str2 = c942600adW3.LIZIZ;
            } else {
                str2 = null;
            }
            c474500IjALIZ.LJJII(str2, "guest_request_id");
            c474500IjALIZ.LJJII(Long.valueOf(multiGuestRecommendRoomInfo.recoRank + 1), "recommend_rank");
            User user = multiGuestRecommendRoomInfo.hostInfo;
            if (user != null) {
                lValueOf = Long.valueOf(user.getId());
            } else {
                lValueOf = null;
            }
            c474500IjALIZ.LJJII(lValueOf, "recommend_anchor_id");
            c474500IjALIZ.LJJII(Long.valueOf(multiGuestRecommendRoomInfo.roomId), "recommend_room_id");
            c474500IjALIZ.LJJII(LIZ(multiGuestRecommendRoomInfo.recoReason), "recommend_reason");
            if (multiGuestRecommendRoomInfo.hostRecoTags.size() > 0) {
                obj = ListProtector.get(multiGuestRecommendRoomInfo.hostRecoTags, 0);
            } else {
                obj = null;
            }
            c474500IjALIZ.LJJII(obj, "recommend_relation");
            c474500IjALIZ.LJJII(Long.valueOf(multiGuestRecommendRoomInfo.viewerNum), "recommend_viewer_cnt");
            c474500IjALIZ.LJJII(Long.valueOf(multiGuestRecommendRoomInfo.guestNum), "recommend_guest_cnt");
            if (!Intrinsics.LJFF(str, "show")) {
                lValueOf2 = Long.valueOf(System.currentTimeMillis() - j);
            }
            c474500IjALIZ.LJJII(lValueOf2, "duration");
            c474500IjALIZ.LIZ();
        }
    }

    public static void LIZLLL(MultiGuestRecommendRoomInfo multiGuestRecommendRoomInfo, String str, String str2) {
        Long lValueOf = null;
        C01Z4.LIZ(null, new LinkedHashMap());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_show");
        c474500IjALIZ.LJJII(str2, "guest_request_id");
        c474500IjALIZ.LJJII(Long.valueOf(multiGuestRecommendRoomInfo.roomId), "room_id");
        User user = multiGuestRecommendRoomInfo.hostInfo;
        if (user != null) {
            lValueOf = Long.valueOf(user.getId());
        }
        c474500IjALIZ.LJJII(lValueOf, "anchor_id");
        c474500IjALIZ.LJJII("click", "action_type");
        c474500IjALIZ.LJJII("live_detail", "enter_from_merge");
        c474500IjALIZ.LJJII(str, "enter_method");
        if (MultiGuestOptGuestDistributeStateSetting.INSTANCE.isEnable()) {
            c474500IjALIZ.LJJII(Integer.valueOf(C0IXN.LIZ()), "is_from_guest_distribute");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(String str, long j, int i, Integer num) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C01Z4.LIZ(null, linkedHashMap);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_guest_recommend_go_live_pop");
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "requesting_user_cnt");
        c474500IjALIZ.LJJII(LIZIZ(num), "go_live_type");
        if (!Intrinsics.LJFF(str, "show")) {
            c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - j), "duration");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJI(String str, MultiGuestRecommendRoomInfo multiGuestRecommendRoomInfo, int i, String str2, boolean z, Integer num) {
        String str3;
        Long lValueOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = null;
        C01Z4.LIZ(null, linkedHashMap);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_guest_recommend_link_room_module_show");
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LJJII(str, "panel_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "requesting_user_cnt");
        if (Intrinsics.LJFF(str, "in_request_panel")) {
            str3 = C925600aC6.LIZ;
            if (str3 == null) {
                str3 = "";
            }
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "request_page");
        c474500IjALIZ.LJJII(str2, "guest_request_id");
        c474500IjALIZ.LJJII(Long.valueOf(multiGuestRecommendRoomInfo.recoRank + 1), "recommend_rank");
        User user = multiGuestRecommendRoomInfo.hostInfo;
        if (user != null) {
            lValueOf = Long.valueOf(user.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "recommend_anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(multiGuestRecommendRoomInfo.roomId), "recommend_room_id");
        c474500IjALIZ.LJJII(LIZ(multiGuestRecommendRoomInfo.recoReason), "recommend_reason");
        if (multiGuestRecommendRoomInfo.hostRecoTags.size() > 0) {
            obj = ListProtector.get(multiGuestRecommendRoomInfo.hostRecoTags, 0);
        }
        c474500IjALIZ.LJJII(obj, "recommend_relation");
        c474500IjALIZ.LJJII(Long.valueOf(multiGuestRecommendRoomInfo.viewerNum), "recommend_viewer_cnt");
        c474500IjALIZ.LJJII(Long.valueOf(multiGuestRecommendRoomInfo.guestNum), "recommend_guest_cnt");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_go_live");
        c474500IjALIZ.LJJII(LIZIZ(num), "go_live_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJ(String str, String str2, MultiGuestRecommendRoomInfo multiGuestRecommendRoomInfo, int i, long j, String str3, boolean z, Integer num) {
        Long lValueOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = null;
        C01Z4.LIZ(null, linkedHashMap);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_guest_recommend_link_room_module_click");
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LJJII(str, "panel_type");
        c474500IjALIZ.LJJII(str2, "click_button_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "requesting_user_cnt");
        String str4 = C925600aC6.LIZ;
        if (str4 == null) {
            str4 = "";
        }
        c474500IjALIZ.LJJII(str4, "request_page");
        c474500IjALIZ.LJJII(str3, "guest_request_id");
        c474500IjALIZ.LJJII(Long.valueOf(multiGuestRecommendRoomInfo.recoRank + 1), "recommend_rank");
        User user = multiGuestRecommendRoomInfo.hostInfo;
        if (user != null) {
            lValueOf = Long.valueOf(user.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "recommend_anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(multiGuestRecommendRoomInfo.roomId), "recommend_room_id");
        c474500IjALIZ.LJJII(LIZ(multiGuestRecommendRoomInfo.recoReason), "recommend_reason");
        if (multiGuestRecommendRoomInfo.hostRecoTags.size() > 0) {
            obj = ListProtector.get(multiGuestRecommendRoomInfo.hostRecoTags, 0);
        }
        c474500IjALIZ.LJJII(obj, "recommend_relation");
        c474500IjALIZ.LJJII(Long.valueOf(multiGuestRecommendRoomInfo.viewerNum), "recommend_viewer_cnt");
        c474500IjALIZ.LJJII(Long.valueOf(multiGuestRecommendRoomInfo.guestNum), "recommend_guest_cnt");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - j), "duration");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_go_live");
        c474500IjALIZ.LJJII(LIZIZ(num), "go_live_type");
        c474500IjALIZ.LIZ();
    }
}
