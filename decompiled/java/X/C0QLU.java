package X;

import com.bytedance.common.jato.JatoXL;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0QLU, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QLU {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);

    public static final void LIZ() {
        if (LIZIZ.compareAndSet(false, true)) {
            int i = C2187451AjH.LJIIIIZZ;
            if (i > 0) {
                C2187801Ajq.LIZ(i, 10);
            }
            int i2 = C2187451AjH.LJII;
            if (i2 > 0) {
                C2187801Ajq.LIZ(i2, 10);
            }
        }
    }

    public static final void LIZIZ() {
        if (LIZIZ.compareAndSet(true, false)) {
            int i = C2187451AjH.LJIIIIZZ;
            if (i > 0) {
                JatoXL.resetPriority(i);
            }
            int i2 = C2187451AjH.LJII;
            if (i2 > 0) {
                JatoXL.resetPriority(i2);
            }
        }
    }
}
