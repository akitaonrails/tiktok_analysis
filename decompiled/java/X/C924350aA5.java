package X;

import com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorSlowFunctionOptABSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import qo2.w;

/* JADX INFO: renamed from: X.0aA5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924350aA5 {
    public static String LIZ = "";

    public static void LIZ(Map map) {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            HashMap map2 = (HashMap) map;
            map2.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            map2.put("room_id", room.getIdStr());
            w.LIZ.getClass();
            map2.put("enter_method", w.LJIIL());
            map2.put("enter_from_merge", w.LJIIIZ());
            map2.put("action_type", w.LIZLLL());
            map2.put("live_type", room.getStreamType().logStreamingType);
        }
        C924620aAW.LJIIJJI(map);
        C917650ZzH.LIZIZ(map);
    }

    public static void LIZLLL(int i) {
        HashMap map = new HashMap();
        LIZ(map);
        EnumC918970a1P enumC918970a1PLJI = C917140ZyS.LJI();
        map.put("guest_cnt", String.valueOf(C924810aAp.LJ().LJJII));
        map.put("layout_setting", C917520Zz4.LJII(enumC918970a1PLJI).getFirst());
        map.put("window_setting", C917520Zz4.LJII(enumC918970a1PLJI).getSecond());
        map.put("prioritized_request_ucnt", String.valueOf(i));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_guest_prioritized_list_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static final void LIZJ(int i, EnumC918970a1P enumC918970a1P, String str, Integer num, Integer num2) {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        HashMap map = new HashMap();
        LIZ(map);
        map.put("enter_from", LIZ);
        map.put("guest_cnt", String.valueOf(C924810aAp.LJ().LJJII));
        map.put("request_list_ucnt", String.valueOf(i));
        if (room != null && C781520UlC.LJFF(room)) {
            map.put("layout_id", C917520Zz4.LIZJ());
        } else {
            map.put("layout_setting", C917520Zz4.LJII(enumC918970a1P).getFirst());
            map.put("window_setting", C917520Zz4.LJII(enumC918970a1P).getSecond());
        }
        map.put("tab_page", "");
        map.put("show_time", str);
        if (num != null) {
            map.put("request_display_setting", C921220a52.LIZ(num.intValue()));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_guest_connection_invite_list_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
        C924950aB3.LIZJ("room_viewer_apply", i, num, num2, 24);
    }

    public static void LJ(long j, EnumC918970a1P enumC918970a1P, int i, List list, List list2, String str, long j2, int i2, LinkPlayerInfo linkPlayerInfo, Long l, Integer num, Integer num2, boolean z, boolean z2, Integer num3, Integer num4, String str2, Map map) {
        Integer numValueOf;
        String str3;
        Long lValueOf;
        LinkUser linkUserLLD;
        Object obj;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        HashMap map2 = new HashMap();
        LIZ(map2);
        map2.put("enter_from", LIZ);
        map2.put("guest_id", String.valueOf(j));
        if (room != null && C781520UlC.LJFF(room)) {
            map2.put("layout_id", C917520Zz4.LIZJ());
        } else {
            map2.put("layout_setting", C917520Zz4.LJII(enumC918970a1P).getFirst());
            map2.put("window_setting", C917520Zz4.LJII(enumC918970a1P).getSecond());
        }
        map2.put("rank", String.valueOf(i));
        String strLIZ = null;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        map2.put("tag_show_cnt", String.valueOf(numValueOf));
        Gson gson = C19748512Ol.LIZJ;
        map2.put("tag_list", GsonProtectorUtils.toJson(gson, list2));
        map2.put("show_tag_list", GsonProtectorUtils.toJson(gson, list));
        map2.put("multi_request_id", C920500a3s.LIZ);
        map2.put("show_time", str);
        map2.put("anchor_relationship", String.valueOf(j2));
        map2.putAll(C930160aJS.LIZIZ(linkPlayerInfo));
        map2.put("request_list_ucnt", String.valueOf(i2));
        C474170Iid.LIZ(map2);
        if (l != null) {
            l.longValue();
            map2.put("gift_num", l.toString());
        }
        if (num != null) {
            num.intValue();
            map2.put("gift_rank", num.toString());
        }
        String str4 = "1";
        if (C922770a7X.LIZ() && num2 != null) {
            if (num2.intValue() != 0) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            map2.put("is_prioritized_request", obj);
        }
        if (!z) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("is_karaoke_request", str4);
        map2.put("is_guest_permission_show", String.valueOf(z2));
        InterfaceC954180awC interfaceC954180awCLLJLL = ((IMultiGuestV3InternalServiceV2) C1161920gLG.LIZJ(IMultiGuestV3InternalServiceV2.class)).LLJLL();
        if (interfaceC954180awCLLJLL == null || (linkUserLLD = interfaceC954180awCLLJLL.LLD(j)) == null || (str3 = linkUserLLD.linkMicId) == null) {
            str3 = "";
        }
        map2.put("remote_link_id", str3);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_guest_connection_invite_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map2);
        c474500IjALIZ.LIZ();
        ConcurrentHashSet<String> concurrentHashSet = C924950aB3.LIZ;
        String strValueOf = String.valueOf(j);
        if (linkPlayerInfo != null) {
            lValueOf = Long.valueOf(linkPlayerInfo.inviterUserId);
        } else {
            lValueOf = null;
        }
        String str5 = C920500a3s.LIZ;
        if (linkPlayerInfo != null) {
            strLIZ = C923240a8I.LIZ(Long.valueOf(linkPlayerInfo.linkTypePermission));
        }
        C924950aB3.LIZLLL(new C924960aB4("room_viewer_apply", "show", i2, i, "normal", strValueOf, num3, num, l, num2, lValueOf, Boolean.valueOf(z), Long.valueOf(j2), strLIZ, str5, null, null, null, num4, str2, map, null, 9306112));
    }

    public static void LIZIZ(long j, EnumC918970a1P enumC918970a1P, int i, List list, List list2, String str, long j2, int i2, LinkPlayerInfo linkPlayerInfo, Long l, Integer num, Integer num2, boolean z, boolean z2, Integer num3, String str2, String str3, Integer num4, String str4, int i3) {
        Integer num5 = num3;
        List list3 = list2;
        Integer num6 = num4;
        boolean z3 = z2;
        boolean z4 = z;
        String str5 = str2;
        Integer num7 = num;
        Long l2 = l;
        Integer num8 = num2;
        String str6 = str3;
        List list4 = list;
        if ((i3 & 8) != 0) {
            list4 = C13BV.INSTANCE;
        }
        if ((i3 & 16) != 0) {
            list3 = C13BV.INSTANCE;
        }
        String str7 = null;
        if ((i3 & 512) != 0) {
            l2 = null;
        }
        if ((i3 & 1024) != 0) {
            num7 = null;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num8 = null;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z4 = false;
        }
        if ((i3 & 8192) != 0) {
            z3 = false;
        }
        if ((i3 & 16384) != 0) {
            num5 = null;
        }
        if ((32768 & i3) != 0) {
            str5 = null;
        }
        if ((65536 & i3) != 0) {
            str6 = null;
        }
        if ((131072 & i3) != 0) {
            num6 = null;
        }
        if ((i3 & 262144) == 0) {
            str7 = str4;
        }
        if (AnchorSlowFunctionOptABSetting.INSTANCE.enable() && C500260Jjc.LJIJ(DataChannelGlobal.LLILZ)) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C323401Ng(j, enumC918970a1P, i, list4, list3, str, j2, i2, linkPlayerInfo, l2, num7, num8, z4, z3, num5, str5, str6, num6, str7, null, null), 3);
        } else {
            LJ(j, enumC918970a1P, i, list4, list3, str, j2, i2, linkPlayerInfo, l2, num7, num8, z4, z3, num5, num6, str7, null);
        }
    }
}
