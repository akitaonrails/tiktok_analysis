package X;

import java.util.HashMap;
import webcast.im.SoundWareEffectExtra;

/* JADX INFO: renamed from: X.0a7c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C922820a7c {
    public static Long LIZ;
    public static Long LIZIZ;

    public static String LIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return "use_audio_ring";
            }
            if (num.intValue() == 2) {
                return "activity_re_entrance";
            }
            if (num.intValue() == 3) {
                return "remove_audio_ring";
            }
            if (num.intValue() == 4) {
                return "activity_first_entrance";
            }
            return "";
        }
        return "";
    }

    public static void LIZIZ(String str) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("action_type", str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_enter_audio_ring");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(SoundWareEffectExtra soundWareEffectExtra) {
        long j;
        Long l;
        long jLongValue;
        Object obj;
        if (soundWareEffectExtra != null) {
            j = soundWareEffectExtra.rightId;
        } else {
            j = 0;
        }
        Long l2 = LIZ;
        if (l2 == null || l2.longValue() != j) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long l3 = LIZ;
            String str = "anchor";
            if (l3 != null && l3.longValue() != 0 && (l = LIZIZ) != null) {
                long jLongValue2 = jCurrentTimeMillis - l.longValue();
                Long l4 = LIZ;
                if (l4 != null) {
                    jLongValue = l4.longValue();
                } else {
                    jLongValue = 0;
                }
                HashMap map = new HashMap();
                C01Z4.LIZ(null, map);
                if (C930540aK4.LIZJ()) {
                    obj = "anchor";
                } else {
                    obj = "guest";
                }
                map.put("user_type", obj);
                map.put("audio_ring_id", String.valueOf(jLongValue));
                map.put("duration", String.valueOf(jLongValue2));
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_audio_ring_apply_over");
                c474500IjALIZ.LJJIIZI(map);
                c474500IjALIZ.LIZ();
            }
            if (j != 0) {
                HashMap map2 = new HashMap();
                C01Z4.LIZ(null, map2);
                if (!C930540aK4.LIZJ()) {
                    str = "guest";
                }
                map2.put("user_type", str);
                map2.put("audio_ring_id", String.valueOf(j));
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_multi_audio_ring_apply");
                c474500IjALIZ2.LJJIIZI(map2);
                c474500IjALIZ2.LIZ();
            }
            LIZIZ = Long.valueOf(jCurrentTimeMillis);
            LIZ = Long.valueOf(j);
        }
    }

    public static void LJ(long j, String str) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("guest_id", String.valueOf(j));
        map.put("action_type", str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_guest_enter_audio_ring");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(String str, Long l, long j, String str2) {
        String str3;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        if (C930540aK4.LIZJ()) {
            str3 = "anchor";
        } else {
            str3 = "guest";
        }
        map.put("user_type", str3);
        map.put("icon_type", str);
        map.put("page_type", "audio_ring_choose");
        map.put("audio_ring_id", String.valueOf(j));
        if (l != null) {
            map.put("end_audio_ring_id", String.valueOf(l.longValue()));
        }
        map.put("action_type", str2);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_audio_ring_choose_icon_all");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }
}
