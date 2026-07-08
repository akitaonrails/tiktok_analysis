package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0XJA, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XJA {
    public static C0XF2 LIZ;
    public static C0XF2 LIZIZ;

    public static boolean LIZ(Context context) {
        C0XF2 c0xf2 = LIZ;
        if (c0xf2 == null || c0xf2 == C0XF2.NONE) {
            LIZ = C0XF1.LIZ(context);
        }
        if (LIZ == C0XF2.WIFI) {
            return true;
        }
        return false;
    }
}
