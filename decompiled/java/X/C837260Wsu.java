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

/* JADX INFO: renamed from: X.0Wsu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C837260Wsu {
    public static final Map LJIILIIL = new HashMap();
    public final Context LIZ;
    public final C2461309kh LIZIZ;
    public boolean LJI;
    public final Intent LJII;
    public ServiceConnectionC837280Wsw LJIIJJI;
    public IInterface LJIIL;
    public final List LIZLLL = new ArrayList();
    public final Set LJ = new HashSet();
    public final Object LJFF = new Object();
    public final C837290Wsx LJIIIZ = new IBinder.DeathRecipient() { // from class: X.0Wsx
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C837260Wsu c837260Wsu = this.LL;
            c837260Wsu.LIZIZ.LIZ("reportBinderDeath", new Object[0]);
            InterfaceC837420WtA interfaceC837420WtA = (InterfaceC837420WtA) c837260Wsu.LJIIIIZZ.get();
            if (interfaceC837420WtA != null) {
                c837260Wsu.LIZIZ.LIZ("calling onBinderDied", new Object[0]);
                interfaceC837420WtA.a();
            } else {
                c837260Wsu.LIZIZ.LIZ("%s : Binder has died.", c837260Wsu.LIZJ);
                Iterator it2 = ((ArrayList) c837260Wsu.LIZLLL).iterator();
                while (it2.hasNext()) {
                    ((AbstractRunnableC837330Wt1) it2.next()).LIZ(new RemoteException(String.valueOf(c837260Wsu.LIZJ).concat(" : Binder has died.")));
                }
                ((ArrayList) c837260Wsu.LIZLLL).clear();
            }
            c837260Wsu.LIZIZ();
        }
    };
    public final AtomicInteger LJIIJ = new AtomicInteger(0);
    public final String LIZJ = "IntegrityService";
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

    public final void LIZIZ() {
        synchronized (this.LJFF) {
            try {
                Iterator it2 = ((HashSet) this.LJ).iterator();
                while (it2.hasNext()) {
                    ((C835520Wq6) it2.next()).LIZJ(new RemoteException(String.valueOf(this.LIZJ).concat(" : Binder has died.")));
                }
                ((HashSet) this.LJ).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Wsx] */
    public C837260Wsu(Context context, C2461309kh c2461309kh, Intent intent) {
        this.LIZ = context;
        this.LIZIZ = c2461309kh;
        this.LJII = intent;
    }
}
