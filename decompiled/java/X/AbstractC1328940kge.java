package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: X.0kge, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1328940kge extends OutputStream {
    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        try {
            super.close();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            C1331420kke.LIZIZ(e);
            throw null;
        }
    }
}
