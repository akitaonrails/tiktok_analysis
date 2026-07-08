package X;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0VtG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C812000VtG {
    public static final Map LJIILIIL = new HashMap();
    public final Context LIZ;
    public final C2460109kV LIZIZ;
    public boolean LJI;
    public final Intent LJII;
    public ServiceConnectionC812040VtK LJIIJJI;
    public IInterface LJIIL;
    public final List LIZLLL = new ArrayList();
    public final Set LJ = new HashSet();
    public final Object LJFF = new Object();
    public final C812010VtH LJIIIZ = new IBinder.DeathRecipient() { // from class: X.0VtH
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C812000VtG c812000VtG = this.LL;
            c812000VtG.LIZIZ.LIZIZ("reportBinderDeath", new Object[0]);
            InterfaceC812100VtQ interfaceC812100VtQ = (InterfaceC812100VtQ) c812000VtG.LJIIIIZZ.get();
            if (interfaceC812100VtQ != null) {
                c812000VtG.LIZIZ.LIZIZ("calling onBinderDied", new Object[0]);
                interfaceC812100VtQ.zza();
            } else {
                c812000VtG.LIZIZ.LIZIZ("%s : Binder has died.", c812000VtG.LIZJ);
                for (AbstractRunnableC811970VtD abstractRunnableC811970VtD : (ArrayList) c812000VtG.LIZLLL) {
                    RemoteException remoteException = new RemoteException(String.valueOf(c812000VtG.LIZJ).concat(" : Binder has died."));
                    C835520Wq6 c835520Wq6 = abstractRunnableC811970VtD.LL;
                    if (c835520Wq6 != null) {
                        c835520Wq6.LIZJ(remoteException);
                    }
                }
                ((ArrayList) c812000VtG.LIZLLL).clear();
            }
            synchronized (c812000VtG.LJFF) {
                try {
                    c812000VtG.LIZLLL();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    };
    public final AtomicInteger LJIIJ = new AtomicInteger(0);
    public final String LIZJ = "AppEngageService";
    public final WeakReference LJIIIIZZ = new WeakReference(null);

    public final Handler LIZ() {
        Handler handler;
        Map map = LJIILIIL;
        synchronized (map) {
            try {
                if (!((HashMap) map).containsKey(this.LIZJ)) {
                    HandlerThread handlerThread = new HandlerThread(this.LIZJ, 10);
                    handlerThread.start();
                    ((HashMap) map).put(this.LIZJ, new BPEAHandler(C786410Ut5.W2(handlerThread)));
                }
                handler = (Handler) ((HashMap) map).get(this.LIZJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return handler;
    }

    public final void LIZLLL() {
        Iterator it2 = ((HashSet) this.LJ).iterator();
        while (it2.hasNext()) {
            ((C835520Wq6) it2.next()).LIZJ(new RemoteException(String.valueOf(this.LIZJ).concat(" : Binder has died.")));
        }
        ((HashSet) this.LJ).clear();
    }

    public final void LIZJ(C835520Wq6 c835520Wq6) {
        synchronized (this.LJFF) {
            try {
                ((HashSet) this.LJ).remove(c835520Wq6);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C786410Ut5.LJJZZIII(LIZ(), new AbstractRunnableC811970VtD() { // from class: X.0VtI
            @Override // X.AbstractRunnableC811970VtD
            public final void LIZIZ() {
                synchronized (this.LLILLJJLI.LJFF) {
                    try {
                        if (this.LLILLJJLI.LJIIJ.get() > 0 && this.LLILLJJLI.LJIIJ.decrementAndGet() > 0) {
                            this.LLILLJJLI.LIZIZ.LIZIZ("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        C812000VtG c812000VtG = this.LLILLJJLI;
                        if (c812000VtG.LJIIL != null) {
                            c812000VtG.LIZIZ.LIZIZ("Unbind from service.", new Object[0]);
                            C812000VtG c812000VtG2 = this.LLILLJJLI;
                            c812000VtG2.LIZ.unbindService(c812000VtG2.LJIIJJI);
                            C812000VtG c812000VtG3 = this.LLILLJJLI;
                            c812000VtG3.LJI = false;
                            c812000VtG3.LJIIL = null;
                            c812000VtG3.LJIIJJI = null;
                        }
                        this.LLILLJJLI.LIZLLL();
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
            }
        });
    }

    public static void LIZIZ(C812000VtG c812000VtG, AbstractRunnableC811970VtD abstractRunnableC811970VtD) {
        if (c812000VtG.LJIIL == null && !c812000VtG.LJI) {
            c812000VtG.LIZIZ.LIZIZ("Initiate binding to the service.", new Object[0]);
            ((ArrayList) c812000VtG.LIZLLL).add(abstractRunnableC811970VtD);
            ServiceConnectionC812040VtK serviceConnectionC812040VtK = new ServiceConnectionC812040VtK(c812000VtG);
            c812000VtG.LJIIJJI = serviceConnectionC812040VtK;
            c812000VtG.LJI = true;
            if (!C2204961BRm.LJJJJ(c812000VtG.LIZ, c812000VtG.LJII, serviceConnectionC812040VtK, 1, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz1cEJOnFpNPfG79zm4E0sGuu51", new String[]{"016a9"}))) {
                c812000VtG.LIZIZ.LIZIZ("Failed to bind to the service.", new Object[0]);
                c812000VtG.LJI = false;
                for (AbstractRunnableC811970VtD abstractRunnableC811970VtD2 : (ArrayList) c812000VtG.LIZLLL) {
                    RuntimeException runtimeException = new RuntimeException() { // from class: X.0VtM
                    };
                    C835520Wq6 c835520Wq6 = abstractRunnableC811970VtD2.LL;
                    if (c835520Wq6 != null) {
                        c835520Wq6.LIZJ(runtimeException);
                    }
                }
                ((ArrayList) c812000VtG.LIZLLL).clear();
                return;
            }
            return;
        }
        if (c812000VtG.LJI) {
            c812000VtG.LIZIZ.LIZIZ("Waiting to bind to the service.", new Object[0]);
            ((ArrayList) c812000VtG.LIZLLL).add(abstractRunnableC811970VtD);
        } else {
            abstractRunnableC811970VtD.run();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0VtH] */
    public C812000VtG(Context context, C2460109kV c2460109kV, Intent intent) {
        this.LIZ = context;
        this.LIZIZ = c2460109kV;
        this.LJII = intent;
    }
}
