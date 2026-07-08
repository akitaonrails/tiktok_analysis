package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.00kx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC169700kx implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("ReportViewAssem@3eef.sam$java_lang_Runnable$0");
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
            C1C7U.LIZIZ("ReportViewAssem@3eef.sam$java_lang_Runnable$0");
        }
    }
}
