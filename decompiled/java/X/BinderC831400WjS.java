package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;

/* JADX INFO: renamed from: X.0WjS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class BinderC831400WjS extends BinderC831650Wjr implements InterfaceC832260Wkq, InterfaceC832270Wkr {
    public static final C832180Wki LLIZLLLIL = C832170Wkh.LIZ;
    public final Context LL;
    public final Handler LLILLJJLI;
    public final C832180Wki LLILLL;
    public final Set<Scope> LLILZ;
    public final C831470WjZ LLILZIL;
    public InterfaceC831550Wjh LLILZLL;
    public InterfaceC831730Wjz LLIZ;

    @Override // X.InterfaceC832280Wks
    public final void Js(int i) {
        this.LLILZLL.disconnect();
    }

    @Override // X.InterfaceC832890Wlr
    public final void LJJJZ(ConnectionResult connectionResult) {
        ((C831350WjN) this.LLIZ).LIZIZ(connectionResult);
    }

    @Override // X.InterfaceC831710Wjx
    public final void LLFFF(final zak zakVar) {
        C786410Ut5.LJJZZIII(this.LLILLJJLI, new Runnable() { // from class: X.0WjO
            public final void LIZ() {
                InterfaceC828880WfO c828740WfA;
                BinderC831400WjS binderC831400WjS = this.LLILLJJLI;
                zak zakVar2 = zakVar;
                ConnectionResult connectionResult = zakVar2.zab;
                if (connectionResult.LLFFF()) {
                    zav zavVar = zakVar2.zac;
                    C0W3J.LJIIIIZZ(zavVar);
                    ConnectionResult connectionResult2 = zavVar.zac;
                    if (!connectionResult2.LLFFF()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult2)), new Exception());
                        ((C831350WjN) binderC831400WjS.LLIZ).LIZIZ(connectionResult2);
                        binderC831400WjS.LLILZLL.disconnect();
                        return;
                    }
                    InterfaceC831730Wjz interfaceC831730Wjz = binderC831400WjS.LLIZ;
                    IBinder iBinder = zavVar.LLILLJJLI;
                    if (iBinder == null) {
                        c828740WfA = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        c828740WfA = iInterfaceQueryLocalInterface instanceof InterfaceC828880WfO ? (InterfaceC828880WfO) iInterfaceQueryLocalInterface : new C828740WfA(iBinder);
                    }
                    Set<Scope> set = binderC831400WjS.LLILZ;
                    C831350WjN c831350WjN = (C831350WjN) interfaceC831730Wjz;
                    c831350WjN.getClass();
                    if (c828740WfA == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        c831350WjN.LIZIZ(new ConnectionResult(4));
                    } else {
                        c831350WjN.LIZJ = c828740WfA;
                        c831350WjN.LIZLLL = set;
                        if (c831350WjN.LJ) {
                            c831350WjN.LIZ.getRemoteService(c828740WfA, set);
                        }
                    }
                } else {
                    ((C831350WjN) binderC831400WjS.LLIZ).LIZIZ(connectionResult);
                }
                binderC831400WjS.LLILZLL.disconnect();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zacr@ea9.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zacr@ea9.run");
            }
        });
    }

    @Override // X.InterfaceC832280Wks
    public final void zk(Bundle bundle) {
        this.LLILZLL.LIZLLL(this);
    }

    public BinderC831400WjS(Context context, Handler handler, C831470WjZ c831470WjZ) {
        C832180Wki c832180Wki = LLIZLLLIL;
        this.LL = context;
        this.LLILLJJLI = handler;
        this.LLILZIL = c831470WjZ;
        this.LLILZ = c831470WjZ.LIZIZ;
        this.LLILLL = c832180Wki;
    }
}
