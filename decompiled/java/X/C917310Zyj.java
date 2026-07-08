package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Zyj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917310Zyj {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(EnumC918790a17 enumC918790a17) {
        Pair pair;
        int i;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("trigger", enumC918790a17.getValue());
        int i2 = C917340Zym.LIZ[enumC918790a17.ordinal()];
        String str = "off";
        switch (i2) {
            case 1:
                if ((C925150aBN.LIZJ() & 4) == 4) {
                    str = "on";
                }
                pair = new Pair(str, "on");
                break;
            case 2:
            case 3:
                if ((C925150aBN.LIZJ() & 4) != 4) {
                    str = "on";
                }
                pair = new Pair(str, "on");
                break;
            case 4:
                pair = new Pair("off", "off");
                break;
            case 5:
                pair = new Pair("off", "on");
                break;
            case 6:
                pair = new Pair("on", "on");
                break;
            default:
                throw new C1954807lC();
        }
        map.put("guest_mode_status", pair.getSecond());
        map.put("switch_to", pair.getFirst());
        MultiGuestDataHolder multiGuestDataHolder = C920830a4P.LIZ;
        if (multiGuestDataHolder != null) {
            i = multiGuestDataHolder.LJJIFFI;
        } else {
            i = 0;
        }
        map.put("guest_cnt", String.valueOf(i));
        C0KX4.LIZ("livesdk_multi_anchor_permissionsettings_friends_only_on_and_off", map, null, true);
    }
}
