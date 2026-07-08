package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0UYk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C774160UYk {
    public static int LIZ = -1;
    public static int LIZIZ = -1;
    public static int LIZJ = -1;
    public static int LIZLLL = -1;
    public static float LJ = -1.0f;
    public static float LJFF = -1.0f;
    public static int LJI = -1;

    public static void LIZ(Map map) {
        int i = LIZ;
        if (i != -1) {
            ((ConcurrentHashMap) map).put("acu_num", String.valueOf(i));
        }
        int i2 = LIZIZ;
        if (i2 != -1) {
            ((ConcurrentHashMap) map).put("duration_after_live_take", String.valueOf(i2));
        }
        int i3 = LIZJ;
        if (i3 != -1) {
            ((ConcurrentHashMap) map).put("is_charging", String.valueOf(i3));
        }
        int i4 = LIZLLL;
        if (i4 != -1) {
            ((ConcurrentHashMap) map).put("battery_value", String.valueOf(i4));
        }
        float f = LJ;
        if (f != -1.0f) {
            ((ConcurrentHashMap) map).put("battery_usage_new", String.valueOf(f));
        }
        float f2 = LJFF;
        if (f2 != -1.0f) {
            ((ConcurrentHashMap) map).put("screen_brightness", String.valueOf(f2));
        }
        int i5 = LJI;
        if (i5 != -1) {
            ((ConcurrentHashMap) map).put("device_score", String.valueOf(i5));
        }
    }
}
