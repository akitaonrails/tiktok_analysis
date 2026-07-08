package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0IJ6, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IJ6 {
    public final C465560INm LIZ;

    public C0IJ6(C465560INm c465560INm) {
        this.LIZ = c465560INm;
    }

    public static boolean LIZ(EnterRoomConfig enterRoomConfig, String str) {
        Boolean boolValueOf;
        EnterRoomConfig.RoomsData roomsData;
        Map<String, String> map;
        Boolean boolValueOf2 = null;
        if (str != null) {
            boolValueOf = Boolean.valueOf(a0.LJJIIZI(str, "live_bottom_bar", false));
        } else {
            boolValueOf = null;
        }
        if (!C500260Jjc.LJJJI(boolValueOf)) {
            return false;
        }
        if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null && (map = roomsData.gameLiveExtra) != null) {
            boolValueOf2 = Boolean.valueOf(map.containsKey("need_bottom_bar_user_guide"));
        }
        if (!C500260Jjc.LJJJI(boolValueOf2)) {
            return false;
        }
        return true;
    }
}
