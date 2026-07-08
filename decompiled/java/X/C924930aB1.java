package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aB1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924930aB1 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, boolean z) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        String str3;
        HashMap map = new HashMap();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            map.put("room_id", room.getIdStr());
            map.put("guest_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        }
        String str4 = C925600aC6.LIZ;
        int i = 0;
        if (str4 != null && str4.length() > 0) {
            map.put("request_page", str4);
        }
        map.put("guest_invite_type", str);
        map.put("connection_status", str2);
        map.put("reservation_id", String.valueOf(C929810aIt.LIZLLL));
        String str5 = "1";
        if (C929810aIt.LIZLLL != 0) {
            map.put("is_reservation_sender", "1");
        }
        MultiGuestDataHolder multiGuestDataHolder = C920830a4P.LIZ;
        if (multiGuestDataHolder != null) {
            boolValueOf = Boolean.valueOf(multiGuestDataHolder.LJIIIZ);
        } else {
            boolValueOf = null;
        }
        map.put("mic_status", String.valueOf(!C500260Jjc.LJJIJIIJIL(boolValueOf) ? 1 : 0));
        MultiGuestDataHolder multiGuestDataHolder2 = C920830a4P.LIZ;
        if (multiGuestDataHolder2 != null) {
            boolValueOf2 = Boolean.valueOf(multiGuestDataHolder2.LJIIJ);
        } else {
            boolValueOf2 = null;
        }
        if (C500260Jjc.LJJIJIIJIL(boolValueOf2)) {
            str3 = "off";
        } else {
            MultiGuestDataHolder multiGuestDataHolder3 = C920830a4P.LIZ;
            if (multiGuestDataHolder3 != null) {
                boolValueOf3 = Boolean.valueOf(multiGuestDataHolder3.LJIILL);
            } else {
                boolValueOf3 = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf3)) {
                str3 = "rear";
            } else {
                str3 = "front";
            }
        }
        map.put("camera_type", str3);
        MultiGuestDataHolder multiGuestDataHolder4 = C920830a4P.LIZ;
        if (multiGuestDataHolder4 != null) {
            i = multiGuestDataHolder4.LJJIFFI;
        }
        map.put("guest_cnt", String.valueOf(i));
        map.put("guest_permission", C917520Zz4.LJIIIIZZ(false, null));
        if (!z) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_karaoke_request", str5);
        map.put("multi_tool", ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).No2());
        map.put("empty_mic_count", String.valueOf(C921180a4y.LJI(C915980Zwa.LJIIIIZZ())));
        map.put("auto_accept_request_initiate_type", String.valueOf(C925650aCB.LIZ()));
        C917520Zz4.LIZ(map);
        C917750ZzR.LIZ(map);
        C917650ZzH.LIZIZ(map);
        C0KX4.LIZ("livesdk_guest_preview_page_show", map, null, true);
    }

    public static void LIZIZ(String str, LiveEffect liveEffect, long j, boolean z, boolean z2, boolean z3, String str2, String str3, long j2, Boolean bool) {
        String str4;
        long effectId;
        String str5;
        String str6;
        String str7;
        HashMap map = new HashMap();
        if (str == null) {
            str4 = "others";
        } else if (Intrinsics.LJFF(str, "apply")) {
            str4 = "guest_apply_anchor";
        } else if (Intrinsics.LJFF(str, "invite")) {
            str4 = "anchor_invite_guest";
        } else {
            str4 = str;
        }
        map.put("guest_invite_type", str4);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            map.put("room_id", room.getIdStr());
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            map.put("guest_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        }
        if (liveEffect != null) {
            effectId = liveEffect.getEffectId();
        } else {
            effectId = 0;
        }
        map.put("props_id", String.valueOf(effectId));
        map.put("enhance_level", String.valueOf(j));
        map.put("mic_status", String.valueOf(!z ? 1 : 0));
        map.put("camera_status", String.valueOf(!z2 ? 1 : 0));
        if (z2) {
            str5 = "off";
        } else if (z3) {
            str5 = "rear";
        } else {
            str5 = "front";
        }
        map.put("camera_type", str5);
        map.put("close_way", str2);
        map.put("close_reason", str3);
        map.put("guest_permission", C917520Zz4.LJIIIIZZ(false, null));
        if (str == null) {
            str6 = "click_icon";
        } else if (Intrinsics.LJFF(str, "apply")) {
            str6 = "accepted_apply";
        } else if (Intrinsics.LJFF(str, "invite")) {
            str6 = "receive_invitation";
        } else {
            str6 = "";
        }
        map.put("open_reason", str6);
        map.put("stay_duration", String.valueOf(j2));
        map.put("live_type", C917520Zz4.LJIIL());
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            str7 = "1";
        } else {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_karaoke_request", str7);
        C917750ZzR.LIZ(map);
        C917520Zz4.LIZ(map);
        C0KX4.LIZ("livesdk_guest_connection_preview_panel_close", map, null, true);
    }
}
