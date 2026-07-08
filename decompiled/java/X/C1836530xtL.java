package X;

import android.os.Build;

/* JADX INFO: renamed from: X.0xtL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836530xtL {
    public static boolean LIZIZ(int i) {
        return (i & 32768) != 0;
    }

    public static boolean LIZJ(int i) {
        if (i == 15 || i == 255) {
            return true;
        }
        if (i != 32768) {
            if (i != 32783) {
                if (i == 33023 || i == 0) {
                    return true;
                }
                return false;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 28 || i2 > 29) {
                return true;
            }
            return false;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    public static int LIZ(C1836540xtM c1836540xtM, C14BY c14by) {
        int i = c1836540xtM.LIZLLL;
        if (i == 0) {
            if (c14by != null) {
                return 15;
            }
            return 255;
        }
        return i;
    }
}
