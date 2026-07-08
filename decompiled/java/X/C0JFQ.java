package X;

import android.os.SystemClock;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.interaction.drawguess.DrawGuessFreelyStartChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessHasLoggedRoundEndChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessInGameRoundChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessInGameSessionChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundCountChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessSessionIdChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessSessionStartTimeChannel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0JFQ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JFQ {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(DataChannel dataChannel) {
        RoomAuthStatus roomAuthStatus;
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
        if (roomLJJLIIIIJ != null && (roomAuthStatus = roomLJJLIIIIJ.getRoomAuthStatus()) != null && roomAuthStatus.pictionarypermission > 0) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(DataChannel dataChannel) {
        Boolean bool;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.gg0(DrawGuessFreelyStartChannel.class);
        } else {
            bool = null;
        }
        return C500260Jjc.LJJJI(bool);
    }

    public static void LIZJ(DataChannel dataChannel) {
        long jLongValue;
        String str;
        int iIntValue;
        Long l = (Long) dataChannel.gg0(DrawGuessSessionIdChannel.class);
        long jLongValue2 = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_pictionary_end");
        c474500IjALIZ.LJIL();
        if (LIZIZ(dataChannel)) {
            str = "freely";
        } else {
            str = "draw_and_guess";
        }
        c474500IjALIZ.LJJII(str, "type");
        c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "pictionary_session_id");
        Integer num = (Integer) dataChannel.gg0(DrawGuessRoundCountChannel.class);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(iIntValue), "number_cnt");
        c474500IjALIZ.LJJII("live_end", "end_reason");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Long l2 = (Long) dataChannel.gg0(DrawGuessSessionStartTimeChannel.class);
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        }
        c474500IjALIZ.LJJII(Long.valueOf(jUptimeMillis - jLongValue2), "duration");
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(DataChannel dataChannel, boolean z) {
        if (dataChannel == null) {
            return;
        }
        if (C500260Jjc.LJJJI((Boolean) dataChannel.gg0(DrawGuessInGameSessionChannel.class))) {
            Boolean bool = Boolean.FALSE;
            dataChannel.zW(DrawGuessInGameSessionChannel.class, bool);
            if (C500260Jjc.LJJJI((Boolean) dataChannel.gg0(DrawGuessInGameRoundChannel.class)) || C500260Jjc.LJJIFFI((Boolean) dataChannel.gg0(DrawGuessHasLoggedRoundEndChannel.class))) {
                dataChannel.zW(DrawGuessHasLoggedRoundEndChannel.class, Boolean.TRUE);
                dataChannel.zW(DrawGuessInGameRoundChannel.class, bool);
                ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).OW(dataChannel, z);
            }
            ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).fZ0(dataChannel, z);
            return;
        }
        if (!LIZIZ(dataChannel)) {
            return;
        }
        ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).fZ0(dataChannel, z);
    }
}
