package X;

import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.086w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20644086w {
    public static int LIZ = 3;
    public static int LIZIZ = 3;
    public static int LIZJ = 3;

    public static boolean LIZ() {
        int i = LIZ;
        if (i != 3) {
            return i == 1;
        }
        String str = Build.BRAND;
        int i2 = (TextUtils.isEmpty(str) || !str.toLowerCase().contains("oppo")) ? 2 : 1;
        LIZ = i2;
        return i2 == 1;
    }

    public static boolean LIZIZ() {
        int i = LIZJ;
        if (i != 3) {
            return i == 1;
        }
        String str = Build.BRAND;
        int i2 = (TextUtils.isEmpty(str) || !str.toLowerCase().contains("samsung")) ? 2 : 1;
        LIZJ = i2;
        return i2 == 1;
    }

    public static boolean LIZJ() {
        int i = LIZIZ;
        if (i != 3) {
            return i == 1;
        }
        String str = Build.HARDWARE;
        int i2 = (TextUtils.isEmpty(str) || !(str.toLowerCase().contains("hi") || str.toLowerCase().contains("kirin"))) ? 2 : 1;
        LIZIZ = i2;
        return i2 == 1;
    }
}
