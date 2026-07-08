package X;

import android.app.Activity;
import android.os.Build;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0mG4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1389340mG4 {
    public static WeakReference<Activity> LIZIZ;
    public static volatile C1389350mG5 LIZLLL;
    public static volatile C1389350mG5 LJ;
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1351970lHn());
    public static int LIZJ = -1;

    public static C1389350mG5 LIZIZ() {
        C1389350mG5 c1389350mG5 = LIZLLL;
        return (c1389350mG5 == null || c1389350mG5.LIZ != LIZJ) ? LIZJ(null, null) : LIZLLL;
    }

    public static int LIZLLL() {
        C1389350mG5 c1389350mG5LIZIZ = LIZIZ();
        return Math.max(c1389350mG5LIZIZ.LIZIZ(), c1389350mG5LIZIZ.LIZ() + (Build.VERSION.SDK_INT >= 35 ? 0 : ((Number) LIZ.getValue()).intValue()));
    }

    public static int LJ() {
        C1389350mG5 c1389350mG5LIZIZ = LIZIZ();
        return Math.min(c1389350mG5LIZIZ.LIZIZ(), c1389350mG5LIZIZ.LIZ() + (Build.VERSION.SDK_INT >= 35 ? 0 : ((Number) LIZ.getValue()).intValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.app.Activity r8, android.content.res.Configuration r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            if (r9 == 0) goto L92
            int r0 = r9.screenWidthDp
            double r0 = (double) r0
            int r7 = X.C341940Daq.LIZ(r0)
            int r0 = r9.screenHeightDp
            double r0 = (double) r0
            int r6 = X.C341940Daq.LIZ(r0)
        L18:
            r5 = 0
            if (r9 == 0) goto L73
            int r1 = r9.orientation
            r0 = 2
            if (r1 != r0) goto L7a
            r4 = 1
        L21:
            X.0mG5 r0 = X.C1389340mG4.LIZLLL
            if (r0 == 0) goto L3d
            X.0mG5 r2 = X.C1389340mG4.LIZLLL
            if (r2 == 0) goto L70
            int r1 = r8.hashCode()
            int r0 = r2.LIZ
            if (r0 != r1) goto L3d
            int r0 = r2.LIZIZ
            if (r0 != r7) goto L3d
            int r0 = r2.LIZJ
            if (r0 != r6) goto L3d
            boolean r0 = r2.LJFF
            if (r0 == r4) goto L70
        L3d:
            X.0mG5 r0 = X.C1389340mG4.LIZLLL
            if (r0 != 0) goto L48
            X.0mG5 r0 = new X.0mG5
            r0.<init>()
            X.C1389340mG4.LIZLLL = r0
        L48:
            X.0mG5 r3 = X.C1389340mG4.LIZLLL
            if (r3 == 0) goto L70
            int r2 = r8.hashCode()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L71
            boolean r0 = r8.isInMultiWindowMode()
            boolean r5 = r8.isInPictureInPictureMode()
        L5e:
            r3.LIZ = r2
            r3.LIZIZ = r7
            r3.LIZJ = r6
            r3.LJFF = r4
            r3.LJI = r0
            r3.LJII = r5
            r0 = -120(0xffffffffffffff88, float:NaN)
            r3.LIZLLL = r0
            r3.LJ = r0
        L70:
            return
        L71:
            r0 = 0
            goto L5e
        L73:
            boolean r4 = X.C0SXG.LIZ(r8)
            if (r4 == 0) goto L7a
            goto L21
        L7a:
            if (r7 <= r6) goto L8d
            r2 = r6
            r0 = r7
        L7e:
            float r1 = (float) r0
            float r0 = (float) r2
            float r1 = r1 / r0
            double r3 = (double) r1
            r1 = 4608533498688228557(0x3ff4cccccccccccd, double:1.3)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L90
            r4 = 1
            goto L21
        L8d:
            r0 = r6
            r2 = r7
            goto L7e
        L90:
            r4 = 0
            goto L21
        L92:
            int r7 = r0.widthPixels
            int r6 = r0.heightPixels
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1389340mG4.LIZ(android.app.Activity, android.content.res.Configuration):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1389350mG5 LIZJ(android.content.Context r8, android.content.res.Configuration r9) {
        /*
            if (r8 == 0) goto L10
            boolean r0 = r8 instanceof android.app.Activity
            if (r0 == 0) goto L10
            android.app.Activity r8 = (android.app.Activity) r8
        L8:
            if (r8 == 0) goto L1b
            LIZ(r8, r9)
            X.0mG5 r0 = X.C1389340mG4.LIZLLL
            return r0
        L10:
            java.lang.ref.WeakReference<android.app.Activity> r0 = X.C1389340mG4.LIZIZ
            if (r0 == 0) goto L1b
            java.lang.Object r8 = r0.get()
            android.app.Activity r8 = (android.app.Activity) r8
            goto L8
        L1b:
            X.0mG5 r0 = X.C1389340mG4.LIZLLL
            if (r0 == 0) goto L22
            X.0mG5 r0 = X.C1389340mG4.LIZLLL
            return r0
        L22:
            X.0mG5 r0 = X.C1389340mG4.LJ
            r9 = 1
            r8 = -120(0xffffffffffffff88, float:NaN)
            r7 = 0
            if (r0 == 0) goto L47
            X.0mG6 r0 = X.C1389360mG6.LIZ
            r0.getClass()
            X.01GW r0 = X.C1389360mG6.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r0 = r0 & 1
            if (r0 == r9) goto La3
            X.0mG5 r0 = X.C1389340mG4.LJ
            if (r0 == 0) goto La3
            int r0 = r0.LIZ
            if (r0 != r8) goto La3
        L47:
            X.1Bky r1 = X.C2213981Bky.LIZIZ
            android.content.Context r0 = r1.getApplicationContext()
            int[] r0 = X.C14KQ.LIZ(r0)
            r6 = r0[r7]
            r5 = r0[r9]
            r0 = -1
            if (r6 == r0) goto La0
            if (r5 == r0) goto La0
            android.content.Context r0 = r1.getApplicationContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.orientation
            r0 = 2
            if (r1 != r0) goto L8a
            r9 = 1
        L6c:
            X.0mG5 r0 = new X.0mG5
            r0.<init>()
            X.C1389340mG4.LJ = r0
            X.0mG5 r0 = X.C1389340mG4.LJ
            if (r0 == 0) goto L87
            r0.LIZ = r8
            r0.LIZIZ = r6
            r0.LIZJ = r5
            r0.LJFF = r9
            r0.LJI = r7
            r0.LJII = r7
            r0.LIZLLL = r8
            r0.LJ = r8
        L87:
            X.0mG5 r0 = X.C1389340mG4.LJ
            return r0
        L8a:
            if (r6 <= r5) goto L9d
            r2 = r5
            r0 = r6
        L8e:
            float r1 = (float) r0
            float r0 = (float) r2
            float r1 = r1 / r0
            double r3 = (double) r1
            r1 = 4608533498688228557(0x3ff4cccccccccccd, double:1.3)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L6c
            r9 = 0
            goto L6c
        L9d:
            r0 = r5
            r2 = r6
            goto L8e
        La0:
            X.0mG5 r0 = X.C1389350mG5.LJIIIIZZ
            return r0
        La3:
            X.0mG5 r0 = X.C1389340mG4.LJ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1389340mG4.LIZJ(android.content.Context, android.content.res.Configuration):X.0mG5");
    }
}
