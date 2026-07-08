package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0P5E, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P5E {
    public static final void LIZ(Function0 function0) {
        try {
            function0.invoke();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }
}
