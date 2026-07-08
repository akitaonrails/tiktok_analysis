package X;

import android.content.Context;
import android.os.Environment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: renamed from: X.0VIk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795480VIk {
    public static C0W1V LIZ;

    public static void LIZJ() {
        if (((Boolean) C282290B4p.LIZ.getValue()).booleanValue()) {
            LIZLLL();
            return;
        }
        try {
            if (LIZ == null) {
                synchronized (C0W1V.class) {
                    try {
                        if (LIZ == null) {
                            C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
                            C0VSJ c0vsjLIZ = LIZ(c2213981Bky.getApplicationContext());
                            if (c0vsjLIZ.exists()) {
                                C2137908Zd.LIZJ.LIZLLL(c0vsjLIZ.getAbsolutePath());
                            }
                            LIZ = C0W1V.LJIIZILJ(c0vsjLIZ, (int) c2213981Bky.getVersionCode(), 52428800L);
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
        } catch (Exception th) {
        }
    }

    public static void LIZLLL() {
        try {
            if (LIZ == null) {
                synchronized (C795480VIk.class) {
                    try {
                        if (LIZ == null) {
                            C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
                            C0VSJ c0vsjLIZ = LIZ(c2213981Bky.getApplicationContext());
                            if (c0vsjLIZ.exists()) {
                                C2137908Zd.LIZJ.LIZLLL(c0vsjLIZ.getAbsolutePath());
                            }
                            LIZ = C0W1V.LJIIZILJ(c0vsjLIZ, (int) c2213981Bky.getVersionCode(), 52428800L);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static C0VSJ LIZ(Context context) {
        String path;
        if (("mounted".equals(C786410Ut5.X3()) || !Environment.isExternalStorageRemovable()) && C786410Ut5.x2(context) != null) {
            path = C786410Ut5.x2(context).getPath();
        } else {
            path = C786410Ut5.w2(context).getPath();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(path);
        sbLIZ.append(File.separator);
        sbLIZ.append("runnableCache");
        return new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:19:0x002f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static java.lang.Runnable LIZIZ(java.lang.String r3) {
        /*
            X.0W1V r0 = X.C795480VIk.LIZ
            r2 = 0
            if (r0 != 0) goto L6
            return r2
        L6:
            X.0W1X r0 = r0.LJIILL(r3)     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L2f
            java.io.InputStream[] r1 = r0.LL     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L2f
            r0 = 0
            r0 = r1[r0]     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L2f
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L2f
            r1.<init>(r0)     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L2f
            java.lang.Object r0 = r1.readObject()     // Catch: java.lang.Exception -> L1e java.lang.Throwable -> L29
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Exception -> L1e java.lang.Throwable -> L29
            X.C2260008tK.LIZ(r1)
            return r0
        L1e:
            r0 = move-exception
            goto L22
        L20:
            r0 = move-exception
            r1 = r2
        L22:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L29
            X.C2260008tK.LIZ(r1)
            return r2
        L29:
            r0 = move-exception
            r2 = r1
        L2b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r0 = move-exception
            goto L2b
        L31:
            X.C2260008tK.LIZ(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C795480VIk.LIZIZ(java.lang.String):java.lang.Runnable");
    }
}
