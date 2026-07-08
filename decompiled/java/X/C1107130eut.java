package X;

import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LiveLeadsAdsPinCardMockSetting;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eut, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1107130eut {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ() {
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        AdLiveEnterRoomConfig adLiveEnterRoomConfig;
        EnterRoomLinkSession enterRoomLinkSessionLIZ = C0IL2.LIZ.LIZ();
        return LIZJ((enterRoomLinkSessionLIZ == null || (enterRoomConfig = enterRoomLinkSessionLIZ.mEnterRoomConfig) == null || (roomsData = enterRoomConfig.mRoomsData) == null || (adLiveEnterRoomConfig = roomsData.adLiveEnterRoomConfig) == null) ? null : adLiveEnterRoomConfig.isLeadsAdsTraffic);
    }

    public static SubPinCard LIZ(Room room) {
        if (room != null) {
            SubPinCard subPinCard = room.leadsAdsPinCard;
            if (subPinCard != null || ((subPinCard = room.subPinCard) != null && LiveLeadsAdsPinCardMockSetting.INSTANCE.shouldUseSubPinCardAsLeadsAdsPinCard())) {
                return subPinCard;
            }
            return null;
        }
        return null;
    }

    public static boolean LIZJ(Boolean bool) {
        if (!Intrinsics.LJFF(bool, Boolean.TRUE) && !LiveLeadsAdsPinCardMockSetting.INSTANCE.shouldForceLeadsAdsTraffic()) {
            return false;
        }
        return true;
    }
}
