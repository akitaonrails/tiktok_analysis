package X;

import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.0Vy8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C815020Vy8 {
    public static int LIZ = 3;
    public static int LIZIZ = 3;
    public static int LIZJ = 3;
    public static int LIZLLL = 3;

    public static boolean LIZ() {
        int i = LIZ;
        if (i != 3) {
            return i == 1;
        }
        String str = Build.MANUFACTURER;
        int i2 = (TextUtils.isEmpty(str) || !str.contains("HUAWEI")) ? 2 : 1;
        LIZ = i2;
        return i2 == 1;
    }

    public static boolean LIZIZ() {
        int i = LIZLLL;
        if (i != 3) {
            return i == 1;
        }
        int i2 = !TextUtils.isEmpty(C1967507nF.LIZ().LIZIZ("ro.smartisan.version")) ? 1 : 2;
        LIZLLL = i2;
        return i2 == 1;
    }

    public static boolean LIZJ() {
        int i = LIZJ;
        if (i != 3) {
            return i == 1;
        }
        String strLIZIZ = C1967507nF.LIZ().LIZIZ("ro.vivo.os.name");
        int i2 = (TextUtils.isEmpty(strLIZIZ) || !strLIZIZ.toLowerCase().contains("funtouch")) ? 2 : 1;
        LIZJ = i2;
        return i2 == 1;
    }
}
