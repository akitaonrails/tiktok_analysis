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
import kotlin.jvm.internal.AwS151S0400000_23;
import kotlin.jvm.internal.AwS424S0200000_23;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.0pYF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1515930pYF<T> implements C0POE<T> {
    public final ExecutorService LIZ = C823050WQl.LIZ(C2123508Tp.LIZ(C0WQX.SERIAL).LIZ());
    public final INetworkChunk LIZIZ = (INetworkChunk) PluggableExtentionKt.pluggableSpi$default(INetworkChunk.class, false, false, false, 14, null);
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public int LIZLLL;
    public final /* synthetic */ C1515820pY4<T> LJ;
    public final /* synthetic */ C0POE<T> LJFF;

    @Override // X.C0POE
    public final void onComplete() {
        LIZ(new AwS567S0100000_23(this.LJFF, 217));
    }

    public final void LIZ(Function0<Unit> function0) {
        if (!this.LIZJ.compareAndSet(false, true)) {
            return;
        }
        try {
            this.LIZ.submit(new ARunnableS92S0200000_23(function0, this, 134));
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

    @Override // X.C0POE
    public final void onFailed(Throwable th) {
        LIZ(new AwS424S0200000_23((C0POE) this.LJFF, th, (Throwable) 44));
    }

    @Override // X.C0POE
    public final void onNext(T t) {
        int size;
        C0PQA c0pqaLIZIZ = this.LJ.LIZIZ();
        synchronized (c0pqaLIZIZ) {
            size = c0pqaLIZIZ.LIZ.size();
        }
        AwS151S0400000_23 awS151S0400000_23 = new AwS151S0400000_23((C1515930pYF) this, (C1515930pYF) this.LJFF, (C0POE<C644110POf>) t, c0pqaLIZIZ.LIZ(size - 1), (C644110POf) 5);
        if (!this.LIZJ.get()) {
            try {
                this.LIZ.submit(new ARunnableS103S0100000_3((Object) awS151S0400000_23, 165));
            } catch (RejectedExecutionException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public C1515930pYF(C1515820pY4<T> c1515820pY4, C0POE<T> c0poe) {
        this.LJ = c1515820pY4;
        this.LJFF = c0poe;
    }
}
