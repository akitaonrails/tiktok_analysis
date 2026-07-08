package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.level.FansClubPrivilegeConfigSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import qo2.w;

/* JADX INFO: renamed from: X.0Jgm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C498500Jgm {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZJ() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        return room != null && room.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId();
    }

    public static void LIZIZ(Map map) {
        String str;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            HashMap map2 = (HashMap) map;
            map2.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            map2.put("room_id", room.getIdStr());
            w.LIZ.getClass();
            map2.put("enter_method", w.LJIIL());
            map2.put("enter_from_merge", w.LJIIIZ());
            map2.put("action_type", w.LIZLLL());
            map2.put("request_id", w.LJIJI());
            map2.put("video_id", w.LJJII());
            if (room.getOwner() != null) {
                if (room.getOwner().isFollowing()) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                map2.put("is_follow", str);
            }
        }
    }

    public static C443120HZe LJFF(List list) {
        EmoteModel emoteModel;
        int i;
        List<String> list2 = FansClubPrivilegeConfigSetting.INSTANCE.getValue().defaultStickerIds;
        int i2 = 0;
        int i3 = 0;
        for (Object obj : (ArrayList) list) {
            if ((obj instanceof EmoteModel) && ((i = (emoteModel = (EmoteModel) obj).emoteScene) == 2 || i == 3)) {
                i2++;
                if (list2 != null && !list2.contains(emoteModel.emoteId)) {
                    i3++;
                }
            }
        }
        return new C443120HZe(0, Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static void LIZ(C474500IjA c474500IjA, DataChannel dataChannel) {
        long j;
        int i;
        boolean z;
        if (dataChannel != null) {
            C1095140ebY c1095140ebYUw0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).uw0();
            if (c1095140ebYUw0 != null) {
                j = c1095140ebYUw0.LIZ;
            } else {
                j = 0;
            }
            int i2 = 0;
            if (c1095140ebYUw0 != null) {
                i = c1095140ebYUw0.LJ;
            } else {
                i = 0;
            }
            if (!C500260Jjc.LJIIZILJ(dataChannel)) {
                c474500IjA.LJJII(String.valueOf(j), "fans_club_level");
                if (i == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (j > 0) {
                    if (!z) {
                        i2 = 1;
                    } else {
                        i2 = 3;
                    }
                }
                c474500IjA.LJJII(Integer.valueOf(i2), "fans_club_relation_status");
            }
        }
    }

    public static void LJ(String str, String str2) {
        String str3;
        boolean zIsAnchorQualified;
        SubscribeInfo subscribeInfo;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("show_entrance", str);
        if (LIZJ()) {
            str3 = "anchor";
        } else {
            str3 = "user";
        }
        map.put("user_type", str3);
        if (str2 != null) {
            map.put("emote_id", str2);
        }
        LIZIZ(map);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscribe_icon_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        User owner = room.getOwner();
        if (owner != null && (subscribeInfo = owner.getSubscribeInfo()) != null) {
            zIsAnchorQualified = subscribeInfo.isAnchorQualified();
        } else {
            zIsAnchorQualified = false;
        }
        c474500IjALIZ.LJJIIZI(C494680Jac.LJJIFFI(zIsAnchorQualified, LIZJ(), false));
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LIZ();
        } else {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJJIJIL();
            c474500IjALIZ.LJJIJL();
        }
        C510380Jzw.LJIJJLI(str);
    }

    public static void LIZLLL(DataChannel dataChannel, String str, String str2, String str3, List list, List list2, String str4) {
        Room room;
        int i;
        String str5;
        if (dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(list2);
        C443120HZe c443120HZeLJFF = LJFF(arrayList);
        if (((Number) c443120HZeLJFF.getSecond()).intValue() < 0) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_comment_panel_fans_club_sticker_tab_click");
        if (str == null) {
            str = "";
        }
        c474500IjALIZ.LJJII(str, "show_entrance");
        c474500IjALIZ.LJJII(String.valueOf(room.getOwnerUserId()), "anchor_id");
        c474500IjALIZ.LJJII(room.getIdStr(), "room_id");
        c474500IjALIZ.LJJII(str3, "sticker_id");
        c474500IjALIZ.LJJII(str2, "click_position");
        if (((Number) c443120HZeLJFF.getFirst()).intValue() > 0) {
            i = 1;
        } else {
            i = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "has_sub_tab");
        c474500IjALIZ.LJJII(C1114370f6Z.LJIIIZ(), "subscribe_state");
        LIZ(c474500IjALIZ, dataChannel);
        c474500IjALIZ.LJJII(c443120HZeLJFF.getSecond(), "fans_club_sticker_num");
        c474500IjALIZ.LJJII(c443120HZeLJFF.getThird(), "customized_fans_club_sticker_num");
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            str5 = "anchor";
        } else {
            str5 = "user";
        }
        c474500IjALIZ.LJJII(str5, "user_type");
        if (!TextUtils.isEmpty(str4)) {
            c474500IjALIZ.LJJII(str4, "tab_type");
        }
        c474500IjALIZ.LIZ();
    }
}
