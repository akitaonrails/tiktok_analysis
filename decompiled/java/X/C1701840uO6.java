package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0uO6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1701840uO6 extends C11RO {
    public static final C1701840uO6 LIZIZ = new C1701840uO6();

    @Override // X.C11RO
    public final C11RN LIZ() {
        return new C1701860uO8();
    }

    @Override // X.C11RO
    public final InterfaceC420801kM LIZIZ(Runnable runnable) {
        C1701890uOB.LIZ(runnable, "run is null");
        runnable.run();
        return C11JT.INSTANCE;
    }

    @Override // X.C11RO
    public final InterfaceC420801kM LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            C1701890uOB.LIZ(runnable, "run is null");
            runnable.run();
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            C786410Ut5.u3().interrupt();
            C19489211Ms.LIZIZ(e);
        }
        return C11JT.INSTANCE;
    }
}
