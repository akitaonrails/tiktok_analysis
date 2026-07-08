package X;

import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.14KR, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14KR {
    public static int LIZ = -1;
    public static Point LIZIZ;
    public static WeakReference<Display> LIZJ;
    public static boolean LIZLLL;

    public static void LIZ() {
        LIZ = -1;
        LIZIZ = null;
        LIZJ = null;
    }

    public static boolean LIZIZ() {
        return LIZLLL && Build.VERSION.SDK_INT < 30;
    }
}
