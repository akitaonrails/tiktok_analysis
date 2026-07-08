package X;

import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCoHostFollowPromptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0b6y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C960860b6y {
    public static final int LIZ = MultiCoHostFollowPromptSetting.INSTANCE.getValue().maxShowTimePerRoom;

    public static int LIZ(Room room) {
        Map<Long, Integer> mapLIZIZ = InterfaceC1106030et7.J8.LIZIZ();
        if (mapLIZIZ == null) {
            mapLIZIZ = new LinkedHashMap<>();
        }
        Integer num = mapLIZIZ.get(Long.valueOf(room.getId()));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
