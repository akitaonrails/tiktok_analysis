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

/* JADX INFO: renamed from: X.09lK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2465209lK {
    public static final Map LJIILIIL = new HashMap();
    public final Context LIZ;
    public final C2461909kn LIZIZ;
    public boolean LJI;
    public final Intent LJII;
    public ServiceConnectionC2465409lM LJIIJJI;
    public IInterface LJIIL;
    public final List LIZLLL = new ArrayList();
    public final Set LJ = new HashSet();
    public final Object LJFF = new Object();
    public final C2465309lL LJIIIZ = new IBinder.DeathRecipient() { // from class: X.09lL
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C2465209lK c2465209lK = this.LL;
            c2465209lK.LIZIZ.LIZJ("reportBinderDeath", new Object[0]);
            InterfaceC2466009lS interfaceC2466009lS = (InterfaceC2466009lS) c2465209lK.LJIIIIZZ.get();
            if (interfaceC2466009lS != null) {
                c2465209lK.LIZIZ.LIZJ("calling onBinderDied", new Object[0]);
                interfaceC2466009lS.zza();
            } else {
                c2465209lK.LIZIZ.LIZJ("%s : Binder has died.", c2465209lK.LIZJ);
                for (AbstractRunnableC2463509l3 abstractRunnableC2463509l3 : (ArrayList) c2465209lK.LIZLLL) {
                    RemoteException remoteException = new RemoteException(String.valueOf(c2465209lK.LIZJ).concat(" : Binder has died."));
                    C835520Wq6 c835520Wq6 = abstractRunnableC2463509l3.LL;
                    if (c835520Wq6 != null) {
                        c835520Wq6.LIZJ(remoteException);
                    }
                }
                ((ArrayList) c2465209lK.LIZLLL).clear();
            }
            synchronized (c2465209lK.LJFF) {
                try {
                    c2465209lK.LIZLLL();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    };
    public final AtomicInteger LJIIJ = new AtomicInteger(0);
    public final String LIZJ = "AppUpdateService";
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
        C786410Ut5.LJJZZIII(LIZ(), new AbstractRunnableC2463509l3() { // from class: X.09lN
            @Override // X.AbstractRunnableC2463509l3
            public final void LIZIZ() {
                synchronized (this.LLILLJJLI.LJFF) {
                    try {
                        if (this.LLILLJJLI.LJIIJ.get() > 0 && this.LLILLJJLI.LJIIJ.decrementAndGet() > 0) {
                            this.LLILLJJLI.LIZIZ.LIZJ("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        C2465209lK c2465209lK = this.LLILLJJLI;
                        if (c2465209lK.LJIIL != null) {
                            c2465209lK.LIZIZ.LIZJ("Unbind from service.", new Object[0]);
                            C2465209lK c2465209lK2 = this.LLILLJJLI;
                            c2465209lK2.LIZ.unbindService(c2465209lK2.LJIIJJI);
                            C2465209lK c2465209lK3 = this.LLILLJJLI;
                            c2465209lK3.LJI = false;
                            c2465209lK3.LJIIL = null;
                            c2465209lK3.LJIIJJI = null;
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

    public static void LIZIZ(C2465209lK c2465209lK, AbstractRunnableC2463509l3 abstractRunnableC2463509l3) {
        if (c2465209lK.LJIIL == null && !c2465209lK.LJI) {
            c2465209lK.LIZIZ.LIZJ("Initiate binding to the service.", new Object[0]);
            ((ArrayList) c2465209lK.LIZLLL).add(abstractRunnableC2463509l3);
            ServiceConnectionC2465409lM serviceConnectionC2465409lM = new ServiceConnectionC2465409lM(c2465209lK);
            c2465209lK.LJIIJJI = serviceConnectionC2465409lM;
            c2465209lK.LJI = true;
            if (!C2204961BRm.LJJJJ(c2465209lK.LIZ, c2465209lK.LJII, serviceConnectionC2465409lM, 1, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Byp57XuyfVlZixpNIa88UCPhIYpQiDPLYqhCCh5wSHb5", new String[]{"016a9"}))) {
                c2465209lK.LIZIZ.LIZJ("Failed to bind to the service.", new Object[0]);
                c2465209lK.LJI = false;
                for (AbstractRunnableC2463509l3 abstractRunnableC2463509l32 : (ArrayList) c2465209lK.LIZLLL) {
                    RuntimeException runtimeException = new RuntimeException() { // from class: X.09lR
                    };
                    C835520Wq6 c835520Wq6 = abstractRunnableC2463509l32.LL;
                    if (c835520Wq6 != null) {
                        c835520Wq6.LIZJ(runtimeException);
                    }
                }
                ((ArrayList) c2465209lK.LIZLLL).clear();
                return;
            }
            return;
        }
        if (c2465209lK.LJI) {
            c2465209lK.LIZIZ.LIZJ("Waiting to bind to the service.", new Object[0]);
            ((ArrayList) c2465209lK.LIZLLL).add(abstractRunnableC2463509l3);
        } else {
            abstractRunnableC2463509l3.run();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.09lL] */
    public C2465209lK(Context context, C2461909kn c2461909kn, Intent intent) {
        this.LIZ = context;
        this.LIZIZ = c2461909kn;
        this.LJII = intent;
    }
}
