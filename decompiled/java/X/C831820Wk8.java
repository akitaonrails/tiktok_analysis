package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: X.0Wk8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C831820Wk8 implements InterfaceC831990WkP {
    public final C831840WkA LIZ;
    public final Lock LIZIZ;
    public final Context LIZJ;
    public final C829100Wfk LIZLLL;
    public ConnectionResult LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public InterfaceC831550Wjh LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public InterfaceC828880WfO LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public final C831470WjZ LJIIZILJ;
    public final Map<C832010WkR<?>, Boolean> LJIJ;
    public final AbstractC831970WkN<? extends InterfaceC831550Wjh, C831610Wjn> LJIJI;
    public final Bundle LJIIIIZZ = new Bundle();
    public final Set<C832230Wkn> LJIIIZ = new HashSet();
    public final ArrayList<Future<?>> LJIJJ = new ArrayList<>();

    @Override // X.InterfaceC831990WkP
    public final void LJ() {
    }

    public final void LJII() {
        this.LJIIL = false;
        this.LIZ.LLJILJILJ.LJIILL = Collections.emptySet();
        for (Object obj : (HashSet) this.LJIIIZ) {
            if (!((HashMap) this.LIZ.LLIZ).containsKey(obj)) {
                ((HashMap) this.LIZ.LLIZ).put(obj, new ConnectionResult(17, null));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [X.0Wj4, X.0Wjh] */
    @Override // X.InterfaceC831990WkP
    public final void LIZLLL() {
        ((HashMap) this.LIZ.LLIZ).clear();
        this.LJIIL = false;
        this.LJ = null;
        this.LJI = 0;
        this.LJIIJJI = true;
        this.LJIILIIL = false;
        this.LJIILL = false;
        HashMap map = new HashMap();
        boolean z = false;
        for (C832010WkR<?> c832010WkR : this.LJIJ.keySet()) {
            InterfaceC831160Wj4 interfaceC831160Wj4 = this.LIZ.LLILZLL.get(c832010WkR.LIZIZ);
            C0W3J.LJIIIIZZ(interfaceC831160Wj4);
            z |= c832010WkR.LIZ.getPriority() == 1;
            boolean zBooleanValue = this.LJIJ.get(c832010WkR).booleanValue();
            if (interfaceC831160Wj4.requiresSignIn()) {
                this.LJIIL = true;
                if (zBooleanValue) {
                    ((HashSet) this.LJIIIZ).add(c832010WkR.LIZIZ);
                } else {
                    this.LJIIJJI = false;
                }
            }
            map.put(interfaceC831160Wj4, new C831880WkE(this, c832010WkR, zBooleanValue));
        }
        if (z) {
            this.LJIIL = false;
        }
        if (this.LJIIL) {
            C0W3J.LJIIIIZZ(this.LJIIZILJ);
            C0W3J.LJIIIIZZ(this.LJIJI);
            this.LJIIZILJ.LJIIIIZZ = Integer.valueOf(System.identityHashCode(this.LIZ.LLJILJILJ));
            C831800Wk6 c831800Wk6 = new C831800Wk6(this);
            AbstractC831970WkN<? extends InterfaceC831550Wjh, C831610Wjn> abstractC831970WkN = this.LJIJI;
            Context context = this.LIZJ;
            Looper looper = this.LIZ.LLJILJILJ.LJI;
            C831470WjZ c831470WjZ = this.LJIIZILJ;
            this.LJIIJ = abstractC831970WkN.buildClient(context, looper, c831470WjZ, c831470WjZ.LJII, (InterfaceC832260Wkq) c831800Wk6, (InterfaceC832270Wkr) c831800Wk6);
        }
        this.LJII = this.LIZ.LLILZLL.size();
        this.LJIJJ.add(C0VH6.LIZ.submit(new C831810Wk7(this, map)));
    }

    @Override // X.InterfaceC831990WkP
    public final boolean LJI() {
        ArrayList<Future<?>> arrayList = this.LJIJJ;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) ListProtector.get(arrayList, i)).cancel(true);
        }
        this.LJIJJ.clear();
        LJIIIIZZ(true);
        this.LIZ.LJII();
        return true;
    }

    public final void LJIIIZ() {
        C831840WkA c831840WkA = this.LIZ;
        c831840WkA.LL.lock();
        try {
            c831840WkA.LLJILJILJ.LJIIZILJ();
            c831840WkA.LLJIJIL = new C831860WkC(c831840WkA);
            c831840WkA.LLJIJIL.LIZLLL();
            c831840WkA.LLILLJJLI.signalAll();
            c831840WkA.LL.unlock();
            C0VH6.LIZ.execute(new Runnable() { // from class: X.0WkW
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("zaak@eee.run");
                    try {
                        C831820Wk8 c831820Wk8 = this.LL;
                        c831820Wk8.LIZLLL.cancelAvailabilityErrorNotifications(c831820Wk8.LIZJ);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("zaak@eee.run");
                }
            });
            InterfaceC831550Wjh interfaceC831550Wjh = this.LJIIJ;
            if (interfaceC831550Wjh != null) {
                if (this.LJIILL) {
                    InterfaceC828880WfO interfaceC828880WfO = this.LJIILJJIL;
                    C0W3J.LJIIIIZZ(interfaceC828880WfO);
                    interfaceC831550Wjh.LIZIZ(interfaceC828880WfO, this.LJIILLIIL);
                }
                LJIIIIZZ(false);
            }
            Iterator it2 = ((HashMap) this.LIZ.LLIZ).keySet().iterator();
            while (it2.hasNext()) {
                InterfaceC831160Wj4 interfaceC831160Wj4 = this.LIZ.LLILZLL.get(it2.next());
                C0W3J.LJIIIIZZ(interfaceC831160Wj4);
                interfaceC831160Wj4.disconnect();
            }
            this.LIZ.LLJILLL.LIZIZ(this.LJIIIIZZ.isEmpty() ? null : this.LJIIIIZZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c831840WkA.LL.unlock();
            throw th;
        }
    }

    public final void LJIIL() {
        if (this.LJII != 0) {
            return;
        }
        if (!this.LJIIL || this.LJIILIIL) {
            final ArrayList arrayList = new ArrayList();
            this.LJI = 1;
            this.LJII = this.LIZ.LLILZLL.size();
            for (C832230Wkn<?> c832230Wkn : this.LIZ.LLILZLL.keySet()) {
                if (!((HashMap) this.LIZ.LLIZ).containsKey(c832230Wkn)) {
                    arrayList.add(this.LIZ.LLILZLL.get(c832230Wkn));
                } else if (LJIILJJIL()) {
                    LJIIIZ();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.LJIJJ.add(C0VH6.LIZ.submit(new AbstractRunnableC831890WkF(arrayList) { // from class: X.0WkD
                public final ArrayList<InterfaceC831160Wj4> LLILLJJLI;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0, types: [java.util.AbstractCollection, java.util.HashSet] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Set<com.google.android.gms.common.api.Scope>] */
                /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Set] */
                @Override // X.AbstractRunnableC831890WkF
                public final void LIZIZ() {
                    ?? hashSet;
                    C831820Wk8 c831820Wk8 = this.LLILLL;
                    C831920WkI c831920WkI = c831820Wk8.LIZ.LLJILJILJ;
                    C831470WjZ c831470WjZ = c831820Wk8.LJIIZILJ;
                    if (c831470WjZ == null) {
                        hashSet = Collections.emptySet();
                    } else {
                        hashSet = new HashSet(c831470WjZ.LIZIZ);
                        Map<C832010WkR<?>, C2288641Ei6> map = c831820Wk8.LJIIZILJ.LIZLLL;
                        for (C832010WkR<?> c832010WkR : map.keySet()) {
                            if (!((HashMap) c831820Wk8.LIZ.LLIZ).containsKey(c832010WkR.LIZIZ)) {
                                map.get(c832010WkR).getClass();
                                hashSet.addAll(null);
                            }
                        }
                    }
                    c831920WkI.LJIILL = hashSet;
                    ArrayList<InterfaceC831160Wj4> arrayList2 = this.LLILLJJLI;
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        InterfaceC831160Wj4 interfaceC831160Wj4 = (InterfaceC831160Wj4) ListProtector.get(arrayList2, i);
                        C831820Wk8 c831820Wk82 = this.LLILLL;
                        interfaceC831160Wj4.getRemoteService(c831820Wk82.LJIILJJIL, c831820Wk82.LIZ.LLJILJILJ.LJIILL);
                    }
                }

                {
                    super(this.LLILLL);
                    this.LLILLJJLI = arrayList;
                }
            }));
        }
    }

    public final boolean LJIILJJIL() {
        int i = this.LJII - 1;
        this.LJII = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            LJIIJ(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult = this.LJ;
        if (connectionResult == null) {
            return true;
        }
        this.LIZ.LLJILJIL = this.LJFF;
        LJIIJ(connectionResult);
        return false;
    }

    @Override // X.InterfaceC831990WkP
    public final <A, T extends AbstractC831980WkO<? extends InterfaceC832870Wlp, A>> T LIZIZ(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // X.InterfaceC831990WkP
    public final void LIZJ(Bundle bundle) {
        if (!LJIILIIL(1)) {
            return;
        }
        if (bundle != null) {
            C786410Ut5.LJJIIJZLJL(this.LJIIIIZZ, bundle);
        }
        if (LJIILJJIL()) {
            LJIIIZ();
        }
    }

    @Override // X.InterfaceC831990WkP
    public final void LJFF(int i) {
        LJIIJ(new ConnectionResult(8, null));
    }

    public final void LJIIIIZZ(boolean z) {
        InterfaceC831550Wjh interfaceC831550Wjh = this.LJIIJ;
        if (interfaceC831550Wjh != null) {
            if (interfaceC831550Wjh.isConnected() && z) {
                interfaceC831550Wjh.LIZJ();
            }
            interfaceC831550Wjh.disconnect();
            C0W3J.LJIIIIZZ(this.LJIIZILJ);
            this.LJIILJJIL = null;
        }
    }

    public final void LJIIJ(ConnectionResult connectionResult) {
        ArrayList<Future<?>> arrayList = this.LJIJJ;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) ListProtector.get(arrayList, i)).cancel(true);
        }
        this.LJIJJ.clear();
        LJIIIIZZ(!connectionResult.LJLZ());
        this.LIZ.LJII();
        this.LIZ.LLJILLL.LIZ(connectionResult);
    }

    public final boolean LJIILIIL(int i) {
        String str;
        int i2 = this.LJI;
        if (i2 != i) {
            String str2 = "STEP_GETTING_REMOTE_SERVICE";
            if (i2 != 0) {
                str = "STEP_GETTING_REMOTE_SERVICE";
            } else {
                str = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            }
            if (i == 0) {
                str2 = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            }
            new StringBuilder(str.length() + 70 + str2.length());
            new Exception();
            LJIIJ(new ConnectionResult(8, null));
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC831990WkP
    public final void LIZ(ConnectionResult connectionResult, C832010WkR<?> c832010WkR, boolean z) {
        if (!LJIILIIL(1)) {
            return;
        }
        LJIIJJI(connectionResult, c832010WkR, z);
        if (LJIILJJIL()) {
            LJIIIZ();
        }
    }

    public final void LJIIJJI(ConnectionResult connectionResult, C832010WkR<?> c832010WkR, boolean z) {
        int priority = c832010WkR.LIZ.getPriority();
        if ((!z || connectionResult.LJLZ() || this.LIZLLL.getErrorResolutionIntent(connectionResult.zzb) != null) && (this.LJ == null || priority < this.LJFF)) {
            this.LJ = connectionResult;
            this.LJFF = priority;
        }
        ((HashMap) this.LIZ.LLIZ).put(c832010WkR.LIZIZ, connectionResult);
    }

    public C831820Wk8(C831840WkA c831840WkA, C831470WjZ c831470WjZ, Map<C832010WkR<?>, Boolean> map, C829100Wfk c829100Wfk, AbstractC831970WkN<? extends InterfaceC831550Wjh, C831610Wjn> abstractC831970WkN, Lock lock, Context context) {
        this.LIZ = c831840WkA;
        this.LJIIZILJ = c831470WjZ;
        this.LJIJ = map;
        this.LIZLLL = c829100Wfk;
        this.LJIJI = abstractC831970WkN;
        this.LIZIZ = lock;
        this.LIZJ = context;
    }
}
