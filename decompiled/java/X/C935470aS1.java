package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0aS1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935470aS1 {
    public static EnumC918970a1P LIZ;
    public static EnumC918970a1P LIZIZ;

    public static void LIZJ(Map map) {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            HashMap map2 = (HashMap) map;
            map2.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            map2.put("room_id", room.getIdStr());
        }
    }

    public static void LIZ(LiveEffect liveEffect, Map map) {
        String string;
        String string2;
        String name;
        String resourceId;
        Integer numLJJIJL;
        String str = "";
        if (liveEffect == null || (numLJJIJL = liveEffect.LJJIJL()) == null || (string = Integer.valueOf(numLJJIJL.intValue() + 1).toString()) == null) {
            string = "";
        }
        HashMap map2 = (HashMap) map;
        map2.put("impr_position", string);
        if (liveEffect == null || (string2 = Long.valueOf(liveEffect.getEffectId()).toString()) == null) {
            string2 = "";
        }
        map2.put("sticker_id", string2);
        if (liveEffect == null || (name = liveEffect.getName()) == null) {
            name = "";
        }
        map2.put("sticker_name", name);
        if (liveEffect != null && (resourceId = liveEffect.getResourceId()) != null) {
            str = resourceId;
        }
        map2.put("resource_id", str);
    }

    public static void LIZIZ(Map map, EnumC918970a1P enumC918970a1P) {
        String str;
        int i;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ2;
        if (enumC918970a1P == null) {
            MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
            int i2 = -1;
            if (multiGuestDataHolderLIZJ != null && (multiLiveAnchorPanelSettingsLIZIZ2 = multiGuestDataHolderLIZJ.LIZIZ()) != null) {
                i = multiLiveAnchorPanelSettingsLIZIZ2.layoutType;
            } else {
                i = -1;
            }
            MultiGuestDataHolder multiGuestDataHolderLIZJ2 = C916490ZxP.LIZJ();
            if (multiGuestDataHolderLIZJ2 != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLIZJ2.LIZIZ()) != null) {
                i2 = multiLiveAnchorPanelSettingsLIZIZ.fixMicNumAction;
            }
            enumC918970a1P = C917140ZyS.LJFF(i, i2);
        }
        HashMap map2 = (HashMap) map;
        map2.put("layout_setting", C917520Zz4.LJII(enumC918970a1P).getFirst());
        map2.put("window_setting", C917520Zz4.LJII(enumC918970a1P).getSecond());
        if (C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ()) > 0) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("is_guest_onstage", str);
    }

    public static final void LJFF(String str, String str2) {
        HashMap map = new HashMap();
        LIZJ(map);
        LIZIZ(map, null);
        C924620aAW.LJIIJJI(map);
        map.put("popup_type", str);
        map.put("action_type", str2);
        LJI("livesdk_anchor_shared_background_popup", map);
    }

    public static void LJI(String str, Map map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static final void LIZLLL(int i, LiveEffect liveEffect, String str) {
        HashMap map = new HashMap();
        LIZJ(map);
        LIZIZ(map, null);
        LIZ(liveEffect, map);
        map.put("is_cancel", String.valueOf(i));
        map.put("position", str);
        LJI("livesdk_anchor_shared_background_click", map);
    }

    public static final void LJ(String str, List list, List list2, List list3) {
        HashMap map = new HashMap();
        LIZJ(map);
        LIZIZ(map, null);
        map.put("sticker_position", list.toString());
        map.put("sticker_id_set", list2.toString());
        map.put("resource_id_set", list3.toString());
        map.put("position", str);
        LJI("livesdk_anchor_shared_background_panel_show", map);
    }
}
