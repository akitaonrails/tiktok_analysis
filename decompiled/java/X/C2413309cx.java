package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09cx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2413309cx {
    public static final void LIZ(Function0<Unit> function0) {
        try {
            function0.invoke();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
