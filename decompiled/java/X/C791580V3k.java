package X;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.0V3k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791580V3k {
    public static volatile boolean LIZ = false;
    public static SharedPreferences LIZIZ = null;
    public static int LIZJ = 0;
    public static int LIZLLL = 0;
    public static long LJ = 16408;

    public static boolean LIZ(int i) {
        if ((i & LIZJ) != 0) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(int i, boolean z) {
        if (z) {
            LIZLLL = i | LIZLLL;
        } else {
            LIZLLL = (~i) & LIZLLL;
        }
    }
}
