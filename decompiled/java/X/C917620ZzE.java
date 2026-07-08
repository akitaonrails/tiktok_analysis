package X;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZzE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917620ZzE {
    public static EnumC918970a1P LIZ = EnumC918970a1P.NORMAL;
    public static long LIZIZ;

    public static void LIZ(String str) {
        if (!C930540aK4.LIZJ() && LIZ != null) {
            HashMap map = new HashMap();
            C01Z4.LIZ(null, map);
            map.put("trigger", str);
            EnumC918970a1P enumC918970a1P = LIZ;
            LIZ = null;
            map.put("layout_setting", C917520Zz4.LJII(enumC918970a1P).getFirst());
            map.put("window_setting", C917520Zz4.LJII(enumC918970a1P).getSecond());
            map.put("duration", String.valueOf(System.currentTimeMillis() - LIZIZ));
            C0KX4.LIZ("livesdk_multilive_mode_connection_duration", map, null, true);
            if (enumC918970a1P != C920830a4P.LIZIZ) {
                C917610ZzD.LIZ(str, enumC918970a1P);
            }
        }
    }

    public static void LIZIZ(String str, Integer num, int i) {
        if ((i & 4) != 0) {
            num = null;
        }
        if (!C930540aK4.LIZJ()) {
            HashMap map = new HashMap();
            C01Z4.LIZ(null, map);
            map.put("trigger", str);
            EnumC918970a1P enumC918970a1PLJIILIIL = C917520Zz4.LJIILIIL();
            if (enumC918970a1PLJIILIIL != null) {
                LIZ = enumC918970a1PLJIILIIL;
            }
            map.put("layout_setting", C917520Zz4.LJII(enumC918970a1PLJIILIIL).getFirst());
            map.put("window_setting", C917520Zz4.LJII(enumC918970a1PLJIILIIL).getSecond());
            if (num != null) {
                map.put("guest_cnt", String.valueOf(num.intValue()));
            }
            C0KX4.LIZ("livesdk_multilive_mode_connection_start", map, null, true);
            LIZIZ = System.currentTimeMillis();
            if (Intrinsics.LJFF(str, "connection_start")) {
                C920830a4P.LIZJ = System.currentTimeMillis();
            }
            C917610ZzD.LIZIZ(str, null);
        }
    }
}
