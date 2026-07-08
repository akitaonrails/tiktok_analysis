package X;

import com.bytedance.effectcreatormobile.infrastructure.spi.IInit;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0qwl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1569570qwl {
    public String LIZ = "";
    public final ConcurrentHashMap<Class<?>, Object> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Class<?>, InterfaceC1555760qaU<?>> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Class<?>, InterfaceC1569580qwm<?>> LIZLLL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Class<?>, Class<?>> LJ = new ConcurrentHashMap<>();

    public final <T> T LIZ(Class<T> cls) {
        T t = (T) this.LIZIZ.get(cls);
        if (t == null) {
            synchronized (cls) {
                try {
                    T t2 = (T) LIZIZ(cls);
                    if (t2 != null) {
                        return t2;
                    }
                    IInit iInitLIZ = C1569590qwn.LIZ();
                    if (iInitLIZ != null) {
                        iInitLIZ.onInit();
                    }
                    t = (T) LIZIZ(cls);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return t;
    }

    public final <T> T LIZIZ(Class<T> cls) {
        Class<?> cls2;
        T t;
        T t2 = (T) this.LIZIZ.get(cls);
        if (t2 != null) {
            return t2;
        }
        if (this.LJ.containsKey(cls) && (cls2 = this.LJ.get(cls)) != null && (t = (T) cls2.newInstance()) != null) {
            this.LIZIZ.put((Class<?>) cls, t);
            InterfaceC1569580qwm<?> interfaceC1569580qwm = this.LIZLLL.get(cls);
            if (interfaceC1569580qwm != null) {
                interfaceC1569580qwm.LIZ();
                this.LIZLLL.remove(cls);
            }
            return t;
        }
        InterfaceC1555760qaU<?> interfaceC1555760qaU = this.LIZJ.get(cls);
        if (interfaceC1555760qaU != null) {
            T t3 = (T) interfaceC1555760qaU.create();
            this.LIZJ.remove(cls);
            if (t3 != null) {
                this.LIZIZ.put((Class<?>) cls, t3);
                InterfaceC1569580qwm<?> interfaceC1569580qwm2 = this.LIZLLL.get(cls);
                if (interfaceC1569580qwm2 != null) {
                    interfaceC1569580qwm2.LIZ();
                    this.LIZLLL.remove(cls);
                }
                return t3;
            }
        }
        return null;
    }

    public final void LIZJ(Class<?> cls, Class<?> cls2) {
        this.LJ.put(cls, cls2);
    }
}
