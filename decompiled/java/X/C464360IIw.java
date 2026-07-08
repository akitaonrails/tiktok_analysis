package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0IIw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C464360IIw {
    public static HashMap<String, String> LIZ(DataChannel dataChannel) {
        if (dataChannel == null) {
            return new HashMap<>();
        }
        HashMap<String, String> map = (HashMap) dataChannel.gg0(C749470Tab.class);
        if (map == null) {
            HashMap<String, String> map2 = new HashMap<>();
            dataChannel.SX0(C749470Tab.class, map2);
            return map2;
        }
        return map;
    }

    public static void LIZIZ(DataChannel dataChannel, String str, String str2) {
        HashMap<String, String> mapLIZ = LIZ(dataChannel);
        if (!mapLIZ.containsKey(str)) {
            mapLIZ.put(str, str2);
        }
    }
}
