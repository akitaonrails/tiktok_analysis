package X;

import Y.ARunnableS103S0100000_3;
import Y.ARunnableS92S0200000_23;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.INetworkChunk;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS267S0300000_23;
import kotlin.jvm.internal.AwS424S0200000_23;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: renamed from: X.0pYN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516010pYN implements InterfaceC644200POo<Object> {
    public final ExecutorService LIZ = C823050WQl.LIZ(new C2123508Tp(new C2123408To(C0WQX.SERIAL)));
    public final INetworkChunk LIZIZ = (INetworkChunk) PluggableExtentionKt.pluggableSpi$default(INetworkChunk.class, false, false, false, 14, null);
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final /* synthetic */ C1515820pY4<Object> LIZLLL;
    public final /* synthetic */ InterfaceC1515570pXf<Object, Object> LJ;

    @Override // X.InterfaceC644200POo
    public final void LIZ(final C0POE<Object> c0poe) {
        C1515820pY4<Object> c1515820pY4 = this.LIZLLL;
        final InterfaceC1515570pXf<Object, Object> interfaceC1515570pXf = this.LJ;
        c1515820pY4.LIZLLL(new C0POE<Object>() { // from class: X.0pYO
            @Override // X.C0POE
            public final void onComplete() {
                this.LIZIZ(new AwS567S0100000_23(c0poe, 218));
            }

            @Override // X.C0POE
            public final void onFailed(Throwable th) {
                this.LIZIZ(new AwS424S0200000_23((C0POE) c0poe, th, (Throwable) 46));
            }

            @Override // X.C0POE
            public final void onNext(Object obj) {
                try {
                    Object objApply = interfaceC1515570pXf.apply(obj);
                    C1516010pYN c1516010pYN = this;
                    AwS267S0300000_23 awS267S0300000_23 = new AwS267S0300000_23(c1516010pYN, (C1516010pYN) c0poe, (C0POE<Object>) objApply, (Object) 8);
                    if (!c1516010pYN.LIZJ.get()) {
                        try {
                            c1516010pYN.LIZ.submit(new ARunnableS103S0100000_3((Object) awS267S0300000_23, 166));
                        } catch (RejectedExecutionException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZIZ(new AwS424S0200000_23((C0POE) c0poe, th, (Throwable) 47));
                }
            }
        });
    }

    public final void LIZIZ(Function0<Unit> function0) {
        if (!this.LIZJ.compareAndSet(false, true)) {
            return;
        }
        try {
            this.LIZ.submit(new ARunnableS92S0200000_23(this, function0, 135));
        } catch (RejectedExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                function0.invoke();
                this.LIZ.shutdown();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZ.shutdown();
                throw th;
            }
        }
    }

    public C1516010pYN(C1515820pY4 c1515820pY4, C1515900pYC c1515900pYC) {
        this.LIZLLL = c1515820pY4;
        this.LJ = c1515900pYC;
    }
}
