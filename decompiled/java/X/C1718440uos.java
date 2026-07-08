package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0uos, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1718440uos {
    public static volatile boolean LIZ;
    public static volatile int LIZJ;
    public static volatile long LJFF;
    public static volatile boolean LJII;
    public static volatile long LJIIIIZZ;
    public static volatile String LIZIZ = "";
    public static volatile String LIZLLL = "";
    public static volatile String LJ = "";
    public static final AtomicBoolean LJI = new AtomicBoolean(false);

    public static void LIZIZ() {
        LIZ = false;
        LIZIZ = "";
        LIZJ = 0;
        LIZLLL = "";
        LJ = "";
        LJFF = 0L;
        LJII = false;
    }

    public static boolean LIZJ() {
        return LIZ && LJIIIIZZ > 0 && System.currentTimeMillis() - LJIIIIZZ < 1800000;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(int r1, java.lang.String r2, java.lang.String r3) {
        /*
            X.C1718440uos.LIZIZ = r2
            X.C1718440uos.LIZJ = r1
            X.C1718440uos.LIZLLL = r3
            java.lang.String r0 = ""
            X.C1718440uos.LJ = r0
            long r0 = java.lang.System.currentTimeMillis()
            X.C1718440uos.LJIIIIZZ = r0
            boolean r0 = X.C1158360gFW.LIZ()
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L3d
            X.0gFW r0 = X.C1158360gFW.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.biz.ab.PipoPinManageVcConnectSettings$PipoPinManageVcConnectModel r0 = X.C1158360gFW.LIZIZ()
            if (r0 == 0) goto L2d
            java.lang.Boolean r0 = r0.enableFlowDuration
            if (r0 == 0) goto L2d
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3d
        L2d:
            long r0 = java.lang.System.currentTimeMillis()
        L31:
            X.C1718440uos.LJFF = r0
            X.C1718440uos.LJII = r2
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C1718440uos.LJI
            r0.set(r2)
            X.C1718440uos.LIZ = r3
            return
        L3d:
            r0 = 0
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1718440uos.LIZ(int, java.lang.String, java.lang.String):void");
    }
}
