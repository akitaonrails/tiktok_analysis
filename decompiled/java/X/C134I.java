package X;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: renamed from: X.134I, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C134I extends AbstractOwnableSynchronizer implements Runnable {
    public final C134G<?> LL;

    public C134I() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("InterruptibleTask$Blocker@3999.run");
        C1C7U.LIZIZ("InterruptibleTask$Blocker@3999.run");
    }

    public final String toString() {
        return this.LL.toString();
    }

    public C134I(C134G c134g) {
        this.LL = c134g;
    }

    public final void LIZ(Thread thread) {
        setExclusiveOwnerThread(thread);
    }
}
