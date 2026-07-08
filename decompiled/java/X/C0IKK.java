package X;

import android.graphics.Rect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0IKK, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IKK {
    public static boolean LIZ(DataChannel dataChannel) {
        if (dataChannel != null) {
            long jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getDualDeviceEnabled: roomID: ");
            sbLIZ.append(jLJJLIIIJ);
            sbLIZ.append(", enabled: ");
            HashMap<Long, Boolean> map = C464030IHp.LJIIJ;
            sbLIZ.append(map.get(Long.valueOf(jLJJLIIIJ)));
            C20441214yg.LIZIZ("test_lzk_enable", C2188811AlT.LIZIZ(sbLIZ));
            return C176600m4.LIZIZ(map.get(Long.valueOf(jLJJLIIIJ)));
        }
        return false;
    }

    public static boolean LIZIZ(Long l) {
        if (l != null) {
            l.longValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getDualDeviceEnabled: roomID: ");
            sbLIZ.append(l);
            sbLIZ.append(", enabled: ");
            HashMap<Long, Boolean> map = C464030IHp.LJIIJ;
            sbLIZ.append(map.get(l));
            C20441214yg.LIZIZ("test_lzk_enable", C2188811AlT.LIZIZ(sbLIZ));
            return C176600m4.LIZIZ(map.get(l));
        }
        return false;
    }

    public static Rect LIZJ(Long l) {
        if (l != null) {
            l.longValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getDualDeviceEnabled: roomID: ");
            sbLIZ.append(l);
            sbLIZ.append(", enabled: ");
            sbLIZ.append(C464030IHp.LJIIJ.get(l));
            C20441214yg.LIZIZ("test_lzk_enable", C2188811AlT.LIZIZ(sbLIZ));
            return C464030IHp.LJIIJJI.get(l);
        }
        return null;
    }
}
