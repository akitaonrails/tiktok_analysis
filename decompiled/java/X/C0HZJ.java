package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0HZJ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HZJ {
    public static C0TGX LIZ(C19EG c19eg) {
        C19EG c19eg2;
        WeakReference<C19EG> weakReference = C0TGX.LLILLJJLI;
        if (weakReference == null || (c19eg2 = weakReference.get()) == null || c19eg2.isDestroyed()) {
            C0TGX.LLILLJJLI = new WeakReference<>(c19eg);
        }
        C0TGX c0tgx = C0TGX.LLILLL;
        if (c0tgx == null) {
            synchronized (C13LE.LIZ(C0TGX.class)) {
                try {
                    c0tgx = C0TGX.LLILLL;
                    if (c0tgx == null) {
                        c0tgx = new C0TGX();
                        C0TGX.LLILLL = c0tgx;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return c0tgx;
    }
}
