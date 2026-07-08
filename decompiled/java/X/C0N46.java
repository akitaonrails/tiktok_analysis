package X;

import com.bytedance.common.jato.JatoXL;

/* JADX INFO: renamed from: X.0N46, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N46 implements Runnable {
    public static final C0N46 LL = new C0N46();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LiveJatoHelper@2a6.resetThreadPriorityRunnable$1");
        try {
            if (C2183961Ade.LJIIJ > 0) {
                JatoXL.resetPriority(C2183961Ade.LJIIJ);
                C2183961Ade.LJIIJ = 0;
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveJatoHelper@2a6.resetThreadPriorityRunnable$1");
    }
}
