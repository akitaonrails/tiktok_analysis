package X;

import com.bytedance.android.live.liveinteract.platform.common.monitor.DeepLinkEnterMultiLiveRoomDataHandler;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aDa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C926520aDa {
    public static DeepLinkEnterMultiLiveRoomDataHandler LIZIZ() {
        return (DeepLinkEnterMultiLiveRoomDataHandler) C948450amx.LIZIZ.LJIIJJI("DATA_MULTI_LIVE_DEEP_LINK_ENTER_ROOM");
    }

    public static void LIZ(boolean z, Room room) {
        EnterRoomConfig enterRoomConfig;
        if (z) {
            return;
        }
        DeepLinkEnterMultiLiveRoomDataHandler deepLinkEnterMultiLiveRoomDataHandler = new DeepLinkEnterMultiLiveRoomDataHandler();
        EnterRoomLinkSession enterRoomLinkSessionLIZIZ = C0IL2.LIZ.LIZIZ();
        if (enterRoomLinkSessionLIZIZ != null && (enterRoomConfig = enterRoomLinkSessionLIZIZ.mEnterRoomConfig) != null) {
            deepLinkEnterMultiLiveRoomDataHandler.LIZLLL(room, true, enterRoomConfig.mRoomsData.enterForMultiLive);
            C948450amx.LIZIZ.LJFF(deepLinkEnterMultiLiveRoomDataHandler, null);
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            if (roomsData.enterForMultiLive != null && !Intrinsics.LJFF(roomsData.isFromMgTopLive, "1")) {
                enterRoomConfig.mRoomsData.enterForMultiLive = "-1";
            }
        }
    }
}
