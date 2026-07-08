package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0WnC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C833720WnC extends AbstractC20147813sS implements InterfaceC832980Wm0 {
    public final Semaphore LJIIJJI;
    public final Set LJIIL;

    @Override // X.C20147913sT
    public final void LJI() {
        this.LJIIJJI.drainPermits();
        LIZLLL();
    }

    @Override // X.AbstractC20147813sS
    public final /* bridge */ /* synthetic */ Object LJIIJ() {
        Iterator it2 = this.LJIIL.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (((AbstractC831960WkM) it2.next()).LJIIL(this)) {
                i++;
            }
        }
        try {
            this.LJIIJJI.tryAcquire(i, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            C786410Ut5.u3().interrupt();
            return null;
        }
    }

    @Override // X.InterfaceC832980Wm0
    public final void onComplete() {
        this.LJIIJJI.release();
    }

    public C833720WnC(SignInHubActivity signInHubActivity, Set set) {
        super(signInHubActivity);
        this.LJIIJJI = new Semaphore(0);
        this.LJIIL = set;
    }
}
