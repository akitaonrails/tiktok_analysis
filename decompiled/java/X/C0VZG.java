package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VZG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VZG extends C0VZE {
    public final /* synthetic */ C0VZF LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0VZG(final C0CCZ c0ccz, C0VZF c0vzf, final int i) {
        new RunnableC799600VYg(c0ccz, i) { // from class: X.0VZE
            @Override // X.RunnableC799600VYg, java.lang.Runnable
            public final void run() {
                try {
                    super.run();
                    ((C0VZG) this).LLILZ.LL.LJ(1200);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        };
        this.LLILZ = c0vzf;
    }
}
