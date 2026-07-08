package X;

import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EhH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371410EhH {
    public static final boolean LIZ() {
        return Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3());
    }

    public static final void LIZIZ(Runnable runnable) {
        C0CNO.LIZLLL(0L, new C371420EhI(runnable));
    }

    public static final void LIZJ(final Function0<Unit> function0) {
        LIZIZ(new Runnable() { // from class: X.0E68
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ThreadUtils@a29a.runOnUiThread$2");
                try {
                    function0.invoke();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ThreadUtils@a29a.runOnUiThread$2");
            }
        });
    }
}
