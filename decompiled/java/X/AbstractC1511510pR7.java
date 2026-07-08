package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0pR7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1511510pR7 {
    public static final C1511760pRW Companion = new Object() { // from class: X.0pRW
    };
    public C1510230pP3 config;
    public final ArrayList<InterfaceC1511790pRZ> listeners = new ArrayList<>();
    public final String name;

    public C1510130pOt callExtMethod(String str, C1510130pOt c1510130pOt) {
        return null;
    }

    public boolean checkIfOffload() {
        return false;
    }

    public void downloadModel(InterfaceC1511740pRU interfaceC1511740pRU) {
    }

    public abstract boolean enable();

    public boolean isEnvReady() {
        return true;
    }

    public abstract C1512100pS4 lastResult();

    public void preloadEnv() {
    }

    public void releaseModel() {
    }

    public void runAsyncDelay(long j, C1509310pNZ c1509310pNZ, InterfaceC1511740pRU interfaceC1511740pRU) {
    }

    public C1512100pS4 runSync(C1509310pNZ c1509310pNZ) {
        return null;
    }

    public boolean ensureReady() {
        if (isEnvReady()) {
            return true;
        }
        preloadEnv();
        return isEnvReady();
    }

    public final C1510230pP3 getConfig() {
        return this.config;
    }

    public final ArrayList<InterfaceC1511790pRZ> getListeners() {
        return this.listeners;
    }

    public final String getName() {
        return this.name;
    }

    public AbstractC1511510pR7(String str) {
        this.name = str;
    }

    public void addResultChangedListener(InterfaceC1511790pRZ interfaceC1511790pRZ) {
        if (interfaceC1511790pRZ != null) {
            synchronized (this.listeners) {
                try {
                    if (!this.listeners.contains(interfaceC1511790pRZ)) {
                        this.listeners.add(interfaceC1511790pRZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public void configService(C1510230pP3 c1510230pP3) {
        this.config = c1510230pP3;
    }

    public void notifyResultChanged(C1512100pS4 c1512100pS4) {
        ArrayList arrayList;
        if (!this.listeners.isEmpty()) {
            synchronized (this.listeners) {
                try {
                    arrayList = new ArrayList(this.listeners);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1511790pRZ) it2.next()).LIZ();
            }
        }
    }

    public void removeResultChangedListener(InterfaceC1511790pRZ interfaceC1511790pRZ) {
        if (interfaceC1511790pRZ != null) {
            synchronized (this.listeners) {
                try {
                    this.listeners.remove(interfaceC1511790pRZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void setConfig(C1510230pP3 c1510230pP3) {
        this.config = c1510230pP3;
    }

    public final void runAsync(C1509310pNZ c1509310pNZ, InterfaceC1511740pRU interfaceC1511740pRU) {
        runAsyncDelay(0L, c1509310pNZ, interfaceC1511740pRU);
    }

    public static /* synthetic */ C1510130pOt callExtMethod$default(AbstractC1511510pR7 abstractC1511510pR7, String str, C1510130pOt c1510130pOt, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                c1510130pOt = null;
            }
            return abstractC1511510pR7.callExtMethod(str, c1510130pOt);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callExtMethod");
    }
}
