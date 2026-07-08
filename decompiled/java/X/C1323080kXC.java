package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: X.0kXC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323080kXC {
    public static final Logger LIZ = Logger.getLogger(C1323080kXC.class.getName());

    public static void LIZ(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            LIZ.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e);
        }
    }

    public static void LIZIZ(InputStream inputStream) {
        try {
            LIZ(inputStream);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError(e);
        }
    }
}
