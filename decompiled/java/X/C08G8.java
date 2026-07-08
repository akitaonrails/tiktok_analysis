package X;

import com.bytedance.otis.optimise.system.doframe.MethodDeOptimize;

/* JADX INFO: renamed from: X.08G8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08G8 implements Runnable {
    public static final C08G8 LL = new C08G8();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("DoFrameFixHookManager@ca79.stopHook$1");
        try {
            MethodDeOptimize.reOptimizeOnVsync(((Boolean) C08G9.LIZ.getValue()).booleanValue());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DoFrameFixHookManager@ca79.stopHook$1");
    }
}
