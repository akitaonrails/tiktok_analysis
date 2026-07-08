package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: X.08Y7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08Y7 {
    public static C08Y8 LIZ;
    public static Integer LIZIZ;

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
