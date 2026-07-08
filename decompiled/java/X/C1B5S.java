package X;

import android.os.RemoteException;
import android.util.SparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.1B5S, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B5S implements Runnable {
    public final /* synthetic */ SparseArray LL;
    public final /* synthetic */ HashMap LLILLJJLI;
    public final /* synthetic */ List LLILLL;
    public final /* synthetic */ C1B5T LLILZ;
    public final /* synthetic */ ServiceConnectionC2199161B5e LLILZIL;

    public final void LIZ() {
        boolean z;
        C1B5T c1b5t;
        Future<?> future;
        ServiceConnectionC2199161B5e serviceConnectionC2199161B5e = this.LLILZIL;
        C1B5R c1b5r = new C1B5R(this);
        synchronized (serviceConnectionC2199161B5e) {
            try {
                InterfaceC2199171B5f interfaceC2199171B5f = serviceConnectionC2199161B5e.LL;
                if (interfaceC2199171B5f != null) {
                    try {
                        interfaceC2199171B5f.d1(c1b5r);
                    } catch (RemoteException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } else {
                    serviceConnectionC2199161B5e.LLILLL = c1b5r;
                }
            } finally {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        try {
            z = !this.LLILZIL.LLIZ.await(Mp4ScreenVideoLoadTimeout.CONTROL, TimeUnit.MILLISECONDS);
            if (z && (future = this.LLILZIL.LLILZLL) != null) {
                future.cancel(true);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            z = false;
        }
        ServiceConnectionC2199161B5e serviceConnectionC2199161B5e2 = this.LLILZIL;
        boolean z2 = (this.LLILLJJLI == null || this.LLILLL == null) ? false : true;
        serviceConnectionC2199161B5e2.getClass();
        try {
            InterfaceC2199171B5f interfaceC2199171B5f2 = serviceConnectionC2199161B5e2.LL;
            if (interfaceC2199171B5f2 != null) {
                interfaceC2199171B5f2.N(z2);
            }
        } catch (RemoteException e2) {
        }
        if (!z || (c1b5t = this.LLILZ) == null) {
            return;
        }
        ((C2199121B5a) c1b5t).LIZ();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SqlDownloadCacheAidlWrapper@119f.init$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SqlDownloadCacheAidlWrapper@119f.init$1");
    }

    public C1B5S(ServiceConnectionC2199161B5e serviceConnectionC2199161B5e, SparseArray sparseArray, HashMap map, List list, C2199121B5a c2199121B5a) {
        this.LLILZIL = serviceConnectionC2199161B5e;
        this.LL = sparseArray;
        this.LLILLJJLI = map;
        this.LLILLL = list;
        this.LLILZ = c2199121B5a;
    }
}
