package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.087a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20648087a {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C20649087b());

    public static final C15O7 LIZ(final Function0 function0) {
        return C15O7.LIZIZ(new Callable() { // from class: X.087P
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("ExtendFunctionsKt@5ab4.serialCall$1");
                try {
                    function0.invoke();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    int i = C2187451AjH.LIZ;
                    C1720106oR.LIZIZ("PerfExt", "serialCall error", th);
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ExtendFunctionsKt@5ab4.serialCall$1");
                return unit;
            }
        }, (Executor) LIZ.getValue(), null);
    }
}
