package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: X.08IQ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08IQ {
    public static void LIZ(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            C1553130qWF.LIZJ("gecko-debug-tag", "close:", e);
        }
    }
}
