package X;

import com.bytedance.android.livesdk.userservice.UserService;
import java.util.HashMap;

/* JADX INFO: renamed from: X.01Hn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C308501Hn {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(int i, int i2, long j) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("guest_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        map.put("link_id", C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()));
        map.put("guest_showdown_id", String.valueOf(j));
        map.put("number_of_loser", String.valueOf(i));
        if (C01ZC.LIZIZ()) {
            map.put("number_of_winner", String.valueOf(i2));
        }
        C0KX4.LIZ("livesdk_multi_guest_guest_showdown_apply", map, null, true);
    }

    public static void LIZ(int i, int i2, long j, long j2) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("guest_showdown_id", String.valueOf(j));
        map.put("set_duration", String.valueOf(j2));
        map.put("number_of_loser", String.valueOf(i));
        if (C01ZC.LIZIZ()) {
            map.put("number_of_winner", String.valueOf(i2));
        }
        C0KX4.LIZ("livesdk_multi_anchor_guest_showdown_apply", map, null, true);
    }

    public static void LIZJ(int i, int i2, int i3, long j, long j2, long j3, long j4, long j5, String str) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("guest_showdown_id", String.valueOf(j));
        map.put("total_guest_cnt", String.valueOf(i));
        map.put("set_duration", String.valueOf(j2));
        map.put("total_duration", String.valueOf(j3));
        map.put("countdown_duration", String.valueOf(j4));
        map.put("number_of_loser", String.valueOf(i2));
        map.put("total_points", String.valueOf(j5));
        map.put("end_reason", str);
        if (C01ZC.LIZIZ()) {
            map.put("number_of_winner", String.valueOf(i3));
        }
        C0KX4.LIZ("livesdk_multi_anchor_guest_showdown_end", map, null, true);
    }
}
