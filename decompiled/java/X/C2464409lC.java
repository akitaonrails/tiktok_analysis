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
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.09lC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2464409lC {
    public static final Map LJIILIIL = new HashMap();
    public final Context LIZ;
    public final C2460309kX LIZIZ;
    public boolean LJI;
    public final Intent LJII;
    public ServiceConnectionC2464309lB LJIIJJI;
    public IInterface LJIIL;
    public final List LIZLLL = new ArrayList();
    public final Set LJ = new HashSet();
    public final Object LJFF = new Object();
    public final C2464509lD LJIIIZ = new IBinder.DeathRecipient() { // from class: X.09lD
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C2464409lC c2464409lC = this.LL;
            C2460309kX c2460309kX = c2464409lC.LIZIZ;
            c2460309kX.LIZ("reportBinderDeath", new Object[0]);
            InterfaceC2465009lI interfaceC2465009lI = (InterfaceC2465009lI) c2464409lC.LJIIIIZZ.get();
            if (interfaceC2465009lI != null) {
                c2460309kX.LIZ("calling onBinderDied", new Object[0]);
                interfaceC2465009lI.zza();
            } else {
                c2460309kX.LIZ("%s : Binder has died.", c2464409lC.LIZJ);
                ArrayList arrayList = (ArrayList) c2464409lC.LIZLLL;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((AbstractRunnableC2461209kg) it2.next()).LIZIZ(new RemoteException(String.valueOf(c2464409lC.LIZJ).concat(" : Binder has died.")));
                }
                arrayList.clear();
            }
            synchronized (c2464409lC.LJFF) {
                try {
                    c2464409lC.LIZLLL();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    };
    public final AtomicInteger LJIIJ = new AtomicInteger(0);
    public final String LIZJ = "AgeSignalsService";
    public final WeakReference LJIIIIZZ = new WeakReference(null);

    public final Handler LIZ() {
        Handler handler;
        Map map = LJIILIIL;
        synchronized (map) {
            try {
                String str = this.LIZJ;
                HashMap map2 = (HashMap) map;
                if (!map2.containsKey(str)) {
                    HandlerThread handlerThread = new HandlerThread(str, 10);
                    handlerThread.start();
                    map2.put(str, new BPEAHandler(C786410Ut5.W2(handlerThread)));
                }
                handler = (Handler) map2.get(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return handler;
    }

    public final void LIZLLL() {
        HashSet hashSet = (HashSet) this.LJ;
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            ((C835520Wq6) it2.next()).LIZJ(new RemoteException(String.valueOf(this.LIZJ).concat(" : Binder has died.")));
        }
        hashSet.clear();
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
        C786410Ut5.LJJZZIII(LIZ(), new AbstractRunnableC2461209kg(this) { // from class: X.09lE
            public final /* synthetic */ C2464409lC LLILLJJLI;

            @Override // X.AbstractRunnableC2461209kg
            public final void LIZJ() {
                C2464409lC c2464409lC = this.LLILLJJLI;
                synchronized (c2464409lC.LJFF) {
                    try {
                        if (c2464409lC.LJIIJ.get() > 0 && c2464409lC.LJIIJ.decrementAndGet() > 0) {
                            c2464409lC.LIZIZ.LIZ("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        if (c2464409lC.LJIIL != null) {
                            c2464409lC.LIZIZ.LIZ("Unbind from service.", new Object[0]);
                            c2464409lC.LIZ.unbindService(c2464409lC.LJIIJJI);
                            c2464409lC.LJI = false;
                            c2464409lC.LJIIL = null;
                            c2464409lC.LJIIJJI = null;
                        }
                        c2464409lC.LIZLLL();
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
            }

            {
                Objects.requireNonNull(this);
                this.LLILLJJLI = this;
            }
        });
    }

    public static /* bridge */ /* synthetic */ void LIZIZ(C2464409lC c2464409lC, AbstractRunnableC2461209kg abstractRunnableC2461209kg) {
        if (c2464409lC.LJIIL == null && !c2464409lC.LJI) {
            C2460309kX c2460309kX = c2464409lC.LIZIZ;
            c2460309kX.LIZ("Initiate binding to the service.", new Object[0]);
            ArrayList arrayList = (ArrayList) c2464409lC.LIZLLL;
            arrayList.add(abstractRunnableC2461209kg);
            ServiceConnectionC2464309lB serviceConnectionC2464309lB = new ServiceConnectionC2464309lB(c2464409lC);
            c2464409lC.LJIIJJI = serviceConnectionC2464309lB;
            c2464409lC.LJI = true;
            if (!C2204961BRm.LJJJJ(c2464409lC.LIZ, c2464409lC.LJII, serviceConnectionC2464309lB, 1, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz1cEJOnFpNPfGu9T+gF0Fapct7wVDkzd2x0L3SLqHVOGk=", new String[]{"016a9"}))) {
                c2460309kX.LIZ("Failed to bind to the service.", new Object[0]);
                c2464409lC.LJI = false;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((AbstractRunnableC2461209kg) it2.next()).LIZIZ(new RuntimeException() { // from class: X.09lH
                    });
                }
                arrayList.clear();
                return;
            }
            return;
        }
        if (c2464409lC.LJI) {
            c2464409lC.LIZIZ.LIZ("Waiting to bind to the service.", new Object[0]);
            ((ArrayList) c2464409lC.LIZLLL).add(abstractRunnableC2461209kg);
        } else {
            abstractRunnableC2461209kg.run();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.09lD] */
    public C2464409lC(Context context, C2460309kX c2460309kX, Intent intent) {
        this.LIZ = context;
        this.LIZIZ = c2460309kX;
        this.LJII = intent;
    }
}
