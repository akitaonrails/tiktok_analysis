package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.internal.base.zaq;

/* JADX INFO: renamed from: X.0Wit, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C831050Wit extends AbstractDialogInterfaceOnCancelListenerC829260Wg0 {
    public final C835410Wpv<C831420WjU<?>> LLILZLL;
    public final C831040Wis LLIZ;

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void LJII() {
        this.LLILLJJLI = true;
        if (this.LLILZLL.isEmpty()) {
            return;
        }
        this.LLIZ.LIZIZ(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void LJIIIIZZ() {
        this.LLILLJJLI = false;
        C831040Wis c831040Wis = this.LLIZ;
        c831040Wis.getClass();
        synchronized (C831040Wis.LLJJIJI) {
            try {
                if (c831040Wis.LLJIJIL == this) {
                    c831040Wis.LLJIJIL = null;
                    c831040Wis.LLJILJIL.clear();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void LJFF() {
        if (this.LLILZLL.isEmpty()) {
            return;
        }
        this.LLIZ.LIZIZ(this);
    }

    @Override // X.AbstractDialogInterfaceOnCancelListenerC829260Wg0
    public final void LJIIJ() {
        zaq zaqVar = this.LLIZ.LLJILLL;
        C786410Ut5.LJLJJL(zaqVar, zaqVar.obtainMessage(3));
    }

    @Override // X.AbstractDialogInterfaceOnCancelListenerC829260Wg0
    public final void LJIIIZ(ConnectionResult connectionResult, int i) {
        this.LLIZ.LJIIIIZZ(connectionResult, i);
    }

    public C831050Wit(InterfaceC831130Wj1 interfaceC831130Wj1, C831040Wis c831040Wis, GoogleApiAvailability googleApiAvailability) {
        super(interfaceC831130Wj1, googleApiAvailability);
        this.LLILZLL = new C835410Wpv<>();
        this.LLIZ = c831040Wis;
        interfaceC831130Wj1.jM("ConnectionlessLifecycleHelper", this);
    }
}
