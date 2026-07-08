package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: X.0W4L, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W4L {
    public static void LIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
