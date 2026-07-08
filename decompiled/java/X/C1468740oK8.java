package X;

import Y.ARunnableS123S0100000_23;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.net.BaseDNS;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import fyo.e;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: X.0oK8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1468740oK8 extends BaseDNS {
    public InetAddress LJFF;
    public boolean LJI;
    public Future LJII;

    @Override // com.ss.ttvideoengine.net.BaseDNS
    public final void LIZLLL() {
        this.LIZIZ = true;
        Future future = this.LJII;
        if (future != null) {
            future.cancel(true);
            this.LJII = null;
        }
    }

    @Override // com.ss.ttvideoengine.net.BaseDNS
    public final void LIZJ() {
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        Future future = this.LJII;
        if (future != null) {
            future.cancel(true);
            this.LJII = null;
        }
    }

    @Override // com.ss.ttvideoengine.net.BaseDNS
    public final void LJFF() {
        try {
            this.LJII = EngineThreadPool.addExecuteTask(new ARunnableS123S0100000_23(this, 177));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJ(new e("kTTVideoErrorDomainLocalDNS", -9968, 0, e.getMessage()));
        }
        C786410Ut5.LJLIIL(10000L, this.LIZ, new Runnable(this) { // from class: X.0oK7
            public final WeakReference<C1468740oK8> LL;

            public final void LIZ() {
                C1468740oK8 c1468740oK8 = this.LL.get();
                if (c1468740oK8 == null) {
                    return;
                }
                synchronized (C1468740oK8.class) {
                    try {
                        if (!c1468740oK8.LJI) {
                            c1468740oK8.LJI = true;
                            c1468740oK8.LJ(new e("kTTVideoErrorDomainLocalDNS", -10000));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LocalDNS$MyRunnable@7512.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LocalDNS$MyRunnable@7512.run");
            }

            {
                this.LL = new WeakReference<>(this);
            }
        });
    }

    public C1468740oK8(String str) {
        super(str);
        int i = C2187451AjH.LIZ;
        C1471660oOq.LIZJ("LocalDNS", "DNS use LocalDNS");
    }
}
