package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0Wk6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C831800Wk6 implements InterfaceC832260Wkq, InterfaceC832270Wkr {
    public final /* synthetic */ C831820Wk8 LL;

    @Override // X.InterfaceC832280Wks
    public final void Js(int i) {
    }

    @Override // X.InterfaceC832890Wlr
    public final void LJJJZ(ConnectionResult connectionResult) {
        this.LL.LIZIZ.lock();
        try {
            if (this.LL.LJIIJJI && !connectionResult.LJLZ()) {
                this.LL.LJII();
                this.LL.LJIIL();
            } else {
                this.LL.LJIIJ(connectionResult);
            }
            this.LL.LIZIZ.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LL.LIZIZ.unlock();
            throw th;
        }
    }

    @Override // X.InterfaceC832280Wks
    public final void zk(Bundle bundle) {
        C0W3J.LJIIIIZZ(this.LL.LJIIZILJ);
        InterfaceC831550Wjh interfaceC831550Wjh = this.LL.LJIIJ;
        C0W3J.LJIIIIZZ(interfaceC831550Wjh);
        final C831820Wk8 c831820Wk8 = this.LL;
        interfaceC831550Wjh.LIZLLL(new BinderC831650Wjr(c831820Wk8) { // from class: X.0Wk5
            public final WeakReference<C831820Wk8> LL;

            {
                this.LL = new WeakReference<>(c831820Wk8);
            }

            @Override // X.InterfaceC831710Wjx
            public final void LLFFF(final zak zakVar) {
                final C831820Wk8 c831820Wk82 = this.LL.get();
                if (c831820Wk82 == null) {
                    return;
                }
                c831820Wk82.LIZ.LJIIIIZZ(new AbstractC832250Wkp(c831820Wk82) { // from class: X.0Wk4
                    @Override // X.AbstractC832250Wkp
                    public final void LIZ() {
                        InterfaceC828880WfO c828740WfA;
                        C831820Wk8 c831820Wk83 = c831820Wk82;
                        zak zakVar2 = zakVar;
                        if (c831820Wk83.LJIILIIL(0)) {
                            ConnectionResult connectionResult = zakVar2.zab;
                            if (!connectionResult.LLFFF()) {
                                if (!c831820Wk83.LJIIJJI || connectionResult.LJLZ()) {
                                    c831820Wk83.LJIIJ(connectionResult);
                                    return;
                                } else {
                                    c831820Wk83.LJII();
                                    c831820Wk83.LJIIL();
                                    return;
                                }
                            }
                            zav zavVar = zakVar2.zac;
                            C0W3J.LJIIIIZZ(zavVar);
                            ConnectionResult connectionResult2 = zavVar.zac;
                            if (!connectionResult2.LLFFF()) {
                                Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult2)), new Exception());
                                c831820Wk83.LJIIJ(connectionResult2);
                                return;
                            }
                            c831820Wk83.LJIILIIL = true;
                            IBinder iBinder = zavVar.LLILLJJLI;
                            if (iBinder == null) {
                                c828740WfA = null;
                            } else {
                                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                                c828740WfA = iInterfaceQueryLocalInterface instanceof InterfaceC828880WfO ? (InterfaceC828880WfO) iInterfaceQueryLocalInterface : new C828740WfA(iBinder);
                            }
                            C0W3J.LJIIIIZZ(c828740WfA);
                            c831820Wk83.LJIILJJIL = c828740WfA;
                            c831820Wk83.LJIILL = zavVar.zad;
                            c831820Wk83.LJIILLIIL = zavVar.zae;
                            c831820Wk83.LJIIL();
                        }
                    }
                });
            }
        });
    }
}
