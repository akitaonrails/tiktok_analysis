package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VZ4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VZ4 extends C0VZ3 {
    public final /* synthetic */ C0VZ2 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0VZ4(final C0CCZ c0ccz, C0VZ2 c0vz2, final int i) {
        new RunnableC799600VYg(c0ccz, i) { // from class: X.0VZ3
            @Override // X.RunnableC799600VYg, java.lang.Runnable
            public final void run() {
                try {
                    super.run();
                    ((C0VZ4) this).LLILZ.LIZLLL();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        };
        this.LLILZ = c0vz2;
    }
}
