package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* JADX INFO: renamed from: X.08Q9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08Q9 {
    public final FileChannel LIZ;
    public final FileLock LIZIZ;

    public final void LIZJ() {
        try {
            this.LIZIZ.release();
            this.LIZ.close();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static File LIZ(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C08Q9 LIZIZ(android.content.Context r4) {
        /*
            java.lang.String r1 = "generatefid.lock"
            r3 = 0
            X.0VSJ r2 = new X.0VSJ     // Catch: java.lang.Error -> L2c java.io.IOException -> L2e java.nio.channels.OverlappingFileLockException -> L30
            java.io.File r0 = LIZ(r4)     // Catch: java.lang.Error -> L2c java.io.IOException -> L2e java.nio.channels.OverlappingFileLockException -> L30
            r2.<init>(r0, r1)     // Catch: java.lang.Error -> L2c java.io.IOException -> L2e java.nio.channels.OverlappingFileLockException -> L30
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Error -> L2c java.io.IOException -> L2e java.nio.channels.OverlappingFileLockException -> L30
            java.lang.String r0 = "rw"
            r1.<init>(r2, r0)     // Catch: java.lang.Error -> L2c java.io.IOException -> L2e java.nio.channels.OverlappingFileLockException -> L30
            java.nio.channels.FileChannel r2 = r1.getChannel()     // Catch: java.lang.Error -> L2c java.io.IOException -> L2e java.nio.channels.OverlappingFileLockException -> L30
            java.nio.channels.FileLock r1 = r2.lock()     // Catch: java.lang.Error -> L25 java.io.IOException -> L27 java.nio.channels.OverlappingFileLockException -> L29
            X.08Q9 r0 = new X.08Q9     // Catch: java.lang.Error -> L21 java.io.IOException -> L23 java.nio.channels.OverlappingFileLockException -> L34
            r0.<init>(r2, r1)     // Catch: java.lang.Error -> L21 java.io.IOException -> L23 java.nio.channels.OverlappingFileLockException -> L34
            return r0
        L21:
            r0 = move-exception
            goto L35
        L23:
            r0 = move-exception
            goto L35
        L25:
            r0 = move-exception
            goto L2a
        L27:
            r0 = move-exception
            goto L2a
        L29:
            r0 = move-exception
        L2a:
            r1 = r3
            goto L35
        L2c:
            r0 = move-exception
            goto L31
        L2e:
            r0 = move-exception
            goto L31
        L30:
            r0 = move-exception
        L31:
            r2 = r3
            r1 = r3
            goto L35
        L34:
            r0 = move-exception
        L35:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            if (r1 == 0) goto L42
            r1.release()     // Catch: java.io.IOException -> L3e
            goto L42
        L3e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L42:
            if (r2 == 0) goto L4c
            r2.close()     // Catch: java.io.IOException -> L48
            return r3
        L48:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08Q9.LIZIZ(android.content.Context):X.08Q9");
    }

    public C08Q9(FileChannel fileChannel, FileLock fileLock) {
        this.LIZ = fileChannel;
        this.LIZIZ = fileLock;
    }
}
