package X;

import Y.ARunnableS113S0100000_13;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.13QL, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public /* synthetic */ class C13QL extends C2217421BqW implements Function0<InterfaceC790790V0j> {
    public static final C13QL LL = new C13QL();

    public C13QL() {
        super(0, C20008313Qj.class, "createMainScheduler", "createMainScheduler()Lbytekn/foundation/concurrent/scheduler/Scheduler;", 1);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC790790V0j invoke() {
        return new InterfaceC790790V0j() { // from class: X.0V0h
            @Override // X.InterfaceC790790V0j
            public final InterfaceC790780V0i LIZ() {
                return new InterfaceC790780V0i() { // from class: X.0V0g
                    public volatile BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
                    public final Object LIZIZ = new Object();

                    @Override // X.InterfaceC790780V0i
                    public final void LIZ(long j, Function0<Unit> function0) {
                        if (this.LIZ != null) {
                            synchronized (this.LIZIZ) {
                                try {
                                    BPEAHandler bPEAHandler = this.LIZ;
                                    if (bPEAHandler != null) {
                                        C786410Ut5.LJLIIL(j, bPEAHandler, new ARunnableS113S0100000_13(function0, (Function0<Unit>) 164));
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                    }
                };
            }
        };
    }
}
