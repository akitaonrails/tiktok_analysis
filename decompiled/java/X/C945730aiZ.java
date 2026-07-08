package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceEffectScoreChannel;
import com.tiktok.kmp.live.socialgamebusinessapi.service.ILiveDanceService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aiZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C945730aiZ {
    public static final C945730aiZ LIZ = new C945730aiZ();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public static String LIZ() {
        Object arrayList;
        Map<String, C947590alZ> map;
        List<LinkUser> listLIZLLL;
        LinkUser next;
        Long l;
        String str;
        OnLineMicInfo onLineMicInfoLJL;
        MicPositionInfo micPositionInfo;
        int i;
        Map mapLJIIIIZZ;
        C949060anw c949060anwYo1 = ((ILiveDanceService) C1161920gLG.LIZJ(ILiveDanceService.class)).Yo1();
        C947420alI c947420alILJII = c949060anwYo1 != null ? c949060anwYo1.LJII() : null;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        Long lValueOf = room != null ? Long.valueOf(room.getOwnerUserId()) : null;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (c947420alILJII == null || (map = c947420alILJII.LJIIIIZZ) == null) {
            arrayList = C13BV.INSTANCE;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, C947590alZ> entry : map.entrySet()) {
                if (entry.getValue().LIZJ == EnumC942260acy.READY) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            arrayList = new ArrayList();
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                Object key = ((Map.Entry) it2.next()).getKey();
                if (interfaceC954180awCLLJLL != null && (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) != null) {
                    Iterator<LinkUser> it3 = listLIZLLL.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                        if (Intrinsics.LJFF(next.linkMicId, key)) {
                            break;
                        }
                    }
                    LinkUser linkUser = next;
                    if (linkUser != null && (l = linkUser.userId) != null) {
                        long jLongValue = l.longValue();
                        if (lValueOf == null || jLongValue != lValueOf.longValue()) {
                            if (interfaceC954180awCLLJLL != null && (str = linkUser.linkMicId) != null && (onLineMicInfoLJL = interfaceC954180awCLLJLL.LJL(str)) != null && (micPositionInfo = onLineMicInfoLJL.micPositionData) != null && (i = micPositionInfo.position) >= 0 && (mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("guest_id", Long.valueOf(jLongValue)), new Pair("guest_link_index", Integer.valueOf(i)))) != null) {
                                arrayList.add(mapLJIIIIZZ);
                            }
                        }
                    }
                }
            }
        }
        String strLIZIZ = C105700ad.LIZIZ(arrayList);
        return strLIZIZ == null ? "" : strLIZIZ;
    }

    public static void LIZJ(DataChannel dataChannel) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("guest_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        linkedHashMap.put("link_id", C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()));
        LJII(dataChannel, "livesdk_multi_guest_dance_apply", linkedHashMap);
    }

    public static void LIZIZ(DataChannel dataChannel, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", str);
        linkedHashMap.put("link_id", C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()));
        LJII(dataChannel, "livesdk_multi_dance_camera_panel_show", linkedHashMap);
    }

    public static void LJFF(DataChannel dataChannel, Long l) {
        if (l != null) {
            l.longValue();
            String strJ4 = C786410Ut5.j4("%.1f", Arrays.copyOf(new Object[]{Float.valueOf((System.currentTimeMillis() - l.longValue()) / 1000.0f)}, 1));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("duration", strJ4);
            linkedHashMap.put("start_ts", l.toString());
            linkedHashMap.put("end_ts", l.toString());
            LJII(dataChannel, "livesdk_multi_audience_watch_dance_duration", linkedHashMap);
        }
    }

    public static void LJI(DataChannel dataChannel, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("icon_type", str);
        LJII(dataChannel, "livesdk_multi_dance_live_icon_click", linkedHashMap);
    }

    public static void LJII(DataChannel dataChannel, String str, Map map) {
        C947420alI c947420alILJII;
        int i;
        String str2;
        String str3;
        boolean z;
        Long l;
        String string;
        C978370bZD c978370bZDLIZIZ;
        String string2;
        C947420alI c947420alILJII2;
        Map<String, C947590alZ> map2;
        C949060anw c949060anwYo1 = ((ILiveDanceService) C1161920gLG.LIZJ(ILiveDanceService.class)).Yo1();
        Integer numValueOf = null;
        if (c949060anwYo1 != null) {
            c947420alILJII = c949060anwYo1.LJII();
        } else {
            c947420alILJII = null;
        }
        if (c947420alILJII != null && (map2 = c947420alILJII.LJIIIIZZ) != null) {
            if (map2.isEmpty()) {
                i = 0;
            } else {
                Iterator<Map.Entry<String, C947590alZ>> it2 = map2.entrySet().iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (it2.next().getValue().LIZJ == EnumC942260acy.READY) {
                        i++;
                    }
                }
            }
        } else {
            i = 1;
        }
        map.put("guest_join_cnt", String.valueOf(i - 1));
        map.put("user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        if (C930540aK4.LIZJ()) {
            str2 = "anchor";
        } else if (C924790aAn.LIZLLL().LJFF()) {
            str2 = "guest";
        } else {
            str2 = "audience";
        }
        map.put("user_type", str2);
        MultiGuestDataHolder multiGuestDataHolder = C920830a4P.LIZ;
        if (multiGuestDataHolder != null && multiGuestDataHolder.LJJIFFI == 0) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str3 = "1";
        }
        map.put("is_guest_connection", str3);
        MultiGuestDataHolder multiGuestDataHolder2 = C920830a4P.LIZ;
        if (multiGuestDataHolder2 != null) {
            numValueOf = Integer.valueOf(multiGuestDataHolder2.LJJIFFI);
        }
        map.put("guest_cnt", String.valueOf(numValueOf));
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        CharSequence charSequence = (CharSequence) linkedHashMap.get("dance_id");
        if (charSequence != null && charSequence.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String str4 = "";
        if (z) {
            if (c949060anwYo1 == null || (c947420alILJII2 = c949060anwYo1.LJII()) == null || (string2 = Long.valueOf(c947420alILJII2.LIZIZ).toString()) == null) {
                string2 = "";
            }
            map.put("dance_id", string2);
        }
        CharSequence charSequence2 = (CharSequence) linkedHashMap.get("song_id");
        if (charSequence2 == null || charSequence2.length() == 0) {
            if (c947420alILJII != null && (l = c947420alILJII.LJI) != null && (string = l.toString()) != null) {
                str4 = string;
            }
            map.put("song_id", str4);
        }
        map.put("layout_id", String.valueOf(C925150aBN.LIZLLL()));
        map.put("panel_layout_type", String.valueOf(C940770aaZ.LIZ().getDataSource().getPanelLayoutType()));
        InterfaceC774000UXu interfaceC774000UXuG20 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).G20(str);
        if (interfaceC774000UXuG20 != null && (c978370bZDLIZIZ = interfaceC774000UXuG20.LIZIZ(map)) != null) {
            c978370bZDLIZIZ.LIZLLL(dataChannel);
            c978370bZDLIZIZ.LIZ();
        }
    }

    public static void LIZLLL(DataChannel dataChannel, String str, String str2, Long l, Long l2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("end_type", str);
        if (str2 != null && Intrinsics.LJFF(str, "play_end")) {
            linkedHashMap.put("total_duration", str2);
        }
        if (l != null) {
            linkedHashMap.put("dance_id", l.toString());
        }
        if (l2 != null) {
            linkedHashMap.put("song_id", l2.toString());
        }
        linkedHashMap.put("guest_join_info", LIZ());
        LJII(dataChannel, "livesdk_multi_anchor_dance_end", linkedHashMap);
    }

    public static void LJ(DataChannel dataChannel, String str, String str2, Long l, Long l2) {
        String string;
        Integer num;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strLJIIJ = C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ());
        linkedHashMap.put("end_type", str);
        if (str2 != null && Intrinsics.LJFF(str, "play_end")) {
            linkedHashMap.put("total_duration", str2);
        }
        if (l != null) {
            linkedHashMap.put("dance_id", l.toString());
        }
        if (l2 != null) {
            linkedHashMap.put("song_id", l2.toString());
        }
        linkedHashMap.put("guest_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        linkedHashMap.put("link_id", strLJIIJ);
        if (dataChannel == null || (num = (Integer) dataChannel.gg0(MultiLetsDanceEffectScoreChannel.class)) == null || (string = num.toString()) == null) {
            string = "";
        }
        linkedHashMap.put("guest_points", string);
        LJII(dataChannel, "livesdk_multi_guest_dance_end", linkedHashMap);
    }
}
