package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.13TT, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13TT {
    public final Map<String, C13TW> LIZ = new HashMap();
    public final C13TU LIZIZ = new C13TU();

    public final void LIZ(String str) {
        String strValueOf;
        int i;
        synchronized (this) {
            try {
                C13TW c13tw = (C13TW) ((HashMap) this.LIZ).get(str);
                if (c13tw != null && (i = c13tw.LIZIZ) >= 1) {
                    int i2 = i - 1;
                    c13tw.LIZIZ = i2;
                    if (i2 == 0) {
                        C13TW c13tw2 = (C13TW) ((HashMap) this.LIZ).remove(str);
                        if (!c13tw2.equals(c13tw)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Removed the wrong lock, expected to remove: ");
                            sbLIZ.append(c13tw);
                            sbLIZ.append(", but actually removed: ");
                            sbLIZ.append(c13tw2);
                            sbLIZ.append(", safeKey: ");
                            sbLIZ.append(str);
                            C355090Dw3.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                            return;
                        }
                        this.LIZIZ.LIZIZ(c13tw2);
                    }
                    ((ReentrantLock) c13tw.LIZ).unlock();
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Cannot release a lock that is not held, safeKey: ");
                sbLIZ2.append(str);
                sbLIZ2.append(", interestedThreads: ");
                sbLIZ2.append(c13tw);
                if (C2188811AlT.LIZIZ(sbLIZ2) == null) {
                    strValueOf = "null";
                } else {
                    strValueOf = String.valueOf(c13tw.LIZIZ);
                }
                C355090Dw3.LIZLLL("DiskCacheWriteLocker", strValueOf);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
