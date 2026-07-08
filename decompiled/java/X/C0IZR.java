package X;

import android.net.Uri;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePaidEventSchema;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.AwS61S0210000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IZR, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IZR {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Room room) {
        if (room != null && room.liveEventInfo != null && Intrinsics.LJFF(room.liveEventInfo.isPaidEvent, Boolean.TRUE)) {
            return true;
        }
        return false;
    }

    public static final void LIZIZ(C19EG c19eg, EnterRoomConfig enterRoomConfig, DataChannel dataChannel, boolean z) {
        int iYy2;
        LiveEventInfo liveEventInfo;
        Long l;
        if (c19eg == null) {
            return;
        }
        C495520Jby c495520Jby = new C495520Jby(LivePaidEventSchema.INSTANCE.getValue());
        c495520Jby.LIZIZ(enterRoomConfig.mRoomsData.roomId, "room_id");
        c495520Jby.LIZJ("request_id", enterRoomConfig.mLogData.requestId);
        c495520Jby.LIZJ("author_id", enterRoomConfig.mRoomsData.userId);
        if (z) {
            c495520Jby.LIZ(1, "paid_event_preview");
        }
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
        if (roomLJJLIIIIJ != null && (liveEventInfo = roomLJJLIIIIJ.liveEventInfo) != null && (l = liveEventInfo.eventId) != null) {
            c495520Jby.LIZIZ(l.longValue(), "live_event_id");
        }
        IRankService iRankService = (IRankService) C1161920gLG.LIZJ(IRankService.class);
        if (iRankService != null) {
            iYy2 = iRankService.yy2();
        } else {
            iYy2 = 0;
        }
        c495520Jby.LIZ(iYy2, "room_user_count");
        Uri uri = UriProtector.parse(c495520Jby.LIZLLL());
        IHybridContainerService iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class);
        if (iHybridContainerService != null) {
            iHybridContainerService.YC1(c19eg, uri.toString(), new AwS61S0210000_7(roomLJJLIIIIJ, dataChannel, z, 1));
        }
    }
}
