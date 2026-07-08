package X;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* JADX INFO: renamed from: X.0WPw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C822900WPw {
    public static MappedByteBuffer LIZ;
    public static FileChannel LIZIZ;
    public static final Object LIZJ = new Object();
    public static boolean LIZLLL = true;
    public static long LJ = SystemClock.elapsedRealtime();
    public static Application LJFF;

    static {
        System.currentTimeMillis();
    }

    public static boolean LIZ() {
        Application application = LJFF;
        if (application == null) {
            return false;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(new C0VSJ(application.getFilesDir(), "foreground2.status"), "rw");
            LIZIZ = randomAccessFile.getChannel();
            LIZ = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_WRITE, 0L, 13L);
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C823280WRi.LIZLLL(th);
            return false;
        }
    }

    public static C0WQ0 LIZIZ() {
        if (LJFF != null && LIZ != null && !LIZLLL) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance > 100) {
                try {
                    C0WQ0 c0wq0LIZJ = LIZJ();
                    C2123608Tq c2123608Tq = C2123608Tq.LIZ;
                    int i = c0wq0LIZJ.LIZ;
                    c2123608Tq.getClass();
                    if (C2123608Tq.LIZ(i)) {
                        return c0wq0LIZJ;
                    }
                    LIZLLL(false);
                    return new C0WQ0(c0wq0LIZJ.LIZ, c0wq0LIZJ.LIZJ, false);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return new C0WQ0(Process.myPid(), LJ, LIZLLL);
                }
            }
        }
        return new C0WQ0(Process.myPid(), LJ, true);
    }

    public static C0WQ0 LIZJ() {
        if (LIZIZ == null || LIZ == null) {
            return new C0WQ0(Process.myPid(), LJ, LIZLLL);
        }
        try {
            synchronized (LIZJ) {
                try {
                    MappedByteBuffer mappedByteBuffer = LIZ;
                    if (!LIZIZ.isOpen() && !LIZ()) {
                        return new C0WQ0(Process.myPid(), LJ, LIZLLL);
                    }
                    FileLock fileLockLock = LIZIZ.lock();
                    try {
                        mappedByteBuffer.position(0);
                        C0WQ0 c0wq0 = new C0WQ0(mappedByteBuffer.getInt(), mappedByteBuffer.getLong(), mappedByteBuffer.get() == 1);
                        fileLockLock.release();
                        return c0wq0;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        fileLockLock.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C823280WRi.LIZLLL(e);
            return new C0WQ0(Process.myPid(), LJ, LIZLLL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:8:0x0013, B:10:0x001b, B:14:0x0023, B:16:0x002c, B:17:0x003f, B:18:0x0043, B:20:0x0050, B:22:0x005b), top: B:32:0x0013, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(boolean r6) {
        /*
            X.C822900WPw.LIZLLL = r6
            long r0 = android.os.SystemClock.elapsedRealtime()
            X.C822900WPw.LJ = r0
            java.nio.MappedByteBuffer r4 = X.C822900WPw.LIZ
            if (r4 == 0) goto L7d
            java.nio.channels.FileChannel r0 = X.C822900WPw.LIZIZ
            if (r0 == 0) goto L7d
            java.lang.Object r5 = X.C822900WPw.LIZJ     // Catch: java.lang.Throwable -> L76
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L76
            java.nio.channels.FileChannel r0 = X.C822900WPw.LIZIZ     // Catch: java.lang.Throwable -> L70
            boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L70
            if (r0 != 0) goto L23
            boolean r0 = LIZ()     // Catch: java.lang.Throwable -> L70
            if (r0 != 0) goto L23
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L76
            return
        L23:
            java.nio.channels.FileChannel r0 = X.C822900WPw.LIZIZ     // Catch: java.lang.Throwable -> L70
            java.nio.channels.FileLock r3 = r0.lock()     // Catch: java.lang.Throwable -> L70
            r2 = 0
            if (r6 == 0) goto L43
            r4.position(r2)     // Catch: java.lang.Throwable -> L70
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L70
            r4.putInt(r0)     // Catch: java.lang.Throwable -> L70
            r0 = 1
            r4.put(r0)     // Catch: java.lang.Throwable -> L70
            long r0 = X.C822900WPw.LJ     // Catch: java.lang.Throwable -> L70
            r4.putLong(r0)     // Catch: java.lang.Throwable -> L70
        L3f:
            r3.release()     // Catch: java.lang.Throwable -> L70
            goto L6e
        L43:
            r4.position(r2)     // Catch: java.lang.Throwable -> L70
            int r1 = r4.getInt()     // Catch: java.lang.Throwable -> L70
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L70
            if (r0 == r1) goto L5b
            X.08Tq r0 = X.C2123608Tq.LIZ     // Catch: java.lang.Throwable -> L70
            r0.getClass()     // Catch: java.lang.Throwable -> L70
            boolean r0 = X.C2123608Tq.LIZ(r1)     // Catch: java.lang.Throwable -> L70
            if (r0 != 0) goto L3f
        L5b:
            r4.position(r2)     // Catch: java.lang.Throwable -> L70
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L70
            r4.putInt(r0)     // Catch: java.lang.Throwable -> L70
            r4.put(r2)     // Catch: java.lang.Throwable -> L70
            long r0 = X.C822900WPw.LJ     // Catch: java.lang.Throwable -> L70
            r4.putLong(r0)     // Catch: java.lang.Throwable -> L70
            goto L3f
        L6e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L76
            return
        L70:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L70
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L76
            throw r0     // Catch: java.lang.Throwable -> L76
        L76:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C823280WRi.LIZLLL(r0)
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C822900WPw.LIZLLL(boolean):void");
    }
}
