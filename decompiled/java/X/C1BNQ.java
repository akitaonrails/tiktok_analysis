package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.1BNQ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BNQ {
    public final InputStream LIZIZ;
    public final C1BNS LIZ = new C1BNS();
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final AtomicInteger LIZLLL = new AtomicInteger(0);

    public final void LIZ() {
        if (this.LIZJ.get()) {
            return;
        }
        int iLIZ = this.LIZ.LIZ();
        synchronized (this.LIZIZ) {
            try {
                if (iLIZ < this.LIZ.LIZ()) {
                    return;
                }
                int iAvailable = this.LIZIZ.available();
                if (iAvailable < 2) {
                    iAvailable = 1024;
                }
                byte[] bArr = new byte[Math.min(iAvailable, 1024)];
                while (true) {
                    int i = this.LIZIZ.read(bArr);
                    if (i == -1) {
                        this.LIZJ.set(true);
                        break;
                    } else {
                        this.LIZ.LIZIZ(i, bArr);
                        if (i != 0) {
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1BNQ(C19967313Ap c19967313Ap) {
        this.LIZIZ = c19967313Ap;
    }
}
