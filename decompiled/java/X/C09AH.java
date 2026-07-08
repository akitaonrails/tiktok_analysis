package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.09AH, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09AH implements Function1<Throwable, Unit> {
    public static final AtomicIntegerFieldUpdater LLILZ = AtomicIntegerFieldUpdater.newUpdater(C09AH.class, "_state");
    public final C09AE LL;
    public final Thread LLILLJJLI = C786410Ut5.u3();
    public InterfaceC2238208po LLILLL;
    public volatile int _state;

    public final void LIZ() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = LLILZ;
        while (true) {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        LIZIZ(i);
                        throw null;
                    }
                }
            } else if (LLILZ.compareAndSet(this, i, 1)) {
                InterfaceC2238208po interfaceC2238208po = this.LLILLL;
                if (interfaceC2238208po != null) {
                    interfaceC2238208po.dispose();
                    return;
                }
                return;
            }
        }
    }

    public C09AH(C09AE c09ae) {
        this.LL = c09ae;
    }

    public static void LIZIZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Illegal state ");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = LLILZ;
        while (true) {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1 && i != 2 && i != 3) {
                    LIZIZ(i);
                    throw null;
                }
            } else {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = LLILZ;
                if (atomicIntegerFieldUpdater2.compareAndSet(this, i, 2)) {
                    this.LLILLJJLI.interrupt();
                    atomicIntegerFieldUpdater2.set(this, 3);
                    break;
                }
            }
        }
        return Unit.LIZ;
    }
}
