package X;

import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0KYK, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KYK {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:64:0x0149 A[PHI: r5
      0x0149: PHI (r5v2 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String) binds: [B:17:0x0030, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C760370TsB r11, com.bytedance.ies.sdk.datachannel.DataChannel r12) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KYK.LIZ(X.0TsB, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    public static void LIZJ(C760370TsB c760370TsB, DataChannel dataChannel) {
        C0IXL c0ixl;
        String str;
        String str2;
        String string;
        PollMessage pollMessage;
        String string2;
        String str3;
        if (dataChannel == null) {
            return;
        }
        c760370TsB.LJJIFFI("is_anchor", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel))) ? 1 : 0));
        c760370TsB.LJJIFFI("is_admin", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C01C5.LIZ(dataChannel))) ? 1 : 0));
        c760370TsB.LJJIFFI("user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        c760370TsB.LJJIFFI("time_diff", String.valueOf(C963140bAe.LIZLLL));
        C0IR5 c0ir5 = (C0IR5) dataChannel.gg0(C1087000eOQ.class);
        if (c0ir5 != null) {
            c0ixl = c0ir5.LJFF;
        } else {
            c0ixl = null;
        }
        String str4 = "";
        if (c0ixl == null || (str = c0ixl.LIZ) == null) {
            str = "";
        }
        c760370TsB.LJJIFFI("enter_method", str);
        if (c0ixl == null || (str2 = c0ixl.LIZIZ) == null) {
            str2 = "";
        }
        c760370TsB.LJJIFFI("enter_from_merge", str2);
        c760370TsB.LJJIFFI("action_type", "show");
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        if (room == null) {
            return;
        }
        c760370TsB.LJJIFFI("room_id", String.valueOf(room.getId()));
        c760370TsB.LJJIFFI("anchor_id", String.valueOf(room.getOwnerUserId()));
        String secUid = room.getOwner().getSecUid();
        secUid.toString();
        c760370TsB.LJJIFFI("sec_anchor_id", secUid);
        LiveMode streamType = room.getStreamType();
        if (streamType != null && (str3 = streamType.logStreamingType) != null) {
            str4 = str3;
        }
        c760370TsB.LJJIFFI("live_type", str4);
        if (C1086960eOM.LL.LIZLLL(room.getId()) != null) {
            C01C1 c01c1LIZJ = C1086960eOM.LIZJ(room.getId());
            String str5 = CardStruct.IStatusCode.DEFAULT;
            if (c01c1LIZJ == null || (string = Long.valueOf(c01c1LIZJ.LIZJ).toString()) == null) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            c760370TsB.LJJIFFI("poll_end_time", string);
            C01C1 c01c1LIZJ2 = C1086960eOM.LIZJ(room.getId());
            if (c01c1LIZJ2 != null && (pollMessage = c01c1LIZJ2.LJFF) != null && (string2 = Long.valueOf(pollMessage.pollId).toString()) != null) {
                str5 = string2;
            }
            c760370TsB.LJJIFFI("poll_id", str5);
        }
    }

    public static void LIZIZ(C19EG c19eg, DataChannel dataChannel, String str) {
        SparkContext sparkContextYC1;
        IHybridContainerService iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class);
        if (iHybridContainerService != null && (sparkContextYC1 = iHybridContainerService.YC1(c19eg, str, null)) != null) {
            sparkContextYC1.LJJJJZI(new C522040Kde(dataChannel, 2));
        }
    }
}
