package X;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.touchpoint.api.ISafeGuardReporter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01U6, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01U6 {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C01U7());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C01U8());

    public static void LIZIZ(Function0 function0) {
        try {
            function0.invoke();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ISafeGuardReporter iSafeGuardReporter = (ISafeGuardReporter) LIZIZ.getValue();
            if (iSafeGuardReporter != null) {
                iSafeGuardReporter.LIZ(th);
            }
        }
    }

    public static void LIZJ(Function0 function0) {
        if (!Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            LIZIZ(function0);
        } else {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01OV(function0, null), 3);
        }
    }

    public static void LIZLLL(Function0 function0) {
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            LIZIZ(function0);
        } else {
            LIZ(0L, function0);
        }
    }

    public static Object LJFF(Function0 function0) {
        try {
            return function0.invoke();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ISafeGuardReporter iSafeGuardReporter = (ISafeGuardReporter) LIZIZ.getValue();
            if (iSafeGuardReporter != null) {
                iSafeGuardReporter.LIZ(th);
                return null;
            }
            return null;
        }
    }

    public static void LIZ(long j, final Function0 function0) {
        C786410Ut5.LJLIIL(j, (Handler) LIZ.getValue(), new Runnable() { // from class: X.01U5
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SafeGuard@9839.safePostOnMain$1");
                try {
                    C01U6.LIZIZ(function0);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SafeGuard@9839.safePostOnMain$1");
            }
        });
    }

    public static Object LJ(Function0 function0, Object obj) {
        try {
            return function0.invoke();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ISafeGuardReporter iSafeGuardReporter = (ISafeGuardReporter) LIZIZ.getValue();
            if (iSafeGuardReporter != null) {
                iSafeGuardReporter.LIZ(th);
            }
            return obj;
        }
    }
}
