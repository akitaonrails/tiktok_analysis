package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0WjN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C831350WjN implements InterfaceC832240Wko, InterfaceC831730Wjz {
    public final InterfaceC831160Wj4 LIZ;
    public final C831420WjU<?> LIZIZ;
    public InterfaceC828880WfO LIZJ;
    public Set<Scope> LIZLLL;
    public boolean LJ;
    public final /* synthetic */ C831040Wis LJFF;

    public C831350WjN(C831040Wis c831040Wis, InterfaceC831160Wj4 interfaceC831160Wj4, C831420WjU<?> c831420WjU) {
        this.LJFF = c831040Wis;
        this.LIZ = interfaceC831160Wj4;
        this.LIZIZ = c831420WjU;
    }

    @Override // X.InterfaceC832240Wko
    public final void LIZ(final ConnectionResult connectionResult) {
        C786410Ut5.LJJZZIII(this.LJFF.LLJILLL, new Runnable() { // from class: X.0WjP
            public final void LIZ() {
                InterfaceC828880WfO interfaceC828880WfO;
                C831350WjN c831350WjN = this.LLILLJJLI;
                C831140Wj2 c831140Wj2 = (C831140Wj2) ((ConcurrentHashMap) c831350WjN.LJFF.LLJI).get(c831350WjN.LIZIZ);
                if (c831140Wj2 == null) {
                    return;
                }
                if (!connectionResult.LLFFF()) {
                    c831140Wj2.LJIILL(connectionResult, null);
                    return;
                }
                C831350WjN c831350WjN2 = this.LLILLJJLI;
                c831350WjN2.LJ = true;
                if (c831350WjN2.LIZ.requiresSignIn()) {
                    C831350WjN c831350WjN3 = this.LLILLJJLI;
                    if (!c831350WjN3.LJ || (interfaceC828880WfO = c831350WjN3.LIZJ) == null) {
                        return;
                    }
                    c831350WjN3.LIZ.getRemoteService(interfaceC828880WfO, c831350WjN3.LIZLLL);
                    return;
                }
                try {
                    InterfaceC831160Wj4 interfaceC831160Wj4 = this.LLILLJJLI.LIZ;
                    interfaceC831160Wj4.getRemoteService(null, interfaceC831160Wj4.getScopesForConnectionlessNonSignIn());
                } catch (SecurityException e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LLILLJJLI.LIZ.disconnect("Failed to get service from broker.");
                    c831140Wj2.LJIILL(new ConnectionResult(10), null);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zabt@ec6.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zabt@ec6.run");
            }
        });
    }

    public final void LIZIZ(ConnectionResult connectionResult) {
        C831140Wj2 c831140Wj2 = (C831140Wj2) ((ConcurrentHashMap) this.LJFF.LLJI).get(this.LIZIZ);
        if (c831140Wj2 != null) {
            C0W3J.LIZJ(c831140Wj2.LLJILJILJ.LLJILLL);
            InterfaceC831160Wj4 interfaceC831160Wj4 = c831140Wj2.LLILLJJLI;
            String name = interfaceC831160Wj4.getClass().getName();
            String strValueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(name.length() + 25 + strValueOf.length());
            sb.append("onSignInFailed for ");
            sb.append(name);
            sb.append(" with ");
            sb.append(strValueOf);
            interfaceC831160Wj4.disconnect(sb.toString());
            c831140Wj2.LJIILL(connectionResult, null);
        }
    }
}
