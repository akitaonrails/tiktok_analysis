package X;

import android.util.SparseLongArray;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceDisplayStrategySetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import qo2.w;

/* JADX INFO: renamed from: X.0es3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1105370es3 {
    public static final long LIZ() {
        SparseLongArray sparseLongArray = C1810700xDg.LIZ;
        long j = C1810700xDg.LJI;
        if (1 > j || j >= 17) {
            return 999L;
        }
        return j;
    }

    public static final int LIZIZ(long j, DataChannel dataChannel) {
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            return 0;
        }
        long j2 = C1810700xDg.LJI;
        long j3 = C1810700xDg.LJII;
        int i = OnlineAudienceDisplayStrategySetting.INSTANCE.getValue().displayNumberN;
        if (j2 > 0 && j3 != 0) {
            long j4 = i;
            if (j2 <= j4 || j >= j2 - j4) {
                return 0;
            }
            return 1;
        }
        return 1;
    }

    public static final void LIZJ(DataChannel dataChannel, int i, EnumC187400no enumC187400no) {
        long ownerUserId;
        long ownerUserId2;
        String strLIZ;
        String str;
        Room room;
        LiveMode streamType;
        Room room2;
        Room room3;
        Room room4;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_top2_empty_slot_page_send_click");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(w.LJIIIZ(), "enter_from_merge");
        c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
        long id = 0;
        if (dataChannel != null && (room4 = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            ownerUserId = room4.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(ownerUserId), "anchor_id");
        if (dataChannel != null && (room3 = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            ownerUserId2 = room3.getOwnerUserId();
        } else {
            ownerUserId2 = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(ownerUserId2), "author_id");
        if (dataChannel != null && (room2 = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            id = room2.getId();
        }
        c474500IjALIZ.LJJII(Long.valueOf(id), "room_id");
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (streamType = room.getStreamType()) != null) {
            strLIZ = C354201Zc.LIZ(streamType);
        } else {
            strLIZ = "";
        }
        c474500IjALIZ.LJJII(strLIZ, "live_type");
        c474500IjALIZ.LJJII(w.LIZLLL(), "action_type");
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            c474500IjALIZ.LJJII("null", "user_rank");
        } else {
            c474500IjALIZ.LJJII(Long.valueOf(LIZ()), "user_rank");
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i + 1), "slot_rank");
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            str = "anchor";
        } else {
            str = "user";
        }
        c474500IjALIZ.LJJII(str, "user_type");
        c474500IjALIZ.LJJII(enumC187400no.getRankingName(), "rank_type");
        c474500IjALIZ.LIZ();
    }

    public static final void LIZLLL(DataChannel dataChannel, C1105460esC c1105460esC, int i) {
        long ownerUserId;
        long id;
        String strLIZ;
        String str;
        LiveMode streamType;
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_top2_audience_slot_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
        w.LIZ.getClass();
        c474500IjALIZIZ.LJJII(w.LJIIIZ(), "enter_from_merge");
        c474500IjALIZIZ.LJJII(w.LJIIL(), "enter_method");
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        if (room != null) {
            ownerUserId = room.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        c474500IjALIZIZ.LJJII(Long.valueOf(ownerUserId), "anchor_id");
        Room room2 = (Room) dataChannel.gg0(RoomChannel.class);
        if (room2 != null) {
            id = room2.getId();
        } else {
            id = 0;
        }
        c474500IjALIZIZ.LJJII(Long.valueOf(id), "room_id");
        Room room3 = (Room) dataChannel.gg0(RoomChannel.class);
        if (room3 != null && (streamType = room3.getStreamType()) != null) {
            strLIZ = C354201Zc.LIZ(streamType);
        } else {
            strLIZ = null;
        }
        c474500IjALIZIZ.LJJII(strLIZ, "live_type");
        c474500IjALIZIZ.LJJII(w.LIZLLL(), "action_type");
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            str = "anchor";
        } else {
            str = "user";
        }
        c474500IjALIZIZ.LJJII(str, "user_type");
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            c474500IjALIZIZ.LJJII("null", "user_rank");
        } else {
            c474500IjALIZIZ.LJJII(Long.valueOf(LIZ()), "user_rank");
        }
        long j = c1105460esC.LIZJ;
        if (j <= 0) {
            c474500IjALIZIZ.LJJII("null", "to_user_rank");
            c474500IjALIZIZ.LJJII("null", "to_user_coins");
            c474500IjALIZIZ.LJJII("null", "is_vague");
            c474500IjALIZIZ.LJJII(1, "is_empty");
        } else {
            c474500IjALIZIZ.LJJII(Long.valueOf(j), "to_user_rank");
            c474500IjALIZIZ.LJJII(Long.valueOf(c1105460esC.LIZIZ), "to_user_coins");
            c474500IjALIZIZ.LJJII(Integer.valueOf(LIZIZ(c1105460esC.LIZJ, dataChannel)), "is_vague");
            c474500IjALIZIZ.LJJII(0, "is_empty");
        }
        c474500IjALIZIZ.LJJII(Integer.valueOf(i + 1), "slot_rank");
        c474500IjALIZIZ.LIZ();
    }
}
