package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.08Km, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2099808Km {
    public static final Map<String, Lock> LIZJ = new HashMap();
    public final C0VSJ LIZ;
    public final Lock LIZIZ;

    public final void LIZ() {
        this.LIZIZ.unlock();
    }

    public C2099808Km(File file) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sync_sdk");
        sbLIZ.append(".lck");
        C0VSJ c0vsj = new C0VSJ(file, C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ = c0vsj;
        if (!c0vsj.exists()) {
            try {
                c0vsj.createNewFile();
            } catch (Throwable th) {
            }
        }
        if (this.LIZ.exists()) {
            Map<String, Lock> map = LIZJ;
            synchronized (map) {
                try {
                    String absolutePath = this.LIZ.getAbsolutePath();
                    Lock reentrantLock = (Lock) ((HashMap) map).get(absolutePath);
                    if (reentrantLock == null) {
                        reentrantLock = new ReentrantLock();
                        ((HashMap) map).put(absolutePath, reentrantLock);
                    }
                    this.LIZIZ = reentrantLock;
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            return;
        }
        this.LIZIZ = null;
    }
}
