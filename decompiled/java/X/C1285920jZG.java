package X;

import android.app.Application;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.service.IServiceProvider;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0jZG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1285920jZG {
    public static volatile C1285920jZG LIZJ;
    public Application LIZ;
    public final Map<Class<?>, C1285930jZH> LIZIZ = new ConcurrentHashMap();

    public static C1285920jZG LIZJ() {
        if (LIZJ == null) {
            synchronized (C1285920jZG.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C1285920jZG();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public final <T extends IServiceProvider> T LIZ(Class<T> cls) {
        C1285930jZH c1285930jZH = (C1285930jZH) ((ConcurrentHashMap) this.LIZIZ).get(cls);
        if (c1285930jZH == null || !c1285930jZH.LIZIZ) {
            return null;
        }
        return (T) c1285930jZH.LIZ;
    }

    public final void LIZIZ(Application application) {
        this.LIZ = application;
        synchronized (C1285930jZH.class) {
            try {
                Iterator it2 = ((ConcurrentHashMap) this.LIZIZ).entrySet().iterator();
                while (it2.hasNext()) {
                    C1285930jZH c1285930jZH = (C1285930jZH) ((Map.Entry) it2.next()).getValue();
                    if (!c1285930jZH.LIZIZ) {
                        c1285930jZH.LIZIZ = true;
                        c1285930jZH.LIZ.onInitialize(application);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends IServiceProvider> void LIZLLL(T t) {
        LJ(t.getServiceClass(), t);
    }

    public final <T extends IServiceProvider> void LJ(Class<? extends T> cls, T t) {
        if (!cls.isInstance(t)) {
            return;
        }
        C1285930jZH c1285930jZH = new C1285930jZH(t);
        Application application = this.LIZ;
        if (application != null) {
            c1285930jZH.LIZIZ = true;
            t.onInitialize(application);
        }
        ((ConcurrentHashMap) this.LIZIZ).put(cls, c1285930jZH);
    }
}
