package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0Wk9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C831830Wk9 implements InterfaceC831990WkP {
    public final C831840WkA LIZ;

    public C831830Wk9(C831840WkA c831840WkA) {
        this.LIZ = c831840WkA;
    }

    @Override // X.InterfaceC831990WkP
    public final void LIZ(ConnectionResult connectionResult, C832010WkR<?> c832010WkR, boolean z) {
    }

    @Override // X.InterfaceC831990WkP
    public final void LIZJ(Bundle bundle) {
    }

    @Override // X.InterfaceC831990WkP
    public final void LJFF(int i) {
    }

    @Override // X.InterfaceC831990WkP
    public final boolean LJI() {
        return true;
    }

    @Override // X.InterfaceC831990WkP
    public final void LIZLLL() {
        Iterator<InterfaceC831160Wj4> it2 = this.LIZ.LLILZLL.values().iterator();
        while (it2.hasNext()) {
            it2.next().disconnect();
        }
        this.LIZ.LLJILJILJ.LJIILL = Collections.emptySet();
    }

    @Override // X.InterfaceC831990WkP
    public final void LJ() {
        C831840WkA c831840WkA = this.LIZ;
        c831840WkA.LL.lock();
        try {
            c831840WkA.LLJIJIL = new C831820Wk8(c831840WkA, c831840WkA.LLIZLLLIL, c831840WkA.LLJ, c831840WkA.LLILZ, c831840WkA.LLJI, c831840WkA.LL, c831840WkA.LLILLL);
            c831840WkA.LLJIJIL.LIZLLL();
            c831840WkA.LLILLJJLI.signalAll();
            c831840WkA.LL.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c831840WkA.LL.unlock();
            throw th;
        }
    }

    @Override // X.InterfaceC831990WkP
    public final <A, T extends AbstractC831980WkO<? extends InterfaceC832870Wlp, A>> T LIZIZ(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
