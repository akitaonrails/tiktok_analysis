package X;

import android.os.Build;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.LockSupport;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS424S0200000_23;

/* JADX INFO: renamed from: X.0pyB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532010pyB<Type> {
    public volatile Type LIZ;
    public final CountDownLatch LIZIZ = new CountDownLatch(1);
    public final C1531990py9<Pair<InterfaceC1166350gSP, Function1<Type, Unit>>> LIZJ = new C1531990py9<>();

    public final void LIZIZ(Type type) {
        this.LIZ = type;
        this.LIZIZ.countDown();
        C1531990py9<Pair<InterfaceC1166350gSP, Function1<Type, Unit>>> c1531990py9 = this.LIZJ;
        c1531990py9.LIZIZ = true;
        int i = 0;
        while (c1531990py9.LIZLLL.get() > 0) {
            if (i < 5) {
                if (Build.VERSION.SDK_INT >= 33) {
                    Thread.onSpinWait();
                } else {
                    Thread.yield();
                }
            } else {
                c1531990py9.LIZJ = C786410Ut5.u3();
                Thread.interrupted();
                if (c1531990py9.LIZLLL.get() > 0) {
                    LockSupport.park();
                } else {
                    c1531990py9.LIZJ = null;
                    LockSupport.parkNanos(1L);
                }
            }
            i++;
        }
        C1531990py9<Pair<InterfaceC1166350gSP, Function1<Type, Unit>>> c1531990py92 = this.LIZJ;
        if (c1531990py92.LIZ.LIZ() == null && c1531990py92.LIZLLL.get() == 0) {
            return;
        }
        C1532960pzi.LJ(new AwS424S0200000_23(this, (C1532010pyB<int>) type, 10));
    }

    public final void LIZ(InterfaceC1166350gSP interfaceC1166350gSP, Function1<? super Type, Unit> function1) {
        if (!this.LIZJ.LIZ(new Pair<>(interfaceC1166350gSP, function1))) {
            function1.invoke(this.LIZ);
        }
    }
}
