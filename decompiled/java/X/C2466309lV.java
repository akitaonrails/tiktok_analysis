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

/* JADX INFO: renamed from: X.09lV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2466309lV {
    public static final Map LJIILIIL = new HashMap();
    public final Context LIZ;
    public final C2458409kE LIZIZ;
    public boolean LJI;
    public final Intent LJII;
    public ServiceConnectionC2466209lU LJIIJJI;
    public IInterface LJIIL;
    public final List LIZLLL = new ArrayList();
    public final Set LJ = new HashSet();
    public final Object LJFF = new Object();
    public final C2466409lW LJIIIZ = new IBinder.DeathRecipient() { // from class: X.09lW
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C2466309lV c2466309lV = this.LL;
            c2466309lV.LIZIZ.LIZLLL("reportBinderDeath", new Object[0]);
            InterfaceC2467009lc interfaceC2467009lc = (InterfaceC2467009lc) c2466309lV.LJIIIIZZ.get();
            if (interfaceC2467009lc != null) {
                c2466309lV.LIZIZ.LIZLLL("calling onBinderDied", new Object[0]);
                interfaceC2467009lc.zza();
            } else {
                c2466309lV.LIZIZ.LIZLLL("%s : Binder has died.", c2466309lV.LIZJ);
                for (AbstractRunnableC2463609l4 abstractRunnableC2463609l4 : (ArrayList) c2466309lV.LIZLLL) {
                    RemoteException remoteException = new RemoteException(String.valueOf(c2466309lV.LIZJ).concat(" : Binder has died."));
                    C835520Wq6 c835520Wq6 = abstractRunnableC2463609l4.LL;
                    if (c835520Wq6 != null) {
                        c835520Wq6.LIZJ(remoteException);
                    }
                }
                ((ArrayList) c2466309lV.LIZLLL).clear();
            }
            synchronized (c2466309lV.LJFF) {
                try {
                    c2466309lV.LJ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    };
    public final AtomicInteger LJIIJ = new AtomicInteger(0);
    public final String LIZJ = "SplitInstallService";
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

    public final void LJ() {
        Iterator it2 = ((HashSet) this.LJ).iterator();
        while (it2.hasNext()) {
            ((C835520Wq6) it2.next()).LIZJ(new RemoteException(String.valueOf(this.LIZJ).concat(" : Binder has died.")));
        }
        ((HashSet) this.LJ).clear();
    }

    public final void LIZLLL(C835520Wq6 c835520Wq6) {
        synchronized (this.LJFF) {
            try {
                ((HashSet) this.LJ).remove(c835520Wq6);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C786410Ut5.LJJZZIII(LIZ(), new AbstractRunnableC2463609l4() { // from class: X.09lX
            @Override // X.AbstractRunnableC2463609l4
            public final void LIZ() {
                synchronized (this.LLILLJJLI.LJFF) {
                    try {
                        if (this.LLILLJJLI.LJIIJ.get() > 0 && this.LLILLJJLI.LJIIJ.decrementAndGet() > 0) {
                            this.LLILLJJLI.LIZIZ.LIZLLL("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        C2466309lV c2466309lV = this.LLILLJJLI;
                        if (c2466309lV.LJIIL != null) {
                            c2466309lV.LIZIZ.LIZLLL("Unbind from service.", new Object[0]);
                            C2466309lV c2466309lV2 = this.LLILLJJLI;
                            c2466309lV2.LIZ.unbindService(c2466309lV2.LJIIJJI);
                            C2466309lV c2466309lV3 = this.LLILLJJLI;
                            c2466309lV3.LJI = false;
                            c2466309lV3.LJIIL = null;
                            c2466309lV3.LJIIJJI = null;
                        }
                        this.LLILLJJLI.LJ();
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
            }
        });
    }

    public static void LIZIZ(C2466309lV c2466309lV, AbstractRunnableC2463609l4 abstractRunnableC2463609l4) {
        if (c2466309lV.LJIIL == null && !c2466309lV.LJI) {
            c2466309lV.LIZIZ.LIZLLL("Initiate binding to the service.", new Object[0]);
            ((ArrayList) c2466309lV.LIZLLL).add(abstractRunnableC2463609l4);
            ServiceConnectionC2466209lU serviceConnectionC2466209lU = new ServiceConnectionC2466209lU(c2466309lV);
            c2466309lV.LJIIJJI = serviceConnectionC2466209lU;
            c2466309lV.LJI = true;
            if (!C2204961BRm.LJJJJ(c2466309lV.LIZ, c2466309lV.LJII, serviceConnectionC2466209lU, 1, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Byp57XuyfVlZixpfIbNzG9/9o7Treipzs2kcKp7BnK9idVSsFw==", new String[]{"016a9"}))) {
                c2466309lV.LIZIZ.LIZLLL("Failed to bind to the service.", new Object[0]);
                c2466309lV.LJI = false;
                for (AbstractRunnableC2463609l4 abstractRunnableC2463609l42 : (ArrayList) c2466309lV.LIZLLL) {
                    RuntimeException runtimeException = new RuntimeException() { // from class: X.09lb
                    };
                    C835520Wq6 c835520Wq6 = abstractRunnableC2463609l42.LL;
                    if (c835520Wq6 != null) {
                        c835520Wq6.LIZJ(runtimeException);
                    }
                }
                ((ArrayList) c2466309lV.LIZLLL).clear();
                return;
            }
            return;
        }
        if (c2466309lV.LJI) {
            c2466309lV.LIZIZ.LIZLLL("Waiting to bind to the service.", new Object[0]);
            ((ArrayList) c2466309lV.LIZLLL).add(abstractRunnableC2463609l4);
        } else {
            abstractRunnableC2463609l4.run();
        }
    }

    public final void LIZJ(final AbstractRunnableC2463609l4 abstractRunnableC2463609l4, final C835520Wq6 c835520Wq6) {
        final C835520Wq6 c835520Wq62 = abstractRunnableC2463609l4.LL;
        C786410Ut5.LJJZZIII(LIZ(), new AbstractRunnableC2463609l4(c835520Wq62) { // from class: X.09lY
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.AbstractRunnableC2463609l4
            public final void LIZ() {
                synchronized (this.LLILZ.LJFF) {
                    try {
                        final C2466309lV c2466309lV = this.LLILZ;
                        final C835520Wq6 c835520Wq63 = c835520Wq6;
                        ((HashSet) c2466309lV.LJ).add(c835520Wq63);
                        c835520Wq63.LIZ.LIZIZ((InterfaceC834580Woa<TResult>) new InterfaceC834580Woa() { // from class: X.09la
                            @Override // X.InterfaceC834580Woa
                            public final void LIZ(AbstractC835450Wpz abstractC835450Wpz) {
                                C2466309lV c2466309lV2 = c2466309lV;
                                C835520Wq6 c835520Wq64 = c835520Wq63;
                                synchronized (c2466309lV2.LJFF) {
                                    try {
                                        ((HashSet) c2466309lV2.LJ).remove(c835520Wq64);
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    }
                                }
                            }
                        });
                        if (this.LLILZ.LJIIJ.getAndIncrement() > 0) {
                            this.LLILZ.LIZIZ.LIZLLL("Already connected to the service.", new Object[0]);
                        }
                        C2466309lV.LIZIZ(this.LLILZ, abstractRunnableC2463609l4);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.09lW] */
    public C2466309lV(Context context, C2458409kE c2458409kE, Intent intent) {
        this.LIZ = context;
        this.LIZIZ = c2458409kE;
        this.LJII = intent;
    }
}
