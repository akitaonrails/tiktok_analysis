package X;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.anchor.AnchorBusinessUserManager;
import com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.moderator.ModeratorBusinessUserManager;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aB3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924950aB3 {
    public static final ConcurrentHashSet<String> LIZ = new ConcurrentHashSet<>();

    public static boolean LIZ(String str) {
        ConcurrentHashSet<String> concurrentHashSet = LIZ;
        if (concurrentHashSet.contains(str)) {
            return true;
        }
        concurrentHashSet.add(str);
        return false;
    }

    public static void LIZLLL(C924960aB4 c924960aB4) {
        Long lLJIILIIL;
        Object obj;
        Object obj2;
        String str;
        String str2;
        HashMap map = new HashMap();
        C404301hh.LIZIZ(map);
        C924620aAW.LJIIJJI(map);
        String str3 = c924960aB4.LIZ;
        String str4 = c924960aB4.LJFF;
        if (str4 != null) {
            lLJIILIIL = C2095008Iq.LJIILIIL(str4);
        } else {
            lLJIILIIL = null;
        }
        map.put("guest_invite_type", LIZIZ(lLJIILIIL, str3));
        map.put("link_reason", c924960aB4.LIZ);
        map.put("list_ucnt", String.valueOf(c924960aB4.LIZJ));
        map.put("rank", String.valueOf(c924960aB4.LIZLLL));
        map.put("action_type", c924960aB4.LIZIZ);
        String str5 = c924960aB4.LJIILJJIL;
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        map.put("multi_request_id", str5);
        map.put("auto_accept_request_initiate_type", String.valueOf(C925650aCB.LIZ()));
        Integer num = c924960aB4.LJIJ;
        if (num != null) {
            map.put("list_ucnt_visible", String.valueOf(num.intValue()));
        }
        String str7 = c924960aB4.LJIJI;
        if (str7 != null) {
            map.put("link_sub_reason", str7);
        }
        String str8 = c924960aB4.LJFF;
        if (str8 != null) {
            map.put("guest_id", str8);
            if (!TextUtils.isEmpty(c924960aB4.LJIIZILJ)) {
                String str9 = c924960aB4.LJIIZILJ;
                if (str9 != null) {
                    str6 = str9;
                }
                map.put("remote_link_id", str6);
            } else {
                InterfaceC921620a5g interfaceC921620a5gLIZJ = C921180a4y.LIZJ();
                long jLongValue = 0;
                if (interfaceC921620a5gLIZJ instanceof AnchorBusinessUserManager) {
                    AbstractC928510aGn<LinkPlayerInfo, MultiLiveGuestInfoList> abstractC928510aGnLJJJLZIJ = ((AnchorBusinessUserManager) interfaceC921620a5gLIZJ).LJJJLZIJ();
                    Long lLJIILIIL2 = C2095008Iq.LJIILIIL(str8);
                    if (lLJIILIIL2 != null) {
                        jLongValue = lLJIILIIL2.longValue();
                    }
                    LinkPlayerInfo linkPlayerInfoLJII = abstractC928510aGnLJJJLZIJ.LJII(jLongValue);
                    if (linkPlayerInfoLJII != null && (str2 = linkPlayerInfoLJII.mInteractIdStr) != null) {
                        map.put("remote_link_id", str2);
                    }
                } else if (interfaceC921620a5gLIZJ instanceof ModeratorBusinessUserManager) {
                    AbstractC928510aGn<LinkPlayerInfo, MultiLiveGuestInfoList> abstractC928510aGnLJJJLZIJ2 = ((ModeratorBusinessUserManager) interfaceC921620a5gLIZJ).LJJJLZIJ();
                    Long lLJIILIIL3 = C2095008Iq.LJIILIIL(str8);
                    if (lLJIILIIL3 != null) {
                        jLongValue = lLJIILIIL3.longValue();
                    }
                    LinkPlayerInfo linkPlayerInfoLJII2 = abstractC928510aGnLJJJLZIJ2.LJII(jLongValue);
                    if (linkPlayerInfoLJII2 != null && (str = linkPlayerInfoLJII2.mInteractIdStr) != null) {
                        map.put("remote_link_id", str);
                    }
                }
            }
        }
        Integer num2 = c924960aB4.LJIILL;
        if (num2 != null) {
            map.put("guest_outroom_type", String.valueOf(num2.intValue()));
        }
        Integer num3 = c924960aB4.LJI;
        if (num3 != null) {
            map.put("request_list_display_setting", C921220a52.LIZ(num3.intValue()));
        }
        Integer num4 = c924960aB4.LJII;
        if (num4 != null) {
            map.put("gift_rank", String.valueOf(num4.intValue()));
        }
        Long l = c924960aB4.LJIIIIZZ;
        if (l != null) {
            map.put("gift_num", String.valueOf(l.longValue()));
        }
        Integer num5 = c924960aB4.LJIIIZ;
        String str10 = CardStruct.IStatusCode.DEFAULT;
        if (num5 == null || num5.intValue() != 0) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_prioritized_request", obj);
        Long l2 = c924960aB4.LJIIJ;
        if (l2 != null) {
            map.put("invited_by_guest_id", String.valueOf(l2.longValue()));
        }
        if (C176600m4.LIZIZ(c924960aB4.LJIIJJI)) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_karaoke_request", obj2);
        Long l3 = c924960aB4.LJIIL;
        if (l3 != null) {
            map.put("anchor_relationship", String.valueOf(l3.longValue()));
        }
        String str11 = c924960aB4.LJ;
        if (str11 != null) {
            map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str11);
        }
        String str12 = c924960aB4.LJIILIIL;
        if (str12 != null) {
            map.put("guest_permission", str12);
        }
        String str13 = c924960aB4.LJIILLIIL;
        if (str13 != null) {
            map.put("fail_reason", str13);
        }
        Map<String, String> map2 = c924960aB4.LJIJJ;
        if (map2 != null) {
            map.putAll(map2);
        }
        if (C176600m4.LIZIZ(c924960aB4.LJIJJLI)) {
            str10 = "1";
        }
        map.put("is_by_invite_all", str10);
        if (Intrinsics.LJFF(c924960aB4.LIZ, "guest_in_link")) {
            map.put("list_ucnt_visible", String.valueOf(c924960aB4.LIZJ));
        }
        map.putAll(C917810ZzX.LIZLLL());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_connection_panel_user_action");
        c474500IjALIZ.LJJIIZI(map);
        Pair[] pairArr = {new Pair("anchorMgrV", "itemAction")};
        C945340ahw c945340ahw = new C945340ahw(c474500IjALIZ);
        c945340ahw.LIZ((Pair[]) Arrays.copyOf(pairArr, 1));
        c945340ahw.LIZIZ();
    }

    public static String LIZIZ(Long l, String str) {
        String strLIZIZ;
        if (l != null) {
            l.longValue();
            InterfaceC921620a5g interfaceC921620a5gLIZJ = C921180a4y.LIZJ();
            if (interfaceC921620a5gLIZJ != null && (strLIZIZ = interfaceC921620a5gLIZJ.LIZIZ(l.longValue())) != null) {
                return strLIZIZ;
            }
        }
        if (Intrinsics.LJFF(str, "room_viewer_apply") || Intrinsics.LJFF(str, "request_room_viewer_list")) {
            return "guest_apply_anchor";
        }
        return "anchor_invite_guest";
    }

    public static void LIZJ(String str, int i, Integer num, Integer num2, int i2) {
        if ((i2 & 4) != 0) {
            num = null;
        }
        if ((i2 & 32) != 0) {
            num2 = null;
        }
        HashMap map = new HashMap();
        C404301hh.LIZIZ(map);
        C924620aAW.LJIIJJI(map);
        map.put("guest_invite_type", LIZIZ(null, str));
        map.put("link_reason", str);
        map.put("list_ucnt", String.valueOf(i));
        if (num2 != null) {
            map.put("list_ucnt_visible", String.valueOf(num2.intValue()));
        }
        map.put("auto_accept_request_initiate_type", String.valueOf(C925650aCB.LIZ()));
        if (num != null) {
            map.put("request_list_display_setting", C921220a52.LIZ(num.intValue()));
        }
        if (Intrinsics.LJFF(str, "guest_in_link")) {
            map.put("list_ucnt_visible", String.valueOf(i));
        }
        map.putAll(C917810ZzX.LIZLLL());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_connection_panel_module_show");
        c474500IjALIZ.LJJIIZI(map);
        Pair[] pairArr = {new Pair("anchorMgrV", "listShow")};
        C945340ahw c945340ahw = new C945340ahw(c474500IjALIZ);
        c945340ahw.LIZ((Pair[]) Arrays.copyOf(pairArr, 1));
        c945340ahw.LIZIZ();
    }
}
