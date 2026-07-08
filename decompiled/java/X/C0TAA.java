package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.game.broadcast.fragment.DualDeviceRtcSourceFragment;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0TAA, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TAA {
    public static DualDeviceRtcSourceFragment LIZ(Map map) {
        C20441214yg.LJIIIZ("DualDeviceRtcSourceFragment", map.toString());
        DualDeviceRtcSourceFragment dualDeviceRtcSourceFragment = new DualDeviceRtcSourceFragment();
        Bundle bundle = new Bundle();
        HashMap map2 = (HashMap) map;
        for (String str : map2.keySet()) {
            Object obj = map2.get(str);
            if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof String) {
                C786410Ut5.LJJJI(str, (String) obj, bundle);
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            }
        }
        dualDeviceRtcSourceFragment.setArguments(bundle);
        return dualDeviceRtcSourceFragment;
    }
}
