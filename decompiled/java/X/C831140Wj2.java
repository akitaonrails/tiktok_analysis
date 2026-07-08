package X;

import X.InterfaceC833080WmA;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zaq;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: renamed from: X.0Wj2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C831140Wj2<O extends InterfaceC833080WmA> implements InterfaceC832260Wkq, InterfaceC832270Wkr {
    public final InterfaceC831160Wj4 LLILLJJLI;
    public final C831420WjU<O> LLILLL;
    public final C831150Wj3 LLILZ;
    public final int LLIZ;
    public final BinderC831400WjS LLIZLLLIL;
    public boolean LLJ;
    public final /* synthetic */ C831040Wis LLJILJILJ;
    public final Queue<AbstractC831170Wj5> LL = new LinkedList();
    public final Set<C829290Wg3> LLILZIL = new HashSet();
    public final Map<C831450WjX<?>, C831270WjF> LLILZLL = new HashMap();
    public final List<C831060Wiu> LLJI = new ArrayList();
    public ConnectionResult LLJIJIL = null;
    public int LLJILJIL = 0;

    public final void LJ() {
        ArrayList arrayList = new ArrayList(this.LL);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC831170Wj5 abstractC831170Wj5 = (AbstractC831170Wj5) ListProtector.get(arrayList, i);
            if (!this.LLILLJJLI.isConnected()) {
                return;
            }
            if (LJIIJ(abstractC831170Wj5)) {
                ((LinkedList) this.LL).remove(abstractC831170Wj5);
            }
        }
    }

    public final void LJFF() {
        C0W3J.LIZJ(this.LLJILJILJ.LLJILLL);
        this.LLJIJIL = null;
        LIZIZ(ConnectionResult.RESULT_SUCCESS);
        LJIIIZ();
        Iterator it2 = ((HashMap) this.LLILZLL).values().iterator();
        while (it2.hasNext()) {
            C831270WjF c831270WjF = (C831270WjF) it2.next();
            if (LIZ(c831270WjF.LIZ.LIZIZ) != null) {
                it2.remove();
            } else {
                try {
                    AbstractC831310WjJ<Object, ?> abstractC831310WjJ = c831270WjF.LIZ;
                    ((C831300WjI) abstractC831310WjJ).LJ.LIZ.LIZ(this.LLILLJJLI, new C835520Wq6());
                } catch (DeadObjectException e) {
                    TryCatchGuardChecker.doCheck(e);
                    Js(3);
                    this.LLILLJJLI.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    it2.remove();
                }
            }
        }
        LJ();
        LJII();
    }

    public final void LJII() {
        this.LLJILJILJ.LLJILLL.removeMessages(12, this.LLILLL);
        zaq zaqVar = this.LLJILJILJ.LLJILLL;
        C786410Ut5.LJLJLJ(zaqVar, zaqVar.obtainMessage(12, this.LLILLL), this.LLJILJILJ.LL);
    }

    public final void LJIIIZ() {
        if (this.LLJ) {
            this.LLJILJILJ.LLJILLL.removeMessages(11, this.LLILLL);
            this.LLJILJILJ.LLJILLL.removeMessages(9, this.LLILLL);
            this.LLJ = false;
        }
    }

    public final void LJIILIIL() {
        C0W3J.LIZJ(this.LLJILJILJ.LLJILLL);
        if (this.LLILLJJLI.isConnected() || this.LLILLJJLI.isConnecting()) {
            return;
        }
        try {
            C831040Wis c831040Wis = this.LLJILJILJ;
            int iLIZ = c831040Wis.LLIZ.LIZ(c831040Wis.LLILZIL, this.LLILLJJLI);
            if (iLIZ != 0) {
                ConnectionResult connectionResult = new ConnectionResult(iLIZ, null);
                new StringBuilder(this.LLILLJJLI.getClass().getName().length() + 35 + connectionResult.toString().length());
                LJIILL(connectionResult, null);
                return;
            }
            C831040Wis c831040Wis2 = this.LLJILJILJ;
            InterfaceC831160Wj4 interfaceC831160Wj4 = this.LLILLJJLI;
            C831350WjN c831350WjN = new C831350WjN(c831040Wis2, interfaceC831160Wj4, this.LLILLL);
            if (interfaceC831160Wj4.requiresSignIn()) {
                final BinderC831400WjS binderC831400WjS = this.LLIZLLLIL;
                C0W3J.LJIIIIZZ(binderC831400WjS);
                InterfaceC831550Wjh interfaceC831550Wjh = binderC831400WjS.LLILZLL;
                if (interfaceC831550Wjh != null) {
                    interfaceC831550Wjh.disconnect();
                }
                binderC831400WjS.LLILZIL.LJIIIIZZ = Integer.valueOf(System.identityHashCode(binderC831400WjS));
                C832180Wki c832180Wki = binderC831400WjS.LLILLL;
                Context context = binderC831400WjS.LL;
                Looper looper = binderC831400WjS.LLILLJJLI.getLooper();
                C831470WjZ c831470WjZ = binderC831400WjS.LLILZIL;
                binderC831400WjS.LLILZLL = c832180Wki.buildClient(context, looper, c831470WjZ, c831470WjZ.LJII, (InterfaceC832260Wkq) binderC831400WjS, (InterfaceC832270Wkr) binderC831400WjS);
                binderC831400WjS.LLIZ = c831350WjN;
                Set<Scope> set = binderC831400WjS.LLILZ;
                if (set == null || set.isEmpty()) {
                    C786410Ut5.LJJZZIII(binderC831400WjS.LLILLJJLI, new Runnable() { // from class: X.0WjB
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("zacq@eaa.run");
                            try {
                                ((C831350WjN) binderC831400WjS.LLIZ).LIZIZ(new ConnectionResult(4));
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("zacq@eaa.run");
                        }
                    });
                } else {
                    binderC831400WjS.LLILZLL.LIZ();
                }
            }
            try {
                this.LLILLJJLI.connect(c831350WjN);
            } catch (SecurityException e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILL(new ConnectionResult(10), e);
            }
        } catch (IllegalStateException e2) {
            TryCatchGuardChecker.doCheck(e2);
            LJIILL(new ConnectionResult(10), e2);
        }
    }

    public final void LJIILLIIL() {
        C0W3J.LIZJ(this.LLJILJILJ.LLJILLL);
        Status status = C831040Wis.LLJJI;
        LIZJ(status);
        C831150Wj3 c831150Wj3 = this.LLILZ;
        c831150Wj3.getClass();
        c831150Wj3.LIZ(status, false);
        for (C831450WjX c831450WjX : (C831450WjX[]) ((HashMap) this.LLILZLL).keySet().toArray(new C831450WjX[0])) {
            LJIILJJIL(new C831190Wj7(c831450WjX, new C835520Wq6()));
        }
        LIZIZ(new ConnectionResult(4));
        if (this.LLILLJJLI.isConnected()) {
            this.LLILLJJLI.onUserSignOut(new C831590Wjl(this));
        }
    }

    @Override // X.InterfaceC832280Wks
    public final void Js(final int i) {
        if (Looper.myLooper() == this.LLJILJILJ.LLJILLL.getLooper()) {
            LJI(i);
        } else {
            C786410Ut5.LJJZZIII(this.LLJILJILJ.LLJILLL, new Runnable() { // from class: X.0WjD
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("zabn@ecc.run");
                    try {
                        this.LLILLJJLI.LJI(i);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("zabn@ecc.run");
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Feature LIZ(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] availableFeatures = this.LLILLJJLI.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new Feature[0];
            }
            C830490Whz c830490Whz = new C830490Whz(availableFeatures.length);
            for (Feature feature : availableFeatures) {
                c830490Whz.put(feature.zza, Long.valueOf(feature.LJLZ()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) c830490Whz.get(feature2.zza);
                if (l == null || l.longValue() < feature2.LJLZ()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    public final void LIZIZ(ConnectionResult connectionResult) {
        String endpointPackageName;
        for (C829290Wg3 c829290Wg3 : (HashSet) this.LLILZIL) {
            if (C0W0T.LIZIZ(connectionResult, ConnectionResult.RESULT_SUCCESS)) {
                endpointPackageName = this.LLILLJJLI.getEndpointPackageName();
            } else {
                endpointPackageName = null;
            }
            c829290Wg3.LIZ(this.LLILLL, connectionResult, endpointPackageName);
        }
        ((HashSet) this.LLILZIL).clear();
    }

    public final void LIZJ(Status status) {
        C0W3J.LIZJ(this.LLJILJILJ.LLJILLL);
        LIZLLL(status, null, false);
    }

    public final void LJI(int i) {
        C0W3J.LIZJ(this.LLJILJILJ.LLJILLL);
        this.LLJIJIL = null;
        this.LLJ = true;
        C831150Wj3 c831150Wj3 = this.LLILZ;
        String lastDisconnectMessage = this.LLILLJJLI.getLastDisconnectMessage();
        c831150Wj3.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(lastDisconnectMessage);
        }
        c831150Wj3.LIZ(new Status(20, sb.toString()), true);
        zaq zaqVar = this.LLJILJILJ.LLJILLL;
        Message messageObtain = Message.obtain(zaqVar, 9, this.LLILLL);
        this.LLJILJILJ.getClass();
        C786410Ut5.LJLJLJ(zaqVar, messageObtain, Mp4ScreenVideoLoadTimeout.CONTROL);
        zaq zaqVar2 = this.LLJILJILJ.LLJILLL;
        Message messageObtain2 = Message.obtain(zaqVar2, 11, this.LLILLL);
        this.LLJILJILJ.getClass();
        C786410Ut5.LJLJLJ(zaqVar2, messageObtain2, 120000L);
        this.LLJILJILJ.LLIZ.LIZ.clear();
        Iterator it2 = ((HashMap) this.LLILZLL).values().iterator();
        while (it2.hasNext()) {
            ((C831270WjF) it2.next()).LIZJ.run();
        }
    }

    public final void LJIIIIZZ(AbstractC831170Wj5 abstractC831170Wj5) {
        abstractC831170Wj5.LIZLLL(this.LLILZ, this.LLILLJJLI.requiresSignIn());
        try {
            abstractC831170Wj5.LIZJ(this);
        } catch (DeadObjectException e) {
            TryCatchGuardChecker.doCheck(e);
            Js(1);
            this.LLILLJJLI.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    public final boolean LJIIJ(AbstractC831170Wj5 abstractC831170Wj5) {
        if (!(abstractC831170Wj5 instanceof AbstractC831260WjE)) {
            LJIIIIZZ(abstractC831170Wj5);
            return true;
        }
        AbstractC831260WjE abstractC831260WjE = (AbstractC831260WjE) abstractC831170Wj5;
        Feature featureLIZ = LIZ(abstractC831260WjE.LJI(this));
        if (featureLIZ == null) {
            LJIIIIZZ(abstractC831170Wj5);
            return true;
        }
        String name = this.LLILLJJLI.getClass().getName();
        String str = featureLIZ.zza;
        int length = name.length();
        new StringBuilder(length + 77 + String.valueOf(str).length());
        if (this.LLJILJILJ.LLJJ && abstractC831260WjE.LJFF(this)) {
            C831060Wiu c831060Wiu = new C831060Wiu(this.LLILLL, featureLIZ);
            int iIndexOf = ((ArrayList) this.LLJI).indexOf(c831060Wiu);
            if (iIndexOf >= 0) {
                Object obj = ListProtector.get(this.LLJI, iIndexOf);
                this.LLJILJILJ.LLJILLL.removeMessages(15, obj);
                zaq zaqVar = this.LLJILJILJ.LLJILLL;
                Message messageObtain = Message.obtain(zaqVar, 15, obj);
                this.LLJILJILJ.getClass();
                C786410Ut5.LJLJLJ(zaqVar, messageObtain, Mp4ScreenVideoLoadTimeout.CONTROL);
                return false;
            }
            ((ArrayList) this.LLJI).add(c831060Wiu);
            zaq zaqVar2 = this.LLJILJILJ.LLJILLL;
            Message messageObtain2 = Message.obtain(zaqVar2, 15, c831060Wiu);
            this.LLJILJILJ.getClass();
            C786410Ut5.LJLJLJ(zaqVar2, messageObtain2, Mp4ScreenVideoLoadTimeout.CONTROL);
            zaq zaqVar3 = this.LLJILJILJ.LLJILLL;
            Message messageObtain3 = Message.obtain(zaqVar3, 16, c831060Wiu);
            this.LLJILJILJ.getClass();
            C786410Ut5.LJLJLJ(zaqVar3, messageObtain3, 120000L);
            ConnectionResult connectionResult = new ConnectionResult(2, null);
            if (LJIIJJI(connectionResult)) {
                return false;
            }
            C831040Wis c831040Wis = this.LLJILJILJ;
            c831040Wis.LLILZLL.zah(c831040Wis.LLILZIL, connectionResult, this.LLIZ);
            return false;
        }
        abstractC831260WjE.LIZIZ(new C831120Wj0(featureLIZ));
        return true;
    }

    public final boolean LJIIJJI(ConnectionResult connectionResult) {
        synchronized (C831040Wis.LLJJIJI) {
            try {
                C831040Wis c831040Wis = this.LLJILJILJ;
                if (c831040Wis.LLJIJIL != null && c831040Wis.LLJILJIL.contains(this.LLILLL)) {
                    this.LLJILJILJ.LLJIJIL.LJIIL(connectionResult, this.LLIZ);
                    return true;
                }
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean LJIIL(boolean z) {
        C0W3J.LIZJ(this.LLJILJILJ.LLJILLL);
        if (!this.LLILLJJLI.isConnected() || ((HashMap) this.LLILZLL).size() != 0) {
            return false;
        }
        C831150Wj3 c831150Wj3 = this.LLILZ;
        if (c831150Wj3.LIZ.isEmpty() && c831150Wj3.LIZIZ.isEmpty()) {
            this.LLILLJJLI.disconnect("Timing out service connection.");
            return true;
        }
        if (z) {
            LJII();
        }
        return false;
    }

    public final void LJIILJJIL(AbstractC831170Wj5 abstractC831170Wj5) {
        C0W3J.LIZJ(this.LLJILJILJ.LLJILLL);
        if (this.LLILLJJLI.isConnected()) {
            if (LJIIJ(abstractC831170Wj5)) {
                LJII();
                return;
            } else {
                ((LinkedList) this.LL).add(abstractC831170Wj5);
                return;
            }
        }
        ((LinkedList) this.LL).add(abstractC831170Wj5);
        ConnectionResult connectionResult = this.LLJIJIL;
        if (connectionResult != null && connectionResult.LJLZ()) {
            LJIILL(this.LLJIJIL, null);
        } else {
            LJIILIIL();
        }
    }

    @Override // X.InterfaceC832890Wlr
    public final void LJJJZ(ConnectionResult connectionResult) {
        LJIILL(connectionResult, null);
    }

    @Override // X.InterfaceC832280Wks
    public final void zk(Bundle bundle) {
        if (Looper.myLooper() == this.LLJILJILJ.LLJILLL.getLooper()) {
            LJFF();
        } else {
            C786410Ut5.LJJZZIII(this.LLJILJILJ.LLJILLL, new Runnable() { // from class: X.0WjC
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("zabm@ecd.run");
                    try {
                        this.LL.LJFF();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("zabm@ecd.run");
                }
            });
        }
    }

    public C831140Wj2(C831040Wis c831040Wis, AbstractC831380WjQ<O> abstractC831380WjQ) {
        this.LLJILJILJ = c831040Wis;
        InterfaceC831160Wj4 interfaceC831160Wj4Zab = abstractC831380WjQ.zab(c831040Wis.LLJILLL.getLooper(), this);
        this.LLILLJJLI = interfaceC831160Wj4Zab;
        this.LLILLL = abstractC831380WjQ.getApiKey();
        this.LLILZ = new C831150Wj3();
        this.LLIZ = abstractC831380WjQ.zah;
        if (interfaceC831160Wj4Zab.requiresSignIn()) {
            this.LLIZLLLIL = abstractC831380WjQ.zac(c831040Wis.LLILZIL, c831040Wis.LLJILLL);
        } else {
            this.LLIZLLLIL = null;
        }
    }

    public final void LJIILL(ConnectionResult connectionResult, Exception exc) {
        InterfaceC831550Wjh interfaceC831550Wjh;
        C0W3J.LIZJ(this.LLJILJILJ.LLJILLL);
        BinderC831400WjS binderC831400WjS = this.LLIZLLLIL;
        if (binderC831400WjS != null && (interfaceC831550Wjh = binderC831400WjS.LLILZLL) != null) {
            interfaceC831550Wjh.disconnect();
        }
        C0W3J.LIZJ(this.LLJILJILJ.LLJILLL);
        this.LLJIJIL = null;
        this.LLJILJILJ.LLIZ.LIZ.clear();
        LIZIZ(connectionResult);
        if ((this.LLILLJJLI instanceof C832620WlQ) && connectionResult.zzb != 24) {
            C831040Wis c831040Wis = this.LLJILJILJ;
            c831040Wis.LLILLJJLI = true;
            zaq zaqVar = c831040Wis.LLJILLL;
            C786410Ut5.LJLJLJ(zaqVar, zaqVar.obtainMessage(19), 300000L);
        }
        if (connectionResult.zzb == 4) {
            LIZJ(C831040Wis.LLJJIII);
            return;
        }
        if (this.LL.isEmpty()) {
            this.LLJIJIL = connectionResult;
            return;
        }
        if (exc != null) {
            C0W3J.LIZJ(this.LLJILJILJ.LLJILLL);
            LIZLLL(null, exc, false);
            return;
        }
        if (this.LLJILJILJ.LLJJ) {
            LIZLLL(C831040Wis.LIZLLL(this.LLILLL, connectionResult), null, true);
            if (this.LL.isEmpty() || LJIIJJI(connectionResult)) {
                return;
            }
            C831040Wis c831040Wis2 = this.LLJILJILJ;
            if (!c831040Wis2.LLILZLL.zah(c831040Wis2.LLILZIL, connectionResult, this.LLIZ)) {
                if (connectionResult.zzb == 18) {
                    this.LLJ = true;
                }
                if (this.LLJ) {
                    zaq zaqVar2 = this.LLJILJILJ.LLJILLL;
                    Message messageObtain = Message.obtain(zaqVar2, 9, this.LLILLL);
                    this.LLJILJILJ.getClass();
                    C786410Ut5.LJLJLJ(zaqVar2, messageObtain, Mp4ScreenVideoLoadTimeout.CONTROL);
                    return;
                }
                LIZJ(C831040Wis.LIZLLL(this.LLILLL, connectionResult));
                return;
            }
            return;
        }
        LIZJ(C831040Wis.LIZLLL(this.LLILLL, connectionResult));
    }

    public final void LIZLLL(Status status, Exception exc, boolean z) {
        boolean z2;
        C0W3J.LIZJ(this.LLJILJILJ.LLJILLL);
        boolean z3 = false;
        if (status != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (exc == null) {
            z3 = true;
        }
        if (z2 != z3) {
            Iterator<AbstractC831170Wj5> it2 = this.LL.iterator();
            while (it2.hasNext()) {
                AbstractC831170Wj5 next = it2.next();
                if (!z || next.LIZ == 2) {
                    if (status != null) {
                        next.LIZ(status);
                    } else {
                        next.LIZIZ(exc);
                    }
                    it2.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }
}
