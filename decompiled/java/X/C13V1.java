package X;

import android.app.Application;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13V1, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13V1 {
    public final C13V8 LIZ(Application application) {
        C13V8 c13v8 = C13V8.LJFF;
        if (c13v8 == null) {
            synchronized (this) {
                try {
                    c13v8 = C13V8.LJFF;
                    if (c13v8 == null) {
                        c13v8 = new C13V8(application);
                        C13V8.LJFF = c13v8;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return c13v8;
    }
}
