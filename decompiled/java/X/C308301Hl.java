package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multilive.model.FanTicketRanklistResponse;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01Hl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C308301Hl {
    public static final C308301Hl LIZ = new C308301Hl();
    public static long LIZIZ = -1;

    public static String LIZ(FanTicketRanklistResponse.ResponseData responseData) {
        if (responseData != null) {
            long j = responseData.ownIndex;
            if (j != 0) {
                return String.valueOf(Long.valueOf(j));
            }
            return "-1";
        }
        return "-1";
    }

    public static void LIZJ(User user, FanTicketRanklistResponse.ResponseData responseData, boolean z, int i) {
        Long lValueOf;
        String str;
        List<FanTicketRanklistResponse.RanklistUser> list;
        LIZIZ = System.currentTimeMillis();
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("user_type", C917520Zz4.LJIILL(UserService.getInstance().user().LJIJJLI()));
        if (user != null) {
            lValueOf = Long.valueOf(user.getId());
        } else {
            lValueOf = null;
        }
        map.put("guest_id", String.valueOf(lValueOf));
        int size = 0;
        if (user != null && user.getId() == UserService.getInstance().user().getCurrentUserId()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_own_ranking", str);
        map.put("ranking_enter_from", "guest_window");
        if (responseData != null && (list = responseData.ranklistUsers) != null) {
            size = list.size();
        }
        map.put("contributors_num", String.valueOf(size));
        map.put("user_rank", LIZ(responseData));
        map.put("is_liveshow_ongoing", String.valueOf(z ? 1 : 0));
        map.put("countdown_status", String.valueOf(i));
        C0KX4.LIZ("livesdk_guest_charm_ranking_list_show", map, null, true);
    }

    public static void LJ(FanTicketRanklistResponse.ResponseData responseData, String str, boolean z, boolean z2) {
        Object obj;
        int size;
        long j;
        List<FanTicketRanklistResponse.RanklistUser> list;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        String str2 = "1";
        if (!z2) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_proactive_disconnect", obj);
        if (responseData != null && (list = responseData.ranklistUsers) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        map.put("contributors_num", String.valueOf(size));
        if (responseData != null) {
            j = responseData.fanTicketTotal;
        } else {
            j = 0;
        }
        map.put("charm_values", String.valueOf(j));
        map.put("click_type", str);
        if (Intrinsics.LJFF(str, "disconnect")) {
            if (!z) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
        } else {
            str2 = "-1";
        }
        map.put("is_show_again", str2);
        C0KX4.LIZ("livesdk_guest_disconnect_ranking_popup_click", map, null, true);
    }

    public final void LIZIZ(User user, FanTicketRanklistResponse.ResponseData responseData, String str, String str2) {
        Long lValueOf;
        String str3;
        int size;
        Long lValueOf2;
        List<FanTicketRanklistResponse.RanklistUser> list;
        HashMap map = new HashMap();
        Long lValueOf3 = null;
        C01Z4.LIZ(null, map);
        map.put("user_type", C917520Zz4.LJIILL(UserService.getInstance().user().LJIJJLI()));
        if (user != null) {
            lValueOf = Long.valueOf(user.getId());
        } else {
            lValueOf = null;
        }
        map.put("guest_id", String.valueOf(lValueOf));
        if (user != null && user.getId() == UserService.getInstance().user().getCurrentUserId()) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_own_ranking", str3);
        map.put("ranking_enter_from", str);
        if (responseData != null && (list = responseData.ranklistUsers) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        map.put("contributors_num", String.valueOf(size));
        map.put("user_rank", LIZ(responseData));
        map.put("click_type", str2);
        C0KX4.LIZ("livesdk_guest_charm_ranking_list_click", map, null, true);
        if (Intrinsics.LJFF(str2, "gift")) {
            LinkMicAbilityManager.LJIIIZ.getClass();
            InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
            if (interfaceC941720ac6LIZIZ != null && interfaceC941720ac6LIZIZ.LJIIJ("guest_showdown")) {
                InterfaceC938530aWx interfaceC938530aWxLIZ = C01IB.LIZ();
                if (interfaceC938530aWxLIZ != null) {
                    lValueOf2 = Long.valueOf(interfaceC938530aWxLIZ.getPlayId());
                } else {
                    lValueOf2 = null;
                }
                if (user != null) {
                    lValueOf3 = Long.valueOf(user.getId());
                }
                LIZLLL(this, "party_guest_contrbution_page", "send_gift", lValueOf2, null, lValueOf3, LIZ(responseData), 0L, 72);
            }
        }
    }

    public static void LIZLLL(C308301Hl c308301Hl, String str, String str2, Long l, Long l2, Long l3, String str3, long j, int i) {
        C978370bZD c978370bZDLIZIZ;
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            l2 = null;
        }
        if ((i & 16) != 0) {
            l3 = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        if ((i & 64) != 0) {
            j = 0;
        }
        c308301Hl.getClass();
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        InterfaceC774000UXu interfaceC774000UXuG20 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).G20("livesdk_multi_anchor_guest_showdown_page");
        if (interfaceC774000UXuG20 != null && (c978370bZDLIZIZ = interfaceC774000UXuG20.LIZIZ((Map) map)) != null) {
            c978370bZDLIZIZ.LIZIZ.LJJII(str2, "action_type");
            c978370bZDLIZIZ.LIZIZ.LJJII(str, "page_name");
            String strLJIILL = C917520Zz4.LJIILL(UserService.getInstance().user().LJIJJLI());
            if (Intrinsics.LJFF(strLJIILL, "user")) {
                strLJIILL = "audience";
            }
            c978370bZDLIZIZ.LIZIZ.LJJII(strLJIILL, "user_type");
            MultiGuestDataHolder multiGuestDataHolder = C920830a4P.LIZ;
            int i2 = 0;
            if (multiGuestDataHolder != null && multiGuestDataHolder.LJJIFFI > 0) {
                i2 = 1;
            }
            c978370bZDLIZIZ.LIZIZ.LJJII(Integer.valueOf(i2), "is_guest_connection");
            c978370bZDLIZIZ.LIZIZ.LJJII(C917520Zz4.LIZJ(), "layout_id");
            if (Intrinsics.LJFF(str2, "show") && j > 0) {
                c978370bZDLIZIZ.LJ(String.valueOf(j), "first_frame_duration");
            }
            if (l2 != null) {
                c978370bZDLIZIZ.LJ(Long.valueOf(l2.longValue()), "set_duration");
            }
            if (l != null) {
                c978370bZDLIZIZ.LJ(Long.valueOf(l.longValue()), "guest_showdown_id");
            }
            if (l3 != null) {
                c978370bZDLIZIZ.LJ(Long.valueOf(l3.longValue()), "to_user_id");
            }
            if (str3 != null) {
                c978370bZDLIZIZ.LJ(str3, "to_user_rank");
            }
            c978370bZDLIZIZ.LIZ();
        }
    }
}
