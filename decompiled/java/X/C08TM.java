package X;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.08TM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08TM {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static final Lock LIZJ = new ReentrantLock();

    public static boolean LIZ() {
        Lock lock;
        try {
            try {
                lock = LIZJ;
                ((ReentrantLock) lock).lock();
                if (!LIZIZ) {
                    LoadSoLancet.LIZJ("ttcrypto");
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    Librarian.LJFF("ttcrypto");
                    LoadSoLancet.LJ(jUptimeMillis, "ttcrypto");
                    LoadSoLancet.LIZLLL(jUptimeMillis, "ttcrypto");
                    LoadSoLancet.LIZIZ("ttcrypto");
                    LIZIZ = true;
                }
                if (!LIZ) {
                    LoadSoLancet.LIZJ("ttboringssl");
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    Librarian.LJFF("ttboringssl");
                    LoadSoLancet.LJ(jUptimeMillis2, "ttboringssl");
                    LoadSoLancet.LIZLLL(jUptimeMillis2, "ttboringssl");
                    LoadSoLancet.LIZIZ("ttboringssl");
                    LIZ = true;
                }
            } catch (Error e) {
                TryCatchGuardChecker.doCheck(e);
                lock = LIZJ;
            }
            ((ReentrantLock) lock).unlock();
            return LIZ && LIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantLock) LIZJ).unlock();
            throw th;
        }
    }
}
