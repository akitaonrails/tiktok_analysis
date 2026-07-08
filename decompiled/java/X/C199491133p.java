package X;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.133p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199491133p extends AnonymousClass1344 {
    public InterfaceFutureC1488980oqm LLIZLLLIL;
    public ScheduledFuture LLJ;

    @Override // X.AbstractC199487133l
    public final String LJ() {
        InterfaceFutureC1488980oqm interfaceFutureC1488980oqm = this.LLIZLLLIL;
        ScheduledFuture scheduledFuture = this.LLJ;
        if (interfaceFutureC1488980oqm == null) {
            return null;
        }
        String str = "inputFuture=[" + interfaceFutureC1488980oqm.toString() + e3.f;
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    @Override // X.AbstractC199487133l
    public final void LJI() {
        InterfaceFutureC1488980oqm interfaceFutureC1488980oqm = this.LLIZLLLIL;
        if ((this.LL instanceof C199497133v) & (interfaceFutureC1488980oqm != null)) {
            Object obj = this.LL;
            interfaceFutureC1488980oqm.cancel((obj instanceof C199497133v) && ((C199497133v) obj).LIZ);
        }
        ScheduledFuture scheduledFuture = this.LLJ;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.LLIZLLLIL = null;
        this.LLJ = null;
    }

    public C199491133p(InterfaceFutureC1488980oqm interfaceFutureC1488980oqm) {
        this.LLIZLLLIL = interfaceFutureC1488980oqm;
    }
}
