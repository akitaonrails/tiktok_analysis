package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.08D9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08D9 extends C08DB {
    public static volatile C08D9 LIZIZ;
    public static final C08DA LIZJ = new C08DA();
    public static final C08D8 LIZLLL = new Executor() { // from class: X.08D8
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C08D6 c08d6 = C08D9.LIZLLL().LIZ;
            c08d6.getClass();
            if (((Boolean) C1791706zz.LIZLLL.getValue()).booleanValue()) {
                if (runnable != null) {
                    C823050WQl.LIZLLL().execute(runnable);
                    return;
                }
                return;
            }
            c08d6.LIZIZ.execute(runnable);
        }
    };
    public final C08D6 LIZ = new C08D6();

    public static C08D9 LIZLLL() {
        if (LIZIZ != null) {
            return LIZIZ;
        }
        synchronized (C08D9.class) {
            try {
                if (LIZIZ == null) {
                    LIZIZ = new C08D9();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return LIZIZ;
    }

    @Override // X.C08DB
    public final boolean LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // X.C08DB
    public final void LIZJ(Runnable runnable) {
        this.LIZ.LIZJ(runnable);
    }
}
