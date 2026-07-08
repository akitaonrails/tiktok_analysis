package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.logging.Level;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.14EM, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14EM implements Runnable, InterfaceC20231114Eb {
    public final C14ET LL = new C14ET();
    public final EventBus LLILLJJLI;
    public volatile boolean LLILLL;

    public final void LIZ() {
        while (true) {
            try {
                try {
                    C14EQ c14eqLIZJ = this.LL.LIZJ();
                    if (c14eqLIZJ == null) {
                        synchronized (this) {
                            try {
                                c14eqLIZJ = this.LL.LIZIZ();
                                if (c14eqLIZJ == null) {
                                    this.LLILLL = false;
                                    this.LLILLL = false;
                                    return;
                                }
                            } finally {
                            }
                        }
                    }
                    this.LLILLJJLI.LJIIIZ(c14eqLIZJ);
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C09G0 c09g0 = this.LLILLJJLI.LIZIZ;
                    Level level = Level.WARNING;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C786410Ut5.u3().getName());
                    sbLIZ.append(" was interruppted");
                    c09g0.LIZ(level, C2188811AlT.LIZIZ(sbLIZ), e);
                    this.LLILLL = false;
                    return;
                }
            } catch (Throwable th) {
                this.LLILLL = false;
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public C14EM(EventBus eventBus) {
        this.LLILLJJLI = eventBus;
    }

    @Override // X.InterfaceC20231114Eb
    public final void LIZJ(Object obj, C14EP c14ep) {
        C14EQ c14eqLIZ = C14EQ.LIZ(obj, c14ep);
        synchronized (this) {
            try {
                this.LL.LIZ(c14eqLIZ);
                if (!this.LLILLL) {
                    this.LLILLL = true;
                    this.LLILLJJLI.LIZ.execute(this);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
