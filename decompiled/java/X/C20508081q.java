package X;

import Y.ARunnableS83S0000000_3;
import android.view.Choreographer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Queue;

/* JADX INFO: renamed from: X.081q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20508081q {
    public static int LIZ = 4;
    public static final HashMap<String, Queue<Runnable>> LIZIZ = new HashMap<>();

    public static void LIZ(Choreographer choreographer, Runnable runnable) {
        try {
            Method methodLIZ = C1958207lk.LIZ(choreographer.getClass(), "postCallbackDelayed", Integer.TYPE, Runnable.class, Object.class, Long.TYPE);
            while (true) {
                int i = LIZ;
                if (i < 0) {
                    break;
                }
                try {
                    C2204961BRm.a0(methodLIZ, choreographer, new Object[]{Integer.valueOf(i), new ARunnableS83S0000000_3(32), null, 0}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOatZJCAySbz6pct41ST+vYkY5OBffUCLkNw8VLA", null));
                    break;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    LIZ--;
                }
            }
            int i2 = LIZ;
            if (i2 != 0) {
                C2204961BRm.a0(methodLIZ, choreographer, new Object[]{Integer.valueOf(i2), runnable, null, 0}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOatZJCAySbz6pct41ST+vYkY5OBffUCLkNw8VLA", null));
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }
}
