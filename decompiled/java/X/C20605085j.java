package X;

import android.view.Choreographer;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.085j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20605085j {
    public static int LIZ = -1;
    public static boolean LIZIZ;
    public static boolean LIZJ;

    public static void LIZ() {
        if ((LIZ & 1) == 1) {
            Class<?> clsLIZ = C1959307lv.LIZ("android.app.Activity");
            C20609085n.LIZ = clsLIZ;
            Field fieldLIZJ = C1959307lv.LIZJ(clsLIZ, "mHandler");
            C20609085n.LIZIZ = fieldLIZJ;
            fieldLIZJ.setAccessible(true);
        }
        if ((LIZ & 2) == 2) {
            Method methodLIZLLL = C1959307lv.LIZLLL(View.class, "getViewRootImpl", new Class[0]);
            C20607085l.LIZ = methodLIZLLL;
            methodLIZLLL.setAccessible(true);
            Class<?> clsLIZ2 = C1959307lv.LIZ("android.view.ViewRootImpl");
            C20607085l.LIZIZ = clsLIZ2;
            Field fieldLIZJ2 = C1959307lv.LIZJ(clsLIZ2, "mHandler");
            C20607085l.LIZJ = fieldLIZJ2;
            fieldLIZJ2.setAccessible(true);
        }
        if ((LIZ & 4) == 4) {
            Field fieldLIZJ3 = C1959307lv.LIZJ(Choreographer.class, "mHandler");
            C20608085m.LIZ = fieldLIZJ3;
            fieldLIZJ3.setAccessible(true);
        }
        if ((LIZ & 8) == 8) {
            LIZJ = true;
        }
    }
}
