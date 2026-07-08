package X;

import com.bytedance.common.jato.JatoXL;

/* JADX INFO: renamed from: X.0N49, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N49 implements Runnable {
    public static final C0N49 LL = new C0N49();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LiveJatoHelper@2a6.resetRenderThreadRunnable$1");
        try {
            JatoXL.resetRenderThread();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveJatoHelper@2a6.resetRenderThreadRunnable$1");
    }
}
