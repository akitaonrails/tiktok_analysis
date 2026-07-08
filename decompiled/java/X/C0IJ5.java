package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0IJ5, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IJ5 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(EnterRoomConfig enterRoomConfig, String str) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        EnterRoomConfig.RoomsData roomsData;
        Map<String, String> map;
        EnterRoomConfig.RoomsData roomsData2;
        Boolean boolValueOf3 = null;
        if (str != null) {
            boolValueOf = Boolean.valueOf(a0.LJJIIZI(str, "live_bottom_bar", false));
        } else {
            boolValueOf = null;
        }
        if (!C500260Jjc.LJJIJIIJIL(boolValueOf)) {
            if (enterRoomConfig != null && (roomsData2 = enterRoomConfig.mRoomsData) != null) {
                boolValueOf2 = Boolean.valueOf(roomsData2.isMixLive);
            } else {
                boolValueOf2 = null;
            }
            if (!C500260Jjc.LJJJI(boolValueOf2)) {
                if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null && (map = roomsData.gameLiveExtra) != null) {
                    boolValueOf3 = Boolean.valueOf(map.containsKey("need_bottom_bar_user_guide"));
                }
                if (!C500260Jjc.LJJIJIIJIL(boolValueOf3)) {
                    return true;
                }
            }
        }
        return false;
    }
}
