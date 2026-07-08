package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0osq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490260osq {
    public static volatile C1490260osq LIZIZ;
    public final List<String> LIZ = new CopyOnWriteArrayList();

    public static C1490260osq LIZ() {
        if (LIZIZ == null) {
            synchronized (C1490260osq.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C1490260osq();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }
}
