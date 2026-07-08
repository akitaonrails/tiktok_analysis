package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.14EN, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14EN implements Runnable, InterfaceC20231114Eb {
    public final C14ET LL = new C14ET();
    public final EventBus LLILLJJLI;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C14EQ c14eqLIZIZ = this.LL.LIZIZ();
            if (c14eqLIZIZ == null) {
                throw new IllegalStateException("No pending post available");
            }
            this.LLILLJJLI.LJIIIZ(c14eqLIZIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public C14EN(EventBus eventBus) {
        this.LLILLJJLI = eventBus;
    }

    @Override // X.InterfaceC20231114Eb
    public final void LIZJ(Object obj, C14EP c14ep) {
        this.LL.LIZ(C14EQ.LIZ(obj, c14ep));
        this.LLILLJJLI.LIZ.execute(this);
    }
}
