package X;

import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.14Jb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20244114Jb extends C20245214Jm {
    public static Field LIZJ;
    public static boolean LIZLLL;
    public static Constructor<WindowInsets> LJ;
    public static boolean LJFF;
    public WindowInsets LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031 A[PHI: r4
      0x0031: PHI (r4v4 android.view.WindowInsets) = (r4v0 android.view.WindowInsets), (r4v1 android.view.WindowInsets), (r4v0 android.view.WindowInsets) binds: [B:9:0x001c, B:14:0x002e, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C20244114Jb() {
        /*
            r6 = this;
            r6.<init>()
            boolean r0 = X.C20244114Jb.LIZLLL
            r5 = 1
            if (r0 != 0) goto L19
            java.lang.Class<android.view.WindowInsets> r1 = android.view.WindowInsets.class
            java.lang.String r0 = "CONSUMED"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.ReflectiveOperationException -> L13
            X.C20244114Jb.LIZJ = r0     // Catch: java.lang.ReflectiveOperationException -> L13
            goto L17
        L13:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L17:
            X.C20244114Jb.LIZLLL = r5
        L19:
            java.lang.reflect.Field r0 = X.C20244114Jb.LIZJ
            r4 = 0
            if (r0 == 0) goto L31
            java.lang.Object r1 = r0.get(r4)     // Catch: java.lang.ReflectiveOperationException -> L2d
            android.view.WindowInsets r1 = (android.view.WindowInsets) r1     // Catch: java.lang.ReflectiveOperationException -> L2d
            if (r1 == 0) goto L31
            android.view.WindowInsets r0 = new android.view.WindowInsets     // Catch: java.lang.ReflectiveOperationException -> L2d
            r0.<init>(r1)     // Catch: java.lang.ReflectiveOperationException -> L2d
            r4 = r0
            goto L64
        L2d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L31:
            boolean r0 = X.C20244114Jb.LJFF
            r3 = 0
            if (r0 != 0) goto L4b
            java.lang.Class<android.view.WindowInsets> r2 = android.view.WindowInsets.class
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch: java.lang.ReflectiveOperationException -> L45
            java.lang.Class<android.graphics.Rect> r0 = android.graphics.Rect.class
            r1[r3] = r0     // Catch: java.lang.ReflectiveOperationException -> L45
            java.lang.reflect.Constructor r0 = r2.getConstructor(r1)     // Catch: java.lang.ReflectiveOperationException -> L45
            X.C20244114Jb.LJ = r0     // Catch: java.lang.ReflectiveOperationException -> L45
            goto L49
        L45:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L49:
            X.C20244114Jb.LJFF = r5
        L4b:
            java.lang.reflect.Constructor<android.view.WindowInsets> r2 = X.C20244114Jb.LJ
            if (r2 == 0) goto L64
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch: java.lang.ReflectiveOperationException -> L60
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch: java.lang.ReflectiveOperationException -> L60
            r0.<init>()     // Catch: java.lang.ReflectiveOperationException -> L60
            r1[r3] = r0     // Catch: java.lang.ReflectiveOperationException -> L60
            java.lang.Object r0 = r2.newInstance(r1)     // Catch: java.lang.ReflectiveOperationException -> L60
            android.view.WindowInsets r0 = (android.view.WindowInsets) r0     // Catch: java.lang.ReflectiveOperationException -> L60
            r4 = r0
            goto L64
        L60:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L64:
            r6.LIZIZ = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20244114Jb.<init>():void");
    }

    @Override // X.C20245214Jm
    public final C20244614Jg LIZIZ() {
        LIZ();
        C20244614Jg c20244614JgLIZLLL = C20244614Jg.LIZLLL(null, this.LIZIZ);
        c20244614JgLIZLLL.LIZ.LJIILJJIL(this.LIZ);
        c20244614JgLIZLLL.LIZ.LJIILLIIL(null);
        return c20244614JgLIZLLL;
    }

    public C20244114Jb(C20244614Jg c20244614Jg) {
        this.LIZIZ = c20244614Jg.LIZJ();
    }

    @Override // X.C20245214Jm
    public final void LJFF(C20244814Ji c20244814Ji) {
        WindowInsets windowInsets = this.LIZIZ;
        if (windowInsets != null) {
            this.LIZIZ = windowInsets.replaceSystemWindowInsets(c20244814Ji.LIZ, c20244814Ji.LIZIZ, c20244814Ji.LIZJ, c20244814Ji.LIZLLL);
        }
    }
}
