package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0IIu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C464340IIu {
    public static final /* synthetic */ int LIZ = 0;

    public static final Map<String, String> LIZ(EnterRoomConfig enterRoomConfig) {
        EnterRoomConfig.LogData logData;
        Map<String, String> map;
        LinkedHashMap linkedHashMap = null;
        if (enterRoomConfig != null && (logData = enterRoomConfig.mLogData) != null && (map = logData.liveRoomStatesTagMap) != null && (!map.isEmpty())) {
            linkedHashMap = new LinkedHashMap();
            if (map.containsKey("live_card_optimus_slate_group_type")) {
                linkedHashMap.put("live_card_optimus_slate_group_type", map.get("live_card_optimus_slate_group_type"));
            }
        }
        return linkedHashMap;
    }
}
