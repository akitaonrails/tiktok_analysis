package X;

import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.0krA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1335460krA {
    public static C1335460krA LJII;
    public static final long LJIIIIZZ = TimeUnit.MINUTES.toMillis(2);
    public volatile StatFs LIZ;
    public volatile File LIZIZ;
    public volatile StatFs LIZJ;
    public volatile File LIZLLL;
    public long LJ;
    public final Lock LJFF = new ReentrantLock();
    public volatile boolean LJI;

    public final void LIZ() {
        if (!this.LJI || this.LIZLLL == null) {
            ((ReentrantLock) this.LJFF).lock();
            try {
                if (!this.LJI || this.LIZLLL == null) {
                    this.LIZIZ = Environment.getDataDirectory();
                    try {
                        this.LIZLLL = C786410Ut5.W3();
                    } catch (ArrayIndexOutOfBoundsException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1328570kg3.LJFF("StatFsHelper", "getExternalStorageDirectory return null");
                    }
                    this.LIZ = LIZIZ(this.LIZ, this.LIZIZ);
                    this.LIZJ = LIZIZ(this.LIZJ, this.LIZLLL);
                    this.LJ = SystemClock.uptimeMillis();
                    this.LJI = true;
                }
                ((ReentrantLock) this.LJFF).unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                ((ReentrantLock) this.LJFF).unlock();
                throw th;
            }
        }
    }

    public static StatFs LIZIZ(StatFs statFs, File file) throws Throwable {
        if (file != null && file.exists()) {
            try {
                if (statFs == null) {
                    return new StatFs(file.getAbsolutePath());
                }
                statFs.restat(file.getAbsolutePath());
                return statFs;
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1331420kke.LIZIZ(th);
                throw null;
            }
        }
        return null;
    }
}
