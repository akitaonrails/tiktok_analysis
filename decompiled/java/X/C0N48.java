package X;

import com.bytedance.common.jato.boost.CpusetManager;

/* JADX INFO: renamed from: X.0N48, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N48 implements Runnable {
    public static final C0N48 LL = new C0N48();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LiveJatoHelper@2a6.resetCoreBindRunnable$1");
        try {
            CpusetManager.resetCoreBind();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveJatoHelper@2a6.resetCoreBindRunnable$1");
    }
}
