package X;

import Y.ARunnableS103S0100000_3;
import android.os.Process;
import android.util.Pair;
import com.bytedance.geckox.utils.FileLock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.08nM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2223008nM {
    public static final Map<String, Pair<FileLock, AtomicLong>> LIZ = new HashMap();

    public static boolean LIZ(String str) {
        Map<String, Pair<FileLock, AtomicLong>> map = LIZ;
        synchronized (map) {
            try {
                FileLock fileLockLJ = FileLock.LJ(str);
                if (fileLockLJ == null) {
                    return false;
                }
                Pair pair = (Pair) ((HashMap) map).get(str);
                if (pair != null && ((AtomicLong) pair.second).get() != 0) {
                    fileLockLJ.LJI();
                    FileLock.LIZJ(Process.myPid(), str);
                    return false;
                }
                File parentFile = new C0VSJ(str).getParentFile();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(parentFile.getAbsolutePath());
                sbLIZ.append("--pending-delete");
                C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                boolean zRenameTo = parentFile.renameTo(c0vsj);
                fileLockLJ.LJI();
                fileLockLJ.LIZLLL();
                if (zRenameTo) {
                    ExecutorC1550590qS9.LIZ().execute(new ARunnableS103S0100000_3(c0vsj, 65));
                }
                return zRenameTo;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZIZ(String str) {
        Map<String, Pair<FileLock, AtomicLong>> map = LIZ;
        synchronized (map) {
            try {
                Pair pair = (Pair) ((HashMap) map).get(str);
                if (pair == null) {
                    pair = new Pair(FileLock.LIZJ(Process.myPid(), str), new AtomicLong(0L));
                    ((HashMap) map).put(str, pair);
                }
                ((AtomicLong) pair.second).incrementAndGet();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZJ(String str) {
        Map<String, Pair<FileLock, AtomicLong>> map = LIZ;
        synchronized (map) {
            try {
                Pair pair = (Pair) ((HashMap) map).get(str);
                if (pair != null) {
                    long jDecrementAndGet = ((AtomicLong) pair.second).decrementAndGet();
                    if (jDecrementAndGet >= 0) {
                        if (jDecrementAndGet == 0) {
                            ((FileLock) pair.first).LJI();
                            ((HashMap) map).remove(str);
                        }
                    } else {
                        throw new RuntimeException("using.lock count illegal");
                    }
                } else {
                    throw new RuntimeException("using.lock illegal state");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
