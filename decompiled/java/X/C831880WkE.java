package X;

import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: X.0WkE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C831880WkE implements InterfaceC832240Wko {
    public final WeakReference<C831820Wk8> LIZ;
    public final C832010WkR<?> LIZIZ;
    public final boolean LIZJ;

    @Override // X.InterfaceC832240Wko
    public final void LIZ(ConnectionResult connectionResult) {
        boolean z;
        Lock lock;
        C831820Wk8 c831820Wk8 = this.LIZ.get();
        if (c831820Wk8 == null) {
            return;
        }
        if (Looper.myLooper() == c831820Wk8.LIZ.LLJILJILJ.LJI) {
            z = true;
        } else {
            z = false;
        }
        C0W3J.LJIIJ("onReportServiceBinding must be called on the GoogleApiClient handler thread", z);
        c831820Wk8.LIZIZ.lock();
        try {
            if (c831820Wk8.LJIILIIL(0)) {
                if (!connectionResult.LLFFF()) {
                    c831820Wk8.LJIIJJI(connectionResult, this.LIZIZ, this.LIZJ);
                }
                if (c831820Wk8.LJIILJJIL()) {
                    c831820Wk8.LJIIL();
                }
                lock = c831820Wk8.LIZIZ;
            } else {
                lock = c831820Wk8.LIZIZ;
            }
            lock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c831820Wk8.LIZIZ.unlock();
            throw th;
        }
    }

    public C831880WkE(C831820Wk8 c831820Wk8, C832010WkR<?> c832010WkR, boolean z) {
        this.LIZ = new WeakReference<>(c831820Wk8);
        this.LIZIZ = c832010WkR;
        this.LIZJ = z;
    }
}
