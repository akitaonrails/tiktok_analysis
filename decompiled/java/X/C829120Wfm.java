package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: renamed from: X.0Wfm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829120Wfm {
    public static Boolean LIZ;
    public static Boolean LIZIZ;
    public static Boolean LIZJ;
    public static Boolean LIZLLL;

    public static boolean LIZ(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (LIZ == null) {
            LIZ = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (!LIZ.booleanValue()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            if (LIZIZ == null) {
                LIZIZ = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            }
            if (!LIZIZ.booleanValue() || C811660Vsi.LIZ()) {
                return false;
            }
            return true;
        }
        return true;
    }
}
