package X;

import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0JMI, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JMI {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(DataChannel dataChannel, Map map) {
        String str;
        C0IXW c0ixw = C0IXW.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AdLiveEnterRoomConfig adLiveEnterRoomConfigLJII = C0IXW.LJII(dataChannel);
        if (adLiveEnterRoomConfigLJII != null && (str = adLiveEnterRoomConfigLJII.ttclId) != null) {
            linkedHashMap.put("ttclid", str);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }
}
