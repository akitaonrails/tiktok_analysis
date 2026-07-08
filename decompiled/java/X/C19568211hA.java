package X;

import Y.ARunnableS98S0200000_29;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS157S0400000_29;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11hA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19568211hA<Param, Target> implements InterfaceC19568711hF<Param, Target> {
    public static final /* synthetic */ int LJIILIIL = 0;
    public final AbstractC19568611hE<Param, Target> LIZ;
    public boolean LIZJ;
    public InterfaceC19569511hN LIZLLL;
    public boolean LJ;
    public boolean LIZIZ = true;
    public final Queue<AbstractC19568411hC<Param, Target>> LJFF = new ConcurrentLinkedQueue();
    public final Queue<AbstractC19568411hC<Param, Target>> LJI = new ConcurrentLinkedQueue();
    public final Queue<AbstractC19568411hC<Param, Target>> LJII = new ConcurrentLinkedQueue();
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(223));
    public final BPEAHandler LJIIIZ = new BPEAHandler(Looper.getMainLooper());
    public final C01GW LJIIJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(217));
    public final AtomicInteger LJIIJJI = new AtomicInteger(3);
    public final List<Param> LJIIL = Collections.synchronizedList(new ArrayList());

    public final C11UZ<Param, InterfaceC19568511hD<Param, Target>> LJ() {
        return (C11UZ) this.LJIIIIZZ.getValue();
    }

    public final void LJIIIZ() {
        final AbstractC19568411hC abstractC19568411hC;
        while (this.LJ && this.LJIIJJI.get() > 0) {
            if (!((ConcurrentLinkedQueue) this.LJI).isEmpty()) {
                abstractC19568411hC = (AbstractC19568411hC) ((ConcurrentLinkedQueue) this.LJI).poll();
            } else if (!(!((ConcurrentLinkedQueue) this.LJFF).isEmpty())) {
                return;
            } else {
                abstractC19568411hC = (AbstractC19568411hC) ((ConcurrentLinkedQueue) this.LJFF).poll();
            }
            if (abstractC19568411hC == null) {
                return;
            }
            ((ConcurrentLinkedQueue) this.LJII).offer(abstractC19568411hC);
            C15O7.LIZJ(new Callable(this) { // from class: X.11hB
                public final /* synthetic */ C19568211hA<Object, Object> LLILLJJLI;

                {
                    this.LLILLJJLI = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("PrioritySerialTaskScheduler@e869.onRunNextTask$1");
                    try {
                        AbstractC19568411hC<Object, Object> abstractC19568411hC2 = abstractC19568411hC;
                        C19568211hA<Object, Object> c19568211hA = this.LLILLJJLI;
                        if (!abstractC19568411hC2.LJ.get()) {
                            abstractC19568411hC2.LJ.set(true);
                            c19568211hA.LIZIZ(abstractC19568411hC2);
                        }
                        if (abstractC19568411hC2.LIZLLL()) {
                            abstractC19568411hC2.LIZ(3);
                            abstractC19568411hC2.LIZJ();
                            c19568211hA.LIZ(abstractC19568411hC2);
                        } else {
                            abstractC19568411hC2.LIZ(2);
                            abstractC19568411hC2.LIZIZ(c19568211hA);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        InterfaceC19569511hN interfaceC19569511hN = this.LLILLJJLI.LIZLLL;
                        if (interfaceC19569511hN != null) {
                            interfaceC19569511hN.LIZ(e);
                        }
                        this.LLILLJJLI.getClass();
                        C2219091BtD.LIZLLL().LIZIZ(e);
                        this.LLILLJJLI.LIZJ(abstractC19568411hC);
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PrioritySerialTaskScheduler@e869.onRunNextTask$1");
                    return unit;
                }
            });
            this.LJIIJJI.decrementAndGet();
        }
    }

    public C19568211hA(AbstractC19568611hE abstractC19568611hE) {
        this.LIZ = abstractC19568611hE;
    }

    public static void LJII(String str) {
        C2219091BtD.LIZLLL().d(str);
    }

    @Override // X.InterfaceC19568711hF
    public final void LIZ(AbstractC19568411hC<Param, Target> abstractC19568411hC) {
        abstractC19568411hC.LIZ(3);
        ((ConcurrentLinkedQueue) this.LJII).remove(abstractC19568411hC);
        LJIIIIZZ(new AwS430S0200000_29(this, abstractC19568411hC, 85));
        this.LJIIJJI.incrementAndGet();
        LJIIIIZZ(new AwS573S0100000_29(this, (C19568211hA<Object, Object>) 844));
    }

    @Override // X.InterfaceC19568711hF
    public final void LIZIZ(AbstractC19568411hC<Param, Target> abstractC19568411hC) {
        int i;
        if (abstractC19568411hC == null || (3 != (i = abstractC19568411hC.LIZJ.get()) && 4 != i)) {
            abstractC19568411hC.LIZ(2);
        }
        LJIIIIZZ(new AwS430S0200000_29(this, abstractC19568411hC, 85));
    }

    @Override // X.InterfaceC19568711hF
    public final void LIZJ(AbstractC19568411hC<Param, Target> abstractC19568411hC) {
        abstractC19568411hC.LIZ(4);
        ((ConcurrentLinkedQueue) this.LJII).remove(abstractC19568411hC);
        int i = abstractC19568411hC.LIZLLL;
        if (i < 0) {
            abstractC19568411hC.LIZLLL = i + 1;
            ((ConcurrentLinkedQueue) this.LJFF).offer(abstractC19568411hC);
        }
        LJIIIIZZ(new AwS430S0200000_29(this, abstractC19568411hC, 85));
        this.LJIIJJI.incrementAndGet();
        LJIIIIZZ(new AwS573S0100000_29(this, (C19568211hA<Object, Object>) 844));
    }

    public final boolean LJFF(Param param) {
        if (param == null) {
            return false;
        }
        for (Object obj : this.LJI) {
            Param param2 = ((AbstractC19568411hC) obj).LIZIZ;
            if (param2 != null && param2.equals(param)) {
                if (obj == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean LJI(Param param) {
        if (param == null) {
            return false;
        }
        for (Object obj : this.LJII) {
            Param param2 = ((AbstractC19568411hC) obj).LIZIZ;
            if (param2 != null && param2.equals(param)) {
                if (obj == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void LJIIIIZZ(Function0<? extends Object> function0) {
        if (Intrinsics.LJFF(this.LJIIJ.getValue(), C786410Ut5.u3())) {
            try {
                function0.invoke();
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                InterfaceC19569511hN interfaceC19569511hN = this.LIZLLL;
                if (interfaceC19569511hN != null) {
                    interfaceC19569511hN.LIZ(e);
                    return;
                }
                return;
            }
        }
        C786410Ut5.LJJZZIII(this.LJIIIZ, new ARunnableS98S0200000_29(this, function0, 44));
    }

    public final void LIZLLL(Param param, InterfaceC19568511hD<Param, Target> interfaceC19568511hD) {
        if (param == null) {
            return;
        }
        Object obj = null;
        if (!LJFF(param) && !LJI(param)) {
            Iterator it2 = ((ConcurrentLinkedQueue) this.LJFF).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Param param2 = ((AbstractC19568411hC) next).LIZIZ;
                if (param2 != null && param2.equals(param)) {
                    obj = next;
                    break;
                }
            }
            AbstractC19568411hC<Param, Target> abstractC19568411hCLIZ = (AbstractC19568411hC) obj;
            if (abstractC19568411hCLIZ != null) {
                ((ConcurrentLinkedQueue) this.LJFF).remove(abstractC19568411hCLIZ);
            } else {
                AbstractC19568611hE<Param, Target> abstractC19568611hE = this.LIZ;
                abstractC19568411hCLIZ = abstractC19568611hE.LIZ(param, abstractC19568611hE.LIZ.LIZ());
                if (abstractC19568411hCLIZ == null) {
                    return;
                }
            }
            ((ConcurrentLinkedQueue) this.LJI).offer(abstractC19568411hCLIZ);
            this.LJ = true;
            LJIIIIZZ(new AwS157S0400000_29((Object) param, (Object) new AwS430S0200000_29(this, abstractC19568411hCLIZ, 83), (Function0<? extends Object>) interfaceC19568511hD, (InterfaceC19568511hD<Object, Object>) this, (C19568211hA<Object, Object>) 14));
            LJIIIZ();
            return;
        }
        if (this.LIZIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("add priority task, download is already started, no reentrance, info: ");
            sbLIZ.append(param);
            LJII(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        LJIIIIZZ(new AwS157S0400000_29((Object) param, (Object) null, (Function0<? extends Object>) interfaceC19568511hD, (InterfaceC19568511hD<Object, Object>) this, (C19568211hA<Object, Object>) 14));
    }
}
