package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.00rh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC211500rh implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("GLRenderVideoSink$RenderTask@103e.run");
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
            C1C7U.LIZIZ("GLRenderVideoSink$RenderTask@103e.run");
        }
    }
}
