package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.037K, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C037K {
    public static final void LIZ(Function1 function1, Object obj) {
        synchronized (obj) {
            try {
                function1.invoke(obj);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
