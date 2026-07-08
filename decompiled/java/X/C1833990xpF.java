package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0xpF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1833990xpF {
    public static final HashMap<String, Long> LIZ = new HashMap<>();
    public static final HashMap<String, Long> LIZIZ = new HashMap<>();

    public static void LIZ(String str) {
        LIZIZ.put(str, 0L);
    }

    public static void LIZJ(String str) {
        long jLongValue;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = LIZ.get(str);
        if (l != null) {
            long jLongValue2 = jCurrentTimeMillis - l.longValue();
            HashMap<String, Long> map = LIZIZ;
            Long l2 = map.get(str);
            if (l2 != null) {
                jLongValue = l2.longValue();
            } else {
                jLongValue = 0;
            }
            map.put(str, Long.valueOf(jLongValue + jLongValue2));
        }
    }

    public static void LIZLLL(String str) {
        LIZ.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public static void LIZIZ(String str, String str2) {
        long jLongValue;
        HashMap<String, Long> map = LIZIZ;
        Long l = map.get(str2);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_leave_replay_page");
        c474500IjALIZ.LJJII(str2, "event_page");
        c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "stay_duration");
        c474500IjALIZ.LJJII(str, "room_id");
        c474500IjALIZ.LIZ();
        LIZ.remove(str2);
        map.remove(str2);
    }
}
