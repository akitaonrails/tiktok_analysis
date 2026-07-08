package X;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.01EY, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01EY {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, List list) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("action_type", str);
        map.put("former_playmode", C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62));
        map.put("later_playmode", str2);
        C0KX4.LIZ("livesdk_multi_anchor_playmode_popup", map, null, true);
    }
}
