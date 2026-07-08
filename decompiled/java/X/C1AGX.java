package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import webcast.data.AnchorGrowRewardInfo;

/* JADX INFO: renamed from: X.1AGX, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AGX {
    public static final void LIZIZ(DataChannel dataChannel, C2176531AGd c2176531AGd, boolean z) {
        String str;
        Object objValueOf;
        String str2;
        String idStr;
        Room room;
        float f = c2176531AGd.LIZJ;
        float f2 = c2176531AGd.LIZLLL;
        float f3 = 0.0f;
        if (f > 0.0f && f2 >= 0.0f) {
            f3 = f2 / f;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_growthjourney_task_icon");
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (z) {
            str = "click";
        } else {
            str = "show";
        }
        c474500IjALIZ.LJJII(str, "action_type");
        String str3 = "";
        if (dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) {
            objValueOf = "";
        } else {
            objValueOf = Long.valueOf(room.getOwnerUserId());
        }
        c474500IjALIZ.LJJII(objValueOf, "anchor_id");
        c474500IjALIZ.LJJII("realtime_live_center", "event_page");
        c474500IjALIZ.LJJII(Long.valueOf(c2176531AGd.LJFF), "task_id");
        c474500IjALIZ.LJJII(Integer.valueOf(c2176531AGd.LJ), "growth_stage");
        c474500IjALIZ.LJJIFFI(Float.valueOf(f3), "task_progress");
        int i = C1781610wSl.LIZ[c2176531AGd.LJIIIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                str2 = "";
            } else {
                str2 = "growth_journey";
            }
        } else {
            str2 = "time_limited_tasks";
        }
        c474500IjALIZ.LJJII(str2, "tasks_shown_type");
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
        if (roomLJJLIIIIJ != null && (idStr = roomLJJLIIIIJ.getIdStr()) != null) {
            str3 = idStr;
        }
        c474500IjALIZ.LJJII(str3, "room_id");
        c474500IjALIZ.LIZ();
    }

    public static final void LIZ(DataChannel dataChannel, C2176541AGe c2176541AGe, boolean z, int i) {
        String str;
        String str2;
        Object objValueOf;
        String idStr;
        long j;
        Integer numValueOf;
        Room room;
        if (z) {
            str = "livesdk_growthjourney_reward_claim_click";
        } else {
            str = "livesdk_growthjourney_rewards_show";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(c2176541AGe.LIZJ), "growth_stage");
        c474500IjALIZ.LJIILJJIL("realtime_live_center");
        int i2 = C1781610wSl.LIZ[c2176541AGe.LJIIIIZZ.ordinal()];
        String str3 = "";
        if (i2 != 1) {
            if (i2 != 2) {
                str2 = "";
            } else {
                str2 = "growth_journey";
            }
        } else {
            str2 = "time_limited_tasks";
        }
        c474500IjALIZ.LJJII(str2, "reward_tab");
        if (dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) {
            objValueOf = "";
        } else {
            objValueOf = Long.valueOf(room.getOwnerUserId());
        }
        c474500IjALIZ.LJJII(objValueOf, "anchor_id");
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
        if (roomLJJLIIIIJ == null || (idStr = roomLJJLIIIIJ.getIdStr()) == null) {
            idStr = "";
        }
        c474500IjALIZ.LJJII(idStr, "room_id");
        c474500IjALIZ.LJJII("realtime_live_center", "event_page");
        AnchorGrowRewardInfo anchorGrowRewardInfo = c2176541AGe.LIZLLL;
        if (anchorGrowRewardInfo != null && (numValueOf = Integer.valueOf(anchorGrowRewardInfo.type)) != null) {
            if (numValueOf.intValue() == 1) {
                str3 = "flare_card";
            } else if (numValueOf.intValue() == 3) {
                str3 = "diamond";
            }
        }
        c474500IjALIZ.LJJII(str3, "rewards_type");
        AnchorGrowRewardInfo anchorGrowRewardInfo2 = c2176541AGe.LIZLLL;
        if (anchorGrowRewardInfo2 != null) {
            j = anchorGrowRewardInfo2.num;
        } else {
            j = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(j), "rewards_amount");
        c474500IjALIZ.LJJII("claim_pending", "rewards_status");
        if (z) {
            c474500IjALIZ.LJJII(Integer.valueOf(i), "rewards_claim_result");
        }
        c474500IjALIZ.LIZ();
    }
}
