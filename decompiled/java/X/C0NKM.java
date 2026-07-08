package X;

import Y.ARunnableS109S0100000_9;
import Y.ARunnableS3S1400000_9;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0NKM, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NKM implements InterfaceC1135310feL {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public final HandlerThread LIZIZ;
    public final BPEAHandler LIZJ;
    public final C054G LIZLLL;

    public final void LJII() {
        if (this.LIZ.getAndSet(true) || C786410Ut5.LJJZZIII(this.LIZJ, new ARunnableS109S0100000_9(this, 143))) {
            return;
        }
        C2296808zG.LIZJ(this.LIZLLL, null);
    }

    public C0NKM() {
        if (!C0NKN.LIZ.getAndSet(true)) {
            ((Thread) C0NKN.LIZIZ.getValue()).start();
        }
        HandlerThread handlerThread = (HandlerThread) C0NKN.LIZIZ.getValue();
        this.LIZIZ = handlerThread;
        BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(handlerThread));
        this.LIZJ = bPEAHandler;
        C2238608ps c2238608psLIZJ = C2151808bs.LIZJ("GiftMessageScheduling.worker", bPEAHandler);
        this.LIZLLL = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), c2238608psLIZJ).plus(new C639060P4u(CoroutineExceptionHandler.LJJLIL, 12)));
    }

    @Override // X.InterfaceC1135310feL
    public final boolean LIZJ() {
        return C786410Ut5.u3() == this.LIZIZ;
    }

    @Override // X.InterfaceC1135310feL
    public final void LJI(String str) {
        if (!LIZJ() && C1133910fc5.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("assertWorkerThread failed at ");
            sbLIZ.append(str);
            sbLIZ.append(", currentThread=");
            sbLIZ.append(C786410Ut5.u3().getName());
            C1133910fc5.LJ("GiftMessageScheduling", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:117)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    @Override // X.InterfaceC1135310feL
    public final void LIZ(String str, Function0<Unit> function0) {
        Object c098200Yq;
        if (this.LIZ.get()) {
            return;
        }
        if (C0NKN.LIZ()) {
            try {
                c098200Yq = function0.invoke();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("task failed: ");
                sbLIZ.append(str);
                C1133910fc5.LIZJ("GiftMessageScheduling", C2188811AlT.LIZIZ(sbLIZ), thM5exceptionOrNullimpl);
                return;
            }
            return;
        }
        C054G c054g = this.LIZLLL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C0NKL(this, str, function0, null), 2);
    }

    @Override // X.InterfaceC1135310feL
    public final void LIZIZ(String str, Function0<Unit> function0) {
        Object c098200Yq;
        if (this.LIZ.get()) {
            return;
        }
        if (LIZJ()) {
            try {
                c098200Yq = function0.invoke();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("task failed: ");
                sbLIZ.append(str);
                C1133910fc5.LIZJ("GiftMessageScheduling", C2188811AlT.LIZIZ(sbLIZ), thM5exceptionOrNullimpl);
                return;
            }
            return;
        }
        C23250099c.LIZLLL(this.LIZLLL, null, null, new C0NKJ(this, str, function0, null), 3);
    }

    @Override // X.InterfaceC1135310feL
    public final void LJ(String str, Function0<Unit> function0) {
        if (this.LIZ.get()) {
            return;
        }
        C23250099c.LIZLLL(this.LIZLLL, null, null, new C0NKK(this, str, function0, null), 3);
    }

    @Override // X.InterfaceC1135310feL
    public final void LIZLLL(long j, String str, Function0 function0) {
        if (this.LIZ.get()) {
            return;
        }
        if (j <= 0) {
            LIZIZ(str, function0);
        } else {
            C23250099c.LIZLLL(this.LIZLLL, null, null, new C0NKI(j, this, str, function0, null), 3);
        }
    }

    @Override // X.InterfaceC1135310feL
    public final void LJFF(String str, Function0 function0, Function1 function1) {
        if (!this.LIZ.get() && !C786410Ut5.LJL(this.LIZJ, new ARunnableS3S1400000_9(function0, this, str, function1, 0))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("postToWorkerAtFrontAndMain failed: ");
            sbLIZ.append(str);
            C1133910fc5.LIZJ("GiftMessageScheduling", C2188811AlT.LIZIZ(sbLIZ), null);
        }
    }
}
