package X;

import Y.ARunnableS95S0200000_26;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0uQq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1703540uQq implements InterfaceC1703530uQp {
    public int LIZ;
    public boolean LIZIZ;
    public final C054G LIZJ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));

    @Override // X.InterfaceC1703530uQp
    public final void LIZ() {
        ScheduledExecutorService scheduledExecutorServiceF4 = C786410Ut5.f4(1);
        this.LIZ = 0;
        this.LIZIZ = false;
        scheduledExecutorServiceF4.scheduleWithFixedDelay(new ARunnableS95S0200000_26(this, scheduledExecutorServiceF4, 29), 0L, 2L, TimeUnit.SECONDS);
    }
}
