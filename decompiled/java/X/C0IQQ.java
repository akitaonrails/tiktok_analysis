package X;

import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.dataChannel.AudienceRefreshGamePointsRedDot;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0IQQ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IQQ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(DataChannel dataChannel) {
        try {
            if (!RedDotExtensionKt.LJ(C0UX6.RED_DOT_USE_GAME_POINTS)) {
                Long lLIZIZ = InterfaceC772390URp.f134k0.LIZIZ();
                if (lLIZIZ == null || lLIZIZ.longValue() <= 0) {
                    InterfaceC772390URp.f134k0.LJFF(Long.valueOf(System.currentTimeMillis()));
                    if (dataChannel != null) {
                        dataChannel.FQ2(AudienceRefreshGamePointsRedDot.class);
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("PointsUtils", e);
        }
    }

    public static boolean LIZ(DataChannel dataChannel, C0UX6 c0ux6) {
        Boolean boolValueOf;
        long jLongValue;
        Room room;
        RoomAuthStatus roomAuthStatus;
        Boolean bool = null;
        if (c0ux6 == C0UX6.RED_DOT_AUDIENCE_SHARE_BUTTON_GAME_POINTS) {
            String[] ids = c0ux6.getIds();
            if (ids.length != 0) {
                c0ux6.setCurrentId(ids[0]);
            }
        }
        if (RedDotExtensionKt.LJ(c0ux6)) {
            return false;
        }
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (roomAuthStatus = room.mRoomAuthStatus) != null) {
            boolValueOf = Boolean.valueOf(roomAuthStatus.creditEntranceForAudience);
        } else {
            boolValueOf = null;
        }
        if (!C500260Jjc.LJJIJIIJIL(boolValueOf)) {
            if (dataChannel != null) {
                bool = (Boolean) dataChannel.gg0(C0TZM.class);
            }
            if (!C500260Jjc.LJJIJIIJIL(bool)) {
                Long lLIZIZ = InterfaceC772390URp.f134k0.LIZIZ();
                if (lLIZIZ != null) {
                    jLongValue = lLIZIZ.longValue();
                } else {
                    jLongValue = 0;
                }
                long jLIZIZ = C1387310mCn.LIZIZ(1);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jLongValue > 0 && jCurrentTimeMillis - jLongValue <= ((long) 3) * jLIZIZ) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
