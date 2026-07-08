package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;

/* JADX INFO: renamed from: X.0jvZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1299750jvZ {
    public volatile boolean LIZ;
    public final String LIZIZ;

    public final boolean LIZ() {
        synchronized (this) {
            try {
                if (!this.LIZ) {
                    this.LIZ = true;
                    return true;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Illegal callback invocation from native. The loaded callback can only be invoked once! The url is ");
                sbLIZ.append(this.LIZIZ);
                LynxLog.e("LynxResourceLoader", C2188811AlT.LIZIZ(sbLIZ));
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public AbstractC1299750jvZ(String str) {
        this.LIZIZ = str;
    }
}
