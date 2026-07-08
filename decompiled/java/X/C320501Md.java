package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01Md, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C320501Md {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ() {
        HashMap map = new HashMap();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        map.put("anchor_id", String.valueOf(room != null ? Long.valueOf(room.getOwnerUserId()) : null));
        map.put("room_id", String.valueOf(room != null ? Long.valueOf(room.getId()) : null));
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        map.put("layout_setting", C917520Zz4.LJII(C927600aFK.LJII()).getFirst());
        C307001Gy.LIZ().getClass();
        map.put("window_setting", C917520Zz4.LJII(C927600aFK.LJII()).getSecond());
        MultiGuestDataHolder multiGuestDataHolder = C920830a4P.LIZ;
        map.put("guest_cnt", String.valueOf(multiGuestDataHolder != null ? multiGuestDataHolder.LJJIFFI : 0));
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        map.put("channel_id", String.valueOf(interfaceC954180awCLLJLL != null ? interfaceC954180awCLLJLL.U3() : null));
        return map;
    }

    public static void LIZJ(String str, String str2) {
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", str);
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJIIIIZZ()) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_multi_guest_moderator", str3);
        linkedHashMap.put("toast_type", "end_countdown");
        linkedHashMap.put("btn_name", str2);
        LJ("livesdk_anchor_guest_countdown_confirm", linkedHashMap);
    }

    public static void LJ(String str, Map map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(String str, String str2, String str3, String str4) {
        Object obj;
        C01EB c01ebLJIIIZ;
        Map mapLIZ = LIZ();
        HashMap map = (HashMap) mapLIZ;
        map.put("action_type", str);
        C930480aJy.LIZ.getClass();
        String str5 = "1";
        if (C930480aJy.LJIIIIZZ()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_multi_guest_moderator", obj);
        InterfaceC421301kR interfaceC421301kRLIZIZ = C01EG.LIZIZ();
        if (interfaceC421301kRLIZIZ != null) {
            c01ebLJIIIZ = interfaceC421301kRLIZIZ.LJIIIZ();
        } else {
            c01ebLJIIIZ = null;
        }
        if (c01ebLJIIIZ != C01EB.ONGOING) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_during_countdown", str5);
        map.put("link_id", str3);
        map.put("guest_id", str2);
        if (str4 != null) {
            map.put("request_page", str4);
        }
        LJ("livesdk_anchor_guest_countdown_entrance", mapLIZ);
    }

    public static void LIZIZ(long j, long j2, Boolean bool, boolean z, long j3, String str, long j4, long j5, String str2, boolean z2, boolean z3) {
        String str3;
        Object obj;
        Object obj2;
        Map mapLIZ = LIZ();
        HashMap map = (HashMap) mapLIZ;
        map.put("link_id", str2);
        map.put("guest_id", String.valueOf(j5));
        map.put("duration", String.valueOf(j));
        map.put("countdown_duration", String.valueOf(j2));
        String str4 = CardStruct.IStatusCode.DEFAULT;
        if (!z3) {
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                str3 = "1";
            } else if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            } else {
                if (bool != null) {
                    throw new C1954807lC();
                }
                str3 = "";
            }
        } else {
            str3 = "";
        }
        map.put("is_customed_dur", str3);
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_expand_guest", obj);
        map.put("countdown_target", String.valueOf(j3));
        map.put("end_reason", str);
        map.put("current_target", String.valueOf(j4));
        if (z2) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_countdown_progress", obj2);
        if (z3) {
            str4 = "1";
        }
        map.put("is_multi_guest_moderator", str4);
        LJ("livesdk_anchor_guest_countdown_end", mapLIZ);
    }
}
