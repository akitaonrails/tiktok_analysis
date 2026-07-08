package X;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: renamed from: X.0kwX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1338790kwX {
    public static final C1338790kwX LIZ = new C1338790kwX();

    public static final int LIZ(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        if (((java.lang.Boolean) r2).booleanValue() != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZIZ(android.content.Context r8) {
        /*
            java.lang.String r4 = "android"
            r3 = 0
            r7 = 0
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r6 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L34
            java.lang.String r2 = "get"
            r5 = 1
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L34
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1[r7] = r0     // Catch: java.lang.Exception -> L34
            java.lang.reflect.Method r2 = r6.getMethod(r2, r1)     // Catch: java.lang.Exception -> L34
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L34
            java.lang.String r0 = "qemu.hw.mainkeys"
            r1[r7] = r0     // Catch: java.lang.Exception -> L34
            java.lang.Object r1 = r2.invoke(r6, r1)     // Catch: java.lang.Exception -> L34
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L34
            java.lang.String r0 = "1"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)     // Catch: java.lang.Exception -> L34
            if (r0 != 0) goto L7b
            java.lang.String r0 = "0"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)     // Catch: java.lang.Exception -> L34
            if (r0 == 0) goto L38
            goto L7c
        L34:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L38:
            if (r8 == 0) goto L4d
            android.content.res.Resources r2 = r8.getResources()
            if (r2 == 0) goto L4e
            java.lang.String r1 = "bool"
            java.lang.String r0 = "config_showNavigationBar"
            int r0 = X.C786410Ut5.n3(r2, r0, r1, r4)
        L48:
            if (r0 <= 0) goto L50
            if (r2 == 0) goto L50
            goto L52
        L4d:
            r2 = r3
        L4e:
            r0 = 0
            goto L48
        L50:
            r0 = 0
            goto L56
        L52:
            boolean r0 = r2.getBoolean(r0)     // Catch: java.lang.Throwable -> L5e
        L56:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L5e
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L5e
            goto L6a
        L5e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L6a:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r0 = X.C189200o6.m7isFailureimpl(r2)
            if (r0 == 0) goto L73
            r2 = r1
        L73:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            if (r0 != 0) goto L7c
        L7b:
            return r7
        L7c:
            if (r8 == 0) goto L91
            android.content.res.Resources r3 = r8.getResources()
            if (r3 == 0) goto L91
            java.lang.String r1 = "navigation_bar_height"
            java.lang.String r0 = "dimen"
            int r0 = X.C786410Ut5.n3(r3, r1, r0, r4)
        L8c:
            if (r0 <= 0) goto L93
            if (r3 == 0) goto L93
            goto L95
        L91:
            r0 = 0
            goto L8c
        L93:
            r0 = 0
            goto L99
        L95:
            int r0 = r3.getDimensionPixelSize(r0)     // Catch: java.lang.Throwable -> La1
        L99:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> La1
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> La1
            goto Lad
        La1:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        Lad:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            boolean r0 = X.C189200o6.m7isFailureimpl(r2)
            if (r0 == 0) goto Lb8
            r2 = r1
        Lb8:
            java.lang.Number r2 = (java.lang.Number) r2
            int r0 = r2.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1338790kwX.LIZIZ(android.content.Context):int");
    }

    public static DisplayMetrics LIZJ(Window window) {
        Display displayLLILZIL;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = window.getWindowManager();
        if (windowManager != null && (displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyIfx2bdbg6SZhbnK5zT7ydvsuy1MjqrbbyGsVDOD4=", null))) != null) {
            displayLLILZIL.getRealMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    public static final int LIZLLL(Window window) {
        Activity activityLIZ;
        if (window != null || ((activityLIZ = C01CR.LIZ()) != null && (window = activityLIZ.getWindow()) != null)) {
            LIZ.getClass();
            return LIZJ(window).heightPixels;
        }
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static final int LJ(Window window) {
        Activity activityLIZ;
        if (window != null || ((activityLIZ = C01CR.LIZ()) != null && (window = activityLIZ.getWindow()) != null)) {
            LIZ.getClass();
            return LIZJ(window).widthPixels;
        }
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }
}
