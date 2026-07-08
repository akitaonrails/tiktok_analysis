package X;

import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS424S0200000_23;

/* JADX INFO: renamed from: X.0q3B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1535110q3B<Type> {
    public final Class<Type> LIZ;
    public HashMap<Class<?>, AbstractC1535150q3F<Type, ?>> LIZIZ;
    public C443120HZe<? extends C1535110q3B<?>, ? extends AbstractC1535150q3F<?, Type>, Integer> LIZLLL;
    public volatile C1534360q1y<Type> LJI;
    public final /* synthetic */ C1535040q34 LJII;
    public final AtomicBoolean LIZJ = new AtomicBoolean(true);
    public final CountDownLatch LJ = new CountDownLatch(1);
    public final AtomicReference<C1534320q1u<C1535200q3K<Function1<C1534360q1y<Type>, Unit>>>> LJFF = new AtomicReference<>(new C1534320q1u());

    public C1535110q3B(C1535040q34 c1535040q34, Class<Type> cls) {
        this.LJII = c1535040q34;
        this.LIZ = cls;
    }

    public final void LIZ(C1535040q34 c1535040q34, Function1<? super C1534360q1y<Type>, Unit> function1) {
        C1534360q1y<Type> c1534360q1y = this.LJI;
        if (c1534360q1y != null) {
            function1.invoke(c1534360q1y);
            return;
        }
        C1534320q1u<C1535200q3K<Function1<C1534360q1y<Type>, Unit>>> c1534320q1u = this.LJFF.get();
        if (c1534320q1u == null) {
            function1.invoke(this.LJI);
            return;
        }
        C1535200q3K<Function1<C1534360q1y<Type>, Unit>> c1535200q3K = new C1535200q3K<>(function1);
        if (!c1534320q1u.LIZ(c1535200q3K)) {
            function1.invoke(this.LJI);
        } else {
            if (c1535040q34 == null) {
                return;
            }
            c1535040q34.LJII = c1535200q3K;
        }
    }

    public final boolean LIZIZ(C1534360q1y<Type> c1534360q1y, boolean z, C1533790q13 c1533790q13) {
        C1533490q0Z c1533490q0Z;
        InterfaceC1530490pvj interfaceC1530490pvj;
        if (this.LJI != null) {
            return false;
        }
        this.LJI = c1534360q1y;
        this.LJ.countDown();
        if (z) {
            C1535110q3B<Type> c1535110q3B = this;
            do {
                C443120HZe<? extends C1535110q3B<?>, ? extends AbstractC1535150q3F<?, Type>, Integer> c443120HZe = c1535110q3B.LIZLLL;
                c1535110q3B.LIZLLL = null;
                if (c443120HZe == null) {
                    break;
                }
                c1535110q3B = (C1535110q3B) c443120HZe.getFirst();
            } while (c1535110q3B != null);
        }
        C1534320q1u<C1535200q3K<Function1<C1534360q1y<Type>, Unit>>> c1534320q1u = this.LJFF.get();
        if (c1534320q1u == null) {
            return false;
        }
        AtomicReference<C1534320q1u<C1535200q3K<Function1<C1534360q1y<Type>, Unit>>>> atomicReference = this.LJFF;
        while (!atomicReference.compareAndSet(c1534320q1u, null)) {
            if (atomicReference.get() != c1534320q1u) {
                return false;
            }
        }
        c1534320q1u.LIZIZ = true;
        while (c1534320q1u.LIZJ.get() > 0) {
        }
        if (!c1534320q1u.LIZIZ()) {
            C086F c086f = C086F.LIZ;
            AwS424S0200000_23 awS424S0200000_23 = new AwS424S0200000_23(c1534320q1u, c1534360q1y, 0);
            c086f.getClass();
            C086F.LJI(awS424S0200000_23);
        }
        if (c1534360q1y == null || c1533790q13 == null || (c1533490q0Z = c1533790q13.LIZ) == null || (interfaceC1530490pvj = c1533490q0Z.LJI) == null || !interfaceC1530490pvj.LIZ(c1534360q1y, c1533790q13, this.LJII.LJFF(), false)) {
            return false;
        }
        return true;
    }
}
