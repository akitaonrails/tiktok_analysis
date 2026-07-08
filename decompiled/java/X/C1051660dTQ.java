package X;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0dTQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1051660dTQ {
    public final String LIZ;
    public C1537480q70 LIZIZ;
    public final Map<Class<?>, InterfaceC1051470dT7<?>> LIZJ;

    public C1051660dTQ() {
        C1520200pf8.LIZ.getClass();
        this.LIZ = C08HX.LJIIIIZZ();
        this.LIZJ = new ConcurrentHashMap();
    }

    public final <T> InterfaceC1051470dT7<T> LIZ(Class<T> cls) {
        InterfaceC1051470dT7<T> interfaceC1051470dT7 = (InterfaceC1051470dT7) ((ConcurrentHashMap) this.LIZJ).get(cls);
        if (interfaceC1051470dT7 == null) {
            return null;
        }
        return interfaceC1051470dT7;
    }

    public final <T> T LIZIZ(Class<T> cls) {
        T t;
        InterfaceC1051470dT7 interfaceC1051470dT7 = (InterfaceC1051470dT7) ((ConcurrentHashMap) this.LIZJ).get(cls);
        if (interfaceC1051470dT7 != null && (t = (T) interfaceC1051470dT7.LIZ()) != null && cls.isAssignableFrom(t.getClass())) {
            return t;
        }
        C1537480q70 c1537480q70 = this.LIZIZ;
        if (c1537480q70 == null) {
            return null;
        }
        return (T) c1537480q70.LJFF(cls);
    }

    public final <T> void LIZJ(Class<T> cls, final T t) {
        LIZLLL(cls, new InterfaceC1051470dT7<T>(t) { // from class: X.0dTS
            public T LL;

            @Override // X.InterfaceC1051690dTT
            public final void release() {
                this.LL = null;
            }

            @Override // X.InterfaceC1051470dT7
            public final T LIZ() {
                return this.LL;
            }

            {
                this.LL = t;
            }
        });
    }

    public final <T> void LIZLLL(Class<T> cls, InterfaceC1051470dT7<? extends T> interfaceC1051470dT7) {
        InterfaceC1051690dTT interfaceC1051690dTT = (InterfaceC1051690dTT) ((ConcurrentHashMap) this.LIZJ).get(cls);
        if (interfaceC1051690dTT != null && interfaceC1051690dTT != interfaceC1051470dT7) {
            interfaceC1051690dTT.release();
        }
        ((ConcurrentHashMap) this.LIZJ).put(cls, interfaceC1051470dT7);
    }

    public final <T> void LJ(Class<T> cls, final T t) {
        LIZLLL(cls, new InterfaceC1051470dT7<T>(t) { // from class: X.0dTR
            public WeakReference<T> LL;

            @Override // X.InterfaceC1051470dT7
            public final T LIZ() {
                WeakReference<T> weakReference = this.LL;
                if (weakReference == null) {
                    return null;
                }
                return weakReference.get();
            }

            @Override // X.InterfaceC1051690dTT
            public final void release() {
                WeakReference<T> weakReference = this.LL;
                if (weakReference != null) {
                    weakReference.clear();
                }
                this.LL = null;
            }

            {
                WeakReference<T> weakReference;
                if (t == null) {
                    weakReference = null;
                } else {
                    weakReference = new WeakReference<>(t);
                }
                this.LL = weakReference;
            }
        });
    }
}
