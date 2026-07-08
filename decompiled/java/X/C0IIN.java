package X;

import com.bytedance.android.livesdk.model.MaskLayer;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IIN, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IIN {
    public static final boolean LIZ(Room room, EnterRoomConfig enterRoomConfig, boolean z) {
        boolean zIsR2OrUnknownMask;
        MaskLayer maskLayer;
        boolean zLJJIIJZLJL = C500260Jjc.LJJIIJZLJL(room);
        if (room != null && (maskLayer = room.maskLayer) != null) {
            zIsR2OrUnknownMask = maskLayer.isR2OrUnknownMask();
        } else {
            zIsR2OrUnknownMask = false;
        }
        if (!z && !zLJJIIJZLJL && zIsR2OrUnknownMask) {
            if (enterRoomConfig != null) {
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                String str = roomsData.enterMethod;
                String str2 = roomsData.enterFromMerge;
                if (Intrinsics.LJFF("live_cell", str) && (Intrinsics.LJFF("homepage_hot", str2) || Intrinsics.LJFF("homepage_follow", str2))) {
                    Map<String, Object> map = C1338270kvh.LIZ;
                    return false;
                }
                if (Intrinsics.LJFF("right_anchor", str) && Intrinsics.LJFF("live_detail", str2)) {
                    Map<String, Object> map2 = C1338270kvh.LIZ;
                    return false;
                }
                return true;
            }
            return true;
        }
        Map<String, Object> map3 = C1338270kvh.LIZ;
        return false;
    }
}
