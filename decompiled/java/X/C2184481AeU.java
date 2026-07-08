package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AeU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2184481AeU extends C09AY implements Function0<Unit> {
    public C2184481AeU() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0CFN.LIZJ(new Runnable() { // from class: X.0X3U
            public static void LIZ() throws Throwable {
                Method declaredMethod;
                C0X3Z c0x3z = new C0X3Z();
                c0x3z.LIZ = 30;
                C0X3T.LJ = new C0X3Y(c0x3z);
                if (C0X3T.LIZJ) {
                    return;
                }
                C0X3T.LIZIZ = C786410Ut5.v2();
                try {
                    declaredMethod = Class.forName("android.view.Choreographer").getDeclaredMethod("postCallbackDelayed", Integer.TYPE, Runnable.class, Object.class, Long.TYPE);
                    declaredMethod.setAccessible(true);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    declaredMethod = null;
                }
                C0X3T.LJIIIZ = declaredMethod;
                while (C0X3T.LIZ >= 0) {
                    try {
                        Method method = C0X3T.LJIIIZ;
                        if (method == null) {
                            Intrinsics.LJIIL();
                        }
                        C2204961BRm.a0(method, C0X3T.LIZIZ, new Object[]{Integer.valueOf(C0X3T.LIZ), C0X3T.LJIIL, null, 0}, new C0WZX("dzBzEgAjS8/YVFkiQFyFceopgexDhm7+KsQVygj5uIL9Ogz2ccDGSg==", null));
                        break;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        int i = C0X3T.LIZ;
                        if (i == 0) {
                            C0X3T.LJIIIZ = null;
                        }
                        C0X3T.LIZ = i - 1;
                    }
                }
                C0X3T.LIZJ = true;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PerformanceActivityAssem@39b8.onCreate$2$simbaRunnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PerformanceActivityAssem@39b8.onCreate$2$simbaRunnable$1");
            }
        }, "simbaRunnable", ((Boolean) C2188271Akb.LJ.getValue()).booleanValue());
        return Unit.LIZ;
    }
}
