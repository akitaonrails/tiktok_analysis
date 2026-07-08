package X;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.wifi.WifiInfo;
import java.io.File;

/* JADX INFO: renamed from: X.0Ut6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C786420Ut6 {
    public static volatile ApplicationInfo LIZ = null;
    public static volatile PackageInfo LIZIZ = null;
    public static volatile ApplicationInfo LIZJ = null;
    public static volatile PackageInfo LIZLLL = null;
    public static volatile PackageInfo LJ = null;
    public static volatile PackageInfo LJFF = null;
    public static volatile int LJI = -1;
    public static long LJII = -1;
    public static int LJIIIIZZ = -1;
    public static boolean LJIIIZ = false;
    public static volatile WifiInfo LJIIJ = null;
    public static long LJIIJJI = -1;
    public static int LJIIL = -1;
    public static volatile int LJIILIIL;
    public static volatile int LJIILJJIL;
    public static volatile int LJIILL;
    public static volatile int LJIILLIIL;
    public static File LJIIZILJ;
    public static String LJIJ;

    public static boolean LIZ() {
        if (LJIIIIZZ <= 0 || System.currentTimeMillis() - LJII <= LJIIIIZZ) {
            return false;
        }
        LJII = System.currentTimeMillis();
        return true;
    }
}
