package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.08Kn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2099908Kn {
    public static final Map<String, Lock> LJ = new HashMap();
    public final File LIZ;
    public final Lock LIZIZ;
    public final boolean LIZJ;
    public FileChannel LIZLLL;

    public final void LIZ() {
        FileChannel fileChannel = this.LIZLLL;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LIZIZ.unlock();
    }

    public C2099908Kn(File file, String str, boolean z) {
        Lock reentrantLock;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(".lck");
        File file2 = new File(file, C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ = file2;
        String absolutePath = file2.getAbsolutePath();
        Map<String, Lock> map = LJ;
        synchronized (map) {
            try {
                reentrantLock = (Lock) ((HashMap) map).get(absolutePath);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    ((HashMap) map).put(absolutePath, reentrantLock);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LIZIZ = reentrantLock;
        this.LIZJ = z;
    }
}
